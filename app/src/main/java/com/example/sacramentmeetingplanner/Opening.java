package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opening extends AppCompatActivity {

    TextView agenda, inputDate, textName,opening, welcome,presiding,conducting,visitors, textHymn, invocation,ordinances;
    EditText date,textName1, textName2, textName3, textName4, textName5, hymnNumber;
    Button announcements,buttonWard, buttonStake,sacrament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        agenda = findViewById(R.id.agenda);
        inputDate = findViewById(R.id.inputDate);
        textName = findViewById(R.id.textName);
        date = findViewById(R.id.date);
        opening = findViewById(R.id.opening);
        welcome = findViewById(R.id.welcome);
        presiding = findViewById(R.id.presiding);
        conducting = findViewById((R.id.conducting));
        visitors = findViewById(R.id.visitors);
        textHymn = findViewById(R.id.textHymn);
        invocation = findViewById(R.id.invocation);
        ordinances = findViewById(R.id.ordinances);
        date = findViewById(R.id.date);
        textName1 = findViewById(R.id.textName1);
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
}