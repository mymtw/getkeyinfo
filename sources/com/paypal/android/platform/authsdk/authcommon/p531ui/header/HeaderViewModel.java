package com.paypal.android.platform.authsdk.authcommon.p531ui.header;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.header.HeaderViewModel */
public abstract class HeaderViewModel extends C2866i0 {
    private final C2895z<Boolean> displayBackButtonEvent;
    private final C2895z<Boolean> displayCloseButtonEvent;
    private final C2895z<Boolean> displayLogoEvent;

    public HeaderViewModel() {
        Boolean bool = Boolean.TRUE;
        this.displayBackButtonEvent = new C2895z<>(bool);
        this.displayCloseButtonEvent = new C2895z<>(bool);
        this.displayLogoEvent = new C2895z<>(bool);
    }

    public final void displayBackButton$auth_sdk_thirdPartyRelease(boolean z) {
        this.displayBackButtonEvent.setValue(Boolean.valueOf(z));
    }

    public final void displayCloseButton$auth_sdk_thirdPartyRelease(boolean z) {
        this.displayCloseButtonEvent.setValue(Boolean.valueOf(z));
    }

    public final void displayLogo$auth_sdk_thirdPartyRelease(boolean z) {
        this.displayLogoEvent.setValue(Boolean.valueOf(z));
    }

    public final C2895z<Boolean> getDisplayBackButtonEvent() {
        return this.displayBackButtonEvent;
    }

    public final C2895z<Boolean> getDisplayCloseButtonEvent() {
        return this.displayCloseButtonEvent;
    }

    public final C2895z<Boolean> getDisplayLogoEvent() {
        return this.displayLogoEvent;
    }

    public abstract void onBackpress();

    public abstract void onClose();
}
