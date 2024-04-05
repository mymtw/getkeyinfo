package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, C12424a> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new ShareVideoContent$Companion$CREATOR$1();
    public static final C12425b Companion = new C12425b();
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C12424a extends ShareContent.C12390a<ShareVideoContent, C12424a> {
    }

    /* renamed from: com.facebook.share.model.ShareVideoContent$b */
    public static final class C12425b {
    }

    public /* synthetic */ ShareVideoContent(C12424a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    public final ShareVideo getVideo() {
        return this.video;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
    }

    private ShareVideoContent(C12424a aVar) {
        super(aVar);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        SharePhoto sharePhoto;
        C19383o.m32797g(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        SharePhoto.C12417b bVar = new SharePhoto.C12417b();
        SharePhoto sharePhoto2 = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        if (sharePhoto2 != null) {
            bVar.f27585a.putAll(sharePhoto2.getParameters());
            bVar.f27587b = sharePhoto2.getBitmap();
            bVar.f27588c = sharePhoto2.getImageUrl();
            bVar.f27589d = sharePhoto2.getUserGenerated();
            bVar.f27590e = sharePhoto2.getCaption();
        }
        if (bVar.f27588c == null && bVar.f27587b == null) {
            sharePhoto = null;
        } else {
            sharePhoto = new SharePhoto(bVar, (SharePhoto.C12416a) null);
        }
        this.previewPhoto = sharePhoto;
        ShareVideo.C12423b bVar2 = new ShareVideo.C12423b();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            bVar2.f27585a.putAll(shareVideo.getParameters());
            bVar2.f27591b = shareVideo.getLocalUrl();
        }
        this.video = new ShareVideo(bVar2, (ShareVideo.C12422a) null);
    }
}
