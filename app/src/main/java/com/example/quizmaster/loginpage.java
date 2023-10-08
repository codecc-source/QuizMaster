package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
    private Button gotoQuiz, registerbtn;
    EditText getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlogin);

        getEmail = (EditText) findViewById(R.id.edteaddress);

        gotoQuiz = (Button) findViewById(R.id.login);
        gotoQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmailString = getEmail.getText().toString();
                if (!getEmailString.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(getEmailString).matches()) {
                    openStudentMenu();
                    Toast.makeText(loginpage.this, "Welcome, " + getEmailString, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(loginpage.this, "Enter a valid USLS account.", Toast.LENGTH_LONG).show();
                }
            }
        });

        registerbtn = (Button) findViewById(R.id.register);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });
    }
    public void openStudentMenu(){
        Intent quizOpen = new Intent(this, studentmenu.class);
        startActivity(quizOpen);
    }
    public void openRegister(){
        Intent regOpen = new Intent(this, registerpage.class);
        startActivity(regOpen);
    }
}