package com.example.studentpracticle.kunal.studentlist

class student_id_modelclass {
    var student_name:String = ""
    var student_fathername:String = ""
    var student_rollnumber:String = ""
    var student_section:String = ""
    var student_image:Int = 0

    constructor(student_name: String, student_fathername: String, student_rollnumber: String, student_section: String, student_image: Int) {
        this.student_name = student_name
        this.student_fathername = student_fathername
        this.student_rollnumber = student_rollnumber
        this.student_section = student_section
        this.student_image = student_image
    }
}