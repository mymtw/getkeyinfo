package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17639i0;
import p551dm.C17645j0;
import p567fm.C17776s;
import p567fm.C17778t;
import p567fm.C17780v;
import p705wl.C18726a;
import p705wl.C18731e;

/* renamed from: xl.l */
public final class C18816l extends C18731e<C17639i0> {

    /* renamed from: xl.l$a */
    public class C18817a extends C18731e.C18733b<C18726a, C17639i0> {
        public C18817a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            return new C17780v(((C17639i0) obj).mo68942w().toByteArray());
        }
    }

    /* renamed from: xl.l$b */
    public class C18818b extends C18731e.C18732a<C17645j0, C17639i0> {
        public C18818b() {
            super(C17645j0.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17645j0 j0Var2 = (C17645j0) j0Var;
            C17639i0.C17641b y = C17639i0.m29576y();
            C18816l.this.getClass();
            y.mo58540o();
            C17639i0.m29574u((C17639i0) y.f36539c);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(32));
            y.mo58540o();
            C17639i0.m29575v((C17639i0) y.f36539c, copyFrom);
            return (C17639i0) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17645j0.m29587u(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17645j0 j0Var2 = (C17645j0) j0Var;
        }
    }

    public C18816l() {
        super(C17639i0.class, new C18817a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17645j0, C17639i0> mo46963c() {
        return new C18818b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17639i0.m29577z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17639i0 i0Var = (C17639i0) j0Var;
        C17778t.m29819c(i0Var.mo68943x());
        if (i0Var.mo68942w().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
