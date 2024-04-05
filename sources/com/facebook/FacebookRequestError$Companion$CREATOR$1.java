package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FacebookRequestError$Companion$CREATOR$1 implements Parcelable.Creator<FacebookRequestError> {
    public FacebookRequestError createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
    }

    public FacebookRequestError[] newArray(int i) {
        return new FacebookRequestError[i];
    }
}
