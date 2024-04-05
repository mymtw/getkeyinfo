package com.etsy.android.lib.util;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;

/* renamed from: com.etsy.android.lib.util.u */
public final class C8923u {

    /* renamed from: a */
    public final C13888d f19684a;

    /* renamed from: b */
    public final C8618c f19685b;

    public C8923u(C8618c cVar, C13888d dVar) {
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(cVar, "configMap");
        this.f19684a = dVar;
        this.f19685b = cVar;
    }

    /* renamed from: b */
    public static String m17363b(String str) {
        C19383o.m32797g(str, "languageTag");
        if (!C8885d0.m17324h(str) || str.length() <= 2) {
            return str;
        }
        String substring = str.substring(0, 2);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public final boolean mo30498a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return C19318k.m32620l1(this.f19685b.mo21137g(C8592b.f18794h).mo45845l()).contains(this.f19684a.mo46718b().getLanguage()) && (C8885d0.m17324h(str) && C8885d0.m17324h(str2) && !C19383o.m32792b(this.f19684a.mo46718b().getLanguage(), str2));
    }
}
