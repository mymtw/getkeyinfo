package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia implements ShareModel {
    private final Bundle params;

    public enum Type {
        PHOTO,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C12395a<M extends ShareMedia, B extends C12395a> {

        /* renamed from: a */
        public Bundle f27585a = new Bundle();
    }

    public ShareMedia(C12395a aVar) {
        this.params = new Bundle(aVar.f27585a);
    }

    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    @Deprecated
    public Bundle getParameters() {
        return new Bundle(this.params);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }

    public ShareMedia(Parcel parcel) {
        this.params = parcel.readBundle();
    }
}
