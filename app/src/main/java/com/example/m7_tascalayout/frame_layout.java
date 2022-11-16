package com.example.m7_tascalayout;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class frame_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }

    public void fletxaEnreraOnClick(View view) {
        Intent intent = new Intent(this, relative_layout.class);
        startActivity(intent);
    }
}