package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class AuthenticationTokenHeader$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationTokenHeader> {
    public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new AuthenticationTokenHeader(parcel);
    }

    public AuthenticationTokenHeader[] newArray(int i) {
        return new AuthenticationTokenHeader[i];
    }
}
