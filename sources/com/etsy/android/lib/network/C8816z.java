package com.etsy.android.lib.network;

import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p409o9.C13138q;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.z */
public final class C8816z implements C20000q {

    /* renamed from: b */
    public final C13138q f19371b;

    public C8816z(C13138q qVar) {
        this.f19371b = qVar;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        String str;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        uVar.getClass();
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        if (uVar.f44344d.mo72948a("User-agent") == null) {
            C13138q qVar = this.f19371b;
            qVar.getClass();
            String b = qVar.mo45852b(System.getProperty("http.agent"));
            if (b != null) {
                aVar2.mo72998a("User-agent", b);
            }
        }
        if (uVar.f44344d.mo72948a("X-Etsy-Device") == null && (str = this.f19371b.f28895a) != null) {
            aVar2.mo72998a("X-Etsy-Device", str);
        }
        return fVar.mo70453a(aVar2.mo72999b());
    }
}
