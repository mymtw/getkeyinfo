package p725zh;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import p003a2.C0023f;
import p513bj.C14049b0;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18368v;

/* renamed from: zh.a */
public final class C18898a implements C18349h {

    /* renamed from: a */
    public C18351j f42077a;

    /* renamed from: b */
    public C18368v f42078b;

    /* renamed from: c */
    public C18900b f42079c;

    /* renamed from: d */
    public int f42080d = -1;

    /* renamed from: e */
    public long f42081e = -1;

    /* renamed from: zh.a$a */
    public static final class C18899a implements C18900b {

        /* renamed from: m */
        public static final int[] f42082m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f42083n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final C18351j f42084a;

        /* renamed from: b */
        public final C18368v f42085b;

        /* renamed from: c */
        public final C18902b f42086c;

        /* renamed from: d */
        public final int f42087d;

        /* renamed from: e */
        public final byte[] f42088e;

        /* renamed from: f */
        public final C14077r f42089f;

        /* renamed from: g */
        public final int f42090g;

        /* renamed from: h */
        public final Format f42091h;

        /* renamed from: i */
        public int f42092i;

        /* renamed from: j */
        public long f42093j;

        /* renamed from: k */
        public int f42094k;

        /* renamed from: l */
        public long f42095l;

        public C18899a(C18351j jVar, C18368v vVar, C18902b bVar) throws ParserException {
            this.f42084a = jVar;
            this.f42085b = vVar;
            this.f42086c = bVar;
            int max = Math.max(1, bVar.f42106c / 10);
            this.f42090g = max;
            byte[] bArr = bVar.f42109f;
            int length = bArr.length;
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f42087d = b3;
            int i = bVar.f42105b;
            int i2 = bVar.f42107d;
            int i3 = (((i2 - (i * 4)) * 8) / (bVar.f42108e * i)) + 1;
            if (b3 == i3) {
                int i4 = C14049b0.f30913a;
                int i5 = ((max + b3) - 1) / b3;
                this.f42088e = new byte[(i2 * i5)];
                this.f42089f = new C14077r(b3 * 2 * i * i5);
                int i6 = bVar.f42106c;
                int i7 = ((bVar.f42107d * i6) * 8) / b3;
                Format.C14176b bVar2 = new Format.C14176b();
                bVar2.f31303k = "audio/raw";
                bVar2.f31298f = i7;
                bVar2.f31299g = i7;
                bVar2.f31304l = max * 2 * i;
                bVar2.f31316x = bVar.f42105b;
                bVar2.f31317y = i6;
                bVar2.f31318z = 2;
                this.f42091h = bVar2.mo47144a();
                return;
            }
            throw new ParserException(C0023f.m107h(56, "Expected frames per block: ", i3, "; got: ", b3));
        }

