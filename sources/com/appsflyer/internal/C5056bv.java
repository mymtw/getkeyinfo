package com.appsflyer.internal;

import android.content.Context;

/* renamed from: com.appsflyer.internal.bv */
public abstract class C5056bv extends C5089f {
    public boolean onAppOpenAttribution;
    private final boolean onAppOpenAttributionNative;
    private final boolean onDeepLinkingNative;

    public C5056bv() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Context) null);
    }

    public final String AFLogger$LogLevel() {
        return C5100n.AFKeystoreWrapper(AFKeystoreWrapper()).toString();
    }

    public final boolean AFVersionDeclaration() {
        return this.onAppOpenAttribution;
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onDeepLinkingNative;
    }

    public final boolean getLevel() {
        return this.onAppOpenAttributionNative;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5056bv(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        boolean z = true;
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        this.onAppOpenAttributionNative = bool2 != null ? bool2.booleanValue() : z;
    }
}
