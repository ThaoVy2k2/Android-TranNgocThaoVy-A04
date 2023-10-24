package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextPageActivity extends AppCompatActivity {

    Button signOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        signOut = findViewById(R.id.sign_out);
        signOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NextPageActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}