package p236s7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow.C6220a;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow.C6221b;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.C19388s;
import p081d6.C6662a;
import p105f7.C6809b;
import p161k6.C7198a;
import p181m7.C7344f;
import p181m7.C7345g;
import p200o7.C7634a;
import p200o7.C7635b;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: s7.a */
public final class C7904a extends KeyFactorySpi implements C6809b {
    /* renamed from: a */
    public final PrivateKey mo18933a(C6662a aVar) {
        C8018s1 g = aVar.mo18832g();
        C7344f fVar = g instanceof C7344f ? (C7344f) g : g != null ? new C7344f(C8021t1.m16151s(g)) : null;
        short[][] y = C19388s.m32895y(fVar.f16333d);
        short[] G = C19388s.m32821G(fVar.f16334e);
        short[][] y2 = C19388s.m32895y(fVar.f16335f);
        short[] G2 = C19388s.m32821G(fVar.f16336g);
        byte[] bArr = fVar.f16337h;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return new C6220a(y, G, y2, G2, iArr, fVar.f16338i);
    }

    /* renamed from: b */
    public final PublicKey mo18934b(C7198a aVar) {
        C8018s1 g = aVar.mo19494g();
        C7345g gVar = g instanceof C7345g ? (C7345g) g : g != null ? new C7345g(C8021t1.m16151s(g)) : null;
        return new C6221b(gVar.f16341d.mo20556s().intValue(), C19388s.m32895y(gVar.f16342e), C19388s.m32895y(gVar.f16343f), C19388s.m32821G(gVar.f16344g));
    }

    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof C7634a) {
            return new C6220a((C7634a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo18933a(C6662a.m13032e(C8018s1.m16138m(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder h = C0072d.m201h("Unsupported key specification: ");
            h.append(keySpec.getClass());
            h.append(".");
            throw new InvalidKeySpecException(h.toString());
        }
    }

    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof C7635b) {
            return new C6221b((C7635b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo18934b(C7198a.m13862e(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C6220a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C7634a.class.isAssignableFrom(cls)) {
                C6220a aVar = (C6220a) key;
                return new C7634a(aVar.mo17609a(), aVar.mo17610b(), aVar.mo17612d(), aVar.mo17611c(), aVar.mo17615f(), aVar.mo17613e());
            }
        } else if (!(key instanceof C6221b)) {
            StringBuilder h = C0072d.m201h("Unsupported key type: ");
            h.append(key.getClass());
            h.append(".");
            throw new InvalidKeySpecException(h.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (C7635b.class.isAssignableFrom(cls)) {
                C6221b bVar = (C6221b) key;
                return new C7635b(bVar.mo17620a(), bVar.mo17621b(), bVar.mo17622c(), bVar.mo17623d());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C6220a) || (key instanceof C6221b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
