package com.facebook.share.model;

import android.os.Parcel;

@Deprecated
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String title;

    /* renamed from: com.facebook.share.model.ShareMessengerActionButton$a */
    public static abstract class C12398a<M extends ShareMessengerActionButton, B extends C12398a> {
    }

    public ShareMessengerActionButton(C12398a aVar) {
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }

    public ShareMessengerActionButton(Parcel parcel) {
        this.title = parcel.readString();
    }
}
