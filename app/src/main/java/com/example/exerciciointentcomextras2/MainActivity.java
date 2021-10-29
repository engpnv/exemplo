package com.example.exerciciointentcomextras2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_numero1;
    Button bt_ok1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero1 = findViewById(R.id.et_numero1);
        bt_ok1 = findViewById(R.id.bt_ok1);

        bt_ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("numero1",et_numero1.getText().toString());
                startActivity(intent);

            }
        });

    }
}