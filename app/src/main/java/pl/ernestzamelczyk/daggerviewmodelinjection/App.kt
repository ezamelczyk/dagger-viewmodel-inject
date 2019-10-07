package pl.ernestzamelczyk.daggerviewmodelinjection

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import pl.ernestzamelczyk.daggerviewmodelinjection.di.DaggerAppComponent

class App: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

}