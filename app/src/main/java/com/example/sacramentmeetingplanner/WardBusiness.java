package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class WardBusiness extends AppCompatActivity {
    TextView textView3;
    AutoCompleteTextView textView4, textView5;
    EditText editMultiline, editMultiline2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_business);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        editMultiline = findViewById(R.id.editMultiLine);
        editMultiline2 = findViewById(R.id.editMultiLine2);

    }

    public void backAgenda(View view){
        Intent intent = new Intent(WardBusiness. this, Agenda.class);
        startActivity(intent);
    }
}