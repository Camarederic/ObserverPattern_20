package com.example.observerpattern_20

import android.util.Log

data class Man(val name: String, val surName: String): ManBehavior {

    override fun getCloth(degrees:Int) {
        Log.e("TAG", "degrees $degrees")
        if (degrees > 200){
            Log.e("TAG", "warm")
        }else{
            Log.e("TAG", "cold")
        }
    }

}