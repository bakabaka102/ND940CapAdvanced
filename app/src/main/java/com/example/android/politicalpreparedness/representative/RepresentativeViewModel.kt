package com.example.android.politicalpreparedness.representative

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.Address
import com.example.android.politicalpreparedness.representative.model.Representative
import com.example.android.politicalpreparedness.utils.LogUtils
import kotlinx.coroutines.launch

class RepresentativeViewModel : ViewModel() {

    //TODO: Establish live data for representatives and address
    //TODO: Create function to fetch representatives from API from a provided address
    private val _representatives: MutableLiveData<List<Representative>> = MutableLiveData()
    val representatives: LiveData<List<Representative>> get() = _representatives

    private val _line1 = MutableLiveData("Amphitheatre Parkway")
    val line1: MutableLiveData<String> = _line1
    private val _line2 = MutableLiveData("1600")
    val line2: MutableLiveData<String> = _line2
    private val _city = MutableLiveData("Mountain View")
    val city: MutableLiveData<String> = _city
    private val _state = MutableLiveData("")
    val state: MutableLiveData<String> = _state
    private val _zip = MutableLiveData("94340")
    val zip: MutableLiveData<String> = _zip

    private val _errorMessage: MutableLiveData<String> = MutableLiveData()
    val errorMessage: LiveData<String> get() = _errorMessage
    private val _isLoading: MutableLiveData<Boolean> = MutableLiveData()
    val isLoading: LiveData<Boolean> get() = _isLoading

    /**
     *  The following code will prove helpful in constructing a representative from the API.
     *  This code combines the two nodes of the RepresentativeResponse into a single official:

    val (offices, officials) = getRepresentativesDeferred.await()
    _representatives.value = offices.flatMap { office -> office.getRepresentatives(officials) }

    Note: getRepresentatives in the above code represents the method used to fetch data from the API
    Note: _representatives in the above code represents the established mutable live data housing representatives

     */
    private fun loadRepresentatives(address: Address) {
        _isLoading.value = true
        viewModelScope.launch {
            val (offices, officials) =
                CivicsApi.retrofitService.getRepresentatives(address.toFormattedString())
                    .also {
                        LogUtils.d("Representatives get: $it")
                    }
            val result: List<Representative> = offices.flatMap { office ->
                office.getRepresentatives(officials)
            }.also {
                LogUtils.d("Representative flatMap: $it")
            }
            _representatives.postValue(result)
            _isLoading.value = false
        }
    }

    fun searchForMyRepresentatives() {
        searchRepresentativesValid(
            Address(line1.value!!, line2.value!!, city.value!!, state.value!!, zip.value!!)
        )
    }

    fun searchForRepresentatives(address: Address?) {
        if (address == null) {
            _errorMessage.value = "Address is null"
            return
        }
        _line1.value = address.line1
        _line2.value = address.line2
        _city.value = address.city
        _state.value = address.state
        _zip.value = address.zip
        searchRepresentativesValid(address)
    }

    private fun searchRepresentativesValid(address: Address) {
        if (address.line1.isBlank()) {
            _errorMessage.value = "Address is empty"
            return
        }
        if (address.city.isBlank()) {
            _errorMessage.value = "City is empty"
            return
        }
        if (address.state.isBlank()) {
            _errorMessage.value = "State is empty"
            return
        }
        if (address.zip.isBlank()) {
            _errorMessage.value = "Zip is empty"
            return
        }
        loadRepresentatives(address)
    }

    fun fillState(state: String?) {
        _state.value = state.orEmpty()
    }

}
