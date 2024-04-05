package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class KatanaProxyLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
    public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new KatanaProxyLoginMethodHandler(parcel);
    }

    public KatanaProxyLoginMethodHandler[] newArray(int i) {
        return new KatanaProxyLoginMethodHandler[i];
    }
}
