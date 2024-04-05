package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.repackaged.dslplatform.json.C5847e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Formatter;

public final class JsonReader<TContext> {

    /* renamed from: A */
    public static final EOFException f12469A = new EmptyEOFException();

    /* renamed from: y */
    public static final boolean[] f12470y;

    /* renamed from: z */
    public static final Charset f12471z = Charset.forName("UTF-8");

    /* renamed from: a */
    public int f12472a;

    /* renamed from: b */
    public int f12473b;

    /* renamed from: c */
    public long f12474c;

    /* renamed from: d */
    public byte f12475d;

    /* renamed from: e */
    public int f12476e;

    /* renamed from: f */
    public final char[] f12477f;

    /* renamed from: g */
    public final TContext f12478g;

    /* renamed from: h */
    public byte[] f12479h;

    /* renamed from: i */
    public char[] f12480i;

    /* renamed from: j */
    public InputStream f12481j;

    /* renamed from: k */
    public int f12482k;

    /* renamed from: l */
    public int f12483l;

    /* renamed from: m */
    public final C5897l f12484m;

    /* renamed from: n */
    public final C5897l f12485n;

    /* renamed from: o */
    public final byte[] f12486o;

    /* renamed from: p */
    public final int f12487p;

    /* renamed from: q */
    public final ErrorInfo f12488q;

    /* renamed from: r */
    public final DoublePrecision f12489r;

    /* renamed from: s */
    public final int f12490s;

    /* renamed from: t */
    public final UnknownNumberParsing f12491t;

    /* renamed from: u */
    public final int f12492u;

    /* renamed from: v */
    public final int f12493v;

    /* renamed from: w */
    public final StringBuilder f12494w;

    /* renamed from: x */
    public final Formatter f12495x;

    public enum DoublePrecision {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);
        
        public final int level;

