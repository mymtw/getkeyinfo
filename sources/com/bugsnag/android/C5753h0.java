package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.h0 */
public class C5753h0 implements C5748g1.C5749a {

    /* renamed from: b */
    public String f12267b;

    /* renamed from: c */
    public String f12268c;

    /* renamed from: d */
    public String f12269d = "android";

    /* renamed from: e */
    public String f12270e;

    /* renamed from: f */
    public LinkedHashMap f12271f;

    /* renamed from: g */
    public String[] f12272g;

    /* renamed from: h */
    public Boolean f12273h;

    /* renamed from: i */
    public String f12274i;

    /* renamed from: j */
    public String f12275j;

    /* renamed from: k */
    public Long f12276k;

    public C5753h0(C5757i0 i0Var, String[] strArr, Boolean bool, String str, String str2, Long l, LinkedHashMap linkedHashMap) {
        C19383o.m32798h(i0Var, "buildInfo");
        this.f12272g = strArr;
        this.f12273h = bool;
        this.f12274i = str;
        this.f12275j = str2;
        this.f12276k = l;
        this.f12267b = i0Var.f12285a;
        this.f12268c = i0Var.f12286b;
        this.f12270e = i0Var.f12287c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        this.f12271f = linkedHashMap2;
    }

    /* renamed from: a */
    public void mo16518a(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16514B("cpuAbi");
        g1Var.mo16516M(this.f12272g, false);
        g1Var.mo16514B("jailbroken");
        g1Var.mo16532r(this.f12273h);
        g1Var.mo16514B("id");
        g1Var.mo16530k(this.f12274i);
        g1Var.mo16514B("locale");
        g1Var.mo16530k(this.f12275j);
        g1Var.mo16514B("manufacturer");
        g1Var.mo16530k(this.f12267b);
        g1Var.mo16514B("model");
        g1Var.mo16530k(this.f12268c);
        g1Var.mo16514B("osName");
        g1Var.mo16530k(this.f12269d);
        g1Var.mo16514B("osVersion");
        g1Var.mo16530k(this.f12270e);
        g1Var.mo16514B("runtimeVersions");
        g1Var.mo16516M(this.f12271f, false);
        g1Var.mo16514B("totalMemory");
        g1Var.mo16533t(this.f12276k);
    }

    public final void toStream(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        mo16518a(g1Var);
        g1Var.mo16526g();
    }
}
