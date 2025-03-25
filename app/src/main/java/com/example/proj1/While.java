package com.example.proj1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class While extends AppCompatActivity implements View.OnClickListener {

    private Button btnRun,btnBack;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while);

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
            int i = 1;
            StringBuilder result = new StringBuilder();

            while (i <= 10) {
                result.append(i).append("\n");
                i++;
            }

            result.append("Loop ended");

            txtResult.setText(result.toString());
        }
        else if (id == R.id.btnBack) {
            finish();
        }


    }
}
