package p713xl;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p551dm.C17636i;
import p551dm.C17642j;
import p551dm.C17648k;
import p567fm.C17749b;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;
import p705wl.C18731e;

/* renamed from: xl.e */
public final class C18797e extends C18731e<C17636i> {

    /* renamed from: xl.e$a */
    public class C18798a extends C18731e.C18733b<C18726a, C17636i> {
        public C18798a() {
            super(C18726a.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17636i iVar = (C17636i) obj;
            return new C17749b(iVar.mo68940y().mo68946v(), iVar.mo68939x().toByteArray());
        }
    }

    /* renamed from: xl.e$b */
    public class C18799b extends C18731e.C18732a<C17642j, C17636i> {
        public C18799b() {
            super(C17642j.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17642j jVar = (C17642j) j0Var;
            C17636i.C17638b A = C17636i.m29563A();
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(jVar.mo68944u()));
            A.mo58540o();
            C17636i.m29568w((C17636i) A.f36539c, copyFrom);
            C17648k v = jVar.mo68945v();
            A.mo58540o();
            C17636i.m29567v((C17636i) A.f36539c, v);
            C18797e.this.getClass();
            A.mo58540o();
            C17636i.m29566u((C17636i) A.f36539c);
            return (C17636i) A.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17642j.m29582w(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17642j jVar = (C17642j) j0Var;
            C17778t.m29817a(jVar.mo68944u());
            if (jVar.mo68945v().mo68946v() != 12 && jVar.mo68945v().mo68946v() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C18797e() {
        super(C17636i.class, new C18798a());
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17642j, C17636i> mo46963c() {
        return new C18799b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17636i.m29564B(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        C17636i iVar = (C17636i) j0Var;
        C17778t.m29819c(iVar.mo68941z());
        C17778t.m29817a(iVar.mo68939x().size());
        if (iVar.mo68940y().mo68946v() != 12 && iVar.mo68940y().mo68946v() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
