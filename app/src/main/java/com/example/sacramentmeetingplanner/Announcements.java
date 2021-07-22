/* Announcements activity is used to input any ward announcements,
   such as FHE or Girl's Camp
 */

package com.example.sacramentmeetingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Announcements extends AppCompatActivity {
    // TextView shows the title announcements:
    TextView textAnnouncements;
    // EditText is for the list of announcements:
    EditText list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get layout:
        setContentView(R.layout.activity_announcements);

        // Get display objects:
        textAnnouncements = findViewById(R.id.textAnnouncements);
        list = findViewById(R.id.textList);

    }

    // This method will return you to the edit agenda activity
    public void returnAgenda (View view){
        Intent intent = new Intent(Announcements.this, Agenda.class);
        startActivity(intent);
    }

    // Function to save announcements to database:
    public void onSave (View view) {
        String content = list.getText().toString();
        if (content != "") {
            // Create the database helper object:
            DatabaseHelper dh = new DatabaseHelper(Announcements.this);

            // Prepare the data for saving:
            // Title is always constant:
            String title = "Announcements";
            // Create the AgendaModel object with the given title and the user-input text:
            AgendaModel announcements = new AgendaModel(title, content);

            // Try to add the data to the database
            Boolean success = dh.addOne(announcements);

            if (success == true) {
                // Display toast to confirm that data has been saved:
                String toast_text = "Saved";
                Toast.makeText(Announcements.this, toast_text, Toast.LENGTH_SHORT).show();
            } else {
                // Display error if success was false:
                String blankError = "Failed to store object";
                Toast.makeText(Announcements.this, blankError, Toast.LENGTH_SHORT).show();
            }

        } else {
            // Display error for empty field:
            String blankError = "Field must not be empty";
            Toast.makeText(Announcements.this, blankError, Toast.LENGTH_SHORT).show();
        }

    }

}