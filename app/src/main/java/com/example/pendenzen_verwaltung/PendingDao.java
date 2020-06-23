package com.example.pendenzen_verwaltung;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PendingDao {
    @Query("SELECT * FROM pending")
    List<Pending> getAll();

    @Query("DELETE FROM pending")
    void deleteAll();

    @Insert
    void insertAll(List<Pending> users);

    @Query("Select count(*) from pending")
    int countUsers();
}