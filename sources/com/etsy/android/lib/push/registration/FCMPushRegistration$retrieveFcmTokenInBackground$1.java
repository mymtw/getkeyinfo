package com.etsy.android.lib.push.registration;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FCMPushRegistration$retrieveFcmTokenInBackground$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$retrieveFcmTokenInBackground$1(FCMPushRegistration fCMPushRegistration) {
        super(1);
        this.this$0 = fCMPushRegistration;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        CrashUtil.m17307a().mo30458c(new Throwable("Problem receiving FCM token", th), C8592b.C8595c.f18858b);
        this.this$0.f19396a.mo21309d("Error registering with FCM", th);
        this.this$0.f19400e.mo45474a("notification_token.fcm_register_failure");
    }
}
