package com.example.gradgrant

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btResult)
        val resultTV: TextView = findViewById(R.id.Response)

        val spinnerCourse: Spinner = findViewById(R.id.spinnerCourse)
        val courses = arrayOf("Computer Science", "Mechanical Engineering", "Electrical Engineering", "Civil Engineering", "Automotive Engineering", "Aerospace Engineering","Business Administration")
        spinnerCourse.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, courses).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        val spinnerDegree: Spinner = findViewById(R.id.spinnerDegree)
        val degrees = arrayOf("Associate", "Diploma", "Bachelor", "Postgraduate Diploma", "Master", "Doctoral")
        spinnerDegree.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, degrees).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        val spinnerGrade: Spinner = findViewById(R.id.spinnerGrade)
        val grades = arrayOf("A", "B", "C", "D", "F")
        spinnerGrade.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, grades).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        button.setOnClickListener {
            val selectedCourse = spinnerCourse.selectedItem.toString()
            val selectedDegree = spinnerDegree.selectedItem.toString()
            val selectedGrade = spinnerGrade.selectedItem.toString()
            val scholarships = getScholarships(selectedCourse, selectedDegree, selectedGrade)
            resultTV.text = scholarships
        }
    }

    private fun getScholarships(course: String, degree: String, grade: String): String {
        val scholarships = mutableListOf<String>()

        // Example scholarship logic
        when (course) {
            "Computer Science" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Merit-based Scholarship")
                                scholarships.add("Technology Innovators Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Merit-based Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                                scholarships.add("Tech Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            "Business Administration" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Business Scholars Award")
                                scholarships.add("Future Business Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Business Scholars Award")
                            }
                            "C" -> {
                                scholarships.add("Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("MBA Excellence Scholarship")
                                scholarships.add("Leadership in Business Award")
                            }
                            "B" -> {
                                scholarships.add("MBA Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            "Mechanical Engineering" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Merit-based Scholarship")
                                scholarships.add("Technology Innovators Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Merit-based Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                                scholarships.add("Tech Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            "Electrical Engineering" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Business Scholars Award")
                                scholarships.add("Future Business Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Business Scholars Award")
                            }
                            "C" -> {
                                scholarships.add("Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("MBA Excellence Scholarship")
                                scholarships.add("Leadership in Business Award")
                            }
                            "B" -> {
                                scholarships.add("MBA Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            "Civil Engineering" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Merit-based Scholarship")
                                scholarships.add("Technology Innovators Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Merit-based Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                                scholarships.add("Tech Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Graduate Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            "Automotive Engineering" -> {
                when (degree) {
                    "Bachelor" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Automotive Engineering Scholars Award")
                                scholarships.add("Future Automotive Engineering Leaders Scholarship")
                            }
                            "B" -> {
                                scholarships.add("Automotive Engineering Scholars Award")
                            }
                            "C" -> {
                                scholarships.add("Automotive Engineering Encouragement Scholarship")
                            }
                        }
                    }
                    "Master" -> {
                        when (grade) {
                            "A" -> {
                                scholarships.add("Automotive Engineering Excellence Scholarship")
                                scholarships.add("Leadership in Automotive Engineering Award")
                            }
                            "B" -> {
                                scholarships.add("Automotive Engineering Excellence Scholarship")
                            }
                            "C" -> {
                                scholarships.add("Continuing Education Scholarship")
                            }
                        }
                    }
                }
            }
            else -> {
                scholarships.add("General Scholarship")
            }
        }

        val scholarshipList = scholarships.joinToString(separator = "\n- ", prefix = "- ")
        return if (scholarships.isNotEmpty()) {
            "Based on your selection of $course, $degree, and grade $grade, you are eligible for the following scholarships:\n$scholarshipList"
        } else {
            "Based on your selection of $course, $degree, and grade $grade, there are no available scholarships at this time."
        }
    }

}