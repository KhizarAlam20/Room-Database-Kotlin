package com.example.roomdatabase

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdatabase.db.Student
import com.example.roomdatabase.db.StudentDao
import kotlinx.coroutines.launch

class StudentViewModel(private val dao : StudentDao): ViewModel() {

    val students = dao.getStudent()

    //view model to insert the data
    fun insertStudent(student : Student)= viewModelScope.launch{
        dao.insertStudent(student)
    }

    //to update the data
    fun updateStudent(student : Student)= viewModelScope.launch{
        dao.updateStudent(student)
    }

    //to delete the data
    fun deleteStudent(student : Student)= viewModelScope.launch{
        dao.deleteStudent(student)
    }

}