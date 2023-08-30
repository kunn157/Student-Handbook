package com.example.student_handbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.student_handbook.doanthanhnien.MainDoanThanhNien;

class MainActivity extends AppCompatActivity {

   private Button  btn_doanthanhnien ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doanthanhnien = (Button) findViewById(R.id.btn_dtn);
        btn_doanthanhnien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDoanThanhNien.class);
                startActivity(intent);
            }
        });

    }
}