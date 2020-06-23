package com.example.pendenzen_verwaltung;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pending {

    //Autoincrement
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String pendingTitle;

    //Wenn nicht angegeben, heisst Spalte in der DB wie Variable, d.h. hier firstName.
    private String pendingDescription;


    private int pendingImportance;

    private String pendingDate;

    //@Ignore bedeutet, dass für diese Variable keine Spalte in der DB erzeugt werden soll.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPendingTitle() {
        return pendingTitle;
    }

    public void setPendingTitle(String pendingTitle) {
        this.pendingTitle = pendingTitle;
    }

    public String getPendingDescription() {
        return pendingDescription;
    }

    public void setPendingDescription(String pendingDescription) {
        this.pendingDescription = pendingDescription;
    }

    public int getPendingImportance() {
        return pendingImportance;
    }

    public void setPendingImportance(int pendingImportance) {
        this.pendingImportance = pendingImportance;
    }

    public String getPendingDate() {
        return pendingDate;
    }

    public void setPendingDate(String pendingDate) {
        this.pendingDate = pendingDate;
    }
}