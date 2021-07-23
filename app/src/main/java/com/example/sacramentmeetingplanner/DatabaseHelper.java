/* The DatabaseHelper is a class to access the SQLite database, so that things can be easily edited
and then closed again to manage resources better
 */

package com.example.sacramentmeetingplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "saved_agenda.db";
    private static final int DATABASE_VERSION = 1;
    public static final String MEETING_TABLE = "MEETING_TABLE";
    public static final String COLUMN_NAME = "COLUMN_NAME";
    public static final String COLUMN_CONTENT = "COLUMN_CONTENT";

    // Constructor for the DatabaseHelper class:
    public DatabaseHelper(Context context) {
        // Call super class and pass values:
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Format the SQL create table statement:
        String createTableStatement = "CREATE TABLE " + MEETING_TABLE +
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT, " +
                COLUMN_CONTENT + " TEXT)";
        // Execute SQL and pass the create table statement string we just made:
        db.execSQL(createTableStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String upgradeTableStatement = "";
        db.execSQL(upgradeTableStatement);
    }

    // Method to retrieve all database entries:
    public List<AgendaModel> getFullAgenda() {
        List<AgendaModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + MEETING_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString, null);
        // Check to make sure that we received a response from the query:
        if (cursor.moveToFirst()) {
            // If results came back, create new AgendaModel objects for each result:
            // Using a do while loop to make sure that it always goes through one loop
            do {
                // get values from each cursor:
                String columnName = cursor.getString(1);
                String columnContent = cursor.getString(2);
                // create the AgendaModel:
                AgendaModel addToAgenda = new AgendaModel(columnName, columnContent);
                // add the AgendaModel to the arraylist:
                returnList.add(addToAgenda);

            } while (cursor.moveToNext()); // Loop while there is still another object to go to
        } else {
            // Query failed
        }
        // Close the cursor and the database:
        cursor.close();
        db.close();
        // Return the finalized list:
        return returnList;
    }

    // Method to add an object to the SQLite table:
    public Boolean addOne(AgendaModel AgendaModel) {

        // Get database:
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a pair with a column name (use constant strings from class), paired with a value
        // the value is taken from the AgendaModel class's ObjectContent
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, AgendaModel.getObjectName());
        cv.put(COLUMN_CONTENT, AgendaModel.getObjectContent());

        // After pairing the values, try to insert the object into the meeting table:
        long insert = db.insert(MEETING_TABLE, null, cv);

        // Since the if statement will end the action, we want to close the db first:
        db.close();

        // If insert returns -1, the insertion failed
        if (insert == -1) {
            // If success:
            // If failed, return false:
            return false;
        } else {
            // Object successfully entered into database, return true
            return true;
        }

    }
}