package com.etsy.android.lib.push.registration;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.user.C11358a;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12049i;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p425q9.C13265p;
import p456ua.C13461f;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.push.registration.i */
public final class C8836i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19435a;

    /* renamed from: b */
    public final C19011a f19436b;

    /* renamed from: c */
    public final C19011a f19437c;

    /* renamed from: d */
    public final C19011a f19438d;

    /* renamed from: e */
    public final C19011a f19439e;

    /* renamed from: f */
    public final C19011a f19440f;

    public /* synthetic */ C8836i(C19011a aVar, C19011a aVar2, C17555d dVar, C19011a aVar3, C19011a aVar4, int i) {
        this.f19435a = i;
        this.f19436b = aVar;
        this.f19437c = aVar2;
        this.f19438d = dVar;
        this.f19439e = aVar3;
        this.f19440f = aVar4;
    }

    public final Object get() {
        switch (this.f19435a) {
            case 0:
                return new C8835h((C8838k) this.f19436b.get(), (C8831d) this.f19437c.get(), (C12703a) this.f19438d.get(), (C8694h) this.f19439e.get(), (C13461f) this.f19440f.get());
            default:
                return new C11488b((C13265p) this.f19436b.get(), (C11358a) this.f19437c.get(), (C12049i) this.f19438d.get(), (C11786n) this.f19439e.get(), (C9323l) this.f19440f.get());
        }
    }
}
