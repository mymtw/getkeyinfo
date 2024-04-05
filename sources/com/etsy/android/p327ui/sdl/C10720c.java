package com.etsy.android.p327ui.sdl;

import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.p327ui.cart.saved.C9341b;
import com.etsy.android.p327ui.sdl.C10716b;
import com.etsy.android.p327ui.sdl.ServerDrivenActionDelegate;
import com.etsy.android.p327ui.search.C10865h;
import dagger.internal.C17555d;
import p040c9.C4604kc;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p478x9.C13851a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.sdl.c */
public final class C10720c implements C17555d<C10716b.C10718b> {

    /* renamed from: a */
    public final C19011a<ServerDrivenActionDelegate.C10714a> f23645a;

    /* renamed from: b */
    public final C19011a<C8267e> f23646b;

    /* renamed from: c */
    public final C19011a<C12724a> f23647c;

    /* renamed from: d */
    public final C19011a<C12741o> f23648d;

    /* renamed from: e */
    public final C19011a<C13851a> f23649e;

    /* renamed from: f */
    public final C19011a<C10865h> f23650f;

    public C10720c(C19011a aVar, C19011a aVar2, C19011a aVar3, C4604kc kcVar, C9341b bVar, C6419c cVar) {
        this.f23645a = aVar;
        this.f23646b = aVar2;
        this.f23647c = aVar3;
        this.f23648d = kcVar;
        this.f23649e = bVar;
        this.f23650f = cVar;
    }

    public final Object get() {
        return new C10716b.C10718b(this.f23645a.get(), this.f23646b.get(), this.f23647c.get(), this.f23648d.get(), this.f23649e.get(), this.f23650f.get());
    }
}
