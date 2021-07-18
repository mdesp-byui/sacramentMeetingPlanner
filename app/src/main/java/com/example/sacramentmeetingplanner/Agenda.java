package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Agenda extends AppCompatActivity {
    TextView agenda, inputDate, textName,presiding,conducting,visitors, textHymn, invocation,ordinances;
    EditText date,textName2, textName3, textName4, textName5, hymnNumber;
    Button announcements,buttonWard, buttonStake,sacrament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        agenda = findViewById(R.id.agenda);
        inputDate = findViewById(R.id.inputDate);
        textName = findViewById(R.id.textName);
        date = findViewById(R.id.date);
        presiding = findViewById(R.id.presiding);
        conducting = findViewById((R.id.conducting));
        visitors = findViewById(R.id.visitors);
        textHymn = findViewById(R.id.textHymn);
        invocation = findViewById(R.id.invocation);
        ordinances = findViewById(R.id.ordinances);
        date = findViewById(R.id.date);
        textName2 = findViewById(R.id.textName2);
        textName3 = findViewById(R.id.textName3);
        textName4 = findViewById(R.id.textName4);
        textName5 = findViewById(R.id.textName5);
        hymnNumber = findViewById(R.id.hymnNumber);
        announcements = findViewById(R.id.announcements);
        buttonWard = findViewById(R.id.buttonWard);
        buttonStake = findViewById(R.id.buttonStake);
        sacrament = findViewById(R.id.sacrament);

    }

    public void announcements(View view){
        Intent intent = new Intent(Agenda.this, Announcements.class);
        startActivity(intent);
    }

    public void buttonWard(View view){
        Intent intent = new Intent(Agenda.this, WardBusiness.class);
        startActivity(intent);
    }

    public void buttonStake(View view){
        Intent intent = new Intent(Agenda.this, StakeBusiness.class);
        startActivity(intent);
    }

    public void sacrament(View view){
        Intent intent = new Intent(Agenda.this, SacramentProgram.class);
        startActivity(intent);
    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first


    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first


    }
}