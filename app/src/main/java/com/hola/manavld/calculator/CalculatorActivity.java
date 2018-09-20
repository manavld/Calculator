package com.hola.manavld.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private String num = ""; // Aixo es el numero actual (el "model")
    private TextView numview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numview = findViewById(R.id.curr_num);
        numview.setText(num);
    }

    public void onClickDigit(View view) {
        Button b = (Button)view;
        num += b.getText().toString().charAt(0);
        numview.setText(num);
    }

    //onClickOperator -> memoria numero anterior, memoria operador actual fins que apliques "="
    public void onClickOperator(View view){
        Button b = (Button)view;

    }
    //onClickEquals
    public void onClickEquals(View view){
        Button b = (Button)view;

    }
    //onClickDot
    public void onClickDot(View view){
        Button b = (Button)view;

    }
}
