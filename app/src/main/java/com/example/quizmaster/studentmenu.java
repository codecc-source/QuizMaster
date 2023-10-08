package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentmenu extends AppCompatActivity {
    private Button openQuiz, bcktoMain4, openattendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentmenu);

        openQuiz = (Button) findViewById(R.id.quizzes);
        openQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizMenu();
            }
        });

        bcktoMain4 = (Button) findViewById(R.id.backtomainmenu4);
        bcktoMain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain4();
            }
        });

        openattendance = (Button) findViewById(R.id.attendance);
        openattendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtt();
            }
        });
    }
    public void openQuizMenu(){
        Intent intent = new Intent(this, studentquiz.class);
        startActivity(intent);
    }
    public void openMain4(){
        Intent openMain = new Intent(this, MainActivity.class);
        startActivity(openMain);
    }
    public void openAtt(){
        Intent attendance = new Intent(this, studentattendance.class);
        startActivity(attendance);
    }
}