package ru.synergy.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sekond_loyaut);

        TextView textView = (TextView) findViewById(R.id.header);

        textView.setText("Hello from Java");

//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android");
//        textView.setTextSize(26);
//
//        // setContentView(textView);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT);
//
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        textView.setLayoutParams(layoutParams);
//
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);
    }
}