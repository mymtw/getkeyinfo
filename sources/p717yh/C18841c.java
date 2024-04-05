package p717yh;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p717yh.C18848e0;

/* renamed from: yh.c */
public final class C18841c implements C18349h {

    /* renamed from: a */
    public final C18843d f41728a = new C18843d((String) null);

    /* renamed from: b */
    public final C14077r f41729b = new C14077r((int) PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);

    /* renamed from: c */
    public boolean f41730c;

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        int read = ((C18346e) iVar).read(this.f41729b.f30986a, 0, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
        if (read == -1) {
            return -1;
        }
        this.f41729b.mo46935z(0);
        this.f41729b.mo46934y(read);
        if (!this.f41730c) {
            this.f41728a.f41752m = 0;
            this.f41730c = true;
        }
        this.f41728a.mo70281a(this.f41729b);
        return 0;
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41728a.mo70283d(jVar, new C18848e0.C18852d(0, 1));
        jVar.mo4163p();
        jVar.mo4162l(new C18364t.C18366b(-9223372036854775807L));
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f41730c = false;
        this.f41728a.mo70282c();
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
            int i5 = 7;
            eVar.mo69872c(rVar.f30986a, 0, 7, false);
            rVar.mo46935z(0);
            int u = rVar.mo46930u();
            if (u == 44096 || u == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f30986a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (b == 65535) {
                        b = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (u == 44097) {
                        i5 += 2;
                    }
                    i = b + i5;
                }
                if (i == -1) {
                    return false;
                }
                eVar.mo69880k(i - 7, false);
            } else {
                eVar.f40296f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                eVar.mo69880k(i4, false);
                i3 = 0;
            }
        }
    }

    public final void release() {
    }
}
