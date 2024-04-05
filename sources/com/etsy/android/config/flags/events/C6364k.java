package com.etsy.android.config.flags.events;

import com.etsy.android.config.flags.C6343a;
import com.etsy.android.config.flags.C6377g;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.p327ui.favorites.C9792b;
import com.etsy.android.p327ui.favorites.C9833d;
import com.etsy.android.p327ui.favorites.C9859l;
import com.etsy.android.p327ui.favorites.C9862n;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p409o9.C13124e;
import p425q9.C13265p;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.events.k */
public final class C6364k implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14183a;

    /* renamed from: b */
    public final C19011a f14184b;

    /* renamed from: c */
    public final C19011a f14185c;

    /* renamed from: d */
    public final C19011a f14186d;

    /* renamed from: e */
    public final C19011a f14187e;

    /* renamed from: f */
    public final C19011a f14188f;

    public /* synthetic */ C6364k(C19011a aVar, C17553b bVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, int i) {
        this.f14183a = i;
        this.f14184b = aVar;
        this.f14185c = bVar;
        this.f14186d = aVar2;
        this.f14187e = aVar3;
        this.f14188f = aVar4;
    }

    public final Object get() {
        switch (this.f14183a) {
            case 0:
                return new C6363j((C6377g) this.f14184b.get(), (C8591a) this.f14185c.get(), (C13124e) this.f14186d.get(), (C6343a) this.f14187e.get(), (ConfigFlagsEventDispatcher) this.f14188f.get());
            default:
                return new C9862n((C12741o) this.f14184b.get(), (C13265p) this.f14185c.get(), (C9859l) this.f14186d.get(), (C9833d) this.f14187e.get(), (C9792b) this.f14188f.get());
        }
    }
}
