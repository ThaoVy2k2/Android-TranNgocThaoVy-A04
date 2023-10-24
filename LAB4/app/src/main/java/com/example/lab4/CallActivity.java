package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CallActivity extends AppCompatActivity {
    EditText editphone;
    ImageButton btn_call;
    Button btn_back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        editphone = findViewById(R.id.editphone);
        btn_call = findViewById(R.id.btn_call);
        btn_back1 = findViewById(R.id.btn_back1);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ editphone.getText().toString()));
                if (ActivityCompat.checkSelfPermission(CallActivity.this,
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallActivity.this, new
                            String[]{android.Manifest.permission.CALL_PHONE}, 1);
                    return;
                }

                startActivity(callintent);
            }
        });
        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}