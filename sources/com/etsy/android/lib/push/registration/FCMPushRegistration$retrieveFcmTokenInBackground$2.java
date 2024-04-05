package com.etsy.android.lib.push.registration;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FCMPushRegistration$retrieveFcmTokenInBackground$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ String $rejectedToken;
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$retrieveFcmTokenInBackground$2(String str, FCMPushRegistration fCMPushRegistration) {
        super(1);
        this.$rejectedToken = str;
        this.this$0 = fCMPushRegistration;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        String str2 = this.$rejectedToken;
        if (str2 == null || !C19383o.m32792b(str2, str)) {
            FCMPushRegistration fCMPushRegistration = this.this$0;
            C19383o.m32796f(str, "fcmToken");
            fCMPushRegistration.mo30212f(str);
            return;
        }
        this.this$0.f19396a.mo21306a("Google gave us the same rejected token again");
        this.this$0.f19400e.mo45474a("notification_token.fcm_gave_prev_rejected_token_again");
    }
}
