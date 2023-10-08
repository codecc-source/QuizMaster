package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class modquiz extends AppCompatActivity {
    private Button scoringQuiz, bcktostudentmenu;
    private RadioGroup rg1, rg2, rg3, rg4, rg5, rg6, rg7, rg8, rg9, rg10;
    private RadioButton ans1a, ans2b, ans3c, ans4b, ans5a, ans6b, ans7a, ans8c,ans9a,ans10c;
    private TextView res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, resScore;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modquiz);

        resScore = (TextView) findViewById(R.id.results);

        rg1 = (RadioGroup) findViewById(R.id.question1);
        rg2 = (RadioGroup) findViewById(R.id.question2);
        rg3 = (RadioGroup) findViewById(R.id.question3);
        rg4 = (RadioGroup) findViewById(R.id.question4);
        rg5 = (RadioGroup) findViewById(R.id.question5);
        rg6 = (RadioGroup) findViewById(R.id.question6);
        rg7 = (RadioGroup) findViewById(R.id.question7);
        rg8 = (RadioGroup) findViewById(R.id.question8);
        rg9 = (RadioGroup) findViewById(R.id.question9);
        rg10 = (RadioGroup) findViewById(R.id.question10);

        ans1a = (RadioButton) findViewById(R.id.ans1a);
        ans2b = (RadioButton) findViewById(R.id.ans2b);
        ans3c = (RadioButton) findViewById(R.id.ans3c);
        ans4b = (RadioButton) findViewById(R.id.ans4b);
        ans5a = (RadioButton) findViewById(R.id.ans5a);
        ans6b = (RadioButton) findViewById(R.id.ans6b);
        ans7a = (RadioButton) findViewById(R.id.ans7a);
        ans8c = (RadioButton) findViewById(R.id.ans8c);
        ans9a = (RadioButton) findViewById(R.id.ans9a);
        ans10c = (RadioButton) findViewById(R.id.ans10c);

        res1 = (TextView) findViewById(R.id.response1);
        res2 = (TextView) findViewById(R.id.response2);
        res3 = (TextView) findViewById(R.id.response3);
        res4 = (TextView) findViewById(R.id.response4);
        res5 = (TextView) findViewById(R.id.response5);
        res6 = (TextView) findViewById(R.id.response6);
        res7 = (TextView) findViewById(R.id.response7);
        res8 = (TextView) findViewById(R.id.response8);
        res9 = (TextView) findViewById(R.id.response9);
        res10 = (TextView) findViewById(R.id.response10);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans1a:
                        res1.setText("Your answer is A \n");
                        score += 1;
                        break;
                    case R.id.ans1b:
                        res1.setText("Your answer is B \n");
                        break;
                    case R.id.ans1c:
                        res1.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans2a:
                        res2.setText("Your answer is A \n");
                        break;
                    case R.id.ans2b:
                        res2.setText("Your answer is B \n");
                        score += 1;
                        break;
                    case R.id.ans2c:
                        res2.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans3a:
                        res3.setText("Your answer is A \n");
                        break;
                    case R.id.ans3b:
                        res3.setText("Your answer is B \n");
                        break;
                    case R.id.ans3c:
                        res3.setText("Your answer is C \n");
                        score += 1;
                        break;
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans4a:
                        res4.setText("Your answer is A \n");
                        break;
                    case R.id.ans4b:
                        res4.setText("Your answer is B \n");
                        score += 1;
                        break;
                    case R.id.ans4c:
                        res4.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans5a:
                        res5.setText("Your answer is A \n");
                        score += 1;
                        break;
                    case R.id.ans5b:
                        res5.setText("Your answer is B \n");
                        break;
                    case R.id.ans5c:
                        res5.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans6a:
                        res6.setText("Your answer is A \n");
                        break;
                    case R.id.ans6b:
                        res6.setText("Your answer is B \n");
                        score += 1;
                        break;
                    case R.id.ans6c:
                        res6.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans7a:
                        res7.setText("Your answer is A \n");
                        score += 1;
                        break;
                    case R.id.ans7b:
                        res7.setText("Your answer is B \n");
                        break;
                    case R.id.ans7c:
                        res7.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans8a:
                        res8.setText("Your answer is A \n");
                        break;
                    case R.id.ans8b:
                        res8.setText("Your answer is B \n");
                        break;
                    case R.id.ans8c:
                        res8.setText("Your answer is C \n");
                        score += 1;
                        break;
                }
            }
        });

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans9a:
                        res9.setText("Your answer is A \n");
                        score += 1;
                        break;
                    case R.id.ans9b:
                        res9.setText("Your answer is B \n");
                        break;
                    case R.id.ans9c:
                        res9.setText("Your answer is C \n");
                        break;
                }
            }
        });

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ans10a:
                        res10.setText("Your answer is A \n");
                        break;
                    case R.id.ans10b:
                        res10.setText("Your answer is B \n");
                        break;
                    case R.id.ans10c:
                        res10.setText("Your answer is C \n");
                        score += 1;
                        break;
                }
            }
        });

        scoringQuiz = (Button) findViewById(R.id.quizSubmit);
        scoringQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resScore.setText("Score is: " + score + " / 10");
                if (score >= 6){
                    Toast.makeText(modquiz.this, "Congratulations you passed!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(modquiz.this, "Sorry, try again next time!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bcktostudentmenu = (Button) findViewById(R.id.backtostudentmenu2);
        bcktostudentmenu.setOnClickListener(new View.OnClickListener() {
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