package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class studentattendance extends AppCompatActivity {
    private TextView currentTV, attCheck;
    private Button attendanceBtn, bcktoMain5;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentattendance);

        currentTV  = findViewById(R.id.dateTime);
        SimpleDateFormat sdf = new SimpleDateFormat("'Date: 'dd-MM-yyyy '\n\nTime: 'HH:mm:ss z");
        String currentDateAndTime = sdf.format(new Date());
        currentTV.setText(currentDateAndTime);

        bcktoMain5 = (Button) findViewById(R.id.statCheck);
        img = (ImageView) findViewById(R.id.checker);

        attendanceBtn = (Button) findViewById(R.id.attBtn);
        attendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attCheck = (Button) findViewById(R.id.attBtn);
                Toast.makeText(studentattendance.this, "Attendance Checked.", Toast.LENGTH_SHORT).show();
                bcktoMain5.setText("Back to Student Menu");
                bcktoMain5.setBackgroundColor(Color.BLACK);
                img.setVisibility(View.VISIBLE);
            }
        });

        bcktoMain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentMenu();
            }
        });
    }
    public void openStudentMenu(){
        Intent intent = new Intent(this, studentmenu.class);
        startActivity(intent);
    }
}