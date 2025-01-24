package com.idz.assignment2studentsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        // Adjust padding to account for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button and set its click listener
        val moveToStudentListButton: Button = findViewById(R.id.main_activity_button_move_to_student_list)
        moveToStudentListButton.setOnClickListener {
            try {
                // Navigate to the Student List Activity
                val intent = Intent(this, StudentListActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                // Handle any errors and display a toast
                Toast.makeText(this, "Failed to open Student List", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
