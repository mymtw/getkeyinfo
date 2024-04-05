package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.home.etsylens.C9973d;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p335db.C12642b;
import p346fa.C12703a;
import p425q9.C13265p;
import p428qc.C13294e;
import p456ua.C13461f;
import p456ua.C13462g;
import p458uc.C13468c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.home.tabs.o */
public final class C10069o implements C17555d<HomePagerViewModel> {

    /* renamed from: a */
    public final C19011a<C13461f> f22188a = C13462g.C13463a.f29482a;

    /* renamed from: b */
    public final C19011a<C10060j> f22189b;

    /* renamed from: c */
    public final C19011a<C10053c> f22190c;

    /* renamed from: d */
    public final C19011a<C12703a> f22191d;

    /* renamed from: e */
    public final C19011a<C13294e> f22192e;

    /* renamed from: f */
    public final C19011a<UserActionBus> f22193f;

    /* renamed from: g */
    public final C19011a<C13265p> f22194g;

    /* renamed from: h */
    public final C19011a<C12642b> f22195h;

    /* renamed from: i */
    public final C19011a<C13468c> f22196i;

    /* renamed from: j */
    public final C19011a<CrashUtil> f22197j;

    /* renamed from: k */
    public final C19011a<C8618c> f22198k;

    /* renamed from: l */
    public final C19011a<C9973d> f22199l;

    public C10069o(C19011a aVar, C19011a aVar2, C17553b bVar, C19011a aVar3, C19011a aVar4, C17553b bVar2, C19011a aVar5, C19011a aVar6, C19011a aVar7, C4591k kVar, C19011a aVar8) {
        this.f22189b = aVar;
        this.f22190c = aVar2;
        this.f22191d = bVar;
        this.f22192e = aVar3;
        this.f22193f = aVar4;
        this.f22194g = bVar2;
        this.f22195h = aVar5;
        this.f22196i = aVar6;
        this.f22197j = aVar7;
        this.f22198k = kVar;
        this.f22199l = aVar8;
    }

    public final Object get() {
        return new HomePagerViewModel(this.f22188a.get(), this.f22189b.get(), this.f22190c.get(), this.f22191d.get(), this.f22192e.get(), this.f22193f.get(), this.f22194g.get(), this.f22195h.get(), this.f22196i.get(), this.f22197j.get(), this.f22198k.get(), this.f22199l.get());
    }
}
