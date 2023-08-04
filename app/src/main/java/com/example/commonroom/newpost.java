package com.example.commonroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newpost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpost);
    }
    public void uploadPost(View view) {
        Intent intent = new Intent(this, activity_home.class);
        startActivity(intent);
    }

}