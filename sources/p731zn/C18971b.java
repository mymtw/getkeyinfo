package p731zn;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.net.URLCodec;

/* renamed from: zn.b */
public final class C18971b {

    /* renamed from: a */
    public static final byte[] f42290a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 43, URLCodec.ESCAPE_CHAR, 42, BaseNCodec.PAD_DEFAULT, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f42291b = {59, 60, 62, 64, 91, 92, 93, Framer.STDIN_REQUEST_FRAME_PREFIX, 96, 126, Framer.ENTER_FRAME_PREFIX, 13, 9, 44, 58, 10, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    public static final byte[] f42292c;

    /* renamed from: d */
    public static final byte[] f42293d = new byte[128];

    /* renamed from: e */
    public static final Charset f42294e = StandardCharsets.ISO_8859_1;

    /* renamed from: zn.b$a */
    public static /* synthetic */ class C18972a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42295a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.zxing.pdf417.encoder.Compaction[] r0 = com.google.zxing.pdf417.encoder.Compaction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42295a = r0
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42295a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42295a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p731zn.C18971b.C18972a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        f42292c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f42290a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f42292c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f42293d, (byte) -1);
        while (true) {
            byte[] bArr3 = f42291b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f42293d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m32088a(byte[] bArr, int i, int i2, StringBuilder sb) {
        int i3;
        if (i == 1 && i2 == 0) {
            sb.append(913);
        } else if (i % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i >= 6) {
            char[] cArr = new char[5];
            i3 = 0;
            while ((0 + i) - i3 >= 6) {
                long j = 0;
                for (int i4 = 0; i4 < 6; i4++) {
                    j = (j << 8) + ((long) (bArr[i3 + i4] & 255));
                }
                for (int i5 = 0; i5 < 5; i5++) {
                    cArr[i5] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i6 = 4; i6 >= 0; i6--) {
                    sb.append(cArr[i6]);
                }
                i3 += 6;
            }
        } else {
            i3 = 0;
        }
        while (i3 < 0 + i) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    /* renamed from: b */
    public static void m32089b(StringBuilder sb, int i, int i2, String str) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0109 A[EDGE_INSN: B:83:0x0109->B:68:0x0109 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0010 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32090c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0010:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            r5 = -1
            if (r7 == 0) goto L_0x00ca
            if (r7 == r6) goto L_0x008a
            if (r7 == r4) goto L_0x003c
            byte[] r9 = f42293d
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x002f
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0038
            char r5 = (char) r9
            r3.append(r5)
            goto L_0x0105
        L_0x0038:
            r3.append(r15)
            goto L_0x0056
        L_0x003c:
            byte[] r11 = f42292c
            byte r11 = r11[r10]
            if (r11 == r5) goto L_0x0044
            r12 = r6
            goto L_0x0045
        L_0x0044:
            r12 = 0
        L_0x0045:
            if (r12 == 0) goto L_0x004d
            char r5 = (char) r11
            r3.append(r5)
            goto L_0x0105
        L_0x004d:
            boolean r11 = m32092e(r10)
            if (r11 == 0) goto L_0x0058
            r3.append(r13)
        L_0x0056:
            r7 = 0
            goto L_0x0010
        L_0x0058:
            boolean r11 = m32091d(r10)
            if (r11 == 0) goto L_0x0063
            r3.append(r14)
            goto L_0x00e6
        L_0x0063:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x007d
            char r9 = r0.charAt(r9)
            byte[] r11 = f42293d
            byte r9 = r11[r9]
            if (r9 == r5) goto L_0x0073
            r5 = r6
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            if (r5 == 0) goto L_0x007d
            r7 = 3
            r5 = 25
            r3.append(r5)
            goto L_0x0010
        L_0x007d:
            r3.append(r15)
            byte[] r5 = f42293d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0105
        L_0x008a:
            boolean r9 = m32091d(r10)
            if (r9 == 0) goto L_0x009f
            if (r10 != r12) goto L_0x0097
            r3.append(r11)
            goto L_0x0105
        L_0x0097:
            int r10 = r10 + -97
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x009f:
            boolean r9 = m32092e(r10)
            if (r9 == 0) goto L_0x00af
            r3.append(r14)
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x00af:
            byte[] r9 = f42292c
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x00b7
            r5 = r6
            goto L_0x00b8
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            if (r5 == 0) goto L_0x00be
            r3.append(r13)
            goto L_0x00f7
        L_0x00be:
            r3.append(r15)
            byte[] r5 = f42293d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0105
        L_0x00ca:
            boolean r9 = m32092e(r10)
            if (r9 == 0) goto L_0x00dd
            if (r10 != r12) goto L_0x00d6
            r3.append(r11)
            goto L_0x0105
        L_0x00d6:
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x00dd:
            boolean r9 = m32091d(r10)
            if (r9 == 0) goto L_0x00e9
            r3.append(r14)
        L_0x00e6:
            r7 = r6
            goto L_0x0010
        L_0x00e9:
            byte[] r9 = f42292c
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x00f1
            r5 = r6
            goto L_0x00f2
        L_0x00f1:
            r5 = 0
        L_0x00f2:
            if (r5 == 0) goto L_0x00fa
            r3.append(r13)
        L_0x00f7:
            r7 = r4
            goto L_0x0010
        L_0x00fa:
            r3.append(r15)
            byte[] r5 = f42293d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
        L_0x0105:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0010
            int r0 = r3.length()
            r1 = 0
            r5 = 0
        L_0x010f:
            if (r1 >= r0) goto L_0x012d
            int r8 = r1 % 2
            if (r8 == 0) goto L_0x0117
            r8 = r6
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 == 0) goto L_0x0126
            int r5 = r5 * 30
            char r8 = r3.charAt(r1)
            int r8 = r8 + r5
            char r5 = (char) r8
            r2.append(r5)
            goto L_0x012a
        L_0x0126:
            char r5 = r3.charAt(r1)
        L_0x012a:
            int r1 = r1 + 1
            goto L_0x010f
        L_0x012d:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0137
            int r5 = r5 * 30
            int r5 = r5 + r15
            char r0 = (char) r5
            r2.append(r0)
        L_0x0137:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p731zn.C18971b.m32090c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: d */
    public static boolean m32091d(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m32092e(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
