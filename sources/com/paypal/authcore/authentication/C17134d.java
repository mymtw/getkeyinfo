package com.paypal.authcore.authentication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.openid.C17156f;
import p251u1.C8115a;

/* renamed from: com.paypal.authcore.authentication.d */
public final class C17134d extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C17136f f37477a;

    public C17134d(C17136f fVar) {
        this.f37477a = fVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f37477a.getClass();
        if (!(intent == null || intent.getExtras() == null || !intent.getExtras().containsKey("authCancelled"))) {
            this.f37477a.getClass();
        }
        this.f37477a.f37486g = C17131a.m28574b(context);
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("TokenRequestSuccess", false);
        }
        C17156f fVar = this.f37477a.f37486g.mo61649a().f37560e;
        C17136f fVar2 = this.f37477a;
        C17133c cVar = fVar2.f37485f;
        if (cVar != null) {
            if (!z || fVar == null) {
                cVar.completeWithFailure(fVar2.f37486g.mo61649a().f37562g);
                return;
            }
            fVar2.f37495p = "loggedIn";
            fVar2.f37496q = fVar;
            cVar.completeWithSuccess(fVar);
            Intent intent2 = new Intent("accessTokenReceiver");
            intent2.putExtra(UriChallengeConstantKt.ACCESS_TOKEN, fVar.f37614c);
            Long l = fVar.f37615d;
            if (l == null) {
                intent2.putExtra("tokenExpireTime", -1);
            } else {
                intent2.putExtra("tokenExpireTime", l);
            }
            intent2.putExtra("authenticationState", AuthenticationState.LoggedIn);
            C8115a.m16322a(context).mo20709c(intent2);
        }
    }
}
