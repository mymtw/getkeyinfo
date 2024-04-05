package com.etsy.android.lib.persistviewed;

import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19206h;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p346fa.C12703a;
import p456ua.C13461f;

public final class PersistViewedBus {

    /* renamed from: a */
    public final C8822d f19374a;

    /* renamed from: b */
    public final C13461f f19375b;

    /* renamed from: c */
    public final C12703a f19376c;

    /* renamed from: d */
    public final C8890e0 f19377d;

    /* renamed from: e */
    public final PublishSubject<Long> f19378e = new PublishSubject<>();

    public PersistViewedBus(C8822d dVar, C13461f fVar, C12703a aVar, C8890e0 e0Var) {
        C19383o.m32797g(dVar, "persistViewedDao");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(e0Var, "systemTime");
        this.f19374a = dVar;
        this.f19375b = fVar;
        this.f19376c = aVar;
        this.f19377d = e0Var;
    }

    /* renamed from: a */
    public final void mo30135a() {
        C19206h hVar = new C19206h(new C8820b(this));
        this.f19375b.getClass();
        SubscribersKt.m32500e(hVar.mo20660i(C13461f.m21235b()), new PersistViewedBus$deleteAll$2(this), SubscribersKt.f43062a);
    }

    /* renamed from: b */
    public final void mo30136b(long j) {
        this.f19377d.getClass();
        C19206h hVar = new C19206h(new C8819a(this, j, System.currentTimeMillis()));
        this.f19375b.getClass();
        SubscribersKt.m32500e(hVar.mo20660i(C13461f.m21235b()), new PersistViewedBus$insert$2(this), SubscribersKt.f43062a);
    }
}
