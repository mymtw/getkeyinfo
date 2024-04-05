package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationActionUtils$addNotificationAction$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $actionType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationActionUtils$addNotificationAction$2(String str) {
        super(0);
        this.$actionType = str;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Adding notification action with type: ");
        h.append(this.$actionType);
        h.append("Setting intent class to notification receiver: ");
        h.append(BrazeNotificationUtils.m11200b());
        return h.toString();
    }
}
