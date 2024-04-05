package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

@Deprecated
public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, C12406b> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new C12405a();
    private final ShareMessengerActionButton button;
    private final Uri url;

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$a */
    public static class C12405a implements Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$b */
    public static class C12406b extends ShareContent.C12390a<ShareMessengerOpenGraphMusicTemplateContent, C12406b> {
    }

    public /* synthetic */ ShareMessengerOpenGraphMusicTemplateContent(C12406b bVar, C12405a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public Uri getUrl() {
        return this.url;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.url, i);
        parcel.writeParcelable(this.button, i);
    }

    private ShareMessengerOpenGraphMusicTemplateContent(C12406b bVar) {
        super(bVar);
        throw null;
    }

    public ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }
}
