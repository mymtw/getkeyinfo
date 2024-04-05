package p713xl;

import android.support.p013v4.media.C0072d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p567fm.C17760g;
import p705wl.C18726a;
import p705wl.C18727b;
import p705wl.C18739k;
import p705wl.C18742l;

/* renamed from: xl.b */
public final class C18789b implements C18742l<C18726a, C18726a> {

    /* renamed from: a */
    public static final Logger f41655a = Logger.getLogger(C18789b.class.getName());

    /* renamed from: xl.b$a */
    public static class C18790a implements C18726a {

        /* renamed from: a */
        public final C18739k<C18726a> f41656a;

        public C18790a(C18739k kVar) {
            this.f41656a = kVar;
        }

        /* renamed from: a */
        public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return C17760g.m29780a(this.f41656a.f41510b.mo70229a(), ((C18726a) this.f41656a.f41510b.f41512a).mo46853a(bArr, bArr2));
        }

        /* renamed from: b */
        public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C18739k.C18740a aVar : this.f41656a.mo70228a(copyOfRange)) {
                    try {
                        return ((C18726a) aVar.f41512a).mo46854b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        Logger logger = C18789b.f41655a;
                        StringBuilder h = C0072d.m201h("ciphertext prefix matches a key, but cannot decrypt: ");
                        h.append(e.toString());
                        logger.info(h.toString());
                    }
                }
            }
            for (C18739k.C18740a aVar2 : this.f41656a.mo70228a(C18727b.f41497a)) {
                try {
                    return ((C18726a) aVar2.f41512a).mo46854b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: a */
    public final Object mo46971a(C18739k kVar) throws GeneralSecurityException {
        return new C18790a(kVar);
    }

    /* renamed from: b */
    public final Class<C18726a> mo46972b() {
        return C18726a.class;
    }

    /* renamed from: c */
    public final Class<C18726a> mo46973c() {
        return C18726a.class;
    }
}
