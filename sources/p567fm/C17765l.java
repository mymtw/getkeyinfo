package p567fm;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p705wl.C18726a;
import p705wl.C18738j;

/* renamed from: fm.l */
public final class C17765l implements C18726a {

    /* renamed from: a */
    public final C17771o f38607a;

    /* renamed from: b */
    public final C18738j f38608b;

    /* renamed from: c */
    public final int f38609c;

    public C17765l(C17771o oVar, C18738j jVar, int i) {
        this.f38607a = oVar;
        this.f38608b = jVar;
        this.f38609c = i;
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f38607a.mo68992a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return C17760g.m29780a(a, this.f38608b.mo46975b(C17760g.m29780a(bArr2, a, copyOf)));
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f38609c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f38609c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f38608b.mo46974a(copyOfRange2, C17760g.m29780a(bArr2, copyOfRange, copyOf));
            return this.f38607a.mo68993b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
