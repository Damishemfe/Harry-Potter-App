package com.hitrosttech.harrypotterapp.data.remote

import com.hitrosttech.harrypotterapp.common.Constants
import com.hitrosttech.harrypotterapp.data.remote.dto.CharacterDto
import retrofit2.http.GET

interface HarryPotterApi {
	
	@GET(Constants.END_POINTS)
	suspend fun getCharacters() : List<CharacterDto>
}