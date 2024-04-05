package p717yh;

import java.io.IOException;
import p513bj.C14077r;
import p611lh.C18164b;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p717yh.C18848e0;

/* renamed from: yh.a */
public final class C18836a implements C18349h {

    /* renamed from: a */
    public final C18838b f41707a = new C18838b((String) null);

    /* renamed from: b */
    public final C14077r f41708b = new C14077r(2786);

    /* renamed from: c */
    public boolean f41709c;

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        int read = ((C18346e) iVar).read(this.f41708b.f30986a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f41708b.mo46935z(0);
        this.f41708b.mo46934y(read);
        if (!this.f41709c) {
            this.f41707a.f41723l = 0;
            this.f41709c = true;
        }
        this.f41707a.mo70281a(this.f41708b);
        return 0;
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41707a.mo70283d(jVar, new C18848e0.C18852d(0, 1));
        jVar.mo4163p();
        jVar.mo4162l(new C18364t.C18366b(-9223372036854775807L));
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f41709c = false;
        this.f41707a.mo70282c();
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        C18346e eVar;
        int i;
        C14077r rVar = new C14077r(10);
        int i2 = 0;
        while (true) {
            eVar = (C18346e) iVar;
            eVar.mo69872c(rVar.f30986a, 0, 10, false);
            rVar.mo46935z(0);
            if (rVar.mo46927r() != 4801587) {
                break;
            }
            rVar.mo46909A(3);
            int o = rVar.mo46924o();
            i2 += o + 10;
            eVar.mo69880k(o, false);
        }
        eVar.f40296f = 0;
        eVar.mo69880k(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            eVar.mo69872c(rVar.f30986a, 0, 6, false);
            rVar.mo46935z(0);
            if (rVar.mo46930u() != 2935) {
                eVar.f40296f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                eVar.mo69880k(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f30986a;
                if (bArr.length < 6) {
                    i = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        i = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b = bArr[4];
                        i = C18164b.m30678a((b & 192) >> 6, b & 63);
                    }
                }
                if (i == -1) {
                    return false;
                }
                eVar.mo69880k(i - 6, false);
            }
        }
    }

    public final void release() {
    }
}
