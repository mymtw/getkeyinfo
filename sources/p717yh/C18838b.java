package p717yh;

import com.google.android.exoplayer2.Format;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14076q;
import p513bj.C14077r;
import p611lh.C18164b;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.b */
public final class C18838b implements C18858j {

    /* renamed from: a */
    public final C14076q f41712a;

    /* renamed from: b */
    public final C14077r f41713b;

    /* renamed from: c */
    public final String f41714c;

    /* renamed from: d */
    public String f41715d;

    /* renamed from: e */
    public C18368v f41716e;

    /* renamed from: f */
    public int f41717f = 0;

    /* renamed from: g */
    public int f41718g;

    /* renamed from: h */
    public boolean f41719h;

    /* renamed from: i */
    public long f41720i;

    /* renamed from: j */
    public Format f41721j;

    /* renamed from: k */
    public int f41722k;

    /* renamed from: l */
    public long f41723l;

    public C18838b(String str) {
        C14076q qVar = new C14076q(128, new byte[128]);
        this.f41712a = qVar;
        this.f41713b = new C14077r((byte[]) qVar.f30985d);
        this.f41714c = str;
    }

    /* renamed from: a */
    public final void mo70281a(C14077r rVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C14077r rVar2 = rVar;
        C14075p.m21696h(this.f41716e);
        while (true) {
            int i14 = rVar2.f30988c - rVar2.f30987b;
            if (i14 > 0) {
                int i15 = this.f41717f;
                if (i15 == 0) {
                    while (true) {
                        if (rVar2.f30988c - rVar2.f30987b <= 0) {
                            z = false;
                            break;
                        } else if (!this.f41719h) {
                            this.f41719h = rVar.mo46925p() == 11;
                        } else {
                            int p = rVar.mo46925p();
                            if (p == 119) {
                                this.f41719h = false;
                                z = true;
                                break;
                            }
                            this.f41719h = p == 11;
                        }
                    }
                    if (z) {
                        this.f41717f = 1;
                        byte[] bArr = this.f41713b.f30986a;
                        bArr[0] = 11;
                        bArr[1] = 119;
                        this.f41718g = 2;
                    }
                } else if (i15 == 1) {
                    byte[] bArr2 = this.f41713b.f30986a;
                    int min = Math.min(i14, 128 - this.f41718g);
                    rVar2.mo46911b(this.f41718g, min, bArr2);
                    int i16 = this.f41718g + min;
                    this.f41718g = i16;
                    if (i16 == 128) {
                        this.f41712a.mo46905l(0);
                        C14076q qVar = this.f41712a;
                        int i17 = (qVar.f30982a * 8) + qVar.f30983b;
                        qVar.mo46907n(40);
                        boolean z2 = qVar.mo46901h(5) > 10;
                        qVar.mo46905l(i17);
                        int i18 = -1;
                        if (z2) {
                            qVar.mo46907n(16);
                            int h = qVar.mo46901h(2);
                            if (h == 0) {
                                i18 = 0;
                            } else if (h == 1) {
                                i18 = 1;
                            } else if (h == 2) {
                                i18 = 2;
                            }
                            qVar.mo46907n(3);
                            i3 = (qVar.mo46901h(11) + 1) * 2;
                            int h2 = qVar.mo46901h(2);
                            if (h2 == 3) {
                                i5 = C18164b.f39730c[qVar.mo46901h(2)];
                                i6 = 3;
                                i7 = 6;
                            } else {
                                int h3 = qVar.mo46901h(2);
                                i6 = h3;
                                i7 = C18164b.f39728a[h3];
                                i5 = C18164b.f39729b[h2];
                            }
                            i2 = i7 * 256;
                            int h4 = qVar.mo46901h(3);
                            boolean g = qVar.mo46900g();
                            i = C18164b.f39731d[h4] + (g ? 1 : 0);
                            qVar.mo46907n(10);
                            if (qVar.mo46900g()) {
                                qVar.mo46907n(8);
                            }
                            if (h4 == 0) {
                                qVar.mo46907n(5);
                                if (qVar.mo46900g()) {
                                    qVar.mo46907n(8);
                                }
                            }
                            if (i18 == 1 && qVar.mo46900g()) {
                                qVar.mo46907n(16);
                            }
                            if (qVar.mo46900g()) {
                                if (h4 > 2) {
                                    qVar.mo46907n(2);
                                }
                                if ((h4 & 1) == 0 || h4 <= 2) {
                                    i10 = 6;
                                } else {
                                    i10 = 6;
                                    qVar.mo46907n(6);
                                }
                                if ((h4 & 4) != 0) {
                                    qVar.mo46907n(i10);
                                }
                                if (g && qVar.mo46900g()) {
                                    qVar.mo46907n(5);
                                }
                                if (i18 == 0) {
                                    if (qVar.mo46900g()) {
                                        i11 = 6;
                                        qVar.mo46907n(6);
                                    } else {
                                        i11 = 6;
                                    }
                                    if (h4 == 0 && qVar.mo46900g()) {
                                        qVar.mo46907n(i11);
                                    }
                                    if (qVar.mo46900g()) {
                                        qVar.mo46907n(i11);
                                    }
                                    int h5 = qVar.mo46901h(2);
                                    if (h5 == 1) {
                                        qVar.mo46907n(5);
                                        i12 = 2;
                                    } else {
                                        if (h5 == 2) {
                                            qVar.mo46907n(12);
                                        } else if (h5 == 3) {
                                            int h6 = qVar.mo46901h(5);
                                            if (qVar.mo46900g()) {
                                                qVar.mo46907n(5);
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(4);
                                                }
                                                if (qVar.mo46900g()) {
                                                    if (qVar.mo46900g()) {
                                                        qVar.mo46907n(4);
                                                    }
                                                    if (qVar.mo46900g()) {
                                                        qVar.mo46907n(4);
                                                    }
                                                }
                                            }
                                            if (qVar.mo46900g()) {
                                                qVar.mo46907n(5);
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(7);
                                                    if (qVar.mo46900g()) {
                                                        i13 = 8;
                                                        qVar.mo46907n(8);
                                                        i12 = 2;
                                                        qVar.mo46907n((h6 + 2) * i13);
                                                        qVar.mo46896c();
                                                    }
                                                }
                                            }
                                            i13 = 8;
                                            i12 = 2;
                                            qVar.mo46907n((h6 + 2) * i13);
                                            qVar.mo46896c();
                                        }
                                        i12 = 2;
                                    }
                                    if (h4 < i12) {
                                        if (qVar.mo46900g()) {
                                            qVar.mo46907n(14);
                                        }
                                        if (h4 == 0 && qVar.mo46900g()) {
                                            qVar.mo46907n(14);
                                        }
                                    }
                                    if (qVar.mo46900g()) {
                                        if (i6 == 0) {
                                            qVar.mo46907n(5);
                                        } else {
                                            for (int i19 = 0; i19 < i7; i19++) {
                                                if (qVar.mo46900g()) {
                                                    qVar.mo46907n(5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (qVar.mo46900g()) {
                                qVar.mo46907n(5);
                                if (h4 == 2) {
                                    qVar.mo46907n(4);
                                }
                                if (h4 >= 6) {
                                    qVar.mo46907n(2);
                                }
                                if (qVar.mo46900g()) {
                                    i9 = 8;
                                    qVar.mo46907n(8);
                                } else {
                                    i9 = 8;
                                }
                                if (h4 == 0 && qVar.mo46900g()) {
                                    qVar.mo46907n(i9);
                                }
                                if (h2 < 3) {
                                    qVar.mo46906m();
                                }
                            }
                            if (i18 == 0 && i6 != 3) {
                                qVar.mo46906m();
                            }
                            if (i18 != 2 || (i6 != 3 && !qVar.mo46900g())) {
                                i8 = 6;
                            } else {
                                i8 = 6;
                                qVar.mo46907n(6);
                            }
                            str = (qVar.mo46900g() && qVar.mo46901h(i8) == 1 && qVar.mo46901h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                            i18 = i5;
                        } else {
                            qVar.mo46907n(32);
                            int h7 = qVar.mo46901h(2);
                            String str2 = h7 == 3 ? null : "audio/ac3";
                            int a = C18164b.m30678a(h7, qVar.mo46901h(6));
                            qVar.mo46907n(8);
                            int h8 = qVar.mo46901h(3);
                            if ((h8 & 1) == 0 || h8 == 1) {
                                i4 = 2;
                            } else {
                                i4 = 2;
                                qVar.mo46907n(2);
                            }
                            if ((h8 & 4) != 0) {
                                qVar.mo46907n(i4);
                            }
                            if (h8 == i4) {
                                qVar.mo46907n(i4);
                            }
                            int[] iArr = C18164b.f39729b;
                            if (h7 < 3) {
                                i18 = iArr[h7];
                            }
                            i2 = 1536;
                            i = C18164b.f39731d[h8] + (qVar.mo46900g() ? 1 : 0);
                            str = str2;
                            i3 = a;
                        }
                        int i20 = i;
                        Format format = this.f41721j;
                        if (format == null || i20 != format.channelCount || i18 != format.sampleRate || !C14049b0.m21628a(str, format.sampleMimeType)) {
                            Format.C14176b bVar = new Format.C14176b();
                            bVar.f31293a = this.f41715d;
                            bVar.f31303k = str;
                            bVar.f31316x = i20;
                            bVar.f31317y = i18;
                            bVar.f31295c = this.f41714c;
                            Format a2 = bVar.mo47144a();
                            this.f41721j = a2;
                            this.f41716e.mo47752a(a2);
                        }
                        this.f41722k = i3;
                        this.f41720i = (((long) i2) * 1000000) / ((long) this.f41721j.sampleRate);
                        this.f41713b.mo46935z(0);
                        this.f41716e.mo69899d(128, this.f41713b);
                        this.f41717f = 2;
                    }
                } else if (i15 == 2) {
                    int min2 = Math.min(i14, this.f41722k - this.f41718g);
                    this.f41716e.mo69899d(min2, rVar2);
                    int i21 = this.f41718g + min2;
                    this.f41718g = i21;
                    int i22 = this.f41722k;
                    if (i21 == i22) {
                        this.f41716e.mo47754c(this.f41723l, 1, i22, 0, (C18368v.C18369a) null);
                        this.f41723l += this.f41720i;
                        this.f41717f = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41717f = 0;
        this.f41718g = 0;
        this.f41719h = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41715d = dVar.f41796e;
        dVar.mo70294b();
        this.f41716e = jVar.mo4164r(dVar.f41795d, 1);
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41723l = j;
    }
}
