package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.cct.internal.f */
public final class C6509f implements C18537d<C6514j> {

    /* renamed from: a */
    public static final C6509f f14425a = new C6509f();

    /* renamed from: b */
    public static final C18536c f14426b = C18536c.m31275a("requestTimeMs");

    /* renamed from: c */
    public static final C18536c f14427c = C18536c.m31275a("requestUptimeMs");

    /* renamed from: d */
    public static final C18536c f14428d = C18536c.m31275a("clientInfo");

    /* renamed from: e */
    public static final C18536c f14429e = C18536c.m31275a("logSource");

    /* renamed from: f */
    public static final C18536c f14430f = C18536c.m31275a("logSourceName");

    /* renamed from: g */
    public static final C18536c f14431g = C18536c.m31275a("logEvent");

    /* renamed from: h */
    public static final C18536c f14432h = C18536c.m31275a("qosTier");

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6514j jVar = (C6514j) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59030c(f14426b, jVar.getRequestTimeMs());
        eVar.mo59030c(f14427c, jVar.getRequestUptimeMs());
        eVar.mo59028a(f14428d, jVar.getClientInfo());
        eVar.mo59028a(f14429e, jVar.getLogSource());
        eVar.mo59028a(f14430f, jVar.getLogSourceName());
        eVar.mo59028a(f14431g, jVar.getLogEvents());
        eVar.mo59028a(f14432h, jVar.getQosTier());
    }
}
