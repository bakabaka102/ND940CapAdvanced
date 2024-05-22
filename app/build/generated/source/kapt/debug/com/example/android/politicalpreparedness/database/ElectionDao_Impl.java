package com.example.android.politicalpreparedness.database;

import androidx.room.RoomDatabase;
import java.lang.Class;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ElectionDao_Impl implements ElectionDao {
  private final RoomDatabase __db;

  public ElectionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
