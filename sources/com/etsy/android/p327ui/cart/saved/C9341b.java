package com.etsy.android.p327ui.cart.saved;

import com.etsy.android.p327ui.cart.C9323l;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p456ua.C13461f;
import p456ua.C13462g;
import p478x9.C13851a;
import p478x9.C13852b;
import p478x9.C13853c;
import p478x9.C13855d;
import p478x9.C13856e;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.cart.saved.b */
public final class C9341b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f20623a = 1;

    /* renamed from: b */
    public final C19011a f20624b;

    /* renamed from: c */
    public final C19011a f20625c;

    /* renamed from: d */
    public final Object f20626d;

    public C9341b(C0005b bVar) {
        C13856e eVar = C13856e.C13857a.f30483a;
        C13853c cVar = C13853c.C13854a.f30482a;
        this.f20626d = bVar;
        this.f20624b = eVar;
        this.f20625c = cVar;
    }

    public final Object get() {
        switch (this.f20623a) {
            case 0:
                return new C9336a((C13461f) this.f20624b.get(), (C9343d) this.f20625c.get(), (C9323l) ((C19011a) this.f20626d).get());
            default:
                C13855d dVar = (C13855d) this.f20624b.get();
                C13852b bVar = (C13852b) this.f20625c.get();
                ((C0005b) this.f20626d).getClass();
                C19383o.m32797g(dVar, "deepLinkSchemeChecker");
                C19383o.m32797g(bVar, "deepLinkHostChecker");
                return new C13851a(dVar, bVar);
        }
    }

    public C9341b(C9348e eVar, C19011a aVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f20624b = gVar;
        this.f20625c = eVar;
        this.f20626d = aVar;
    }
}
