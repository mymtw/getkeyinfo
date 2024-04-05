package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i */
public abstract class C2592i {

    /* renamed from: a */
    public int f5886a;

    /* renamed from: b */
    public int f5887b = 100;

    /* renamed from: c */
    public int f5888c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: d */
    public C2598j f5889d;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static final class C2593a extends C2592i {

        /* renamed from: e */
        public final byte[] f5890e;

        /* renamed from: f */
        public int f5891f;

        /* renamed from: g */
        public int f5892g;

        /* renamed from: h */
        public int f5893h;

        /* renamed from: i */
        public int f5894i;

        /* renamed from: j */
        public int f5895j;

        /* renamed from: k */
        public int f5896k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C2593a(byte[] bArr, int i, int i2, boolean z) {
            this.f5890e = bArr;
            this.f5891f = i2 + i;
            this.f5893h = i;
            this.f5894i = i;
        }

        /* renamed from: A */
        public final boolean mo9699A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f5891f - this.f5893h >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f5890e;
                        int i4 = this.f5893h;
                        this.f5893h = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    int i5 = this.f5893h;
                    if (i5 != this.f5891f) {
                        byte[] bArr2 = this.f5890e;
                        this.f5893h = i5 + 1;
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
                mo9728G(8);
                return true;
            } else if (i2 == 2) {
                mo9728G(mo9725D());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo9720x();
                    if (x == 0 || !mo9699A(x)) {
                        mo9700a(((i >>> 3) << 3) | 4);
                    }
                    x = mo9720x();
                    break;
                } while (!mo9699A(x));
                mo9700a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo9728G(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final int mo9723B() throws IOException {
            int i = this.f5893h;
            if (this.f5891f - i >= 4) {
                byte[] bArr = this.f5890e;
                this.f5893h = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public final long mo9724C() throws IOException {
            int i = this.f5893h;
            if (this.f5891f - i >= 8) {
                byte[] bArr = this.f5890e;
                this.f5893h = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo9725D() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f5893h
                int r1 = r5.f5891f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f5890e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f5893h = r3
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
                long r0 = r5.mo9727F()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f5893h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2593a.mo9725D():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo9726E() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f5893h
                int r1 = r11.f5891f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f5890e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f5893h = r3
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
                long r0 = r11.mo9727F()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f5893h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2593a.mo9726E():long");
        }

        /* renamed from: F */
        public final long mo9727F() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                int i2 = this.f5893h;
                if (i2 != this.f5891f) {
                    byte[] bArr = this.f5890e;
                    this.f5893h = i2 + 1;
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
        public final void mo9728G(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f5891f;
                int i3 = this.f5893h;
                if (i <= i2 - i3) {
                    this.f5893h = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: a */
        public final void mo9700a(int i) throws InvalidProtocolBufferException {
            if (this.f5895j != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo9701d() {
            return this.f5893h - this.f5894i;
        }

        /* renamed from: e */
        public final boolean mo9702e() throws IOException {
            return this.f5893h == this.f5891f;
        }

        /* renamed from: g */
        public final void mo9703g(int i) {
            this.f5896k = i;
            int i2 = this.f5891f + this.f5892g;
            this.f5891f = i2;
            int i3 = i2 - this.f5894i;
            if (i3 > i) {
                int i4 = i3 - i;
                this.f5892g = i4;
                this.f5891f = i2 - i4;
                return;
            }
            this.f5892g = 0;
        }

        /* renamed from: h */
        public final int mo9704h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f5893h;
                int i3 = this.f5894i;
                int i4 = (i2 - i3) + i;
                int i5 = this.f5896k;
                if (i4 <= i5) {
                    this.f5896k = i4;
                    int i6 = this.f5891f + this.f5892g;
                    this.f5891f = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f5892g = i8;
                        this.f5891f = i6 - i8;
                    } else {
                        this.f5892g = 0;
                    }
                    return i5;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo9705i() throws IOException {
            return mo9726E() != 0;
        }

        /* renamed from: j */
        public final ByteString mo9706j() throws IOException {
            byte[] bArr;
            int D = mo9725D();
            if (D > 0) {
                int i = this.f5891f;
                int i2 = this.f5893h;
                if (D <= i - i2) {
                    ByteString copyFrom = ByteString.copyFrom(this.f5890e, i2, D);
                    this.f5893h += D;
                    return copyFrom;
                }
            }
            if (D == 0) {
                return ByteString.EMPTY;
            }
            if (D > 0) {
                int i3 = this.f5891f;
                int i4 = this.f5893h;
                if (D <= i3 - i4) {
                    int i5 = D + i4;
                    this.f5893h = i5;
                    bArr = Arrays.copyOfRange(this.f5890e, i4, i5);
                    return ByteString.wrap(bArr);
                }
            }
            if (D > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (D == 0) {
                bArr = C2631w.f5974b;
                return ByteString.wrap(bArr);
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: k */
        public final double mo9707k() throws IOException {
            return Double.longBitsToDouble(mo9724C());
        }

        /* renamed from: l */
        public final int mo9708l() throws IOException {
            return mo9725D();
        }

        /* renamed from: m */
        public final int mo9709m() throws IOException {
            return mo9723B();
        }

        /* renamed from: n */
        public final long mo9710n() throws IOException {
            return mo9724C();
        }

        /* renamed from: o */
        public final float mo9711o() throws IOException {
            return Float.intBitsToFloat(mo9723B());
        }

        /* renamed from: p */
        public final int mo9712p() throws IOException {
            return mo9725D();
        }

        /* renamed from: q */
        public final long mo9713q() throws IOException {
            return mo9726E();
        }

        /* renamed from: r */
        public final int mo9714r() throws IOException {
            return mo9723B();
        }

        /* renamed from: s */
        public final long mo9715s() throws IOException {
            return mo9724C();
        }

        /* renamed from: t */
        public final int mo9716t() throws IOException {
            return C2592i.m5901b(mo9725D());
        }

        /* renamed from: u */
        public final long mo9717u() throws IOException {
            return C2592i.m5902c(mo9726E());
        }

        /* renamed from: v */
        public final String mo9718v() throws IOException {
            int D = mo9725D();
            if (D > 0) {
                int i = this.f5891f;
                int i2 = this.f5893h;
                if (D <= i - i2) {
                    String str = new String(this.f5890e, i2, D, C2631w.f5973a);
                    this.f5893h += D;
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
        public final String mo9719w() throws IOException {
            int D = mo9725D();
            if (D > 0) {
                int i = this.f5891f;
                int i2 = this.f5893h;
                if (D <= i - i2) {
                    String a = Utf8.f5815a.mo9529a(i2, D, this.f5890e);
                    this.f5893h += D;
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
        public final int mo9720x() throws IOException {
            if (mo9702e()) {
                this.f5895j = 0;
                return 0;
            }
            int D = mo9725D();
            this.f5895j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo9721y() throws IOException {
            return mo9725D();
        }

        /* renamed from: z */
        public final long mo9722z() throws IOException {
            return mo9726E();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    public static final class C2594b extends C2592i {

        /* renamed from: e */
        public final InputStream f5897e;

        /* renamed from: f */
        public final byte[] f5898f;

        /* renamed from: g */
        public int f5899g;

        /* renamed from: h */
        public int f5900h;

        /* renamed from: i */
        public int f5901i;

        /* renamed from: j */
        public int f5902j;

        /* renamed from: k */
        public int f5903k;

        /* renamed from: l */
        public int f5904l = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C2594b(InputStream inputStream) {
            Charset charset = C2631w.f5973a;
            this.f5897e = inputStream;
            this.f5898f = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
            this.f5899g = 0;
            this.f5901i = 0;
            this.f5903k = 0;
        }

        /* renamed from: A */
        public final boolean mo9699A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f5899g - this.f5901i >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f5898f;
                        int i4 = this.f5901i;
                        this.f5901i = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    if (this.f5901i == this.f5899g) {
                        mo9738K(1);
                    }
                    byte[] bArr2 = this.f5898f;
                    int i5 = this.f5901i;
                    this.f5901i = i5 + 1;
                    if (bArr2[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            } else if (i2 == 1) {
                mo9739L(8);
                return true;
            } else if (i2 == 2) {
                mo9739L(mo9734G());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo9720x();
                    if (x == 0 || !mo9699A(x)) {
                        mo9700a(((i >>> 3) << 3) | 4);
                    }
                    x = mo9720x();
                    break;
                } while (!mo9699A(x));
                mo9700a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo9739L(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final byte[] mo9729B(int i) throws IOException {
            byte[] C = mo9730C(i);
            if (C != null) {
                return C;
            }
            int i2 = this.f5901i;
            int i3 = this.f5899g;
            int i4 = i3 - i2;
            this.f5903k += i3;
            this.f5901i = 0;
            this.f5899g = 0;
            ArrayList D = mo9731D(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f5898f, i2, bArr, 0, i4);
            Iterator it = D.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: C */
        public final byte[] mo9730C(int i) throws IOException {
            if (i == 0) {
                return C2631w.f5974b;
            }
            if (i >= 0) {
                int i2 = this.f5903k;
                int i3 = this.f5901i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f5888c <= 0) {
                    int i5 = this.f5904l;
                    if (i4 <= i5) {
                        int i6 = this.f5899g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f5897e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f5898f, this.f5901i, bArr, 0, i6);
                        this.f5903k += this.f5899g;
                        this.f5901i = 0;
                        this.f5899g = 0;
                        while (i6 < i) {
                            int read = this.f5897e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f5903k += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo9739L((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: D */
        public final ArrayList mo9731D(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f5897e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f5903k += read;
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
        public final int mo9732E() throws IOException {
            int i = this.f5901i;
            if (this.f5899g - i < 4) {
                mo9738K(4);
                i = this.f5901i;
            }
            byte[] bArr = this.f5898f;
            this.f5901i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: F */
        public final long mo9733F() throws IOException {
            int i = this.f5901i;
            if (this.f5899g - i < 8) {
                mo9738K(8);
                i = this.f5901i;
            }
            byte[] bArr = this.f5898f;
            this.f5901i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo9734G() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f5901i
                int r1 = r5.f5899g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f5898f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f5901i = r3
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
                long r0 = r5.mo9736I()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f5901i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2594b.mo9734G():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: H */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo9735H() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f5901i
                int r1 = r11.f5899g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f5898f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f5901i = r3
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
                long r0 = r11.mo9736I()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f5901i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2594b.mo9735H():long");
        }

        /* renamed from: I */
        public final long mo9736I() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f5901i == this.f5899g) {
                    mo9738K(1);
                }
                byte[] bArr = this.f5898f;
                int i2 = this.f5901i;
                this.f5901i = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: J */
        public final void mo9737J() {
            int i = this.f5899g + this.f5900h;
            this.f5899g = i;
            int i2 = this.f5903k + i;
            int i3 = this.f5904l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f5900h = i4;
                this.f5899g = i - i4;
                return;
            }
            this.f5900h = 0;
        }

        /* renamed from: K */
        public final void mo9738K(int i) throws IOException {
            if (mo9740M(i)) {
                return;
            }
            if (i > (this.f5888c - this.f5903k) - this.f5901i) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            throw new java.lang.IllegalStateException(r7.f5897e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9739L(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f5899g
                int r1 = r7.f5901i
                int r2 = r0 - r1
                if (r8 > r2) goto L_0x000f
                if (r8 < 0) goto L_0x000f
                int r1 = r1 + r8
                r7.f5901i = r1
                goto L_0x0092
            L_0x000f:
                if (r8 < 0) goto L_0x009d
                int r2 = r7.f5903k
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f5904l
                if (r4 > r5) goto L_0x0093
                r7.f5903k = r3
                int r0 = r0 - r1
                r1 = 0
                r7.f5899g = r1
                r7.f5901i = r1
            L_0x0023:
                if (r0 >= r8) goto L_0x006d
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f5897e     // Catch:{ all -> 0x0063 }
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
                java.io.InputStream r4 = r7.f5897e     // Catch:{ all -> 0x0063 }
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
                int r1 = r7.f5903k
                int r1 = r1 + r0
                r7.f5903k = r1
                r7.mo9737J()
                throw r8
            L_0x006d:
                int r1 = r7.f5903k
                int r1 = r1 + r0
                r7.f5903k = r1
                r7.mo9737J()
                if (r0 >= r8) goto L_0x0092
                int r0 = r7.f5899g
                int r1 = r7.f5901i
                int r1 = r0 - r1
                r7.f5901i = r0
                r0 = 1
                r7.mo9738K(r0)
            L_0x0083:
                int r2 = r8 - r1
                int r3 = r7.f5899g
                if (r2 <= r3) goto L_0x0090
                int r1 = r1 + r3
                r7.f5901i = r3
                r7.mo9738K(r0)
                goto L_0x0083
            L_0x0090:
                r7.f5901i = r2
            L_0x0092:
                return
            L_0x0093:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.mo9739L(r5)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r8
            L_0x009d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2594b.mo9739L(int):void");
        }

        /* renamed from: M */
        public final boolean mo9740M(int i) throws IOException {
            int i2 = this.f5901i;
            int i3 = i2 + i;
            int i4 = this.f5899g;
            if (i3 > i4) {
                int i5 = this.f5888c;
                int i6 = this.f5903k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f5904l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f5898f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f5903k += i2;
                    this.f5899g -= i2;
                    this.f5901i = 0;
                }
                InputStream inputStream = this.f5897e;
                byte[] bArr2 = this.f5898f;
                int i7 = this.f5899g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f5888c - this.f5903k) - i7));
                if (read == 0 || read < -1 || read > this.f5898f.length) {
                    throw new IllegalStateException(this.f5897e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f5899g += read;
                    mo9737J();
                    if (this.f5899g >= i) {
                        return true;
                    }
                    return mo9740M(i);
                }
            } else {
                throw new IllegalStateException(C0069a.m175f("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
        }

        /* renamed from: a */
        public final void mo9700a(int i) throws InvalidProtocolBufferException {
            if (this.f5902j != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo9701d() {
            return this.f5903k + this.f5901i;
        }

        /* renamed from: e */
        public final boolean mo9702e() throws IOException {
            return this.f5901i == this.f5899g && !mo9740M(1);
        }

        /* renamed from: g */
        public final void mo9703g(int i) {
            this.f5904l = i;
            mo9737J();
        }

        /* renamed from: h */
        public final int mo9704h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f5903k + this.f5901i + i;
                int i3 = this.f5904l;
                if (i2 <= i3) {
                    this.f5904l = i2;
                    mo9737J();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo9705i() throws IOException {
            return mo9735H() != 0;
        }

        /* renamed from: j */
        public final ByteString mo9706j() throws IOException {
            int G = mo9734G();
            int i = this.f5899g;
            int i2 = this.f5901i;
            if (G <= i - i2 && G > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f5898f, i2, G);
                this.f5901i += G;
                return copyFrom;
            } else if (G == 0) {
                return ByteString.EMPTY;
            } else {
                byte[] C = mo9730C(G);
                if (C != null) {
                    return ByteString.copyFrom(C);
                }
                int i3 = this.f5901i;
                int i4 = this.f5899g;
                int i5 = i4 - i3;
                this.f5903k += i4;
                this.f5901i = 0;
                this.f5899g = 0;
                ArrayList D = mo9731D(G - i5);
                byte[] bArr = new byte[G];
                System.arraycopy(this.f5898f, i3, bArr, 0, i5);
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
        public final double mo9707k() throws IOException {
            return Double.longBitsToDouble(mo9733F());
        }

        /* renamed from: l */
        public final int mo9708l() throws IOException {
            return mo9734G();
        }

        /* renamed from: m */
        public final int mo9709m() throws IOException {
            return mo9732E();
        }

        /* renamed from: n */
        public final long mo9710n() throws IOException {
            return mo9733F();
        }

        /* renamed from: o */
        public final float mo9711o() throws IOException {
            return Float.intBitsToFloat(mo9732E());
        }

        /* renamed from: p */
        public final int mo9712p() throws IOException {
            return mo9734G();
        }

        /* renamed from: q */
        public final long mo9713q() throws IOException {
            return mo9735H();
        }

        /* renamed from: r */
        public final int mo9714r() throws IOException {
            return mo9732E();
        }

        /* renamed from: s */
        public final long mo9715s() throws IOException {
            return mo9733F();
        }

        /* renamed from: t */
        public final int mo9716t() throws IOException {
            return C2592i.m5901b(mo9734G());
        }

        /* renamed from: u */
        public final long mo9717u() throws IOException {
            return C2592i.m5902c(mo9735H());
        }

        /* renamed from: v */
        public final String mo9718v() throws IOException {
            int G = mo9734G();
            if (G > 0) {
                int i = this.f5899g;
                int i2 = this.f5901i;
                if (G <= i - i2) {
                    String str = new String(this.f5898f, i2, G, C2631w.f5973a);
                    this.f5901i += G;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G > this.f5899g) {
                return new String(mo9729B(G), C2631w.f5973a);
            }
            mo9738K(G);
            String str2 = new String(this.f5898f, this.f5901i, G, C2631w.f5973a);
            this.f5901i += G;
            return str2;
        }

        /* renamed from: w */
        public final String mo9719w() throws IOException {
            byte[] bArr;
            byte[] bArr2;
            int G = mo9734G();
            int i = this.f5901i;
            int i2 = this.f5899g;
            if (G <= i2 - i && G > 0) {
                bArr = this.f5898f;
                this.f5901i = i + G;
            } else if (G == 0) {
                return "";
            } else {
                if (G <= i2) {
                    mo9738K(G);
                    bArr2 = this.f5898f;
                    this.f5901i = G + 0;
                } else {
                    bArr2 = mo9729B(G);
                }
                bArr = bArr2;
                i = 0;
            }
            return Utf8.f5815a.mo9529a(i, G, bArr);
        }

        /* renamed from: x */
        public final int mo9720x() throws IOException {
            if (mo9702e()) {
                this.f5902j = 0;
                return 0;
            }
            int G = mo9734G();
            this.f5902j = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo9721y() throws IOException {
            return mo9734G();
        }

        /* renamed from: z */
        public final long mo9722z() throws IOException {
            return mo9735H();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static final class C2595c extends C2592i {

        /* renamed from: e */
        public final ByteBuffer f5905e;

        /* renamed from: f */
        public final long f5906f;

        /* renamed from: g */
        public long f5907g;

        /* renamed from: h */
        public long f5908h;

        /* renamed from: i */
        public long f5909i;

        /* renamed from: j */
        public int f5910j;

        /* renamed from: k */
        public int f5911k;

        /* renamed from: l */
        public int f5912l = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public C2595c(ByteBuffer byteBuffer) {
            this.f5905e = byteBuffer;
            long k = C2586h1.f5879d.mo9693k(C2586h1.f5883h, byteBuffer);
            this.f5906f = k;
            this.f5907g = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f5908h = position;
            this.f5909i = position;
        }

        /* renamed from: A */
        public final boolean mo9699A(int i) throws IOException {
            int x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (((int) (this.f5907g - this.f5908h)) >= 10) {
                    while (i3 < 10) {
                        long j = this.f5908h;
                        this.f5908h = j + 1;
                        if (C2586h1.m5828g(j) < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i3 < 10) {
                    long j2 = this.f5908h;
                    if (j2 != this.f5907g) {
                        this.f5908h = j2 + 1;
                        if (C2586h1.m5828g(j2) < 0) {
                            i3++;
                        }
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            } else if (i2 == 1) {
                mo9747H(8);
                return true;
            } else if (i2 == 2) {
                mo9747H(mo9743D());
                return true;
            } else if (i2 == 3) {
                do {
                    x = mo9720x();
                    if (x == 0 || !mo9699A(x)) {
                        mo9700a(((i >>> 3) << 3) | 4);
                    }
                    x = mo9720x();
                    break;
                } while (!mo9699A(x));
                mo9700a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo9747H(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: B */
        public final int mo9741B() throws IOException {
            long j = this.f5908h;
            if (this.f5907g - j >= 4) {
                this.f5908h = 4 + j;
                return ((C2586h1.m5828g(j + 3) & 255) << 24) | (C2586h1.m5828g(j) & 255) | ((C2586h1.m5828g(1 + j) & 255) << 8) | ((C2586h1.m5828g(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public final long mo9742C() throws IOException {
            long j = this.f5908h;
            if (this.f5907g - j >= 8) {
                this.f5908h = 8 + j;
                return ((((long) C2586h1.m5828g(j + 7)) & 255) << 56) | (((long) C2586h1.m5828g(j)) & 255) | ((((long) C2586h1.m5828g(1 + j)) & 255) << 8) | ((((long) C2586h1.m5828g(2 + j)) & 255) << 16) | ((((long) C2586h1.m5828g(3 + j)) & 255) << 24) | ((((long) C2586h1.m5828g(4 + j)) & 255) << 32) | ((((long) C2586h1.m5828g(5 + j)) & 255) << 40) | ((((long) C2586h1.m5828g(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4) < 0) goto L_0x0085;
         */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo9743D() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f5908h
                long r2 = r10.f5907g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r0)
                if (r0 < 0) goto L_0x0017
                r10.f5908h = r4
                return r0
            L_0x0017:
                long r6 = r10.f5907g
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C2586h1.m5828g(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo9745F()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f5908h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2592i.C2595c.mo9743D():int");
        }

        /* renamed from: E */
        public final long mo9744E() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f5908h;
            if (this.f5907g != j4) {
                long j5 = j4 + 1;
                byte g = C2586h1.m5828g(j4);
                if (g >= 0) {
                    this.f5908h = j5;
                    return (long) g;
                } else if (this.f5907g - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte g2 = g ^ (C2586h1.m5828g(j5) << 7);
                    if (g2 < 0) {
                        b = g2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte g3 = g2 ^ (C2586h1.m5828g(j6) << 14);
                        if (g3 >= 0) {
                            j = (long) (g3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte g4 = g3 ^ (C2586h1.m5828g(j7) << 21);
                            if (g4 < 0) {
                                b = g4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long g5 = ((long) g4) ^ (((long) C2586h1.m5828g(j6)) << 28);
                                if (g5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long g6 = g5 ^ (((long) C2586h1.m5828g(j7)) << 35);
                                    if (g6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        g5 = g6 ^ (((long) C2586h1.m5828g(j8)) << 42);
                                        if (g5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            g6 = g5 ^ (((long) C2586h1.m5828g(j7)) << 49);
                                            if (g6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (g6 ^ (((long) C2586h1.m5828g(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C2586h1.m5828g(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f5908h = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = g6 ^ j2;
                                    j6 = j8;
                                    this.f5908h = j6;
                                    return j;
                                }
                                j = g5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f5908h = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f5908h = j6;
                    return j;
                }
            }
            return mo9745F();
        }

        /* renamed from: F */
        public final long mo9745F() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                long j2 = this.f5908h;
                if (j2 != this.f5907g) {
                    this.f5908h = 1 + j2;
                    byte g = C2586h1.m5828g(j2);
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
        public final void mo9746G() {
            long j = this.f5907g + ((long) this.f5910j);
            this.f5907g = j;
            int i = (int) (j - this.f5909i);
            int i2 = this.f5912l;
            if (i > i2) {
                int i3 = i - i2;
                this.f5910j = i3;
                this.f5907g = j - ((long) i3);
                return;
            }
            this.f5910j = 0;
        }

        /* renamed from: H */
        public final void mo9747H(int i) throws IOException {
            if (i >= 0) {
                long j = this.f5907g;
                long j2 = this.f5908h;
                if (i <= ((int) (j - j2))) {
                    this.f5908h = j2 + ((long) i);
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: a */
        public final void mo9700a(int i) throws InvalidProtocolBufferException {
            if (this.f5911k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public final int mo9701d() {
            return (int) (this.f5908h - this.f5909i);
        }

        /* renamed from: e */
        public final boolean mo9702e() throws IOException {
            return this.f5908h == this.f5907g;
        }

        /* renamed from: g */
        public final void mo9703g(int i) {
            this.f5912l = i;
            mo9746G();
        }

        /* renamed from: h */
        public final int mo9704h(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = mo9701d() + i;
                int i2 = this.f5912l;
                if (d <= i2) {
                    this.f5912l = d;
                    mo9746G();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: i */
        public final boolean mo9705i() throws IOException {
            return mo9744E() != 0;
        }

        /* renamed from: j */
        public final ByteString mo9706j() throws IOException {
            int D = mo9743D();
            if (D > 0) {
                long j = this.f5907g;
                long j2 = this.f5908h;
                if (D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[D];
                    long j3 = (long) D;
                    C2586h1.f5879d.mo9679c(j2, bArr, j3);
                    this.f5908h += j3;
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
        public final double mo9707k() throws IOException {
            return Double.longBitsToDouble(mo9742C());
        }

        /* renamed from: l */
        public final int mo9708l() throws IOException {
            return mo9743D();
        }

        /* renamed from: m */
        public final int mo9709m() throws IOException {
            return mo9741B();
        }

        /* renamed from: n */
        public final long mo9710n() throws IOException {
            return mo9742C();
        }

        /* renamed from: o */
        public final float mo9711o() throws IOException {
            return Float.intBitsToFloat(mo9741B());
        }

        /* renamed from: p */
        public final int mo9712p() throws IOException {
            return mo9743D();
        }

        /* renamed from: q */
        public final long mo9713q() throws IOException {
            return mo9744E();
        }

        /* renamed from: r */
        public final int mo9714r() throws IOException {
            return mo9741B();
        }

        /* renamed from: s */
        public final long mo9715s() throws IOException {
            return mo9742C();
        }

        /* renamed from: t */
        public final int mo9716t() throws IOException {
            return C2592i.m5901b(mo9743D());
        }

        /* renamed from: u */
        public final long mo9717u() throws IOException {
            return C2592i.m5902c(mo9744E());
        }

        /* renamed from: v */
        public final String mo9718v() throws IOException {
            int D = mo9743D();
            if (D > 0) {
                long j = this.f5907g;
                long j2 = this.f5908h;
                if (D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[D];
                    long j3 = (long) D;
                    C2586h1.f5879d.mo9679c(j2, bArr, j3);
                    String str = new String(bArr, C2631w.f5973a);
                    this.f5908h += j3;
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
        public final String mo9719w() throws IOException {
            int D = mo9743D();
            if (D > 0) {
                long j = this.f5907g;
                long j2 = this.f5908h;
                if (D <= ((int) (j - j2))) {
                    int i = (int) (j2 - this.f5906f);
                    ByteBuffer byteBuffer = this.f5905e;
                    Utf8.C2536b bVar = Utf8.f5815a;
                    bVar.getClass();
                    String a = byteBuffer.hasArray() ? bVar.mo9529a(byteBuffer.arrayOffset() + i, D, byteBuffer.array()) : byteBuffer.isDirect() ? bVar.mo9530c(byteBuffer, i, D) : Utf8.C2536b.m5650b(byteBuffer, i, D);
                    this.f5908h += (long) D;
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
        public final int mo9720x() throws IOException {
            if (mo9702e()) {
                this.f5911k = 0;
                return 0;
            }
            int D = mo9743D();
            this.f5911k = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: y */
        public final int mo9721y() throws IOException {
            return mo9743D();
        }

        /* renamed from: z */
        public final long mo9722z() throws IOException {
            return mo9744E();
        }
    }

    /* renamed from: b */
    public static int m5901b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m5902c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C2593a m5903f(byte[] bArr, int i, int i2, boolean z) {
        C2593a aVar = new C2593a(bArr, i, i2, z);
        try {
            aVar.mo9704h(i2);
            return aVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract boolean mo9699A(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo9700a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo9701d();

    /* renamed from: e */
    public abstract boolean mo9702e() throws IOException;

    /* renamed from: g */
    public abstract void mo9703g(int i);

    /* renamed from: h */
    public abstract int mo9704h(int i) throws InvalidProtocolBufferException;

    /* renamed from: i */
    public abstract boolean mo9705i() throws IOException;

    /* renamed from: j */
    public abstract ByteString mo9706j() throws IOException;

    /* renamed from: k */
    public abstract double mo9707k() throws IOException;

    /* renamed from: l */
    public abstract int mo9708l() throws IOException;

    /* renamed from: m */
    public abstract int mo9709m() throws IOException;

    /* renamed from: n */
    public abstract long mo9710n() throws IOException;

    /* renamed from: o */
    public abstract float mo9711o() throws IOException;

    /* renamed from: p */
    public abstract int mo9712p() throws IOException;

    /* renamed from: q */
    public abstract long mo9713q() throws IOException;

    /* renamed from: r */
    public abstract int mo9714r() throws IOException;

    /* renamed from: s */
    public abstract long mo9715s() throws IOException;

    /* renamed from: t */
    public abstract int mo9716t() throws IOException;

    /* renamed from: u */
    public abstract long mo9717u() throws IOException;

    /* renamed from: v */
    public abstract String mo9718v() throws IOException;

    /* renamed from: w */
    public abstract String mo9719w() throws IOException;

    /* renamed from: x */
    public abstract int mo9720x() throws IOException;

    /* renamed from: y */
    public abstract int mo9721y() throws IOException;

    /* renamed from: z */
    public abstract long mo9722z() throws IOException;
}
