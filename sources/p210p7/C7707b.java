package p210p7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.C6214c;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.C6215d;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p081d6.C6662a;
import p105f7.C6809b;
import p117g7.C6892e;
import p117g7.C6893f;
import p161k6.C7198a;
import p181m7.C7339a;
import p181m7.C7342d;
import p181m7.C7343e;
import p191n7.C7486a;
import p191n7.C7487b;
import p191n7.C7489d;
import p191n7.C7490e;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: p7.b */
public final class C7707b extends KeyFactorySpi implements C6809b {
    /* renamed from: a */
    public final PrivateKey mo18933a(C6662a aVar) {
        C8018s1 g = aVar.mo18832g();
        g.getClass();
        C7342d dVar = g instanceof C7342d ? (C7342d) g : new C7342d(C8021t1.m16151s(g));
        return new C6214c(new C6892e(dVar.f16321b, dVar.f16322c, new C7487b(dVar.f16323d), new C7490e(new C7487b(dVar.f16323d), dVar.f16324e), new C7489d(dVar.f16326g), new C7489d(dVar.f16327h), new C7486a(dVar.f16325f)));
    }

    /* renamed from: b */
    public final PublicKey mo18934b(C7198a aVar) {
        C8018s1 g = aVar.mo19494g();
        C7343e eVar = g instanceof C7343e ? (C7343e) g : g != null ? new C7343e(C8021t1.m16151s(g)) : null;
        return new C6215d(new C6893f(eVar.f16328b, eVar.f16329c, new C7486a(eVar.f16330d)));
    }

    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C6662a e = C6662a.m13032e(C8018s1.m16138m(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C7339a.f16300b.equals(e.f14689c.f15983b)) {
                        C8018s1 g = e.mo18832g();
                        C7342d dVar = g instanceof C7342d ? (C7342d) g : g != null ? new C7342d(C8021t1.m16151s(g)) : null;
                        return new C6214c(new C6892e(dVar.f16321b, dVar.f16322c, new C7487b(dVar.f16323d), new C7490e(new C7487b(dVar.f16323d), dVar.f16324e), new C7489d(dVar.f16326g), new C7489d(dVar.f16327h), new C7486a(dVar.f16325f)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e2);
            }
        } else {
            StringBuilder h = C0072d.m201h("Unsupported key specification: ");
            h.append(keySpec.getClass());
            h.append(".");
            throw new InvalidKeySpecException(h.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C7198a e = C7198a.m13862e(C8018s1.m16138m(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C7339a.f16300b.equals(e.f15981b.f15983b)) {
                        C8018s1 g = e.mo19494g();
                        C7343e eVar = g instanceof C7343e ? (C7343e) g : g != null ? new C7343e(C8021t1.m16151s(g)) : null;
                        return new C6215d(new C6893f(eVar.f16328b, eVar.f16329c, new C7486a(eVar.f16330d)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e2) {
                    StringBuilder h = C0072d.m201h("Unable to decode X509EncodedKeySpec: ");
                    h.append(e2.getMessage());
                    throw new InvalidKeySpecException(h.toString());
                }
            } catch (IOException e3) {
                throw new InvalidKeySpecException(e3.toString());
            }
        } else {
            StringBuilder h2 = C0072d.m201h("Unsupported key specification: ");
            h2.append(keySpec.getClass());
            h2.append(".");
            throw new InvalidKeySpecException(h2.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    public final Key engineTranslateKey(Key key) {
        return null;
    }
}
