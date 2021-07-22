package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewSavedAgenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_saved_agenda);
    }
    public void returnToMenu(View view){
        Intent intent = new Intent(ViewSavedAgenda.this, MainActivity.class);
        startActivity(intent);
    }
}