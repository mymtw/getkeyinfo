package com.bugsnag.android;

import java.util.Map;
import kotlin.C19394m;
import p753kq.C19861p;

/* renamed from: com.bugsnag.android.o */
public final class C5814o implements C19861p<String, Map<String, ? extends Object>, C19394m> {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12435b;

    public C5814o(C5917u uVar) {
        this.f12435b = uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        this.f12435b.mo16683b(BreadcrumbType.STATE, (String) obj, (Map) obj2);
        return null;
    }
}
