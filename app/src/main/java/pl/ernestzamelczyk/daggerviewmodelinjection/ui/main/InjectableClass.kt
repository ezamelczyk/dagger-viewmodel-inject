package pl.ernestzamelczyk.daggerviewmodelinjection.ui.main

import android.util.Log
import javax.inject.Inject

class InjectableClass @Inject constructor() {

    fun doSomething() {
        Log.d("elo", "elo")
    }

}