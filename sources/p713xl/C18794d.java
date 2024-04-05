package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17618f;
import p551dm.C17624g;
import p551dm.C17630h;
import p567fm.C17747a;
import p567fm.C17771o;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18731e;

/* renamed from: xl.d */
public final class C18794d extends C18731e<C17618f> {

    /* renamed from: xl.d$a */
    public class C18795a extends C18731e.C18733b<C17771o, C17618f> {
        public C18795a() {
            super(C17771o.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17618f fVar = (C17618f) obj;
            return new C17747a(fVar.mo68931z().mo68938v(), fVar.mo68930y().toByteArray());
        }
    }

    /* renamed from: xl.d$b */
    public class C18796b extends C18731e.C18732a<C17624g, C17618f> {
        public C18796b() {
            super(C17624g.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17624g gVar = (C17624g) j0Var;
            C17618f.C17620b B = C17618f.m29526B();
            C17630h w = gVar.mo68935w();
            B.mo58540o();
            C17618f.m29530v((C17618f) B.f36539c, w);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(gVar.mo68934v()));
            B.mo58540o();
            C17618f.m29531w((C17618f) B.f36539c, copyFrom);
            C18794d.this.getClass();
            B.mo58540o();
            C17618f.m29529u((C17618f) B.f36539c);
            return (C17618f) B.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17624g.m29547x(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17624g gVar = (C17624g) j0Var;
            C17778t.m29817a(gVar.mo68934v());
            C18794d dVar = C18794d.this;
            C17630h w = gVar.mo68935w();
            dVar.getClass();
            if (w.mo68938v() < 12 || w.mo68938v() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }

    public C18794d() {
        super(C17618f.class, new C18795a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17624g, C17618f> mo46963c() {
        return new C18796b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17618f.m29527C(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17618f fVar = (C17618f) j0Var;
        C17778t.m29819c(fVar.mo68929A());
        C17778t.m29817a(fVar.mo68930y().size());
        C17630h z = fVar.mo68931z();
        if (z.mo68938v() < 12 || z.mo68938v() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
