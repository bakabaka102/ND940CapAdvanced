package com.example.android.politicalpreparedness.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.android.politicalpreparedness.database.Converters.class})
@androidx.room.Database(entities = {com.example.android.politicalpreparedness.network.models.Election.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/android/politicalpreparedness/database/ElectionDatabase;", "Landroidx/room/RoomDatabase;", "()V", "electionDao", "Lcom/example/android/politicalpreparedness/database/ElectionDao;", "getElectionDao", "()Lcom/example/android/politicalpreparedness/database/ElectionDao;", "Companion", "app_debug"})
public abstract class ElectionDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.android.politicalpreparedness.database.ElectionDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.android.politicalpreparedness.database.ElectionDatabase INSTANCE;
    
    public ElectionDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.android.politicalpreparedness.database.ElectionDao getElectionDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/android/politicalpreparedness/database/ElectionDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/android/politicalpreparedness/database/ElectionDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.android.politicalpreparedness.database.ElectionDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}