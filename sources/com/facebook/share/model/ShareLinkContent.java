package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C12394b> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C12393a();
    @Deprecated
    private final String contentDescription;
    @Deprecated
    private final String contentTitle;
    @Deprecated
    private final Uri imageUrl;
    private final String quote;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static class C12393a implements Parcelable.Creator<ShareLinkContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareLinkContent$b */
    public static final class C12394b extends ShareContent.C12390a<ShareLinkContent, C12394b> {
    }

    public /* synthetic */ ShareLinkContent(C12394b bVar, C12393a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Deprecated
    public String getContentTitle() {
        return this.contentTitle;
    }

    @Deprecated
    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public String getQuote() {
        return this.quote;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeString(this.quote);
    }

    private ShareLinkContent(C12394b bVar) {
        super(bVar);
        bVar.getClass();
        this.contentDescription = null;
        this.contentTitle = null;
        this.imageUrl = null;
        this.quote = null;
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.quote = parcel.readString();
    }
}
