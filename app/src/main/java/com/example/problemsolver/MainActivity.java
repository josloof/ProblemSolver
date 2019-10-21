package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Calculator;
    private Button MathSolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator = (Button) findViewById(R.id.Calculator);
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculator();
            }
        });

        MathSolver = (Button) findViewById(R.id.MathSolver);
        MathSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMathSolver();
            }
        });
    }

    public void openCalculator() {

        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);

    }

    public void openMathSolver() {

        Intent intent = new Intent(this, MathSolver.class);
        startActivity(intent);

    }
}