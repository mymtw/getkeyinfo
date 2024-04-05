package p559em;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import p551dm.C17651l;
import p551dm.C17654m;
import p551dm.C17657n;
import p567fm.C17752c;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18731e;
import p705wl.C18747p;

/* renamed from: em.a */
public final class C17722a extends C18731e<C17651l> {

    /* renamed from: em.a$a */
    public class C17723a extends C18731e.C18733b<C18747p, C17651l> {
        public C17723a() {
            super(C18747p.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17651l lVar = (C17651l) obj;
            byte[] byteArray = lVar.mo68947x().toByteArray();
            HashType A = lVar.mo68948y().mo68952A();
            int i = C17725b.f38526a[A.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return new C17752c(lVar.mo68948y().mo68954z(), lVar.mo68948y().mo68953x(), byteArray);
            }
            throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + A);
        }
    }

    /* renamed from: em.a$b */
    public class C17724b extends C18731e.C18732a<C17654m, C17651l> {
        public C17724b() {
            super(C17654m.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17654m mVar = (C17654m) j0Var;
            C17651l.C17653b A = C17651l.m29593A();
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(mVar.mo68950w()));
            A.mo58540o();
            C17651l.m29598w((C17651l) A.f36539c, copyFrom);
            C17657n x = mVar.mo68951x();
            A.mo58540o();
            C17651l.m29597v((C17651l) A.f36539c, x);
            C17722a.this.getClass();
            A.mo58540o();
            C17651l.m29596u((C17651l) A.f36539c);
            return (C17651l) A.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17654m.m29607z(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17654m mVar = (C17654m) j0Var;
            if (mVar.mo68950w() >= 16) {
                C17722a.m29719g(mVar.mo68951x());
                return;
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }
    }

    public C17722a() {
        super(C17651l.class, new C17723a());
    }

    /* renamed from: g */
    public static void m29719g(C17657n nVar) throws GeneralSecurityException {
        C17778t.m29817a(nVar.mo68954z());
        if (nVar.mo68952A() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (nVar.mo68953x() < nVar.mo68954z() + 7 + 16 + 2) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17654m, C17651l> mo46963c() {
        return new C17724b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17651l.m29594B(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17651l lVar = (C17651l) j0Var;
        C17778t.m29819c(lVar.mo68949z());
        m29719g(lVar.mo68948y());
    }
}
