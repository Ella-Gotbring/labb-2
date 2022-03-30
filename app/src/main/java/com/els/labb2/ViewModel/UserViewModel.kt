package com.els.labb2.ViewModel

import androidx.lifecycle.ViewModel

/** created ViewModel package and moved file, added :ViewModel() and implemented the user info from login + a button */
class UserViewModel : ViewModel(){
    var email = ""
    var password = ""

    var number = 0

    fun addNumber(){
        number++
    }



    /* TODO -
    *       Implement USER
    *       Extend to ViewModel (SOLO GROUPS ONLY)
    * */
}