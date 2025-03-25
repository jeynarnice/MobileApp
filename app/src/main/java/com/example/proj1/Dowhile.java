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
            StringBuilder resultBuilder = new StringBuilder();

            do {
                rand = (int) (Math.random() * 6) + 1;
                resultBuilder.append("Random number: ").append(rand).append("\n");
                count++;
            } while (rand != 5);

            resultBuilder.append("It takes ").append(count).append(" random(s) to get 5");
            txtResult.setText(resultBuilder.toString());
        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}
