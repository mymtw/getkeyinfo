package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$handlePushStoryPageClicked$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $deepLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$handlePushStoryPageClicked$1(String str) {
        super(0);
        this.$deepLink = str;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Not handling deep links automatically, skipping deep link handling for '");
        h.append(this.$deepLink);
        h.append('\'');
        return h.toString();
    }
}
