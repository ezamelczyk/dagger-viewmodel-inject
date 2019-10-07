package pl.ernestzamelczyk.daggerviewmodelinjection.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.ernestzamelczyk.daggerviewmodelinjection.R
import pl.ernestzamelczyk.daggerviewmodelinjection.base.BaseInjectableFragment

class MainFragment : BaseInjectableFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.performAction()
    }

}
