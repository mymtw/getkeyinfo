package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.cct.internal.b */
public final class C6505b implements C18537d<C6503a> {

    /* renamed from: a */
    public static final C6505b f14399a = new C6505b();

    /* renamed from: b */
    public static final C18536c f14400b = C18536c.m31275a("sdkVersion");

    /* renamed from: c */
    public static final C18536c f14401c = C18536c.m31275a("model");

    /* renamed from: d */
    public static final C18536c f14402d = C18536c.m31275a("hardware");

    /* renamed from: e */
    public static final C18536c f14403e = C18536c.m31275a("device");

    /* renamed from: f */
    public static final C18536c f14404f = C18536c.m31275a("product");

    /* renamed from: g */
    public static final C18536c f14405g = C18536c.m31275a("osBuild");

    /* renamed from: h */
    public static final C18536c f14406h = C18536c.m31275a("manufacturer");

    /* renamed from: i */
    public static final C18536c f14407i = C18536c.m31275a("fingerprint");

    /* renamed from: j */
    public static final C18536c f14408j = C18536c.m31275a("locale");

    /* renamed from: k */
    public static final C18536c f14409k = C18536c.m31275a("country");

    /* renamed from: l */
    public static final C18536c f14410l = C18536c.m31275a("mccMnc");

    /* renamed from: m */
    public static final C18536c f14411m = C18536c.m31275a("applicationBuild");

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6503a aVar = (C6503a) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59028a(f14400b, aVar.getSdkVersion());
        eVar.mo59028a(f14401c, aVar.getModel());
        eVar.mo59028a(f14402d, aVar.getHardware());
        eVar.mo59028a(f14403e, aVar.getDevice());
        eVar.mo59028a(f14404f, aVar.getProduct());
        eVar.mo59028a(f14405g, aVar.getOsBuild());
        eVar.mo59028a(f14406h, aVar.getManufacturer());
        eVar.mo59028a(f14407i, aVar.getFingerprint());
        eVar.mo59028a(f14408j, aVar.getLocale());
        eVar.mo59028a(f14409k, aVar.getCountry());
        eVar.mo59028a(f14410l, aVar.getMccMnc());
        eVar.mo59028a(f14411m, aVar.getApplicationBuild());
    }
}
