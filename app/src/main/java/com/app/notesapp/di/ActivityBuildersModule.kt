package com.app.notesapp.di

import com.app.notesapp.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


// declare all the activity here , dependency of activity are provided by this module

@Module
abstract class ActivityBuildersModule {

    // Method #1
    @ContributesAndroidInjector(modules = [ViewModelModule::class, FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity

}