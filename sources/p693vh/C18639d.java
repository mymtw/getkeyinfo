package p693vh;

import android.support.p013v4.media.C0073e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import p513bj.C14077r;
import p594jh.C17912g;
import p611lh.C18182r;
import p644ph.C18346e;
import p644ph.C18348g;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18360p;
import p644ph.C18361q;
import p644ph.C18368v;

/* renamed from: vh.d */
public final class C18639d implements C18349h {

    /* renamed from: u */
    public static final C0073e f41161u = new C0073e();

    /* renamed from: a */
    public final int f41162a;

    /* renamed from: b */
    public final long f41163b;

    /* renamed from: c */
    public final C14077r f41164c;

    /* renamed from: d */
    public final C18182r.C18183a f41165d;

    /* renamed from: e */
    public final C18360p f41166e;

    /* renamed from: f */
    public final C18361q f41167f;

    /* renamed from: g */
    public final C18348g f41168g;

    /* renamed from: h */
    public C18351j f41169h;

    /* renamed from: i */
    public C18368v f41170i;

    /* renamed from: j */
    public C18368v f41171j;

    /* renamed from: k */
    public int f41172k;

    /* renamed from: l */
    public Metadata f41173l;

    /* renamed from: m */
    public long f41174m;

    /* renamed from: n */
    public long f41175n;

    /* renamed from: o */
    public long f41176o;

    /* renamed from: p */
    public int f41177p;

    /* renamed from: q */
    public C18640e f41178q;

    /* renamed from: r */
    public boolean f41179r;

    /* renamed from: s */
    public boolean f41180s;

    /* renamed from: t */
    public long f41181t;

    public C18639d() {
        this(0);
    }