        private DoublePrecision(int i) {
            this.level = i;
        }
    }

    public static class EmptyEOFException extends EOFException {
        private EmptyEOFException() {
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public enum ErrorInfo {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    public enum UnknownNumberParsing {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.JsonReader$b */
    public interface C5833b<T extends C5857g> {
        /* renamed from: a */
        C5857g mo16649a() throws IOException;
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.JsonReader$c */
    public interface C5834c<T> {
        /* renamed from: a */
        T mo16650a(JsonReader jsonReader) throws IOException;
    }

    static {
        boolean[] zArr = new boolean[256];
        f12470y = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
    }

    public JsonReader() {
        throw null;
    }

    public JsonReader(byte[] bArr, char[] cArr, C5847e.C5855h hVar, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i, int i2) {
        this.f12473b = 0;
        this.f12474c = 0;
        this.f12475d = 32;
        StringBuilder sb = new StringBuilder(0);
        this.f12494w = sb;
        this.f12495x = new Formatter(sb);
        this.f12477f = cArr;
        this.f12479h = bArr;
        this.f12476e = RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
        int length = bArr.length - 38;
        this.f12483l = length;
        this.f12478g = null;
        this.f12480i = cArr;
        this.f12484m = hVar;
        this.f12485n = null;
        this.f12488q = errorInfo;
        this.f12489r = doublePrecision;
        this.f12491t = unknownNumberParsing;
        this.f12492u = i;
        this.f12493v = i2;
        this.f12490s = doublePrecision.level + 15;
        this.f12486o = bArr;
        this.f12487p = length;
        if (4096 > bArr.length) {
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        } else if (4096 < bArr.length) {
            bArr[4096] = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo16624a(int i, int i2) {
        byte[] bArr = this.f12479h;
        while (i < i2) {
            if (!f12470y[bArr[i] + 128]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo16625b() throws IOException {
        if (this.f12475d == 93) {
            return;
        }
        if (this.f12473b >= this.f12476e) {
            throw mo16631h("Unexpected end of JSON in collection", f12469A, 0);
        }
        throw mo16629f("Expecting ']' as array end");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        r2 = false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte mo16626c() throws java.io.IOException {
        /*
            r9 = this;
            r9.mo16638o()
            boolean[] r0 = f12470y
            byte r1 = r9.f12475d
            int r1 = r1 + 128
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0096
        L_0x000d:
            byte r0 = r9.f12475d
            r1 = -96
            r2 = 1
            if (r0 == r1) goto L_0x008f
            r1 = 32
            if (r0 == r1) goto L_0x008f
            r3 = -128(0xffffffffffffff80, float:NaN)
            r4 = 0
            switch(r0) {
                case -31: goto L_0x0073;
                case -30: goto L_0x003c;
                case -29: goto L_0x0023;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r0) {
                case 9: goto L_0x008f;
                case 10: goto L_0x008f;
                case 11: goto L_0x008f;
                case 12: goto L_0x008f;
                case 13: goto L_0x008f;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008e
        L_0x0023:
            int r0 = r9.f12473b
            int r5 = r0 + 1
            int r6 = r9.f12476e
            if (r5 >= r6) goto L_0x008e
            byte[] r6 = r9.f12479h
            byte r7 = r6[r0]
            if (r7 != r3) goto L_0x008e
            byte r5 = r6[r5]
            if (r5 != r3) goto L_0x008e
            int r0 = r0 + 2
            r9.f12473b = r0
            r9.f12475d = r1
            goto L_0x008f
        L_0x003c:
            int r0 = r9.f12473b
            int r5 = r0 + 1
            int r6 = r9.f12476e
            if (r5 >= r6) goto L_0x008e
            byte[] r6 = r9.f12479h
            byte r7 = r6[r0]
            byte r5 = r6[r5]
            r6 = -127(0xffffffffffffff81, float:NaN)
            if (r7 != r6) goto L_0x0059
            r6 = -97
            if (r5 != r6) goto L_0x0059
            int r0 = r0 + 2
            r9.f12473b = r0
            r9.f12475d = r1
            goto L_0x008f
        L_0x0059:
            if (r7 == r3) goto L_0x005c
            goto L_0x008e
        L_0x005c:
            r3 = -88
            if (r5 == r3) goto L_0x006c
            r3 = -87
            if (r5 == r3) goto L_0x006c
            r3 = -81
            if (r5 == r3) goto L_0x006c
            switch(r5) {
                case -128: goto L_0x006c;
                case -127: goto L_0x006c;
                case -126: goto L_0x006c;
                case -125: goto L_0x006c;
                case -124: goto L_0x006c;
                case -123: goto L_0x006c;
                case -122: goto L_0x006c;
                case -121: goto L_0x006c;
                case -120: goto L_0x006c;
                case -119: goto L_0x006c;
                case -118: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x008e
        L_0x006c:
            int r0 = r0 + 2
            r9.f12473b = r0
            r9.f12475d = r1
            goto L_0x008f
        L_0x0073:
            int r0 = r9.f12473b
            int r5 = r0 + 1
            int r6 = r9.f12476e
            if (r5 >= r6) goto L_0x008e
            byte[] r6 = r9.f12479h
            byte r7 = r6[r0]
            r8 = -102(0xffffffffffffff9a, float:NaN)
            if (r7 != r8) goto L_0x008e
            byte r5 = r6[r5]
            if (r5 != r3) goto L_0x008e
            int r0 = r0 + 2
            r9.f12473b = r0
            r9.f12475d = r1
            goto L_0x008f
        L_0x008e:
            r2 = r4
        L_0x008f:
            if (r2 == 0) goto L_0x0096
            r9.mo16638o()
            goto L_0x000d
        L_0x0096:
            byte r0 = r9.f12475d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.JsonReader.mo16626c():byte");
    }

    /* renamed from: d */
    public final int mo16627d(byte b) throws ParsingException {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        if (b >= 65 && b <= 70) {
            return b - 55;
        }
        if (b >= 97 && b <= 102) {
            return b - 87;
        }
        throw mo16633j(Byte.valueOf(b), "Could not parse unicode escape, expected a hexadecimal digit");
    }

    /* renamed from: e */
    public final boolean mo16628e() throws IOException {
        if (this.f12481j == null) {
            return this.f12476e == this.f12473b;
        }
        if (this.f12476e != this.f12473b) {
            return false;
        }
        return mo16637n() == 0;
    }

    /* renamed from: f */
    public final ParsingException mo16629f(String str) {
        if (this.f12488q == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.f12494w.setLength(0);
        this.f12494w.append(str);
        this.f12494w.append(". Found ");
        this.f12494w.append((char) this.f12475d);
        if (this.f12488q == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.f12494w.toString(), false);
        }
        this.f12494w.append(" ");
        mo16635l(this.f12494w, 0);
        return ParsingException.create(this.f12494w.toString(), mo16647w());
    }

    /* renamed from: g */
    public final ParsingException mo16630g(int i, String str) {
        ErrorInfo errorInfo = this.f12488q;
        if (errorInfo == ErrorInfo.MINIMAL || errorInfo == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(str, false);
        }
        this.f12494w.setLength(0);
        this.f12494w.append(str);
        this.f12494w.append(" ");
        mo16635l(this.f12494w, i);
        return ParsingException.create(this.f12494w.toString(), mo16647w());
    }

    /* renamed from: h */
    public final ParsingException mo16631h(String str, Exception exc, int i) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        } else if (this.f12488q == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, exc, false);
        } else {
            this.f12494w.setLength(0);
            String message = exc.getMessage();
            if (message != null && message.length() > 0) {
                this.f12494w.append(message);
                if (!message.endsWith(".")) {
                    this.f12494w.append(".");
                }
                this.f12494w.append(" ");
            }
            this.f12494w.append(str);
            if (this.f12488q == ErrorInfo.DESCRIPTION_ONLY) {
                return ParsingException.create(this.f12494w.toString(), exc, false);
            }
            this.f12494w.append(" ");
            mo16635l(this.f12494w, i);
            return ParsingException.create(this.f12494w.toString(), mo16647w());
        }
    }

    /* renamed from: i */
    public final ParsingException mo16632i(int i, Object obj, String str, String str2, String str3) {
        if (this.f12488q == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.f12494w.setLength(0);
        this.f12494w.append("");
        this.f12494w.append(str2);
        if (obj != null) {
            this.f12494w.append(": '");
            this.f12494w.append(obj.toString());
            this.f12494w.append("'");
        }
        this.f12494w.append(str3);
        if (this.f12488q == ErrorInfo.DESCRIPTION_ONLY) {
            return ParsingException.create(this.f12494w.toString(), false);
        }
        this.f12494w.append(" ");
        mo16635l(this.f12494w, i);
        return ParsingException.create(this.f12494w.toString(), mo16647w());
    }

    /* renamed from: j */
    public final ParsingException mo16633j(Number number, String str) {
        return mo16632i(0, number, str, str, "");
    }

    /* renamed from: k */
    public final int mo16634k() throws IOException {
        byte b;
        int i;
        int i2 = this.f12473b;
        if (this.f12475d == 34) {
            int i3 = this.f12476e;
            if (i2 != i3) {
                char[] cArr = this.f12480i;
                int i4 = i3 - i2;
                if (cArr.length < i4) {
                    i4 = cArr.length;
                }
                int i5 = i2;
                int i6 = 0;
                while (true) {
                    if (i6 >= i4) {
                        break;
                    }
                    int i7 = i5 + 1;
                    byte b2 = this.f12479h[i5];
                    if (b2 == 34) {
                        this.f12473b = i7;
                        return i6;
                    } else if ((b2 ^ 92) < 1) {
                        i5 = i7;
                        break;
                    } else {
                        cArr[i6] = (char) b2;
                        i6++;
                        i5 = i7;
                    }
                }
                if (i6 == cArr.length) {
                    char[] cArr2 = this.f12480i;
                    int length = cArr2.length * 2;
                    int i8 = this.f12493v;
                    if (length <= i8) {
                        cArr = Arrays.copyOf(cArr2, length);
                        this.f12480i = cArr;
                    } else {
                        throw mo16633j(Integer.valueOf(i8), "Maximum string buffer limit exceeded");
                    }
                }
                int length2 = cArr.length;
                int i9 = i5 - 1;
                this.f12473b = i9;
                int i10 = i9 - i2;
                while (!mo16628e()) {
                    int o = mo16638o();
                    if (o == 34) {
                        return i10;
                    }
                    if (o == 92) {
                        if (i10 >= length2 - 6) {
                            char[] cArr3 = this.f12480i;
                            int length3 = cArr3.length * 2;
                            int i11 = this.f12493v;
                            if (length3 <= i11) {
                                cArr = Arrays.copyOf(cArr3, length3);
                                this.f12480i = cArr;
                                length2 = cArr.length;
                            } else {
                                throw mo16633j(Integer.valueOf(i11), "Maximum string buffer limit exceeded");
                            }
                        }
                        byte[] bArr = this.f12479h;
                        int i12 = this.f12473b;
                        int i13 = i12 + 1;
                        this.f12473b = i13;
                        byte b3 = bArr[i12];
                        if (b3 == 34 || b3 == 47 || b3 == 92) {
                            o = b3;
                        } else if (b3 == 98) {
                            o = 8;
                        } else if (b3 == 102) {
                            o = 12;
                        } else if (b3 == 110) {
                            o = 10;
                        } else if (b3 == 114) {
                            o = 13;
                        } else if (b3 == 116) {
                            o = 9;
                        } else if (b3 == 117) {
                            this.f12473b = i13 + 1;
                            byte[] bArr2 = this.f12479h;
                            int i14 = this.f12473b;
                            this.f12473b = i14 + 1;
                            int d = (mo16627d(bArr[i13]) << 12) + (mo16627d(bArr2[i14]) << 8);
                            byte[] bArr3 = this.f12479h;
                            int i15 = this.f12473b;
                            this.f12473b = i15 + 1;
                            int d2 = d + (mo16627d(bArr3[i15]) << 4);
                            byte[] bArr4 = this.f12479h;
                            int i16 = this.f12473b;
                            this.f12473b = i16 + 1;
                            o = d2 + mo16627d(bArr4[i16]);
                        } else {
                            throw mo16633j(Integer.valueOf(b3), "Invalid escape combination detected");
                        }
                    } else if ((o & 128) != 0) {
                        if (i10 >= length2 - 4) {
                            char[] cArr4 = this.f12480i;
                            int length4 = cArr4.length * 2;
                            int i17 = this.f12493v;
                            if (length4 <= i17) {
                                char[] copyOf = Arrays.copyOf(cArr4, length4);
                                this.f12480i = copyOf;
                                cArr = copyOf;
                                length2 = copyOf.length;
                            } else {
                                throw mo16633j(Integer.valueOf(i17), "Maximum string buffer limit exceeded");
                            }
                        }
                        byte[] bArr5 = this.f12479h;
                        int i18 = this.f12473b;
                        int i19 = i18 + 1;
                        this.f12473b = i19;
                        byte b4 = bArr5[i18];
                        if ((o & 224) == 192) {
                            i = (o & 31) << 6;
                            b = b4 & 63;
                        } else {
                            int i20 = i19 + 1;
                            this.f12473b = i20;
                            byte b5 = bArr5[i19];
                            if ((o & 240) == 224) {
                                i = ((o & 15) << 12) + ((b4 & 63) << 6);
                                b = b5 & 63;
                            } else {
                                this.f12473b = i20 + 1;
                                byte b6 = bArr5[i20];
                                if ((o & 248) == 240) {
                                    o = ((o & 7) << 18) + ((b4 & 63) << 12) + ((b5 & 63) << 6) + (b6 & 63);
                                    if (o >= 65536) {
                                        if (o < 1114112) {
                                            int i21 = o - 65536;
                                            int i22 = i10 + 1;
                                            cArr[i10] = (char) ((i21 >>> 10) + 55296);
                                            i10 = i22 + 1;
                                            cArr[i22] = (char) ((i21 & 1023) + 56320);
                                        } else {
                                            throw mo16630g(0, "Invalid unicode character detected");
                                        }
                                    }
                                } else {
                                    throw mo16630g(0, "Invalid unicode character detected");
                                }
                            }
                        }
                        o = i + b;
                    } else if (i10 >= length2) {
                        char[] cArr5 = this.f12480i;
                        int length5 = cArr5.length * 2;
                        int i23 = this.f12493v;
                        if (length5 <= i23) {
                            char[] copyOf2 = Arrays.copyOf(cArr5, length5);
                            this.f12480i = copyOf2;
                            cArr = copyOf2;
                            length2 = copyOf2.length;
                        } else {
                            throw mo16633j(Integer.valueOf(i23), "Maximum string buffer limit exceeded");
                        }
                    }
                    cArr[i10] = (char) o;
                    i10++;
                }
                throw mo16630g(0, "JSON string was not closed with a double quote");
            }
            throw mo16630g(0, "Premature end of JSON string");
        }
        throw mo16629f("Expecting '\"' for string start");
    }

    /* renamed from: l */
    public final void mo16635l(StringBuilder sb, int i) {
        sb.append("at position: ");
        sb.append((this.f12474c + ((long) this.f12473b)) - ((long) i));
        int i2 = this.f12473b;
        if (i2 > i) {
            try {
                int min = Math.min(i2 - i, 20);
                String str = new String(this.f12479h, (this.f12473b - i) - min, min, f12471z);
                sb.append(", following: `");
                sb.append(str);
                sb.append('`');
            } catch (Exception unused) {
            }
        }
        int i3 = this.f12473b;
        int i4 = i3 - i;
        int i5 = this.f12482k;
        if (i4 < i5) {
            try {
                String str2 = new String(this.f12479h, this.f12473b - i, Math.min((i5 - i3) + i, 20), f12471z);
                sb.append(", before: `");
                sb.append(str2);
                sb.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: m */
    public final char[] mo16636m(int i, int i2) throws ParsingException {
        char[] cArr;
        if (i2 <= this.f12492u) {
            while (true) {
                cArr = this.f12480i;
                if (cArr.length >= i2) {
                    break;
                }
                this.f12480i = Arrays.copyOf(cArr, cArr.length * 2);
            }
            byte[] bArr = this.f12479h;
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = (char) bArr[i + i3];
            }
            return cArr;
        }
        throw mo16632i(i2, Integer.valueOf(i2), "Too many digits detected in number", "Too many digits detected in number", "");
    }

    /* renamed from: n */
    public final int mo16637n() throws IOException {
        int read;
        int i = this.f12476e;
        int i2 = this.f12473b;
        int i3 = i - i2;
        byte[] bArr = this.f12479h;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        byte[] bArr2 = this.f12479h;
        InputStream inputStream = this.f12481j;
        int i4 = i3;
        while (i4 < bArr2.length && (read = inputStream.read(bArr2, i4, bArr2.length - i4)) != -1) {
            i4 += read;
        }
        long j = this.f12474c;
        int i5 = this.f12473b;
        this.f12474c = j + ((long) i5);
        if (i4 == i3) {
            int i6 = this.f12476e - i5;
            this.f12482k = i6;
            this.f12476e = i6;
            this.f12473b = 0;
        } else {
            int i7 = this.f12483l;
            if (i4 < i7) {
                i7 = i4;
            }
            this.f12482k = i7;
            this.f12476e = i4;
            this.f12473b = 0;
        }
        return i4;
    }

    /* renamed from: o */
    public final byte mo16638o() throws IOException {
        if (this.f12481j != null && this.f12473b > this.f12482k) {
            mo16637n();
        }
        int i = this.f12473b;
        if (i < this.f12476e) {
            byte[] bArr = this.f12479h;
            this.f12473b = i + 1;
            byte b = bArr[i];
            this.f12475d = b;
            return b;
        }
        throw ParsingException.create("Unexpected end of JSON input", f12469A, mo16647w());
    }

    /* renamed from: p */
    public final String mo16639p() throws IOException {
        String str;
        int k = mo16634k();
        C5897l lVar = this.f12484m;
        if (lVar != null) {
            str = ((C5847e.C5855h) lVar).mo16666a(this.f12480i, k);
        } else {
            str = new String(this.f12480i, 0, k);
        }
        if (mo16626c() == 58) {
            mo16626c();
            return str;
        }
        throw mo16629f("Expecting ':' after attribute name");
    }

    /* renamed from: q */
    public final char[] mo16640q() throws ParsingException {
        char[] cArr;
        if (this.f12475d == 34) {
            int i = this.f12473b;
            this.f12472a = i;
            int i2 = 0;
            while (true) {
                try {
                    cArr = this.f12477f;
                    if (i2 >= cArr.length) {
                        break;
                    }
                    int i3 = i + 1;
                    byte b = this.f12479h[i];
                    if (b == 34) {
                        i = i3;
                        break;
                    }
                    cArr[i2] = (char) b;
                    i2++;
                    i = i3;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw mo16630g(0, "JSON string was not closed with a double quote");
                }
            }
            if (i <= this.f12476e) {
                this.f12473b = i;
                return cArr;
            }
            throw mo16630g(0, "JSON string was not closed with a double quote");
        }
        throw mo16629f("Expecting '\"' for string start");
    }

    /* renamed from: r */
    public final String mo16641r() throws IOException {
        int k = mo16634k();
        C5897l lVar = this.f12485n;
        if (lVar == null) {
            return new String(this.f12480i, 0, k);
        }
        return ((C5847e.C5855h) lVar).mo16666a(this.f12480i, k);
    }

    /* renamed from: s */
    public final int mo16642s() {
        int i = this.f12473b;
        this.f12472a = i - 1;
        byte b = this.f12475d;
        int i2 = 1;
        while (i < this.f12476e) {
            int i3 = i + 1;
            b = this.f12479h[i];
            if (b == 44 || b == 125 || b == 93) {
                break;
            }
            i2++;
            i = i3;
        }
        this.f12473b = (i2 - 1) + this.f12473b;
        this.f12475d = b;
        return this.f12472a;
    }

    /* renamed from: t */
    public final boolean mo16643t() throws ParsingException {
        if (this.f12475d != 102) {
            return false;
        }
        int i = this.f12473b;
        if (i + 3 < this.f12476e) {
            byte[] bArr = this.f12479h;
            if (bArr[i] == 97 && bArr[i + 1] == 108 && bArr[i + 2] == 115 && bArr[i + 3] == 101) {
                this.f12473b = i + 4;
                this.f12475d = 101;
                return true;
            }
        }
        throw mo16630g(0, "Invalid false constant found");
    }

    public final String toString() {
        return new String(this.f12479h, 0, this.f12476e, f12471z);
    }

    /* renamed from: u */
    public final boolean mo16645u() throws ParsingException {
        if (this.f12475d != 110) {
            return false;
        }
        int i = this.f12473b;
        if (i + 2 < this.f12476e) {
            byte[] bArr = this.f12479h;
            if (bArr[i] == 117 && bArr[i + 1] == 108 && bArr[i + 2] == 108) {
                this.f12473b = i + 3;
                this.f12475d = 108;
                return true;
            }
        }
        throw mo16630g(0, "Invalid null constant found");
    }

    /* renamed from: v */
    public final boolean mo16646v() throws ParsingException {
        if (this.f12475d != 116) {
            return false;
        }
        int i = this.f12473b;
        if (i + 2 < this.f12476e) {
            byte[] bArr = this.f12479h;
            if (bArr[i] == 114 && bArr[i + 1] == 117 && bArr[i + 2] == 101) {
                this.f12473b = i + 3;
                this.f12475d = 101;
                return true;
            }
        }
        throw mo16630g(0, "Invalid true constant found");
    }

    /* renamed from: w */
    public final boolean mo16647w() {
        return this.f12488q == ErrorInfo.WITH_STACK_TRACE;
    }
}
