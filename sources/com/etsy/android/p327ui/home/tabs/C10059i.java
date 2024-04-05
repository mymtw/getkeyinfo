package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.ViewPerformanceTracker;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.core.C9622j;
import com.squareup.moshi.C17414y;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4604kc;
import p084d9.C6671a;
import p334da.C12640i;
import p346fa.C12703a;
import p350fe.C12736j;
import p350fe.C12741o;
import p389lc.C13011b;
import p425q9.C13265p;
import p428qc.C13294e;
import p456ua.C13461f;
import p456ua.C13462g;
import p458uc.C13468c;
import p487ya.C13895a;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.home.tabs.i */
public final class C10059i implements C17555d<HomePagerFragment> {

    /* renamed from: a */
    public final C19011a<C12703a> f22159a;

    /* renamed from: b */
    public final C19011a<C13265p> f22160b;

    /* renamed from: c */
    public final C19011a<C8694h> f22161c;

    /* renamed from: d */
    public final C19011a<C6671a> f22162d;

    /* renamed from: e */
    public final C19011a<ViewPerformanceTracker> f22163e;

    /* renamed from: f */
    public final C19011a<C8656o> f22164f;

    /* renamed from: g */
    public final C19011a<C13943a> f22165g;

    /* renamed from: h */
    public final C19011a<C13011b> f22166h;

    /* renamed from: i */
    public final C19011a<C12741o> f22167i;

    /* renamed from: j */
    public final C19011a<C9622j> f22168j;

    /* renamed from: k */
    public final C19011a<C12736j> f22169k;

    /* renamed from: l */
    public final C19011a<C13461f> f22170l;

    /* renamed from: m */
    public final C19011a<C13294e> f22171m;

    /* renamed from: n */
    public final C19011a<C13468c> f22172n;

    /* renamed from: o */
    public final C19011a<C17414y> f22173o;

    /* renamed from: p */
    public final C19011a<C13895a> f22174p;

    /* renamed from: q */
    public final C19011a<C8886e> f22175q;

    public C10059i(C17553b bVar, C17553b bVar2, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C4604kc kcVar, C12640i iVar, C19011a aVar7, C19011a aVar8, C19011a aVar9, C19011a aVar10, C19011a aVar11, C19011a aVar12) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f22159a = bVar;
        this.f22160b = bVar2;
        this.f22161c = aVar;
        this.f22162d = aVar2;
        this.f22163e = aVar3;
        this.f22164f = aVar4;
        this.f22165g = aVar5;
        this.f22166h = aVar6;
        this.f22167i = kcVar;
        this.f22168j = iVar;
        this.f22169k = aVar7;
        this.f22170l = gVar;
        this.f22171m = aVar8;
        this.f22172n = aVar9;
        this.f22173o = aVar10;
        this.f22174p = aVar11;
        this.f22175q = aVar12;
    }

    public final Object get() {
        HomePagerFragment homePagerFragment = new HomePagerFragment(this.f22159a.get(), this.f22160b.get(), this.f22161c.get(), this.f22162d.get(), this.f22163e.get(), this.f22164f.get(), this.f22165g.get(), this.f22166h.get(), this.f22167i.get(), this.f22168j.get(), this.f22169k.get());
        homePagerFragment.schedulers = this.f22170l.get();
        homePagerFragment.homeScreenEventManager = this.f22171m.get();
        homePagerFragment.purchaseClaimRepository = this.f22172n.get();
        homePagerFragment.moshi = this.f22173o.get();
        homePagerFragment.fileSupport = this.f22174p.get();
        homePagerFragment.cameraHelper = this.f22175q.get();
        return homePagerFragment;
    }
}
