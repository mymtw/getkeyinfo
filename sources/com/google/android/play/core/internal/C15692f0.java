package com.google.android.play.core.internal;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.models.editable.EditableListing;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p003a2.C0023f;

/* renamed from: com.google.android.play.core.internal.f0 */
public final class C15692f0 {
    /* renamed from: a */
    public static X509Certificate[][] m25508a(String str) throws zzf, SecurityException, IOException {
        Pair pair;
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() < 22) {
                pair = null;
            } else {
                pair = C15694g0.m25520a(randomAccessFile, 0);
                if (pair == null) {
                    pair = C15694g0.m25520a(randomAccessFile, SupportMenu.USER_MASK);
                }
            }
            if (pair != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) pair.first;
                long longValue = ((Long) pair.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                C15694g0.m25521b(byteBuffer2);
                long j2 = ((long) byteBuffer2.getInt(byteBuffer2.position() + 16)) & UnsignedInteger.INT_MASK;
                if (j2 < longValue) {
                    C15694g0.m25521b(byteBuffer2);
                    if ((((long) byteBuffer2.getInt(byteBuffer2.position() + 12)) & UnsignedInteger.INT_MASK) + j2 != longValue) {
                        throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (j2 >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        allocate.order(byteOrder);
                        randomAccessFile.seek(j2 - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            long j3 = allocate.getLong(0);
                            if (j3 < ((long) allocate.capacity()) || j3 > 2147483639) {
                                StringBuilder sb = new StringBuilder(57);
                                sb.append("APK Signing Block size out of range: ");
                                sb.append(j3);
                                throw new zzf(sb.toString());
                            }
                            int i2 = (int) (8 + j3);
                            long j4 = j2 - ((long) i2);
                            if (j4 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                                allocate2.order(byteOrder);
                                randomAccessFile.seek(j4);
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j5 = longValue;
                                long j6 = allocate2.getLong(0);
                                if (j6 == j3) {
                                    Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                    byteBuffer = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer.order() == byteOrder) {
                                        int capacity = byteBuffer.capacity() - 24;
                                        if (capacity >= 8) {
                                            int capacity2 = byteBuffer.capacity();
                                            if (capacity <= byteBuffer.capacity()) {
                                                limit = byteBuffer.limit();
                                                position = byteBuffer.position();
                                                byteBuffer.position(0);
                                                byteBuffer.limit(capacity);
                                                byteBuffer.position(8);
                                                ByteBuffer slice = byteBuffer.slice();
                                                slice.order(byteBuffer.order());
                                                byteBuffer.position(0);
                                                byteBuffer.limit(limit);
                                                byteBuffer.position(position);
                                                while (slice.hasRemaining()) {
                                                    i++;
                                                    if (slice.remaining() >= 8) {
                                                        long j7 = slice.getLong();
                                                        if (j7 < 4 || j7 > ParserMinimalBase.MAX_INT_L) {
                                                            StringBuilder sb2 = new StringBuilder(76);
                                                            sb2.append("APK Signing Block entry #");
                                                            sb2.append(i);
                                                            sb2.append(" size out of range: ");
                                                            sb2.append(j7);
                                                            throw new zzf(sb2.toString());
                                                        }
                                                        int i3 = (int) j7;
                                                        int position2 = slice.position() + i3;
                                                        if (i3 > slice.remaining()) {
                                                            int remaining = slice.remaining();
                                                            StringBuilder sb3 = new StringBuilder(91);
                                                            sb3.append("APK Signing Block entry #");
                                                            sb3.append(i);
                                                            sb3.append(" size out of range: ");
                                                            sb3.append(i3);
                                                            sb3.append(", available: ");
                                                            sb3.append(remaining);
                                                            throw new zzf(sb3.toString());
                                                        } else if (slice.getInt() == 1896449818) {
                                                            X509Certificate[][] k = m25518k(randomAccessFile.getChannel(), new C15690e0(m25512e(slice, i3 - 4), longValue2, j2, j5, byteBuffer2));
                                                            randomAccessFile.close();
                                                            try {
                                                                randomAccessFile.close();
                                                            } catch (IOException unused) {
                                                            }
                                                            return k;
                                                        } else {
                                                            slice.position(position2);
                                                        }
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(70);
                                                        sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                        sb4.append(i);
                                                        throw new zzf(sb4.toString());
                                                    }
                                                }
                                                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                                            }
                                            StringBuilder sb5 = new StringBuilder(41);
                                            sb5.append("end > capacity: ");
                                            sb5.append(capacity);
                                            sb5.append(EditableListing.CATEGORY_PATH_JOIN_STRING);
                                            sb5.append(capacity2);
                                            throw new IllegalArgumentException(sb5.toString());
                                        }
                                        StringBuilder sb6 = new StringBuilder(38);
                                        sb6.append("end < start: ");
                                        sb6.append(capacity);
                                        sb6.append(" < ");
                                        sb6.append(8);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                }
                                StringBuilder sb7 = new StringBuilder(103);
                                sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                sb7.append(j6);
                                sb7.append(" vs ");
                                sb7.append(j3);
                                throw new zzf(sb7.toString());
                            }
                            StringBuilder sb8 = new StringBuilder(59);
                            sb8.append("APK Signing Block offset out of range: ");
                            sb8.append(j4);
                            throw new zzf(sb8.toString());
                        }
                        throw new zzf("No APK Signing Block before ZIP Central Directory");
                    } else {
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(j2);
                        throw new zzf(sb9.toString());
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(122);
                    sb10.append("ZIP Central Directory offset out of range: ");
                    sb10.append(j2);
                    sb10.append(". ZIP End of Central Directory offset: ");
                    sb10.append(longValue);
                    throw new zzf(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new zzf(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static int m25509b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(C0072d.m200g(44, "Unknown content digest algorthm: ", i));
    }

    /* renamed from: c */
    public static int m25510c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: d */
    public static String m25511d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(C0072d.m200g(44, "Unknown content digest algorthm: ", i));
    }

    /* renamed from: e */
    public static ByteBuffer m25512e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: f */
    public static ByteBuffer m25513f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m25512e(byteBuffer, i);
            } else {
                throw new IOException(C0023f.m107h(101, "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
        } else {
            throw new IOException(C0072d.m200g(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
    }

    /* renamed from: g */
    public static void m25514g(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: h */
    public static byte[] m25515h(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            throw new IOException(C0023f.m107h(90, "Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
    }

    /* renamed from: i */
    public static X509Certificate[] m25516i(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair pair;
        ByteBuffer f = m25513f(byteBuffer);
        ByteBuffer f2 = m25513f(byteBuffer);
        byte[] h = m25515h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = 0;
        int i2 = -1;
        byte[] bArr2 = null;
        while (f2.hasRemaining()) {
            i++;
            try {
                ByteBuffer f3 = m25513f(f2);
                if (f3.remaining() >= 8) {
                    int i3 = f3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (!(i3 == 513 || i3 == 514 || i3 == 769)) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i2 != -1) {
                        int c = m25510c(i3);
                        int c2 = m25510c(i2);
                        if (c != 1) {
                            if (c2 != 1) {
                            }
                        }
                    }
                    bArr2 = m25515h(f3);
                    i2 = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(C0072d.m200g(45, "Failed to parse signature record #", i), e);
            }
        }
        if (i2 != -1) {
            if (i2 == 513 || i2 == 514) {
                str = "EC";
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = BaseSecureKeyWrapper.RSA_ALGORITHM;
                        break;
                    default:
                        String valueOf = String.valueOf(Long.toHexString((long) i2));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                }
            } else {
                str = "DSA";
            }
            if (i2 == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i2 == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString((long) i2));
                        throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf2) : new String("Unknown signature algorithm: 0x"));
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(h));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(f);
                if (instance.verify(bArr2)) {
                    f.clear();
                    ByteBuffer f4 = m25513f(f);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (f4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer f5 = m25513f(f4);
                            if (f5.remaining() >= 8) {
                                int i5 = f5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i2) {
                                    bArr = m25515h(f5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            throw new IOException(C0072d.m200g(42, "Failed to parse digest record #", i4), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int c3 = m25510c(i2);
                        byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(c3), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer f6 = m25513f(f);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (f6.hasRemaining()) {
                                i6++;
                                byte[] h2 = m25515h(f6);
                                try {
                                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(h2)), h2));
                                } catch (CertificateException e3) {
                                    throw new SecurityException(C0072d.m200g(41, "Failed to decode certificate #", i6), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(h, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(m25511d(c3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                throw new SecurityException(C0070b.m184f(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e4);
            }
        } else if (i == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* renamed from: j */
    public static byte[][] m25517j(int[] iArr, C15708t[] tVarArr) throws DigestException {
        int length;
        int[] iArr2 = iArr;
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            j2 += (tVarArr[i2].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (j2 < 2097151) {
            int i3 = (int) j2;
            byte[][] bArr = new byte[iArr2.length][];
            int i4 = 0;
            while (true) {
                length = iArr2.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m25509b(iArr2[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m25514g(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i5 = 0;
            while (i5 < iArr2.length) {
                String d = m25511d(iArr2[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(d);
                    i5++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            long j3 = 1048576;
            int i6 = 0;
            int i7 = 3;
            int i8 = 0;
            while (i < i7) {
                C15708t tVar = tVarArr[i];
                int i9 = i8;
                int i10 = i6;
                long zza = tVar.zza();
                long j4 = j3;
                long j5 = j;
                while (zza > j) {
                    int min = (int) Math.min(zza, j4);
                    m25514g(min, bArr3);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    try {
                        tVar.mo55518a(messageDigestArr, j5, min);
                        int i12 = 0;
                        while (i12 < iArr2.length) {
                            int i13 = iArr2[i12];
                            byte[] bArr4 = bArr[i12];
                            int b = m25509b(i13);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i10 * b) + 5, b);
                            if (digest == b) {
                                i12++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        byte[] bArr6 = bArr3;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = (long) min;
                        j5 += j6;
                        zza -= j6;
                        i10++;
                        j = 0;
                        j4 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    } catch (IOException e2) {
                        throw new DigestException(C0023f.m107h(59, "Failed to digest chunk #", i10, " of section #", i9), e2);
                    }
                }
                byte[] bArr7 = bArr3;
                i6 = i10;
                i8 = i9 + 1;
                i++;
                j = 0;
                i7 = 3;
                j3 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                messageDigestArr = messageDigestArr;
            }
            byte[][] bArr8 = new byte[iArr2.length][];
            int i14 = 0;
            while (i14 < iArr2.length) {
                int i15 = iArr2[i14];
                byte[] bArr9 = bArr[i14];
                String d2 = m25511d(i15);
                try {
                    bArr8[i14] = MessageDigest.getInstance(d2).digest(bArr9);
                    i14++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr8;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Too many chunks: ");
        sb2.append(j2);
        throw new DigestException(sb2.toString());
    }

    /* renamed from: k */
    public static X509Certificate[][] m25518k(FileChannel fileChannel, C15690e0 e0Var) throws SecurityException {
        C15690e0 e0Var2 = e0Var;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = m25513f(e0Var2.f35450a);
                int i = 0;
                int i2 = 0;
                while (f.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(m25516i(m25513f(f), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    long j = e0Var2.f35451b;
                    long j2 = e0Var2.f35452c;
                    long j3 = e0Var2.f35453d;
                    ByteBuffer byteBuffer = e0Var2.f35454e;
                    if (!hashMap.isEmpty()) {
                        FileChannel fileChannel2 = fileChannel;
                        C15688d0 d0Var = new C15688d0(fileChannel2, 0, j);
                        C15688d0 d0Var2 = new C15688d0(fileChannel2, j2, j3 - j2);
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        C15694g0.m25521b(duplicate);
                        int position = duplicate.position() + 16;
                        if (j < 0 || j > UnsignedInteger.INT_MASK) {
                            StringBuilder sb2 = new StringBuilder(47);
                            sb2.append("uint32 value of out range: ");
                            sb2.append(j);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        duplicate.putInt(duplicate.position() + position, (int) j);
                        C15703o oVar = new C15703o(duplicate);
                        int size = hashMap.size();
                        int[] iArr = new int[size];
                        int i3 = 0;
                        for (Integer intValue : hashMap.keySet()) {
                            iArr[i3] = intValue.intValue();
                            i3++;
                        }
                        try {
                            byte[][] j4 = m25517j(iArr, new C15708t[]{d0Var, d0Var2, oVar});
                            while (i < size) {
                                int i4 = iArr[i];
                                if (MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), j4[i])) {
                                    i++;
                                } else {
                                    throw new SecurityException(m25511d(i4).concat(" digest of contents did not verify"));
                                }
                            }
                            return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                        } catch (DigestException e2) {
                            throw new SecurityException("Failed to compute digest(s) of contents", e2);
                        }
                    } else {
                        throw new SecurityException("No digests provided");
                    }
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }
}
