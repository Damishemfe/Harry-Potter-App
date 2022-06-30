package com.hitrosttech.harrypotterapp.data.remote.dto

import com.hitrosttech.harrypotterapp.domain.model.Character

data class CharacterDto(
    val actor: String,
    val alive: Boolean,
    val alternate_actors: List<Any>,
    val alternate_names: List<Any>,
    val ancestry: String,
    val dateOfBirth: String,
    val eyeColour: String,
    val gender: String,
    val hairColour: String,
    val hogwartsStaff: Boolean,
    val hogwartsStudent: Boolean,
    val house: String,
    val image: String,
    val name: String,
    val patronus: String,
    val species: String,
    val wand: Wand,
    val wizard: Boolean,
    val yearOfBirth: Int
)

fun CharacterDto.toCharacter() : Character {
    return Character(
        image = image,
        actor = actor,
        name = name,
        house = house
    )
}