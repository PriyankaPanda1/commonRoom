package com.example.commonroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent intent = new Intent(this, activity_home.class);
        startActivity(intent);
    }

    public void forgot(View view) {
        Intent intent = new Intent(this, forgetPassword.class);
        startActivity(intent);
    }

    public void signUpp(View view) {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

}