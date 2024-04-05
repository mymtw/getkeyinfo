package p223r5;

import androidx.preference.C3039b;
import p266v6.C8210b;

/* renamed from: r5.v */
public final class C7775v extends C7770q {

    /* renamed from: b */
    public final byte[] f17204b;

    public C7775v(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.f17204b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 56);
    }

    /* renamed from: a */
    public final C7776w mo20326a() {
        byte[] bArr = new byte[56];
        byte[] bArr2 = this.f17204b;
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        byte[] bArr3 = new byte[57];
        int[] iArr3 = C8210b.f18030a;
        System.arraycopy(bArr2, 0, bArr3, 0, 56);
        bArr3[0] = (byte) (bArr3[0] & 252);
        bArr3[55] = (byte) (bArr3[55] | 128);
        bArr3[56] = 0;
        C8210b.C8211a aVar = new C8210b.C8211a();
        C8210b.m16492c(bArr3, aVar);
        C3039b.m7174m(0, aVar.f18035a, iArr);
        C3039b.m7174m(0, aVar.f18036b, iArr2);
        C3039b.m7181q(iArr, iArr);
        C3039b.m7145O(iArr, iArr2, iArr);
        C3039b.m7158b0(iArr, iArr);
        C3039b.m7177o(iArr, 1);
        C3039b.m7177o(iArr, -1);
        C3039b.m7176n(bArr, iArr);
        return new C7776w(0, bArr);
    }
}
