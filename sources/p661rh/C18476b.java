package p661rh;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.common.base.C15781b;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p010a9.C0048b;
import p513bj.C14049b0;
import p513bj.C14076q;
import p513bj.C14077r;
import p563fi.C17734a;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18354l;
import p644ph.C18356m;
import p644ph.C18357n;
import p644ph.C18358o;
import p644ph.C18363s;
import p644ph.C18364t;
import p644ph.C18368v;
import p644ph.C18371x;

/* renamed from: rh.b */
public final class C18476b implements C18349h {

    /* renamed from: a */
    public final byte[] f40683a = new byte[42];

    /* renamed from: b */
    public final C14077r f40684b = new C14077r(0, new byte[32768]);

    /* renamed from: c */
    public final boolean f40685c = false;

    /* renamed from: d */
    public final C18354l.C18355a f40686d = new C18354l.C18355a();

    /* renamed from: e */
    public C18351j f40687e;

    /* renamed from: f */
    public C18368v f40688f;

    /* renamed from: g */
    public int f40689g = 0;

    /* renamed from: h */
    public Metadata f40690h;

    /* renamed from: i */
    public C18358o f40691i;

    /* renamed from: j */
    public int f40692j;

    /* renamed from: k */
    public int f40693k;

    /* renamed from: l */
    public C18474a f40694l;

    /* renamed from: m */
    public int f40695m;

