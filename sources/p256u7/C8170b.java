package p256u7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.C6224a;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.C6225b;
import java.security.InvalidKeyException;
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
import p161k6.C7198a;
import p244t5.C8018s1;

/* renamed from: u7.b */
public final class C8170b extends KeyFactorySpi implements C6809b {
    /* renamed from: a */
    public final PrivateKey mo18933a(C6662a aVar) {
        return new C6224a(aVar);
    }

    /* renamed from: b */
    public final PublicKey mo18934b(C7198a aVar) {
        return new C6225b(aVar);
    }

    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return new C6224a(C6662a.m13032e(C8018s1.m16138m(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder h = C0072d.m201h("unsupported key specification: ");
            h.append(keySpec.getClass());
            h.append(".");
            throw new InvalidKeySpecException(h.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return new C6225b(C7198a.m13862e(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C6224a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof C6225b)) {
            StringBuilder h = C0072d.m201h("unsupported key type: ");
            h.append(key.getClass());
            h.append(".");
            throw new InvalidKeySpecException(h.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C6224a) || (key instanceof C6225b)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
