package com.etsy.android.p327ui.user.auth;

import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.user.auth.C11481i;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;

/* renamed from: com.etsy.android.ui.user.auth.c */
public final class C11475c implements C12729e {

    /* renamed from: a */
    public final C11484j f25326a;

    public C11475c(C11484j jVar) {
        C19383o.m32797g(jVar, "signInEventManager");
        this.f25326a = jVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C11484j jVar = this.f25326a;
        C11487l lVar = new C11487l((String) null, fVar.f28049b.toString(), 1);
        jVar.getClass();
        jVar.f25334a.onNext(new C11481i.C11483b(lVar));
        return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, true));
    }
}
