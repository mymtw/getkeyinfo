package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

@Deprecated
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, C12400b> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new C12399a();
    private final ShareMessengerGenericTemplateElement genericTemplateElement;
    private final ImageAspectRatio imageAspectRatio;
    private final boolean isSharable;

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    public static class C12399a implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$b */
    public static class C12400b extends ShareContent.C12390a<ShareMessengerGenericTemplateContent, C12400b> {
    }

    public ShareMessengerGenericTemplateContent(C12400b bVar) {
        super(bVar);
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public ShareMessengerGenericTemplateElement getGenericTemplateElement() {
        return this.genericTemplateElement;
    }

    public ImageAspectRatio getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    public boolean getIsSharable() {
        return this.isSharable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.isSharable ? (byte) 1 : 0);
        parcel.writeSerializable(this.imageAspectRatio);
        parcel.writeParcelable(this.genericTemplateElement, i);
    }

    public ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.isSharable = parcel.readByte() != 0;
        this.imageAspectRatio = (ImageAspectRatio) parcel.readSerializable();
        this.genericTemplateElement = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }
}
