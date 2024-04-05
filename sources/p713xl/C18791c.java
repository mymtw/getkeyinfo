package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p516bm.C14095b;
import p551dm.C17606d;
import p551dm.C17612e;
import p551dm.C17618f;
import p551dm.C17624g;
import p551dm.C17630h;
import p551dm.C17687x;
import p551dm.C17690y;
import p551dm.C17693z;
import p567fm.C17765l;
import p567fm.C17771o;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;
import p705wl.C18738j;

/* renamed from: xl.c */
public final class C18791c extends C18731e<C17606d> {

    /* renamed from: xl.c$a */
    public class C18792a extends C18731e.C18733b<C18726a, C17606d> {
        public C18792a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17606d dVar = (C17606d) obj;
            return new C17765l((C17771o) new C18794d().mo70222b(dVar.mo68921x(), C17771o.class), (C18738j) new C14095b().mo70222b(dVar.mo68922y(), C18738j.class), dVar.mo68922y().mo68969z().mo68973w());
        }
    }

    /* renamed from: xl.c$b */
    public class C18793b extends C18731e.C18732a<C17612e, C17606d> {
        public C18793b() {
            super(C17612e.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17612e eVar = (C17612e) j0Var;
            new C18794d();
            C17624g u = eVar.mo68926u();
            C17618f.C17620b B = C17618f.m29526B();
            C17630h w = u.mo68935w();
            B.mo58540o();
            C17618f.m29530v((C17618f) B.f36539c, w);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(u.mo68934v()));
            B.mo58540o();
            C17618f.m29531w((C17618f) B.f36539c, copyFrom);
            B.mo58540o();
            C17618f.m29529u((C17618f) B.f36539c);
            new C14095b();
            C17690y v = eVar.mo68927v();
            C17687x.C17689b B2 = C17687x.m29679B();
            B2.mo58540o();
            C17687x.m29682u((C17687x) B2.f36539c);
            C17693z w2 = v.mo68971w();
            B2.mo58540o();
            C17687x.m29683v((C17687x) B2.f36539c, w2);
            ByteString copyFrom2 = ByteString.copyFrom(C17776s.m29816a(v.mo68970v()));
            B2.mo58540o();
            C17687x.m29684w((C17687x) B2.f36539c, copyFrom2);
            C17606d.C17608b A = C17606d.m29498A();
            A.mo58540o();
            C17606d.m29502v((C17606d) A.f36539c, (C17618f) B.mo58538l());
            A.mo58540o();
            C17606d.m29503w((C17606d) A.f36539c, (C17687x) B2.mo58538l());
            C18791c.this.getClass();
            A.mo58540o();
            C17606d.m29501u((C17606d) A.f36539c);
            return (C17606d) A.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17612e.m29517w(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17612e eVar = (C17612e) j0Var;
            new C18794d();
            C17624g u = eVar.mo68926u();
            C17778t.m29817a(u.mo68934v());
            C17630h w = u.mo68935w();
            if (w.mo68938v() < 12 || w.mo68938v() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            new C14095b();
            C17690y v = eVar.mo68927v();
            if (v.mo68970v() >= 16) {
                C14095b.m21822h(v.mo68971w());
                C17778t.m29817a(eVar.mo68926u().mo68934v());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    public C18791c() {
        super(C17606d.class, new C18792a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17612e, C17606d> mo46963c() {
        return new C18793b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17606d.m29499B(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17606d dVar = (C17606d) j0Var;
        C17778t.m29819c(dVar.mo68923z());
        new C18794d();
        C17618f x = dVar.mo68921x();
        C17778t.m29819c(x.mo68929A());
        C17778t.m29817a(x.mo68930y().size());
        C17630h z = x.mo68931z();
        if (z.mo68938v() < 12 || z.mo68938v() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
        new C14095b();
        C14095b.m21821g(dVar.mo68922y());
    }
}
