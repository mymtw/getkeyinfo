package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $deepLink;
    public final /* synthetic */ boolean $useWebView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1(String str, boolean z) {
        super(0);
        this.$deepLink = str;
        this.$useWebView = z;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Found a deep link: ");
        h.append(this.$deepLink);
        h.append(". Use webview set to: ");
        h.append(this.$useWebView);
        return h.toString();
    }
}
