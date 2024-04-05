package p756lr;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.support.p013v4.media.session.C0087d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.editable.EditableListing;
import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19446a;
import okio.ByteString;
import okio.SegmentedByteString;
import p003a2.C0015b;
import p568fn.C17782b;
import p758mr.C19918a;

/* renamed from: lr.f */
public final class C19893f implements C19897i, C19896h, Cloneable, ByteChannel {

    /* renamed from: b */
    public C19915y f43875b;

    /* renamed from: c */
    public long f43876c;

    /* renamed from: A */
    public final C19896h mo72706A() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef A[LOOP:0: B:67:0x00eb->B:69:0x00ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ff  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p756lr.C19893f mo72707A0(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r13 = 48
            r12.mo72771x0(r13)
            goto L_0x0111
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
            java.lang.String r13 = "-9223372036854775808"
            r12.mo72715G0(r13)
            goto L_0x0111
        L_0x001d:
            r3 = r4
        L_0x001e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0066
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003e
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
            goto L_0x00de
        L_0x003b:
            r4 = 2
            goto L_0x00de
        L_0x003e:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0046
            r2 = 3
            goto L_0x0092
        L_0x0046:
            r2 = 4
            goto L_0x0092
        L_0x0048:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0058
            r2 = 5
            goto L_0x0092
        L_0x0058:
            r2 = 6
            goto L_0x0092
        L_0x005a:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            r2 = 7
            goto L_0x0092
        L_0x0063:
            r2 = 8
            goto L_0x0092
        L_0x0066:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            r4 = 9
            goto L_0x00de
        L_0x0082:
            r4 = r5
            goto L_0x00de
        L_0x0084:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r2 = 11
            goto L_0x0092
        L_0x0090:
            r2 = 12
        L_0x0092:
            r4 = r2
            goto L_0x00de
        L_0x0094:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a9
            r4 = 13
            goto L_0x00de
        L_0x00a9:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b5
            r2 = 14
            goto L_0x0092
        L_0x00b5:
            r2 = 15
            goto L_0x0092
        L_0x00b8:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cd
            r4 = 16
            goto L_0x00de
        L_0x00cd:
            r4 = 17
            goto L_0x00de
        L_0x00d0:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dc
            r4 = 18
            goto L_0x00de
        L_0x00dc:
            r4 = 19
        L_0x00de:
            if (r3 == 0) goto L_0x00e2
            int r4 = r4 + 1
        L_0x00e2:
            lr.y r2 = r12.mo72729c0(r4)
            byte[] r6 = r2.f43920a
            int r7 = r2.f43922c
            int r7 = r7 + r4
        L_0x00eb:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00fd
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = p758mr.C19918a.f43933a
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00eb
        L_0x00fd:
            if (r3 == 0) goto L_0x0106
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0106:
            int r13 = r2.f43922c
            int r13 = r13 + r4
            r2.f43922c = r13
            long r13 = r12.f43876c
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.f43876c = r13
        L_0x0111:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19893f.mo72707A0(long):lr.f");
    }

    /* renamed from: B */
    public final String mo72708B() {
        return mo72770x(this.f43876c, C19446a.f43373b);
    }

    /* renamed from: B0 */
    public final C19893f mo72709B0(long j) {
        if (j == 0) {
            mo72771x0(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C19915y c0 = mo72729c0(i);
            byte[] bArr = c0.f43920a;
            int i2 = c0.f43922c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C19918a.f43933a[(int) (15 & j)];
                j >>>= 4;
            }
            c0.f43922c += i;
            this.f43876c += (long) i;
        }
        return this;
    }

    /* renamed from: C */
    public final String mo72710C(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long i = mo72740i(b, 0, j2);
            if (i != -1) {
                return C19918a.m34062b(this, i);
            }
            if (j2 < this.f43876c && mo72738h(j2 - 1) == ((byte) 13) && mo72738h(j2) == b) {
                return C19918a.m34062b(this, j2);
            }
            C19893f fVar = new C19893f();
            mo72735f(fVar, 0, Math.min((long) 32, this.f43876c));
            StringBuilder h = C0072d.m201h("\\n not found: limit=");
            h.append(Math.min(this.f43876c, j));
            h.append(" content=");
            h.append(fVar.mo72759t().hex());
            h.append(8230);
            throw new EOFException(h.toString());
        }
        throw new IllegalArgumentException(C0073e.m205e("limit < 0: ", j).toString());
    }

    /* renamed from: C0 */
    public final void mo72711C0(int i) {
        C19915y c0 = mo72729c0(4);
        byte[] bArr = c0.f43920a;
        int i2 = c0.f43922c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        c0.f43922c = i5 + 1;
        this.f43876c += 4;
    }

    /* renamed from: D0 */
    public final void mo72712D0(int i) {
        C19915y c0 = mo72729c0(2);
        byte[] bArr = c0.f43920a;
        int i2 = c0.f43922c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        c0.f43922c = i3 + 1;
        this.f43876c += 2;
    }

