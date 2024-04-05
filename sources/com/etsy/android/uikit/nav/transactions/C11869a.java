package com.etsy.android.uikit.nav.transactions;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.nav.transactions.a */
public final class C11869a {

    /* renamed from: a */
    public final LinkedHashMap f26406a = new LinkedHashMap();

    /* renamed from: a */
    public final boolean mo38344a(String str) {
        return this.f26406a.containsKey(str);
    }

    /* renamed from: b */
    public final Object mo38345b(String str) {
        C19383o.m32797g(str, "key");
        return this.f26406a.get(str);
    }

    /* renamed from: c */
    public final boolean mo38346c(String str, boolean z) {
        Object obj = this.f26406a.get(str);
        if (obj == null) {
            obj = Boolean.valueOf(z);
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: d */
    public final int mo38347d(String str, int i) {
        Object obj = this.f26406a.get(str);
        if (obj == null) {
            obj = Integer.valueOf(i);
        }
        return ((Integer) obj).intValue();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String, code=java.lang.Object, for r3v0, types: [java.lang.String] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo38348e(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            java.util.LinkedHashMap r0 = r1.f26406a
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r3 = r2
        L_0x000a:
            java.lang.String r3 = (java.lang.String) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.nav.transactions.C11869a.mo38348e(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public final void mo38349f(String str, Object obj) {
        C19383o.m32797g(str, "key");
        this.f26406a.put(str, obj);
    }
}
