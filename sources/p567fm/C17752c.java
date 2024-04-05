package p567fm;

import android.support.p013v4.media.C0072d;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import p705wl.C18747p;

/* renamed from: fm.c */
public final class C17752c implements C18747p {

    /* renamed from: a */
    public final int f38584a;

    public C17752c(int i, int i2, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            StringBuilder h = C0072d.m201h("ikm too short, must be >= ");
            h.append(Math.max(16, i));
            throw new InvalidAlgorithmParameterException(h.toString());
        }
        C17778t.m29817a(i);
        if (i2 > this.f38584a + 1 + 7 + 0 + 16) {
            Arrays.copyOf(bArr, bArr.length);
            this.f38584a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }
}
