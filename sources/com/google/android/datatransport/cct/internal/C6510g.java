package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.cct.internal.g */
public final class C6510g implements C18537d<NetworkConnectionInfo> {

    /* renamed from: a */
    public static final C6510g f14433a = new C6510g();

    /* renamed from: b */
    public static final C18536c f14434b = C18536c.m31275a("networkType");

    /* renamed from: c */
    public static final C18536c f14435c = C18536c.m31275a("mobileSubtype");

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59028a(f14434b, networkConnectionInfo.getNetworkType());
        eVar.mo59028a(f14435c, networkConnectionInfo.getMobileSubtype());
    }
}
