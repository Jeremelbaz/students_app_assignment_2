package com.idz.assignment2studentsapp.Model

data class Student(
    val name:String,
    val id:String,
    val phone:String = "",
    val address:String = "",
    var isChecked:Boolean
)
