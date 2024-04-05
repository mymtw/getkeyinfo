package p709xh;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18346e;

/* renamed from: xh.e */
public final class C18763e {

    /* renamed from: a */
    public int f41567a;

    /* renamed from: b */
    public long f41568b;

    /* renamed from: c */
    public int f41569c;

    /* renamed from: d */
    public int f41570d;

    /* renamed from: e */
    public int f41571e;

    /* renamed from: f */
    public final int[] f41572f = new int[255];

    /* renamed from: g */
    public final C14077r f41573g = new C14077r(255);

    /* renamed from: a */
    public final boolean mo70254a(C18346e eVar, boolean z) throws IOException {
        boolean z2;
        this.f41567a = 0;
        this.f41568b = 0;
        this.f41569c = 0;
        this.f41570d = 0;
        this.f41571e = 0;
        this.f41573g.mo46932w(27);
        try {
            z2 = eVar.mo69872c(this.f41573g.f30986a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (!z2 || this.f41573g.mo46926q() != 1332176723) {
            return false;
        }
        if (this.f41573g.mo46925p() == 0) {
            this.f41567a = this.f41573g.mo46925p();
            C14077r rVar = this.f41573g;
            byte[] bArr = rVar.f30986a;
            int i = rVar.f30987b;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            rVar.f30987b = i8 + 1;
            this.f41568b = ((((long) bArr[i8]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48);
            rVar.mo46916g();
            this.f41573g.mo46916g();
            this.f41573g.mo46916g();
            int p = this.f41573g.mo46925p();
            this.f41569c = p;
            this.f41570d = p + 27;
            this.f41573g.mo46932w(p);
            eVar.mo69872c(this.f41573g.f30986a, 0, this.f41569c, false);
            for (int i9 = 0; i9 < this.f41569c; i9++) {
                this.f41572f[i9] = this.f41573g.mo46925p();
                this.f41571e += this.f41572f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new ParserException("unsupported bit stream revision");
        }
    }

    /* renamed from: b */
    public final boolean mo70255b(C18346e eVar, long j) throws IOException {
        int i;
        boolean z;
        C14075p.m21691c(eVar.f40294d == eVar.mo69877h());
        this.f41573g.mo46932w(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && eVar.f40294d + 4 >= j) {
                break;
            }
            try {
                z = eVar.mo69872c(this.f41573g.f30986a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            this.f41573g.mo46935z(0);
            if (this.f41573g.mo46926q() == 1332176723) {
                eVar.f40296f = 0;
                return true;
            }
            eVar.mo69879j(1);
        }
        do {
            if ((i != 0 && eVar.f40294d >= j) || eVar.mo69884o() == -1) {
                return false;
            }
            break;
        } while (eVar.mo69884o() == -1);
        return false;
    }
}
