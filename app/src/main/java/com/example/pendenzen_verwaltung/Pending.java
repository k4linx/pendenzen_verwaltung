package com.example.pendenzen_verwaltung;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Pending {

    //Autoincrement
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Spalte heisst in der DB account_name
    @ColumnInfo(name="account_name")
    private String pendingTitle;

    //Wenn nicht angegeben, heisst Spalte in der DB wie Variable, d.h. hier firstName.
    private String pendingDescription;

    private String lastName;

    private int pendingImportance;

    private Date pendingDate;

    //@Ignore bedeutet, dass für diese Variable keine Spalte in der DB erzeugt werden soll.
    private Bitmap image;

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

    public Date getPendingDate() {
        return pendingDate;
    }

    public void setPendingDate(Date pendingDate) {
        this.pendingDate = pendingDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}