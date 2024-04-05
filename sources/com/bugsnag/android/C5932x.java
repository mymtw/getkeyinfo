package com.bugsnag.android;

import android.util.Log;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.x */
public final class C5932x {

    /* renamed from: a */
    public final C5925w f12711a;

    public C5932x(String str) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str.length() == 32) {
                int i = 0;
                while (true) {
                    if (i >= 32) {
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (!Character.isDigit(charAt) && (charAt < 'a' || charAt > 'f')) {
                        break;
                    }
                    i++;
                }
            }
            z = true;
            if (z) {
                String str2 = "Invalid configuration. apiKey should be a 32-character hexademical string, got " + str;
                C19383o.m32798h(str2, "msg");
                Log.w("Bugsnag", str2);
            }
            this.f12711a = new C5925w(str);
            return;
        }
        throw new IllegalArgumentException("No Bugsnag API Key set");
    }
}
