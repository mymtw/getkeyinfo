package p223r5;

import androidx.datastore.preferences.protobuf.C2606m;
import p266v6.C8207a;

/* renamed from: r5.t */
public final class C7773t extends C7770q {

    /* renamed from: b */
    public final byte[] f17202b;

    public C7773t(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f17202b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    /* renamed from: a */
    public final C7774u mo20325a() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.f17202b;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        byte[] bArr3 = new byte[32];
        int[] iArr3 = C8207a.f18014a;
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        bArr3[0] = (byte) (bArr3[0] & 248);
        byte b = (byte) (bArr3[31] & Byte.MAX_VALUE);
        bArr3[31] = b;
        bArr3[31] = (byte) (b | 64);
        C8207a.C8208a aVar = new C8207a.C8208a();
        C8207a.m16488d(bArr3, aVar);
        C2606m.m6145k(0, aVar.f18022b, iArr);
        C2606m.m6145k(0, aVar.f18023c, iArr2);
        C2606m.m6150p(iArr2, iArr, iArr, iArr2);
        C2606m.m6157w(iArr2, iArr2);
        C2606m.m6109D(iArr, iArr2, iArr);
        C2606m.m6127V(iArr);
        C2606m.m6147m(iArr, 0, bArr, 0);
        C2606m.m6147m(iArr, 5, bArr, 16);
        return new C7774u(0, bArr);
    }
}
