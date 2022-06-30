package com.hitrosttech.harrypotterapp.data.repository

import com.hitrosttech.harrypotterapp.data.remote.HarryPotterApi
import com.hitrosttech.harrypotterapp.data.remote.dto.CharacterDto
import com.hitrosttech.harrypotterapp.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
	private val api: HarryPotterApi
) : CharacterRepository {
	override suspend fun getCharacters(): List<CharacterDto> {
		return api.getCharacters()
	}
	
}