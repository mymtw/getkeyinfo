package com.bugsnag.android;

import java.util.HashMap;
import kotlin.C19394m;
import p753kq.C19861p;

/* renamed from: com.bugsnag.android.n */
public final class C5810n implements C19861p<Boolean, String, C19394m> {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12426b;

    public C5810n(C5917u uVar) {
        this.f12426b = uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("hasConnection", bool);
        hashMap.put("networkState", (String) obj2);
        this.f12426b.mo16682a(BreadcrumbType.STATE, "Connectivity changed", hashMap);
        if (!bool.booleanValue()) {
            return null;
        }
        this.f12426b.f12633l.mo16695j();
        this.f12426b.f12634m.mo16504b();
        return null;
    }
}
