package com.example.cleanarchitecture.di.component

import android.app.Application
import com.example.cleanarchitecture.MainApplication
import com.example.cleanarchitecture.di.builder.AppModule
import com.example.cleanarchitecture.di.builder.MainActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(mainApplication: MainApplication)
}
