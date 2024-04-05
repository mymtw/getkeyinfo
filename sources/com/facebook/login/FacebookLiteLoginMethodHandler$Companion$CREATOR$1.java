package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class FacebookLiteLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
    public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new FacebookLiteLoginMethodHandler(parcel);
    }

    public FacebookLiteLoginMethodHandler[] newArray(int i) {
        return new FacebookLiteLoginMethodHandler[i];
    }
}
