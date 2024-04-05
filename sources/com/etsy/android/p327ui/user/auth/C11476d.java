package com.etsy.android.p327ui.user.auth;

import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.user.auth.C11481i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;

/* renamed from: com.etsy.android.ui.user.auth.d */
public final class C11476d implements C12729e {

    /* renamed from: a */
    public final C11484j f25327a;

    public C11476d(C11484j jVar) {
        C19383o.m32797g(jVar, "signInEventManager");
        this.f25327a = jVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C11484j jVar = this.f25327a;
        C11487l lVar = new C11487l((String) null, (String) null, 3);
        jVar.getClass();
        jVar.f25334a.onNext(new C11481i.C11483b(lVar));
        return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, false, 4, (DefaultConstructorMarker) null));
    }
}
