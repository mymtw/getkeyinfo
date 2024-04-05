package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class GetTokenLoginMethodHandler$Companion$CREATOR$1 implements Parcelable.Creator<GetTokenLoginMethodHandler> {
    public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new GetTokenLoginMethodHandler(parcel);
    }

    public GetTokenLoginMethodHandler[] newArray(int i) {
        return new GetTokenLoginMethodHandler[i];
    }
}
