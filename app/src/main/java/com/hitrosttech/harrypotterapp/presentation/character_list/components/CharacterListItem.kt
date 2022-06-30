package com.hitrosttech.harrypotterapp.presentation.character_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.hitrosttech.harrypotterapp.domain.model.Character

@Composable
fun CharacterListItem(
	character: Character
) {
	val imagePainter = rememberImagePainter(data = character.image)
	
	Card(
		modifier = Modifier
			.fillMaxWidth()
			.padding(16.dp),
		shape = RoundedCornerShape(20.dp),
		elevation = 5.dp
	) {
		Box(
			modifier = Modifier.height(200.dp)
		) {
			Image(
				painter = imagePainter,
				contentDescription = null,
				contentScale = ContentScale.Crop
			)
			Box(
				modifier = Modifier
					.fillMaxSize()
					.padding(10.dp),
				contentAlignment = Alignment.CenterStart
			) {
				Column(modifier = Modifier.fillMaxWidth()) {
					Text(text = "${character.actor}", style = MaterialTheme.typography.h1)
					Text(text = "${character.name}", style = MaterialTheme.typography.h2)
					Text(text = "${character.house}", style = MaterialTheme.typography.h3)
				}
			}
		}
	}
}