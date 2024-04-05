package p717yh;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import p003a2.C0023f;
import p513bj.C14075p;
import p513bj.C14076q;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18351j;
import p717yh.C18848e0;

/* renamed from: yh.t */
public final class C18874t implements C18848e0 {

    /* renamed from: a */
    public final C18858j f42011a;

    /* renamed from: b */
    public final C14076q f42012b = new C14076q(10, new byte[10]);

    /* renamed from: c */
    public int f42013c = 0;

    /* renamed from: d */
    public int f42014d;

    /* renamed from: e */
    public C14086y f42015e;

    /* renamed from: f */
    public boolean f42016f;

    /* renamed from: g */
    public boolean f42017g;

    /* renamed from: h */
    public boolean f42018h;

    /* renamed from: i */
    public int f42019i;

    /* renamed from: j */
    public int f42020j;

    /* renamed from: k */
    public boolean f42021k;

    /* renamed from: l */
    public long f42022l;

    public C18874t(C18858j jVar) {
        this.f42011a = jVar;
    }

    /* renamed from: a */
    public final void mo70289a(int i, C14077r rVar) throws ParserException {
        int i2;
        int i3;
        boolean z;
        int i4;
        C14077r rVar2 = rVar;
        C14075p.m21696h(this.f42015e);
        int i5 = 0;
        int i6 = -1;
        int i7 = 2;
        if ((i & 1) != 0) {
            int i8 = this.f42013c;
            if (!(i8 == 0 || i8 == 1)) {
                if (i8 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else if (i8 == 3) {
                    int i9 = this.f42020j;
                    if (i9 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i9);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f42011a.mo70284e();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f42013c = 1;
            this.f42014d = 0;
        }
        int i10 = i;
        while (true) {
            int i11 = rVar2.f30988c;
            int i12 = rVar2.f30987b;
            int i13 = i11 - i12;
            if (i13 > 0) {
                int i14 = this.f42013c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != i7) {
                            if (i14 == 3) {
                                int i15 = this.f42020j;
                                int i16 = i15 == i6 ? i5 : i13 - i15;
                                if (i16 > 0) {
                                    i13 -= i16;
                                    rVar2.mo46934y(i12 + i13);
                                }
                                this.f42011a.mo70281a(rVar2);
                                int i17 = this.f42020j;
                                if (i17 != i6) {
                                    int i18 = i17 - i13;
                                    this.f42020j = i18;
                                    if (i18 == 0) {
                                        this.f42011a.mo70284e();
                                        this.f42013c = 1;
                                        this.f42014d = i5;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (mo70309d(Math.min(10, this.f42019i), rVar2, (byte[]) this.f42012b.f30985d) && mo70309d(this.f42019i, rVar2, (byte[]) null)) {
                            this.f42012b.mo46905l(i5);
                            this.f42022l = -9223372036854775807L;
                            int i19 = 4;
                            if (this.f42016f) {
                                this.f42012b.mo46907n(4);
                                this.f42012b.mo46907n(1);
                                this.f42012b.mo46907n(1);
                                long h = (((long) this.f42012b.mo46901h(3)) << 30) | ((long) (this.f42012b.mo46901h(15) << 15)) | ((long) this.f42012b.mo46901h(15));
                                this.f42012b.mo46907n(1);
                                if (!this.f42018h && this.f42017g) {
                                    this.f42012b.mo46907n(4);
                                    this.f42012b.mo46907n(1);
                                    long h2 = ((long) (this.f42012b.mo46901h(15) << 15)) | (((long) this.f42012b.mo46901h(3)) << 30);
                                    this.f42012b.mo46907n(1);
                                    long h3 = h2 | ((long) this.f42012b.mo46901h(15));
                                    this.f42012b.mo46907n(1);
                                    this.f42015e.mo46958b(h3);
                                    this.f42018h = true;
                                }
                                this.f42022l = this.f42015e.mo46958b(h);
                            }
                            if (!this.f42021k) {
                                i19 = 0;
                            }
                            i10 |= i19;
                            this.f42011a.mo70285f(i10, this.f42022l);
                            this.f42013c = 3;
                            this.f42014d = 0;
                            i6 = -1;
                            i7 = 2;
                            i5 = 0;
                        }
                    } else if (mo70309d(9, rVar2, (byte[]) this.f42012b.f30985d)) {
                        this.f42012b.mo46905l(0);
                        int h4 = this.f42012b.mo46901h(24);
                        if (h4 != 1) {
                            C0023f.m112m(41, "Unexpected start code prefix: ", h4, "PesReader");
                            this.f42020j = -1;
                            i3 = 2;
                            i2 = -1;
                            z = false;
                        } else {
                            this.f42012b.mo46907n(8);
                            int h5 = this.f42012b.mo46901h(16);
                            this.f42012b.mo46907n(5);
                            this.f42021k = this.f42012b.mo46900g();
                            this.f42012b.mo46907n(2);
                            this.f42016f = this.f42012b.mo46900g();
                            this.f42017g = this.f42012b.mo46900g();
                            this.f42012b.mo46907n(6);
                            int h6 = this.f42012b.mo46901h(8);
                            this.f42019i = h6;
                            if (h5 == 0) {
                                i4 = -1;
                                this.f42020j = -1;
                            } else {
                                int i20 = ((h5 + 6) - 9) - h6;
                                this.f42020j = i20;
                                if (i20 < 0) {
                                    C0023f.m112m(47, "Found negative packet payload size: ", i20, "PesReader");
                                    i4 = -1;
                                    this.f42020j = -1;
                                } else {
                                    i4 = -1;
                                }
                            }
                            i2 = i4;
                            i3 = 2;
                            z = true;
                        }
                        this.f42013c = z ? i3 : 0;
                        i5 = 0;
                        this.f42014d = 0;
                        int i21 = i2;
                        i7 = i3;
                        i6 = i21;
                    }
                    i5 = 0;
                    i6 = -1;
                    i7 = 2;
                } else {
                    rVar2.mo46909A(i13);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo70290b(C14086y yVar, C18351j jVar, C18848e0.C18852d dVar) {
        this.f42015e = yVar;
        this.f42011a.mo70283d(jVar, dVar);
    }

    /* renamed from: c */
    public final void mo70291c() {
        this.f42013c = 0;
        this.f42014d = 0;
        this.f42018h = false;
        this.f42011a.mo70282c();
    }

    /* renamed from: d */
    public final boolean mo70309d(int i, C14077r rVar, byte[] bArr) {
        int min = Math.min(rVar.f30988c - rVar.f30987b, i - this.f42014d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.mo46909A(min);
        } else {
            rVar.mo46911b(this.f42014d, min, bArr);
        }
        int i2 = this.f42014d + min;
        this.f42014d = i2;
        return i2 == i;
    }
}
