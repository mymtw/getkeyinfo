package com.paypal.authcore.authentication;

import android.content.Context;
import android.util.Log;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17150c;
import com.paypal.openid.C17156f;
import p668ro.C18504c;

/* renamed from: com.paypal.authcore.authentication.j */
public final class C17141j implements C17150c.C17151a {

    /* renamed from: a */
    public final /* synthetic */ Context f37511a;

    /* renamed from: b */
    public final /* synthetic */ C17142k f37512b;

    public C17141j(C17142k kVar, Context context) {
        this.f37512b = kVar;
        this.f37511a = context;
    }

    /* renamed from: a */
    public final void mo61660a(C17156f fVar, AuthorizationException authorizationException) {
        C17131a aVar = this.f37512b.f37513a;
        if (fVar != null) {
            aVar.mo61652e(fVar, authorizationException);
            C18504c.f40748e.mo70010c("refreshToken", fVar.f37617f);
            String str = fVar.f37619h;
            if (str != null) {
                C18504c.f40748e.mo70010c("riskVisitorId", str);
            }
            C17142k kVar = this.f37512b;
            Context context = this.f37511a;
            kVar.getClass();
            C17142k.m28584a(context, true);
            return;
        }
        aVar.mo61652e(fVar, authorizationException);
        C17142k kVar2 = this.f37512b;
        Context context2 = this.f37511a;
        kVar2.getClass();
        C17142k.m28584a(context2, false);
        Log.d("TokenService", "Token response is null. Authorization exception " + authorizationException.errorDescription);
    }
}
