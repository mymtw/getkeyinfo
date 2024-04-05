package com.etsy.android.lib.push.registration;

import android.content.SharedPreferences;
import com.etsy.android.lib.user.C8864c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

public final class FCMPushRegistration$registerWithEtsy$2 extends Lambda implements C19857l<TokenRegistrationResult, C19394m> {
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$registerWithEtsy$2(FCMPushRegistration fCMPushRegistration) {
        super(1);
        this.this$0 = fCMPushRegistration;
    }

    public final void invoke(TokenRegistrationResult tokenRegistrationResult) {
        if (C18263b.m30837c0(tokenRegistrationResult.f19408a)) {
            this.this$0.mo30213g(tokenRegistrationResult.f19408a);
            return;
        }
        this.this$0.f19400e.mo45475b("notification_token.successful_token_upload", 0.1d);
        FCMPushRegistration fCMPushRegistration = this.this$0;
        fCMPushRegistration.f19407l = true;
        C8864c cVar = fCMPushRegistration.f19405j;
        fCMPushRegistration.f19406k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = cVar.f19584a;
        C19383o.m32796f(sharedPreferences, "preferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.putLong("last-token-reg-success", currentTimeMillis);
        edit.apply();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TokenRegistrationResult) obj);
        return C19394m.f43287a;
    }
}
