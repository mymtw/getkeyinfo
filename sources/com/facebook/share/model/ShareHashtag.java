package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C12391a();
    private final String hashtag;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C12391a implements Parcelable.Creator<ShareHashtag> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static class C12392b {

        /* renamed from: a */
        public String f27584a;
    }

    public /* synthetic */ ShareHashtag(C12392b bVar, C12391a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public String getHashtag() {
        return this.hashtag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
    }

    private ShareHashtag(C12392b bVar) {
        this.hashtag = bVar.f27584a;
    }

    public ShareHashtag(Parcel parcel) {
        this.hashtag = parcel.readString();
    }
}
