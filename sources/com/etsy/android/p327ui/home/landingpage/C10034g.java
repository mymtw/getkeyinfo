package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.g */
public final class C10034g {

    /* renamed from: a */
    public final String f22085a;

    /* renamed from: b */
    public final Map<String, String> f22086b;

    /* renamed from: c */
    public final Map<String, String> f22087c;

    /* renamed from: d */
    public final Map<String, String> f22088d;

    /* renamed from: e */
    public final int f22089e;

    /* renamed from: f */
    public final Pair<String, File> f22090f;

    public C10034g(String str, HashMap hashMap, Map map, Map map2, int i, Pair pair) {
        C19383o.m32797g(str, "apiUrl");
        this.f22085a = str;
        this.f22086b = hashMap;
        this.f22087c = map;
        this.f22088d = map2;
        this.f22089e = i;
        this.f22090f = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10034g)) {
            return false;
        }
        C10034g gVar = (C10034g) obj;
        return C19383o.m32792b(this.f22085a, gVar.f22085a) && C19383o.m32792b(this.f22086b, gVar.f22086b) && C19383o.m32792b(this.f22087c, gVar.f22087c) && C19383o.m32792b(this.f22088d, gVar.f22088d) && this.f22089e == gVar.f22089e && C19383o.m32792b(this.f22090f, gVar.f22090f);
    }

    public final int hashCode() {
        int hashCode = this.f22085a.hashCode() * 31;
        Map<String, String> map = this.f22086b;
        int i = 0;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f22087c;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f22088d;
        int a = C0069a.m170a(this.f22089e, (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31, 31);
        Pair<String, File> pair = this.f22090f;
        if (pair != null) {
            i = pair.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LandingPageSpecs(apiUrl=");
        h.append(this.f22085a);
        h.append(", params=");
        h.append(this.f22086b);
        h.append(", paginationParams=");
        h.append(this.f22087c);
        h.append(", bodyParams=");
        h.append(this.f22088d);
        h.append(", requestMethod=");
        h.append(this.f22089e);
        h.append(", attachment=");
        h.append(this.f22090f);
        h.append(')');
        return h.toString();
    }
}
