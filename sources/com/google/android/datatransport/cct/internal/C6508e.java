package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.cct.internal.e */
public final class C6508e implements C18537d<C6512i> {

    /* renamed from: a */
    public static final C6508e f14417a = new C6508e();

    /* renamed from: b */
    public static final C18536c f14418b = C18536c.m31275a("eventTimeMs");

    /* renamed from: c */
    public static final C18536c f14419c = C18536c.m31275a("eventCode");

    /* renamed from: d */
    public static final C18536c f14420d = C18536c.m31275a("eventUptimeMs");

    /* renamed from: e */
    public static final C18536c f14421e = C18536c.m31275a("sourceExtension");

    /* renamed from: f */
    public static final C18536c f14422f = C18536c.m31275a("sourceExtensionJsonProto3");

    /* renamed from: g */
    public static final C18536c f14423g = C18536c.m31275a("timezoneOffsetSeconds");

    /* renamed from: h */
    public static final C18536c f14424h = C18536c.m31275a("networkConnectionInfo");

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6512i iVar = (C6512i) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59030c(f14418b, iVar.getEventTimeMs());
        eVar.mo59028a(f14419c, iVar.getEventCode());
        eVar.mo59030c(f14420d, iVar.getEventUptimeMs());
        eVar.mo59028a(f14421e, iVar.getSourceExtension());
        eVar.mo59028a(f14422f, iVar.getSourceExtensionJsonProto3());
        eVar.mo59030c(f14423g, iVar.getTimezoneOffsetSeconds());
        eVar.mo59028a(f14424h, iVar.getNetworkConnectionInfo());
    }
}
