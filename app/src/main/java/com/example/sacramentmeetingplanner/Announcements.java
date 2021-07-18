package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Announcements extends AppCompatActivity {
    TextView textAnnouncements;
    EditText list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        textAnnouncements = findViewById(R.id.textAnnouncements);
        list =findViewById(R.id.textList);

    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first


    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first


    }

    public void returnAgenda (View view){
        Intent intent = new Intent(Announcements.this, Agenda.class);
        startActivity(intent);
    }

}