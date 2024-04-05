package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
public abstract class C14613d5 extends C14890z4 {

    /* renamed from: b */
    public static final Logger f32804b = Logger.getLogger(C14613d5.class.getName());

    /* renamed from: c */
    public static final boolean f32805c = C14869x7.f33160e;

    /* renamed from: a */
    public C14626e5 f32806a;

    public C14613d5() {
    }

    public /* synthetic */ C14613d5(int i) {
    }

    /* renamed from: a */
    public static int m23437a(int i) {
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

    /* renamed from: b */
    public static int m23438b(long j) {
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

    @Deprecated
    /* renamed from: r */
    public static int m23439r(int i, C14796r6 r6Var, C14602c7 c7Var) {
        int a = m23437a(i << 3);
        int i2 = a + a;
        C14818t4 t4Var = (C14818t4) r6Var;
        int e = t4Var.mo50866e();
        if (e == -1) {
            e = c7Var.mo50438d(t4Var);
            t4Var.mo50867h(e);
        }
        return i2 + e;
    }

    /* renamed from: s */
    public static int m23440s(int i) {
        if (i >= 0) {
            return m23437a(i);
        }
        return 10;
    }

    /* renamed from: t */
    public static int m23441t(String str) {
        int i;
        try {
            i = C14881y7.m24179c(str);
        } catch (zzmp unused) {
            i = str.getBytes(C14575a6.f32740a).length;
        }
        return m23437a(i) + i;
    }

    /* renamed from: u */
    public static int m23442u(int i) {
        return m23437a(i << 3);
    }

    /* renamed from: c */
    public abstract void mo50407c(byte b) throws IOException;

    /* renamed from: d */
    public abstract void mo50408d(int i, boolean z) throws IOException;

    /* renamed from: e */
    public abstract void mo50409e(int i, zzix zzix) throws IOException;

    /* renamed from: f */
    public abstract void mo50410f(int i, int i2) throws IOException;

    /* renamed from: g */
    public abstract void mo50411g(int i) throws IOException;

    /* renamed from: h */
    public abstract void mo50412h(int i, long j) throws IOException;

    /* renamed from: i */
    public abstract void mo50413i(long j) throws IOException;

    /* renamed from: j */
    public abstract void mo50414j(int i, int i2) throws IOException;

    /* renamed from: k */
    public abstract void mo50415k(int i) throws IOException;

    /* renamed from: l */
    public abstract void mo50416l(int i, String str) throws IOException;

    /* renamed from: m */
    public abstract void mo50417m(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo50418n(int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo50419o(int i) throws IOException;

    /* renamed from: p */
    public abstract void mo50420p(int i, long j) throws IOException;

    /* renamed from: q */
    public abstract void mo50421q(long j) throws IOException;
}
