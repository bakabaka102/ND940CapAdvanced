package com.example.android.politicalpreparedness.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/android/politicalpreparedness/network/models/Office;", "", "name", "", "division", "Lcom/example/android/politicalpreparedness/network/models/Division;", "officials", "", "", "(Ljava/lang/String;Lcom/example/android/politicalpreparedness/network/models/Division;Ljava/util/List;)V", "getDivision", "()Lcom/example/android/politicalpreparedness/network/models/Division;", "getName", "()Ljava/lang/String;", "getOfficials", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "getRepresentatives", "Lcom/example/android/politicalpreparedness/representative/model/Representative;", "Lcom/example/android/politicalpreparedness/network/models/Official;", "hashCode", "toString", "app_debug"})
public final class Office {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.android.politicalpreparedness.network.models.Division division = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> officials = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.politicalpreparedness.network.models.Office copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "divisionId")
    com.example.android.politicalpreparedness.network.models.Division division, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "officialIndices")
    java.util.List<java.lang.Integer> officials) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Office(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "divisionId")
    com.example.android.politicalpreparedness.network.models.Division division, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "officialIndices")
    java.util.List<java.lang.Integer> officials) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.politicalpreparedness.network.models.Division component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.politicalpreparedness.network.models.Division getDivision() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getOfficials() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.android.politicalpreparedness.representative.model.Representative> getRepresentatives(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.android.politicalpreparedness.network.models.Official> officials) {
        return null;
    }
}