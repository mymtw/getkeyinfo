package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.o2 */
public final class C5817o2 implements C5748g1.C5749a {

    /* renamed from: b */
    public ArrayList f12438b;

    /* renamed from: c */
    public long f12439c;

    /* renamed from: d */
    public String f12440d;

    /* renamed from: e */
    public ThreadType f12441e;

    /* renamed from: f */
    public final boolean f12442f;

    /* renamed from: g */
    public String f12443g;

    public C5817o2(long j, String str, ThreadType threadType, boolean z, String str2, C5776j2 j2Var) {
        C19383o.m32798h(str, "name");
        C19383o.m32798h(threadType, "type");
        C19383o.m32798h(str2, "state");
        this.f12439c = j;
        this.f12440d = str;
        this.f12441e = threadType;
        this.f12442f = z;
        this.f12443g = str2;
        this.f12438b = C19327t.m32661q1(j2Var.f12370b);
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B("id");
        g1Var.mo16531n(this.f12439c);
        g1Var.mo16514B("name");
        g1Var.mo16530k(this.f12440d);
        g1Var.mo16514B("type");
        g1Var.mo16530k(this.f12441e.getDesc$bugsnag_android_core_release());
        g1Var.mo16514B("state");
        g1Var.mo16530k(this.f12443g);
        g1Var.mo16514B("stacktrace");
        g1Var.mo16520b();
        Iterator it = this.f12438b.iterator();
        while (it.hasNext()) {
            g1Var.mo16516M((C5759i2) it.next(), false);
        }
        g1Var.mo16524f();
        if (this.f12442f) {
            g1Var.mo16514B("errorReportingThread");
            g1Var.mo16534u(true);
        }
        g1Var.mo16526g();
    }
}
