package com.google.crypto.tink.subtle;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p567fm.C17766m;

public enum PemKeyType {
    RSA_PSS_2048_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PSS", RecyclerView.C3084b0.FLAG_MOVED, r6),
    RSA_PSS_3072_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PSS", 3072, r6),
    RSA_PSS_4096_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PSS", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, r6),
    RSA_PSS_4096_SHA512(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PSS", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, r19),
    RSA_SIGN_PKCS1_2048_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PKCS1-v1_5", RecyclerView.C3084b0.FLAG_MOVED, r6),
    RSA_SIGN_PKCS1_3072_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PKCS1-v1_5", 3072, r6),
    RSA_SIGN_PKCS1_4096_SHA256(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PKCS1-v1_5", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, r6),
    RSA_SIGN_PKCS1_4096_SHA512(BaseSecureKeyWrapper.RSA_ALGORITHM, "RSASSA-PKCS1-v1_5", RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, r19),
    ECDSA_P256_SHA256("EC", "ECDSA", 256, r8),
    ECDSA_P384_SHA384("EC", "ECDSA", 384, Enums$HashType.SHA384),
    ECDSA_P521_SHA512("EC", "ECDSA", 521, r19);
    
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";
    private static final String MARKER = "-----";
    private static final String PRIVATE_KEY = "PRIVATE KEY";
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    public final String algorithm;
    public final Enums$HashType hash;
    public final int keySizeInBits;
    public final String keyType;

    private PemKeyType(String str, String str2, int i, Enums$HashType enums$HashType) {
        this.keyType = str;
        this.algorithm = str2;
        this.keySizeInBits = i;
        this.hash = enums$HashType;
    }

    private Key getPrivateKey(byte[] bArr) throws GeneralSecurityException {
        return validate(C17766m.f38614g.mo69010a(this.keyType).generatePrivate(new PKCS8EncodedKeySpec(bArr)));
    }

    private Key getPublicKey(byte[] bArr) throws GeneralSecurityException {
        return validate(C17766m.f38614g.mo69010a(this.keyType).generatePublic(new X509EncodedKeySpec(bArr)));
    }

    private Key validate(Key key) throws GeneralSecurityException {
        if (this.keyType.equals(BaseSecureKeyWrapper.RSA_ALGORITHM)) {
            int bitLength = ((RSAKey) key).getModulus().bitLength();
            if (bitLength != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid RSA key size, want %d got %d", new Object[]{Integer.valueOf(this.keySizeInBits), Integer.valueOf(bitLength)}));
            }
        } else {
            ECParameterSpec params = ((ECKey) key).getParams();
            if (EllipticCurves.m27353b(params, EllipticCurves.m27352a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5")) || EllipticCurves.m27353b(params, EllipticCurves.m27352a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f")) || EllipticCurves.m27353b(params, EllipticCurves.m27352a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650"))) {
                ECField field = params.getCurve().getField();
                if (field instanceof ECFieldFp) {
                    int bitLength2 = ((ECFieldFp) field).getP().subtract(BigInteger.ONE).bitLength();
                    if (bitLength2 != this.keySizeInBits) {
                        throw new GeneralSecurityException(String.format("invalid EC key size, want %d got %d", new Object[]{Integer.valueOf(this.keySizeInBits), Integer.valueOf(bitLength2)}));
                    }
                } else {
                    throw new GeneralSecurityException("Only curves over prime order fields are supported");
                }
            } else {
                StringBuilder h = C0072d.m201h("unsupport EC spec: ");
                h.append(params.toString());
                throw new GeneralSecurityException(h.toString());
            }
        }
        return key;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = r0.trim().substring(11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.Key readKey(java.io.BufferedReader r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = r7.readLine()
        L_0x0004:
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "-----BEGIN "
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x0013
            java.lang.String r0 = r7.readLine()
            goto L_0x0004
        L_0x0013:
            r1 = 0
            if (r0 != 0) goto L_0x0017
            return r1
        L_0x0017:
            java.lang.String r0 = r0.trim()
            r2 = 11
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r2 = "-----"
            int r3 = r0.indexOf(r2)
            if (r3 >= 0) goto L_0x002a
            return r1
        L_0x002a:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.String r3 = "-----END "
            java.lang.String r2 = p010a9.C0048b.m163a(r3, r0, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x003a:
            java.lang.String r4 = r7.readLine()
            if (r4 == 0) goto L_0x0054
            java.lang.String r5 = ":"
            int r5 = r4.indexOf(r5)
            if (r5 <= 0) goto L_0x0049
            goto L_0x003a
        L_0x0049:
            boolean r5 = r4.contains(r2)
            if (r5 == 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            r3.append(r4)
            goto L_0x003a
        L_0x0054:
            java.lang.String r7 = r3.toString()     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            byte[] r7 = p567fm.C17756f.m29778a(r7)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            java.lang.String r2 = "PUBLIC KEY"
            boolean r2 = r0.contains(r2)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            if (r2 == 0) goto L_0x0069
            java.security.Key r7 = r6.getPublicKey(r7)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            return r7
        L_0x0069:
            java.lang.String r2 = "PRIVATE KEY"
            boolean r0 = r0.contains(r2)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            if (r0 == 0) goto L_0x0076
            java.security.Key r7 = r6.getPrivateKey(r7)     // Catch:{ IllegalArgumentException | GeneralSecurityException -> 0x0076 }
            return r7
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.PemKeyType.readKey(java.io.BufferedReader):java.security.Key");
    }
}
