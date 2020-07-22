package com.example.thai_simey_final_exam.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thai_simey_final_exam.R;

public class LoginActivty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View v) {
        Intent login = new Intent(this, TabActivity.class);
        startActivity(login);

    }
}
