package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class ShareVideoContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareVideoContent> {
    public ShareVideoContent createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new ShareVideoContent(parcel);
    }

    public ShareVideoContent[] newArray(int i) {
        return new ShareVideoContent[i];
    }
}
