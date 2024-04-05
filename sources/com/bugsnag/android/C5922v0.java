package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.v0 */
public final class C5922v0 implements C5748g1.C5749a {

    /* renamed from: b */
    public final C5914t1 f12664b;

    /* renamed from: c */
    public String f12665c;

    /* renamed from: d */
    public final C5908s0 f12666d;

    /* renamed from: e */
    public final File f12667e;

    /* renamed from: f */
    public final C5763c f12668f;

    public C5922v0(String str, C5908s0 s0Var, File file, C5914t1 t1Var, C5763c cVar) {
        C19383o.m32798h(t1Var, "notifier");
        C19383o.m32798h(cVar, "config");
        this.f12665c = str;
        this.f12666d = s0Var;
        this.f12667e = file;
        this.f12668f = cVar;
        C5914t1 t1Var2 = new C5914t1(t1Var.f12615c, t1Var.f12616d, t1Var.f12617e);
        t1Var2.f12614b = C19327t.m32661q1(t1Var.f12614b);
        C19394m mVar = C19394m.f43287a;
        this.f12664b = t1Var2;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B("apiKey");
        g1Var.mo16530k(this.f12665c);
        g1Var.mo16514B("payloadVersion");
        g1Var.mo16530k("4.0");
        g1Var.mo16514B("notifier");
        g1Var.mo16516M(this.f12664b, false);
        g1Var.mo16514B("events");
        g1Var.mo16520b();
        C5908s0 s0Var = this.f12666d;
        if (s0Var != null) {
            g1Var.mo16516M(s0Var, false);
        } else {
            File file = this.f12667e;
            if (file != null) {
                g1Var.mo16515G(file);
            }
        }
        g1Var.mo16524f();
        g1Var.mo16526g();
    }

    public C5922v0(String str, C5908s0 s0Var, C5914t1 t1Var, C5763c cVar) {
        this(str, s0Var, (File) null, t1Var, cVar);
    }
}
