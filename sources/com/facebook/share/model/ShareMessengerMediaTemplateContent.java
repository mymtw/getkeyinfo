package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, C12404b> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new C12403a();
    private final String attachmentId;
    private final ShareMessengerActionButton button;
    private final MediaType mediaType;
    private final Uri mediaUrl;

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    public static class C12403a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$b */
    public static class C12404b extends ShareContent.C12390a<ShareMessengerMediaTemplateContent, C12404b> {
    }

    public /* synthetic */ ShareMessengerMediaTemplateContent(C12404b bVar, C12403a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public String getAttachmentId() {
        return this.attachmentId;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public Uri getMediaUrl() {
        return this.mediaUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mediaType);
        parcel.writeString(this.attachmentId);
        parcel.writeParcelable(this.mediaUrl, i);
        parcel.writeParcelable(this.button, i);
    }

    private ShareMessengerMediaTemplateContent(C12404b bVar) {
        super(bVar);
        throw null;
    }

    public ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.mediaType = (MediaType) parcel.readSerializable();
        this.attachmentId = parcel.readString();
        this.mediaUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }
}
