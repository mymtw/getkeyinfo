package p223r5;

import androidx.preference.C3039b;
import p179m5.C7336h;
import p266v6.C8210b;

/* renamed from: r5.g */
public final class C7758g extends C7770q {

    /* renamed from: b */
    public final byte[] f17187b;

    public C7758g(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.f17187b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }

    /* renamed from: a */
    public final C7760h mo20319a() {
        byte[] bArr = new byte[57];
        byte[] bArr2 = this.f17187b;
        int[] iArr = C8210b.f18030a;
        C7336h hVar = new C7336h(256);
        byte[] bArr3 = new byte[114];
        hVar.mo19525b(bArr2, 57);
        hVar.mo19522a(114, bArr3);
        byte[] bArr4 = new byte[57];
        System.arraycopy(bArr3, 0, bArr4, 0, 56);
        bArr4[0] = (byte) (bArr4[0] & 252);
        bArr4[55] = (byte) (bArr4[55] | 128);
        bArr4[56] = 0;
        C8210b.C8211a aVar = new C8210b.C8211a();
        C8210b.m16492c(bArr4, aVar);
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        C3039b.m7181q(aVar.f18037c, iArr3);
        C3039b.m7145O(aVar.f18035a, iArr3, iArr2);
        C3039b.m7145O(aVar.f18036b, iArr3, iArr3);
        C3039b.m7177o(iArr2, 1);
        C3039b.m7177o(iArr2, -1);
        C3039b.m7177o(iArr3, 1);
        C3039b.m7177o(iArr3, -1);
        C3039b.m7176n(bArr, iArr3);
        bArr[56] = (byte) ((iArr2[0] & 1) << 7);
        return new C7760h(0, bArr);
    }
}
