package com.example.proj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnWhile, btnDo_while, btnFor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnDo_while = findViewById(R.id.btnDo_while);
        btnWhile = findViewById(R.id.btnWhile);
        btnFor = findViewById(R.id.btnFor);
        btnDo_while.setOnClickListener(this);
        btnWhile.setOnClickListener(this);
        btnFor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnWhile){
            Intent launchFirst = new Intent(MainActivity.this, While.class);
            startActivity(launchFirst);
        }
        else if (id == R.id.btnDo_while){
            Intent launchFirst = new Intent(MainActivity.this, Dowhile.class);
            startActivity(launchFirst);
        }
        else if (id == R.id.btnFor){
            Intent launchFirst = new Intent(MainActivity.this, For.class);
            startActivity(launchFirst);
        }
    }
}