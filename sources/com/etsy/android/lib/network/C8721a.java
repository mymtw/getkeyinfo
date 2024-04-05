package com.etsy.android.lib.network;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.requests.LocaleMetadata;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p486y9.C13888d;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.a */
public final class C8721a implements C20000q {

    /* renamed from: b */
    public final LocaleMetadata f19169b;

    public C8721a(C8629a aVar, C13888d dVar) {
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(dVar, "currentLocale");
        this.f19169b = new LocaleMetadata(aVar, dVar);
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        if (uVar.f44344d.mo72948a("X-Detected-Locale") != null) {
            return fVar.mo70453a(uVar);
        }
        C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
        aVar2.mo72998a("X-Detected-Locale", this.f19169b.toDetectedLocaleHeaderValue());
        return fVar.mo70453a(aVar2.mo72999b());
    }
}
