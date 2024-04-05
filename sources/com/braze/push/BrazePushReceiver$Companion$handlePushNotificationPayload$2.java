package com.braze.push;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $totalDeleted;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePushNotificationPayload$2(int i) {
        super(0);
        this.$totalDeleted = i;
    }

    public final String invoke() {
        return C0071c.m191c(C0072d.m201h("Firebase messaging 'total_deleted' reports "), this.$totalDeleted, " messages.");
    }
}
