package com.example.labassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LabAssignment extends MainActivity {
        TextView t5;
        TextView t6;
        TextView t7;
        TextView t8 ;
        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lab_assignment);
            t5=(TextView)findViewById(R.id.t1);
            Log.i("On create invoked","1");
            super.counter1 ++;
            String h = "On create call:" + counter1;
            t5.setText(h);
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("On restart invoked","1");
            t8 = (TextView) findViewById(R.id.t4);
            super.counter2++;
            String m="on restart calls:"+super.counter2;
            t8.setText(m);
        }

        @Override
        protected void onStart() {
            super.onStart();
            t6 = (TextView) findViewById(R.id.t2);
            Log.i("On start invoked","1");
            super.counter3++;
            String g="on start calls:"+super.counter3;
            t6.setText(g);
        }
        @Override
        protected void onResume() {
            super.onResume();
            t7 = (TextView) findViewById(R.id.t3);
            Log.i("On resume invoked","1");
            super.counter4++;
            String a="onResume calls :"+super.counter4;
            t7.setText(a);
        }
    }