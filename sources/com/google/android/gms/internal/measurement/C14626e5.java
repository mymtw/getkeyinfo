package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
public final class C14626e5 {

    /* renamed from: a */
    public final C14613d5 f32825a;

    public C14626e5(C14600c5 c5Var) {
        Charset charset = C14575a6.f32740a;
        this.f32825a = c5Var;
        c5Var.f32806a = this;
    }

    /* renamed from: a */
    public final void mo50458a(int i, int i2) throws IOException {
        this.f32825a.mo50418n(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo50459b(int i, long j) throws IOException {
        this.f32825a.mo50420p(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: c */
    public final void mo50460c(int i, int i2) throws IOException {
        this.f32825a.mo50418n(i, i2);
    }

    /* renamed from: d */
    public final void mo50461d(int i, long j) throws IOException {
        this.f32825a.mo50420p(i, j);
    }

    /* renamed from: e */
    public final void mo50462e(int i, boolean z) throws IOException {
        this.f32825a.mo50408d(i, z);
    }

    /* renamed from: f */
    public final void mo50463f(int i, zzix zzix) throws IOException {
        this.f32825a.mo50409e(i, zzix);
    }

    /* renamed from: g */
    public final void mo50464g(int i, double d) throws IOException {
        this.f32825a.mo50412h(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: h */
    public final void mo50465h(int i, int i2) throws IOException {
        this.f32825a.mo50414j(i, i2);
    }

    /* renamed from: i */
    public final void mo50466i(int i, int i2) throws IOException {
        this.f32825a.mo50410f(i, i2);
    }

    /* renamed from: j */
    public final void mo50467j(int i, long j) throws IOException {
        this.f32825a.mo50412h(i, j);
    }

    /* renamed from: k */
    public final void mo50468k(float f, int i) throws IOException {
        this.f32825a.mo50410f(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public final void mo50469l(int i, C14602c7 c7Var, Object obj) throws IOException {
        C14613d5 d5Var = this.f32825a;
        d5Var.mo50417m(i, 3);
        c7Var.mo50441g((C14796r6) obj, d5Var.f32806a);
        d5Var.mo50417m(i, 4);
    }

    /* renamed from: m */
    public final void mo50470m(int i, int i2) throws IOException {
        this.f32825a.mo50414j(i, i2);
    }

    /* renamed from: n */
    public final void mo50471n(int i, long j) throws IOException {
        this.f32825a.mo50420p(i, j);
    }

    /* renamed from: o */
    public final void mo50472o(int i, C14602c7 c7Var, Object obj) throws IOException {
        C14796r6 r6Var = (C14796r6) obj;
        C14600c5 c5Var = (C14600c5) this.f32825a;
        c5Var.mo50419o((i << 3) | 2);
        C14818t4 t4Var = (C14818t4) r6Var;
        int e = t4Var.mo50866e();
        if (e == -1) {
            e = c7Var.mo50438d(t4Var);
            t4Var.mo50867h(e);
        }
        c5Var.mo50419o(e);
        c7Var.mo50441g(r6Var, c5Var.f32806a);
    }

    /* renamed from: p */
    public final void mo50473p(int i, int i2) throws IOException {
        this.f32825a.mo50410f(i, i2);
    }

    /* renamed from: q */
    public final void mo50474q(int i, long j) throws IOException {
        this.f32825a.mo50412h(i, j);
    }
}
