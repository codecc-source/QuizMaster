package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class checkStudentAttendance extends AppCompatActivity {
    private TextView attChange;
    private Button b1, b2, b3, b4, b5, bcktoTeacherMenu3;
    private ImageView onImg1, onImg2, onImg3, onImg4, onImg5, onImg6, onImg7, onImg8, onImg9, onImg10, onImg11, onImg12, onImg13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_student_attendance);

        attChange = (TextView) findViewById(R.id.teacherAttendance);
        b1 = (Button) findViewById(R.id.student1Attendance);
        b2 = (Button) findViewById(R.id.student2Attendance);
        b3 = (Button) findViewById(R.id.student3Attendance);
        b4 = (Button) findViewById(R.id.student4Attendance);
        b5 = (Button) findViewById(R.id.student5Attendance);
        onImg1 = (ImageView) findViewById(R.id.check1);
        onImg2 = (ImageView) findViewById(R.id.check2);
        onImg3 = (ImageView) findViewById(R.id.check3);
        onImg4 = (ImageView) findViewById(R.id.check4);
        onImg5 = (ImageView) findViewById(R.id.check5);
        onImg6 = (ImageView) findViewById(R.id.check6);
        onImg7 = (ImageView) findViewById(R.id.check7);
        onImg8 = (ImageView) findViewById(R.id.check8);
        onImg9 = (ImageView) findViewById(R.id.check9);
        onImg10 = (ImageView) findViewById(R.id.check10);
        onImg11 = (ImageView) findViewById(R.id.check11);
        onImg12 = (ImageView) findViewById(R.id.check12);
        onImg13 = (ImageView) findViewById(R.id.check13);
        bcktoTeacherMenu3 = (Button) findViewById(R.id.backtomainTeacher3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attChange.setText("Student 1 has checked \n his/her attendance");
                onImg1.setVisibility(View.VISIBLE);
                onImg2.setVisibility(View.VISIBLE);
                onImg3.setVisibility(View.VISIBLE);
                onImg4.setVisibility(View.VISIBLE);
                onImg5.setVisibility(View.VISIBLE);
                onImg6.setVisibility(View.VISIBLE);
                onImg7.setVisibility(View.VISIBLE);
                onImg8.setVisibility(View.VISIBLE);
                onImg9.setVisibility(View.VISIBLE);
                onImg10.setVisibility(View.VISIBLE);
                onImg11.setVisibility(View.VISIBLE);
                onImg12.setVisibility(View.VISIBLE);
                onImg13.setVisibility(View.VISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attChange.setText("Student 2 has checked \n his/her attendance");
                onImg1.setVisibility(View.VISIBLE);
                onImg2.setVisibility(View.INVISIBLE);
                onImg3.setVisibility(View.VISIBLE);
                onImg4.setVisibility(View.VISIBLE);
                onImg5.setVisibility(View.VISIBLE);
                onImg6.setVisibility(View.VISIBLE);
                onImg7.setVisibility(View.VISIBLE);
                onImg8.setVisibility(View.VISIBLE);
                onImg9.setVisibility(View.VISIBLE);
                onImg10.setVisibility(View.VISIBLE);
                onImg11.setVisibility(View.VISIBLE);
                onImg12.setVisibility(View.INVISIBLE);
                onImg13.setVisibility(View.VISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attChange.setText("Student 3 has checked \n his/her attendance");
                onImg1.setVisibility(View.INVISIBLE);
                onImg2.setVisibility(View.VISIBLE);
                onImg3.setVisibility(View.VISIBLE);
                onImg4.setVisibility(View.VISIBLE);
                onImg5.setVisibility(View.VISIBLE);
                onImg6.setVisibility(View.VISIBLE);
                onImg7.setVisibility(View.VISIBLE);
                onImg8.setVisibility(View.VISIBLE);
                onImg9.setVisibility(View.INVISIBLE);
                onImg10.setVisibility(View.INVISIBLE);
                onImg11.setVisibility(View.VISIBLE);
                onImg12.setVisibility(View.VISIBLE);
                onImg13.setVisibility(View.VISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attChange.setText("Student 4 has checked \n his/her attendance");
                onImg1.setVisibility(View.VISIBLE);
                onImg2.setVisibility(View.VISIBLE);
                onImg3.setVisibility(View.VISIBLE);
                onImg4.setVisibility(View.VISIBLE);
                onImg5.setVisibility(View.VISIBLE);
                onImg6.setVisibility(View.VISIBLE);
                onImg7.setVisibility(View.VISIBLE);
                onImg8.setVisibility(View.INVISIBLE);
                onImg9.setVisibility(View.INVISIBLE);
                onImg10.setVisibility(View.VISIBLE);
                onImg11.setVisibility(View.VISIBLE);
                onImg12.setVisibility(View.VISIBLE);
                onImg13.setVisibility(View.VISIBLE);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attChange.setText("Student 5 has checked \n his/her attendance");
                onImg1.setVisibility(View.INVISIBLE);
                onImg2.setVisibility(View.INVISIBLE);
                onImg3.setVisibility(View.INVISIBLE);
                onImg4.setVisibility(View.INVISIBLE);
                onImg5.setVisibility(View.INVISIBLE);
                onImg6.setVisibility(View.VISIBLE);
                onImg7.setVisibility(View.VISIBLE);
                onImg8.setVisibility(View.VISIBLE);
                onImg9.setVisibility(View.VISIBLE);
                onImg10.setVisibility(View.VISIBLE);
                onImg11.setVisibility(View.VISIBLE);
                onImg12.setVisibility(View.VISIBLE);
                onImg13.setVisibility(View.VISIBLE);
            }
        });
        bcktoTeacherMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoTeacher();
            }
        });
    }
    public void backtoTeacher(){
        Intent intent = new Intent(this, teachermenu.class);
        startActivity(intent);
    }
}