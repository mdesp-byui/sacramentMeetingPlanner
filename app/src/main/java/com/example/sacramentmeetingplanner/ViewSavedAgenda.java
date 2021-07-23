/* ViewSavedAgenda is the activity which will let you use a RecyclerView to  view the saved info
* */

package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewSavedAgenda extends AppCompatActivity {

    RecyclerView agendaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_saved_agenda);
        agendaList = findViewById(R.id.agendaViewer);
    }
    public void returnToMenu(View view) {
        Intent intent = new Intent(ViewSavedAgenda.this, MainActivity.class);
        startActivity(intent);
    }

    public void showAgenda(View view) {
        DatabaseHelper dh = new DatabaseHelper(ViewSavedAgenda.this);
        List<AgendaModel> fullAgenda = dh.getFullAgenda();

        myRecyclerAdapter agendaAdapter = new myRecyclerAdapter((ArrayList<AgendaModel>) fullAgenda);
        LinearLayoutManager manager = new GridLayoutManager(this, 2);

        agendaList.setLayoutManager(manager);
        agendaList.setAdapter(agendaAdapter);
    }
}