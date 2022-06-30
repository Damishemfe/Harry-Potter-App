package com.hitrosttech.harrypotterapp.domain.repository

import com.hitrosttech.harrypotterapp.data.remote.dto.CharacterDto

interface CharacterRepository {
	
	suspend fun getCharacters(): List<CharacterDto>
}