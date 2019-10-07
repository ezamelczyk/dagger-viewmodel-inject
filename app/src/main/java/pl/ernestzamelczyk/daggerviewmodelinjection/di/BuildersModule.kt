package pl.ernestzamelczyk.daggerviewmodelinjection.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.ernestzamelczyk.daggerviewmodelinjection.MainActivity
import pl.ernestzamelczyk.daggerviewmodelinjection.ui.main.MainFragment

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun mainFragment(): MainFragment

}