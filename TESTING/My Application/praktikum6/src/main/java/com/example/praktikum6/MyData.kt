package com.example.praktikum6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class MyData(s: String, s1: String, s2: String) {
    val description: CharSequence? = null
    val name: CharSequence?
        get() {
            TODO()
        }
    val photo: Any
        get() {
            TODO()
        }

    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
        ) : Parcelable
}