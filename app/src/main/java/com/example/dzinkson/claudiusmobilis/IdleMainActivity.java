package com.example.dzinkson.claudiusmobilis;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class IdleMainActivity extends Activity {

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


    }

}
