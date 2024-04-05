package com.appsflyer.internal;

import android.content.SharedPreferences;

/* renamed from: com.appsflyer.internal.ba */
public final class C5033ba implements C5029az {
    private final SharedPreferences AFKeystoreWrapper;

    public C5033ba(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    public final boolean AFInAppEventType(String str) {
        return this.AFKeystoreWrapper.getBoolean(str, false);
    }

    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.edit().putBoolean(str, true).apply();
    }
}
