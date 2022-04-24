package com.example.sp20_bse_003_assi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String code = "1234";
    private TextView txt_code;
    private Button digit_1;
    private Button digit_2;
    private Button digit_3;
    private Button digit_4;
    private Button digit_5;
    private Button digit_6;
    private Button digit_7;
    private Button digit_8;
    private Button digit_9;
    private Button digit_0;
    private Button btn_back;
    private Button btn_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txt_code = findViewById(R.id.txt_code);
       digit_1 = findViewById(R.id.digit_1);
        digit_2= findViewById(R.id.digit_2);
        digit_3= findViewById(R.id.digit_3);
        digit_4= findViewById(R.id.digit_4);
        digit_5= findViewById(R.id.digit_5);
        digit_6= findViewById(R.id.digit_6);
        digit_7= findViewById(R.id.digit_7);
        digit_8 = findViewById(R.id.digit_8);
        digit_9= findViewById(R.id.digit_9);
        digit_0 = findViewById(R.id.digit_0);
        btn_back = findViewById(R.id.btn_back);
        btn_open = findViewById(R.id.btn_open);
    }

    private void setText(int n){
        String oldText = txt_code.getText().toString();
        if(oldText.length() >= 4){
            return;
        }
        txt_code.setText(oldText + n);
    }

    @Override
    protected void onResume() {
        super.onResume();
        digit_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(1);
            }
        });
        digit_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(2);
            }
        });
        digit_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(3);
            }
        });
        digit_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(4);
            }
        });
        digit_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(5);
            }
        });
        digit_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(6);
            }
        });
        digit_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(7);
            }
        });
        digit_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(8);
            }
        });
        digit_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(9);
            }
        });
        digit_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(0);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.length() > 0){
                    txt_code.setText(oldText.substring(0, oldText.length() - 1));
                }
            }
        });
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.equals(code)){
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}