package com.facebook.login;

import com.etsy.android.lib.models.ShopRelatedLink;
import kotlin.jvm.internal.C19383o;

public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM(ShopRelatedLink.INSTAGRAM_TITLE);
    
    public static final C12303a Companion = null;
    private final String targetApp;

    /* renamed from: com.facebook.login.LoginTargetApp$a */
    public static final class C12303a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C12303a();
    }

    private LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        Companion.getClass();
        for (LoginTargetApp loginTargetApp : values()) {
            if (C19383o.m32792b(loginTargetApp.toString(), str)) {
                return loginTargetApp;
            }
        }
        return FACEBOOK;
    }

    public String toString() {
        return this.targetApp;
    }
}
