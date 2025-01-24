package com.idz.assignment2studentsapp.Model

class Model private constructor() {
    val students:MutableList<Student> = ArrayList()
    companion object{
        val shared = Model()
    }
    init {

        for ( i in 0..2){
            val student = Student(
                name = "Test Student $i",
                id = i.toString(),
                phone = "052-12345 $i+1 $i",
                address = "Israel",
                isChecked = false
            )
            students.add(student)
        }
    }

    fun addStudent(student: Student) {
        students.add(student)
    }
}