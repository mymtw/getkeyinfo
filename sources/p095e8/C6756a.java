package p095e8;

import androidx.appcompat.app.C0164l;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6244i;
import javax.crypto.spec.SecretKeySpec;
import p106f8.C6814e;

/* renamed from: e8.a */
public final class C6756a extends C6814e implements C6244i {

    /* renamed from: g */
    public final C0164l f14884g = new C0164l();

    public C6756a(byte[] bArr) {
        super(new SecretKeySpec(bArr, "AES"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x036c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo18907a(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader r17, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r18, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r19, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r20, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r2 = r17.mo17679c()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm.f13581h
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x03e8
            if (r18 != 0) goto L_0x03e0
            if (r19 == 0) goto L_0x03d8
            if (r21 == 0) goto L_0x03d0
            androidx.appcompat.app.l r2 = r1.f14884g
            boolean r2 = r2.mo1414h(r0)
            if (r2 == 0) goto L_0x03c8
            javax.crypto.SecretKey r2 = r1.f15000d
            d8.a r3 = r1.f14995c
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r4 = r17.mo17681h()
            int r5 = r4.mo17676b()     // Catch:{ e -> 0x03b0 }
            byte[] r6 = r2.getEncoded()     // Catch:{ e -> 0x03b0 }
            r7 = 8
            r9 = 0
            if (r6 != 0) goto L_0x0035
            r6 = r9
            goto L_0x003e
        L_0x0035:
            int r6 = r6.length     // Catch:{ e -> 0x03b0 }
            long r10 = (long) r6
            long r10 = r10 * r7
            int r6 = (int) r10
            long r12 = (long) r6
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x03aa
        L_0x003e:
            if (r5 != r6) goto L_0x0382
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r4 = r17.mo17710e()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ASCII"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            byte[] r4 = r4.getBytes(r5)
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r6 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13566b
            boolean r5 = r5.equals(r6)
            java.lang.String r6 = "AES"
            r10 = 1
            if (r5 != 0) goto L_0x0267
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r11 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13567c
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0267
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r11 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13568d
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x007b
            goto L_0x0267
        L_0x007b:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r7 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13571g
            boolean r5 = r5.equals(r7)
            r7 = 2
            if (r5 != 0) goto L_0x01a2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r8 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13572h
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x01a2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r8 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13573i
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x00a2
            goto L_0x01a2
        L_0x00a2:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r4 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13569e
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00cb
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r4 = r17.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r5 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13570f
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00bb
            goto L_0x00cb
        L_0x00bb:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r17.mo17681h()
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod> r3 = p106f8.C6813d.f14996a
            java.lang.String r0 = kotlin.jvm.internal.C19388s.m32867j(r0, r3)
            r2.<init>(r0)
            throw r2
        L_0x00cb:
            r3.getClass()
            java.lang.String r3 = "SHA-"
            java.lang.String r4 = "epu"
            java.lang.Object r5 = r0.mo17708a((java.lang.String) r4)
            boolean r5 = r5 instanceof java.lang.String
            r6 = 0
            if (r5 == 0) goto L_0x00eb
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r5 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL
            java.lang.Object r4 = r0.mo17708a((java.lang.String) r4)
            java.lang.String r4 = (java.lang.String) r4
            r5.<init>(r4)
            byte[] r4 = r5.mo17747a()
            goto L_0x00ec
        L_0x00eb:
            r4 = r6
        L_0x00ec:
            java.lang.String r5 = "epv"
            java.lang.Object r7 = r0.mo17708a((java.lang.String) r5)
            boolean r7 = r7 instanceof java.lang.String
            if (r7 == 0) goto L_0x0106
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r7 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL
            java.lang.Object r5 = r0.mo17708a((java.lang.String) r5)
            java.lang.String r5 = (java.lang.String) r5
            r7.<init>(r5)
            byte[] r5 = r7.mo17747a()
            goto L_0x0107
        L_0x0106:
            r5 = r6
        L_0x0107:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r7 = r17.mo17681h()
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            byte[] r9 = com.google.android.play.core.assetpacks.C15588c1.f35088n     // Catch:{ IOException -> 0x0197 }
            r8.write(r9)     // Catch:{ IOException -> 0x0197 }
            byte[] r2 = r2.getEncoded()     // Catch:{ IOException -> 0x0197 }
            r8.write(r2)     // Catch:{ IOException -> 0x0197 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0197 }
            int r2 = r2 * 8
            byte[] r9 = kotlin.jvm.internal.C19388s.m32811B(r2)     // Catch:{ IOException -> 0x0197 }
            r8.write(r9)     // Catch:{ IOException -> 0x0197 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0197 }
            java.nio.charset.Charset r9 = p130h8.C6961b.f15443a     // Catch:{ IOException -> 0x0197 }
            byte[] r7 = r7.getBytes(r9)     // Catch:{ IOException -> 0x0197 }
            r8.write(r7)     // Catch:{ IOException -> 0x0197 }
            if (r4 == 0) goto L_0x0141
            int r7 = r4.length     // Catch:{ IOException -> 0x0197 }
            byte[] r7 = kotlin.jvm.internal.C19388s.m32811B(r7)     // Catch:{ IOException -> 0x0197 }
            r8.write(r7)     // Catch:{ IOException -> 0x0197 }
            r8.write(r4)     // Catch:{ IOException -> 0x0197 }
            goto L_0x0146
        L_0x0141:
            byte[] r4 = com.google.android.play.core.assetpacks.C15588c1.f35089o     // Catch:{ IOException -> 0x0197 }
            r8.write(r4)     // Catch:{ IOException -> 0x0197 }
        L_0x0146:
            if (r5 == 0) goto L_0x0154
            int r4 = r5.length     // Catch:{ IOException -> 0x0197 }
            byte[] r4 = kotlin.jvm.internal.C19388s.m32811B(r4)     // Catch:{ IOException -> 0x0197 }
            r8.write(r4)     // Catch:{ IOException -> 0x0197 }
            r8.write(r5)     // Catch:{ IOException -> 0x0197 }
            goto L_0x0159
        L_0x0154:
            byte[] r4 = com.google.android.play.core.assetpacks.C15588c1.f35089o     // Catch:{ IOException -> 0x0197 }
            r8.write(r4)     // Catch:{ IOException -> 0x0197 }
        L_0x0159:
            byte[] r4 = com.google.android.play.core.assetpacks.C15588c1.f35090p     // Catch:{ IOException -> 0x0197 }
            r8.write(r4)     // Catch:{ IOException -> 0x0197 }
            byte[] r4 = r8.toByteArray()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            r5.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            r5.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            r5.append(r2)     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            java.lang.String r3 = r5.toString()     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x018c }
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            byte[] r3 = r3.digest(r4)
            java.lang.String r4 = "HMACSHA"
            java.lang.String r2 = p003a2.C0015b.m88g(r4, r2)
            r5.<init>(r3, r2)
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r0 = r17.mo17710e()
            r0.toString()
            throw r6
        L_0x018c:
            r0 = move-exception
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x0197:
            r0 = move-exception
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x01a2:
            byte[] r5 = r19.mo17747a()
            byte[] r8 = r20.mo17747a()
            byte[] r11 = r21.mo17747a()
            java.lang.Object r3 = r3.f3630c
            java.security.Provider r3 = (java.security.Provider) r3
            javax.crypto.spec.SecretKeySpec r12 = new javax.crypto.spec.SecretKeySpec
            byte[] r2 = r2.getEncoded()
            r12.<init>(r2, r6)
            java.lang.String r2 = "AES/GCM/NoPadding"
            if (r3 == 0) goto L_0x01c4
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2, r3)     // Catch:{ NoSuchAlgorithmException -> 0x024f, NoSuchPaddingException -> 0x024d, InvalidKeyException -> 0x024b, InvalidAlgorithmParameterException -> 0x0249, NoClassDefFoundError -> 0x01ff }
            goto L_0x01c8
        L_0x01c4:
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x024f, NoSuchPaddingException -> 0x024d, InvalidKeyException -> 0x024b, InvalidAlgorithmParameterException -> 0x0249, NoClassDefFoundError -> 0x01ff }
        L_0x01c8:
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ NoSuchAlgorithmException -> 0x024f, NoSuchPaddingException -> 0x024d, InvalidKeyException -> 0x024b, InvalidAlgorithmParameterException -> 0x0249, NoClassDefFoundError -> 0x01ff }
            r6 = 128(0x80, float:1.794E-43)
            r3.<init>(r6, r5)     // Catch:{ NoSuchAlgorithmException -> 0x024f, NoSuchPaddingException -> 0x024d, InvalidKeyException -> 0x024b, InvalidAlgorithmParameterException -> 0x0249, NoClassDefFoundError -> 0x01ff }
            r2.init(r7, r12, r3)     // Catch:{ NoSuchAlgorithmException -> 0x024f, NoSuchPaddingException -> 0x024d, InvalidKeyException -> 0x024b, InvalidAlgorithmParameterException -> 0x0249, NoClassDefFoundError -> 0x01ff }
            r2.updateAAD(r4)
            byte[][] r3 = new byte[r7][]     // Catch:{ IllegalBlockSizeException -> 0x01e7, BadPaddingException -> 0x01e5 }
            r3[r9] = r8     // Catch:{ IllegalBlockSizeException -> 0x01e7, BadPaddingException -> 0x01e5 }
            r3[r10] = r11     // Catch:{ IllegalBlockSizeException -> 0x01e7, BadPaddingException -> 0x01e5 }
            byte[] r3 = p628nj.C18263b.m30856n(r3)     // Catch:{ IllegalBlockSizeException -> 0x01e7, BadPaddingException -> 0x01e5 }
            byte[] r2 = r2.doFinal(r3)     // Catch:{ IllegalBlockSizeException -> 0x01e7, BadPaddingException -> 0x01e5 }
            goto L_0x031c
        L_0x01e5:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e7:
            r0 = move-exception
        L_0x01e8:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "AES/GCM/NoPadding decryption failed: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x01ff:
            p5.a r2 = androidx.compose.p015ui.text.input.C1993m.m4371q(r12, r9, r5, r4)
            int r3 = r8.length
            int r4 = r11.length
            int r3 = r3 + r4
            byte[] r4 = new byte[r3]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r9, r4, r9, r5)
            int r5 = r8.length
            int r6 = r11.length
            java.lang.System.arraycopy(r11, r9, r4, r5, r6)
            int r5 = r2.f17012s
            int r5 = r5 + r3
            boolean r6 = r2.f16997d
            if (r6 == 0) goto L_0x021c
            int r6 = r2.f16999f
            int r5 = r5 + r6
            goto L_0x0224
        L_0x021c:
            int r6 = r2.f16999f
            if (r5 >= r6) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            int r9 = r5 - r6
        L_0x0223:
            r5 = r9
        L_0x0224:
            byte[] r5 = new byte[r5]
            int r3 = r2.mo20065b(r4, r3, r5)
            r2.mo20064a(r3, r5)     // Catch:{ t -> 0x0230 }
            r2 = r5
            goto L_0x031c
        L_0x0230:
            r0 = move-exception
            r2 = r0
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't validate GCM authentication tag: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r2.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x0249:
            r0 = move-exception
            goto L_0x0250
        L_0x024b:
            r0 = move-exception
            goto L_0x0250
        L_0x024d:
            r0 = move-exception
            goto L_0x0250
        L_0x024f:
            r0 = move-exception
        L_0x0250:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't create AES/GCM/NoPadding cipher: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0267:
            byte[] r5 = r19.mo17747a()
            byte[] r10 = r20.mo17747a()
            byte[] r11 = r21.mo17747a()
            java.lang.Object r3 = r3.f3630c
            r12 = r3
            java.security.Provider r12 = (java.security.Provider) r12
            java.security.Provider r3 = (java.security.Provider) r3
            byte[] r2 = r2.getEncoded()
            int r13 = r2.length
            r14 = 32
            if (r13 != r14) goto L_0x0292
            javax.crypto.spec.SecretKeySpec r13 = new javax.crypto.spec.SecretKeySpec
            r14 = 16
            java.lang.String r15 = "HMACSHA256"
            r13.<init>(r2, r9, r14, r15)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            r15.<init>(r2, r14, r14, r6)
            goto L_0x02b7
        L_0x0292:
            int r13 = r2.length
            r15 = 48
            if (r13 != r15) goto L_0x02a6
            javax.crypto.spec.SecretKeySpec r13 = new javax.crypto.spec.SecretKeySpec
            r14 = 24
            java.lang.String r15 = "HMACSHA384"
            r13.<init>(r2, r9, r14, r15)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            r15.<init>(r2, r14, r14, r6)
            goto L_0x02b7
        L_0x02a6:
            int r13 = r2.length
            r15 = 64
            if (r13 != r15) goto L_0x037a
            javax.crypto.spec.SecretKeySpec r13 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r15 = "HMACSHA512"
            r13.<init>(r2, r9, r14, r15)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            r15.<init>(r2, r14, r14, r6)
        L_0x02b7:
            if (r4 != 0) goto L_0x02ba
            goto L_0x02c3
        L_0x02ba:
            int r2 = r4.length
            long r0 = (long) r2
            long r0 = r0 * r7
            int r9 = (int) r0
            long r6 = (long) r9
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0374
        L_0x02c3:
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = (long) r9
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            byte[] r0 = r0.array()
            int r1 = r4.length
            int r2 = r5.length
            int r1 = r1 + r2
            int r2 = r10.length
            int r1 = r1 + r2
            int r2 = r0.length
            int r1 = r1 + r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteBuffer r1 = r1.put(r4)
            java.nio.ByteBuffer r1 = r1.put(r5)
            java.nio.ByteBuffer r1 = r1.put(r10)
            java.nio.ByteBuffer r0 = r1.put(r0)
            byte[] r0 = r0.array()
            byte[] r0 = androidx.activity.C0114h.m267A(r13, r0, r3)
            byte[] r0 = java.util.Arrays.copyOf(r0, r14)
            int r1 = r0.length
            int r2 = r11.length
            if (r1 == r2) goto L_0x02fe
            goto L_0x0310
        L_0x02fe:
            r1 = 0
            r2 = 0
        L_0x0300:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x030c
            byte r3 = r0[r1]
            byte r4 = r11[r1]
            r3 = r3 ^ r4
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0300
        L_0x030c:
            if (r2 != 0) goto L_0x0310
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            if (r0 == 0) goto L_0x036c
            r0 = 0
            javax.crypto.Cipher r0 = kotlin.jvm.internal.C19382n.m32760n(r15, r0, r5, r12)
            byte[] r2 = r0.doFinal(r10)     // Catch:{ Exception -> 0x0360 }
        L_0x031c:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.c r0 = r17.mo17682i()
            if (r0 != 0) goto L_0x0323
            goto L_0x032f
        L_0x0323:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.c r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6238c.f13645a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0349
            byte[] r2 = p130h8.C6960a.m13496a(r2)     // Catch:{ Exception -> 0x0330 }
        L_0x032f:
            return r2
        L_0x0330:
            r0 = move-exception
            r1 = r0
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r2 = "Couldn't decompress plain text: "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x0349:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r1 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported compression algorithm: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0360:
            r0 = move-exception
            r1 = r0
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r2 = r1.getMessage()
            r0.<init>(r2, r1)
            throw r0
        L_0x036c:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r1 = "MAC check failed"
            r0.<init>(r1)
            throw r0
        L_0x0374:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e
            r0.<init>()
            throw r0
        L_0x037a:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.String r1 = "Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits"
            r0.<init>(r1)
            throw r0
        L_0x0382:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException     // Catch:{ e -> 0x03b0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ e -> 0x03b0 }
            r1.<init>()     // Catch:{ e -> 0x03b0 }
            java.lang.String r2 = "The Content Encryption Key (CEK) length for "
            r1.append(r2)     // Catch:{ e -> 0x03b0 }
            r1.append(r4)     // Catch:{ e -> 0x03b0 }
            java.lang.String r2 = " must be "
            r1.append(r2)     // Catch:{ e -> 0x03b0 }
            int r2 = r4.mo17676b()     // Catch:{ e -> 0x03b0 }
            r1.append(r2)     // Catch:{ e -> 0x03b0 }
            java.lang.String r2 = " bits"
            r1.append(r2)     // Catch:{ e -> 0x03b0 }
            java.lang.String r1 = r1.toString()     // Catch:{ e -> 0x03b0 }
            r0.<init>(r1)     // Catch:{ e -> 0x03b0 }
            throw r0     // Catch:{ e -> 0x03b0 }
        L_0x03aa:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e     // Catch:{ e -> 0x03b0 }
            r0.<init>()     // Catch:{ e -> 0x03b0 }
            throw r0     // Catch:{ e -> 0x03b0 }
        L_0x03b0:
            r0 = move-exception
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r1 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.String r2 = "The Content Encryption Key (CEK) is too long: "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x03c8:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r1 = "Unsupported critical header parameter(s)"
            r0.<init>(r1)
            throw r0
        L_0x03d0:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r1 = "Missing JWE authentication tag"
            r0.<init>(r1)
            throw r0
        L_0x03d8:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r1 = "Unexpected present JWE initialization vector (IV)"
            r0.<init>(r1)
            throw r0
        L_0x03e0:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r1 = "Unexpected present JWE encrypted key"
            r0.<init>(r1)
            throw r0
        L_0x03e8:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm> r1 = p106f8.C6814e.f14998e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported JWE algorithm "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", must be "
            r3.append(r2)
            java.lang.String r1 = kotlin.jvm.internal.C19388s.m32870l(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p095e8.C6756a.mo18907a(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL):byte[]");
    }
}
