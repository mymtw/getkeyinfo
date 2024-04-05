package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class ShareOpenGraphObject$Companion$CREATOR$1 implements Parcelable.Creator<ShareOpenGraphObject> {
    public ShareOpenGraphObject createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new ShareOpenGraphObject(parcel);
    }

    public ShareOpenGraphObject[] newArray(int i) {
        return new ShareOpenGraphObject[i];
    }
}
