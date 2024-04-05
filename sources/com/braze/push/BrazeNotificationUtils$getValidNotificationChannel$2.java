package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$getValidNotificationChannel$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $channelIdFromExtras;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$getValidNotificationChannel$2(String str) {
        super(0);
        this.$channelIdFromExtras = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$channelIdFromExtras, "Found notification channel in extras with id: ");
    }
}
