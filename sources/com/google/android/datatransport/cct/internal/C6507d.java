package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.cct.internal.d */
public final class C6507d implements C18537d<ClientInfo> {

    /* renamed from: a */
    public static final C6507d f14414a = new C6507d();

    /* renamed from: b */
    public static final C18536c f14415b = C18536c.m31275a("clientType");

    /* renamed from: c */
    public static final C18536c f14416c = C18536c.m31275a("androidClientInfo");

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        ClientInfo clientInfo = (ClientInfo) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59028a(f14415b, clientInfo.getClientType());
        eVar.mo59028a(f14416c, clientInfo.getAndroidClientInfo());
    }
}
