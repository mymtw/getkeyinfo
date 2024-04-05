package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, C12421b> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C12420a();
    private final String mAttributionLink;
    private final ShareMedia mBackgroundAsset;
    private final List<String> mBackgroundColorList;
    private final SharePhoto mStickerAsset;

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    public static class C12420a implements Parcelable.Creator<ShareStoryContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareStoryContent$b */
    public static final class C12421b extends ShareContent.C12390a<ShareStoryContent, C12421b> {
    }

    public /* synthetic */ ShareStoryContent(C12421b bVar, C12420a aVar) {
        this(bVar);
    }

    private List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public String getAttributionLink() {
        return this.mAttributionLink;
    }

    public ShareMedia getBackgroundAsset() {
        return this.mBackgroundAsset;
    }

    public List<String> getBackgroundColorList() {
        List<String> list = this.mBackgroundColorList;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public SharePhoto getStickerAsset() {
        return this.mStickerAsset;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mBackgroundAsset, 0);
        parcel.writeParcelable(this.mStickerAsset, 0);
        parcel.writeStringList(this.mBackgroundColorList);
        parcel.writeString(this.mAttributionLink);
    }

    private ShareStoryContent(C12421b bVar) {
        super(bVar);
        bVar.getClass();
        this.mBackgroundAsset = null;
        this.mStickerAsset = null;
        this.mBackgroundColorList = null;
        this.mAttributionLink = null;
    }

    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.mBackgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.mStickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.mBackgroundColorList = readUnmodifiableStringList(parcel);
        this.mAttributionLink = parcel.readString();
    }
}
