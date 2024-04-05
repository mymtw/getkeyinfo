package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17660o;
import p551dm.C17663p;
import p567fm.C17753d;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;

/* renamed from: xl.f */
public final class C18800f extends C18731e<C17660o> {

    /* renamed from: xl.f$a */
    public class C18801a extends C18731e.C18733b<C18726a, C17660o> {
        public C18801a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            return new C17753d(((C17660o) obj).mo68955w().toByteArray());
        }
    }

    /* renamed from: xl.f$b */
    public class C18802b extends C18731e.C18732a<C17663p, C17660o> {
        public C18802b() {
            super(C17663p.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17660o.C17662b y = C17660o.m29624y();
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(((C17663p) j0Var).mo68957v()));
            y.mo58540o();
            C17660o.m29623v((C17660o) y.f36539c, copyFrom);
            C18800f.this.getClass();
            y.mo58540o();
            C17660o.m29622u((C17660o) y.f36539c);
            return (C17660o) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17663p.m29632x(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17778t.m29817a(((C17663p) j0Var).mo68957v());
        }
    }

    public C18800f() {
        super(C17660o.class, new C18801a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17663p, C17660o> mo46963c() {
        return new C18802b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17660o.m29625z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17660o oVar = (C17660o) j0Var;
        C17778t.m29819c(oVar.mo68956x());
        C17778t.m29817a(oVar.mo68955w().size());
    }
}
