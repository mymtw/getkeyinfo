package p210p7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.C6212a;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.C6213b;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.reflect.C19421p;
import p081d6.C6662a;
import p105f7.C6809b;
import p117g7.C6889b;
import p117g7.C6890c;
import p161k6.C7198a;
import p181m7.C7339a;
import p181m7.C7340b;
import p181m7.C7341c;
import p191n7.C7487b;
import p191n7.C7489d;
import p191n7.C7490e;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: p7.a */
public final class C7706a extends KeyFactorySpi implements C6809b {
    /* renamed from: a */
    public final PrivateKey mo18933a(C6662a aVar) {
        C8018s1 g = aVar.mo18832g();
        g.getClass();
        C7340b bVar = g instanceof C7340b ? (C7340b) g : new C7340b(C8021t1.m16151s(g));
        return new C6212a(new C6889b(bVar.f16311b, bVar.f16312c, new C7487b(bVar.f16313d), new C7490e(new C7487b(bVar.f16313d), bVar.f16314e), new C7489d(bVar.f16315f), (String) null));
    }

    /* renamed from: b */
    public final PublicKey mo18934b(C7198a aVar) {
        C8018s1 g = aVar.mo19494g();
        C7341c cVar = g instanceof C7341c ? (C7341c) g : g != null ? new C7341c(C8021t1.m16151s(g)) : null;
        return new C6213b(new C6890c(cVar.f16317b, cVar.f16318c, cVar.f16319d, C19421p.m32956u(cVar.f16320e).mo19523a()));
    }

    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C6662a e = C6662a.m13032e(C8018s1.m16138m(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C7339a.f16301c.equals(e.f14689c.f15983b)) {
                        C8018s1 g = e.mo18832g();
                        C7340b bVar = g instanceof C7340b ? (C7340b) g : g != null ? new C7340b(C8021t1.m16151s(g)) : null;
                        return new C6212a(new C6889b(bVar.f16311b, bVar.f16312c, new C7487b(bVar.f16313d), new C7490e(new C7487b(bVar.f16313d), bVar.f16314e), new C7489d(bVar.f16315f), C19421p.m32956u(bVar.f16316g).mo19523a()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
                    if (C7339a.f16301c.equals(e.f15981b.f15983b)) {
                        C8018s1 g = e.mo19494g();
                        C7341c cVar = g instanceof C7341c ? (C7341c) g : g != null ? new C7341c(C8021t1.m16151s(g)) : null;
                        return new C6213b(new C6890c(cVar.f16317b, cVar.f16318c, cVar.f16319d, C19421p.m32956u(cVar.f16320e).mo19523a()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
