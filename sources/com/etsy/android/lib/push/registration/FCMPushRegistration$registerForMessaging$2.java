package com.etsy.android.lib.push.registration;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FCMPushRegistration$registerForMessaging$2 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$registerForMessaging$2(FCMPushRegistration fCMPushRegistration) {
        super(1);
        this.this$0 = fCMPushRegistration;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        C19383o.m32796f(bool, "result");
        if (bool.booleanValue()) {
            FCMPushRegistration fCMPushRegistration = this.this$0;
            if (fCMPushRegistration.f19397b.mo45856a()) {
                fCMPushRegistration.mo30213g((String) null);
                return;
            }
            fCMPushRegistration.f19396a.mo21312f("No FCM available");
            fCMPushRegistration.f19400e.mo45474a("notification_token.play_services_unavailable");
        }
    }
}
