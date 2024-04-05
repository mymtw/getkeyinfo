package p142i8;

import javax.crypto.spec.SecretKeySpec;
import p095e8.C6757b;

/* renamed from: i8.a */
public final class C6998a extends C6757b {

    /* renamed from: h */
    public static int f15541h = 12;

    /* renamed from: g */
    public byte f15542g;

    public C6998a(byte[] bArr, byte b) {
        super(new SecretKeySpec(bArr, "AES"));
        this.f15542g = b;
        f15541h = 12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: javax.crypto.spec.SecretKeySpec} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v59, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARNING: type inference failed for: r3v60 */
    /* JADX WARNING: type inference failed for: r3v67 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e9 A[SYNTHETIC, Splitter:B:131:0x02e9] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ee A[Catch:{ Exception -> 0x02f2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6242g mo19181a(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r0 = r18.mo17679c()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r2 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm.f13581h
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0353
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r18.mo17681h()
            int r2 = r0.mo17676b()
            javax.crypto.SecretKey r3 = r1.f15000d
            byte[] r3 = r3.getEncoded()
            r4 = 8
            r5 = 0
            if (r3 != 0) goto L_0x0023
            r3 = r5
            goto L_0x0025
        L_0x0023:
            int r3 = r3.length
            int r3 = r3 * r4
        L_0x0025:
            if (r2 != r3) goto L_0x0349
            int r2 = r0.mo17676b()
            javax.crypto.SecretKey r3 = r1.f15000d
            byte[] r3 = r3.getEncoded()
            if (r3 != 0) goto L_0x0035
            r3 = r5
            goto L_0x0037
        L_0x0035:
            int r3 = r3.length
            int r3 = r3 * r4
        L_0x0037:
            if (r2 != r3) goto L_0x0321
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.c r0 = r18.mo17682i()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0044
            r0 = r19
            goto L_0x006a
        L_0x0044:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.c r6 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6238c.f13645a
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x030a
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x02f2 }
            r0.<init>()     // Catch:{ Exception -> 0x02f2 }
            java.util.zip.Deflater r6 = new java.util.zip.Deflater     // Catch:{ all -> 0x02e5 }
            r6.<init>(r4, r2)     // Catch:{ all -> 0x02e5 }
            java.util.zip.DeflaterOutputStream r4 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x02e3 }
            r4.<init>(r0, r6)     // Catch:{ all -> 0x02e3 }
            r7 = r19
            r4.write(r7)     // Catch:{ all -> 0x02e0 }
            r4.close()     // Catch:{ Exception -> 0x02f2 }
            r6.end()     // Catch:{ Exception -> 0x02f2 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x02f2 }
        L_0x006a:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r4 = r18.mo17710e()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "ASCII"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)
            byte[] r4 = r4.getBytes(r6)
            byte r6 = r1.f15542g
            int r7 = f15541h
            byte[] r8 = new byte[r7]
            java.util.Arrays.fill(r8, r5)
            int r9 = r7 + -1
            r8[r9] = r6
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r6 = r18.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13566b
            boolean r6 = r6.equals(r9)
            r9 = 16
            java.lang.String r10 = "AES"
            r11 = 8
            if (r6 == 0) goto L_0x0150
            javax.crypto.SecretKey r3 = r1.f15000d
            d8.a r6 = r1.f14995c
            java.lang.Object r6 = r6.f3630c
            r13 = r6
            java.security.Provider r13 = (java.security.Provider) r13
            java.security.Provider r6 = (java.security.Provider) r6
            byte[] r3 = r3.getEncoded()
            int r14 = r3.length
            r15 = 32
            if (r14 != r15) goto L_0x00bc
            javax.crypto.spec.SecretKeySpec r14 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r15 = "HMACSHA256"
            r14.<init>(r3, r5, r9, r15)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            r15.<init>(r3, r9, r9, r10)
            goto L_0x00e6
        L_0x00bc:
            int r9 = r3.length
            r14 = 48
            if (r9 != r14) goto L_0x00d0
            javax.crypto.spec.SecretKeySpec r14 = new javax.crypto.spec.SecretKeySpec
            r9 = 24
            java.lang.String r15 = "HMACSHA384"
            r14.<init>(r3, r5, r9, r15)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            r15.<init>(r3, r9, r9, r10)
            goto L_0x00e6
        L_0x00d0:
            int r9 = r3.length
            r14 = 64
            if (r9 != r14) goto L_0x0148
            javax.crypto.spec.SecretKeySpec r14 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r9 = "HMACSHA512"
            r14.<init>(r3, r5, r15, r9)
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec
            r9.<init>(r3, r15, r15, r10)
            r16 = r15
            r15 = r9
            r9 = r16
        L_0x00e6:
            javax.crypto.Cipher r2 = kotlin.jvm.internal.C19382n.m32760n(r15, r2, r8, r13)
            byte[] r0 = r2.doFinal(r0)     // Catch:{ Exception -> 0x013c }
            if (r4 != 0) goto L_0x00f1
            goto L_0x00fa
        L_0x00f1:
            int r2 = r4.length
            long r2 = (long) r2
            long r2 = r2 * r11
            int r5 = (int) r2
            long r10 = (long) r5
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0136
        L_0x00fa:
            r2 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            long r10 = (long) r5
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            int r3 = r4.length
            int r3 = r3 + r7
            int r5 = r0.length
            int r3 = r3 + r5
            int r5 = r2.length
            int r3 = r3 + r5
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r3 = r3.put(r4)
            java.nio.ByteBuffer r3 = r3.put(r8)
            java.nio.ByteBuffer r3 = r3.put(r0)
            java.nio.ByteBuffer r2 = r3.put(r2)
            byte[] r2 = r2.array()
            byte[] r2 = androidx.activity.C0114h.m267A(r14, r2, r6)
            byte[] r2 = java.util.Arrays.copyOf(r2, r9)
            f8.a r3 = new f8.a
            r3.<init>((byte[]) r0, (byte[]) r2)
            goto L_0x027b
        L_0x0136:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e
            r0.<init>()
            throw r0
        L_0x013c:
            r0 = move-exception
            r2 = r0
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = r2.getMessage()
            r0.<init>(r3, r2)
            throw r0
        L_0x0148:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.String r2 = "Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits"
            r0.<init>(r2)
            throw r0
        L_0x0150:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r6 = r18.mo17681h()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r7 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.f13571g
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x02ce
            javax.crypto.SecretKey r6 = r1.f15000d
            d8.a r7 = r1.f14995c
            java.lang.Object r7 = r7.f3630c
            java.security.Provider r7 = (java.security.Provider) r7
            if (r6 != 0) goto L_0x0167
            goto L_0x0170
        L_0x0167:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            byte[] r6 = r6.getEncoded()
            r3.<init>(r6, r10)
        L_0x0170:
            java.lang.String r6 = "AES/GCM/NoPadding"
            if (r7 == 0) goto L_0x0179
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6, r7)     // Catch:{ NoSuchAlgorithmException -> 0x02b6, NoSuchPaddingException -> 0x02b4, InvalidKeyException -> 0x02b2, InvalidAlgorithmParameterException -> 0x02b0, NoClassDefFoundError -> 0x0247 }
            goto L_0x017d
        L_0x0179:
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch:{ NoSuchAlgorithmException -> 0x02b6, NoSuchPaddingException -> 0x02b4, InvalidKeyException -> 0x02b2, InvalidAlgorithmParameterException -> 0x02b0, NoClassDefFoundError -> 0x0247 }
        L_0x017d:
            javax.crypto.spec.GCMParameterSpec r7 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ NoSuchAlgorithmException -> 0x02b6, NoSuchPaddingException -> 0x02b4, InvalidKeyException -> 0x02b2, InvalidAlgorithmParameterException -> 0x02b0, NoClassDefFoundError -> 0x0247 }
            r10 = 128(0x80, float:1.794E-43)
            r7.<init>(r10, r8)     // Catch:{ NoSuchAlgorithmException -> 0x02b6, NoSuchPaddingException -> 0x02b4, InvalidKeyException -> 0x02b2, InvalidAlgorithmParameterException -> 0x02b0, NoClassDefFoundError -> 0x0247 }
            r6.init(r2, r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x02b6, NoSuchPaddingException -> 0x02b4, InvalidKeyException -> 0x02b2, InvalidAlgorithmParameterException -> 0x02b0, NoClassDefFoundError -> 0x0247 }
            r6.updateAAD(r4)
            byte[] r0 = r6.doFinal(r0)     // Catch:{ IllegalBlockSizeException -> 0x022f, BadPaddingException -> 0x022d }
            int r3 = r0.length
            int r3 = r3 - r9
            byte[] r4 = new byte[r3]
            java.lang.System.arraycopy(r0, r5, r4, r5, r3)
            byte[] r7 = new byte[r9]
            java.lang.System.arraycopy(r0, r3, r7, r5, r9)
            java.security.AlgorithmParameters r0 = r6.getParameters()
            if (r0 == 0) goto L_0x0225
            java.lang.Class<javax.crypto.spec.GCMParameterSpec> r3 = javax.crypto.spec.GCMParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r0 = r0.getParameterSpec(r3)     // Catch:{ InvalidParameterSpecException -> 0x021a }
            javax.crypto.spec.GCMParameterSpec r0 = (javax.crypto.spec.GCMParameterSpec) r0     // Catch:{ InvalidParameterSpecException -> 0x021a }
            byte[] r3 = r0.getIV()
            int r0 = r0.getTLen()
            if (r3 != 0) goto L_0x01b4
            r6 = r5
            goto L_0x01bd
        L_0x01b4:
            int r6 = r3.length
            long r13 = (long) r6
            long r13 = r13 * r11
            int r6 = (int) r13
            long r11 = (long) r6
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0214
        L_0x01bd:
            r9 = 2
            r11 = 96
            if (r6 != r11) goto L_0x01e5
            if (r0 != r10) goto L_0x01cb
            f8.a r0 = new f8.a
            r0.<init>((byte[]) r4, (byte[]) r7)
            goto L_0x027a
        L_0x01cb:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r3 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r4[r5] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r2] = r0
            java.lang.String r0 = "Authentication tag length of %d bits is required, got %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r3.<init>(r0)
            throw r3
        L_0x01e5:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r4[r5] = r6
            if (r3 == 0) goto L_0x0204
            int r3 = r3.length
            long r5 = (long) r3
            r7 = 8
            long r5 = r5 * r7
            int r3 = (int) r5
            long r7 = (long) r3
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01fe
            r5 = r3
            goto L_0x0204
        L_0x01fe:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e
            r0.<init>()
            throw r0
        L_0x0204:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4[r2] = r3
            java.lang.String r2 = "IV length of %d bits is required, got %d"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r0.<init>(r2)
            throw r0
        L_0x0214:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.e
            r0.<init>()
            throw r0
        L_0x021a:
            r0 = move-exception
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x0225:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r2 = "AES GCM ciphers are expected to make use of algorithm parameters"
            r0.<init>(r2)
            throw r0
        L_0x022d:
            r0 = move-exception
            goto L_0x0230
        L_0x022f:
            r0 = move-exception
        L_0x0230:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't encrypt with AES/GCM/NoPadding: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0247:
            p5.a r2 = androidx.compose.p015ui.text.input.C1993m.m4371q(r3, r2, r8, r4)
            int r3 = r0.length
            int r4 = r2.f17012s
            int r3 = r3 + r4
            boolean r4 = r2.f16997d
            if (r4 == 0) goto L_0x0257
            int r4 = r2.f16999f
            int r3 = r3 + r4
            goto L_0x025e
        L_0x0257:
            int r4 = r2.f16999f
            if (r3 >= r4) goto L_0x025d
            r3 = r5
            goto L_0x025e
        L_0x025d:
            int r3 = r3 - r4
        L_0x025e:
            byte[] r3 = new byte[r3]
            int r4 = r0.length
            int r0 = r2.mo20065b(r0, r4, r3)
            int r2 = r2.mo20064a(r0, r3)     // Catch:{ t -> 0x0297 }
            int r0 = r0 + r2
            int r0 = r0 - r9
            byte[] r2 = new byte[r0]
            byte[] r4 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r2, r5, r0)
            java.lang.System.arraycopy(r3, r0, r4, r5, r9)
            f8.a r0 = new f8.a
            r0.<init>((byte[]) r2, (byte[]) r4)
        L_0x027a:
            r3 = r0
        L_0x027b:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.g r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.g
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r2 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12549a((byte[]) r8)
            java.lang.Object r4 = r3.f14989b
            byte[] r4 = (byte[]) r4
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r4 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12549a((byte[]) r4)
            java.io.Serializable r3 = r3.f14990c
            byte[] r3 = (byte[]) r3
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12549a((byte[]) r3)
            r5 = r18
            r0.<init>(r5, r2, r4, r3)
            return r0
        L_0x0297:
            r0 = move-exception
            r2 = r0
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't generate GCM authentication tag: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r2.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x02b0:
            r0 = move-exception
            goto L_0x02b7
        L_0x02b2:
            r0 = move-exception
            goto L_0x02b7
        L_0x02b4:
            r0 = move-exception
            goto L_0x02b7
        L_0x02b6:
            r0 = move-exception
        L_0x02b7:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't create AES/GCM/NoPadding cipher: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x02ce:
            r5 = r18
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r2 = r18.mo17681h()
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod> r3 = p106f8.C6814e.f14999f
            java.lang.String r2 = kotlin.jvm.internal.C19388s.m32867j(r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x02e0:
            r0 = move-exception
            r3 = r4
            goto L_0x02e7
        L_0x02e3:
            r0 = move-exception
            goto L_0x02e7
        L_0x02e5:
            r0 = move-exception
            r6 = r3
        L_0x02e7:
            if (r3 == 0) goto L_0x02ec
            r3.close()     // Catch:{ Exception -> 0x02f2 }
        L_0x02ec:
            if (r6 == 0) goto L_0x02f1
            r6.end()     // Catch:{ Exception -> 0x02f2 }
        L_0x02f1:
            throw r0     // Catch:{ Exception -> 0x02f2 }
        L_0x02f2:
            r0 = move-exception
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r3 = "Couldn't compress plain text: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x030a:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported compression algorithm: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0321:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The Content Encryption Key (CEK) length for "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " must be "
            r3.append(r4)
            int r0 = r0.mo17676b()
            r3.append(r0)
            java.lang.String r0 = " bits"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0349:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            int r3 = r0.mo17676b()
            r2.<init>(r3, r0)
            throw r2
        L_0x0353:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid alg "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i8.C6998a.mo19181a(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader, byte[]):com.cardinalcommerce.dependencies.internal.nimbusds.jose.g");
    }
}
