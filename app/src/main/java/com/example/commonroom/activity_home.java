package com.example.commonroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void profileView(View view) {
        Intent intent = new Intent(this, user.class);
        startActivity(intent);
    }

    public void groupView(View view) {
        Intent intent = new Intent(this, group.class);
        startActivity(intent);
    }

    public void notificationView(View view) {
        Intent intent = new Intent(this, notification.class);
        startActivity(intent);
    }

    public void showAbout(View view) {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

    public void newPost(View view) {
        Intent intent = new Intent(this, newpost.class);
        startActivity(intent);
    }

}