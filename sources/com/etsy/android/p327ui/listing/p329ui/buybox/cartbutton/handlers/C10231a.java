package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.core.C9700n;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.a */
public final class C10231a {

    /* renamed from: a */
    public final C9700n f22505a;

    public C10231a(C9700n nVar) {
        C19383o.m32797g(nVar, "swankyDispatcher");
        this.f22505a = nVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33615a(C13597g.C13598a aVar) {
        C19383o.m32797g(aVar, "event");
        C9700n nVar = this.f22505a;
        C9613a aVar2 = aVar.f30068a;
        nVar.getClass();
        C19383o.m32797g(aVar2, "event");
        nVar.f21476a.onNext(aVar2);
        return C13574d.C13575a.f29662a;
    }
}
