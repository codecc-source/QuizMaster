package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerpage extends AppCompatActivity {
    private Button backBtn2, registerBtn;
    EditText getregEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

        getregEmail = (EditText) findViewById(R.id.regBtnEmail);

        backBtn2 = (Button) findViewById(R.id.backtomainmenu2);
        backBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoMain2();
            }
        });

        registerBtn = (Button) findViewById(R.id.regBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmailString = getregEmail.getText().toString();
                if (!getEmailString.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(getEmailString).matches()) {
                    Toast.makeText(registerpage.this, "Thanks for registering.", Toast.LENGTH_LONG).show();
                    openLogin();
                } else {
                    Toast.makeText(registerpage.this, "Enter a valid USLS account.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void backtoMain2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openLogin(){
        Intent intent2 = new Intent(this, loginpage.class);
        startActivity(intent2);
    }
}