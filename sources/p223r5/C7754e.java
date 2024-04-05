package p223r5;

import androidx.datastore.preferences.protobuf.C2606m;
import p179m5.C7335g;
import p266v6.C8207a;

/* renamed from: r5.e */
public final class C7754e extends C7770q {

    /* renamed from: b */
    public final byte[] f17182b;

    public C7754e(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f17182b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    /* renamed from: a */
    public final C7756f mo20318a() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.f17182b;
        int[] iArr = C8207a.f18014a;
        C7335g gVar = new C7335g();
        byte[] bArr3 = new byte[64];
        gVar.mo19525b(bArr2, 32);
        gVar.mo19526c(bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr3, 0, bArr4, 0, 32);
        bArr4[0] = (byte) (bArr4[0] & 248);
        byte b = (byte) (bArr4[31] & Byte.MAX_VALUE);
        bArr4[31] = b;
        bArr4[31] = (byte) (64 | b);
        C8207a.C8208a aVar = new C8207a.C8208a();
        C8207a.m16488d(bArr4, aVar);
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        C2606m.m6157w(aVar.f18023c, iArr3);
        C2606m.m6109D(aVar.f18021a, iArr3, iArr2);
        C2606m.m6109D(aVar.f18022b, iArr3, iArr3);
        C2606m.m6127V(iArr2);
        C2606m.m6127V(iArr3);
        C2606m.m6147m(iArr3, 0, bArr, 0);
        C2606m.m6147m(iArr3, 5, bArr, 16);
        bArr[31] = (byte) (bArr[31] | ((iArr2[0] & 1) << 7));
        return new C7756f(0, bArr);
    }
}
