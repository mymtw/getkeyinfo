package com.etsy.android.lib.push.registration;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FCMPushRegistration$registerWithEtsy$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$registerWithEtsy$1(FCMPushRegistration fCMPushRegistration) {
        super(1);
        this.this$0 = fCMPushRegistration;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f19396a.mo21309d("Error uploading token to etsy with FCM", th);
        this.this$0.f19400e.mo45475b("notification_token.token_upload_to_etsy_failure", 0.1d);
    }
}
