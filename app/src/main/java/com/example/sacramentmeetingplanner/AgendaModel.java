/* The AgendaModel class is used to create objects to store in the SQLite database
   String objectName is the static name of the object being stored, i.e. Announcements or
   OpeningHymn
   String objectContent is the user inputted information for the given field
 */

package com.example.sacramentmeetingplanner;

public class AgendaModel {
    private String objectName;
    private String objectContent;

    // Constructors:
    public AgendaModel(String objectName, String objectContent) {
        this.objectName = objectName;
        this.objectContent = objectContent;
    }

    // toString() is necessary for printing the contents of a class object

    @Override
    public String toString() {
        return "AgendaModel{" +
                "objectName='" + objectName + '\'' +
                ", objectContent='" + objectContent + '\'' +
                '}';
    }

    // Getters and setters:

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectContent() {
        return objectContent;
    }

    public void setObjectContent(String objectContent) {
        this.objectContent = objectContent;
    }
}
