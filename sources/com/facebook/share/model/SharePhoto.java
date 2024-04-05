package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C12416a();
    private final Bitmap bitmap;
    private final String caption;
    private final Uri imageUrl;
    private final boolean userGenerated;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static class C12416a implements Parcelable.Creator<SharePhoto> {
        public final Object createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        public final Object[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    public static final class C12417b extends ShareMedia.C12395a<SharePhoto, C12417b> {

        /* renamed from: b */
        public Bitmap f27587b;

        /* renamed from: c */
        public Uri f27588c;

        /* renamed from: d */
        public boolean f27589d;

        /* renamed from: e */
        public String f27590e;
    }

    public /* synthetic */ SharePhoto(C12417b bVar, C12416a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getCaption() {
        return this.caption;
    }

    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public ShareMedia.Type getMediaType() {
        return ShareMedia.Type.PHOTO;
    }

    public boolean getUserGenerated() {
        return this.userGenerated;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : 0);
        parcel.writeString(this.caption);
    }

    private SharePhoto(C12417b bVar) {
        super((ShareMedia.C12395a) bVar);
        this.bitmap = bVar.f27587b;
        this.imageUrl = bVar.f27588c;
        this.userGenerated = bVar.f27589d;
        this.caption = bVar.f27590e;
    }

    public SharePhoto(Parcel parcel) {
        super(parcel);
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
