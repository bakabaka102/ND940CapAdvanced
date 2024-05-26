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
    val address = MutableLiveData<Address>()

    /**
     *  The following code will prove helpful in constructing a representative from the API.
     *  This code combines the two nodes of the RepresentativeResponse into a single official:

    val (offices, officials) = getRepresentativesDeferred.await()
    _representatives.value = offices.flatMap { office -> office.getRepresentatives(officials) }

    Note: getRepresentatives in the above code represents the method used to fetch data from the API
    Note: _representatives in the above code represents the established mutable live data housing representatives

     */
    fun loadRepresentatives() {
        if (address.value != null) {
            viewModelScope.launch {
                try {
                    val (offices, officials) = CivicsApi.retrofitService.getRepresentatives(address.value!!.toFormattedString())
                        .await()
                        .also {
                            LogUtils.d("Representatives get: $it")
                        }
                    val result = offices.flatMap { office ->
                        office.getRepresentatives(officials)
                    }.also {
                        LogUtils.d("Representative flatMap: $it")
                    }
                    _representatives.postValue(result)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    //TODO: Create function get address from geo location
    fun loadAddress() {

    }

    //TODO: Create function to get address from individual fields

}
