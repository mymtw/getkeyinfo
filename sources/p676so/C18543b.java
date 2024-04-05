package p676so;

import p659qo.C18469b;

@Deprecated
/* renamed from: so.b */
public final class C18543b extends C18542a {

    /* renamed from: a */
    public final C18469b f40807a;

    /* renamed from: b */
    public byte[] f40808b;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18543b(android.content.SharedPreferences r11, android.content.Context r12) {
        /*
            r10 = this;
            r10.<init>()
            qo.b r0 = new qo.b
            r0.<init>()
            r10.f40807a = r0
            java.lang.String r1 = "aes_secret_key"
            java.lang.String r2 = "CryptoKeyAlias"
            java.lang.String r3 = "BaseSecureKeyWrapper"
            java.lang.String r4 = "AndroidKeyStore"
            r5 = 0
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r4)     // Catch:{ Exception -> 0x0026 }
            r6.load(r5)     // Catch:{ Exception -> 0x0026 }
            java.security.cert.Certificate r6 = r6.getCertificate(r2)     // Catch:{ Exception -> 0x0026 }
            if (r6 != 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            java.security.PublicKey r6 = r6.getPublicKey()     // Catch:{ Exception -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            r6 = move-exception
            java.lang.String r7 = "Exception in retrieving Public key"
            android.util.Log.d(r3, r7, r6)
        L_0x002c:
            r6 = r5
        L_0x002d:
            r7 = 1
            if (r6 == 0) goto L_0x0031
            goto L_0x009f
        L_0x0031:
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            java.util.Date r8 = r6.getTime()
            r6.add(r7, r7)
            java.util.Date r6 = r6.getTime()
            java.util.Locale.getDefault()
            java.lang.String r9 = "RSA"
            java.security.KeyPairGenerator r4 = java.security.KeyPairGenerator.getInstance(r9, r4)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r9 = new android.security.KeyPairGeneratorSpec$Builder     // Catch:{ Exception -> 0x0099 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r12 = r9.setAlias(r2)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r12 = r12.setStartDate(r8)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r12 = r12.setEndDate(r6)     // Catch:{ Exception -> 0x0099 }
            r8 = 1
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r8)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r12 = r12.setSerialNumber(r2)     // Catch:{ Exception -> 0x0099 }
            javax.security.auth.x500.X500Principal r2 = new javax.security.auth.x500.X500Principal     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "CN=CryptoKeyAlias"
            r2.<init>(r6)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec$Builder r12 = r12.setSubject(r2)     // Catch:{ Exception -> 0x0099 }
            android.security.KeyPairGeneratorSpec r12 = r12.build()     // Catch:{ Exception -> 0x0099 }
            r4.initialize(r12)     // Catch:{ Exception -> 0x0099 }
            java.security.KeyPair r12 = r4.generateKeyPair()     // Catch:{ Exception -> 0x0099 }
            java.security.PublicKey r12 = r12.getPublic()     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r4 = "publicKey: "
            r2.append(r4)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0099 }
            r2.append(r12)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r12 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r3, r12)     // Catch:{ Exception -> 0x0099 }
            goto L_0x009f
        L_0x0097:
            r11 = move-exception
            goto L_0x00f9
        L_0x0099:
            r12 = move-exception
            java.lang.String r2 = "Exception in generatePublicKey"
            android.util.Log.e(r3, r2, r12)     // Catch:{ all -> 0x0097 }
        L_0x009f:
            java.lang.String r12 = r11.getString(r1, r5)     // Catch:{ Exception -> 0x00f2 }
            r2 = 0
            if (r12 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r7 = r2
        L_0x00a8:
            if (r7 != 0) goto L_0x00ed
            java.lang.String r12 = "AES"
            javax.crypto.KeyGenerator r12 = javax.crypto.KeyGenerator.getInstance(r12)     // Catch:{ NoSuchAlgorithmException -> 0x00e1 }
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ NoSuchAlgorithmException -> 0x00e1 }
            r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x00e1 }
            r12.init(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00e1 }
            javax.crypto.SecretKey r12 = r12.generateKey()     // Catch:{ NoSuchAlgorithmException -> 0x00e1 }
            byte[] r12 = r12.getEncoded()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r2)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r12 = r0.mo69985f(r12)     // Catch:{ Exception -> 0x00f2 }
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x00f2 }
            if (r2 != 0) goto L_0x00d9
            android.content.SharedPreferences$Editor r2 = r11.edit()     // Catch:{ Exception -> 0x00f2 }
            r2.putString(r1, r12)     // Catch:{ Exception -> 0x00f2 }
            r2.apply()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00ed
        L_0x00d9:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r12 = "encryptedAESKey is of length zero"
            r11.<init>(r12)     // Catch:{ Exception -> 0x00f2 }
            throw r11     // Catch:{ Exception -> 0x00f2 }
        L_0x00e1:
            r11 = move-exception
            java.lang.String r12 = "Exception in generateAESSecretKey"
            android.util.Log.d(r3, r12, r11)     // Catch:{ Exception -> 0x00f2 }
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00f2 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x00f2 }
            throw r12     // Catch:{ Exception -> 0x00f2 }
        L_0x00ed:
            byte[] r5 = p676so.C18542a.m31281a(r0, r11)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r11 = move-exception
            r11.printStackTrace()
        L_0x00f6:
            r10.f40808b = r5
            return
        L_0x00f9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p676so.C18543b.<init>(android.content.SharedPreferences, android.content.Context):void");
    }
}
