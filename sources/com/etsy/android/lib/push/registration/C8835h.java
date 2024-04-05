package com.etsy.android.lib.push.registration;

import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.lib.push.registration.h */
public final class C8835h {

    /* renamed from: a */
    public final C8838k f19430a;

    /* renamed from: b */
    public final C8831d f19431b;

    /* renamed from: c */
    public final C12703a f19432c;

    /* renamed from: d */
    public final C8694h f19433d;

    /* renamed from: e */
    public final C13461f f19434e;

    public C8835h(C8838k kVar, C8831d dVar, C12703a aVar, C8694h hVar, C13461f fVar) {
        C19383o.m32797g(kVar, "pushRegistrationRetry");
        C19383o.m32797g(dVar, "fcmTokenFlowable");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f19430a = kVar;
        this.f19431b = dVar;
        this.f19432c = aVar;
        this.f19433d = hVar;
        this.f19434e = fVar;
    }
}
