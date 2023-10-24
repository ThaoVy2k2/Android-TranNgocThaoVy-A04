package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class  SMSActivity extends AppCompatActivity {
    EditText editSMS;
    Button btn_back2;
    ImageButton btnSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);
        editSMS = (EditText) findViewById(R.id.editSMS);
        btn_back2 = (Button) findViewById(R.id.btn_back2);
        btnSMS = (ImageButton) findViewById(R.id.btnSMS);
        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:"+editSMS.getText().toString()));
                startActivity(callintent);
            }
        });
        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}