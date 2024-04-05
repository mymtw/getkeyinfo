package com.etsy.android.util;

import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.elk.uploading.C8680a;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.logger.elk.uploading.C8689j;
import com.etsy.android.push.C8940c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19721f;
import p001a0.C0005b;
import p334da.C12630a;
import p334da.C12633d;
import p334da.C12639h;
import p425q9.C13267q;

/* renamed from: com.etsy.android.util.s */
public final class C12062s {

    /* renamed from: a */
    public final C8674c f26890a;

    /* renamed from: b */
    public final C13267q f26891b;

    /* renamed from: c */
    public final C8940c f26892c;

    /* renamed from: d */
    public final C12633d f26893d;

    /* renamed from: e */
    public final C12630a f26894e;

    /* renamed from: f */
    public final C12639h f26895f;

    /* renamed from: g */
    public final C8680a f26896g;

    /* renamed from: h */
    public final C8689j f26897h;

    /* renamed from: i */
    public final C8687h f26898i;

    /* renamed from: j */
    public boolean f26899j;

    /* renamed from: k */
    public boolean f26900k;

    /* renamed from: l */
    public final C19721f f26901l = C19697g.m33463a(C0005b.m44j().plus(C19760n0.f43720b));

    public C12062s(C8674c cVar, C13267q qVar, C8940c cVar2, C12633d dVar, C12630a aVar, C12639h hVar, C8680a aVar2, C8689j jVar, C8687h hVar2) {
        C19383o.m32797g(cVar, "appsAnalyticsTracker");
        C19383o.m32797g(qVar, "sessionTimeManager");
        C19383o.m32797g(cVar2, "notificationEventTracker");
        C19383o.m32797g(dVar, "analyticsForegroundUploader");
        C19383o.m32797g(aVar, "analyticsBacklogWatcher");
        C19383o.m32797g(hVar, "analyticsUploader");
        C19383o.m32797g(aVar2, "elkBacklogWatcher");
        C19383o.m32797g(jVar, "elkLogsForegroundUploader");
        C19383o.m32797g(hVar2, "elkLogUploader");
        this.f26890a = cVar;
        this.f26891b = qVar;
        this.f26892c = cVar2;
        this.f26893d = dVar;
        this.f26894e = aVar;
        this.f26895f = hVar;
        this.f26896g = aVar2;
        this.f26897h = jVar;
        this.f26898i = hVar2;
    }
}
