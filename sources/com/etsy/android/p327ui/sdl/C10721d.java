package com.etsy.android.p327ui.sdl;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.user.C8862a;
import com.etsy.android.p327ui.sdl.ServerDrivenActionDelegate;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.sdl.d */
public final class C10721d implements C17555d<ServerDrivenActionDelegate.C10714a> {

    /* renamed from: a */
    public final C19011a<C10722e> f23651a;

    /* renamed from: b */
    public final C19011a<C13461f> f23652b;

    /* renamed from: c */
    public final C19011a<C8618c> f23653c;

    public C10721d(C8862a aVar, C4591k kVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f23651a = aVar;
        this.f23652b = gVar;
        this.f23653c = kVar;
    }

    public final Object get() {
        return new ServerDrivenActionDelegate.C10714a(this.f23651a.get(), this.f23652b.get(), this.f23653c.get());
    }
}
