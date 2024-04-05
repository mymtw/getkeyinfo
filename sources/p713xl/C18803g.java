package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17666q;
import p551dm.C17669r;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;
import p721yl.C18893a;

/* renamed from: xl.g */
public final class C18803g extends C18731e<C17666q> {

    /* renamed from: xl.g$a */
    public class C18804a extends C18731e.C18733b<C18726a, C17666q> {
        public C18804a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            return new C18893a(((C17666q) obj).mo68958w().toByteArray());
        }
    }

    /* renamed from: xl.g$b */
    public class C18805b extends C18731e.C18732a<C17669r, C17666q> {
        public C18805b() {
            super(C17669r.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17666q.C17668b y = C17666q.m29638y();
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(((C17669r) j0Var).mo68960u()));
            y.mo58540o();
            C17666q.m29637v((C17666q) y.f36539c, copyFrom);
            C18803g.this.getClass();
            y.mo58540o();
            C17666q.m29636u((C17666q) y.f36539c);
            return (C17666q) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17669r.m29644v(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17778t.m29817a(((C17669r) j0Var).mo68960u());
        }
    }

    public C18803g() {
        super(C17666q.class, new C18804a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17669r, C17666q> mo46963c() {
        return new C18805b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17666q.m29639z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17666q qVar = (C17666q) j0Var;
        C17778t.m29819c(qVar.mo68959x());
        C17778t.m29817a(qVar.mo68958w().size());
    }
}
