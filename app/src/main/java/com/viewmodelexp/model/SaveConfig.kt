package com.viewmodelexp.model

import androidx.lifecycle.ViewModel

class SaveConfig : ViewModel() {

    var incre = 0;

    fun upgrade()
    {
        incre++;
    }
}