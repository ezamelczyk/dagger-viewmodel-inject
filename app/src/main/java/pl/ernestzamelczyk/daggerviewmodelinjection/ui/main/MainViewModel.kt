package pl.ernestzamelczyk.daggerviewmodelinjection.ui.main

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val injectableClass: InjectableClass): ViewModel() {

    fun performAction() {
        injectableClass.doSomething()
    }

}
