package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;
public class MainActivity extends AppCompatActivity {

    private ImageButton btnCall;
    private ImageButton btnSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCall =findViewById(R.id.btnCall);
        btnSMS =findViewById(R.id.btnSMS);
        btnCall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this , CallActivity.class);
                startActivity(intent1);
            }
        });

        btnSMS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this , SMSActivity.class);
                startActivity(intent2);
            }
        });

    }
}