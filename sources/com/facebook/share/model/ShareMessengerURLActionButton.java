package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMessengerActionButton;

@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C12407a();
    private final Uri fallbackUrl;
    private final boolean isMessengerExtensionURL;
    private final boolean shouldHideWebviewShareButton;
    private final Uri url;
    private final WebviewHeightRatio webviewHeightRatio;

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public static class C12407a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$b */
    public static final class C12408b extends ShareMessengerActionButton.C12398a<ShareMessengerURLActionButton, C12408b> {
    }

    public /* synthetic */ ShareMessengerURLActionButton(C12408b bVar, C12407a aVar) {
        this(bVar);
    }

    public Uri getFallbackUrl() {
        return this.fallbackUrl;
    }

    public boolean getIsMessengerExtensionURL() {
        return this.isMessengerExtensionURL;
    }

    public boolean getShouldHideWebviewShareButton() {
        return this.shouldHideWebviewShareButton;
    }

    public Uri getUrl() {
        return this.url;
    }

    public WebviewHeightRatio getWebviewHeightRatio() {
        return this.webviewHeightRatio;
    }

    private ShareMessengerURLActionButton(C12408b bVar) {
        super((ShareMessengerActionButton.C12398a) bVar);
        throw null;
    }

    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = true;
        this.isMessengerExtensionURL = parcel.readByte() != 0;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (WebviewHeightRatio) parcel.readSerializable();
        this.shouldHideWebviewShareButton = parcel.readByte() == 0 ? false : z;
    }
}
