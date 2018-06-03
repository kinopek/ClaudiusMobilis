package com.example.dzinkson.claudiusmobilis;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_camera);

        Button logoutCameraBtn = findViewById(R.id.logoutCameraBtn);
        logoutCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LogActivity.class);
                startActivity(startIntent);
            }
        });

        Button mainCameraBtn = findViewById(R.id.mainCameraBtn);
        mainCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), IdleMainActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton settingsCameraBtn = findViewById(R.id.settingsCameraBtn);
        settingsCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
