package com.bodun.stepscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double p1, p2, p3, result;
    EditText ed1, ed2, ed3;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        ed2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        ed3 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        tvResult = (TextView) findViewById(R.id.textViewResult);

    }

    public void onCalc(View view) {
        try {
            p1 = Double.parseDouble(ed1.getText().toString());
        }catch (final NumberFormatException e){
            Toast.makeText(this, "Неверный формат ввода.\r\nФормат: 123.321", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            p2 = Double.parseDouble(ed2.getText().toString());
        } catch (final NumberFormatException e) {
            Toast.makeText(this, "Неверный формат ввода.\r\nФормат: 123.321", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            p3 = Double.parseDouble(ed3.getText().toString());
        } catch (final NumberFormatException e) {
            Toast.makeText(this, "Неверный формат ввода.\r\nФормат: 123.321", Toast.LENGTH_SHORT).show();
            return;
        }

        result = p1 * p2 / p3;
        String str; //, strResult;
        //strResult = String.format("%.3f", result);
        str = "Фактические шаги: " + String.format("%.3f", result);
        tvResult.setText(str);
    }
}