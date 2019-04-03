package com.csci490.csci490_lab_06_brandon_neese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameBox;
    String currName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameBox =(EditText)findViewById(R.id.editText);
    }

    void Submit(View v){
        Toast toast = Toast.makeText(getApplicationContext(),"Submitted name", Toast.LENGTH_SHORT);
        toast.show();

        currName = nameBox.getText().toString();
    }

    void listNames(View v){
        nameBox.setText(currName);

        Toast toast = Toast.makeText(getApplicationContext(), currName, Toast.LENGTH_SHORT);
        toast.show();
    }
}
