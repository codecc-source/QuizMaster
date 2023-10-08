package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentquiz extends AppCompatActivity {
    private Button btnBack, btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentquiz);

        btnBack = (Button) findViewById(R.id.backtostudentmenu);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoStudentMenu();
            }
        });

        btnQuiz = (Button) findViewById(R.id.startquiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoQuiz();
            }
        });
    }
    public void backtoStudentMenu(){
        Intent intent = new Intent(this, studentmenu.class);
        startActivity(intent);
    }
    public void gotoQuiz(){
        Intent openQuiz = new Intent(this, modquiz.class);
        startActivity(openQuiz);
    }
}
