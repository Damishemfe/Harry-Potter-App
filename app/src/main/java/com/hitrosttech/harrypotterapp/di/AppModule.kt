package com.hitrosttech.harrypotterapp.di

import com.hitrosttech.harrypotterapp.common.Constants
import com.hitrosttech.harrypotterapp.data.remote.HarryPotterApi
import com.hitrosttech.harrypotterapp.data.repository.CharacterRepositoryImpl
import com.hitrosttech.harrypotterapp.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
	
	
	@Provides
	@Singleton
	fun providesHarryPotterApi(): HarryPotterApi {
		return Retrofit.Builder()
			.baseUrl(Constants.BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build()
			.create(HarryPotterApi::class.java)
	}
	
	@Provides
	@Singleton
	fun provideCharacterRepository(api: HarryPotterApi): CharacterRepository {
		return CharacterRepositoryImpl(api)
	}
}