package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class ShareFeedContent$Companion$CREATOR$1 implements Parcelable.Creator<ShareFeedContent> {
    public ShareFeedContent createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new ShareFeedContent(parcel);
    }

    public ShareFeedContent[] newArray(int i) {
        return new ShareFeedContent[i];
    }
}
