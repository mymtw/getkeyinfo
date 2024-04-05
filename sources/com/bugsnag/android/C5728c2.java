package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bugsnag.android.c2 */
public final class C5728c2 implements C5748g1.C5749a {

    /* renamed from: b */
    public final File f12182b;

    /* renamed from: c */
    public final C5914t1 f12183c;

    /* renamed from: d */
    public String f12184d;

    /* renamed from: e */
    public Date f12185e;

    /* renamed from: f */
    public C5915t2 f12186f;

    /* renamed from: g */
    public final C5816o1 f12187g;

    /* renamed from: h */
    public C5724c f12188h;

    /* renamed from: i */
    public C5753h0 f12189i;

    /* renamed from: j */
    public final AtomicBoolean f12190j;

    /* renamed from: k */
    public final AtomicInteger f12191k;

    /* renamed from: l */
    public final AtomicInteger f12192l;

    /* renamed from: m */
    public final AtomicBoolean f12193m;

    /* renamed from: n */
    public final AtomicBoolean f12194n;

    public C5728c2(String str, Date date, C5915t2 t2Var, boolean z, C5914t1 t1Var, C5816o1 o1Var) {
        this((File) null, t1Var, o1Var);
        this.f12184d = str;
        this.f12185e = new Date(date.getTime());
        this.f12186f = t2Var;
        this.f12190j.set(z);
    }

    /* renamed from: a */
    public static C5728c2 m11517a(C5728c2 c2Var) {
        C5728c2 c2Var2 = new C5728c2(c2Var.f12184d, c2Var.f12185e, c2Var.f12186f, c2Var.f12191k.get(), c2Var.f12192l.get(), c2Var.f12183c, c2Var.f12187g);
        c2Var2.f12193m.set(c2Var.f12193m.get());
        c2Var2.f12190j.set(c2Var.f12190j.get());
        return c2Var2;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        File file = this.f12182b;
        if (file != null) {
            if (file != null && file.getName().endsWith("_v2.json")) {
                g1Var.mo16515G(this.f12182b);
                return;
            }
            g1Var.mo16522d();
            g1Var.mo16514B("notifier");
            g1Var.mo16516M(this.f12183c, false);
            g1Var.mo16514B("app");
            g1Var.mo16516M(this.f12188h, false);
            g1Var.mo16514B("device");
            g1Var.mo16516M(this.f12189i, false);
            g1Var.mo16514B("sessions");
            g1Var.mo16520b();
            g1Var.mo16515G(this.f12182b);
            g1Var.mo16524f();
            g1Var.mo16526g();
            return;
        }
        g1Var.mo16522d();
        g1Var.mo16514B("notifier");
        g1Var.mo16516M(this.f12183c, false);
        g1Var.mo16514B("app");
        g1Var.mo16516M(this.f12188h, false);
        g1Var.mo16514B("device");
        g1Var.mo16516M(this.f12189i, false);
        g1Var.mo16514B("sessions");
        g1Var.mo16520b();
        g1Var.mo16522d();
        g1Var.mo16514B("id");
        g1Var.mo16530k(this.f12184d);
        g1Var.mo16514B("startedAt");
        g1Var.mo16516M(this.f12185e, false);
        g1Var.mo16514B("user");
        g1Var.mo16516M(this.f12186f, false);
        g1Var.mo16526g();
        g1Var.mo16524f();
        g1Var.mo16526g();
    }

    public C5728c2(String str, Date date, C5915t2 t2Var, int i, int i2, C5914t1 t1Var, C5816o1 o1Var) {
        this(str, date, t2Var, false, t1Var, o1Var);
        this.f12191k.set(i);
        this.f12192l.set(i2);
        this.f12193m.set(true);
    }

    public C5728c2(File file, C5914t1 t1Var, C5816o1 o1Var) {
        this.f12190j = new AtomicBoolean(false);
        this.f12191k = new AtomicInteger();
        this.f12192l = new AtomicInteger();
        this.f12193m = new AtomicBoolean(false);
        this.f12194n = new AtomicBoolean(false);
        this.f12182b = file;
        this.f12187g = o1Var;
        if (t1Var != null) {
            C5914t1 t1Var2 = new C5914t1(t1Var.f12615c, t1Var.f12616d, t1Var.f12617e);
            t1Var2.f12614b = new ArrayList(t1Var.f12614b);
            this.f12183c = t1Var2;
            return;
        }
        this.f12183c = null;
    }
}
