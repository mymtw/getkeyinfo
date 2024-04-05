package com.airbnb.lottie.parser.moshi;

import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import org.apache.commons.lang3.CharUtils;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19913x;

/* renamed from: com.airbnb.lottie.parser.moshi.a */
public final class C4863a extends JsonReader {

    /* renamed from: m */
    public static final ByteString f11051m = ByteString.encodeUtf8("'\\");

    /* renamed from: n */
    public static final ByteString f11052n = ByteString.encodeUtf8("\"\\");

    /* renamed from: o */
    public static final ByteString f11053o = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: g */
    public final C19897i f11054g;

    /* renamed from: h */
    public final C19893f f11055h;

    /* renamed from: i */
    public int f11056i = 0;

    /* renamed from: j */
    public long f11057j;

    /* renamed from: k */
    public int f11058k;

    /* renamed from: l */
    public String f11059l;

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8(ResourceConstants.EXT_CMT_END);
    }

    public C4863a(C19913x xVar) {
        this.f11054g = xVar;
        this.f11055h = xVar.f43916b;
        mo14636n(6);
    }

    /* renamed from: B */
    public final void mo14681B() throws IOException {
        mo14640x("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a7, code lost:
        if (mo14684Q(r9) != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a9, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01aa, code lost:
        if (r2 != r7) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ac, code lost:
        if (r3 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b2, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b4, code lost:
        if (r6 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ba, code lost:
        if (r4 != 0) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bc, code lost:
        if (r6 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01be, code lost:
        if (r6 == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c1, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c2, code lost:
        r0.f11057j = r4;
        r0.f11055h.skip((long) r1);
        r9 = 16;
        r0.f11056i = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01cf, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d1, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d2, code lost:
        if (r2 == r3) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d5, code lost:
        if (r2 == 4) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d8, code lost:
        if (r2 != 7) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01da, code lost:
        r0.f11058k = r1;
        r9 = 17;
        r0.f11056i = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0124  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14682G() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f11026c
            int r2 = r0.f11025b
            int r3 = r2 + -1
            r3 = r1[r3]
            r5 = 6
            r6 = 7
            r7 = 1
            r8 = 3
            r9 = 0
            r10 = 5
            r11 = 2
            r12 = 0
            r14 = 93
            r15 = 59
            r4 = 44
            r13 = 4
            if (r3 != r7) goto L_0x001f
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x007f
        L_0x001f:
            if (r3 != r11) goto L_0x003d
            int r1 = r0.mo14686S(r7)
            lr.f r2 = r0.f11055h
            r2.readByte()
            if (r1 == r4) goto L_0x007f
            if (r1 == r15) goto L_0x0039
            if (r1 != r14) goto L_0x0033
            r0.f11056i = r13
            return r13
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.mo14640x(r1)
            throw r12
        L_0x0039:
            r16.mo14681B()
            throw r12
        L_0x003d:
            if (r3 == r8) goto L_0x026c
            if (r3 != r10) goto L_0x0043
            goto L_0x026c
        L_0x0043:
            if (r3 != r13) goto L_0x0063
            int r2 = r2 - r7
            r1[r2] = r10
            int r1 = r0.mo14686S(r7)
            lr.f r2 = r0.f11055h
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x007f
            r2 = 61
            if (r1 == r2) goto L_0x005f
            java.lang.String r1 = "Expected ':'"
            r0.mo14640x(r1)
            throw r12
        L_0x005f:
            r16.mo14681B()
            throw r12
        L_0x0063:
            if (r3 != r5) goto L_0x0069
            int r2 = r2 - r7
            r1[r2] = r6
            goto L_0x007f
        L_0x0069:
            if (r3 != r6) goto L_0x007b
            int r1 = r0.mo14686S(r9)
            r2 = -1
            if (r1 != r2) goto L_0x0077
            r1 = 18
            r0.f11056i = r1
            return r1
        L_0x0077:
            r16.mo14681B()
            throw r12
        L_0x007b:
            r1 = 8
            if (r3 == r1) goto L_0x0264
        L_0x007f:
            int r1 = r0.mo14686S(r7)
            r2 = 34
            if (r1 == r2) goto L_0x025a
            r2 = 39
            if (r1 == r2) goto L_0x0255
            if (r1 == r4) goto L_0x0243
            if (r1 == r15) goto L_0x0243
            r2 = 91
            if (r1 == r2) goto L_0x023b
            if (r1 == r14) goto L_0x0230
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0228
            lr.f r1 = r0.f11055h
            r2 = 0
            byte r1 = r1.mo72738h(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00cb
            r4 = 84
            if (r1 != r4) goto L_0x00aa
            goto L_0x00cb
        L_0x00aa:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00c5
            r4 = 70
            if (r1 != r4) goto L_0x00b3
            goto L_0x00c5
        L_0x00b3:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00bf
            r4 = 78
            if (r1 != r4) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            r14 = r9
            goto L_0x0121
        L_0x00bf:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r14 = r6
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r14 = r5
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r14 = r10
        L_0x00d0:
            int r15 = r1.length()
            r9 = r7
        L_0x00d5:
            if (r9 >= r15) goto L_0x00ff
            lr.i r12 = r0.f11054g
            int r6 = r9 + 1
            long r2 = (long) r6
            boolean r2 = r12.request(r2)
            if (r2 != 0) goto L_0x00e3
            goto L_0x0117
        L_0x00e3:
            lr.f r2 = r0.f11055h
            r3 = r6
            long r5 = (long) r9
            byte r2 = r2.mo72738h(r5)
            char r5 = r1.charAt(r9)
            if (r2 == r5) goto L_0x00f8
            char r5 = r4.charAt(r9)
            if (r2 == r5) goto L_0x00f8
            goto L_0x0117
        L_0x00f8:
            r9 = r3
            r2 = 0
            r5 = 6
            r6 = 7
            r12 = 0
            goto L_0x00d5
        L_0x00ff:
            lr.i r1 = r0.f11054g
            int r2 = r15 + 1
            long r2 = (long) r2
            boolean r1 = r1.request(r2)
            if (r1 == 0) goto L_0x0119
            lr.f r1 = r0.f11055h
            long r2 = (long) r15
            byte r1 = r1.mo72738h(r2)
            boolean r1 = r0.mo14684Q(r1)
            if (r1 == 0) goto L_0x0119
        L_0x0117:
            r14 = 0
            goto L_0x0121
        L_0x0119:
            lr.f r1 = r0.f11055h
            long r2 = (long) r15
            r1.skip(r2)
            r0.f11056i = r14
        L_0x0121:
            if (r14 == 0) goto L_0x0124
            return r14
        L_0x0124:
            r3 = r7
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
        L_0x012a:
            lr.i r9 = r0.f11054g
            int r14 = r1 + 1
            long r12 = (long) r14
            boolean r9 = r9.request(r12)
            if (r9 != 0) goto L_0x0138
            r7 = r11
            goto L_0x01aa
        L_0x0138:
            lr.f r9 = r0.f11055h
            long r12 = (long) r1
            byte r9 = r9.mo72738h(r12)
            r12 = 43
            if (r9 == r12) goto L_0x01fe
            r12 = 69
            if (r9 == r12) goto L_0x01f4
            r12 = 101(0x65, float:1.42E-43)
            if (r9 == r12) goto L_0x01f4
            r12 = 45
            if (r9 == r12) goto L_0x01e8
            r12 = 46
            if (r9 == r12) goto L_0x01e1
            r12 = 48
            if (r9 < r12) goto L_0x01a3
            r12 = 57
            if (r9 <= r12) goto L_0x015c
            goto L_0x01a3
        L_0x015c:
            if (r2 == r7) goto L_0x0199
            if (r2 != 0) goto L_0x0161
            goto L_0x0199
        L_0x0161:
            if (r2 != r11) goto L_0x018a
            r12 = 0
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x016b
            goto L_0x020a
        L_0x016b:
            r12 = 10
            long r12 = r12 * r4
            int r9 = r9 + -48
            long r10 = (long) r9
            long r12 = r12 - r10
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0184
            if (r1 != 0) goto L_0x0182
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r1 = 0
            goto L_0x0185
        L_0x0184:
            r1 = r7
        L_0x0185:
            r1 = r1 & r3
            r3 = r1
            r4 = r12
            r15 = 6
            goto L_0x01a0
        L_0x018a:
            if (r2 != r8) goto L_0x0191
            r2 = 4
            r9 = 7
            r15 = 6
            goto L_0x0204
        L_0x0191:
            r1 = 5
            r15 = 6
            if (r2 == r1) goto L_0x0197
            if (r2 != r15) goto L_0x01a0
        L_0x0197:
            r2 = 7
            goto L_0x01a0
        L_0x0199:
            r15 = 6
            int r9 = r9 + -48
            int r1 = -r9
            long r1 = (long) r1
            r4 = r1
            r2 = 2
        L_0x01a0:
            r9 = 7
            goto L_0x0204
        L_0x01a3:
            boolean r7 = r0.mo14684Q(r9)
            if (r7 != 0) goto L_0x020a
            r7 = 2
        L_0x01aa:
            if (r2 != r7) goto L_0x01d1
            if (r3 == 0) goto L_0x01cf
            r7 = -9223372036854775808
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            if (r6 == 0) goto L_0x01cf
        L_0x01b6:
            r7 = 0
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x01be
            if (r6 != 0) goto L_0x01cf
        L_0x01be:
            if (r6 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            long r4 = -r4
        L_0x01c2:
            r0.f11057j = r4
            lr.f r2 = r0.f11055h
            long r3 = (long) r1
            r2.skip(r3)
            r9 = 16
            r0.f11056i = r9
            goto L_0x020b
        L_0x01cf:
            r3 = 2
            goto L_0x01d2
        L_0x01d1:
            r3 = r7
        L_0x01d2:
            if (r2 == r3) goto L_0x01da
            r3 = 4
            if (r2 == r3) goto L_0x01da
            r9 = 7
            if (r2 != r9) goto L_0x020a
        L_0x01da:
            r0.f11058k = r1
            r9 = 17
            r0.f11056i = r9
            goto L_0x020b
        L_0x01e1:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 != r1) goto L_0x020a
            r1 = r8
            goto L_0x0203
        L_0x01e8:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 != 0) goto L_0x01f0
            r2 = r7
            r6 = r2
            goto L_0x0204
        L_0x01f0:
            r10 = 5
            if (r2 != r10) goto L_0x020a
            goto L_0x0202
        L_0x01f4:
            r1 = r11
            r9 = 7
            r15 = 6
            if (r2 == r1) goto L_0x01fc
            r1 = 4
            if (r2 != r1) goto L_0x020a
        L_0x01fc:
            r2 = r10
            goto L_0x0204
        L_0x01fe:
            r9 = 7
            r15 = 6
            if (r2 != r10) goto L_0x020a
        L_0x0202:
            r1 = r15
        L_0x0203:
            r2 = r1
        L_0x0204:
            r1 = r14
            r10 = 5
            r11 = 2
            r13 = 4
            goto L_0x012a
        L_0x020a:
            r9 = 0
        L_0x020b:
            if (r9 == 0) goto L_0x020e
            return r9
        L_0x020e:
            lr.f r1 = r0.f11055h
            r2 = 0
            byte r1 = r1.mo72738h(r2)
            boolean r1 = r0.mo14684Q(r1)
            if (r1 != 0) goto L_0x0223
            java.lang.String r1 = "Expected value"
            r0.mo14640x(r1)
            r1 = 0
            throw r1
        L_0x0223:
            r1 = 0
            r16.mo14681B()
            throw r1
        L_0x0228:
            lr.f r1 = r0.f11055h
            r1.readByte()
            r0.f11056i = r7
            return r7
        L_0x0230:
            if (r3 != r7) goto L_0x0243
            lr.f r1 = r0.f11055h
            r1.readByte()
            r1 = 4
            r0.f11056i = r1
            return r1
        L_0x023b:
            lr.f r1 = r0.f11055h
            r1.readByte()
            r0.f11056i = r8
            return r8
        L_0x0243:
            if (r3 == r7) goto L_0x0250
            r1 = 2
            if (r3 != r1) goto L_0x0249
            goto L_0x0250
        L_0x0249:
            java.lang.String r1 = "Unexpected value"
            r0.mo14640x(r1)
            r1 = 0
            throw r1
        L_0x0250:
            r1 = 0
            r16.mo14681B()
            throw r1
        L_0x0255:
            r1 = r12
            r16.mo14681B()
            throw r1
        L_0x025a:
            lr.f r1 = r0.f11055h
            r1.readByte()
            r1 = 9
            r0.f11056i = r1
            return r1
        L_0x0264:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x026c:
            int r2 = r2 - r7
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x0294
            int r2 = r0.mo14686S(r7)
            lr.f r5 = r0.f11055h
            r5.readByte()
            if (r2 == r4) goto L_0x0294
            if (r2 == r15) goto L_0x028f
            if (r2 != r1) goto L_0x0288
            r1 = 2
            r0.f11056i = r1
            return r1
        L_0x0288:
            java.lang.String r1 = "Unterminated object"
            r0.mo14640x(r1)
            r1 = 0
            throw r1
        L_0x028f:
            r1 = 0
            r16.mo14681B()
            throw r1
        L_0x0294:
            int r2 = r0.mo14686S(r7)
            r4 = 34
            if (r2 == r4) goto L_0x02c4
            r4 = 39
            if (r2 == r4) goto L_0x02ba
            if (r2 != r1) goto L_0x02b5
            r1 = 5
            if (r3 == r1) goto L_0x02ae
            lr.f r1 = r0.f11055h
            r1.readByte()
            r1 = 2
            r0.f11056i = r1
            return r1
        L_0x02ae:
            java.lang.String r1 = "Expected name"
            r0.mo14640x(r1)
            r1 = 0
            throw r1
        L_0x02b5:
            r1 = 0
            r16.mo14681B()
            throw r1
        L_0x02ba:
            r1 = 0
            lr.f r2 = r0.f11055h
            r2.readByte()
            r16.mo14681B()
            throw r1
        L_0x02c4:
            lr.f r1 = r0.f11055h
            r1.readByte()
            r1 = 13
            r0.f11056i = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C4863a.mo14682G():int");
    }

    /* renamed from: M */
    public final int mo14683M(String str, JsonReader.C4854a aVar) {
        int length = aVar.f11029a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f11029a[i])) {
                this.f11056i = 0;
                this.f11027d[this.f11025b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public final boolean mo14684Q(int i) throws IOException {
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
        mo14681B();
        throw null;
    }

    /* renamed from: R */
    public final String mo14685R() throws IOException {
        String str;
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 14) {
            str = mo14689f0();
        } else if (i == 13) {
            str = mo14687c0(f11052n);
        } else if (i == 12) {
            str = mo14687c0(f11051m);
        } else if (i == 15) {
            str = this.f11059l;
        } else {
            StringBuilder h = C0072d.m201h("Expected a name but was ");
            h.append(mo14635k());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f11056i = 0;
        this.f11027d[this.f11025b - 1] = str;
        return str;
    }

    /* renamed from: S */
    public final int mo14686S(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f11054g.request((long) i2)) {
                byte h = this.f11055h.mo72738h((long) i);
                if (h == 10 || h == 32 || h == 13 || h == 9) {
                    i = i2;
                } else {
                    this.f11055h.skip((long) (i2 - 1));
                    if (h == 47) {
                        if (!this.f11054g.request(2)) {
                            return h;
                        }
                        mo14681B();
                        throw null;
                    } else if (h != 35) {
                        return h;
                    } else {
                        mo14681B();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: a */
    public final void mo14625a() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 3) {
            mo14636n(1);
            this.f11028e[this.f11025b - 1] = 0;
            this.f11056i = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected BEGIN_ARRAY but was ");
        h.append(mo14635k());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: b */
    public final void mo14626b() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 1) {
            mo14636n(3);
            this.f11056i = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected BEGIN_OBJECT but was ");
        h.append(mo14635k());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: c0 */
    public final String mo14687c0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long z = this.f11054g.mo72773z(byteString);
            if (z == -1) {
                mo14640x("Unterminated string");
                throw null;
            } else if (this.f11055h.mo72738h(z) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f11055h.mo72720M(z));
                this.f11055h.readByte();
                sb.append(mo14690m0());
            } else if (sb == null) {
                String M = this.f11055h.mo72720M(z);
                this.f11055h.readByte();
                return M;
            } else {
                sb.append(this.f11055h.mo72720M(z));
                this.f11055h.readByte();
                return sb.toString();
            }
        }
    }

    public final void close() throws IOException {
        this.f11056i = 0;
        this.f11026c[0] = 8;
        this.f11025b = 1;
        this.f11055h.mo72726a();
        this.f11054g.close();
    }

    /* renamed from: d */
    public final void mo14627d() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 4) {
            int i2 = this.f11025b - 1;
            this.f11025b = i2;
            int[] iArr = this.f11028e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11056i = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected END_ARRAY but was ");
        h.append(mo14635k());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: e */
    public final void mo14628e() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 2) {
            int i2 = this.f11025b - 1;
            this.f11025b = i2;
            this.f11027d[i2] = null;
            int[] iArr = this.f11028e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11056i = 0;
            return;
        }
        StringBuilder h = C0072d.m201h("Expected END_OBJECT but was ");
        h.append(mo14635k());
        h.append(" at path ");
        h.append(getPath());
        throw new JsonDataException(h.toString());
    }

    /* renamed from: f */
    public final boolean mo14629f() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: f0 */
    public final String mo14689f0() throws IOException {
        long z = this.f11054g.mo72773z(f11053o);
        return z != -1 ? this.f11055h.mo72720M(z) : this.f11055h.mo72708B();
    }

    /* renamed from: g */
    public final boolean mo14630g() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 5) {
            this.f11056i = 0;
            int[] iArr = this.f11028e;
            int i2 = this.f11025b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f11056i = 0;
            int[] iArr2 = this.f11028e;
            int i3 = this.f11025b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder h = C0072d.m201h("Expected a boolean but was ");
            h.append(mo14635k());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
    }

    /* renamed from: h */
    public final double mo14632h() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 16) {
            this.f11056i = 0;
            int[] iArr = this.f11028e;
            int i2 = this.f11025b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f11057j;
        }
        if (i == 17) {
            this.f11059l = this.f11055h.mo72720M((long) this.f11058k);
        } else if (i == 9) {
            this.f11059l = mo14687c0(f11052n);
        } else if (i == 8) {
            this.f11059l = mo14687c0(f11051m);
        } else if (i == 10) {
            this.f11059l = mo14689f0();
        } else if (i != 11) {
            StringBuilder h = C0072d.m201h("Expected a double but was ");
            h.append(mo14635k());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f11056i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f11059l);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f11059l = null;
            this.f11056i = 0;
            int[] iArr2 = this.f11028e;
            int i3 = this.f11025b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder h2 = C0072d.m201h("Expected a double but was ");
            h2.append(this.f11059l);
            h2.append(" at path ");
            h2.append(getPath());
            throw new JsonDataException(h2.toString());
        }
    }

    /* renamed from: i */
    public final int mo14633i() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 16) {
            long j = this.f11057j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f11056i = 0;
                int[] iArr = this.f11028e;
                int i3 = this.f11025b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder h = C0072d.m201h("Expected an int but was ");
            h.append(this.f11057j);
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        if (i == 17) {
            this.f11059l = this.f11055h.mo72720M((long) this.f11058k);
        } else if (i == 9 || i == 8) {
            String c0 = i == 9 ? mo14687c0(f11052n) : mo14687c0(f11051m);
            this.f11059l = c0;
            try {
                int parseInt = Integer.parseInt(c0);
                this.f11056i = 0;
                int[] iArr2 = this.f11028e;
                int i4 = this.f11025b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder h2 = C0072d.m201h("Expected an int but was ");
            h2.append(mo14635k());
            h2.append(" at path ");
            h2.append(getPath());
            throw new JsonDataException(h2.toString());
        }
        this.f11056i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f11059l);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f11059l = null;
                this.f11056i = 0;
                int[] iArr3 = this.f11028e;
                int i6 = this.f11025b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder h3 = C0072d.m201h("Expected an int but was ");
            h3.append(this.f11059l);
            h3.append(" at path ");
            h3.append(getPath());
            throw new JsonDataException(h3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder h4 = C0072d.m201h("Expected an int but was ");
            h4.append(this.f11059l);
            h4.append(" at path ");
            h4.append(getPath());
            throw new JsonDataException(h4.toString());
        }
    }

    /* renamed from: j */
    public final String mo14634j() throws IOException {
        String str;
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 10) {
            str = mo14689f0();
        } else if (i == 9) {
            str = mo14687c0(f11052n);
        } else if (i == 8) {
            str = mo14687c0(f11051m);
        } else if (i == 11) {
            str = this.f11059l;
            this.f11059l = null;
        } else if (i == 16) {
            str = Long.toString(this.f11057j);
        } else if (i == 17) {
            str = this.f11055h.mo72720M((long) this.f11058k);
        } else {
            StringBuilder h = C0072d.m201h("Expected a string but was ");
            h.append(mo14635k());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f11056i = 0;
        int[] iArr = this.f11028e;
        int i2 = this.f11025b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: k */
    public final JsonReader.Token mo14635k() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
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

    /* renamed from: m0 */
    public final char mo14690m0() throws IOException {
        int i;
        int i2;
        if (this.f11054g.request(1)) {
            byte readByte = this.f11055h.readByte();
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
                StringBuilder h = C0072d.m201h("Invalid escape sequence: \\");
                h.append((char) readByte);
                mo14640x(h.toString());
                throw null;
            } else if (this.f11054g.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte h2 = this.f11055h.mo72738h((long) i3);
                    char c2 = (char) (c << 4);
                    if (h2 < 48 || h2 > 57) {
                        if (h2 >= 97 && h2 <= 102) {
                            i2 = h2 - 97;
                        } else if (h2 < 65 || h2 > 70) {
                            StringBuilder h3 = C0072d.m201h("\\u");
                            h3.append(this.f11055h.mo72720M(4));
                            mo14640x(h3.toString());
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
                this.f11055h.skip(4);
                return c;
            } else {
                StringBuilder h4 = C0072d.m201h("Unterminated escape sequence at path ");
                h4.append(getPath());
                throw new EOFException(h4.toString());
            }
        } else {
            mo14640x("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: r */
    public final int mo14637r(JsonReader.C4854a aVar) throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo14683M(this.f11059l, aVar);
        }
        int b0 = this.f11054g.mo72728b0(aVar.f11030b);
        if (b0 != -1) {
            this.f11056i = 0;
            this.f11027d[this.f11025b - 1] = aVar.f11029a[b0];
            return b0;
        }
        String str = this.f11027d[this.f11025b - 1];
        String R = mo14685R();
        int M = mo14683M(R, aVar);
        if (M == -1) {
            this.f11056i = 15;
            this.f11059l = R;
            this.f11027d[this.f11025b - 1] = str;
        }
        return M;
    }

    /* renamed from: t */
    public final void mo14638t() throws IOException {
        int i = this.f11056i;
        if (i == 0) {
            i = mo14682G();
        }
        if (i == 14) {
            long z = this.f11054g.mo72773z(f11053o);
            C19893f fVar = this.f11055h;
            if (z == -1) {
                z = fVar.f43876c;
            }
            fVar.skip(z);
        } else if (i == 13) {
            mo14692x0(f11052n);
        } else if (i == 12) {
            mo14692x0(f11051m);
        } else if (i != 15) {
            StringBuilder h = C0072d.m201h("Expected a name but was ");
            h.append(mo14635k());
            h.append(" at path ");
            h.append(getPath());
            throw new JsonDataException(h.toString());
        }
        this.f11056i = 0;
        this.f11027d[this.f11025b - 1] = "null";
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("JsonReader(");
        h.append(this.f11054g);
        h.append(")");
        return h.toString();
    }

    /* renamed from: u */
    public final void mo14639u() throws IOException {
        int i = 0;
        do {
            int i2 = this.f11056i;
            if (i2 == 0) {
                i2 = mo14682G();
            }
            if (i2 == 3) {
                mo14636n(1);
            } else if (i2 == 1) {
                mo14636n(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f11025b--;
                    } else {
                        StringBuilder h = C0072d.m201h("Expected a value but was ");
                        h.append(mo14635k());
                        h.append(" at path ");
                        h.append(getPath());
                        throw new JsonDataException(h.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f11025b--;
                    } else {
                        StringBuilder h2 = C0072d.m201h("Expected a value but was ");
                        h2.append(mo14635k());
                        h2.append(" at path ");
                        h2.append(getPath());
                        throw new JsonDataException(h2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    long z = this.f11054g.mo72773z(f11053o);
                    C19893f fVar = this.f11055h;
                    if (z == -1) {
                        z = fVar.f43876c;
                    }
                    fVar.skip(z);
                } else if (i2 == 9 || i2 == 13) {
                    mo14692x0(f11052n);
                } else if (i2 == 8 || i2 == 12) {
                    mo14692x0(f11051m);
                } else if (i2 == 17) {
                    this.f11055h.skip((long) this.f11058k);
                } else if (i2 == 18) {
                    StringBuilder h3 = C0072d.m201h("Expected a value but was ");
                    h3.append(mo14635k());
                    h3.append(" at path ");
                    h3.append(getPath());
                    throw new JsonDataException(h3.toString());
                }
                this.f11056i = 0;
            }
            i++;
            this.f11056i = 0;
        } while (i != 0);
        int[] iArr = this.f11028e;
        int i3 = this.f11025b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f11027d[i3 - 1] = "null";
    }

    /* renamed from: x0 */
    public final void mo14692x0(ByteString byteString) throws IOException {
        while (true) {
            long z = this.f11054g.mo72773z(byteString);
            if (z == -1) {
                mo14640x("Unterminated string");
                throw null;
            } else if (this.f11055h.mo72738h(z) == 92) {
                this.f11055h.skip(z + 1);
                mo14690m0();
            } else {
                this.f11055h.skip(z + 1);
                return;
            }
        }
    }
}
