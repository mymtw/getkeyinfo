package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, C12397b> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C12396a();
    private final List<ShareMedia> media;

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    public static class C12396a implements Parcelable.Creator<ShareMediaContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMediaContent$b */
    public static class C12397b extends ShareContent.C12390a<ShareMediaContent, C12397b> {
    }

    public /* synthetic */ ShareMediaContent(C12397b bVar, C12396a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public List<ShareMedia> getMedia() {
        return this.media;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.media.toArray(), i);
    }

    private ShareMediaContent(C12397b bVar) {
        super(bVar);
        throw null;
    }

    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.media = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }
}
