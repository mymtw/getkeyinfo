package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class AccessToken$Companion$CREATOR$1 implements Parcelable.Creator<AccessToken> {
    public AccessToken createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new AccessToken(parcel);
    }

    public AccessToken[] newArray(int i) {
        return new AccessToken[i];
    }
}
