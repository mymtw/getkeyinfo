package com.etsy.android.lib.network;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p735br.C18980c;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.b0 */
public final class C8724b0 implements C20000q {

    /* renamed from: b */
    public final C8726c0 f19170b;

    public C8724b0(C8726c0 c0Var) {
        this.f19170b = c0Var;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        Map map;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        if (!this.f19170b.isActive()) {
            return fVar.mo70453a(uVar);
        }
        uVar.getClass();
        new LinkedHashMap();
        String str = uVar.f44343c;
        C20016y yVar = uVar.f44345e;
        LinkedHashMap linkedHashMap = uVar.f44346f.isEmpty() ? new LinkedHashMap() : C19294b0.m32558A0(uVar.f44346f);
        C19994o.C19995a g = uVar.f44344d.mo72952g();
        C19997p.C19998a f = uVar.f44342b.mo72970f();
        f.mo72977c("XDEBUG_SESSION_START", this.f19170b.mo29946a());
        C19997p d = f.mo72978d();
        C19994o d2 = g.mo72961d();
        byte[] bArr = C18980c.f42301a;
        if (linkedHashMap.isEmpty()) {
            map = C19294b0.m32559p0();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            C19383o.m32796f(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return fVar.mo70453a(new C20011u(d, str, d2, yVar, map));
    }
}
