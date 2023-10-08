package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class classListAct extends AppCompatActivity {
    private Button bcktoTeacherMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_list);

        bcktoTeacherMenu = (Button) findViewById(R.id.TeacherMenuBack);
        bcktoTeacherMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opnBckTeacher();
            }
        });
    }
    public void opnBckTeacher(){
        Intent intent = new Intent(this, teachermenu.class);
        startActivity(intent);
    }
}