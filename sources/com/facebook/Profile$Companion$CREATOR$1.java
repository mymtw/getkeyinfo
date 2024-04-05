package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Profile$Companion$CREATOR$1 implements Parcelable.Creator<Profile> {
    public Profile createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new Profile(parcel, (DefaultConstructorMarker) null);
    }

    public Profile[] newArray(int i) {
        return new Profile[i];
    }
}
