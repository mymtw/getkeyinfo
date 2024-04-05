package com.etsy.android.lib.network.oauth2.signin;

import android.content.Intent;
import androidx.activity.result.C0122e;
import kotlin.jvm.internal.C19383o;
import p019b.C3448e;
import p248tp.C8072t;
import p248tp.C8074v;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.b */
public final /* synthetic */ class C8773b implements C8074v {

    /* renamed from: b */
    public final /* synthetic */ C8776e f19310b;

    /* renamed from: c */
    public final /* synthetic */ Intent f19311c;

    public /* synthetic */ C8773b(C8776e eVar, Intent intent) {
        this.f19310b = eVar;
        this.f19311c = intent;
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        C8776e eVar = this.f19310b;
        Intent intent = this.f19311c;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(intent, "$intent");
        C0122e d = eVar.f19316b.mo1161d("EtsySignInHelper#signIn", new C3448e(), new C8774c(tVar, 0));
        d.mo1157b(intent);
        tVar.setCancellable(new C8775d(d));
    }
}
