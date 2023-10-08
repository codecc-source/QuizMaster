package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class teacherlogin extends AppCompatActivity {
    private Button gotoTeacherMenu;
    EditText teacherEmailget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacherlogin);

        teacherEmailget = (EditText) findViewById(R.id.teacherEmail);

        gotoTeacherMenu = (Button) findViewById(R.id.loginteacher);
        gotoTeacherMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTEmail = teacherEmailget.getText().toString();
                if (!getTEmail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(getTEmail).matches()) {
                    openTeacherMenu();
                    Toast.makeText(teacherlogin.this, "Welcome, teacher " + getTEmail, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(teacherlogin.this, "Enter a valid USLS account.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void openTeacherMenu(){
        Intent quizOpen = new Intent(this, teachermenu.class);
        startActivity(quizOpen);
    }
}