package p516bm;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p567fm.C17760g;
import p705wl.C18727b;
import p705wl.C18738j;
import p705wl.C18739k;
import p705wl.C18742l;

/* renamed from: bm.d */
public final class C14100d implements C18742l<C18738j, C18738j> {

    /* renamed from: a */
    public static final Logger f31052a = Logger.getLogger(C14100d.class.getName());

    /* renamed from: bm.d$a */
    public static class C14101a implements C18738j {

        /* renamed from: a */
        public final C18739k<C18738j> f31053a;

        /* renamed from: b */
        public final byte[] f31054b = {0};

        public C14101a(C18739k kVar) {
            this.f31053a = kVar;
        }

        /* renamed from: a */
        public final void mo46974a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C18739k.C18740a next : this.f31053a.mo70228a(copyOf)) {
                    try {
                        if (next.f41515d.equals(OutputPrefixType.LEGACY)) {
                            ((C18738j) next.f41512a).mo46974a(copyOfRange, C17760g.m29780a(bArr2, this.f31054b));
                            return;
                        }
                        ((C18738j) next.f41512a).mo46974a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger logger = C14100d.f31052a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (C18739k.C18740a aVar : this.f31053a.mo70228a(C18727b.f41497a)) {
                    try {
                        ((C18738j) aVar.f41512a).mo46974a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        /* renamed from: b */
        public final byte[] mo46975b(byte[] bArr) throws GeneralSecurityException {
            if (this.f31053a.f41510b.f41515d.equals(OutputPrefixType.LEGACY)) {
                return C17760g.m29780a(this.f31053a.f41510b.mo70229a(), ((C18738j) this.f31053a.f41510b.f41512a).mo46975b(C17760g.m29780a(bArr, this.f31054b)));
            }
            return C17760g.m29780a(this.f31053a.f41510b.mo70229a(), ((C18738j) this.f31053a.f41510b.f41512a).mo46975b(bArr));
        }
    }

    /* renamed from: a */
    public final Object mo46971a(C18739k kVar) throws GeneralSecurityException {
        return new C14101a(kVar);
    }

    /* renamed from: b */
    public final Class<C18738j> mo46972b() {
        return C18738j.class;
    }

    /* renamed from: c */
    public final Class<C18738j> mo46973c() {
        return C18738j.class;
    }
}
