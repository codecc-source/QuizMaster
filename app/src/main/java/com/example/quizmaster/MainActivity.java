package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gotoStudentLogin, gotoTeacherLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoStudentLogin = (Button) findViewById(R.id.student);
        gotoStudentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentLogin();
            }
        });

        gotoTeacherLogin = (Button) findViewById(R.id.teacher);
        gotoTeacherLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTeacherLogin();
            }
        });
    }
    public void openStudentLogin(){
        Intent intent = new Intent(this, loginpage.class);
        startActivity(intent);
    }
    public void openTeacherLogin(){
        Intent intent2 = new Intent(this, teacherlogin.class);
        startActivity(intent2);
    }
}
