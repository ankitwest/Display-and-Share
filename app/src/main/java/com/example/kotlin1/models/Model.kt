package com.example.kotlin1

data class Hobby (var title:String)

object Supplier {

    val hobbies = listOf(
            Hobby("Swimming"),
            Hobby("Reading"),
            Hobby("Walking"),
            Hobby("Swimming"),
            Hobby("Reading"),
            Hobby("Walking")
    )
}