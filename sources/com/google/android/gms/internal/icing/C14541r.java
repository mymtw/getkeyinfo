package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.icing.r */
public abstract class C14541r extends C14522m {

    /* renamed from: b */
    public static final Logger f32685b = Logger.getLogger(C14541r.class.getName());

    /* renamed from: c */
    public static final boolean f32686c = C14505h2.f32646e;

    /* renamed from: a */
    public C14544s f32687a;

    public C14541r() {
    }

    public /* synthetic */ C14541r(int i) {
    }

    @Deprecated
    /* renamed from: a */
    public static int m23159a(int i, C14480b1 b1Var, C14524m1 m1Var) {
        int s = m23162s(i << 3);
        int i2 = s + s;
        C14506i iVar = (C14506i) b1Var;
        int a = iVar.mo49757a();
        if (a == -1) {
            a = m1Var.mo49764c(iVar);
            iVar.mo49758d(a);
        }
        return i2 + a;
    }

    /* renamed from: q */
    public static int m23160q(int i) {
        return m23162s(i << 3);
    }

    /* renamed from: r */
    public static int m23161r(int i) {
        if (i >= 0) {
            return m23162s(i);
        }
        return 10;
    }

    /* renamed from: s */
    public static int m23162s(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: t */
    public static int m23163t(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: u */
    public static int m23164u(String str) {
        int i;
        try {
            i = C14509i2.m23046a(str);
        } catch (zzfq unused) {
            i = str.getBytes(C14515k0.f32655a).length;
        }
        return m23162s(i) + i;
    }

    /* renamed from: b */
    public abstract void mo49862b(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo49863c(int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo49864d(int i, int i2) throws IOException;

    /* renamed from: e */
    public abstract void mo49865e(int i, int i2) throws IOException;

    /* renamed from: f */
    public abstract void mo49866f(int i, long j) throws IOException;

    /* renamed from: g */
    public abstract void mo49867g(int i, long j) throws IOException;

    /* renamed from: h */
    public abstract void mo49868h(int i, boolean z) throws IOException;

    /* renamed from: i */
    public abstract void mo49869i(int i, String str) throws IOException;

    /* renamed from: j */
    public abstract void mo49870j(int i, zzcf zzcf) throws IOException;

    /* renamed from: k */
    public abstract void mo49871k(byte b) throws IOException;

    /* renamed from: l */
    public abstract void mo49872l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo49873m(int i) throws IOException;

    /* renamed from: n */
    public abstract void mo49874n(int i) throws IOException;

    /* renamed from: o */
    public abstract void mo49875o(long j) throws IOException;

    /* renamed from: p */
    public abstract void mo49876p(long j) throws IOException;
}
