package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C12422a();
    private final Uri localUrl;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static class C12422a implements Parcelable.Creator<ShareVideo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    public static final class C12423b extends ShareMedia.C12395a<ShareVideo, C12423b> {

        /* renamed from: b */
        public Uri f27591b;
    }

    public /* synthetic */ ShareVideo(C12423b bVar, C12422a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public Uri getLocalUrl() {
        return this.localUrl;
    }

    public ShareMedia.Type getMediaType() {
        return ShareMedia.Type.VIDEO;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.localUrl, 0);
    }

    private ShareVideo(C12423b bVar) {
        super((ShareMedia.C12395a) bVar);
        this.localUrl = bVar.f27591b;
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
