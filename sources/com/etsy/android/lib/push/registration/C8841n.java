package com.etsy.android.lib.push.registration;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p409o9.C13138q;
import p456ua.C13461f;

/* renamed from: com.etsy.android.lib.push.registration.n */
public final class C8841n {

    /* renamed from: a */
    public final C8828a f19446a;

    /* renamed from: b */
    public final C12703a f19447b;

    /* renamed from: c */
    public final C8694h f19448c;

    /* renamed from: d */
    public final C13138q f19449d;

    /* renamed from: e */
    public final C13461f f19450e;

    /* renamed from: f */
    public final int f19451f;

    /* renamed from: g */
    public final long f19452g;

    public C8841n(C8828a aVar, C8838k kVar, C12703a aVar2, C8694h hVar, C13138q qVar, C13461f fVar) {
        C19383o.m32797g(aVar, "deviceRegistrationEndpoint");
        C19383o.m32797g(kVar, "pushRegistrationRetry");
        C19383o.m32797g(aVar2, "grafana");
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f19446a = aVar;
        this.f19447b = aVar2;
        this.f19448c = hVar;
        this.f19449d = qVar;
        this.f19450e = fVar;
        this.f19451f = kVar.f19441a.mo21134d(C8592b.C8605m.f18907a);
        this.f19452g = (long) kVar.f19441a.mo21134d(C8592b.C8605m.f18908b);
    }
}
