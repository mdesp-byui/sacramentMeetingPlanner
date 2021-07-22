package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    public void opening(View view){
        Intent intent = new Intent(MainActivity.this, Agenda.class);
        startActivity(intent);
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void viewAgenda(View view){
        Intent intent = new Intent(MainActivity.this, ViewSavedAgenda.class);
        startActivity(intent);
    }

}
