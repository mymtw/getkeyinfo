package com.paypal.authcore.authentication;

import android.content.Intent;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17150c;
import com.paypal.openid.C17153d;
import com.paypal.openid.C17156f;
import p668ro.C18504c;

/* renamed from: com.paypal.authcore.authentication.e */
public final class C17135e implements C17150c.C17151a {

    /* renamed from: a */
    public final /* synthetic */ C17153d f37478a;

    /* renamed from: b */
    public final /* synthetic */ C17136f f37479b;

    public C17135e(C17136f fVar, C17153d dVar) {
        this.f37479b = fVar;
        this.f37478a = dVar;
    }

    /* renamed from: a */
    public final void mo61660a(C17156f fVar, AuthorizationException authorizationException) {
        Class<TokenActivity> cls = TokenActivity.class;
        if (fVar == null) {
            C18504c cVar = C18504c.f40748e;
            cVar.mo70011d();
            cVar.mo70010c("authUrl", this.f37479b.f37484e.f40513c);
            Intent intent = new Intent(this.f37479b.f37487h, cls);
            Intent intent2 = new Intent(this.f37479b.f37487h, cls);
            C17136f fVar2 = this.f37479b;
            String str = fVar2.f37502w;
            fVar2.mo61661a(this.f37478a, intent, intent2);
            return;
        }
        C17136f fVar3 = this.f37479b;
        fVar3.f37495p = "remembered";
        fVar3.f37496q = fVar;
        fVar3.f37485f.completeWithSuccess(fVar);
        String str2 = this.f37479b.f37503x;
    }
}
