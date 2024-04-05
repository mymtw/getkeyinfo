package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class AuthenticationToken$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationToken> {
    public AuthenticationToken createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new AuthenticationToken(parcel);
    }

    public AuthenticationToken[] newArray(int i) {
        return new AuthenticationToken[i];
    }
}
