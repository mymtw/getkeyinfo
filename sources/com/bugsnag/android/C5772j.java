package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.j */
public final class C5772j implements C5748g1.C5749a {

    /* renamed from: b */
    public String f12345b;

    /* renamed from: c */
    public BreadcrumbType f12346c;

    /* renamed from: d */
    public Map<String, Object> f12347d;

    /* renamed from: e */
    public final Date f12348e;

    public C5772j(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date) {
        C19383o.m32798h(str, "message");
        C19383o.m32798h(breadcrumbType, "type");
        C19383o.m32798h(date, ResponseConstants.TIMESTAMP);
        this.f12345b = str;
        this.f12346c = breadcrumbType;
        this.f12347d = map;
        this.f12348e = date;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B(ResponseConstants.TIMESTAMP);
        g1Var.mo16516M(this.f12348e, false);
        g1Var.mo16514B("name");
        g1Var.mo16530k(this.f12345b);
        g1Var.mo16514B("type");
        g1Var.mo16530k(this.f12346c.toString());
        g1Var.mo16514B("metaData");
        g1Var.mo16516M(this.f12347d, true);
        g1Var.mo16526g();
    }
}
