package com.example.android.politicalpreparedness.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00a2\u0006\u0002\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/politicalpreparedness/network/models/VoterInfoResponse;", "", "election", "Lcom/example/android/politicalpreparedness/network/models/Election;", "pollingLocations", "", "contests", "state", "", "Lcom/example/android/politicalpreparedness/network/models/State;", "electionElectionOfficials", "Lcom/example/android/politicalpreparedness/network/models/ElectionOfficial;", "(Lcom/example/android/politicalpreparedness/network/models/Election;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getContests", "()Ljava/lang/String;", "getElection", "()Lcom/example/android/politicalpreparedness/network/models/Election;", "getElectionElectionOfficials", "()Ljava/util/List;", "getPollingLocations", "getState", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VoterInfoResponse {
    @org.jetbrains.annotations.NotNull
    private final com.example.android.politicalpreparedness.network.models.Election election = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String pollingLocations = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String contests = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.android.politicalpreparedness.network.models.State> state = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.android.politicalpreparedness.network.models.ElectionOfficial> electionElectionOfficials = null;
    
    public VoterInfoResponse(@org.jetbrains.annotations.NotNull
    com.example.android.politicalpreparedness.network.models.Election election, @org.jetbrains.annotations.Nullable
    java.lang.String pollingLocations, @org.jetbrains.annotations.Nullable
    java.lang.String contests, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.State> state, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.ElectionOfficial> electionElectionOfficials) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.politicalpreparedness.network.models.Election getElection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPollingLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContests() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.ElectionOfficial> getElectionElectionOfficials() {
        return null;
    }
}