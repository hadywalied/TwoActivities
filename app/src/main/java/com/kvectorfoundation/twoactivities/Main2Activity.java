package com.kvectorfoundation.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvRecieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvRecieve = findViewById(R.id.tv_recieve);

        String str = getIntent().getStringExtra("message");

        tvRecieve.setText(str);

    }
}
