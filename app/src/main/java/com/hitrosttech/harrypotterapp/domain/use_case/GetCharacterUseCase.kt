package com.hitrosttech.harrypotterapp.domain.use_case

import com.hitrosttech.harrypotterapp.common.Resource
import com.hitrosttech.harrypotterapp.data.remote.dto.toCharacter
import com.hitrosttech.harrypotterapp.domain.model.Character
import com.hitrosttech.harrypotterapp.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
	private val repository: CharacterRepository
) {
	operator fun invoke(): Flow<Resource<List<Character>>> = flow {
		try {
			emit(Resource.Loading())
			val characters = repository.getCharacters().map { it.toCharacter() }
			emit(Resource.Success(characters))
		} catch (e: HttpException) {
			emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
		} catch (e: IOException) {
			emit(Resource.Error("404 Couldn't reach server. Please check your internet connection."))
		}
	}
}