package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teachermenu extends AppCompatActivity {
    private Button backtoMainTeacher2, openGrades, openAttendanceCheck, classListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachermenu);

        backtoMainTeacher2 = (Button) findViewById(R.id.backtomainTeacher);
        backtoMainTeacher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBacktoMain2();
            }
        });

        openGrades = (Button) findViewById(R.id.viewstudentgrades);
        openGrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudenGrades();
            }
        });

        openAttendanceCheck = (Button) findViewById(R.id.checkstudentattendance);
        openAttendanceCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentAttendance();
            }
        });
        classListBtn = (Button) findViewById(R.id.classlist);
        classListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassList();
            }
        });
    }
    public void openBacktoMain2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openStudenGrades(){
        Intent intent2 = new Intent(this, viewStudentGrades.class);
        startActivity(intent2);
    }
    public void openStudentAttendance(){
        Intent intent3 = new Intent(this, checkStudentAttendance.class);
        startActivity(intent3);
    }
    public void openClassList(){
        Intent intent4 = new Intent(this, classListAct.class);
        startActivity(intent4);
    }
}