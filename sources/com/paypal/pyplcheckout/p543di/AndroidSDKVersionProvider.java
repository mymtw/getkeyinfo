package com.paypal.pyplcheckout.p543di;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.di.AndroidSDKVersionProvider */
public final class AndroidSDKVersionProvider {
    private final int version;

    public AndroidSDKVersionProvider() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public AndroidSDKVersionProvider(int i) {
        this.version = i;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSDKVersionProvider(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
    }
}
