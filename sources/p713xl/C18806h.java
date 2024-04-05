package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17678u;
import p551dm.C17681v;
import p567fm.C17763j;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;

/* renamed from: xl.h */
public final class C18806h extends C18731e<C17678u> {

    /* renamed from: xl.h$a */
    public class C18807a extends C18731e.C18733b<C18726a, C17678u> {
        public C18807a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            return new C17763j(((C17678u) obj).mo68964w().toByteArray());
        }
    }

    /* renamed from: xl.h$b */
    public class C18808b extends C18731e.C18732a<C17681v, C17678u> {
        public C18808b() {
            super(C17681v.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17681v vVar = (C17681v) j0Var;
            C17678u.C17680b y = C17678u.m29664y();
            C18806h.this.getClass();
            y.mo58540o();
            C17678u.m29662u((C17678u) y.f36539c);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(32));
            y.mo58540o();
            C17678u.m29663v((C17678u) y.f36539c, copyFrom);
            return (C17678u) y.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17681v.m29670u(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17681v vVar = (C17681v) j0Var;
        }
    }

    public C18806h() {
        super(C17678u.class, new C18807a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17681v, C17678u> mo46963c() {
        return new C18808b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17678u.m29665z(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17678u uVar = (C17678u) j0Var;
        C17778t.m29819c(uVar.mo68965x());
        if (uVar.mo68964w().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
