package pl.ernestzamelczyk.daggerviewmodelinjection.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerFragment
import pl.ernestzamelczyk.daggerviewmodelinjection.di.ViewModelFactory
import javax.inject.Inject
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

abstract class BaseInjectableFragment: DaggerFragment() {

    @Inject
    lateinit var factory: ViewModelFactory

    protected inline fun <reified T: ViewModel> viewModel() = object:
        ReadOnlyProperty<BaseInjectableFragment, T> {
        override fun getValue(thisRef: BaseInjectableFragment, property: KProperty<*>): T {
            return ViewModelProviders.of(this@BaseInjectableFragment, factory)[T::class.java]
        }
    }

}