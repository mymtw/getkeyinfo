package p756lr;

import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.y */
public final class C19915y {

    /* renamed from: a */
    public final byte[] f43920a;

    /* renamed from: b */
    public int f43921b;

    /* renamed from: c */
    public int f43922c;

    /* renamed from: d */
    public boolean f43923d;

    /* renamed from: e */
    public boolean f43924e;

    /* renamed from: f */
    public C19915y f43925f;

    /* renamed from: g */
    public C19915y f43926g;

    public C19915y() {
        this.f43920a = new byte[8192];
        this.f43924e = true;
        this.f43923d = false;
    }

    /* renamed from: a */
    public final C19915y mo72806a() {
        C19915y yVar = this.f43925f;
        if (yVar == this) {
            yVar = null;
        }
        C19915y yVar2 = this.f43926g;
        C19383o.m32794d(yVar2);
        yVar2.f43925f = this.f43925f;
        C19915y yVar3 = this.f43925f;
        C19383o.m32794d(yVar3);
        yVar3.f43926g = this.f43926g;
        this.f43925f = null;
        this.f43926g = null;
        return yVar;
    }

    /* renamed from: b */
    public final void mo72807b(C19915y yVar) {
        yVar.f43926g = this;
        yVar.f43925f = this.f43925f;
        C19915y yVar2 = this.f43925f;
        C19383o.m32794d(yVar2);
        yVar2.f43926g = yVar;
        this.f43925f = yVar;
    }

    /* renamed from: c */
    public final C19915y mo72808c() {
        this.f43923d = true;
        return new C19915y(this.f43920a, this.f43921b, this.f43922c, true);
    }

    /* renamed from: d */
    public final void mo72809d(C19915y yVar, int i) {
        if (yVar.f43924e) {
            int i2 = yVar.f43922c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!yVar.f43923d) {
                    int i4 = yVar.f43921b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = yVar.f43920a;
                        C19318k.m32601S0(bArr, 0, i4, bArr, i2);
                        yVar.f43922c -= yVar.f43921b;
                        yVar.f43921b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f43920a;
            byte[] bArr3 = yVar.f43920a;
            int i5 = yVar.f43922c;
            int i6 = this.f43921b;
            C19318k.m32601S0(bArr2, i5, i6, bArr3, i6 + i);
            yVar.f43922c += i;
            this.f43921b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C19915y(byte[] bArr, int i, int i2, boolean z) {
        C19383o.m32797g(bArr, "data");
        this.f43920a = bArr;
        this.f43921b = i;
        this.f43922c = i2;
        this.f43923d = z;
        this.f43924e = false;
    }
}
