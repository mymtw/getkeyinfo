package com.braze.push;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setNotificationDurationAlarm$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $durationInMillis;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$setNotificationDurationAlarm$1(int i) {
        super(0);
        this.$durationInMillis = i;
    }

    public final String invoke() {
        return C0071c.m191c(C0072d.m201h("Setting Notification duration alarm for "), this.$durationInMillis, " ms");
    }
}
