package p729zl;

import android.support.p013v4.media.C0072d;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import p551dm.C17672s;
import p551dm.C17675t;
import p567fm.C17755e;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18729c;
import p705wl.C18731e;

/* renamed from: zl.a */
public final class C18963a extends C18731e<C17672s> {

    /* renamed from: zl.a$a */
    public class C18964a extends C18731e.C18733b<C18729c, C17672s> {
        public C18964a() {
            super(C18729c.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            return new C17755e(((C17672s) obj).mo68961w().toByteArray());
        }
    }

    /* renamed from: zl.a$b */
    public class C18965b extends C18731e.C18732a<C17675t, C17672s> {
        public C18965b() {
            super(C17675t.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17672s.C17674b y = C17672s.m29650y();
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(((C17675t) j0Var).mo68963v()));
            y.mo58540o();
            C17672s.m29649v((C17672s) y.f36539c, copyFrom);
            C18963a.this.getClass();
            y.mo58540o();
            C17672s.m29648u((C17672s) y.f36539c);
            return (C17672s) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17675t.m29658x(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17675t tVar = (C17675t) j0Var;
            if (tVar.mo68963v() != 64) {
                StringBuilder h = C0072d.m201h("invalid key size: ");
                h.append(tVar.mo68963v());
                h.append(". Valid keys must have 64 bytes.");
                throw new InvalidAlgorithmParameterException(h.toString());
            }
        }
    }

    public C18963a() {
        super(C17672s.class, new C18964a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17675t, C17672s> mo46963c() {
        return new C18965b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17672s.m29651z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17672s sVar = (C17672s) j0Var;
        C17778t.m29819c(sVar.mo68962x());
        if (sVar.mo68961w().size() != 64) {
            StringBuilder h = C0072d.m201h("invalid key size: ");
            h.append(sVar.mo68961w().size());
            h.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(h.toString());
        }
    }
}
