package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShareFeedContent extends ShareContent<ShareFeedContent, C12345a> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new ShareFeedContent$Companion$CREATOR$1();
    public static final C12346b Companion = new C12346b();
    private final String link;
    private final String linkCaption;
    private final String linkDescription;
    private final String linkName;
    private final String mediaSource;
    private final String picture;
    private final String toId;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    public static final class C12345a extends ShareContent.C12390a<ShareFeedContent, C12345a> {
    }

    /* renamed from: com.facebook.share.internal.ShareFeedContent$b */
    public static final class C12346b {
    }

    public /* synthetic */ ShareFeedContent(C12345a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkCaption() {
        return this.linkCaption;
    }

    public final String getLinkDescription() {
        return this.linkDescription;
    }

    public final String getLinkName() {
        return this.linkName;
    }

    public final String getMediaSource() {
        return this.mediaSource;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getToId() {
        return this.toId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.toId);
        parcel.writeString(this.link);
        parcel.writeString(this.linkName);
        parcel.writeString(this.linkCaption);
        parcel.writeString(this.linkDescription);
        parcel.writeString(this.picture);
        parcel.writeString(this.mediaSource);
    }

    private ShareFeedContent(C12345a aVar) {
        super(aVar);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        C19383o.m32797g(parcel, "parcel");
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }
}
