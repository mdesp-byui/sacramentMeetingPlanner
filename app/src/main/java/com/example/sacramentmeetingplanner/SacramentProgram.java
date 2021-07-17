package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SacramentProgram extends AppCompatActivity {
    TextView textSacrament,sacramentHymn,speaker,speaker2,musical,speaker3, speaker4, closingHymn,benediction,numberPresent;
    EditText hymnNum,speaker1,textspeaker2,musicalHymn,textSpeaker3,textSpeaker,texthymn,textbenediction, textNumber;
    Button buttonAgenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacrament_program);
        textSacrament = findViewById(R.id.textSacrament);
        sacramentHymn = findViewById(R.id.sacramentHymn);
        speaker = findViewById(R.id.speaker);
        speaker2 = findViewById(R.id.speaker2);
        musical = findViewById(R.id.musical);
        speaker3 = findViewById(R.id.speaker3);
        speaker4 =findViewById(R.id.speaker4);
        closingHymn = findViewById(R.id.closingHymn);
        benediction = findViewById(R.id.benediction);
        numberPresent = findViewById(R.id.numberPresent);
        hymnNum = findViewById(R.id.hymnNumber);
        speaker1 = findViewById(R.id.speaker1);
        textSpeaker = findViewById(R.id.textSpeaker);
        textspeaker2 = findViewById(R.id.textspeaker2);
        musicalHymn = findViewById(R.id.musicalHymn);
        textSpeaker3 = findViewById(R.id.textSpeaker3);
        texthymn = findViewById(R.id.texthymn);
        textbenediction = findViewById(R.id.textbenediction);
        textNumber = findViewById(R.id.textNumber);
        buttonAgenda = findViewById(R.id.buttonAgenda);


    }

    public void buttonAgenda (View view){
        Intent intent = new Intent(SacramentProgram. this, Agenda.class);
        startActivity(intent);
    }
}