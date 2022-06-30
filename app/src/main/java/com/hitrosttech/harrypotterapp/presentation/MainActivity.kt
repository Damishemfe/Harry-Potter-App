package com.hitrosttech.harrypotterapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.hitrosttech.harrypotterapp.presentation.character_list.CharacterListScreen
import com.hitrosttech.harrypotterapp.presentation.ui.theme.HarryPotterAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			HarryPotterAppTheme {
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					CharacterListScreen()
				}
			}
		}
	}
}
