package p516bm;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import p551dm.C17687x;
import p551dm.C17690y;
import p551dm.C17693z;
import p567fm.C17773q;
import p567fm.C17775r;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18731e;
import p705wl.C18738j;

/* renamed from: bm.b */
public final class C14095b extends C18731e<C17687x> {

    /* renamed from: bm.b$a */
    public class C14096a extends C18731e.C18733b<C18738j, C17687x> {
        public C14096a() {
            super(C18738j.class);
        }

        /* renamed from: a */
        public final Object mo46967a(Object obj) throws GeneralSecurityException {
            C17687x xVar = (C17687x) obj;
            HashType v = xVar.mo68969z().mo68972v();
            SecretKeySpec secretKeySpec = new SecretKeySpec(xVar.mo68968y().toByteArray(), "HMAC");
            int w = xVar.mo68969z().mo68973w();
            int i = C14098c.f31050a[v.ordinal()];
            if (i == 1) {
                return new C17775r(new C17773q("HMACSHA1", secretKeySpec), w);
            }
            if (i == 2) {
                return new C17775r(new C17773q("HMACSHA256", secretKeySpec), w);
            }
            if (i == 3) {
                return new C17775r(new C17773q("HMACSHA512", secretKeySpec), w);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: bm.b$b */
    public class C14097b extends C18731e.C18732a<C17690y, C17687x> {
        public C14097b() {
            super(C17690y.class);
        }

        /* renamed from: a */
        public final Object mo46968a(C16503j0 j0Var) throws GeneralSecurityException {
            C17690y yVar = (C17690y) j0Var;
            C17687x.C17689b B = C17687x.m29679B();
            C14095b.this.getClass();
            B.mo58540o();
            C17687x.m29682u((C17687x) B.f36539c);
            C17693z w = yVar.mo68971w();
            B.mo58540o();
            C17687x.m29683v((C17687x) B.f36539c, w);
            ByteString copyFrom = ByteString.copyFrom(C17776s.m29816a(yVar.mo68970v()));
            B.mo58540o();
            C17687x.m29684w((C17687x) B.f36539c, copyFrom);
            return (C17687x) B.mo58538l();
        }

        /* renamed from: b */
        public final C16503j0 mo46969b(ByteString byteString) throws InvalidProtocolBufferException {
            return C17690y.m29692x(byteString, C16511n.m27170a());
        }

        /* renamed from: c */
        public final void mo46970c(C16503j0 j0Var) throws GeneralSecurityException {
            C17690y yVar = (C17690y) j0Var;
            if (yVar.mo68970v() >= 16) {
                C14095b.m21822h(yVar.mo68971w());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* renamed from: bm.b$c */
    public static /* synthetic */ class C14098c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31050a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31050a = r0
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31050a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31050a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p516bm.C14095b.C14098c.<clinit>():void");
        }
    }

    public C14095b() {
        super(C17687x.class, new C14096a());
    }

    /* renamed from: g */
    public static void m21821g(C17687x xVar) throws GeneralSecurityException {
        C17778t.m29819c(xVar.mo68967A());
        if (xVar.mo68968y().size() >= 16) {
            m21822h(xVar.mo68969z());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: h */
    public static void m21822h(C17693z zVar) throws GeneralSecurityException {
        if (zVar.mo68973w() >= 10) {
            int i = C14098c.f31050a[zVar.mo68972v().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zVar.mo68973w() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zVar.mo68973w() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zVar.mo68973w() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final String mo46962a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: c */
    public final C18731e.C18732a<C17690y, C17687x> mo46963c() {
        return new C14097b();
    }

    /* renamed from: d */
    public final KeyData.KeyMaterialType mo46964d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    /* renamed from: e */
    public final C16503j0 mo46965e(ByteString byteString) throws InvalidProtocolBufferException {
        return C17687x.m29680C(byteString, C16511n.m27170a());
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo46966f(C16503j0 j0Var) throws GeneralSecurityException {
        m21821g((C17687x) j0Var);
    }
}
