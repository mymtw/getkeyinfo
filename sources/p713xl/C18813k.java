package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17621f0;
import p551dm.C17627g0;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;
import p705wl.C18737i;

/* renamed from: xl.k */
public final class C18813k extends C18731e<C17621f0> {

    /* renamed from: xl.k$a */
    public class C18814a extends C18731e.C18733b<C18726a, C17621f0> {
        public C18814a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17621f0 f0Var = (C17621f0) obj;
            String w = f0Var.mo68932w().mo68937w();
            return new C18812j(f0Var.mo68932w().mo68936v(), C18737i.m31599a(w).mo46858b(w));
        }
    }

    /* renamed from: xl.k$b */
    public class C18815b extends C18731e.C18732a<C17627g0, C17621f0> {
        public C18815b() {
            super(C17627g0.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17621f0.C17623b y = C17621f0.m29540y();
            y.mo58540o();
            C17621f0.m29539v((C17621f0) y.f36539c, (C17627g0) j0Var);
            C18813k.this.getClass();
            y.mo58540o();
            C17621f0.m29538u((C17621f0) y.f36539c);
            return (C17621f0) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17627g0.m29553x(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17627g0 g0Var = (C17627g0) j0Var;
        }
    }

    public C18813k() {
        super(C17621f0.class, new C18814a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17627g0, C17621f0> mo46963c() {
        return new C18815b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17621f0.m29541z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17778t.m29819c(((C17621f0) j0Var).mo68933x());
    }
}
