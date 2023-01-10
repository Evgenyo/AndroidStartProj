package ru.synergy.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;

public class Calculator extends AppCompatActivity {

    private static final String LogcatTag = "CALCULATOR_ACTIVITY";
    private static final String LifecycleTag = "LIFECYCLE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifecycleTag, "I'm on create, and i'm started");
        setContentView(R.layout.activity_calculator2);

        final Button calculate = (Button) findViewById(R.id.calc);

//
//        //Context training
//        TextView textView = new TextView(this);
//        ListAdapter adapter = new SimpleCursorAdapter(getApplicationContext(),);
//
//              //Доступ из класса Activity -- наследник Context
//        getSystemService(LAYOUT_INFLATER_SERVICE);
//
//              //Shared prefs доступ с использованием контекста приложения
//        SharedPreferences prefs = getApplicationContext().getSharedPreferences("PREFS", MODE_PRIVATE);
//
//        ///

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcuclateAnswe();


                //прерывание
                //    e.printStackTrace();
                //  Toast.makeText(Calculator.this, e.getMassage(), Toast.LENGTH_LONG).show();
                //  finish();

                //востановление
                //   e.printStackTrace();
                // Toast.makeText(Calculator.this, e.getMassage(), Toast.LENGTH_LONG).show();
                //   dropFields();

                Intent i = new Intent(Calculator.this,MainActivity.class);
               // startActivity(i);
            }

        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LifecycleTag,"I'm onPause, I'm started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LifecycleTag, "I'm onResume, I'm started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LifecycleTag, "I'm onStop, I'm started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LifecycleTag, "I'm on Destroy, I'm started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LifecycleTag, "I'm onStart, and I'm startred");
    }

    private void calcuclateAnswe(){
            EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal);
            EditText numTwo = (EditText) findViewById(R.id.editTextNumberDecimal2);

            RadioButton add = (RadioButton) findViewById(R.id.add);
            RadioButton sub = (RadioButton) findViewById(R.id.subtract);
            RadioButton multiple = (RadioButton) findViewById(R.id.multiple);
            RadioButton divide = (RadioButton) findViewById(R.id.divide);

            TextView answer = (TextView) findViewById(R.id.result);

//            try {
//              // int a = 25 / 0;
//               throw new ArithmeticException("i am exception");
//            } catch (ArithmeticException e){
//                Toast.makeText(this, "There is a problem inside the app", Toast.LENGTH_SHORT).show();
//               finish();
//            }

            float numone = Integer.parseInt(numOne.getText().toString());
            float numtwo = Integer.parseInt(numTwo.getText().toString());

            float solution = 0;

            if(add.isChecked()){
                solution = numone + numtwo;
            }
            if(sub.isChecked()){
                solution = numone - numtwo;
            }
            if(multiple.isChecked()){
                solution = numone * numtwo;
            }
            if(divide.isChecked()){
                if(numtwo == 0){
                    Toast.makeText(this, "Number two  Cannot be zero", Toast.LENGTH_SHORT).show();
                            return;
                }
                solution = numone / numtwo;
            }

            answer.setText("The answer is" + solution);

            throw new ArithmeticException("i am generated exception");

    }

}