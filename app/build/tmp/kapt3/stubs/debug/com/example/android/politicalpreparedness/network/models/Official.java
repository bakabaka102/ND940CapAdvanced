package com.example.android.politicalpreparedness.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005H\u00c6\u0003Js\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/example/android/politicalpreparedness/network/models/Official;", "", "name", "", "address", "", "Lcom/example/android/politicalpreparedness/network/models/Address;", "party", "phones", "urls", "photoUrl", "channels", "Lcom/example/android/politicalpreparedness/network/models/Channel;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Ljava/util/List;", "getChannels", "getName", "()Ljava/lang/String;", "getParty", "getPhones", "getPhotoUrl", "getUrls", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Official {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.android.politicalpreparedness.network.models.Address> address = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String party = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> phones = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> urls = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String photoUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.politicalpreparedness.network.models.Official copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.Address> address, @org.jetbrains.annotations.Nullable
    java.lang.String party, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> phones, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> urls, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels) {
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
    
    public Official(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.Address> address, @org.jetbrains.annotations.Nullable
    java.lang.String party, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> phones, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> urls, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.Address> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.Address> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getParty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getPhones() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.Channel> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.android.politicalpreparedness.network.models.Channel> getChannels() {
        return null;
    }
}