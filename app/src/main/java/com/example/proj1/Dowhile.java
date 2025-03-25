package com.example.proj1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dowhile extends AppCompatActivity implements View.OnClickListener {
    private Button btnRun, btnBack;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dowhile);

        btnRun = findViewById(R.id.btnRun);
        txtResult = findViewById(R.id.txtResult);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        btnRun.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnRun) {
            int rand;
            int count = 0;
            StringBuilder resultBuilder = new StringBuilder(); // ใช้ StringBuilder สำหรับเก็บผลลัพธ์

            do {
                rand = (int) (Math.random() * 6) + 1; // สุ่มตัวเลขระหว่าง 1 ถึง 6
                resultBuilder.append("Random number: ").append(rand).append("\n"); // เก็บหมายเลขสุ่มใน StringBuilder
                count++;
            } while (rand != 5); // ทำซ้ำจนกว่าจะได้ 5

            resultBuilder.append("It takes ").append(count).append(" random(s) to get 5"); // เพิ่มข้อความผลลัพธ์สุดท้าย
            txtResult.setText(resultBuilder.toString()); // แสดงผลทั้งหมดใน TextView
        } else if (id == R.id.btnBack) {
            finish(); // ปิดหน้าจอปัจจุบัน
        }
    }
}
