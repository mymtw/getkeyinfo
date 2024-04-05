package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, C12412b> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C12411a();
    private final ShareOpenGraphAction action;
    private final String previewPropertyName;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    public static class C12411a implements Parcelable.Creator<ShareOpenGraphContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$b */
    public static final class C12412b extends ShareContent.C12390a<ShareOpenGraphContent, C12412b> {
    }

    public /* synthetic */ ShareOpenGraphContent(C12412b bVar, C12411a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public ShareOpenGraphAction getAction() {
        return this.action;
    }

    public String getPreviewPropertyName() {
        return this.previewPropertyName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, 0);
        parcel.writeString(this.previewPropertyName);
    }

    private ShareOpenGraphContent(C12412b bVar) {
        super(bVar);
        throw null;
    }

    public ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        ShareOpenGraphAction.C12410b bVar = new ShareOpenGraphAction.C12410b();
        ShareOpenGraphAction shareOpenGraphAction = (ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader());
        if (shareOpenGraphAction != null) {
            bVar.f27586a.putAll(shareOpenGraphAction.getBundle());
            bVar.f27586a.putString("og:type", shareOpenGraphAction.getActionType());
        }
        this.action = new ShareOpenGraphAction(bVar, (ShareOpenGraphAction.C12409a) null);
        this.previewPropertyName = parcel.readString();
    }
}
