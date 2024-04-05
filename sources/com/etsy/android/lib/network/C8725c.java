package com.etsy.android.lib.network;

import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.c */
public final class C8725c implements C20000q {

    /* renamed from: b */
    public static AtomicBoolean f19171b = new AtomicBoolean(true);

    public final C20018z intercept(C20000q.C20001a aVar) {
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        uVar.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        aVar2.mo72998a("X-App-In-Background", String.valueOf(f19171b.get()));
        return fVar.mo70453a(aVar2.mo72999b());
    }
}
