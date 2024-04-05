package p567fm;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: fm.i */
public abstract class C17762i implements C17771o {

    /* renamed from: c */
    public static final int[] f38602c = m29789k(new byte[]{101, Framer.EXIT_FRAME_PREFIX, 112, 97, 110, 100, 32, 51, Framer.STDERR_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public int[] f38603a;

    /* renamed from: b */
    public final int f38604b;

    public C17762i(int i, byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f38603a = m29789k(bArr);
            this.f38604b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: i */
    public static void m29787i(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> -16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> -12) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> -8) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> -7) | (i15 << 7);
    }

    /* renamed from: j */
    public static void m29788j(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m29787i(0, 4, 8, 12, iArr2);
            m29787i(1, 5, 9, 13, iArr2);
            m29787i(2, 6, 10, 14, iArr2);
            m29787i(3, 7, 11, 15, iArr2);
            m29787i(0, 5, 10, 15, iArr2);
            m29787i(1, 6, 11, 12, iArr2);
            m29787i(2, 7, 8, 13, iArr2);
            m29787i(3, 4, 9, 14, iArr2);
        }
    }

    /* renamed from: k */
    public static int[] m29789k(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public final byte[] mo68992a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - mo69004g()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo69004g() + bArr.length);
            mo69007f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo68993b(byte[] bArr) throws GeneralSecurityException {
        return mo69006e(ByteBuffer.wrap(bArr));
    }

    /* renamed from: c */
    public final ByteBuffer mo69005c(int i, byte[] bArr) {
        int[] d = mo69003d(i, m29789k(bArr));
        int[] iArr = (int[]) d.clone();
        m29788j(iArr);
        for (int i2 = 0; i2 < d.length; i2++) {
            d[i2] = d[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d, 0, 16);
        return order;
    }

    /* renamed from: d */
    public abstract int[] mo69003d(int i, int[] iArr);

    /* renamed from: e */
    public final byte[] mo69006e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= mo69004g()) {
            byte[] bArr = new byte[mo69004g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            mo69008h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: f */
    public final void mo69007f(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo69004g() >= bArr.length) {
            byte[] a = C17776s.m29816a(mo69004g());
            byteBuffer.put(a);
            mo69008h(a, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: g */
    public abstract int mo69004g();

    /* renamed from: h */
    public final void mo69008h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer c = mo69005c(this.f38604b + i2, bArr);
            if (i2 == i - 1) {
                C17760g.m29782c(byteBuffer, byteBuffer2, c, remaining % 64);
            } else {
                C17760g.m29782c(byteBuffer, byteBuffer2, c, 64);
            }
        }
    }
}