    /* renamed from: e */
    public static long m31436e(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f31709id.equals("TLEN")) {
                    return C17912g.m30087a(Long.parseLong(textInformationFrame.value));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: vh.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: vh.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: vh.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: vh.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: vh.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: vh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: vh.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: vh.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: vh.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: vh.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: vh.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: vh.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: vh.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e6, code lost:
        if (r0 == null) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e9, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f7, code lost:
        if ((r3.f41162a & 1) != 0) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r10 != 1231971951) goto L_0x006a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0249  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r37, p644ph.C18363s r38) throws java.io.IOException {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            ph.v r2 = r0.f41170i
            p513bj.C14075p.m21696h(r2)
            int r2 = p513bj.C14049b0.f30913a
            int r2 = r0.f41172k
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 0
            if (r2 != 0) goto L_0x001d
            r2 = r1
            ph.e r2 = (p644ph.C18346e) r2     // Catch:{ EOFException -> 0x001a }
            r0.mo70153h(r2, r6)     // Catch:{ EOFException -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r3 = r0
            goto L_0x0423
        L_0x001d:
            vh.e r2 = r0.f41178q
            r9 = 1
            if (r2 != 0) goto L_0x0340
            bj.r r2 = new bj.r
            lh.r$a r10 = r0.f41165d
            int r10 = r10.f39795c
            r2.<init>((int) r10)
            byte[] r10 = r2.f30986a
            lh.r$a r11 = r0.f41165d
            int r11 = r11.f39795c
            r12 = r1
            ph.e r12 = (p644ph.C18346e) r12
            r12.mo69872c(r10, r6, r11, r6)
            lh.r$a r10 = r0.f41165d
            int r11 = r10.f39793a
            r11 = r11 & r9
            r13 = 36
            r14 = 21
            if (r11 == 0) goto L_0x0048
            int r10 = r10.f39797e
            if (r10 == r9) goto L_0x004f
            r14 = r13
            goto L_0x004f
        L_0x0048:
            int r10 = r10.f39797e
            if (r10 == r9) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r14 = 13
        L_0x004f:
            int r10 = r2.f30988c
            int r11 = r14 + 4
            r15 = 1447187017(0x56425249, float:5.3414667E13)
            r7 = 1483304551(0x58696e67, float:1.02664153E15)
            r8 = 1231971951(0x496e666f, float:976486.94)
            if (r10 < r11) goto L_0x006a
            r2.mo46935z(r14)
            int r10 = r2.mo46912c()
            if (r10 == r7) goto L_0x007c
            if (r10 != r8) goto L_0x006a
            goto L_0x007c
        L_0x006a:
            int r10 = r2.f30988c
            r11 = 40
            if (r10 < r11) goto L_0x007b
            r2.mo46935z(r13)
            int r10 = r2.mo46912c()
            if (r10 != r15) goto L_0x007b
            r10 = r15
            goto L_0x007c
        L_0x007b:
            r10 = r6
        L_0x007c:
            java.lang.String r11 = ", "
            r16 = -1
            r19 = 0
            if (r10 == r7) goto L_0x0165
            if (r10 != r8) goto L_0x0088
            goto L_0x0165
        L_0x0088:
            if (r10 != r15) goto L_0x015c
            long r7 = r12.f40293c
            long r14 = r12.f40294d
            lh.r$a r10 = r0.f41165d
            r13 = 10
            r2.mo46909A(r13)
            int r13 = r2.mo46912c()
            if (r13 > 0) goto L_0x009d
            r15 = r12
            goto L_0x00f3
        L_0x009d:
            int r5 = r10.f39796d
            r26 = r10
            long r9 = (long) r13
            r13 = 32000(0x7d00, float:4.4842E-41)
            if (r5 < r13) goto L_0x00a9
            r13 = 1152(0x480, float:1.614E-42)
            goto L_0x00ab
        L_0x00a9:
            r13 = 576(0x240, float:8.07E-43)
        L_0x00ab:
            r27 = r7
            long r6 = (long) r13
            long r22 = r6 * r3
            long r5 = (long) r5
            r20 = r9
            r24 = r5
            long r32 = p513bj.C14049b0.m21625F(r20, r22, r24)
            int r5 = r2.mo46930u()
            int r6 = r2.mo46930u()
            int r7 = r2.mo46930u()
            r8 = 2
            r2.mo46909A(r8)
            r8 = r26
            int r8 = r8.f39795c
            long r8 = (long) r8
            long r8 = r8 + r14
            long[] r10 = new long[r5]
            long[] r13 = new long[r5]
            r3 = r14
            r14 = 0
        L_0x00d5:
            if (r14 >= r5) goto L_0x0116
            long r0 = (long) r14
            long r0 = r0 * r32
            r22 = r11
            r15 = r12
            long r11 = (long) r5
            long r0 = r0 / r11
            r10[r14] = r0
            long r0 = java.lang.Math.max(r3, r8)
            r13[r14] = r0
            r0 = 1
            if (r7 == r0) goto L_0x0105
            r0 = 2
            if (r7 == r0) goto L_0x0100
            r0 = 3
            if (r7 == r0) goto L_0x00fb
            r0 = 4
            if (r7 == r0) goto L_0x00f6
        L_0x00f3:
            r0 = r19
            goto L_0x0150
        L_0x00f6:
            int r0 = r2.mo46928s()
            goto L_0x0109
        L_0x00fb:
            int r0 = r2.mo46927r()
            goto L_0x0109
        L_0x0100:
            int r0 = r2.mo46930u()
            goto L_0x0109
        L_0x0105:
            int r0 = r2.mo46925p()
        L_0x0109:
            int r0 = r0 * r6
            long r0 = (long) r0
            long r3 = r3 + r0
            int r14 = r14 + 1
            r0 = r36
            r1 = r37
            r12 = r15
            r11 = r22
            goto L_0x00d5
        L_0x0116:
            r22 = r11
            r15 = r12
            int r0 = (r27 > r16 ? 1 : (r27 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0143
            int r0 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0143
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 67
            r0.<init>(r1)
            java.lang.String r1 = "VBRI data size mismatch: "
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            r1 = r22
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VbriSeeker"
            android.util.Log.w(r1, r0)
        L_0x0143:
            vh.f r0 = new vh.f
            r29 = r0
            r30 = r10
            r31 = r13
            r34 = r3
            r29.<init>(r30, r31, r32, r34)
        L_0x0150:
            r3 = r36
            lh.r$a r1 = r3.f41165d
            int r1 = r1.f39795c
            r4 = r15
            r4.mo69879j(r1)
            goto L_0x0258
        L_0x015c:
            r3 = r0
            r4 = r12
            r0 = 0
            r4.f40296f = r0
            r0 = r19
            goto L_0x0258
        L_0x0165:
            r3 = r0
            r1 = r11
            r4 = r12
            long r5 = r4.f40293c
            long r11 = r4.f40294d
            lh.r$a r0 = r3.f41165d
            int r7 = r0.f39799g
            int r9 = r0.f39796d
            int r13 = r2.mo46912c()
            r15 = r13 & 1
            r8 = 1
            if (r15 != r8) goto L_0x01fa
            int r8 = r2.mo46928s()
            if (r8 != 0) goto L_0x0183
            goto L_0x01fa
        L_0x0183:
            r23 = r14
            long r14 = (long) r8
            long r7 = (long) r7
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r7 * r20
            long r7 = (long) r9
            r27 = r14
            r31 = r7
            long r31 = p513bj.C14049b0.m21625F(r27, r29, r31)
            r7 = 6
            r8 = r13 & 6
            if (r8 == r7) goto L_0x01ac
            vh.g r1 = new vh.g
            int r0 = r0.f39795c
            r33 = -1
            r35 = 0
            r27 = r1
            r28 = r11
            r30 = r0
            r27.<init>(r28, r30, r31, r33, r35)
            goto L_0x01f8
        L_0x01ac:
            long r33 = r2.mo46926q()
            r7 = 100
            long[] r8 = new long[r7]
            r9 = 0
        L_0x01b5:
            if (r9 >= r7) goto L_0x01c1
            int r13 = r2.mo46925p()
            long r13 = (long) r13
            r8[r9] = r13
            int r9 = r9 + 1
            goto L_0x01b5
        L_0x01c1:
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x01e9
            long r13 = r11 + r33
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x01e9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r7 = 67
            r2.<init>(r7)
            java.lang.String r7 = "XING data size mismatch: "
            r2.append(r7)
            r2.append(r5)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "XingSeeker"
            android.util.Log.w(r2, r1)
        L_0x01e9:
            vh.g r1 = new vh.g
            int r0 = r0.f39795c
            r27 = r1
            r28 = r11
            r30 = r0
            r35 = r8
            r27.<init>(r28, r30, r31, r33, r35)
        L_0x01f8:
            r0 = r1
            goto L_0x01fe
        L_0x01fa:
            r23 = r14
            r0 = r19
        L_0x01fe:
            if (r0 == 0) goto L_0x0240
            ph.p r1 = r3.f41166e
            int r2 = r1.f40320a
            r5 = -1
            if (r2 == r5) goto L_0x020d
            int r1 = r1.f40321b
            if (r1 == r5) goto L_0x020d
            r1 = 1
            goto L_0x020e
        L_0x020d:
            r1 = 0
        L_0x020e:
            if (r1 != 0) goto L_0x0240
            r1 = 0
            r4.f40296f = r1
            r14 = r23
            int r14 = r14 + 141
            r4.mo69880k(r14, r1)
            bj.r r2 = r3.f41164c
            byte[] r2 = r2.f30986a
            r5 = 3
            r4.mo69872c(r2, r1, r5, r1)
            bj.r r2 = r3.f41164c
            r2.mo46935z(r1)
            ph.p r1 = r3.f41166e
            bj.r r2 = r3.f41164c
            int r2 = r2.mo46927r()
            int r5 = r2 >> 12
            r2 = r2 & 4095(0xfff, float:5.738E-42)
            if (r5 > 0) goto L_0x023c
            if (r2 <= 0) goto L_0x0238
            goto L_0x023c
        L_0x0238:
            r1.getClass()
            goto L_0x0240
        L_0x023c:
            r1.f40320a = r5
            r1.f40321b = r2
        L_0x0240:
            lh.r$a r1 = r3.f41165d
            int r1 = r1.f39795c
            r4.mo69879j(r1)
            if (r0 == 0) goto L_0x0258
            boolean r1 = r0.mo47834g()
            if (r1 != 0) goto L_0x0258
            r1 = 1231971951(0x496e666f, float:976486.94)
            if (r10 != r1) goto L_0x0258
            vh.a r0 = r3.mo70151d(r4)
        L_0x0258:
            com.google.android.exoplayer2.metadata.Metadata r1 = r3.f41173l
            long r5 = r4.f40294d
            if (r1 == 0) goto L_0x02ac
            int r2 = r1.length()
            r7 = 0
        L_0x0263:
            if (r7 >= r2) goto L_0x02ac
            com.google.android.exoplayer2.metadata.Metadata$Entry r8 = r1.get(r7)
            boolean r9 = r8 instanceof com.google.android.exoplayer2.metadata.id3.MlltFrame
            if (r9 == 0) goto L_0x02a9
            com.google.android.exoplayer2.metadata.id3.MlltFrame r8 = (com.google.android.exoplayer2.metadata.id3.MlltFrame) r8
            long r1 = m31436e(r1)
            int[] r7 = r8.bytesDeviations
            int r7 = r7.length
            int r9 = r7 + 1
            long[] r10 = new long[r9]
            long[] r9 = new long[r9]
            r11 = 0
            r10[r11] = r5
            r12 = 0
            r9[r11] = r12
            r11 = 0
            r13 = 1
        L_0x0286:
            if (r13 > r7) goto L_0x02a3
            int r14 = r8.bytesBetweenReference
            int[] r15 = r8.bytesDeviations
            int r18 = r13 + -1
            r15 = r15[r18]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r5 = r5 + r14
            int r14 = r8.millisecondsBetweenReference
            int[] r15 = r8.millisecondsDeviations
            r15 = r15[r18]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r11 = r11 + r14
            r10[r13] = r5
            r9[r13] = r11
            int r13 = r13 + 1
            goto L_0x0286
        L_0x02a3:
            vh.c r5 = new vh.c
            r5.<init>(r1, r10, r9)
            goto L_0x02ae
        L_0x02a9:
            int r7 = r7 + 1
            goto L_0x0263
        L_0x02ac:
            r5 = r19
        L_0x02ae:
            boolean r1 = r3.f41179r
            if (r1 == 0) goto L_0x02b8
            vh.e$a r0 = new vh.e$a
            r0.<init>()
            goto L_0x02fd
        L_0x02b8:
            int r1 = r3.f41162a
            r2 = 2
            r1 = r1 & r2
            if (r1 == 0) goto L_0x02e2
            if (r5 == 0) goto L_0x02c6
            long r0 = r5.f41160c
        L_0x02c2:
            r6 = r0
        L_0x02c3:
            r10 = r16
            goto L_0x02d9
        L_0x02c6:
            if (r0 == 0) goto L_0x02d2
            long r1 = r0.mo47835i()
            long r16 = r0.mo70148e()
            r6 = r1
            goto L_0x02c3
        L_0x02d2:
            com.google.android.exoplayer2.metadata.Metadata r0 = r3.f41173l
            long r0 = m31436e(r0)
            goto L_0x02c2
        L_0x02d9:
            vh.b r0 = new vh.b
            long r8 = r4.f40294d
            r5 = r0
            r5.<init>(r6, r8, r10)
            goto L_0x02eb
        L_0x02e2:
            if (r5 == 0) goto L_0x02e6
            r0 = r5
            goto L_0x02eb
        L_0x02e6:
            if (r0 == 0) goto L_0x02e9
            goto L_0x02eb
        L_0x02e9:
            r0 = r19
        L_0x02eb:
            if (r0 == 0) goto L_0x02f9
            boolean r1 = r0.mo47834g()
            if (r1 != 0) goto L_0x02fd
            int r1 = r3.f41162a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x02fd
        L_0x02f9:
            vh.a r0 = r3.mo70151d(r4)
        L_0x02fd:
            r3.f41178q = r0
            ph.j r1 = r3.f41169h
            r1.mo4162l(r0)
            ph.v r0 = r3.f41171j
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            lh.r$a r2 = r3.f41165d
            java.lang.String r5 = r2.f39794b
            r1.f31303k = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r1.f31304l = r5
            int r5 = r2.f39797e
            r1.f31316x = r5
            int r2 = r2.f39796d
            r1.f31317y = r2
            ph.p r2 = r3.f41166e
            int r5 = r2.f40320a
            r1.f31289A = r5
            int r2 = r2.f40321b
            r1.f31290B = r2
            int r2 = r3.f41162a
            r5 = 4
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0330
            r2 = r19
            goto L_0x0332
        L_0x0330:
            com.google.android.exoplayer2.metadata.Metadata r2 = r3.f41173l
        L_0x0332:
            r1.f31301i = r2
            com.google.android.exoplayer2.Format r1 = r1.mo47144a()
            r0.mo47752a(r1)
            long r0 = r4.f40294d
            r3.f41176o = r0
            goto L_0x035a
        L_0x0340:
            r3 = r0
            long r0 = r3.f41176o
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x035a
            r2 = r37
            r4 = r2
            ph.e r4 = (p644ph.C18346e) r4
            long r5 = r4.f40294d
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x035c
            long r0 = r0 - r5
            int r0 = (int) r0
            r4.mo69879j(r0)
            goto L_0x035c
        L_0x035a:
            r2 = r37
        L_0x035c:
            int r0 = r3.f41177p
            if (r0 != 0) goto L_0x0417
            r0 = r2
            ph.e r0 = (p644ph.C18346e) r0
            r1 = 0
            r0.f40296f = r1
            boolean r4 = r3.mo70152g(r0)
            if (r4 == 0) goto L_0x036e
            goto L_0x0423
        L_0x036e:
            bj.r r4 = r3.f41164c
            r4.mo46935z(r1)
            bj.r r1 = r3.f41164c
            int r1 = r1.mo46912c()
            int r4 = r3.f41172k
            long r4 = (long) r4
            r6 = -128000(0xfffffffffffe0c00, float:NaN)
            r6 = r6 & r1
            long r6 = (long) r6
            r8 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r4 & r8
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x038b
            r4 = 1
            goto L_0x038c
        L_0x038b:
            r4 = 0
        L_0x038c:
            if (r4 == 0) goto L_0x040f
            int r4 = p611lh.C18182r.m30684a(r1)
            r5 = -1
            if (r4 != r5) goto L_0x0397
            goto L_0x040f
        L_0x0397:
            lh.r$a r4 = r3.f41165d
            r4.mo69725a(r1)
            long r4 = r3.f41174m
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            vh.e r1 = r3.f41178q
            long r4 = r0.f40294d
            long r4 = r1.mo70149h(r4)
            r3.f41174m = r4
            long r4 = r3.f41163b
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x03c7
            vh.e r1 = r3.f41178q
            r4 = 0
            long r4 = r1.mo70149h(r4)
            long r6 = r3.f41174m
            long r8 = r3.f41163b
            long r8 = r8 - r4
            long r8 = r8 + r6
            r3.f41174m = r8
        L_0x03c7:
            lh.r$a r1 = r3.f41165d
            int r4 = r1.f39795c
            r3.f41177p = r4
            vh.e r5 = r3.f41178q
            boolean r6 = r5 instanceof p693vh.C18637b
            if (r6 == 0) goto L_0x0417
            vh.b r5 = (p693vh.C18637b) r5
            long r6 = r3.f41175n
            int r8 = r1.f39799g
            long r8 = (long) r8
            long r6 = r6 + r8
            long r8 = r3.f41174m
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r10
            int r1 = r1.f39796d
            long r10 = (long) r1
            long r6 = r6 / r10
            long r6 = r6 + r8
            long r0 = r0.f40294d
            long r8 = (long) r4
            long r0 = r0 + r8
            boolean r4 = r5.mo70150a(r6)
            if (r4 == 0) goto L_0x03f1
            goto L_0x03fb
        L_0x03f1:
            q8.a r4 = r5.f41155b
            r4.mo20204a(r6)
            q8.a r4 = r5.f41156c
            r4.mo20204a(r0)
        L_0x03fb:
            boolean r0 = r3.f41180s
            if (r0 == 0) goto L_0x0417
            long r0 = r3.f41181t
            boolean r0 = r5.mo70150a(r0)
            if (r0 == 0) goto L_0x0417
            r1 = 0
            r3.f41180s = r1
            ph.v r0 = r3.f41170i
            r3.f41171j = r0
            goto L_0x0417
        L_0x040f:
            r1 = 0
            r4 = 1
            r0.mo69879j(r4)
            r3.f41172k = r1
            goto L_0x042d
        L_0x0417:
            r4 = 1
            ph.v r0 = r3.f41171j
            int r1 = r3.f41177p
            int r0 = r0.mo69900e(r2, r1, r4)
            r1 = -1
            if (r0 != r1) goto L_0x0426
        L_0x0423:
            r0 = -1
            r6 = -1
            goto L_0x0458
        L_0x0426:
            int r1 = r3.f41177p
            int r1 = r1 - r0
            r3.f41177p = r1
            if (r1 <= 0) goto L_0x0430
        L_0x042d:
            r0 = -1
            r6 = 0
            goto L_0x0458
        L_0x0430:
            ph.v r4 = r3.f41171j
            long r0 = r3.f41175n
            long r5 = r3.f41174m
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r7
            lh.r$a r2 = r3.f41165d
            int r7 = r2.f39796d
            long r7 = (long) r7
            long r0 = r0 / r7
            long r5 = r5 + r0
            r7 = 1
            int r8 = r2.f39795c
            r9 = 0
            r10 = 0
            r4.mo47754c(r5, r7, r8, r9, r10)
            long r0 = r3.f41175n
            lh.r$a r2 = r3.f41165d
            int r2 = r2.f39799g
            long r4 = (long) r2
            long r0 = r0 + r4
            r3.f41175n = r0
            r0 = 0
            r3.f41177p = r0
            r6 = r0
            r0 = -1
        L_0x0458:
            if (r6 != r0) goto L_0x0483
            vh.e r0 = r3.f41178q
            boolean r1 = r0 instanceof p693vh.C18637b
            if (r1 == 0) goto L_0x0483
            long r1 = r3.f41175n
            long r4 = r3.f41174m
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r7
            lh.r$a r7 = r3.f41165d
            int r7 = r7.f39796d
            long r7 = (long) r7
            long r1 = r1 / r7
            long r1 = r1 + r4
            long r4 = r0.mo47835i()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0483
            vh.e r0 = r3.f41178q
            r4 = r0
            vh.b r4 = (p693vh.C18637b) r4
            r4.f41157d = r1
            ph.j r1 = r3.f41169h
            r1.mo4162l(r0)
        L_0x0483:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p693vh.C18639d.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41169h = jVar;
        C18368v r = jVar.mo4164r(0, 1);
        this.f41170i = r;
        this.f41171j = r;
        this.f41169h.mo4163p();
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f41172k = 0;
        this.f41174m = -9223372036854775807L;
        this.f41175n = 0;
        this.f41177p = 0;
        this.f41181t = j2;
        C18640e eVar = this.f41178q;
        if ((eVar instanceof C18637b) && !((C18637b) eVar).mo70150a(j2)) {
            this.f41180s = true;
            this.f41171j = this.f41168g;
        }
    }

    /* renamed from: d */
    public final C18636a mo70151d(C18346e eVar) throws IOException {
        eVar.mo69872c(this.f41164c.f30986a, 0, 4, false);
        this.f41164c.mo46935z(0);
        this.f41165d.mo69725a(this.f41164c.mo46912c());
        return new C18636a(eVar.f40293c, eVar.f40294d, this.f41165d);
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        return mo70153h((C18346e) iVar, true);
    }

    /* renamed from: g */
    public final boolean mo70152g(C18346e eVar) throws IOException {
        C18640e eVar2 = this.f41178q;
        if (eVar2 != null) {
            long e = eVar2.mo70148e();
            if (e != -1 && eVar.mo69877h() > e - 4) {
                return true;
            }
        }
        try {
            return !eVar.mo69872c(this.f41164c.f30986a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if ((((long) (-128000 & r10)) == (((long) r7) & -128000)) != false) goto L_0x0074;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo70153h(p644ph.C18346e r18, boolean r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto L_0x000a
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x000c
        L_0x000a:
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x000c:
            r3 = 0
            r1.f40296f = r3
            long r4 = r1.f40294d
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 4
            r6 = 1
            if (r4 != 0) goto L_0x0041
            int r4 = r0.f41162a
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0020
            r4 = r6
            goto L_0x0021
        L_0x0020:
            r4 = r3
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0027
        L_0x0025:
            android.support.v4.media.e r4 = f41161u
        L_0x0027:
            ph.q r7 = r0.f41167f
            com.google.android.exoplayer2.metadata.Metadata r4 = r7.mo69892a(r1, r4)
            r0.f41173l = r4
            if (r4 == 0) goto L_0x0036
            ph.p r7 = r0.f41166e
            r7.mo69891b(r4)
        L_0x0036:
            long r7 = r18.mo69877h()
            int r4 = (int) r7
            if (r19 != 0) goto L_0x0042
            r1.mo69879j(r4)
            goto L_0x0042
        L_0x0041:
            r4 = r3
        L_0x0042:
            r7 = r3
            r8 = r7
            r9 = r8
        L_0x0045:
            boolean r10 = r17.mo70152g(r18)
            if (r10 == 0) goto L_0x0054
            if (r8 <= 0) goto L_0x004e
            goto L_0x00a8
        L_0x004e:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x0054:
            bj.r r10 = r0.f41164c
            r10.mo46935z(r3)
            bj.r r10 = r0.f41164c
            int r10 = r10.mo46912c()
            if (r7 == 0) goto L_0x0074
            long r11 = (long) r7
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0071
            r11 = r6
            goto L_0x0072
        L_0x0071:
            r11 = r3
        L_0x0072:
            if (r11 == 0) goto L_0x007b
        L_0x0074:
            int r11 = p611lh.C18182r.m30684a(r10)
            r12 = -1
            if (r11 != r12) goto L_0x009b
        L_0x007b:
            int r7 = r9 + 1
            if (r9 != r2) goto L_0x008a
            if (r19 == 0) goto L_0x0082
            return r3
        L_0x0082:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Searched too many bytes."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x008a:
            if (r19 == 0) goto L_0x0094
            r1.f40296f = r3
            int r8 = r4 + r7
            r1.mo69880k(r8, r3)
            goto L_0x0097
        L_0x0094:
            r1.mo69879j(r6)
        L_0x0097:
            r8 = r3
            r9 = r7
            r7 = r8
            goto L_0x0045
        L_0x009b:
            int r8 = r8 + 1
            if (r8 != r6) goto L_0x00a6
            lh.r$a r7 = r0.f41165d
            r7.mo69725a(r10)
            r7 = r10
            goto L_0x00b4
        L_0x00a6:
            if (r8 != r5) goto L_0x00b4
        L_0x00a8:
            if (r19 == 0) goto L_0x00af
            int r4 = r4 + r9
            r1.mo69879j(r4)
            goto L_0x00b1
        L_0x00af:
            r1.f40296f = r3
        L_0x00b1:
            r0.f41172k = r7
            return r6
        L_0x00b4:
            int r11 = r11 + -4
            r1.mo69880k(r11, r3)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: p693vh.C18639d.mo70153h(ph.e, boolean):boolean");
    }

    public final void release() {
    }

    public C18639d(int i) {
        this(-9223372036854775807L);
    }

    public C18639d(long j) {
        this.f41162a = 0;
        this.f41163b = j;
        this.f41164c = new C14077r(10);
        this.f41165d = new C18182r.C18183a();
        this.f41166e = new C18360p();
        this.f41174m = -9223372036854775807L;
        this.f41167f = new C18361q();
        C18348g gVar = new C18348g();
        this.f41168g = gVar;
        this.f41171j = gVar;
    }
}
