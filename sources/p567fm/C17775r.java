package p567fm;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p523cm.C14171a;
import p705wl.C18738j;

@Immutable
/* renamed from: fm.r */
public final class C17775r implements C18738j {

    /* renamed from: a */
    public final C14171a f38625a;

    /* renamed from: b */
    public final int f38626b;

    public C17775r(C14171a aVar, int i) throws GeneralSecurityException {
        this.f38625a = aVar;
        this.f38626b = i;
        if (i >= 10) {
            aVar.mo47113a(i, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo46974a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C17760g.m29781b(mo46975b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public final byte[] mo46975b(byte[] bArr) throws GeneralSecurityException {
        return this.f38625a.mo47113a(this.f38626b, bArr);
    }
}
