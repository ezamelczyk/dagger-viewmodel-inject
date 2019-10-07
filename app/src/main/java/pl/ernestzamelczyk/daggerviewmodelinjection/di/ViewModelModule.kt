package pl.ernestzamelczyk.daggerviewmodelinjection.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pl.ernestzamelczyk.daggerviewmodelinjection.ui.main.MainViewModel

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindAccountViewModel(viewModel: MainViewModel): ViewModel

}