package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17609d0;
import p551dm.C17615e0;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;
import p705wl.C18737i;

/* renamed from: xl.i */
public final class C18809i extends C18731e<C17609d0> {

    /* renamed from: xl.i$a */
    public class C18810a extends C18731e.C18733b<C18726a, C17609d0> {
        public C18810a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            String v = ((C17609d0) obj).mo68924w().mo68928v();
            return C18737i.m31599a(v).mo46858b(v);
        }
    }

    /* renamed from: xl.i$b */
    public class C18811b extends C18731e.C18732a<C17615e0, C17609d0> {
        public C18811b() {
            super(C17615e0.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17609d0.C17611b y = C17609d0.m29511y();
            y.mo58540o();
            C17609d0.m29510v((C17609d0) y.f36539c, (C17615e0) j0Var);
            C18809i.this.getClass();
            y.mo58540o();
            C17609d0.m29509u((C17609d0) y.f36539c);
            return (C17609d0) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17615e0.m29523w(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17615e0 e0Var = (C17615e0) j0Var;
        }
    }

    public C18809i() {
        super(C17609d0.class, new C18810a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17615e0, C17609d0> mo46963c() {
        return new C18811b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17609d0.m29512z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17778t.m29819c(((C17609d0) j0Var).mo68925x());
    }
}
