package com.etsy.android.p327ui.cart.saved;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.cart.saved.C9343d;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.cart.saved.f */
public final class C9349f implements C17555d<C9343d.C9344a> {

    /* renamed from: a */
    public final C19382n f20631a;

    /* renamed from: b */
    public final C19011a<C8731g> f20632b;

    public C9349f(C19382n nVar, C17553b bVar) {
        this.f20631a = nVar;
        this.f20632b = bVar;
    }

    public final Object get() {
        C19382n nVar = this.f20631a;
        C8731g gVar = this.f20632b.get();
        nVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C9343d.C9344a.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        return (C9343d.C9344a) b;
    }
}
