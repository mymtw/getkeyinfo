package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;
import org.apache.commons.lang3.CharUtils;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19913x;

/* renamed from: com.squareup.moshi.q */
public final class C17405q extends JsonReader {

    /* renamed from: o */
    public static final ByteString f37973o = ByteString.encodeUtf8("'\\");

    /* renamed from: p */
    public static final ByteString f37974p = ByteString.encodeUtf8("\"\\");

    /* renamed from: q */
    public static final ByteString f37975q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: r */
    public static final ByteString f37976r = ByteString.encodeUtf8("\n\r");

    /* renamed from: s */
    public static final ByteString f37977s = ByteString.encodeUtf8(ResourceConstants.EXT_CMT_END);

    /* renamed from: h */
    public final C19897i f37978h;

    /* renamed from: i */
    public final C19893f f37979i;

    /* renamed from: j */
    public int f37980j = 0;

    /* renamed from: k */
    public long f37981k;

    /* renamed from: l */
    public int f37982l;

    /* renamed from: m */
    public String f37983m;

    /* renamed from: n */
    public C17410u f37984n;

    public C17405q(C19897i iVar) {
        if (iVar != null) {
            this.f37978h = iVar;
            this.f37979i = iVar.mo72745l();
            mo68404G(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ee, code lost:
        if (mo68503D0(r8) != false) goto L_0x024f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0252 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0160 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0161  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo68500A0() throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f37892c
            int r2 = r0.f37891b
            int r3 = r2 + -1
            r3 = r1[r3]
            r9 = 6
            r10 = 1
            r11 = 3
            r12 = 0
            r15 = 4
            r5 = 0
            r7 = 5
            r4 = 93
            r6 = 59
            r8 = 44
            r14 = 2
            if (r3 != r10) goto L_0x0020
            int r2 = r2 - r10
            r1[r2] = r14
        L_0x001e:
            r14 = 7
            goto L_0x0083
        L_0x0020:
            if (r3 != r14) goto L_0x003e
            int r1 = r0.mo68504E0(r10)
            lr.f r2 = r0.f37979i
            r2.readByte()
            if (r1 == r8) goto L_0x001e
            if (r1 == r6) goto L_0x003a
            if (r1 != r4) goto L_0x0034
            r0.f37980j = r15
            return r15
        L_0x0034:
            java.lang.String r1 = "Unterminated array"
            r0.mo68415f0(r1)
            throw r5
        L_0x003a:
            r17.mo68511x0()
            goto L_0x001e
        L_0x003e:
            if (r3 == r11) goto L_0x02bf
            if (r3 != r7) goto L_0x0044
            goto L_0x02bf
        L_0x0044:
            if (r3 != r15) goto L_0x007d
            int r2 = r2 - r10
            r1[r2] = r7
            int r1 = r0.mo68504E0(r10)
            lr.f r2 = r0.f37979i
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x0077
            r17.mo68511x0()
            lr.i r1 = r0.f37978h
            r14 = 1
            boolean r1 = r1.request(r14)
            if (r1 == 0) goto L_0x001e
            lr.f r1 = r0.f37979i
            byte r1 = r1.mo72738h(r12)
            r2 = 62
            if (r1 != r2) goto L_0x001e
            lr.f r1 = r0.f37979i
            r1.readByte()
            goto L_0x001e
        L_0x0077:
            java.lang.String r1 = "Expected ':'"
            r0.mo68415f0(r1)
            throw r5
        L_0x007d:
            if (r3 != r9) goto L_0x0085
            int r2 = r2 - r10
            r14 = 7
            r1[r2] = r14
        L_0x0083:
            r1 = 0
            goto L_0x00c5
        L_0x0085:
            r14 = 7
            if (r3 != r14) goto L_0x0099
            r1 = 0
            int r2 = r0.mo68504E0(r1)
            r14 = -1
            if (r2 != r14) goto L_0x0095
            r1 = 18
            r0.f37980j = r1
            return r1
        L_0x0095:
            r17.mo68511x0()
            goto L_0x00c5
        L_0x0099:
            r1 = 0
            r2 = 9
            if (r3 != r2) goto L_0x00c1
            com.squareup.moshi.u r1 = r0.f37984n
            r1.f38007h = r10
        L_0x00a2:
            okio.ByteString r2 = r1.f38004e
            okio.ByteString r3 = com.squareup.moshi.C17410u.f38000n
            if (r2 == r3) goto L_0x00b5
            r2 = 8192(0x2000, double:4.0474E-320)
            r1.mo68545a(r2)
            lr.i r2 = r1.f38001b
            long r3 = r1.f38006g
            r2.skip(r3)
            goto L_0x00a2
        L_0x00b5:
            r0.f37984n = r5
            int r1 = r0.f37891b
            int r1 = r1 - r10
            r0.f37891b = r1
            int r1 = r17.mo68500A0()
            return r1
        L_0x00c1:
            r2 = 8
            if (r3 == r2) goto L_0x02b7
        L_0x00c5:
            int r2 = r0.mo68504E0(r10)
            r14 = 34
            if (r2 == r14) goto L_0x02ad
            r14 = 39
            if (r2 == r14) goto L_0x02a0
            if (r2 == r8) goto L_0x028c
            if (r2 == r6) goto L_0x028c
            r6 = 91
            if (r2 == r6) goto L_0x0283
            if (r2 == r4) goto L_0x0278
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L_0x0270
            lr.f r2 = r0.f37979i
            byte r2 = r2.mo72738h(r12)
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x010b
            r3 = 84
            if (r2 != r3) goto L_0x00ee
            goto L_0x010b
        L_0x00ee:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x0105
            r3 = 70
            if (r2 != r3) goto L_0x00f7
            goto L_0x0105
        L_0x00f7:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x00ff
            r3 = 78
            if (r2 != r3) goto L_0x0154
        L_0x00ff:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L_0x0110
        L_0x0105:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r4 = r9
            goto L_0x0110
        L_0x010b:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r4 = r7
        L_0x0110:
            int r6 = r2.length()
            r8 = r10
        L_0x0115:
            if (r8 >= r6) goto L_0x013c
            lr.i r14 = r0.f37978h
            int r15 = r8 + 1
            long r11 = (long) r15
            boolean r11 = r14.request(r11)
            if (r11 != 0) goto L_0x0123
            goto L_0x0154
        L_0x0123:
            lr.f r11 = r0.f37979i
            long r12 = (long) r8
            byte r11 = r11.mo72738h(r12)
            char r12 = r2.charAt(r8)
            if (r11 == r12) goto L_0x0137
            char r8 = r3.charAt(r8)
            if (r11 == r8) goto L_0x0137
            goto L_0x0154
        L_0x0137:
            r8 = r15
            r11 = 3
            r12 = 0
            goto L_0x0115
        L_0x013c:
            lr.i r2 = r0.f37978h
            int r3 = r6 + 1
            long r11 = (long) r3
            boolean r2 = r2.request(r11)
            if (r2 == 0) goto L_0x0156
            lr.f r2 = r0.f37979i
            long r11 = (long) r6
            byte r2 = r2.mo72738h(r11)
            boolean r2 = r0.mo68503D0(r2)
            if (r2 == 0) goto L_0x0156
        L_0x0154:
            r4 = r1
            goto L_0x015e
        L_0x0156:
            lr.f r2 = r0.f37979i
            long r11 = (long) r6
            r2.skip(r11)
            r0.f37980j = r4
        L_0x015e:
            if (r4 == 0) goto L_0x0161
            return r4
        L_0x0161:
            r2 = r1
            r3 = r2
            r6 = r3
            r4 = r10
            r11 = 0
        L_0x0167:
            lr.i r8 = r0.f37978h
            int r13 = r3 + 1
            long r14 = (long) r13
            boolean r8 = r8.request(r14)
            if (r8 != 0) goto L_0x0177
            r16 = r6
        L_0x0174:
            r5 = 2
            goto L_0x01f1
        L_0x0177:
            lr.f r8 = r0.f37979i
            long r14 = (long) r3
            byte r8 = r8.mo72738h(r14)
            r14 = 43
            if (r8 == r14) goto L_0x0244
            r14 = 69
            if (r8 == r14) goto L_0x023a
            r14 = 101(0x65, float:1.42E-43)
            if (r8 == r14) goto L_0x023a
            r14 = 45
            if (r8 == r14) goto L_0x022f
            r14 = 46
            if (r8 == r14) goto L_0x0228
            r14 = 48
            if (r8 < r14) goto L_0x01e8
            r14 = 57
            if (r8 <= r14) goto L_0x019b
            goto L_0x01e8
        L_0x019b:
            if (r2 == r10) goto L_0x01dd
            if (r2 != 0) goto L_0x01a0
            goto L_0x01dd
        L_0x01a0:
            r3 = 2
            if (r2 != r3) goto L_0x01cc
            r14 = 0
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x01ab
            goto L_0x024f
        L_0x01ab:
            r14 = 10
            long r14 = r14 * r11
            int r8 = r8 + -48
            r16 = r6
            long r5 = (long) r8
            long r14 = r14 - r5
            r5 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x01c6
            if (r3 != 0) goto L_0x01c4
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r3 = r1
            goto L_0x01c7
        L_0x01c6:
            r3 = r10
        L_0x01c7:
            r3 = r3 & r4
            r4 = r3
            r11 = r14
            goto L_0x0249
        L_0x01cc:
            r16 = r6
            r3 = 3
            if (r2 != r3) goto L_0x01d4
            r2 = 4
            goto L_0x0249
        L_0x01d4:
            if (r2 == r7) goto L_0x01d8
            if (r2 != r9) goto L_0x0249
        L_0x01d8:
            r6 = r16
            r2 = 7
            goto L_0x024b
        L_0x01dd:
            r16 = r6
            int r8 = r8 + -48
            int r2 = -r8
            long r11 = (long) r2
            r6 = r16
            r2 = 2
            goto L_0x024b
        L_0x01e8:
            r16 = r6
            boolean r5 = r0.mo68503D0(r8)
            if (r5 != 0) goto L_0x024f
            goto L_0x0174
        L_0x01f1:
            if (r2 != r5) goto L_0x0218
            if (r4 == 0) goto L_0x0216
            r4 = -9223372036854775808
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x01fd
            if (r16 == 0) goto L_0x0216
        L_0x01fd:
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0205
            if (r16 != 0) goto L_0x0216
        L_0x0205:
            if (r16 == 0) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            long r11 = -r11
        L_0x0209:
            r0.f37981k = r11
            lr.f r1 = r0.f37979i
            long r2 = (long) r3
            r1.skip(r2)
            r8 = 16
            r0.f37980j = r8
            goto L_0x0250
        L_0x0216:
            r4 = 2
            goto L_0x0219
        L_0x0218:
            r4 = r5
        L_0x0219:
            if (r2 == r4) goto L_0x0221
            r4 = 4
            if (r2 == r4) goto L_0x0221
            r4 = 7
            if (r2 != r4) goto L_0x024f
        L_0x0221:
            r0.f37982l = r3
            r8 = 17
            r0.f37980j = r8
            goto L_0x0250
        L_0x0228:
            r16 = r6
            r3 = 2
            if (r2 != r3) goto L_0x024f
            r2 = 3
            goto L_0x0249
        L_0x022f:
            r16 = r6
            r3 = 2
            if (r2 != 0) goto L_0x0237
            r2 = r10
            r6 = r2
            goto L_0x024b
        L_0x0237:
            if (r2 != r7) goto L_0x024f
            goto L_0x0248
        L_0x023a:
            r16 = r6
            r3 = 2
            if (r2 == r3) goto L_0x0242
            r3 = 4
            if (r2 != r3) goto L_0x024f
        L_0x0242:
            r2 = r7
            goto L_0x0249
        L_0x0244:
            r16 = r6
            if (r2 != r7) goto L_0x024f
        L_0x0248:
            r2 = r9
        L_0x0249:
            r6 = r16
        L_0x024b:
            r3 = r13
            r5 = 0
            goto L_0x0167
        L_0x024f:
            r8 = r1
        L_0x0250:
            if (r8 == 0) goto L_0x0253
            return r8
        L_0x0253:
            lr.f r1 = r0.f37979i
            r2 = 0
            byte r1 = r1.mo72738h(r2)
            boolean r1 = r0.mo68503D0(r1)
            if (r1 == 0) goto L_0x0269
            r17.mo68511x0()
            r1 = 10
            r0.f37980j = r1
            return r1
        L_0x0269:
            java.lang.String r1 = "Expected value"
            r0.mo68415f0(r1)
            r1 = 0
            throw r1
        L_0x0270:
            lr.f r1 = r0.f37979i
            r1.readByte()
            r0.f37980j = r10
            return r10
        L_0x0278:
            if (r3 != r10) goto L_0x028c
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 4
            r0.f37980j = r1
            return r1
        L_0x0283:
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 3
            r0.f37980j = r1
            return r1
        L_0x028c:
            if (r3 == r10) goto L_0x0299
            r1 = 2
            if (r3 != r1) goto L_0x0292
            goto L_0x0299
        L_0x0292:
            java.lang.String r1 = "Unexpected value"
            r0.mo68415f0(r1)
            r1 = 0
            throw r1
        L_0x0299:
            r17.mo68511x0()
            r1 = 7
            r0.f37980j = r1
            return r1
        L_0x02a0:
            r17.mo68511x0()
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 8
            r0.f37980j = r1
            return r1
        L_0x02ad:
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 9
            r0.f37980j = r1
            return r1
        L_0x02b7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02bf:
            int r2 = r2 - r10
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r7) goto L_0x02e4
            int r2 = r0.mo68504E0(r10)
            lr.f r4 = r0.f37979i
            r4.readByte()
            if (r2 == r8) goto L_0x02e4
            if (r2 == r6) goto L_0x02e1
            if (r2 != r1) goto L_0x02da
            r1 = 2
            r0.f37980j = r1
            return r1
        L_0x02da:
            java.lang.String r1 = "Unterminated object"
            r0.mo68415f0(r1)
            r1 = 0
            throw r1
        L_0x02e1:
            r17.mo68511x0()
        L_0x02e4:
            int r2 = r0.mo68504E0(r10)
            r4 = 34
            if (r2 == r4) goto L_0x0325
            r4 = 39
            if (r2 == r4) goto L_0x0318
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0308
            r17.mo68511x0()
            char r1 = (char) r2
            boolean r1 = r0.mo68503D0(r1)
            if (r1 == 0) goto L_0x0303
            r1 = 14
            r0.f37980j = r1
            return r1
        L_0x0303:
            r0.mo68415f0(r4)
            r1 = 0
            throw r1
        L_0x0308:
            r1 = 0
            if (r3 == r7) goto L_0x0314
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 2
            r0.f37980j = r1
            return r1
        L_0x0314:
            r0.mo68415f0(r4)
            throw r1
        L_0x0318:
            lr.f r1 = r0.f37979i
            r1.readByte()
            r17.mo68511x0()
            r1 = 12
            r0.f37980j = r1
            return r1
        L_0x0325:
            lr.f r1 = r0.f37979i
            r1.readByte()
            r1 = 13
            r0.f37980j = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17405q.mo68500A0():int");
    }

    /* renamed from: B */
    public final void mo68403B() throws IOException {
        if (mo68414f()) {
            this.f37983m = mo68421k();
            this.f37980j = 11;
        }
    }

    /* renamed from: B0 */
    public final int mo68501B0(String str, JsonReader.C17362b bVar) {
        int length = bVar.f37898a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f37898a[i])) {
                this.f37980j = 0;
                this.f37893d[this.f37891b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C0 */
    public final int mo68502C0(String str, JsonReader.C17362b bVar) {
        int length = bVar.f37898a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f37898a[i])) {
                this.f37980j = 0;
                int[] iArr = this.f37894e;
                int i2 = this.f37891b - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D0 */
    public final boolean mo68503D0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo68511x0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r10.f37979i.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1 != 47) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r10.f37978h.request(2) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        mo68511x0();
        r7 = r10.f37979i.mo72738h(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r7 == 42) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r7 == 47) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r10.f37979i.readByte();
        r10.f37979i.readByte();
        r0 = r10.f37978h.mo72773z(f37976r);
        r2 = r10.f37979i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r0 == -1) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r0 = r2.f43876c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r2.skip(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r10.f37979i.readByte();
        r10.f37979i.readByte();
        r1 = r10.f37978h;
        r2 = f37977s;
        r3 = r1.mo72763w(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r3 == -1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r1 = r10.f37979i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        if (r0 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r3 = r3 + ((long) r2.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r3 = r1.f43876c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        r1.skip(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r0 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        mo68415f0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r1 != 35) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        mo68511x0();
        r0 = r10.f37978h.mo72773z(f37976r);
        r2 = r10.f37979i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r0 == -1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        r0 = r2.f43876c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r2.skip(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        return r1;
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo68504E0(boolean r11) throws java.io.IOException {
        /*
            r10 = this;
        L_0x0000:
            r0 = 0
            r1 = r0
        L_0x0002:
            lr.i r2 = r10.f37978h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L_0x00c5
            lr.f r2 = r10.f37979i
            long r4 = (long) r1
            byte r1 = r2.mo72738h(r4)
            r2 = 10
            if (r1 == r2) goto L_0x00c2
            r2 = 32
            if (r1 == r2) goto L_0x00c2
            r2 = 13
            if (r1 == r2) goto L_0x00c2
            r2 = 9
            if (r1 != r2) goto L_0x0026
            goto L_0x00c2
        L_0x0026:
            lr.f r2 = r10.f37979i
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            r3 = 1
            r5 = -1
            if (r1 != r2) goto L_0x00a3
            lr.i r7 = r10.f37978h
            r8 = 2
            boolean r7 = r7.request(r8)
            if (r7 != 0) goto L_0x0041
            return r1
        L_0x0041:
            r10.mo68511x0()
            lr.f r7 = r10.f37979i
            byte r7 = r7.mo72738h(r3)
            r8 = 42
            if (r7 == r8) goto L_0x0071
            if (r7 == r2) goto L_0x0051
            return r1
        L_0x0051:
            lr.f r0 = r10.f37979i
            r0.readByte()
            lr.f r0 = r10.f37979i
            r0.readByte()
            lr.i r0 = r10.f37978h
            okio.ByteString r1 = f37976r
            long r0 = r0.mo72773z(r1)
            lr.f r2 = r10.f37979i
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x006b
            long r0 = r0 + r3
            goto L_0x006d
        L_0x006b:
            long r0 = r2.f43876c
        L_0x006d:
            r2.skip(r0)
            goto L_0x0000
        L_0x0071:
            lr.f r1 = r10.f37979i
            r1.readByte()
            lr.f r1 = r10.f37979i
            r1.readByte()
            lr.i r1 = r10.f37978h
            okio.ByteString r2 = f37977s
            long r3 = r1.mo72763w(r2)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0088
            r0 = 1
        L_0x0088:
            lr.f r1 = r10.f37979i
            if (r0 == 0) goto L_0x0093
            int r2 = r2.size()
            long r5 = (long) r2
            long r3 = r3 + r5
            goto L_0x0095
        L_0x0093:
            long r3 = r1.f43876c
        L_0x0095:
            r1.skip(r3)
            if (r0 == 0) goto L_0x009c
            goto L_0x0000
        L_0x009c:
            java.lang.String r11 = "Unterminated comment"
            r10.mo68415f0(r11)
            r11 = 0
            throw r11
        L_0x00a3:
            r0 = 35
            if (r1 != r0) goto L_0x00c1
            r10.mo68511x0()
            lr.i r0 = r10.f37978h
            okio.ByteString r1 = f37976r
            long r0 = r0.mo72773z(r1)
            lr.f r2 = r10.f37979i
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00ba
            long r0 = r0 + r3
            goto L_0x00bc
        L_0x00ba:
            long r0 = r2.f43876c
        L_0x00bc:
            r2.skip(r0)
            goto L_0x0000
        L_0x00c1:
            return r1
        L_0x00c2:
            r1 = r3
            goto L_0x0002
        L_0x00c5:
            if (r11 != 0) goto L_0x00c9
            r11 = -1
            return r11
        L_0x00c9:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17405q.mo68504E0(boolean):int");
    }

    /* renamed from: F0 */
    public final String mo68505F0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long z = this.f37978h.mo72773z(byteString);
            if (z == -1) {
                mo68415f0("Unterminated string");
                throw null;
            } else if (this.f37979i.mo72738h(z) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f37979i.mo72720M(z));
                this.f37979i.readByte();
                sb.append(mo68507H0());
            } else if (sb == null) {
                String M = this.f37979i.mo72720M(z);
                this.f37979i.readByte();
                return M;
            } else {
                sb.append(this.f37979i.mo72720M(z));
                this.f37979i.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: G0 */
    public final String mo68506G0() throws IOException {
        long z = this.f37978h.mo72773z(f37975q);
        return z != -1 ? this.f37979i.mo72720M(z) : this.f37979i.mo72708B();
    }

    /* renamed from: H0 */
    public final char mo68507H0() throws IOException {
        int i;
        int i2;
        if (this.f37978h.request(1)) {
            byte readByte = this.f37979i.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return CharUtils.f44393CR;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f37895f) {
                    return (char) readByte;
                }
                StringBuilder h = C0072d.m201h("Invalid escape sequence: \\");
                h.append((char) readByte);
                mo68415f0(h.toString());
                throw null;
            } else if (this.f37978h.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte h2 = this.f37979i.mo72738h((long) i3);
                    char c2 = (char) (c << 4);
                    if (h2 < 48 || h2 > 57) {
                        if (h2 >= 97 && h2 <= 102) {
                            i2 = h2 - 97;
                        } else if (h2 < 65 || h2 > 70) {
                            StringBuilder h3 = C0072d.m201h("\\u");
                            h3.append(this.f37979i.mo72720M(4));
                            mo68415f0(h3.toString());
                            throw null;
                        } else {
                            i2 = h2 + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                        }
                        i = i2 + 10;
                    } else {
                        i = h2 - 48;
                    }
                    c = (char) (i + c2);
                }
                this.f37979i.skip(4);
                return c;
            } else {
                StringBuilder h4 = C0072d.m201h("Unterminated escape sequence at path ");
                h4.append(getPath());
                throw new EOFException(h4.toString());
            }
        } else {
            mo68415f0("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: I0 */
    public final void mo68508I0(ByteString byteString) throws IOException {
        while (true) {
            long z = this.f37978h.mo72773z(byteString);
            if (z == -1) {
                mo68415f0("Unterminated string");
                throw null;
            } else if (this.f37979i.mo72738h(z) == 92) {
                this.f37979i.skip(z + 1);
                mo68507H0();
            } else {
                this.f37979i.skip(z + 1);
                return;
            }
        }
    }

    /* renamed from: Q */
    public final int mo68406Q(JsonReader.C17362b bVar) throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo68501B0(this.f37983m, bVar);
        }
        int b0 = this.f37978h.mo72728b0(bVar.f37899b);
        if (b0 != -1) {
            this.f37980j = 0;
            this.f37893d[this.f37891b - 1] = bVar.f37898a[b0];
            return b0;
        }
        String str = this.f37893d[this.f37891b - 1];
        String k = mo68421k();
        int B0 = mo68501B0(k, bVar);
        if (B0 == -1) {
            this.f37980j = 15;
            this.f37983m = k;
            this.f37893d[this.f37891b - 1] = str;
        }
        return B0;
    }

    /* renamed from: R */
    public final int mo68407R(JsonReader.C17362b bVar) throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return mo68502C0(this.f37983m, bVar);
        }
        int b0 = this.f37978h.mo72728b0(bVar.f37899b);
        if (b0 != -1) {
            this.f37980j = 0;
            int[] iArr = this.f37894e;
            int i2 = this.f37891b - 1;
            iArr[i2] = iArr[i2] + 1;
            return b0;
        }
        String t = mo68425t();
        int C0 = mo68502C0(t, bVar);
        if (C0 == -1) {
            this.f37980j = 11;
            this.f37983m = t;
            int[] iArr2 = this.f37894e;
            int i3 = this.f37891b - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return C0;
    }

    /* renamed from: S */
    public final void mo68408S() throws IOException {
        if (!this.f37896g) {
            int i = this.f37980j;
            if (i == 0) {
                i = mo68500A0();
            }
            if (i == 14) {
                long z = this.f37978h.mo72773z(f37975q);
                C19893f fVar = this.f37979i;
                if (z == -1) {
                    z = fVar.f43876c;
                }
                fVar.skip(z);
            } else if (i == 13) {
                mo68508I0(f37974p);
            } else if (i == 12) {
                mo68508I0(f37973o);
            } else if (i != 15) {
                StringBuilder h = C0072d.m201h("Expected a name but was ");
                h.append(mo68426u());
                h.append(" at path ");
                h.append(getPath());
                throw new JsonDataException(h.toString());
            }
            this.f37980j = 0;
            this.f37893d[this.f37891b - 1] = "null";
            return;
        }
        JsonReader.Token u = mo68426u();
        mo68421k();
        throw new JsonDataException("Cannot skip unexpected " + u + " at " + getPath());
    }

    /* renamed from: a */
    public final void mo68409a() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 3) {
            mo68404G(1);
            this.f37894e[this.f37891b - 1] = 0;
            this.f37980j = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected BEGIN_ARRAY but was ");
        h.append(mo68426u());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: b */
    public final void mo68410b() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 1) {
            mo68404G(3);
            this.f37980j = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected BEGIN_OBJECT but was ");
        h.append(mo68426u());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: c0 */
    public final void mo68411c0() throws IOException {
        if (!this.f37896g) {
            int i = 0;
            do {
                int i2 = this.f37980j;
                if (i2 == 0) {
                    i2 = mo68500A0();
                }
                if (i2 == 3) {
                    mo68404G(1);
                } else if (i2 == 1) {
                    mo68404G(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f37891b--;
                        } else {
                            StringBuilder h = C0072d.m201h("Expected a value but was ");
                            h.append(mo68426u());
                            h.append(" at path ");
                            h.append(getPath());
                            throw new JsonDataException(h.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f37891b--;
                        } else {
                            StringBuilder h2 = C0072d.m201h("Expected a value but was ");
                            h2.append(mo68426u());
                            h2.append(" at path ");
                            h2.append(getPath());
                            throw new JsonDataException(h2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        long z = this.f37978h.mo72773z(f37975q);
                        C19893f fVar = this.f37979i;
                        if (z == -1) {
                            z = fVar.f43876c;
                        }
                        fVar.skip(z);
                    } else if (i2 == 9 || i2 == 13) {
                        mo68508I0(f37974p);
                    } else if (i2 == 8 || i2 == 12) {
                        mo68508I0(f37973o);
                    } else if (i2 == 17) {
                        this.f37979i.skip((long) this.f37982l);
                    } else if (i2 == 18) {
                        StringBuilder h3 = C0072d.m201h("Expected a value but was ");
                        h3.append(mo68426u());
                        h3.append(" at path ");
                        h3.append(getPath());
                        throw new JsonDataException(h3.toString());
                    }
                    this.f37980j = 0;
                }
                i++;
                this.f37980j = 0;
            } while (i != 0);
            int[] iArr = this.f37894e;
            int i3 = this.f37891b;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f37893d[i3 - 1] = "null";
            return;
        }
        StringBuilder h4 = C0072d.m201h("Cannot skip unexpected ");
        h4.append(mo68426u());
        h4.append(" at ");
        h4.append(getPath());
        throw new JsonDataException(h4.toString());
    }

    public final void close() throws IOException {
        this.f37980j = 0;
        this.f37892c[0] = 8;
        this.f37891b = 1;
        this.f37979i.mo72726a();
        this.f37978h.close();
    }

    /* renamed from: d */
    public final void mo68412d() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 4) {
            int i2 = this.f37891b - 1;
            this.f37891b = i2;
            int[] iArr = this.f37894e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f37980j = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected END_ARRAY but was ");
        h.append(mo68426u());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: e */
    public final void mo68413e() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 2) {
            int i2 = this.f37891b - 1;
            this.f37891b = i2;
            this.f37893d[i2] = null;
            int[] iArr = this.f37894e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f37980j = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected END_OBJECT but was ");
        h.append(mo68426u());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: f */
    public final boolean mo68414f() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: g */
    public final boolean mo68416g() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 5) {
            this.f37980j = 0;
            int[] iArr = this.f37894e;
            int i2 = this.f37891b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f37980j = 0;
            int[] iArr2 = this.f37894e;
            int i3 = this.f37891b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder h = C0072d.m201h("Expected a boolean but was ");
            h.append(mo68426u());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
    }

    /* renamed from: h */
    public final double mo68418h() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 16) {
            this.f37980j = 0;
            int[] iArr = this.f37894e;
            int i2 = this.f37891b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f37981k;
        }
        if (i == 17) {
            this.f37983m = this.f37979i.mo72720M((long) this.f37982l);
        } else if (i == 9) {
            this.f37983m = mo68505F0(f37974p);
        } else if (i == 8) {
            this.f37983m = mo68505F0(f37973o);
        } else if (i == 10) {
            this.f37983m = mo68506G0();
        } else if (i != 11) {
            StringBuilder h = C0072d.m201h("Expected a double but was ");
            h.append(mo68426u());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f37980j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f37983m);
            if (this.f37895f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f37983m = null;
                this.f37980j = 0;
                int[] iArr2 = this.f37894e;
                int i3 = this.f37891b - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            StringBuilder h2 = C0072d.m201h("Expected a double but was ");
            h2.append(this.f37983m);
            h2.append(" at path ");
            h2.append(getPath());
            throw new JsonDataException(h2.toString());
        }
    }

    /* renamed from: i */
    public final int mo68419i() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 16) {
            long j = this.f37981k;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f37980j = 0;
                int[] iArr = this.f37894e;
                int i3 = this.f37891b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder h = C0072d.m201h("Expected an int but was ");
            h.append(this.f37981k);
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        if (i == 17) {
            this.f37983m = this.f37979i.mo72720M((long) this.f37982l);
        } else if (i == 9 || i == 8) {
            String F0 = i == 9 ? mo68505F0(f37974p) : mo68505F0(f37973o);
            this.f37983m = F0;
            try {
                int parseInt = Integer.parseInt(F0);
                this.f37980j = 0;
                int[] iArr2 = this.f37894e;
                int i4 = this.f37891b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder h2 = C0072d.m201h("Expected an int but was ");
            h2.append(mo68426u());
            h2.append(" at path ");
            h2.append(getPath());
            throw new JsonDataException(h2.toString());
        }
        this.f37980j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f37983m);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f37983m = null;
                this.f37980j = 0;
                int[] iArr3 = this.f37894e;
                int i6 = this.f37891b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder h3 = C0072d.m201h("Expected an int but was ");
            h3.append(this.f37983m);
            h3.append(" at path ");
            h3.append(getPath());
            throw new JsonDataException(h3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder h4 = C0072d.m201h("Expected an int but was ");
            h4.append(this.f37983m);
            h4.append(" at path ");
            h4.append(getPath());
            throw new JsonDataException(h4.toString());
        }
    }

    /* renamed from: j */
    public final long mo68420j() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 16) {
            this.f37980j = 0;
            int[] iArr = this.f37894e;
            int i2 = this.f37891b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f37981k;
        }
        if (i == 17) {
            this.f37983m = this.f37979i.mo72720M((long) this.f37982l);
        } else if (i == 9 || i == 8) {
            String F0 = i == 9 ? mo68505F0(f37974p) : mo68505F0(f37973o);
            this.f37983m = F0;
            try {
                long parseLong = Long.parseLong(F0);
                this.f37980j = 0;
                int[] iArr2 = this.f37894e;
                int i3 = this.f37891b - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder h = C0072d.m201h("Expected a long but was ");
            h.append(mo68426u());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f37980j = 11;
        try {
            long longValueExact = new BigDecimal(this.f37983m).longValueExact();
            this.f37983m = null;
            this.f37980j = 0;
            int[] iArr3 = this.f37894e;
            int i4 = this.f37891b - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder h2 = C0072d.m201h("Expected a long but was ");
            h2.append(this.f37983m);
            h2.append(" at path ");
            h2.append(getPath());
            throw new JsonDataException(h2.toString());
        }
    }

    /* renamed from: k */
    public final String mo68421k() throws IOException {
        String str;
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 14) {
            str = mo68506G0();
        } else if (i == 13) {
            str = mo68505F0(f37974p);
        } else if (i == 12) {
            str = mo68505F0(f37973o);
        } else if (i == 15) {
            str = this.f37983m;
            this.f37983m = null;
        } else {
            StringBuilder h = C0072d.m201h("Expected a name but was ");
            h.append(mo68426u());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f37980j = 0;
        this.f37893d[this.f37891b - 1] = str;
        return str;
    }

    /* renamed from: n */
    public final void mo68423n() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 7) {
            this.f37980j = 0;
            int[] iArr = this.f37894e;
            int i2 = this.f37891b - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected null but was ");
        h.append(mo68426u());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p756lr.C19897i mo68424r() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f37980j
            if (r0 != 0) goto L_0x0008
            int r0 = r9.mo68500A0()
        L_0x0008:
            lr.f r1 = new lr.f
            r1.<init>()
            okio.ByteString r2 = com.squareup.moshi.C17410u.f38000n
            r3 = 3
            r4 = 9
            r5 = 0
            r6 = 1
            if (r0 != r3) goto L_0x001e
            java.lang.String r0 = "["
            r1.mo72715G0(r0)
            okio.ByteString r0 = com.squareup.moshi.C17410u.f37995i
            goto L_0x0027
        L_0x001e:
            if (r0 != r6) goto L_0x002a
            java.lang.String r0 = "{"
            r1.mo72715G0(r0)
            okio.ByteString r0 = com.squareup.moshi.C17410u.f37995i
        L_0x0027:
            r2 = r6
            goto L_0x00b4
        L_0x002a:
            if (r0 != r4) goto L_0x0035
            java.lang.String r0 = "\""
            r1.mo72715G0(r0)
            okio.ByteString r2 = com.squareup.moshi.C17410u.f37997k
            goto L_0x00b2
        L_0x0035:
            r3 = 8
            if (r0 != r3) goto L_0x0042
            java.lang.String r0 = "'"
            r1.mo72715G0(r0)
            okio.ByteString r2 = com.squareup.moshi.C17410u.f37996j
            goto L_0x00b2
        L_0x0042:
            r3 = 17
            if (r0 == r3) goto L_0x00ab
            r3 = 16
            if (r0 == r3) goto L_0x00ab
            r3 = 10
            if (r0 != r3) goto L_0x004f
            goto L_0x00ab
        L_0x004f:
            r3 = 5
            if (r0 != r3) goto L_0x0058
            java.lang.String r0 = "true"
            r1.mo72715G0(r0)
            goto L_0x00b2
        L_0x0058:
            r3 = 6
            if (r0 != r3) goto L_0x0061
            java.lang.String r0 = "false"
            r1.mo72715G0(r0)
            goto L_0x00b2
        L_0x0061:
            r3 = 7
            if (r0 != r3) goto L_0x006a
            java.lang.String r0 = "null"
            r1.mo72715G0(r0)
            goto L_0x00b2
        L_0x006a:
            r3 = 11
            if (r0 != r3) goto L_0x0088
            java.lang.String r0 = r9.mo68425t()
            com.squareup.moshi.s r3 = new com.squareup.moshi.s
            r3.<init>(r1)
            r3.mo68535x(r0)     // Catch:{ all -> 0x007e }
            r3.close()
            goto L_0x00b2
        L_0x007e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0087:
            throw r0
        L_0x0088:
            com.squareup.moshi.JsonDataException r0 = new com.squareup.moshi.JsonDataException
            java.lang.String r1 = "Expected a value but was "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            com.squareup.moshi.JsonReader$Token r2 = r9.mo68426u()
            r1.append(r2)
            java.lang.String r2 = " at path "
            r1.append(r2)
            java.lang.String r2 = r9.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00ab:
            java.lang.String r0 = r9.mo68425t()
            r1.mo72715G0(r0)
        L_0x00b2:
            r0 = r2
            r2 = r5
        L_0x00b4:
            int r3 = r9.f37980j
            if (r3 == 0) goto L_0x00c4
            int[] r3 = r9.f37894e
            int r7 = r9.f37891b
            int r7 = r7 - r6
            r8 = r3[r7]
            int r8 = r8 + r6
            r3[r7] = r8
            r9.f37980j = r5
        L_0x00c4:
            com.squareup.moshi.u r3 = new com.squareup.moshi.u
            lr.i r5 = r9.f37978h
            r3.<init>(r5, r1, r0, r2)
            r9.f37984n = r3
            r9.mo68404G(r4)
            com.squareup.moshi.u r0 = r9.f37984n
            lr.x r0 = p756lr.C19906r.m33998b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17405q.mo68424r():lr.i");
    }

    /* renamed from: t */
    public final String mo68425t() throws IOException {
        String str;
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        if (i == 10) {
            str = mo68506G0();
        } else if (i == 9) {
            str = mo68505F0(f37974p);
        } else if (i == 8) {
            str = mo68505F0(f37973o);
        } else if (i == 11) {
            str = this.f37983m;
            this.f37983m = null;
        } else if (i == 16) {
            str = Long.toString(this.f37981k);
        } else if (i == 17) {
            str = this.f37979i.mo72720M((long) this.f37982l);
        } else {
            StringBuilder h = C0072d.m201h("Expected a string but was ");
            h.append(mo68426u());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f37980j = 0;
        int[] iArr = this.f37894e;
        int i2 = this.f37891b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("JsonReader(");
        h.append(this.f37978h);
        h.append(")");
        return h.toString();
    }

    /* renamed from: u */
    public final JsonReader.Token mo68426u() throws IOException {
        int i = this.f37980j;
        if (i == 0) {
            i = mo68500A0();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: x */
    public final JsonReader mo68427x() {
        return new C17405q(this);
    }

    /* renamed from: x0 */
    public final void mo68511x0() throws IOException {
        if (!this.f37895f) {
            mo68415f0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public C17405q(C17405q qVar) {
        super(qVar);
        C19913x peek = qVar.f37978h.peek();
        this.f37978h = peek;
        this.f37979i = peek.f43916b;
        this.f37980j = qVar.f37980j;
        this.f37981k = qVar.f37981k;
        this.f37982l = qVar.f37982l;
        this.f37983m = qVar.f37983m;
        try {
            peek.mo72723U(qVar.f37979i.f43876c);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