        /* renamed from: a */
        public final void mo70328a(int i, long j) {
            this.f42084a.mo4162l(new C18905d(this.f42086c, this.f42087d, (long) i, j));
            this.f42085b.mo47752a(this.f42091h);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x004a A[EDGE_INSN: B:40:0x004a->B:11:0x004a ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x002c  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo70329b(p644ph.C18346e r21, long r22) throws java.io.IOException {
            /*
                r20 = this;
                r0 = r20
                int r1 = r0.f42090g
                int r2 = r0.f42094k
                zh.b r3 = r0.f42086c
                int r4 = r3.f42105b
                int r4 = r4 * 2
                int r2 = r2 / r4
                int r1 = r1 - r2
                int r2 = r0.f42087d
                int r4 = p513bj.C14049b0.f30913a
                int r1 = r1 + r2
                r4 = -1
                int r1 = r1 + r4
                int r1 = r1 / r2
                int r2 = r3.f42107d
                int r1 = r1 * r2
                r2 = 0
                int r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
                r6 = r22
                r9 = r0
                if (r2 != 0) goto L_0x0026
                r2 = r1
                r1 = r21
                goto L_0x0042
            L_0x0026:
                r2 = r1
                r8 = 0
                r1 = r21
            L_0x002a:
                if (r8 != 0) goto L_0x004a
                int r10 = r9.f42092i
                if (r10 >= r2) goto L_0x004a
                int r10 = r2 - r10
                long r10 = (long) r10
                long r10 = java.lang.Math.min(r10, r6)
                int r10 = (int) r10
                byte[] r11 = r9.f42088e
                int r12 = r9.f42092i
                int r10 = r1.read(r11, r12, r10)
                if (r10 != r4) goto L_0x0044
            L_0x0042:
                r8 = 1
                goto L_0x002a
            L_0x0044:
                int r11 = r9.f42092i
                int r11 = r11 + r10
                r9.f42092i = r11
                goto L_0x002a
            L_0x004a:
                int r1 = r9.f42092i
                zh.b r2 = r9.f42086c
                int r2 = r2.f42107d
                int r1 = r1 / r2
                if (r1 <= 0) goto L_0x0152
                byte[] r2 = r9.f42088e
                bj.r r4 = r9.f42089f
                r6 = 0
            L_0x0058:
                if (r6 >= r1) goto L_0x011b
                r7 = 0
            L_0x005b:
                zh.b r10 = r9.f42086c
                int r11 = r10.f42105b
                if (r7 >= r11) goto L_0x0111
                byte[] r12 = r4.f30986a
                int r10 = r10.f42107d
                int r13 = r6 * r10
                int r14 = r7 * 4
                int r14 = r14 + r13
                int r13 = r11 * 4
                int r13 = r13 + r14
                int r10 = r10 / r11
                int r10 = r10 + -4
                int r15 = r14 + 1
                byte r15 = r2[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 8
                byte r3 = r2[r14]
                r3 = r3 & 255(0xff, float:3.57E-43)
                r3 = r3 | r15
                short r3 = (short) r3
                int r14 = r14 + 2
                byte r14 = r2[r14]
                r14 = r14 & 255(0xff, float:3.57E-43)
                r15 = 88
                int r14 = java.lang.Math.min(r14, r15)
                int[] r16 = f42083n
                r16 = r16[r14]
                int r15 = r9.f42087d
                int r15 = r15 * r6
                int r15 = r15 * r11
                int r15 = r15 + r7
                int r15 = r15 * 2
                r5 = r3 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r12[r15] = r5
                int r5 = r15 + 1
                int r0 = r3 >> 8
                byte r0 = (byte) r0
                r12[r5] = r0
                r0 = 0
            L_0x00a2:
                int r5 = r10 * 2
                if (r0 >= r5) goto L_0x0107
                int r5 = r0 / 8
                int r18 = r0 / 2
                int r18 = r18 % 4
                int r5 = r5 * r11
                int r5 = r5 * 4
                int r5 = r5 + r13
                int r5 = r5 + r18
                byte r5 = r2[r5]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r18 = r0 % 2
                if (r18 != 0) goto L_0x00bd
                r5 = r5 & 15
                goto L_0x00bf
            L_0x00bd:
                int r5 = r5 >> 4
            L_0x00bf:
                r18 = r5 & 7
                int r18 = r18 * 2
                r17 = 1
                int r18 = r18 + 1
                int r18 = r18 * r16
                r16 = r2
                int r2 = r18 >> 3
                r18 = r5 & 8
                if (r18 == 0) goto L_0x00d2
                int r2 = -r2
            L_0x00d2:
                int r3 = r3 + r2
                r2 = -32768(0xffffffffffff8000, float:NaN)
                r22 = r10
                r10 = 32767(0x7fff, float:4.5916E-41)
                int r3 = p513bj.C14049b0.m21636i(r3, r2, r10)
                int r2 = r11 * 2
                int r15 = r15 + r2
                r2 = r3 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r12[r15] = r2
                int r2 = r15 + 1
                int r10 = r3 >> 8
                byte r10 = (byte) r10
                r12[r2] = r10
                int[] r2 = f42082m
                r2 = r2[r5]
                int r14 = r14 + r2
                int[] r2 = f42083n
                r5 = 88
                r10 = 0
                int r14 = p513bj.C14049b0.m21636i(r14, r10, r5)
                r2 = r2[r14]
                int r0 = r0 + 1
                r10 = r22
                r19 = r16
                r16 = r2
                r2 = r19
                goto L_0x00a2
            L_0x0107:
                r16 = r2
                r17 = 1
                int r7 = r7 + 1
                r0 = r20
                goto L_0x005b
            L_0x0111:
                r16 = r2
                r17 = 1
                int r6 = r6 + 1
                r0 = r20
                goto L_0x0058
            L_0x011b:
                int r0 = r9.f42087d
                int r0 = r0 * r1
                zh.b r2 = r9.f42086c
                int r2 = r2.f42105b
                int r0 = r0 * 2
                int r0 = r0 * r2
                r2 = 0
                r4.mo46935z(r2)
                r4.mo46934y(r0)
                int r0 = r9.f42092i
                zh.b r2 = r9.f42086c
                int r2 = r2.f42107d
                int r1 = r1 * r2
                int r0 = r0 - r1
                r9.f42092i = r0
                bj.r r0 = r9.f42089f
                int r1 = r0.f30988c
                ph.v r2 = r9.f42085b
                r2.mo69899d(r1, r0)
                int r0 = r9.f42094k
                int r0 = r0 + r1
                r9.f42094k = r0
                zh.b r1 = r9.f42086c
                int r1 = r1.f42105b
                int r1 = r1 * 2
                int r0 = r0 / r1
                int r1 = r9.f42090g
                if (r0 < r1) goto L_0x0152
                r9.mo70331d(r1)
            L_0x0152:
                if (r8 == 0) goto L_0x0162
                int r0 = r9.f42094k
                zh.b r1 = r9.f42086c
                int r1 = r1.f42105b
                int r1 = r1 * 2
                int r0 = r0 / r1
                if (r0 <= 0) goto L_0x0162
                r9.mo70331d(r0)
            L_0x0162:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p725zh.C18898a.C18899a.mo70329b(ph.e, long):boolean");
        }

        /* renamed from: c */
        public final void mo70330c(long j) {
            this.f42092i = 0;
            this.f42093j = j;
            this.f42094k = 0;
            this.f42095l = 0;
        }

        /* renamed from: d */
        public final void mo70331d(int i) {
            long F = this.f42093j + C14049b0.m21625F(this.f42095l, 1000000, (long) this.f42086c.f42106c);
            int i2 = i * 2 * this.f42086c.f42105b;
            this.f42085b.mo47754c(F, 1, i2, this.f42094k - i2, (C18368v.C18369a) null);
            this.f42095l += (long) i;
            this.f42094k -= i2;
        }
    }

    /* renamed from: zh.a$b */
    public interface C18900b {
        /* renamed from: a */
        void mo70328a(int i, long j) throws ParserException;

        /* renamed from: b */
        boolean mo70329b(C18346e eVar, long j) throws IOException;

        /* renamed from: c */
        void mo70330c(long j);
    }

    /* renamed from: zh.a$c */
    public static final class C18901c implements C18900b {

        /* renamed from: a */
        public final C18351j f42096a;

        /* renamed from: b */
        public final C18368v f42097b;

        /* renamed from: c */
        public final C18902b f42098c;

        /* renamed from: d */
        public final Format f42099d;

        /* renamed from: e */
        public final int f42100e;

        /* renamed from: f */
        public long f42101f;

        /* renamed from: g */
        public int f42102g;

        /* renamed from: h */
        public long f42103h;

        public C18901c(C18351j jVar, C18368v vVar, C18902b bVar, String str, int i) throws ParserException {
            this.f42096a = jVar;
            this.f42097b = vVar;
            this.f42098c = bVar;
            int i2 = (bVar.f42105b * bVar.f42108e) / 8;
            if (bVar.f42107d == i2) {
                int i3 = bVar.f42106c * i2;
                int i4 = i3 * 8;
                int max = Math.max(i2, i3 / 10);
                this.f42100e = max;
                Format.C14176b bVar2 = new Format.C14176b();
                bVar2.f31303k = str;
                bVar2.f31298f = i4;
                bVar2.f31299g = i4;
                bVar2.f31304l = max;
                bVar2.f31316x = bVar.f42105b;
                bVar2.f31317y = bVar.f42106c;
                bVar2.f31318z = i;
                this.f42099d = bVar2.mo47144a();
                return;
            }
            throw new ParserException(C0023f.m107h(50, "Expected block size: ", i2, "; got: ", bVar.f42107d));
        }

        /* renamed from: a */
        public final void mo70328a(int i, long j) {
            this.f42096a.mo4162l(new C18905d(this.f42098c, 1, (long) i, j));
            this.f42097b.mo47752a(this.f42099d);
        }

        /* renamed from: b */
        public final boolean mo70329b(C18346e eVar, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f42102g) >= (i3 = this.f42100e)) {
                    C18902b bVar = this.f42098c;
                    int i4 = bVar.f42107d;
                    int i5 = this.f42102g / i4;
                } else {
                    int e = this.f42097b.mo69900e(eVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (e == -1) {
                        j2 = 0;
                    } else {
                        this.f42102g += e;
                        j2 -= (long) e;
                    }
                }
            }
            C18902b bVar2 = this.f42098c;
            int i42 = bVar2.f42107d;
            int i52 = this.f42102g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f42102g - i6;
                this.f42097b.mo47754c(this.f42101f + C14049b0.m21625F(this.f42103h, 1000000, (long) bVar2.f42106c), 1, i6, i7, (C18368v.C18369a) null);
                this.f42103h += (long) i52;
                this.f42102g = i7;
            }
            return i <= 0;
        }

