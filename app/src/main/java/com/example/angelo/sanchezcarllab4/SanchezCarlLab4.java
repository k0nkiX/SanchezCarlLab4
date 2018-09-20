package com.example.angelo.sanchezcarllab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class SanchezCarlLab4 extends AppCompatActivity {

    protected Button backButton, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanchez_carl_lab4);
        Log.d("Lifecycle", "onCreate() was used");

        backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SanchezCarlLab4.this, "Nah", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton = findViewById(R.id.next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Nah again!", Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "onStart() was used");
    }

    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle", "onResume() was used");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle", "onRestart() was used");
    }

    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle", "onPause() was used");
    }

    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle", "onStop() was used");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy() was used");
    }
}