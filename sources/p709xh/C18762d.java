package p709xh;

import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18346e;

/* renamed from: xh.d */
public final class C18762d {

    /* renamed from: a */
    public final C18763e f41562a = new C18763e();

    /* renamed from: b */
    public final C14077r f41563b = new C14077r(0, new byte[65025]);

    /* renamed from: c */
    public int f41564c = -1;

    /* renamed from: d */
    public int f41565d;

    /* renamed from: e */
    public boolean f41566e;

    /* renamed from: a */
    public final boolean mo70253a(C18346e eVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.f41566e) {
            this.f41566e = false;
            this.f41563b.mo46932w(0);
        }
        while (true) {
            boolean z = true;
            if (this.f41566e) {
                return true;
            }
            if (this.f41564c < 0) {
                if (!this.f41562a.mo70255b(eVar, -1) || !this.f41562a.mo70254a(eVar, true)) {
                    return false;
                }
                C18763e eVar2 = this.f41562a;
                int i4 = eVar2.f41570d;
                if ((eVar2.f41567a & 1) == 1 && this.f41563b.f30988c == 0) {
                    this.f41565d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f41565d;
                        int i7 = 0 + i6;
                        C18763e eVar3 = this.f41562a;
                        if (i7 >= eVar3.f41569c) {
                            break;
                        }
                        int[] iArr = eVar3.f41572f;
                        this.f41565d = i6 + 1;
                        i3 = iArr[i7];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f41565d + 0;
                } else {
                    i2 = 0;
                }
                eVar.mo69879j(i4);
                this.f41564c = i2;
            }
            int i8 = this.f41564c;
            this.f41565d = 0;
            int i9 = 0;
            do {
                int i10 = this.f41565d;
                int i11 = i8 + i10;
                C18763e eVar4 = this.f41562a;
                if (i11 >= eVar4.f41569c) {
                    break;
                }
                int[] iArr2 = eVar4.f41572f;
                this.f41565d = i10 + 1;
                i = iArr2[i11];
                i9 += i;
            } while (i == 255);
            int i12 = this.f41564c + this.f41565d;
            if (i9 > 0) {
                C14077r rVar = this.f41563b;
                rVar.mo46910a(rVar.f30988c + i9);
                C14077r rVar2 = this.f41563b;
                eVar.mo69874g(rVar2.f30986a, rVar2.f30988c, i9, false);
                C14077r rVar3 = this.f41563b;
                rVar3.mo46934y(rVar3.f30988c + i9);
                if (this.f41562a.f41572f[i12 - 1] == 255) {
                    z = false;
                }
                this.f41566e = z;
            }
            if (i12 == this.f41562a.f41569c) {
                i12 = -1;
            }
            this.f41564c = i12;
        }
        return false;
    }
}
