package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class AuthenticationTokenClaims$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationTokenClaims> {
    public AuthenticationTokenClaims createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new AuthenticationTokenClaims(parcel);
    }

    public AuthenticationTokenClaims[] newArray(int i) {
        return new AuthenticationTokenClaims[i];
    }
}
