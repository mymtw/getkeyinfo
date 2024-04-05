package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.c */
public class C5724c implements C5748g1.C5749a {

    /* renamed from: b */
    public String f12165b;

    /* renamed from: c */
    public String f12166c;

    /* renamed from: d */
    public String f12167d;

    /* renamed from: e */
    public String f12168e;

    /* renamed from: f */
    public String f12169f;

    /* renamed from: g */
    public String f12170g;

    /* renamed from: h */
    public String f12171h;

    /* renamed from: i */
    public Number f12172i;

    public C5724c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.f12165b = str;
        this.f12166c = str2;
        this.f12167d = str3;
        this.f12168e = str4;
        this.f12169f = str5;
        this.f12170g = str6;
        this.f12171h = str7;
        this.f12172i = num;
    }

    /* renamed from: a */
    public void mo16484a(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16514B("binaryArch");
        g1Var.mo16530k(this.f12165b);
        g1Var.mo16514B("buildUUID");
        g1Var.mo16530k(this.f12170g);
        g1Var.mo16514B("codeBundleId");
        g1Var.mo16530k(this.f12169f);
        g1Var.mo16514B("id");
        g1Var.mo16530k(this.f12166c);
        g1Var.mo16514B("releaseStage");
        g1Var.mo16530k(this.f12167d);
        g1Var.mo16514B("type");
        g1Var.mo16530k(this.f12171h);
        g1Var.mo16514B(ResponseConstants.VERSION);
        g1Var.mo16530k(this.f12168e);
        g1Var.mo16514B("versionCode");
        g1Var.mo16533t(this.f12172i);
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        mo16484a(g1Var);
        g1Var.mo16526g();
    }
}
