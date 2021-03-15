package com.example.bcs6b;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    public EditText etValue1;
    public EditText etValue2;
    public TextView tv;
    public int num1=0;
    public int num2=0;
    public int addition=0;
    int subtraction=0;
    int multiplication=0;
    int division=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValue1 = (EditText) findViewById(R.id.etValue1);
        etValue2 = (EditText) findViewById(R.id.etValue2);
        // TextView tv = (TextView) findViewById(R.id.result);
        Spinner s = findViewById(R.id.spinner);
        List<String> operations = new ArrayList<>();
        operations.add("Choose Operand");
        operations.add("Addition");
        operations.add("Subtraction");
        operations.add("Multiplication");
        operations.add("Division");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, operations);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) throws ArithmeticException {
                String text= adapterView.getItemAtPosition(i).toString();
                tv = (TextView) findViewById(R.id.result);

                if(text.equals("Addition")){
                    try {
                        num1 = Integer.parseInt(etValue1.getText().toString());
                        num2 = Integer.parseInt(etValue2.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                    Add abc=new Add( );
                    int z= abc.ab(num1,num2);
                    tv.setText(String.valueOf(z));

                }
                else if(text.equals("Subtraction")){
                    try {
                        num1 = Integer.parseInt(etValue1.getText().toString());
                        num2 = Integer.parseInt(etValue2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                    //   subtract=no1-no2;
                    Subtraction sb=new Subtraction();
                    int z=sb.sub(num1, num2);
                    tv.setText(String.valueOf(z));
                }
                else if(text.equals("Multiplication")){
                    try {
                        num1 = Integer.parseInt(etValue1.getText().toString());
                        num2 = Integer.parseInt(etValue2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                    //    multiplication=no1*no2;
                    Multiplication mp=new Multiplication();
                    float z=mp.mul(num1, num2);
                    tv.setText(String.valueOf(z));
                }
                else if(text.equals("Division")){
                    try {
                        num1 = Integer.parseInt(etValue1.getText().toString());
                        num2 = Integer.parseInt(etValue2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }

                    Division dv=new Division();
                    String z=dv.div(num1,num2);
                    tv.setText(z);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}