package app.codinguyy.daggerhiltexample

import androidx.lifecycle.ViewModel
import app.codinguyy.daggerhiltexample.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstFragmentViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun getFoo() {
        repository.getFoo()
    }
}
