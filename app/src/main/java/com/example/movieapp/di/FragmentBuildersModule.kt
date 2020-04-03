package com.example.movieapp.di

import com.example.movieapp.features.detail.DetailFragment
import com.example.movieapp.features.favorite.FavoriteFragment
import com.example.movieapp.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment

    @ContributesAndroidInjector
    abstract fun contributeFavoriteFragment(): FavoriteFragment

    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailFragment
}
