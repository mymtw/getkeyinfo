package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class SharePhotoContent$Companion$CREATOR$1 implements Parcelable.Creator<SharePhotoContent> {
    public SharePhotoContent createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new SharePhotoContent(parcel);
    }

    public SharePhotoContent[] newArray(int i) {
        return new SharePhotoContent[i];
    }
}
