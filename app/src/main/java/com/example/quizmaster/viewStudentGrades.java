package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class viewStudentGrades extends AppCompatActivity {
    private EditText QuizScoreStat1, QuizScoreStat2, QuizScoreStat3, finalGradeEdit;
    private TextView stdtNo;
    private Button SG1, SG2, SG3, SG4, SG5, bcktoTeacherMenu2, calculateFG;
    int qtr1, qtr2, qtr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student_grades);

        QuizScoreStat1 = (EditText) findViewById(R.id.quizGradeScore1);
        QuizScoreStat2 = (EditText) findViewById(R.id.quizGradeScore2);
        QuizScoreStat3 = (EditText) findViewById(R.id.quizGradeScore3);
        finalGradeEdit = (EditText) findViewById(R.id.finalGrade);
        calculateFG = (Button) findViewById(R.id.calculateFinal);
        stdtNo = (TextView) findViewById(R.id.studentNumber);
        SG1 = (Button) findViewById(R.id.student1Score);
        SG2 = (Button) findViewById(R.id.student1Score2);
        SG3 = (Button) findViewById(R.id.student1Score3);
        SG4 = (Button) findViewById(R.id.student1Score4);
        SG5 = (Button) findViewById(R.id.student1Score5);
        bcktoTeacherMenu2 = (Button) findViewById(R.id.backtomainTeacher2);

        SG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stdtNo.setText("S\nT\nU\nD\nE\nN\nT\n1");
                QuizScoreStat1.setText("90");
                QuizScoreStat2.setText("94");
                QuizScoreStat3.setText("92");
            }
        });
        SG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stdtNo.setText("S\nT\nU\nD\nE\nN\nT\n2");
                QuizScoreStat1.setText("89");
                QuizScoreStat2.setText("85");
                QuizScoreStat3.setText("87");
            }
        });
        SG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stdtNo.setText("S\nT\nU\nD\nE\nN\nT\n3");
                QuizScoreStat1.setText("84");
                QuizScoreStat2.setText("87");
                QuizScoreStat3.setText("82");
            }
        });
        SG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stdtNo.setText("S\nT\nU\nD\nE\nN\nT\n4");
                QuizScoreStat1.setText("78");
                QuizScoreStat2.setText("76");
                QuizScoreStat3.setText("79");
            }
        });
        SG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stdtNo.setText("S\nT\nU\nD\nE\nN\nT\n5");
                QuizScoreStat1.setText("72");
                QuizScoreStat2.setText("75");
                QuizScoreStat3.setText("77");
            }
        });

        bcktoTeacherMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BcktoTeacherMenu2();
            }
        });
        calculateFG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = QuizScoreStat1.getText().toString();
                qtr1 = Integer.parseInt(v1);
                String v2 = QuizScoreStat2.getText().toString();
                qtr2 = Integer.parseInt(v2);
                String v3 = QuizScoreStat3.getText().toString();
                qtr3 = Integer.parseInt(v3);

                double ffgrade = qtr1 * 0.2 + qtr2 * 0.2 + qtr3 * 0.6;
                int fffGrade = (int) ffgrade;
                String ffString = String.valueOf(fffGrade);

                finalGradeEdit.setText(ffString);
            }
        });
    }
    public void BcktoTeacherMenu2(){
        Intent intent = new Intent(this, teachermenu.class);
        startActivity(intent);
    }
}