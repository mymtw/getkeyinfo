package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class InstagramAppLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
    public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new InstagramAppLoginMethodHandler(parcel);
    }

    public InstagramAppLoginMethodHandler[] newArray(int i) {
        return new InstagramAppLoginMethodHandler[i];
    }
}
