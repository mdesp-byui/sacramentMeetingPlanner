/* Stake Business has a field to capture any Stake Business announcements,
    even if it's just saying who will be giving the announcements for the Stake
* */

package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StakeBusiness extends AppCompatActivity {
    TextView textWard;
    EditText editName;
    Button buttonAgenda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stake_business);
        textWard = findViewById(R.id.textWard);
        editName = findViewById(R.id.editName);
        buttonAgenda = findViewById(R.id.buttonAgenda);
    }

    public void buttonAgenda (View view){
        Intent intent = new Intent(StakeBusiness. this, Agenda.class);
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