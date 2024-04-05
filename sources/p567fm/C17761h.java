package p567fm;

import java.security.InvalidKeyException;

/* renamed from: fm.h */
public final class C17761h extends C17762i {
    public C17761h(int i, byte[] bArr) throws InvalidKeyException {
        super(i, bArr);
    }

    /* renamed from: d */
    public final int[] mo69003d(int i, int[] iArr) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.f38603a;
            int[] iArr4 = C17762i.f38602c;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* renamed from: g */
    public final int mo69004g() {
        return 12;
    }
}