    /* renamed from: E0 */
    public final C19893f mo72713E0(String str, int i, int i2, Charset charset) {
        C19383o.m32797g(str, "string");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder h = C0069a.m177h("endIndex > string.length: ", i2, EditableListing.CATEGORY_PATH_JOIN_STRING);
                    h.append(str.length());
                    throw new IllegalArgumentException(h.toString().toString());
                } else if (C19383o.m32792b(charset, C19446a.f43373b)) {
                    mo72714F0(i, i2, str);
                    return this;
                } else {
                    String substring = str.substring(i, i2);
                    C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                    mo72736f0(0, bytes.length, bytes);
                    return this;
                }
            } else {
                throw new IllegalArgumentException(C0087d.m235e("endIndex < beginIndex: ", i2, " < ", i).toString());
            }
        } else {
            throw new IllegalArgumentException(C0015b.m88g("beginIndex < 0: ", i).toString());
        }
    }

    /* renamed from: F0 */
    public final void mo72714F0(int i, int i2, String str) {
        char charAt;
        C19383o.m32797g(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C19915y c0 = mo72729c0(1);
                            byte[] bArr = c0.f43920a;
                            int i3 = c0.f43922c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = c0.f43922c;
                                    int i6 = (i3 + i) - i5;
                                    c0.f43922c = i5 + i6;
                                    this.f43876c += (long) i6;
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = c0.f43922c;
                            int i62 = (i3 + i) - i52;
                            c0.f43922c = i52 + i62;
                            this.f43876c += (long) i62;
                        } else {
                            if (charAt2 < 2048) {
                                C19915y c02 = mo72729c0(2);
                                byte[] bArr2 = c02.f43920a;
                                int i7 = c02.f43922c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
                                c02.f43922c = i7 + 2;
                                this.f43876c += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C19915y c03 = mo72729c0(3);
                                byte[] bArr3 = c03.f43920a;
                                int i8 = c03.f43922c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
                                c03.f43922c = i8 + 3;
                                this.f43876c += 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo72771x0(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C19915y c04 = mo72729c0(4);
                                    byte[] bArr4 = c04.f43920a;
                                    int i11 = c04.f43922c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    c04.f43922c = i11 + 4;
                                    this.f43876c += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder h = C0069a.m177h("endIndex > string.length: ", i2, EditableListing.CATEGORY_PATH_JOIN_STRING);
                h.append(str.length());
                throw new IllegalArgumentException(h.toString().toString());
            }
            throw new IllegalArgumentException(C0087d.m235e("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0015b.m88g("beginIndex < 0: ", i).toString());
    }

    /* renamed from: G0 */
    public final void mo72715G0(String str) {
        C19383o.m32797g(str, "string");
        mo72714F0(0, str.length(), str);
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ C19896h mo72716H(String str) {
        mo72715G0(str);
        return this;
    }

    /* renamed from: H0 */
    public final void mo72717H0(int i) {
        String str;
        if (i < 128) {
            mo72771x0(i);
        } else if (i < 2048) {
            C19915y c0 = mo72729c0(2);
            byte[] bArr = c0.f43920a;
            int i2 = c0.f43922c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c0.f43922c = i2 + 2;
            this.f43876c += 2;
        } else if (55296 <= i && 57343 >= i) {
            mo72771x0(63);
        } else if (i < 65536) {
            C19915y c02 = mo72729c0(3);
            byte[] bArr2 = c02.f43920a;
            int i3 = c02.f43922c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c02.f43922c = i3 + 3;
            this.f43876c += 3;
        } else if (i <= 1114111) {
            C19915y c03 = mo72729c0(4);
            byte[] bArr3 = c03.f43920a;
            int i4 = c03.f43922c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c03.f43922c = i4 + 4;
            this.f43876c += 4;
        } else {
            StringBuilder h = C0072d.m201h("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = C19421p.f43323m;
                int i5 = 0;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i5 < 8 && cArr2[i5] == '0') {
                    i5++;
                }
                str = new String(cArr2, i5, 8 - i5);
            } else {
                str = "0";
            }
            h.append(str);
            throw new IllegalArgumentException(h.toString());
        }
    }

    /* renamed from: I */
    public final boolean mo72718I(long j, ByteString byteString) {
        C19383o.m32797g(byteString, "bytes");
        int size = byteString.size();
        if (j < 0 || size < 0 || this.f43876c - j < ((long) size) || byteString.size() - 0 < size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (mo72738h(((long) i) + j) != byteString.getByte(0 + i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "sink");
        if (j >= 0) {
            long j2 = this.f43876c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.mo68512O(this, j);
            return j;
        }
        throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
    }

    /* renamed from: L */
    public final String mo72719L() throws EOFException {
        return mo72710C(Long.MAX_VALUE);
    }

    /* renamed from: M */
    public final String mo72720M(long j) throws EOFException {
        return mo72770x(j, C19446a.f43373b);
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) {
        int i;
        C19915y yVar;
        C19383o.m32797g(fVar, "source");
        if (fVar != this) {
            C17782b.m29843I(fVar.f43876c, 0, j);
            while (j > 0) {
                C19915y yVar2 = fVar.f43875b;
                C19383o.m32794d(yVar2);
                int i2 = yVar2.f43922c;
                C19915y yVar3 = fVar.f43875b;
                C19383o.m32794d(yVar3);
                if (j < ((long) (i2 - yVar3.f43921b))) {
                    C19915y yVar4 = this.f43875b;
                    C19915y yVar5 = yVar4 != null ? yVar4.f43926g : null;
                    if (yVar5 != null && yVar5.f43924e) {
                        if ((((long) yVar5.f43922c) + j) - ((long) (yVar5.f43923d ? 0 : yVar5.f43921b)) <= ((long) 8192)) {
                            C19915y yVar6 = fVar.f43875b;
                            C19383o.m32794d(yVar6);
                            yVar6.mo72809d(yVar5, (int) j);
                            fVar.f43876c -= j;
                            this.f43876c += j;
                            return;
                        }
                    }
                    C19915y yVar7 = fVar.f43875b;
                    C19383o.m32794d(yVar7);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= yVar7.f43922c - yVar7.f43921b) {
                        if (i3 >= 1024) {
                            yVar = yVar7.mo72808c();
                        } else {
                            yVar = C19916z.m34046b();
                            byte[] bArr = yVar7.f43920a;
                            byte[] bArr2 = yVar.f43920a;
                            int i4 = yVar7.f43921b;
                            C19318k.m32601S0(bArr, 0, i4, bArr2, i4 + i3);
                        }
                        yVar.f43922c = yVar.f43921b + i3;
                        yVar7.f43921b += i3;
                        C19915y yVar8 = yVar7.f43926g;
                        C19383o.m32794d(yVar8);
                        yVar8.mo72807b(yVar);
                        fVar.f43875b = yVar;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C19915y yVar9 = fVar.f43875b;
                C19383o.m32794d(yVar9);
                long j2 = (long) (yVar9.f43922c - yVar9.f43921b);
                fVar.f43875b = yVar9.mo72806a();
                C19915y yVar10 = this.f43875b;
                if (yVar10 == null) {
                    this.f43875b = yVar9;
                    yVar9.f43926g = yVar9;
                    yVar9.f43925f = yVar9;
                } else {
                    C19915y yVar11 = yVar10.f43926g;
                    C19383o.m32794d(yVar11);
                    yVar11.mo72807b(yVar9);
                    C19915y yVar12 = yVar9.f43926g;
                    if (yVar12 != yVar9) {
                        C19383o.m32794d(yVar12);
                        if (yVar12.f43924e) {
                            int i5 = yVar9.f43922c - yVar9.f43921b;
                            C19915y yVar13 = yVar9.f43926g;
                            C19383o.m32794d(yVar13);
                            int i6 = 8192 - yVar13.f43922c;
                            C19915y yVar14 = yVar9.f43926g;
                            C19383o.m32794d(yVar14);
                            if (yVar14.f43923d) {
                                i = 0;
                            } else {
                                C19915y yVar15 = yVar9.f43926g;
                                C19383o.m32794d(yVar15);
                                i = yVar15.f43921b;
                            }
                            if (i5 <= i6 + i) {
                                C19915y yVar16 = yVar9.f43926g;
                                C19383o.m32794d(yVar16);
                                yVar9.mo72809d(yVar16, i5);
                                yVar9.mo72806a();
                                C19916z.m34045a(yVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f43876c -= j2;
                this.f43876c += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: Q */
    public final int mo72721Q() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f43876c != 0) {
            byte h = mo72738h(0);
            int i2 = 1;
            if ((h & 128) == 0) {
                b2 = h & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((h & 224) == 192) {
                b2 = h & 31;
                i = 2;
                b = 128;
            } else if ((h & 240) == 224) {
                b2 = h & 15;
                i = 3;
                b = 2048;
            } else if ((h & 248) == 240) {
                b2 = h & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f43876c >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte h2 = mo72738h(j2);
                    if ((h2 & 192) == 128) {
                        b2 = (b2 << 6) | (h2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder h3 = C0069a.m177h("size < ", i, ": ");
            h3.append(this.f43876c);
            h3.append(" (to read code point prefixed 0x");
            h3.append(C17782b.m29883r0(h));
            h3.append(')');
            throw new EOFException(h3.toString());
        }
        throw new EOFException();
    }

    /* renamed from: R */
    public final ByteString mo72722R(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        C17782b.m29843I(this.f43876c, 0, (long) i);
        C19915y yVar = this.f43875b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C19383o.m32794d(yVar);
            int i5 = yVar.f43922c;
            int i6 = yVar.f43921b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                yVar = yVar.f43925f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C19915y yVar2 = this.f43875b;
        int i7 = 0;
        while (i2 < i) {
            C19383o.m32794d(yVar2);
            bArr[i7] = yVar2.f43920a;
            i2 += yVar2.f43922c - yVar2.f43921b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yVar2.f43921b;
            yVar2.f43923d = true;
            i7++;
            yVar2 = yVar2.f43925f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    /* renamed from: U */
    public final void mo72723U(long j) throws EOFException {
        if (this.f43876c < j) {
            throw new EOFException();
        }
    }

    /* renamed from: V */
    public final /* bridge */ /* synthetic */ C19896h mo72724V(long j) {
        mo72707A0(j);
        return this;
    }

    /* renamed from: X */
    public final ByteString mo72725X(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount: ", j).toString());
        } else if (this.f43876c < j) {
            throw new EOFException();
        } else if (j < ((long) RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return new ByteString(mo72750r(j));
        } else {
            ByteString R = mo72722R((int) j);
            skip(j);
            return R;
        }
    }

    /* renamed from: a */
    public final void mo72726a() {
        skip(this.f43876c);
    }

    /* renamed from: b */
    public final C19893f clone() {
        C19893f fVar = new C19893f();
        if (this.f43876c != 0) {
            C19915y yVar = this.f43875b;
            C19383o.m32794d(yVar);
            C19915y c = yVar.mo72808c();
            fVar.f43875b = c;
            c.f43926g = c;
            c.f43925f = c;
            for (C19915y yVar2 = yVar.f43925f; yVar2 != yVar; yVar2 = yVar2.f43925f) {
                C19915y yVar3 = c.f43926g;
                C19383o.m32794d(yVar3);
                C19383o.m32794d(yVar2);
                yVar3.mo72807b(yVar2.mo72808c());
            }
            fVar.f43876c = this.f43876c;
        }
        return fVar;
    }

    /* renamed from: b0 */
    public final int mo72728b0(C19908t tVar) {
        C19383o.m32797g(tVar, ResponseConstants.OPTIONS);
        int c = C19918a.m34063c(this, tVar, false);
        if (c == -1) {
            return -1;
        }
        skip((long) tVar.f43903b[c].size());
        return c;
    }

    /* renamed from: c0 */
    public final C19915y mo72729c0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C19915y yVar = this.f43875b;
            if (yVar == null) {
                C19915y b = C19916z.m34046b();
                this.f43875b = b;
                b.f43926g = b;
                b.f43925f = b;
                return b;
            }
            C19915y yVar2 = yVar.f43926g;
            C19383o.m32794d(yVar2);
            if (yVar2.f43922c + i <= 8192 && yVar2.f43924e) {
                return yVar2;
            }
            C19915y b2 = C19916z.m34046b();
            yVar2.mo72807b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void close() {
    }

    /* renamed from: d */
    public final long mo72731d() {
        long j = this.f43876c;
        if (j == 0) {
            return 0;
        }
        C19915y yVar = this.f43875b;
        C19383o.m32794d(yVar);
        C19915y yVar2 = yVar.f43926g;
        C19383o.m32794d(yVar2);
        int i = yVar2.f43922c;
        if (i < 8192 && yVar2.f43924e) {
            j -= (long) (i - yVar2.f43921b);
        }
        return j;
    }

    /* renamed from: d0 */
    public final byte[] mo72732d0() {
        return mo72750r(this.f43876c);
    }

    /* renamed from: e0 */
    public final boolean mo72733e0() {
        return this.f43876c == 0;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof p756lr.C19893f
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f43876c
            lr.f r1 = (p756lr.C19893f) r1
            long r6 = r1.f43876c
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            lr.y r4 = r0.f43875b
            kotlin.jvm.internal.C19383o.m32794d(r4)
            lr.y r1 = r1.f43875b
            kotlin.jvm.internal.C19383o.m32794d(r1)
            int r5 = r4.f43921b
            int r8 = r1.f43921b
            r9 = r6
        L_0x0032:
            long r11 = r0.f43876c
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f43922c
            int r11 = r11 - r5
            int r12 = r1.f43922c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f43920a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f43920a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f43922c
            if (r5 != r13) goto L_0x006b
            lr.y r4 = r4.f43925f
            kotlin.jvm.internal.C19383o.m32794d(r4)
            int r5 = r4.f43921b
        L_0x006b:
            int r13 = r1.f43922c
            if (r8 != r13) goto L_0x0076
            lr.y r1 = r1.f43925f
            kotlin.jvm.internal.C19383o.m32794d(r1)
            int r8 = r1.f43921b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19893f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void mo72735f(C19893f fVar, long j, long j2) {
        C19383o.m32797g(fVar, "out");
        C17782b.m29843I(this.f43876c, j, j2);
        if (j2 != 0) {
            fVar.f43876c += j2;
            C19915y yVar = this.f43875b;
            while (true) {
                C19383o.m32794d(yVar);
                long j3 = (long) (yVar.f43922c - yVar.f43921b);
                if (j < j3) {
                    break;
                }
                j -= j3;
                yVar = yVar.f43925f;
            }
            while (j2 > 0) {
                C19383o.m32794d(yVar);
                C19915y c = yVar.mo72808c();
                int i = c.f43921b + ((int) j);
                c.f43921b = i;
                c.f43922c = Math.min(i + ((int) j2), c.f43922c);
                C19915y yVar2 = fVar.f43875b;
                if (yVar2 == null) {
                    c.f43926g = c;
                    c.f43925f = c;
                    fVar.f43875b = c;
                } else {
                    C19915y yVar3 = yVar2.f43926g;
                    C19383o.m32794d(yVar3);
                    yVar3.mo72807b(c);
                }
                j2 -= (long) (c.f43922c - c.f43921b);
                yVar = yVar.f43925f;
                j = 0;
            }
        }
    }

    /* renamed from: f0 */
    public final void mo72736f0(int i, int i2, byte[] bArr) {
        C19383o.m32797g(bArr, "source");
        long j = (long) i2;
        C17782b.m29843I((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C19915y c0 = mo72729c0(1);
            int min = Math.min(i3 - i, 8192 - c0.f43922c);
            int i4 = i + min;
            C19318k.m32601S0(bArr, c0.f43922c, i, c0.f43920a, i4);
            c0.f43922c += min;
            i = i4;
        }
        this.f43876c += j;
    }

    public final void flush() {
    }

    /* renamed from: g0 */
    public final long mo72737g0(C19896h hVar) throws IOException {
        C19383o.m32797g(hVar, "sink");
        long j = this.f43876c;
        if (j > 0) {
            hVar.mo68512O(this, j);
        }
        return j;
    }

    /* renamed from: h */
    public final byte mo72738h(long j) {
        C17782b.m29843I(this.f43876c, j, 1);
        C19915y yVar = this.f43875b;
        if (yVar != null) {
            long j2 = this.f43876c;
            if (j2 - j < j) {
                while (j2 > j) {
                    yVar = yVar.f43926g;
                    C19383o.m32794d(yVar);
                    j2 -= (long) (yVar.f43922c - yVar.f43921b);
                }
                return yVar.f43920a[(int) ((((long) yVar.f43921b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = yVar.f43922c;
                int i2 = yVar.f43921b;
                long j4 = ((long) (i - i2)) + j3;
                if (j4 > j) {
                    return yVar.f43920a[(int) ((((long) i2) + j) - j3)];
                }
                yVar = yVar.f43925f;
                C19383o.m32794d(yVar);
                j3 = j4;
            }
        } else {
            C19383o.m32794d((Object) null);
            throw null;
        }
    }

    public final int hashCode() {
        C19915y yVar = this.f43875b;
        if (yVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yVar.f43922c;
            for (int i3 = yVar.f43921b; i3 < i2; i3++) {
                i = (i * 31) + yVar.f43920a[i3];
            }
            yVar = yVar.f43925f;
            C19383o.m32794d(yVar);
        } while (yVar != this.f43875b);
        return i;
    }

    /* renamed from: i */
    public final long mo72740i(byte b, long j, long j2) {
        C19915y yVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.f43876c;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (yVar = this.f43875b) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        yVar = yVar.f43926g;
                        C19383o.m32794d(yVar);
                        j4 -= (long) (yVar.f43922c - yVar.f43921b);
                    }
                    while (j4 < j2) {
                        byte[] bArr = yVar.f43920a;
                        int min = (int) Math.min((long) yVar.f43922c, (((long) yVar.f43921b) + j2) - j4);
                        for (int i = (int) ((((long) yVar.f43921b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - yVar.f43921b)) + j4;
                            }
                        }
                        j4 += (long) (yVar.f43922c - yVar.f43921b);
                        yVar = yVar.f43925f;
                        C19383o.m32794d(yVar);
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (yVar.f43922c - yVar.f43921b)) + j3;
                        if (j5 > j) {
                            break;
                        }
                        yVar = yVar.f43925f;
                        C19383o.m32794d(yVar);
                        j3 = j5;
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = yVar.f43920a;
                        int min2 = (int) Math.min((long) yVar.f43922c, (((long) yVar.f43921b) + j2) - j3);
                        for (int i2 = (int) ((((long) yVar.f43921b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - yVar.f43921b)) + j3;
                            }
                        }
                        j3 += (long) (yVar.f43922c - yVar.f43921b);
                        yVar = yVar.f43925f;
                        C19383o.m32794d(yVar);
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder h = C0072d.m201h("size=");
        h.append(this.f43876c);
        h.append(" fromIndex=");
        h.append(j);
        h.append(" toIndex=");
        h.append(j2);
        throw new IllegalArgumentException(h.toString().toString());
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final long mo72742j(long j, ByteString byteString) throws IOException {
        long j2 = j;
        C19383o.m32797g(byteString, "bytes");
        boolean z = true;
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                C19915y yVar = this.f43875b;
                if (yVar != null) {
                    long j4 = this.f43876c;
                    if (j4 - j2 < j2) {
                        while (j4 > j2) {
                            yVar = yVar.f43926g;
                            C19383o.m32794d(yVar);
                            j4 -= (long) (yVar.f43922c - yVar.f43921b);
                        }
                        byte[] internalArray$okio = byteString.internalArray$okio();
                        byte b = internalArray$okio[0];
                        int size = byteString.size();
                        long j5 = (this.f43876c - ((long) size)) + 1;
                        while (j4 < j5) {
                            byte[] bArr = yVar.f43920a;
                            long j6 = j5;
                            int min = (int) Math.min((long) yVar.f43922c, (((long) yVar.f43921b) + j5) - j4);
                            for (int i = (int) ((((long) yVar.f43921b) + j2) - j4); i < min; i++) {
                                if (bArr[i] == b && C19918a.m34061a(yVar, i + 1, internalArray$okio, size)) {
                                    return ((long) (i - yVar.f43921b)) + j4;
                                }
                            }
                            j4 += (long) (yVar.f43922c - yVar.f43921b);
                            yVar = yVar.f43925f;
                            C19383o.m32794d(yVar);
                            j2 = j4;
                            j5 = j6;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (yVar.f43922c - yVar.f43921b)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            yVar = yVar.f43925f;
                            C19383o.m32794d(yVar);
                            j3 = j7;
                        }
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        byte b2 = internalArray$okio2[0];
                        int size2 = byteString.size();
                        long j8 = (this.f43876c - ((long) size2)) + 1;
                        while (j3 < j8) {
                            byte[] bArr2 = yVar.f43920a;
                            long j9 = j8;
                            int min2 = (int) Math.min((long) yVar.f43922c, (((long) yVar.f43921b) + j8) - j3);
                            for (int i2 = (int) ((((long) yVar.f43921b) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C19918a.m34061a(yVar, i2 + 1, internalArray$okio2, size2)) {
                                    return ((long) (i2 - yVar.f43921b)) + j3;
                                }
                            }
                            j3 += (long) (yVar.f43922c - yVar.f43921b);
                            yVar = yVar.f43925f;
                            C19383o.m32794d(yVar);
                            j2 = j3;
                            j8 = j9;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(C0073e.m205e("fromIndex < 0: ", j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: k */
    public final long mo72743k(long j, ByteString byteString) {
        int i;
        int i2;
        int i3;
        int i4;
        C19383o.m32797g(byteString, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            C19915y yVar = this.f43875b;
            if (yVar == null) {
                return -1;
            }
            long j3 = this.f43876c;
            if (j3 - j < j) {
                while (j3 > j) {
                    yVar = yVar.f43926g;
                    C19383o.m32794d(yVar);
                    j3 -= (long) (yVar.f43922c - yVar.f43921b);
                }
                if (byteString.size() == 2) {
                    byte b = byteString.getByte(0);
                    byte b2 = byteString.getByte(1);
                    while (j3 < this.f43876c) {
                        byte[] bArr = yVar.f43920a;
                        i4 = (int) ((((long) yVar.f43921b) + j) - j3);
                        int i5 = yVar.f43922c;
                        while (i4 < i5) {
                            byte b3 = bArr[i4];
                            if (b3 == b || b3 == b2) {
                                i3 = yVar.f43921b;
                            } else {
                                i4++;
                            }
                        }
                        j3 += (long) (yVar.f43922c - yVar.f43921b);
                        yVar = yVar.f43925f;
                        C19383o.m32794d(yVar);
                        j = j3;
                    }
                    return -1;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j3 < this.f43876c) {
                    byte[] bArr2 = yVar.f43920a;
                    int i6 = (int) ((((long) yVar.f43921b) + j) - j3);
                    int i7 = yVar.f43922c;
                    while (i4 < i7) {
                        byte b4 = bArr2[i4];
                        int length = internalArray$okio.length;
                        int i8 = 0;
                        while (i8 < length) {
                            if (b4 == internalArray$okio[i8]) {
                                i3 = yVar.f43921b;
                            } else {
                                i8++;
                            }
                        }
                        i6 = i4 + 1;
                    }
                    j3 += (long) (yVar.f43922c - yVar.f43921b);
                    yVar = yVar.f43925f;
                    C19383o.m32794d(yVar);
                    j = j3;
                }
                return -1;
                return ((long) (i4 - i3)) + j3;
            }
            while (true) {
                long j4 = ((long) (yVar.f43922c - yVar.f43921b)) + j2;
                if (j4 > j) {
                    break;
                }
                yVar = yVar.f43925f;
                C19383o.m32794d(yVar);
                j2 = j4;
            }
            if (byteString.size() == 2) {
                byte b5 = byteString.getByte(0);
                byte b6 = byteString.getByte(1);
                while (j2 < this.f43876c) {
                    byte[] bArr3 = yVar.f43920a;
                    i2 = (int) ((((long) yVar.f43921b) + j) - j2);
                    int i9 = yVar.f43922c;
                    while (i2 < i9) {
                        byte b7 = bArr3[i2];
                        if (b7 == b5 || b7 == b6) {
                            i = yVar.f43921b;
                        } else {
                            i2++;
                        }
                    }
                    j2 += (long) (yVar.f43922c - yVar.f43921b);
                    yVar = yVar.f43925f;
                    C19383o.m32794d(yVar);
                    j = j2;
                }
                return -1;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < this.f43876c) {
                byte[] bArr4 = yVar.f43920a;
                int i10 = (int) ((((long) yVar.f43921b) + j) - j2);
                int i11 = yVar.f43922c;
                while (i2 < i11) {
                    byte b8 = bArr4[i2];
                    int length2 = internalArray$okio2.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        if (b8 == internalArray$okio2[i12]) {
                            i = yVar.f43921b;
                        } else {
                            i12++;
                        }
                    }
                    i10 = i2 + 1;
                }
                j2 += (long) (yVar.f43922c - yVar.f43921b);
                yVar = yVar.f43925f;
                C19383o.m32794d(yVar);
                j = j2;
            }
            return -1;
            return ((long) (i2 - i)) + j2;
        }
        throw new IllegalArgumentException(C0073e.m205e("fromIndex < 0: ", j).toString());
    }

    /* renamed from: k0 */
    public final String mo72744k0(Charset charset) {
        return mo72770x(this.f43876c, charset);
    }

    /* renamed from: l */
    public final C19893f mo72745l() {
        return this;
    }

    /* renamed from: l0 */
    public final /* bridge */ /* synthetic */ C19896h mo72746l0(long j) {
        mo72709B0(j);
        return this;
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return C19890d0.f43871d;
    }

    /* renamed from: m0 */
    public final void mo72747m0(ByteString byteString) {
        C19383o.m32797g(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
    }

    /* renamed from: o0 */
    public final /* bridge */ /* synthetic */ C19896h mo72748o0(int i, int i2, String str) {
        mo72714F0(i, i2, str);
        return this;
    }

    public final C19913x peek() {
        return C19906r.m33998b(new C19911v(this));
    }

    /* renamed from: r */
    public final byte[] mo72750r(long j) throws EOFException {
        int i = 0;
        if (!(j >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount: ", j).toString());
        } else if (this.f43876c >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        C19383o.m32797g(byteBuffer, "sink");
        C19915y yVar = this.f43875b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.f43922c - yVar.f43921b);
        byteBuffer.put(yVar.f43920a, yVar.f43921b, min);
        int i = yVar.f43921b + min;
        yVar.f43921b = i;
        this.f43876c -= (long) min;
        if (i == yVar.f43922c) {
            this.f43875b = yVar.mo72806a();
            C19916z.m34045a(yVar);
        }
        return min;
    }

    public final byte readByte() throws EOFException {
        if (this.f43876c != 0) {
            C19915y yVar = this.f43875b;
            C19383o.m32794d(yVar);
            int i = yVar.f43921b;
            int i2 = yVar.f43922c;
            int i3 = i + 1;
            byte b = yVar.f43920a[i];
            this.f43876c--;
            if (i3 == i2) {
                this.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            } else {
                yVar.f43921b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final int readInt() throws EOFException {
        if (this.f43876c >= 4) {
            C19915y yVar = this.f43875b;
            C19383o.m32794d(yVar);
            int i = yVar.f43921b;
            int i2 = yVar.f43922c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = yVar.f43920a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f43876c -= 4;
            if (i6 == i2) {
                this.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            } else {
                yVar.f43921b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final short readShort() throws EOFException {
        if (this.f43876c >= 2) {
            C19915y yVar = this.f43875b;
            C19383o.m32794d(yVar);
            int i = yVar.f43921b;
            int i2 = yVar.f43922c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = yVar.f43920a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f43876c -= 2;
            if (i4 == i2) {
                this.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            } else {
                yVar.f43921b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public final boolean request(long j) {
        return this.f43876c >= j;
    }

    /* renamed from: s0 */
    public final /* bridge */ /* synthetic */ C19896h mo72757s0(ByteString byteString) {
        mo72747m0(byteString);
        return this;
    }

    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C19915y yVar = this.f43875b;
            if (yVar != null) {
                int min = (int) Math.min(j, (long) (yVar.f43922c - yVar.f43921b));
                long j2 = (long) min;
                this.f43876c -= j2;
                j -= j2;
                int i = yVar.f43921b + min;
                yVar.f43921b = i;
                if (i == yVar.f43922c) {
                    this.f43875b = yVar.mo72806a();
                    C19916z.m34045a(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final ByteString mo72759t() {
        return mo72725X(this.f43876c);
    }

    public final String toString() {
        long j = this.f43876c;
        if (j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return mo72722R((int) j).toString();
        }
        StringBuilder h = C0072d.m201h("size > Int.MAX_VALUE: ");
        h.append(this.f43876c);
        throw new IllegalStateException(h.toString().toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r10 != r11) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        r0.f43875b = r15.mo72806a();
        p756lr.C19916z.m34045a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        r15.f43921b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r6 != false) goto L_0x00b2;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo72761u() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f43876c
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00bd
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x000f:
            lr.y r8 = r0.f43875b
            kotlin.jvm.internal.C19383o.m32794d(r8)
            byte[] r9 = r8.f43920a
            int r10 = r8.f43921b
            int r11 = r8.f43922c
        L_0x001a:
            r12 = 1
            if (r10 >= r11) goto L_0x009c
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x006b
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x006b
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0044
            r15 = r8
            r16 = r9
            if (r12 != 0) goto L_0x003e
            long r8 = (long) r14
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r8 = 10
            long r3 = r3 * r8
            long r8 = (long) r14
            long r3 = r3 + r8
            goto L_0x0079
        L_0x0044:
            lr.f r1 = new lr.f
            r1.<init>()
            r1.mo72707A0(r3)
            r1.mo72771x0(r13)
            if (r7 != 0) goto L_0x0054
            r1.readByte()
        L_0x0054:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String r1 = r1.mo72708B()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006b:
            r15 = r8
            r16 = r9
            r8 = 45
            byte r8 = (byte) r8
            if (r13 != r8) goto L_0x0081
            if (r5 != 0) goto L_0x0081
            r7 = 1
            long r1 = r1 - r7
            r7 = r12
        L_0x0079:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r8 = r15
            r9 = r16
            goto L_0x001a
        L_0x0081:
            if (r5 == 0) goto L_0x0085
            r6 = r12
            goto L_0x009d
        L_0x0085:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = p568fn.C17782b.m29883r0(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009c:
            r15 = r8
        L_0x009d:
            if (r10 != r11) goto L_0x00a9
            lr.y r8 = r15.mo72806a()
            r0.f43875b = r8
            p756lr.C19916z.m34045a(r15)
            goto L_0x00ac
        L_0x00a9:
            r8 = r15
            r8.f43921b = r10
        L_0x00ac:
            if (r6 != 0) goto L_0x00b2
            lr.y r8 = r0.f43875b
            if (r8 != 0) goto L_0x000f
        L_0x00b2:
            long r1 = r0.f43876c
            long r5 = (long) r5
            long r1 = r1 - r5
            r0.f43876c = r1
            if (r7 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            long r3 = -r3
        L_0x00bc:
            return r3
        L_0x00bd:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19893f.mo72761u():long");
    }

    /* renamed from: v0 */
    public final /* bridge */ /* synthetic */ C19896h mo72762v0(int i, int i2, byte[] bArr) {
        mo72736f0(i, i2, bArr);
        return this;
    }

    /* renamed from: w */
    public final long mo72763w(ByteString byteString) throws IOException {
        C19383o.m32797g(byteString, "bytes");
        return mo72742j(0, byteString);
    }

    /* renamed from: w0 */
    public final long mo72764w0(C19888c0 c0Var) throws IOException {
        C19383o.m32797g(c0Var, "source");
        long j = 0;
        while (true) {
            long J = c0Var.mo68544J(this, (long) 8192);
            if (J == -1) {
                return j;
            }
            j += J;
        }
    }

    public final /* bridge */ /* synthetic */ C19896h writeByte(int i) {
        mo72771x0(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ C19896h writeInt(int i) {
        mo72711C0(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ C19896h writeShort(int i) {
        mo72712D0(i);
        return this;
    }

    /* renamed from: x */
    public final String mo72770x(long j, Charset charset) throws EOFException {
        C19383o.m32797g(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(C0073e.m205e("byteCount: ", j).toString());
        } else if (this.f43876c < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C19915y yVar = this.f43875b;
            C19383o.m32794d(yVar);
            int i2 = yVar.f43921b;
            if (((long) i2) + j > ((long) yVar.f43922c)) {
                return new String(mo72750r(j), charset);
            }
            int i3 = (int) j;
            String str = new String(yVar.f43920a, i2, i3, charset);
            int i4 = yVar.f43921b + i3;
            yVar.f43921b = i4;
            this.f43876c -= j;
            if (i4 == yVar.f43922c) {
                this.f43875b = yVar.mo72806a();
                C19916z.m34045a(yVar);
            }
            return str;
        }
    }

    /* renamed from: x0 */
    public final void mo72771x0(int i) {
        C19915y c0 = mo72729c0(1);
        byte[] bArr = c0.f43920a;
        int i2 = c0.f43922c;
        c0.f43922c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f43876c++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r8 != r9) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r14.f43875b = r6.mo72806a();
        p756lr.C19916z.m34045a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r6.f43921b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076 A[SYNTHETIC] */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo72772y0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.f43876c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            lr.y r6 = r14.f43875b
            kotlin.jvm.internal.C19383o.m32794d(r6)
            byte[] r7 = r6.f43920a
            int r8 = r6.f43921b
            int r9 = r6.f43922c
        L_0x0016:
            if (r8 >= r9) goto L_0x008d
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0072
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0072
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            lr.f r0 = new lr.f
            r0.<init>()
            r0.mo72709B0(r4)
            r0.mo72771x0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r0 = r0.mo72708B()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x008d
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r2 = p568fn.C17782b.m29883r0(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r8 != r9) goto L_0x0099
            lr.y r7 = r6.mo72806a()
            r14.f43875b = r7
            p756lr.C19916z.m34045a(r6)
            goto L_0x009b
        L_0x0099:
            r6.f43921b = r8
        L_0x009b:
            if (r1 != 0) goto L_0x00a1
            lr.y r6 = r14.f43875b
            if (r6 != 0) goto L_0x000b
        L_0x00a1:
            long r1 = r14.f43876c
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f43876c = r1
            return r4
        L_0x00a8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19893f.mo72772y0():long");
    }

    /* renamed from: z */
    public final long mo72773z(ByteString byteString) {
        C19383o.m32797g(byteString, "targetBytes");
        return mo72743k(0, byteString);
    }

    /* renamed from: z0 */
    public final InputStream mo72774z0() {
        return new C19894a(this);
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        C19383o.m32797g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C19915y c0 = mo72729c0(1);
            int min = Math.min(i, 8192 - c0.f43922c);
            byteBuffer.get(c0.f43920a, c0.f43922c, min);
            i -= min;
            c0.f43922c += min;
        }
        this.f43876c += (long) remaining;
        return remaining;
    }

    /* renamed from: lr.f$a */
    public static final class C19894a extends InputStream {

        /* renamed from: b */
        public final /* synthetic */ C19893f f43877b;

        public C19894a(C19893f fVar) {
            this.f43877b = fVar;
        }

        public final int available() {
            return (int) Math.min(this.f43877b.f43876c, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final void close() {
        }

        public final int read() {
            C19893f fVar = this.f43877b;
            if (fVar.f43876c > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f43877b + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i2) {
            C19383o.m32797g(bArr, "sink");
            return this.f43877b.read(bArr, i, i2);
        }
    }

    public final void write(byte[] bArr) {
        C19383o.m32797g(bArr, "source");
        mo72736f0(0, bArr.length, bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        C19383o.m32797g(bArr, "sink");
        C17782b.m29843I((long) bArr.length, (long) i, (long) i2);
        C19915y yVar = this.f43875b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i2, yVar.f43922c - yVar.f43921b);
        byte[] bArr2 = yVar.f43920a;
        int i3 = yVar.f43921b;
        C19318k.m32601S0(bArr2, i, i3, bArr, i3 + min);
        int i4 = yVar.f43921b + min;
        yVar.f43921b = i4;
        this.f43876c -= (long) min;
        if (i4 != yVar.f43922c) {
            return min;
        }
        this.f43875b = yVar.mo72806a();
        C19916z.m34045a(yVar);
        return min;
    }
}
