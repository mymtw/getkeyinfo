package com.etsy.android.config.flags.events;

import com.etsy.android.config.flags.p073ui.C6400a;
import com.etsy.android.config.flags.p073ui.search.C6407a;
import com.etsy.android.config.flags.p073ui.search.C6410c;
import com.etsy.android.config.flags.p073ui.search.C6413e;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6418b;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6422b;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6425d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.e */
public final class C6358e {

    /* renamed from: a */
    public final C6363j f14155a;

    /* renamed from: b */
    public final C6418b f14156b;

    /* renamed from: c */
    public final C6422b f14157c;

    /* renamed from: d */
    public final C6425d f14158d;

    /* renamed from: e */
    public final C6413e f14159e;

    /* renamed from: f */
    public final C6410c f14160f;

    /* renamed from: g */
    public final C6407a f14161g;

    /* renamed from: h */
    public final C6400a f14162h;

    /* renamed from: i */
    public final C6370q f14163i;

    /* renamed from: j */
    public final C6366m f14164j;

    public C6358e(C6363j jVar, C6418b bVar, C6422b bVar2, C6425d dVar, C6413e eVar, C6410c cVar, C6407a aVar, C6400a aVar2, C6370q qVar, C6366m mVar) {
        C19383o.m32797g(jVar, "loadConfigFlagsHandler");
        C19383o.m32797g(bVar, "switchConfigFlagClickedHandler");
        C19383o.m32797g(bVar2, "textConfigFlagClickedHandler");
        C19383o.m32797g(dVar, "textConfigFlagValueChangedHandler");
        C19383o.m32797g(eVar, "queryTextSubmittedHandler");
        C19383o.m32797g(cVar, "filterConfigFlagsHandler");
        C19383o.m32797g(aVar, "clearSearchHandler");
        C19383o.m32797g(aVar2, "backArrowPressedHandler");
        C19383o.m32797g(qVar, "setOverrideFromConfigsMenuHandler");
        C19383o.m32797g(mVar, "logGrafanaEventsHandler");
        this.f14155a = jVar;
        this.f14156b = bVar;
        this.f14157c = bVar2;
        this.f14158d = dVar;
        this.f14159e = eVar;
        this.f14160f = cVar;
        this.f14161g = aVar;
        this.f14162h = aVar2;
        this.f14163i = qVar;
        this.f14164j = mVar;
    }
}