    /* renamed from: n */
    public long f40696n;

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        boolean z;
        C18358o oVar;
        C18364t tVar;
        long j;
        boolean z2;
        int i = this.f40689g;
        boolean z3 = true;
        boolean z4 = false;
        if (i == 0) {
            boolean z5 = !this.f40685c;
            C18346e eVar = (C18346e) iVar;
            eVar.f40296f = 0;
            long h = eVar.mo69877h();
            Metadata metadata = null;
            C0048b bVar = z5 ? null : C17734a.f38563d;
            C14077r rVar = new C14077r(10);
            Metadata metadata2 = null;
            int i2 = 0;
            while (true) {
                try {
                    z = false;
                    try {
                        eVar.mo69872c(rVar.f30986a, 0, 10, false);
                        rVar.mo46935z(0);
                        if (rVar.mo46927r() != 4801587) {
                            break;
                        }
                        rVar.mo46909A(3);
                        int o = rVar.mo46924o();
                        int i3 = o + 10;
                        if (metadata2 == null) {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(rVar.f30986a, 0, bArr, 0, 10);
                            eVar.mo69872c(bArr, 10, o, false);
                            metadata2 = new C17734a(bVar).mo68991u0(i3, bArr);
                        } else {
                            eVar.mo69880k(o, false);
                        }
                        i2 += i3;
                    } catch (EOFException unused) {
                    }
                } catch (EOFException unused2) {
                }
            }
            z = false;
            eVar.f40296f = z ? 1 : 0;
            eVar.mo69880k(i2, z);
            if (!(metadata2 == null || metadata2.length() == 0)) {
                metadata = metadata2;
            }
            eVar.mo69879j((int) (eVar.mo69877h() - h));
            this.f40690h = metadata;
            this.f40689g = 1;
            return 0;
        } else if (i != 1) {
            int i4 = 24;
            int i5 = 4;
            if (i != 2) {
                int i6 = 6;
                int i7 = 7;
                if (i != 3) {
                    long j2 = 0;
                    if (i == 4) {
                        C18346e eVar2 = (C18346e) iVar;
                        eVar2.f40296f = 0;
                        byte[] bArr2 = new byte[2];
                        eVar2.mo69872c(bArr2, 0, 2, false);
                        byte b = (bArr2[1] & 255) | ((bArr2[0] & 255) << 8);
                        if ((b >> 2) == 16382) {
                            eVar2.f40296f = 0;
                            this.f40693k = b;
                            C18351j jVar = this.f40687e;
                            int i8 = C14049b0.f30913a;
                            long j3 = eVar2.f40294d;
                            long j4 = eVar2.f40293c;
                            this.f40691i.getClass();
                            C18358o oVar2 = this.f40691i;
                            if (oVar2.f40315k != null) {
                                tVar = new C18357n(oVar2, j3);
                            } else if (j4 == -1 || oVar2.f40314j <= 0) {
                                tVar = new C18364t.C18366b(oVar2.mo69888c());
                            } else {
                                C18474a aVar = new C18474a(oVar2, this.f40693k, j3, j4);
                                this.f40694l = aVar;
                                tVar = aVar.f40256a;
                            }
                            jVar.mo4162l(tVar);
                            this.f40689g = 5;
                            return 0;
                        }
                        eVar2.f40296f = 0;
                        throw new ParserException("First frame does not start with sync code.");
                    } else if (i == 5) {
                        this.f40688f.getClass();
                        this.f40691i.getClass();
                        C18474a aVar2 = this.f40694l;
                        if (aVar2 != null) {
                            if (aVar2.f40258c != null) {
                                return aVar2.mo69866a((C18346e) iVar, sVar);
                            }
                        }
                        if (this.f40696n == -1) {
                            C18358o oVar3 = this.f40691i;
                            C18346e eVar3 = (C18346e) iVar;
                            eVar3.f40296f = 0;
                            eVar3.mo69880k(1, false);
                            byte[] bArr3 = new byte[1];
                            eVar3.mo69872c(bArr3, 0, 1, false);
                            boolean z6 = (bArr3[0] & 1) == 1;
                            eVar3.mo69880k(2, false);
                            if (z6) {
                                i6 = 7;
                            }
                            C14077r rVar2 = new C14077r(i6);
                            byte[] bArr4 = rVar2.f30986a;
                            int i9 = 0;
                            while (i9 < i6) {
                                int m = eVar3.mo69882m(0 + i9, i6 - i9, bArr4);
                                if (m == -1) {
                                    break;
                                }
                                i9 += m;
                            }
                            rVar2.mo46934y(i9);
                            eVar3.f40296f = 0;
                            try {
                                long v = rVar2.mo46931v();
                                if (!z6) {
                                    v *= (long) oVar3.f40306b;
                                }
                                j2 = v;
                            } catch (NumberFormatException unused3) {
                                z3 = false;
                            }
                            if (z3) {
                                this.f40696n = j2;
                                return 0;
                            }
                            throw new ParserException();
                        }
                        C14077r rVar3 = this.f40684b;
                        int i10 = rVar3.f30988c;
                        if (i10 < 32768) {
                            int read = ((C18346e) iVar).read(rVar3.f30986a, i10, 32768 - i10);
                            if (read != -1) {
                                z3 = false;
                            }
                            if (!z3) {
                                this.f40684b.mo46934y(i10 + read);
                            } else {
                                C14077r rVar4 = this.f40684b;
                                if (rVar4.f30988c - rVar4.f30987b == 0) {
                                    C18358o oVar4 = this.f40691i;
                                    int i11 = C14049b0.f30913a;
                                    this.f40688f.mo47754c((this.f40696n * 1000000) / ((long) oVar4.f40309e), 1, this.f40695m, 0, (C18368v.C18369a) null);
                                    return -1;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        C14077r rVar5 = this.f40684b;
                        int i12 = rVar5.f30987b;
                        int i13 = this.f40695m;
                        int i14 = this.f40692j;
                        if (i13 < i14) {
                            rVar5.mo46909A(Math.min(i14 - i13, rVar5.f30988c - i12));
                        }
                        C14077r rVar6 = this.f40684b;
                        this.f40691i.getClass();
                        int i15 = rVar6.f30987b;
                        while (true) {
                            if (i15 <= rVar6.f30988c - 16) {
                                rVar6.mo46935z(i15);
                                if (C18354l.m31023a(rVar6, this.f40691i, this.f40693k, this.f40686d)) {
                                    rVar6.mo46935z(i15);
                                    j = this.f40686d.f40302a;
                                    break;
                                }
                                i15++;
                            } else {
                                if (z3) {
                                    while (true) {
                                        int i16 = rVar6.f30988c;
                                        if (i15 > i16 - this.f40692j) {
                                            rVar6.mo46935z(i16);
                                            break;
                                        }
                                        rVar6.mo46935z(i15);
                                        try {
                                            z2 = C18354l.m31023a(rVar6, this.f40691i, this.f40693k, this.f40686d);
                                        } catch (IndexOutOfBoundsException unused4) {
                                            z2 = false;
                                        }
                                        if (rVar6.f30987b > rVar6.f30988c) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            rVar6.mo46935z(i15);
                                            j = this.f40686d.f40302a;
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    rVar6.mo46935z(i15);
                                }
                                j = -1;
                            }
                        }
                        C14077r rVar7 = this.f40684b;
                        int i17 = rVar7.f30987b - i12;
                        rVar7.mo46935z(i12);
                        this.f40688f.mo69899d(i17, this.f40684b);
                        int i18 = this.f40695m + i17;
                        this.f40695m = i18;
                        if (j != -1) {
                            C18358o oVar5 = this.f40691i;
                            int i19 = C14049b0.f30913a;
                            this.f40688f.mo47754c((this.f40696n * 1000000) / ((long) oVar5.f40309e), 1, i18, 0, (C18368v.C18369a) null);
                            this.f40695m = 0;
                            this.f40696n = j;
                        }
                        C14077r rVar8 = this.f40684b;
                        int i20 = rVar8.f30988c;
                        int i21 = rVar8.f30987b;
                        int i22 = i20 - i21;
                        if (i22 >= 16) {
                            return 0;
                        }
                        byte[] bArr5 = rVar8.f30986a;
                        System.arraycopy(bArr5, i21, bArr5, 0, i22);
                        this.f40684b.mo46935z(0);
                        this.f40684b.mo46934y(i22);
                        return 0;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    C18358o oVar6 = this.f40691i;
                    boolean z7 = false;
                    while (!z7) {
                        C18346e eVar4 = (C18346e) iVar;
                        eVar4.f40296f = z4 ? 1 : 0;
                        C14076q qVar = new C14076q(i5, new byte[i5]);
                        eVar4.mo69872c((byte[]) qVar.f30985d, z4, i5, z4);
                        boolean g = qVar.mo46900g();
                        int h2 = qVar.mo46901h(i7);
                        int h3 = qVar.mo46901h(i4) + i5;
                        if (h2 == 0) {
                            byte[] bArr6 = new byte[38];
                            eVar4.mo69874g(bArr6, z4, 38, z4);
                            oVar6 = new C18358o(i5, bArr6);
                        } else if (oVar6 != null) {
                            if (h2 == 3) {
                                C14077r rVar9 = new C14077r(h3);
                                eVar4.mo69874g(rVar9.f30986a, z4, h3, z4);
                                oVar = new C18358o(oVar6.f40305a, oVar6.f40306b, oVar6.f40307c, oVar6.f40308d, oVar6.f40309e, oVar6.f40311g, oVar6.f40312h, oVar6.f40314j, C18356m.m31025a(rVar9), oVar6.f40316l);
                            } else {
                                int i23 = i5;
                                if (h2 == i23) {
                                    C14077r rVar10 = new C14077r(h3);
                                    eVar4.mo69874g(rVar10.f30986a, z4, h3, z4);
                                    rVar10.mo46909A(i23);
                                    Metadata a = C18358o.m31029a(Arrays.asList(C18371x.m31055a(rVar10, z4, z4).f40343a), Collections.emptyList());
                                    Metadata metadata3 = oVar6.f40316l;
                                    if (metadata3 != null) {
                                        a = metadata3.copyWithAppendedEntriesFrom(a);
                                    }
                                    oVar = new C18358o(oVar6.f40305a, oVar6.f40306b, oVar6.f40307c, oVar6.f40308d, oVar6.f40309e, oVar6.f40311g, oVar6.f40312h, oVar6.f40314j, oVar6.f40315k, a);
                                } else if (h2 == i6) {
                                    C14077r rVar11 = new C14077r(h3);
                                    eVar4.mo69874g(rVar11.f30986a, 0, h3, false);
                                    rVar11.mo46909A(4);
                                    int c = rVar11.mo46912c();
                                    String n = rVar11.mo46923n(rVar11.mo46912c(), C15781b.f35560a);
                                    String m2 = rVar11.mo46922m(rVar11.mo46912c());
                                    int c2 = rVar11.mo46912c();
                                    int c3 = rVar11.mo46912c();
                                    int c4 = rVar11.mo46912c();
                                    int c5 = rVar11.mo46912c();
                                    int c6 = rVar11.mo46912c();
                                    byte[] bArr7 = new byte[c6];
                                    rVar11.mo46911b(0, c6, bArr7);
                                    Metadata a2 = C18358o.m31029a(Collections.emptyList(), Collections.singletonList(new PictureFrame(c, n, m2, c2, c3, c4, c5, bArr7)));
                                    Metadata metadata4 = oVar6.f40316l;
                                    if (metadata4 != null) {
                                        a2 = metadata4.copyWithAppendedEntriesFrom(a2);
                                    }
                                    oVar = new C18358o(oVar6.f40305a, oVar6.f40306b, oVar6.f40307c, oVar6.f40308d, oVar6.f40309e, oVar6.f40311g, oVar6.f40312h, oVar6.f40314j, oVar6.f40315k, a2);
                                } else {
                                    eVar4.mo69879j(h3);
                                }
                            }
                            oVar6 = oVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i24 = C14049b0.f30913a;
                        this.f40691i = oVar6;
                        z7 = g;
                        z4 = false;
                        i4 = 24;
                        i5 = 4;
                        i6 = 6;
                        i7 = 7;
                    }
                    this.f40691i.getClass();
                    this.f40692j = Math.max(this.f40691i.f40307c, 6);
                    C18368v vVar = this.f40688f;
                    int i25 = C14049b0.f30913a;
                    vVar.mo47752a(this.f40691i.mo69889d(this.f40683a, this.f40690h));
                    this.f40689g = 4;
                    return 0;
                }
            } else {
                byte[] bArr8 = new byte[4];
                ((C18346e) iVar).mo69874g(bArr8, 0, 4, false);
                if ((((((long) bArr8[1]) & 255) << 16) | ((((long) bArr8[0]) & 255) << 24) | ((((long) bArr8[2]) & 255) << 8) | (((long) bArr8[3]) & 255)) == 1716281667) {
                    this.f40689g = 3;
                    return 0;
                }
                throw new ParserException("Failed to read FLAC stream marker.");
            }
        } else {
            byte[] bArr9 = this.f40683a;
            C18346e eVar5 = (C18346e) iVar;
            eVar5.mo69872c(bArr9, 0, bArr9.length, false);
            eVar5.f40296f = 0;
            this.f40689g = 2;
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f40687e = jVar;
        this.f40688f = jVar.mo4164r(0, 1);
        jVar.mo4163p();
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f40689g = 0;
        } else {
            C18474a aVar = this.f40694l;
            if (aVar != null) {
                aVar.mo69867c(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f40696n = j3;
        this.f40695m = 0;
        this.f40684b.mo46932w(0);
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        C18346e eVar = (C18346e) iVar;
        Metadata metadata = null;
        C0048b bVar = C17734a.f38563d;
        C14077r rVar = new C14077r(10);
        int i = 0;
        while (true) {
            try {
                eVar.mo69872c(rVar.f30986a, 0, 10, false);
                rVar.mo46935z(0);
                if (rVar.mo46927r() != 4801587) {
                    break;
                }
                rVar.mo46909A(3);
                int o = rVar.mo46924o();
                int i2 = o + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(rVar.f30986a, 0, bArr, 0, 10);
                    eVar.mo69872c(bArr, 10, o, false);
                    metadata = new C17734a(bVar).mo68991u0(i2, bArr);
                } else {
                    eVar.mo69880k(o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        eVar.f40296f = 0;
        eVar.mo69880k(i, false);
        if (metadata != null) {
            int length = metadata.length();
        }
        byte[] bArr2 = new byte[4];
        eVar.mo69872c(bArr2, 0, 4, false);
        return (((((((long) bArr2[0]) & 255) << 24) | ((((long) bArr2[1]) & 255) << 16)) | ((((long) bArr2[2]) & 255) << 8)) | (((long) bArr2[3]) & 255)) == 1716281667;
    }

    public final void release() {
    }
}