        /* renamed from: c */
        public final void mo70330c(long j) {
            this.f42101f = j;
            this.f42102g = 0;
            this.f42103h = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r17, p644ph.C18363s r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            ph.v r1 = r0.f42078b
            p513bj.C14075p.m21696h(r1)
            int r1 = p513bj.C14049b0.f30913a
            zh.a$b r1 = r0.f42079c
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0096
            r1 = r17
            ph.e r1 = (p644ph.C18346e) r1
            zh.b r7 = p725zh.C18903c.m32000a(r1)
            if (r7 == 0) goto L_0x008e
            int r1 = r7.f42104a
            r4 = 17
            if (r1 != r4) goto L_0x002c
            zh.a$a r1 = new zh.a$a
            ph.j r4 = r0.f42077a
            ph.v r5 = r0.f42078b
            r1.<init>(r4, r5, r7)
            r0.f42079c = r1
            goto L_0x0096
        L_0x002c:
            r4 = 6
            if (r1 != r4) goto L_0x003f
            zh.a$c r1 = new zh.a$c
            ph.j r5 = r0.f42077a
            ph.v r6 = r0.f42078b
            r9 = -1
            java.lang.String r8 = "audio/g711-alaw"
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f42079c = r1
            goto L_0x0096
        L_0x003f:
            r4 = 7
            if (r1 != r4) goto L_0x0052
            zh.a$c r1 = new zh.a$c
            ph.j r5 = r0.f42077a
            ph.v r6 = r0.f42078b
            r9 = -1
            java.lang.String r8 = "audio/g711-mlaw"
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f42079c = r1
            goto L_0x0096
        L_0x0052:
            int r4 = r7.f42108e
            if (r1 == r3) goto L_0x0068
            r5 = 3
            if (r1 == r5) goto L_0x0060
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r5) goto L_0x0068
            r9 = r2
            goto L_0x006d
        L_0x0060:
            r1 = 32
            if (r4 != r1) goto L_0x0066
            r1 = 4
            goto L_0x006c
        L_0x0066:
            r1 = r2
            goto L_0x006c
        L_0x0068:
            int r1 = p513bj.C14049b0.m21646s(r4)
        L_0x006c:
            r9 = r1
        L_0x006d:
            if (r9 == 0) goto L_0x007e
            zh.a$c r1 = new zh.a$c
            ph.j r5 = r0.f42077a
            ph.v r6 = r0.f42078b
            java.lang.String r8 = "audio/raw"
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f42079c = r1
            goto L_0x0096
        L_0x007e:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r2 = r7.f42104a
            r3 = 40
            java.lang.String r4 = "Unsupported WAV format type: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r3, r4, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x008e:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Unsupported or unrecognized wav header."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0096:
            int r1 = r0.f42080d
            r4 = -1
            r6 = -1
            if (r1 != r6) goto L_0x014c
            r1 = r17
            ph.e r1 = (p644ph.C18346e) r1
            r1.f40296f = r2
            bj.r r7 = new bj.r
            r8 = 8
            r7.<init>((int) r8)
            zh.c$a r9 = p725zh.C18903c.C18904a.m32001a(r1, r7)
        L_0x00ae:
            int r10 = r9.f42110a
            r11 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r12 = "WavHeaderReader"
            if (r10 == r11) goto L_0x00f3
            r11 = 1380533830(0x52494646, float:2.16116855E11)
            if (r10 == r11) goto L_0x00c8
            r13 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r10 == r13) goto L_0x00c8
            r13 = 39
            java.lang.String r14 = "Ignoring unknown WAV chunk: "
            p003a2.C0023f.m112m(r13, r14, r10, r12)
        L_0x00c8:
            r12 = 8
            long r14 = r9.f42111b
            long r14 = r14 + r12
            int r10 = r9.f42110a
            if (r10 != r11) goto L_0x00d3
            r14 = 12
        L_0x00d3:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x00e3
            int r9 = (int) r14
            r1.mo69879j(r9)
            zh.c$a r9 = p725zh.C18903c.C18904a.m32001a(r1, r7)
            goto L_0x00ae
        L_0x00e3:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r2 = r9.f42110a
            r3 = 51
            java.lang.String r4 = "Chunk is too large (~2GB+) to skip; id: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r3, r4, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00f3:
            r1.mo69879j(r8)
            long r7 = r1.f40294d
            long r9 = r9.f42111b
            long r9 = r9 + r7
            long r13 = r1.f40293c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0124
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0124
            r1 = 69
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r1)
            java.lang.String r1 = "Data exceeds input length: "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r1 = ", "
            r11.append(r1)
            r11.append(r13)
            java.lang.String r1 = r11.toString()
            android.util.Log.w(r12, r1)
            r9 = r13
        L_0x0124:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            android.util.Pair r1 = android.util.Pair.create(r1, r7)
            java.lang.Object r7 = r1.first
            java.lang.Long r7 = (java.lang.Long) r7
            int r7 = r7.intValue()
            r0.f42080d = r7
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            r0.f42081e = r7
            zh.a$b r1 = r0.f42079c
            int r9 = r0.f42080d
            r1.mo70328a(r9, r7)
            goto L_0x015b
        L_0x014c:
            r7 = r17
            ph.e r7 = (p644ph.C18346e) r7
            long r8 = r7.f40294d
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x015b
            r7.mo69879j(r1)
        L_0x015b:
            long r7 = r0.f42081e
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r3 = r2
        L_0x0163:
            p513bj.C14075p.m21694f(r3)
            long r3 = r0.f42081e
            r1 = r17
            ph.e r1 = (p644ph.C18346e) r1
            long r7 = r1.f40294d
            long r3 = r3 - r7
            zh.a$b r5 = r0.f42079c
            boolean r1 = r5.mo70329b(r1, r3)
            if (r1 == 0) goto L_0x0178
            r2 = r6
        L_0x0178:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p725zh.C18898a.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f42077a = jVar;
        this.f42078b = jVar.mo4164r(0, 1);
        jVar.mo4163p();
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        C18900b bVar = this.f42079c;
        if (bVar != null) {
            bVar.mo70330c(j2);
        }
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        return C18903c.m32000a((C18346e) iVar) != null;
    }

    public final void release() {
    }
}
