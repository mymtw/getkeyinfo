package p717yh;

import p513bj.C14049b0;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18351j;
import p717yh.C18848e0;

/* renamed from: yh.z */
public final class C18882z implements C18848e0 {

    /* renamed from: a */
    public final C18881y f42051a;

    /* renamed from: b */
    public final C14077r f42052b = new C14077r(32);

    /* renamed from: c */
    public int f42053c;

    /* renamed from: d */
    public int f42054d;

    /* renamed from: e */
    public boolean f42055e;

    /* renamed from: f */
    public boolean f42056f;

    public C18882z(C18881y yVar) {
        this.f42051a = yVar;
    }

    /* renamed from: a */
    public final void mo70289a(int i, C14077r rVar) {
        boolean z = (i & 1) != 0;
        int p = z ? rVar.f30987b + rVar.mo46925p() : -1;
        if (this.f42056f) {
            if (z) {
                this.f42056f = false;
                rVar.mo46935z(p);
                this.f42054d = 0;
            } else {
                return;
            }
        }
        while (true) {
            int i2 = rVar.f30988c;
            int i3 = rVar.f30987b;
            if (i2 - i3 > 0) {
                int i4 = this.f42054d;
                if (i4 < 3) {
                    if (i4 == 0) {
                        int p2 = rVar.mo46925p();
                        rVar.mo46935z(rVar.f30987b - 1);
                        if (p2 == 255) {
                            this.f42056f = true;
                            return;
                        }
                    }
                    int min = Math.min(rVar.f30988c - rVar.f30987b, 3 - this.f42054d);
                    rVar.mo46911b(this.f42054d, min, this.f42052b.f30986a);
                    int i5 = this.f42054d + min;
                    this.f42054d = i5;
                    if (i5 == 3) {
                        this.f42052b.mo46935z(0);
                        this.f42052b.mo46934y(3);
                        this.f42052b.mo46909A(1);
                        int p3 = this.f42052b.mo46925p();
                        int p4 = this.f42052b.mo46925p();
                        this.f42055e = (p3 & 128) != 0;
                        int i6 = (((p3 & 15) << 8) | p4) + 3;
                        this.f42053c = i6;
                        byte[] bArr = this.f42052b.f30986a;
                        if (bArr.length < i6) {
                            this.f42052b.mo46910a(Math.min(4098, Math.max(i6, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i2 - i3, this.f42053c - i4);
                    rVar.mo46911b(this.f42054d, min2, this.f42052b.f30986a);
                    int i7 = this.f42054d + min2;
                    this.f42054d = i7;
                    int i8 = this.f42053c;
                    if (i7 != i8) {
                        continue;
                    } else {
                        if (this.f42055e) {
                            byte[] bArr2 = this.f42052b.f30986a;
                            int i9 = -1;
                            for (int i10 = 0; i10 < i8; i10++) {
                                i9 = C14049b0.f30924l[((i9 >>> 24) ^ (bArr2[i10] & 255)) & 255] ^ (i9 << 8);
                            }
                            int i11 = C14049b0.f30913a;
                            if (i9 != 0) {
                                this.f42056f = true;
                                return;
                            }
                            this.f42052b.mo46934y(this.f42053c - 4);
                        } else {
                            this.f42052b.mo46934y(i8);
                        }
                        this.f42052b.mo46935z(0);
                        this.f42051a.mo70287a(this.f42052b);
                        this.f42054d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo70290b(C14086y yVar, C18351j jVar, C18848e0.C18852d dVar) {
        this.f42051a.mo70288b(yVar, jVar, dVar);
        this.f42056f = true;
    }

    /* renamed from: c */
    public final void mo70291c() {
        this.f42056f = true;
    }
}
