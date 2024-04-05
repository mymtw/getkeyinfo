package com.etsy.android.lib.network.oauth2;

import p287xp.C8339g;

/* renamed from: com.etsy.android.lib.network.oauth2.o */
public final /* synthetic */ class C8765o implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19276b;

    /* renamed from: c */
    public final /* synthetic */ Object f19277c;

    public /* synthetic */ C8765o(Object obj, int i) {
        this.f19276b = i;
        this.f19277c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f19276b
            java.lang.String r1 = "it"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "this$0"
            switch(r0) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0035;
                case 2: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x00b4
        L_0x000d:
            java.lang.Object r0 = r6.f19277c
            oc.b r0 = (p412oc.C13150b) r0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            boolean r1 = r7 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0020
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            goto L_0x0021
        L_0x0020:
            r7 = r3
        L_0x0021:
            oc.c$a r1 = new oc.c$a
            if (r7 == 0) goto L_0x002b
            com.squareup.moshi.y r0 = r0.f28923c
            java.lang.String r3 = androidx.compose.foundation.layout.C0761x.m1690R0(r7, r0)
        L_0x002b:
            if (r7 == 0) goto L_0x0031
            int r2 = r7.code()
        L_0x0031:
            r1.<init>(r3, r2, r7)
            return r1
        L_0x0035:
            java.lang.Object r0 = r6.f19277c
            va.e r0 = (p464va.C13552e) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            java.lang.String r1 = "response"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x006f
            va.f$b r0 = new va.f$b
            T r1 = r7.f44615b
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1
            if (r1 == 0) goto L_0x005b
            byte[] r1 = r1.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.cardviewelement.Page> r3 = com.etsy.android.lib.models.cardviewelement.Page.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r3)
        L_0x005b:
            com.etsy.android.lib.models.cardviewelement.Page r3 = (com.etsy.android.lib.models.cardviewelement.Page) r3
            java.lang.Integer r1 = p001a0.C0005b.m46k0(r7)
            if (r1 == 0) goto L_0x0067
            int r2 = r1.intValue()
        L_0x0067:
            java.lang.String r7 = p001a0.C0005b.m48l0(r7)
            r0.<init>(r3, r2, r7)
            goto L_0x008b
        L_0x006f:
            va.f$a r1 = new va.f$a
            com.etsy.android.lib.network.NetworkException r2 = new com.etsy.android.lib.network.NetworkException
            okhttp3.z r3 = r7.f44614a
            int r4 = r3.f44365f
            java.lang.String r3 = r3.f44364e
            java.lang.String r5 = "response.message()"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            r2.<init>(r4, r3)
            com.squareup.moshi.y r0 = r0.f29636c
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1694T0(r7, r0)
            r1.<init>(r2, r7)
            r0 = r1
        L_0x008b:
            return r0
        L_0x008c:
            java.lang.Object r0 = r6.f19277c
            com.etsy.android.lib.network.oauth2.q r0 = (com.etsy.android.lib.network.oauth2.C8767q) r0
            com.etsy.android.lib.network.oauth2.signin.a r7 = (com.etsy.android.lib.network.oauth2.signin.C8772a) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            java.lang.String r1 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            com.etsy.android.lib.network.oauth2.i r1 = r0.f19283d
            com.etsy.android.lib.network.oauth2.ExternalIdentityProvider r2 = com.etsy.android.lib.network.oauth2.ExternalIdentityProvider.FACEBOOK
            java.lang.String r3 = r7.f19308a
            java.lang.String r7 = r7.f19309b
            io.reactivex.internal.operators.single.SingleFlatMap r7 = r1.mo30079a(r2, r3, r7)
            ua.f r0 = r0.f19285f
            r0.getClass()
            tp.r r0 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.single.SingleSubscribeOn r7 = r7.mo20660i(r0)
            return r7
        L_0x00b4:
            java.lang.Object r0 = r6.f19277c
            com.etsy.android.ui.user.help.b r0 = (com.etsy.android.p327ui.user.help.C11529b) r0
            java.util.List r7 = (java.util.List) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            r0.f25432b = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.network.oauth2.C8765o.apply(java.lang.Object):java.lang.Object");
    }
}
