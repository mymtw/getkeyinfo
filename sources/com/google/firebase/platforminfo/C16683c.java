package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.firebase.platforminfo.c */
public abstract class C16683c {
    public static C16683c create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}
