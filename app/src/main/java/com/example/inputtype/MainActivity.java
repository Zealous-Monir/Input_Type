package com.example.inputtype;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button clickButton;
    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextButton);
        clickButton = findViewById(R.id.clickButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        clickButton.setOnClickListener(v -> {

          String name =  editText.getText().toString();
          tvDisplay.setText("Hello " + name + " Great Work!" );


        });



    }
}