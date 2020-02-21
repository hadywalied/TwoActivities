package com.kvectorfoundation.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Hady" ;
    Button btnSend;
    EditText etSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Created ");

        final Intent intent = new Intent(this, Main2Activity.class);

        btnSend = findViewById(R.id.btn_send);
        etSend = findViewById(R.id.et_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf(etSend.getText());
                intent.putExtra("message", str);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: Restared");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Paused");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Destroyed");
    }
}
