package com.example.proj1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class For extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack, btnRun, btnRun2, btnRun3;
    private TextView txtResult, txtResult2, txtResult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_for);

        btnRun = findViewById(R.id.btnRun);
        btnRun2 = findViewById(R.id.btnRun2);
        btnRun3 = findViewById(R.id.btnRun3);
        txtResult = findViewById(R.id.txtResult);
        txtResult2 = findViewById(R.id.txtResult2);
        txtResult3 = findViewById(R.id.txtResult3);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(this);
        btnRun.setOnClickListener(this);
        btnRun2.setOnClickListener(this);
        btnRun3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btnRun) {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= 5; i++) {
                result.append(i).append("\n");
            }
            result.append("Loop ended");
            txtResult.setText(result.toString());

        } else if (id == R.id.btnRun2) {
            String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Lemon"};
            StringBuilder result2 = new StringBuilder();
            result2.append("List of fruits\n");

            for (int i = 0; i < fruits.length; i++) {
                result2.append((i + 1)).append(". ").append(fruits[i]).append("\n");
            }
            txtResult2.setText(result2.toString());

        } else if (id == R.id.btnRun3) {
            StringBuilder result3 = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    break;
                }
                result3.append(i).append("\n");
            }
            txtResult3.setText(result3.toString());

        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}
