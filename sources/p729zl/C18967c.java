package p729zl;

import android.support.p013v4.media.C0072d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p567fm.C17760g;
import p705wl.C18727b;
import p705wl.C18729c;
import p705wl.C18739k;
import p705wl.C18742l;

/* renamed from: zl.c */
public final class C18967c implements C18742l<C18729c, C18729c> {

    /* renamed from: a */
    public static final Logger f42288a = Logger.getLogger(C18967c.class.getName());

    /* renamed from: zl.c$a */
    public static class C18968a implements C18729c {

        /* renamed from: a */
        public C18739k<C18729c> f42289a;

        public C18968a(C18739k<C18729c> kVar) {
            this.f42289a = kVar;
        }

        /* renamed from: a */
        public final byte[] mo69000a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return C17760g.m29780a(this.f42289a.f41510b.mo70229a(), ((C18729c) this.f42289a.f41510b.f41512a).mo69000a(bArr, bArr2));
        }

        /* renamed from: b */
        public final byte[] mo69001b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C18739k.C18740a aVar : this.f42289a.mo70228a(copyOfRange)) {
                    try {
                        return ((C18729c) aVar.f41512a).mo69001b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C18967c.f42288a;
                        StringBuilder h = C0072d.m201h("ciphertext prefix matches a key, but cannot decrypt: ");
                        h.append(e.toString());
                        logger.info(h.toString());
                    }
                }
            }
            for (C18739k.C18740a aVar2 : this.f42289a.mo70228a(C18727b.f41497a)) {
                try {
                    return ((C18729c) aVar2.f41512a).mo69001b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: a */
    public final Object mo46971a(C18739k kVar) throws GeneralSecurityException {
        return new C18968a(kVar);
    }

    /* renamed from: b */
    public final Class<C18729c> mo46972b() {
        return C18729c.class;
    }

    /* renamed from: c */
    public final Class<C18729c> mo46973c() {
        return C18729c.class;
    }
}
