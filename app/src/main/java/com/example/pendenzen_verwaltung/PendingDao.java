package com.example.pendenzen_verwaltung;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import ch.nyp.databaseexample.model.User;

@Dao
public interface PendingDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("DELETE FROM user")
    void deleteAll();

    @Insert
    void insertAll(List<User> users);

    @Query("Select count(*) from user")
    int countUsers();
}