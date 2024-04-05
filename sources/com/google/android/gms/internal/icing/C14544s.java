package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.icing.s */
public final class C14544s {

    /* renamed from: a */
    public final C14541r f32694a;

    public C14544s(C14538q qVar) {
        Charset charset = C14515k0.f32655a;
        this.f32694a = qVar;
        qVar.f32687a = this;
    }

    /* renamed from: a */
    public final void mo49895a(int i, int i2) throws IOException {
        this.f32694a.mo49865e(i, i2);
    }

    /* renamed from: b */
    public final void mo49896b(int i, long j) throws IOException {
        this.f32694a.mo49866f(i, j);
    }

    /* renamed from: c */
    public final void mo49897c(int i, long j) throws IOException {
        this.f32694a.mo49867g(i, j);
    }

    /* renamed from: d */
    public final void mo49898d(float f, int i) throws IOException {
        this.f32694a.mo49865e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: e */
    public final void mo49899e(int i, double d) throws IOException {
        this.f32694a.mo49867g(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: f */
    public final void mo49900f(int i, int i2) throws IOException {
        this.f32694a.mo49863c(i, i2);
    }

    /* renamed from: g */
    public final void mo49901g(int i, long j) throws IOException {
        this.f32694a.mo49866f(i, j);
    }

    /* renamed from: h */
    public final void mo49902h(int i, int i2) throws IOException {
        this.f32694a.mo49863c(i, i2);
    }

    /* renamed from: i */
    public final void mo49903i(int i, long j) throws IOException {
        this.f32694a.mo49867g(i, j);
    }

    /* renamed from: j */
    public final void mo49904j(int i, int i2) throws IOException {
        this.f32694a.mo49865e(i, i2);
    }

    /* renamed from: k */
    public final void mo49905k(int i, boolean z) throws IOException {
        this.f32694a.mo49868h(i, z);
    }

    /* renamed from: l */
    public final void mo49906l(int i, zzcf zzcf) throws IOException {
        this.f32694a.mo49870j(i, zzcf);
    }

    /* renamed from: m */
    public final void mo49907m(int i, int i2) throws IOException {
        this.f32694a.mo49864d(i, i2);
    }

    /* renamed from: n */
    public final void mo49908n(int i, int i2) throws IOException {
        this.f32694a.mo49864d(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: o */
    public final void mo49909o(int i, long j) throws IOException {
        this.f32694a.mo49866f(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: p */
    public final void mo49910p(int i, C14524m1 m1Var, Object obj) throws IOException {
        C14480b1 b1Var = (C14480b1) obj;
        C14538q qVar = (C14538q) this.f32694a;
        qVar.mo49873m((i << 3) | 2);
        C14506i iVar = (C14506i) b1Var;
        int a = iVar.mo49757a();
        if (a == -1) {
            a = m1Var.mo49764c(iVar);
            iVar.mo49758d(a);
        }
        qVar.mo49873m(a);
        m1Var.mo49765d(b1Var, qVar.f32687a);
    }

    /* renamed from: q */
    public final void mo49911q(int i, C14524m1 m1Var, Object obj) throws IOException {
        C14541r rVar = this.f32694a;
        rVar.mo49862b(i, 3);
        m1Var.mo49765d((C14480b1) obj, rVar.f32687a);
        rVar.mo49862b(i, 4);
    }
}
