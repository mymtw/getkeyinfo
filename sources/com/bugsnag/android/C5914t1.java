package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.t1 */
public final class C5914t1 implements C5748g1.C5749a {

    /* renamed from: b */
    public List<C5914t1> f12614b;

    /* renamed from: c */
    public String f12615c;

    /* renamed from: d */
    public String f12616d;

    /* renamed from: e */
    public String f12617e;

    public C5914t1() {
        this(0);
    }

    public C5914t1(String str, String str2, String str3) {
        C19383o.m32798h(str, "name");
        C19383o.m32798h(str2, ResponseConstants.VERSION);
        C19383o.m32798h(str3, "url");
        this.f12615c = str;
        this.f12616d = str2;
        this.f12617e = str3;
        this.f12614b = EmptyList.INSTANCE;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B("name");
        g1Var.mo16530k(this.f12615c);
        g1Var.mo16514B(ResponseConstants.VERSION);
        g1Var.mo16530k(this.f12616d);
        g1Var.mo16514B("url");
        g1Var.mo16530k(this.f12617e);
        if (!this.f12614b.isEmpty()) {
            g1Var.mo16514B("dependencies");
            g1Var.mo16520b();
            for (C5914t1 M : this.f12614b) {
                g1Var.mo16516M(M, false);
            }
            g1Var.mo16524f();
        }
        g1Var.mo16526g();
    }

    public /* synthetic */ C5914t1(int i) {
        this("Android Bugsnag Notifier", "5.21.0", "https://bugsnag.com");
    }
}
