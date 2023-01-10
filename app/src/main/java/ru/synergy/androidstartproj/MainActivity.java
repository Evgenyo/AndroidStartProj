package ru.synergy.androidstartproj;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int REQ_C = 1;
    EditText et;
    private TextView tv;

    ActivityResultLauncher<Intent> mStartActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                 Intent intent = result.getData();
                 tv.setText(intent.getStringExtra("tv"));

                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sekond_loyaut);


        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);

        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);

        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }



   public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.button4:
                i= new Intent(this, MainActivity2.class);
                startActivity(i);
                break;
            case R.id.button5:
                i= new Intent(this, ToinfActivity.class);
                String eText = et.getText().toString();
                i.putExtra("et", eText);
                startActivity(i);
                break;
            case R.id.button6:
                i = new Intent(this, ComeBackActivity.class);
                mStartActivityForResult.launch(i);

        }
   }

//    @Override
//    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
//     super.onActivityResult(requestCode, resultCode, data);
//     switch (requestCode){
//         case RESULT_OK:
//             tv.setText(data.getStringExtra("et"));
//     }
//
//        return false;
//    }
}