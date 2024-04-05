package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.crypto.tink.shaded.protobuf.RopeByteString;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
public abstract class C16497i {

    /* renamed from: a */
    public int f36619a;

    /* renamed from: b */
    public int f36620b = 100;

    /* renamed from: c */
    public int f36621c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: d */
    public C16502j f36622d;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$a */
    public static final class C16498a extends C16497i {

        /* renamed from: e */
        public final byte[] f36623e;

        /* renamed from: f */
        public int f36624f;

        /* renamed from: g */
        public int f36625g;

        /* renamed from: h */
        public int f36626h;

        /* renamed from: i */
        public int f36627i;

        /* renamed from: j */
        public int f36628j;

        /* renamed from: k */
        public int f36629k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C16498a(byte[] bArr, int i, int i2, boolean z) {
            this.f36623e = bArr;
            this.f36624f = i2 + i;
            this.f36626h = i;
            this.f36627i = i;
        }

        /* renamed from: A */
        public final boolean mo58760A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f36624f - this.f36626h >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f36623e;
                        int i4 = this.f36626h;
                        this.f36626h = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    int i5 = this.f36626h;
                    if (i5 != this.f36624f) {
                        byte[] bArr2 = this.f36623e;
                        this.f36626h = i5 + 1;
                        if (bArr2[i5] < 0) {
                            i3++;
                        }
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            } else if (i2 == 1) {
                mo58789G(8);
                return true;
            } else if (i2 == 2) {
                mo58789G(mo58786D());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo58781x();
                    if (x == 0 || !mo58760A(x)) {
                        mo58761a(((i >>> 3) << 3) | 4);
                    }
                    x = mo58781x();
                    break;
                } while (!mo58760A(x));
                mo58761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo58789G(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final int mo58784B() throws IOException {
            int i = this.f36626h;
            if (this.f36624f - i >= 4) {
                byte[] bArr = this.f36623e;
                this.f36626h = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public final long mo58785C() throws IOException {
            int i = this.f36626h;
            if (this.f36624f - i >= 8) {
                byte[] bArr = this.f36623e;
                this.f36626h = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo58786D() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f36626h
                int r1 = r5.f36624f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f36623e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f36626h = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo58788F()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f36626h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16498a.mo58786D():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo58787E() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f36626h
                int r1 = r11.f36624f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f36623e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f36626h = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo58788F()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f36626h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16498a.mo58787E():long");
        }

        /* renamed from: F */
        public final long mo58788F() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                int i2 = this.f36626h;
                if (i2 != this.f36624f) {
                    byte[] bArr = this.f36623e;
                    this.f36626h = i2 + 1;
                    byte b = bArr[i2];
                    j |= ((long) (b & Byte.MAX_VALUE)) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: G */
        public final void mo58789G(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f36624f;
                int i3 = this.f36626h;
                if (i <= i2 - i3) {
                    this.f36626h = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: a */
        public final void mo58761a(int i) throws InvalidProtocolBufferException {
            if (this.f36628j != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo58762d() {
            return this.f36626h - this.f36627i;
        }

        /* renamed from: e */
        public final boolean mo58763e() throws IOException {
            return this.f36626h == this.f36624f;
        }

        /* renamed from: g */
        public final void mo58764g(int i) {
            this.f36629k = i;
            int i2 = this.f36624f + this.f36625g;
            this.f36624f = i2;
            int i3 = i2 - this.f36627i;
            if (i3 > i) {
                int i4 = i3 - i;
                this.f36625g = i4;
                this.f36624f = i2 - i4;
                return;
            }
            this.f36625g = 0;
        }

        /* renamed from: h */
        public final int mo58765h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f36626h;
                int i3 = this.f36627i;
                int i4 = (i2 - i3) + i;
                int i5 = this.f36629k;
                if (i4 <= i5) {
                    this.f36629k = i4;
                    int i6 = this.f36624f + this.f36625g;
                    this.f36624f = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f36625g = i8;
                        this.f36624f = i6 - i8;
                    } else {
                        this.f36625g = 0;
                    }
                    return i5;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo58766i() throws IOException {
            return mo58787E() != 0;
        }

        /* renamed from: j */
        public final ByteString mo58767j() throws IOException {
            byte[] bArr;
            int D = mo58786D();
            if (D > 0) {
                int i = this.f36624f;
                int i2 = this.f36626h;
                if (D <= i - i2) {
                    ByteString copyFrom = ByteString.copyFrom(this.f36623e, i2, D);
                    this.f36626h += D;
                    return copyFrom;
                }
            }
            if (D == 0) {
                return ByteString.EMPTY;
            }
            if (D > 0) {
                int i3 = this.f36624f;
                int i4 = this.f36626h;
                if (D <= i3 - i4) {
                    int i5 = D + i4;
                    this.f36626h = i5;
                    bArr = Arrays.copyOfRange(this.f36623e, i4, i5);
                    return ByteString.wrap(bArr);
                }
            }
            if (D > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (D == 0) {
                bArr = C16531v.f36705b;
                return ByteString.wrap(bArr);
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: k */
        public final double mo58768k() throws IOException {
            return Double.longBitsToDouble(mo58785C());
        }

        /* renamed from: l */
        public final int mo58769l() throws IOException {
            return mo58786D();
        }

        /* renamed from: m */
        public final int mo58770m() throws IOException {
            return mo58784B();
        }

        /* renamed from: n */
        public final long mo58771n() throws IOException {
            return mo58785C();
        }

        /* renamed from: o */
        public final float mo58772o() throws IOException {
            return Float.intBitsToFloat(mo58784B());
        }

        /* renamed from: p */
        public final int mo58773p() throws IOException {
            return mo58786D();
        }

        /* renamed from: q */
        public final long mo58774q() throws IOException {
            return mo58787E();
        }

        /* renamed from: r */
        public final int mo58775r() throws IOException {
            return mo58784B();
        }

        /* renamed from: s */
        public final long mo58776s() throws IOException {
            return mo58785C();
        }

        /* renamed from: t */
        public final int mo58777t() throws IOException {
            return C16497i.m26919b(mo58786D());
        }

        /* renamed from: u */
        public final long mo58778u() throws IOException {
            return C16497i.m26920c(mo58787E());
        }

        /* renamed from: v */
        public final String mo58779v() throws IOException {
            int D = mo58786D();
            if (D > 0) {
                int i = this.f36624f;
                int i2 = this.f36626h;
                if (D <= i - i2) {
                    String str = new String(this.f36623e, i2, D, C16531v.f36704a);
                    this.f36626h += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: w */
        public final String mo58780w() throws IOException {
            int D = mo58786D();
            if (D > 0) {
                int i = this.f36624f;
                int i2 = this.f36626h;
                if (D <= i - i2) {
                    String a = Utf8.f36555a.mo58593a(i2, D, this.f36623e);
                    this.f36626h += D;
                    return a;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: x */
        public final int mo58781x() throws IOException {
            if (mo58763e()) {
                this.f36628j = 0;
                return 0;
            }
            int D = mo58786D();
            this.f36628j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo58782y() throws IOException {
            return mo58786D();
        }

        /* renamed from: z */
        public final long mo58783z() throws IOException {
            return mo58787E();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    public static final class C16499b extends C16497i {

        /* renamed from: e */
        public final InputStream f36630e;

        /* renamed from: f */
        public final byte[] f36631f;

        /* renamed from: g */
        public int f36632g;

        /* renamed from: h */
        public int f36633h;

        /* renamed from: i */
        public int f36634i;

        /* renamed from: j */
        public int f36635j;

        /* renamed from: k */
        public int f36636k;

        /* renamed from: l */
        public int f36637l = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C16499b(RopeByteString.C16440d dVar) {
            Charset charset = C16531v.f36704a;
            this.f36630e = dVar;
            this.f36631f = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
            this.f36632g = 0;
            this.f36634i = 0;
            this.f36636k = 0;
        }

        /* renamed from: A */
        public final boolean mo58760A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f36632g - this.f36634i >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f36631f;
                        int i4 = this.f36634i;
                        this.f36634i = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    if (this.f36634i == this.f36632g) {
                        mo58799K(1);
                    }
                    byte[] bArr2 = this.f36631f;
                    int i5 = this.f36634i;
                    this.f36634i = i5 + 1;
                    if (bArr2[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            } else if (i2 == 1) {
                mo58800L(8);
                return true;
            } else if (i2 == 2) {
                mo58800L(mo58795G());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo58781x();
                    if (x == 0 || !mo58760A(x)) {
                        mo58761a(((i >>> 3) << 3) | 4);
                    }
                    x = mo58781x();
                    break;
                } while (!mo58760A(x));
                mo58761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo58800L(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final byte[] mo58790B(int i) throws IOException {
            byte[] C = mo58791C(i);
            if (C != null) {
                return C;
            }
            int i2 = this.f36634i;
            int i3 = this.f36632g;
            int i4 = i3 - i2;
            this.f36636k += i3;
            this.f36634i = 0;
            this.f36632g = 0;
            ArrayList D = mo58792D(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f36631f, i2, bArr, 0, i4);
            Iterator it = D.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: C */
        public final byte[] mo58791C(int i) throws IOException {
            if (i == 0) {
                return C16531v.f36705b;
            }
            if (i >= 0) {
                int i2 = this.f36636k;
                int i3 = this.f36634i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f36621c <= 0) {
                    int i5 = this.f36637l;
                    if (i4 <= i5) {
                        int i6 = this.f36632g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f36630e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f36631f, this.f36634i, bArr, 0, i6);
                        this.f36636k += this.f36632g;
                        this.f36634i = 0;
                        this.f36632g = 0;
                        while (i6 < i) {
                            int read = this.f36630e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f36636k += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo58800L((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: D */
        public final ArrayList mo58792D(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f36630e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f36636k += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: E */
        public final int mo58793E() throws IOException {
            int i = this.f36634i;
            if (this.f36632g - i < 4) {
                mo58799K(4);
                i = this.f36634i;
            }
            byte[] bArr = this.f36631f;
            this.f36634i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: F */
        public final long mo58794F() throws IOException {
            int i = this.f36634i;
            if (this.f36632g - i < 8) {
                mo58799K(8);
                i = this.f36634i;
            }
            byte[] bArr = this.f36631f;
            this.f36634i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo58795G() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f36634i
                int r1 = r5.f36632g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f36631f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f36634i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo58797I()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f36634i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16499b.mo58795G():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: H */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo58796H() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f36634i
                int r1 = r11.f36632g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f36631f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f36634i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo58797I()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f36634i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16499b.mo58796H():long");
        }

        /* renamed from: I */
        public final long mo58797I() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f36634i == this.f36632g) {
                    mo58799K(1);
                }
                byte[] bArr = this.f36631f;
                int i2 = this.f36634i;
                this.f36634i = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: J */
        public final void mo58798J() {
            int i = this.f36632g + this.f36633h;
            this.f36632g = i;
            int i2 = this.f36636k + i;
            int i3 = this.f36637l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f36633h = i4;
                this.f36632g = i - i4;
                return;
            }
            this.f36633h = 0;
        }

        /* renamed from: K */
        public final void mo58799K(int i) throws IOException {
            if (mo58801M(i)) {
                return;
            }
            if (i > (this.f36621c - this.f36636k) - this.f36634i) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            throw new java.lang.IllegalStateException(r7.f36630e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58800L(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f36632g
                int r1 = r7.f36634i
                int r2 = r0 - r1
                if (r8 > r2) goto L_0x000f
                if (r8 < 0) goto L_0x000f
                int r1 = r1 + r8
                r7.f36634i = r1
                goto L_0x0092
            L_0x000f:
                if (r8 < 0) goto L_0x009d
                int r2 = r7.f36636k
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f36637l
                if (r4 > r5) goto L_0x0093
                r7.f36636k = r3
                int r0 = r0 - r1
                r1 = 0
                r7.f36632g = r1
                r7.f36634i = r1
            L_0x0023:
                if (r0 >= r8) goto L_0x006d
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f36630e     // Catch:{ all -> 0x0063 }
                long r3 = (long) r1     // Catch:{ all -> 0x0063 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0063 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x003e
                if (r5 != 0) goto L_0x003b
                goto L_0x006d
            L_0x003b:
                int r1 = (int) r1     // Catch:{ all -> 0x0063 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x003e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
                r3.<init>()     // Catch:{ all -> 0x0063 }
                java.io.InputStream r4 = r7.f36630e     // Catch:{ all -> 0x0063 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0063 }
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0063 }
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0063 }
                r8.<init>(r1)     // Catch:{ all -> 0x0063 }
                throw r8     // Catch:{ all -> 0x0063 }
            L_0x0063:
                r8 = move-exception
                int r1 = r7.f36636k
                int r1 = r1 + r0
                r7.f36636k = r1
                r7.mo58798J()
                throw r8
            L_0x006d:
                int r1 = r7.f36636k
                int r1 = r1 + r0
                r7.f36636k = r1
                r7.mo58798J()
                if (r0 >= r8) goto L_0x0092
                int r0 = r7.f36632g
                int r1 = r7.f36634i
                int r1 = r0 - r1
                r7.f36634i = r0
                r0 = 1
                r7.mo58799K(r0)
            L_0x0083:
                int r2 = r8 - r1
                int r3 = r7.f36632g
                if (r2 <= r3) goto L_0x0090
                int r1 = r1 + r3
                r7.f36634i = r3
                r7.mo58799K(r0)
                goto L_0x0083
            L_0x0090:
                r7.f36634i = r2
            L_0x0092:
                return
            L_0x0093:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.mo58800L(r5)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r8
            L_0x009d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16499b.mo58800L(int):void");
        }

        /* renamed from: M */
        public final boolean mo58801M(int i) throws IOException {
            int i2 = this.f36634i;
            int i3 = i2 + i;
            int i4 = this.f36632g;
            if (i3 > i4) {
                int i5 = this.f36621c;
                int i6 = this.f36636k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f36637l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f36631f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f36636k += i2;
                    this.f36632g -= i2;
                    this.f36634i = 0;
                }
                InputStream inputStream = this.f36630e;
                byte[] bArr2 = this.f36631f;
                int i7 = this.f36632g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f36621c - this.f36636k) - i7));
                if (read == 0 || read < -1 || read > this.f36631f.length) {
                    throw new IllegalStateException(this.f36630e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f36632g += read;
                    mo58798J();
                    if (this.f36632g >= i) {
                        return true;
                    }
                    return mo58801M(i);
                }
            } else {
                throw new IllegalStateException(C0069a.m175f("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
        }

        /* renamed from: a */
        public final void mo58761a(int i) throws InvalidProtocolBufferException {
            if (this.f36635j != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo58762d() {
            return this.f36636k + this.f36634i;
        }

        /* renamed from: e */
        public final boolean mo58763e() throws IOException {
            return this.f36634i == this.f36632g && !mo58801M(1);
        }

        /* renamed from: g */
        public final void mo58764g(int i) {
            this.f36637l = i;
            mo58798J();
        }

        /* renamed from: h */
        public final int mo58765h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f36636k + this.f36634i + i;
                int i3 = this.f36637l;
                if (i2 <= i3) {
                    this.f36637l = i2;
                    mo58798J();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo58766i() throws IOException {
            return mo58796H() != 0;
        }

        /* renamed from: j */
        public final ByteString mo58767j() throws IOException {
            int G = mo58795G();
            int i = this.f36632g;
            int i2 = this.f36634i;
            if (G <= i - i2 && G > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f36631f, i2, G);
                this.f36634i += G;
                return copyFrom;
            } else if (G == 0) {
                return ByteString.EMPTY;
            } else {
                byte[] C = mo58791C(G);
                if (C != null) {
                    return ByteString.copyFrom(C);
                }
                int i3 = this.f36634i;
                int i4 = this.f36632g;
                int i5 = i4 - i3;
                this.f36636k += i4;
                this.f36634i = 0;
                this.f36632g = 0;
                ArrayList D = mo58792D(G - i5);
                byte[] bArr = new byte[G];
                System.arraycopy(this.f36631f, i3, bArr, 0, i5);
                Iterator it = D.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                return ByteString.wrap(bArr);
            }
        }

        /* renamed from: k */
        public final double mo58768k() throws IOException {
            return Double.longBitsToDouble(mo58794F());
        }

        /* renamed from: l */
        public final int mo58769l() throws IOException {
            return mo58795G();
        }

        /* renamed from: m */
        public final int mo58770m() throws IOException {
            return mo58793E();
        }

        /* renamed from: n */
        public final long mo58771n() throws IOException {
            return mo58794F();
        }

        /* renamed from: o */
        public final float mo58772o() throws IOException {
            return Float.intBitsToFloat(mo58793E());
        }

        /* renamed from: p */
        public final int mo58773p() throws IOException {
            return mo58795G();
        }

        /* renamed from: q */
        public final long mo58774q() throws IOException {
            return mo58796H();
        }

        /* renamed from: r */
        public final int mo58775r() throws IOException {
            return mo58793E();
        }

        /* renamed from: s */
        public final long mo58776s() throws IOException {
            return mo58794F();
        }

        /* renamed from: t */
        public final int mo58777t() throws IOException {
            return C16497i.m26919b(mo58795G());
        }

        /* renamed from: u */
        public final long mo58778u() throws IOException {
            return C16497i.m26920c(mo58796H());
        }

        /* renamed from: v */
        public final String mo58779v() throws IOException {
            int G = mo58795G();
            if (G > 0) {
                int i = this.f36632g;
                int i2 = this.f36634i;
                if (G <= i - i2) {
                    String str = new String(this.f36631f, i2, G, C16531v.f36704a);
                    this.f36634i += G;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G > this.f36632g) {
                return new String(mo58790B(G), C16531v.f36704a);
            }
            mo58799K(G);
            String str2 = new String(this.f36631f, this.f36634i, G, C16531v.f36704a);
            this.f36634i += G;
            return str2;
        }

        /* renamed from: w */
        public final String mo58780w() throws IOException {
            byte[] bArr;
            byte[] bArr2;
            int G = mo58795G();
            int i = this.f36634i;
            int i2 = this.f36632g;
            if (G <= i2 - i && G > 0) {
                bArr = this.f36631f;
                this.f36634i = i + G;
            } else if (G == 0) {
                return "";
            } else {
                if (G <= i2) {
                    mo58799K(G);
                    bArr2 = this.f36631f;
                    this.f36634i = G + 0;
                } else {
                    bArr2 = mo58790B(G);
                }
                bArr = bArr2;
                i = 0;
            }
            return Utf8.f36555a.mo58593a(i, G, bArr);
        }

        /* renamed from: x */
        public final int mo58781x() throws IOException {
            if (mo58763e()) {
                this.f36635j = 0;
                return 0;
            }
            int G = mo58795G();
            this.f36635j = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo58782y() throws IOException {
            return mo58795G();
        }

        /* renamed from: z */
        public final long mo58783z() throws IOException {
            return mo58796H();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    public static final class C16500c extends C16497i {

        /* renamed from: e */
        public final ByteBuffer f36638e;

        /* renamed from: f */
        public final long f36639f;

        /* renamed from: g */
        public long f36640g;

        /* renamed from: h */
        public long f36641h;

        /* renamed from: i */
        public long f36642i;

        /* renamed from: j */
        public int f36643j;

        /* renamed from: k */
        public int f36644k;

        /* renamed from: l */
        public int f36645l = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C16500c(ByteBuffer byteBuffer) {
            this.f36638e = byteBuffer;
            long k = C16488g1.f36612d.mo58754k(C16488g1.f36616h, byteBuffer);
            this.f36639f = k;
            this.f36640g = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f36641h = position;
            this.f36642i = position;
        }

        /* renamed from: A */
        public final boolean mo58760A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (((int) (this.f36640g - this.f36641h)) >= 10) {
                    while (i3 < 10) {
                        long j = this.f36641h;
                        this.f36641h = j + 1;
                        if (C16488g1.m26841g(j) < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    long j2 = this.f36641h;
                    if (j2 != this.f36640g) {
                        this.f36641h = j2 + 1;
                        if (C16488g1.m26841g(j2) < 0) {
                            i3++;
                        }
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            } else if (i2 == 1) {
                mo58808H(8);
                return true;
            } else if (i2 == 2) {
                mo58808H(mo58804D());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo58781x();
                    if (x == 0 || !mo58760A(x)) {
                        mo58761a(((i >>> 3) << 3) | 4);
                    }
                    x = mo58781x();
                    break;
                } while (!mo58760A(x));
                mo58761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo58808H(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final int mo58802B() throws IOException {
            long j = this.f36641h;
            if (this.f36640g - j >= 4) {
                this.f36641h = 4 + j;
                return ((C16488g1.m26841g(j + 3) & 255) << 24) | (C16488g1.m26841g(j) & 255) | ((C16488g1.m26841g(1 + j) & 255) << 8) | ((C16488g1.m26841g(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public final long mo58803C() throws IOException {
            long j = this.f36641h;
            if (this.f36640g - j >= 8) {
                this.f36641h = 8 + j;
                return ((((long) C16488g1.m26841g(j + 7)) & 255) << 56) | (((long) C16488g1.m26841g(j)) & 255) | ((((long) C16488g1.m26841g(1 + j)) & 255) << 8) | ((((long) C16488g1.m26841g(2 + j)) & 255) << 16) | ((((long) C16488g1.m26841g(3 + j)) & 255) << 24) | ((((long) C16488g1.m26841g(4 + j)) & 255) << 32) | ((((long) C16488g1.m26841g(5 + j)) & 255) << 40) | ((((long) C16488g1.m26841g(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4) < 0) goto L_0x0085;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo58804D() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f36641h
                long r2 = r10.f36640g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r0)
                if (r0 < 0) goto L_0x0017
                r10.f36641h = r4
                return r0
            L_0x0017:
                long r6 = r10.f36640g
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26841g(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo58806F()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f36641h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16497i.C16500c.mo58804D():int");
        }

        /* renamed from: E */
        public final long mo58805E() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f36641h;
            if (this.f36640g != j4) {
                long j5 = j4 + 1;
                byte g = C16488g1.m26841g(j4);
                if (g >= 0) {
                    this.f36641h = j5;
                    return (long) g;
                } else if (this.f36640g - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte g2 = g ^ (C16488g1.m26841g(j5) << 7);
                    if (g2 < 0) {
                        b = g2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte g3 = g2 ^ (C16488g1.m26841g(j6) << 14);
                        if (g3 >= 0) {
                            j = (long) (g3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte g4 = g3 ^ (C16488g1.m26841g(j7) << 21);
                            if (g4 < 0) {
                                b = g4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long g5 = ((long) g4) ^ (((long) C16488g1.m26841g(j6)) << 28);
                                if (g5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long g6 = g5 ^ (((long) C16488g1.m26841g(j7)) << 35);
                                    if (g6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        g5 = g6 ^ (((long) C16488g1.m26841g(j8)) << 42);
                                        if (g5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            g6 = g5 ^ (((long) C16488g1.m26841g(j7)) << 49);
                                            if (g6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (g6 ^ (((long) C16488g1.m26841g(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C16488g1.m26841g(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f36641h = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = g6 ^ j2;
                                    j6 = j8;
                                    this.f36641h = j6;
                                    return j;
                                }
                                j = g5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f36641h = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f36641h = j6;
                    return j;
                }
            }
            return mo58806F();
        }

        /* renamed from: F */
        public final long mo58806F() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                long j2 = this.f36641h;
                if (j2 != this.f36640g) {
                    this.f36641h = 1 + j2;
                    byte g = C16488g1.m26841g(j2);
                    j |= ((long) (g & Byte.MAX_VALUE)) << i;
                    if ((g & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: G */
        public final void mo58807G() {
            long j = this.f36640g + ((long) this.f36643j);
            this.f36640g = j;
            int i = (int) (j - this.f36642i);
            int i2 = this.f36645l;
            if (i > i2) {
                int i3 = i - i2;
                this.f36643j = i3;
                this.f36640g = j - ((long) i3);
                return;
            }
            this.f36643j = 0;
        }

        /* renamed from: H */
        public final void mo58808H(int i) throws IOException {
            if (i >= 0) {
                long j = this.f36640g;
                long j2 = this.f36641h;
                if (i <= ((int) (j - j2))) {
                    this.f36641h = j2 + ((long) i);
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: a */
        public final void mo58761a(int i) throws InvalidProtocolBufferException {
            if (this.f36644k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo58762d() {
            return (int) (this.f36641h - this.f36642i);
        }

        /* renamed from: e */
        public final boolean mo58763e() throws IOException {
            return this.f36641h == this.f36640g;
        }

        /* renamed from: g */
        public final void mo58764g(int i) {
            this.f36645l = i;
            mo58807G();
        }

        /* renamed from: h */
        public final int mo58765h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = mo58762d() + i;
                int i2 = this.f36645l;
                if (d <= i2) {
                    this.f36645l = d;
                    mo58807G();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo58766i() throws IOException {
            return mo58805E() != 0;
        }

        /* renamed from: j */
        public final ByteString mo58767j() throws IOException {
            int D = mo58804D();
            if (D > 0) {
                long j = this.f36640g;
                long j2 = this.f36641h;
                if (D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[D];
                    long j3 = (long) D;
                    C16488g1.f36612d.mo58740c(j2, bArr, j3);
                    this.f36641h += j3;
                    return ByteString.wrap(bArr);
                }
            }
            if (D == 0) {
                return ByteString.EMPTY;
            }
            if (D < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: k */
        public final double mo58768k() throws IOException {
            return Double.longBitsToDouble(mo58803C());
        }

        /* renamed from: l */
        public final int mo58769l() throws IOException {
            return mo58804D();
        }

        /* renamed from: m */
        public final int mo58770m() throws IOException {
            return mo58802B();
        }

        /* renamed from: n */
        public final long mo58771n() throws IOException {
            return mo58803C();
        }

        /* renamed from: o */
        public final float mo58772o() throws IOException {
            return Float.intBitsToFloat(mo58802B());
        }

        /* renamed from: p */
        public final int mo58773p() throws IOException {
            return mo58804D();
        }

        /* renamed from: q */
        public final long mo58774q() throws IOException {
            return mo58805E();
        }

        /* renamed from: r */
        public final int mo58775r() throws IOException {
            return mo58802B();
        }

        /* renamed from: s */
        public final long mo58776s() throws IOException {
            return mo58803C();
        }

        /* renamed from: t */
        public final int mo58777t() throws IOException {
            return C16497i.m26919b(mo58804D());
        }

        /* renamed from: u */
        public final long mo58778u() throws IOException {
            return C16497i.m26920c(mo58805E());
        }

        /* renamed from: v */
        public final String mo58779v() throws IOException {
            int D = mo58804D();
            if (D > 0) {
                long j = this.f36640g;
                long j2 = this.f36641h;
                if (D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[D];
                    long j3 = (long) D;
                    C16488g1.f36612d.mo58740c(j2, bArr, j3);
                    String str = new String(bArr, C16531v.f36704a);
                    this.f36641h += j3;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: w */
        public final String mo58780w() throws IOException {
            int D = mo58804D();
            if (D > 0) {
                long j = this.f36640g;
                long j2 = this.f36641h;
                if (D <= ((int) (j - j2))) {
                    int i = (int) (j2 - this.f36639f);
                    ByteBuffer byteBuffer = this.f36638e;
                    Utf8.C16442b bVar = Utf8.f36555a;
                    bVar.getClass();
                    String a = byteBuffer.hasArray() ? bVar.mo58593a(byteBuffer.arrayOffset() + i, D, byteBuffer.array()) : byteBuffer.isDirect() ? bVar.mo58594c(byteBuffer, i, D) : Utf8.C16442b.m26673b(byteBuffer, i, D);
                    this.f36641h += (long) D;
                    return a;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: x */
        public final int mo58781x() throws IOException {
            if (mo58763e()) {
                this.f36644k = 0;
                return 0;
            }
            int D = mo58804D();
            this.f36644k = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo58782y() throws IOException {
            return mo58804D();
        }

        /* renamed from: z */
        public final long mo58783z() throws IOException {
            return mo58805E();
        }
    }

    /* renamed from: b */
    public static int m26919b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m26920c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C16498a m26921f(byte[] bArr, int i, int i2, boolean z) {
        C16498a aVar = new C16498a(bArr, i, i2, z);
        try {
            aVar.mo58765h(i2);
            return aVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract boolean mo58760A(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo58761a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo58762d();

    /* renamed from: e */
    public abstract boolean mo58763e() throws IOException;

    /* renamed from: g */
    public abstract void mo58764g(int i);

    /* renamed from: h */
    public abstract int mo58765h(int i) throws InvalidProtocolBufferException;

    /* renamed from: i */
    public abstract boolean mo58766i() throws IOException;

    /* renamed from: j */
    public abstract ByteString mo58767j() throws IOException;

    /* renamed from: k */
    public abstract double mo58768k() throws IOException;

    /* renamed from: l */
    public abstract int mo58769l() throws IOException;

    /* renamed from: m */
    public abstract int mo58770m() throws IOException;

    /* renamed from: n */
    public abstract long mo58771n() throws IOException;

    /* renamed from: o */
    public abstract float mo58772o() throws IOException;

    /* renamed from: p */
    public abstract int mo58773p() throws IOException;

    /* renamed from: q */
    public abstract long mo58774q() throws IOException;

    /* renamed from: r */
    public abstract int mo58775r() throws IOException;

    /* renamed from: s */
    public abstract long mo58776s() throws IOException;

    /* renamed from: t */
    public abstract int mo58777t() throws IOException;

    /* renamed from: u */
    public abstract long mo58778u() throws IOException;

    /* renamed from: v */
    public abstract String mo58779v() throws IOException;

    /* renamed from: w */
    public abstract String mo58780w() throws IOException;

    /* renamed from: x */
    public abstract int mo58781x() throws IOException;

    /* renamed from: y */
    public abstract int mo58782y() throws IOException;

    /* renamed from: z */
    public abstract long mo58783z() throws IOException;
}
