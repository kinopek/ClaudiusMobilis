package com.example.dzinkson.claudiusmobilis;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class IdleMainActivity extends Activity {
Global a = Global.getInstance();
int s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_idle_main);

        Button cameraIdleBtn = findViewById(R.id.cameraIdleBtn);
        cameraIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(startIntent);
            }
        });

        Button logoutIdleBtn = findViewById(R.id.logoutIdleBtn);
        logoutIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LogActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton settingsIdleBtn = findViewById(R.id.settingsIdleBtn);
        settingsIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(startIntent);
            }
        });

        Button idleIdleBtn = findViewById(R.id.idleIdleBtn);
        idleIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              s=0;
              findViewById(R.id.idleImageView).setVisibility(View.VISIBLE);
              findViewById(R.id.idleTextView).setVisibility(View.VISIBLE);
              findViewById(R.id.protectMainView).setVisibility(View.INVISIBLE);
              findViewById(R.id.protectTextView).setVisibility(View.INVISIBLE);
              findViewById(R.id.alarmImageView).setVisibility(View.INVISIBLE);
              findViewById(R.id.alarmTextView).setVisibility(View.INVISIBLE);

            }
        });
        Button alarmIdleBtn = findViewById(R.id.alarmIdleBtn);
        alarmIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=1;

                findViewById(R.id.alarmImageView).setVisibility(View.VISIBLE);
                findViewById(R.id.alarmTextView).setVisibility(View.VISIBLE);
                findViewById(R.id.protectMainView).setVisibility(View.INVISIBLE);
                findViewById(R.id.idleImageView).setVisibility(View.INVISIBLE);
                findViewById(R.id.idleTextView).setVisibility(View.INVISIBLE);
                findViewById(R.id.protectTextView).setVisibility(View.INVISIBLE);
            }
        });
        Button protectedIdleBtn= findViewById(R.id.protectedIdleBtn);
        protectedIdleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=2;
                findViewById(R.id.protectMainView).setVisibility(View.VISIBLE);
                findViewById(R.id.protectTextView).setVisibility(View.VISIBLE);
                findViewById(R.id.idleImageView).setVisibility(View.INVISIBLE);
                findViewById(R.id.idleTextView).setVisibility(View.INVISIBLE);
                findViewById(R.id.alarmImageView).setVisibility(View.INVISIBLE);
                findViewById(R.id.alarmTextView).setVisibility(View.INVISIBLE);
            }
        });

    }


}
