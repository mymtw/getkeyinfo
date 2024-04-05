package p516bm;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17586a;
import p551dm.C17592b;
import p551dm.C17598c;
import p567fm.C17772p;
import p567fm.C17775r;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18731e;
import p705wl.C18738j;

/* renamed from: bm.a */
public final class C14092a extends C18731e<C17586a> {

    /* renamed from: bm.a$a */
    public class C14093a extends C18731e.C18733b<C18738j, C17586a> {
        public C14093a() {
            super(C18738j.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17586a aVar = (C17586a) obj;
            return new C17775r(new C17772p(aVar.mo68910x().toByteArray()), aVar.mo68911y().mo68918v());
        }
    }

    /* renamed from: bm.a$b */
    public class C14094b extends C18731e.C18732a<C17592b, C17586a> {
        public C14094b() {
            super(C17592b.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17592b bVar = (C17592b) j0Var;
            C17586a.C17588b A = C17586a.m29453A();
            A.mo58540o();
            C17586a.m29456u((C17586a) A.f36539c);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(bVar.mo68916u()));
            A.mo58540o();
            C17586a.m29457v((C17586a) A.f36539c, copyFrom);
            C17598c v = bVar.mo68917v();
            A.mo58540o();
            C17586a.m29458w((C17586a) A.f36539c, v);
            return (C17586a) A.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17592b.m29474w(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17592b bVar = (C17592b) j0Var;
            C14092a.m21811g(bVar.mo68917v());
            if (bVar.mo68916u() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public C14092a() {
        super(C17586a.class, new C14093a());
    }

    /* renamed from: g */
    public static void m21811g(C17598c cVar) throws GeneralSecurityException {
        if (cVar.mo68918v() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.mo68918v() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17592b, C17586a> mo46963c() {
        return new C14094b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17586a.m29454B(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17586a aVar = (C17586a) j0Var;
        C17778t.m29819c(aVar.mo68912z());
        if (aVar.mo68910x().size() == 32) {
            m21811g(aVar.mo68911y());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
