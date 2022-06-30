package com.hitrosttech.harrypotterapp.presentation.character_list

import com.hitrosttech.harrypotterapp.domain.model.Character

data class CharacterListState(
	val isLoading: Boolean = false,
	val characters: List<Character> = emptyList(),
	val error: String = ""
)