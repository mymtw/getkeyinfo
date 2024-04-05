package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new C12401a();
    /* access modifiers changed from: private */
    public final ShareMessengerActionButton button;
    /* access modifiers changed from: private */
    public final ShareMessengerActionButton defaultAction;
    /* access modifiers changed from: private */
    public final Uri imageUrl;
    /* access modifiers changed from: private */
    public final String subtitle;
    /* access modifiers changed from: private */
    public final String title;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$a */
    public static class C12401a implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$b */
    public static class C12402b {
    }

    public /* synthetic */ ShareMessengerGenericTemplateElement(C12402b bVar, C12401a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public ShareMessengerActionButton getDefaultAction() {
        return this.defaultAction;
    }

    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.imageUrl, i);
        parcel.writeParcelable(this.defaultAction, i);
        parcel.writeParcelable(this.button, i);
    }

    private ShareMessengerGenericTemplateElement(C12402b bVar) {
        throw null;
    }

    public ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.title = parcel.readString();
        this.subtitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.defaultAction = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }
}
