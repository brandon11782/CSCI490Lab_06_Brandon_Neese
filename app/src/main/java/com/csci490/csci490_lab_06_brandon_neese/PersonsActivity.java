package com.csci490.csci490_lab_06_brandon_neese;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PersonsActivity extends AppCompatActivity {
    setContentView(R.layout.activity_persons);

    listView = findViewById(R.id.personName);

    ArrayList<String> i = (ArrayList) this.getIntent().getExtras().get("Persons");

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, i);

    listView.setAdapter(adapter);
}
