package com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import p003a2.C0023f;
import p008a7.C0041a;
import p010a9.C0048b;
import p081d6.C6662a;
import p094e7.C6755a;
import p105f7.C6808a;
import p105f7.C6809b;
import p161k6.C7198a;
import p181m7.C7339a;
import p190n6.C7485a;
import p210p7.C7706a;
import p210p7.C7707b;
import p217q7.C7727a;
import p225r7.C7783a;
import p236s7.C7904a;
import p244t5.C7959a;
import p246t7.C8042a;
import p256u7.C8169a;
import p256u7.C8170b;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.b.b.a */
public final class C6158a extends Provider {

    /* renamed from: a */
    public static final C0041a f13286a = new C7485a();

    /* renamed from: b */
    public static final HashMap f13287b = new HashMap();

    /* renamed from: c */
    public static final String[] f13288c = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: d */
    public static final String[] f13289d = {"SipHash", "Poly1305"};

    /* renamed from: e */
    public static final String[] f13290e = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};

    /* renamed from: f */
    public static final String[] f13291f = {"X509", "IES"};

    /* renamed from: g */
    public static final String[] f13292g = {"DSA", "DH", "EC", BaseSecureKeyWrapper.RSA_ALGORITHM, "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: h */
    public static final String[] f13293h = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};

    /* renamed from: i */
    public static final String[] f13294i = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: j */
    public static final String[] f13295j = {"DRBG"};

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.b.b.a$a */
    public class C6159a implements PrivilegedAction {
        public C6159a() {
        }

        public final Object run() {
            C6158a.m12289a(C6158a.this);
            return null;
        }
    }

    public C6158a() {
        super("BC", 1.62d, "BouncyCastle Security Provider v1.62");
        AccessController.doPrivileged(new C6159a());
    }

    /* renamed from: a */
    public static PrivateKey m12287a(C6662a aVar) {
        C6809b bVar;
        C7959a aVar2 = aVar.f14689c.f15983b;
        HashMap hashMap = f13287b;
        synchronized (hashMap) {
            bVar = (C6809b) hashMap.get(aVar2);
        }
        if (bVar == null) {
            return null;
        }
        return bVar.mo18933a(aVar);
    }

    /* renamed from: a */
    public void mo17259a(String str, C7959a aVar, String str2) {
        mo17257a(str + "." + aVar, str2);
        mo17257a(str + ".OID." + aVar, str2);
    }

    /* renamed from: a */
    public void mo17260a(C7959a aVar, C6809b bVar) {
        HashMap hashMap = f13287b;
        synchronized (hashMap) {
            hashMap.put(aVar, bVar);
        }
    }

    /* renamed from: b */
    public final void mo17261b(String str, String[] strArr) {
        Class<?> cls;
        for (int i = 0; i != strArr.length; i++) {
            Class<C6158a> cls2 = C6158a.class;
            String k = C0023f.m110k(C0072d.m201h(str), strArr[i], "$Mappings");
            try {
                ClassLoader classLoader = cls2.getClassLoader();
                cls = classLoader != null ? classLoader.loadClass(k) : (Class) AccessController.doPrivileged(new C6755a(k));
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    ((C6808a) cls.newInstance()).mo18932a();
                } catch (Exception e) {
                    StringBuilder k2 = C0073e.m211k("cannot create instance of ", str);
                    k2.append(strArr[i]);
                    k2.append("$Mappings : ");
                    k2.append(e);
                    throw new InternalError(k2.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo17262b(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            return containsKey(sb.toString());
        }
    }

    /* renamed from: a */
    public static PublicKey m12288a(C7198a aVar) {
        C6809b bVar;
        C7959a aVar2 = aVar.f15981b.f15983b;
        HashMap hashMap = f13287b;
        synchronized (hashMap) {
            bVar = (C6809b) hashMap.get(aVar2);
        }
        if (bVar == null) {
            return null;
        }
        return bVar.mo18934b(aVar);
    }

    /* renamed from: a */
    public static void m12289a(C6158a aVar) {
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.digest.", f13293h);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", f13288c);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", f13289d);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", f13290e);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.", f13291f);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.", f13292g);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.keystore.", f13294i);
        aVar.mo17261b("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.drbg.", f13295j);
        aVar.mo17260a(C7339a.f16302d, (C6809b) new C8042a());
        aVar.mo17260a(C7339a.f16303e, (C6809b) new C7727a());
        aVar.mo17260a(C7339a.f16304f, (C6809b) new C8169a());
        aVar.mo17260a(C7339a.f16305g, (C6809b) new C8170b());
        aVar.mo17260a(C7339a.f16300b, (C6809b) new C7707b());
        aVar.mo17260a(C7339a.f16301c, (C6809b) new C7706a());
        aVar.mo17260a(C7339a.f16299a, (C6809b) new C7904a());
        aVar.mo17260a(C7339a.f16306h, (C6809b) new C7783a());
        aVar.mo17260a(C7339a.f16307i, (C6809b) new C7783a());
        aVar.mo17260a(C7339a.f16308j, (C6809b) new C7783a());
        aVar.mo17260a(C7339a.f16309k, (C6809b) new C7783a());
        aVar.mo17260a(C7339a.f16310l, (C6809b) new C7783a());
        aVar.put("X509Store.CERTIFICATE/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCertCollection");
        aVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        aVar.put("X509Store.CRL/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCRLCollection");
        aVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCertPairCollection");
        aVar.put("X509Store.CERTIFICATE/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCerts");
        aVar.put("X509Store.CRL/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        aVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        aVar.put("X509Store.CERTIFICATEPAIR/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        aVar.put("X509StreamParser.CERTIFICATE", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CertParser");
        aVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509AttrCertParser");
        aVar.put("X509StreamParser.CRL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CRLParser");
        aVar.put("X509StreamParser.CERTIFICATEPAIR", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CertPairParser");
        aVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        aVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        aVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        aVar.put("CertPathValidator.RFC3281", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        aVar.put("CertPathBuilder.RFC3281", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        aVar.put("CertPathValidator.RFC3280", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        aVar.put("CertPathBuilder.RFC3280", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        aVar.put("CertPathValidator.PKIX", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        aVar.put("CertPathBuilder.PKIX", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        aVar.put("CertStore.Collection", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.CertStoreCollectionSpi");
        aVar.put("CertStore.LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        aVar.put("CertStore.Multi", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.MultiCertStoreSpi");
        aVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    /* renamed from: a */
    public void mo17257a(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException(C0048b.m163a("duplicate provider key (", str, ") found"));
    }

    /* renamed from: a */
    public void mo17258a(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            String a = C0048b.m163a(str, " ", next);
            if (!containsKey(a)) {
                put(a, map.get(next));
            } else {
                throw new IllegalStateException(C0048b.m163a("duplicate provider attribute key (", a, ") found"));
            }
        }
    }
}
