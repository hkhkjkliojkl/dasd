package com.bw.common.mvvm

import androidx.lifecycle.MutableLiveData

class BaseViewModel {
    val errorLiveData by lazy { MutableLiveData<String>() }
}