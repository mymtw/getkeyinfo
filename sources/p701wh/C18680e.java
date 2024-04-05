package p701wh;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p003a2.C0023f;
import p513bj.C14049b0;
import p513bj.C14068n;
import p513bj.C14077r;
import p513bj.C14086y;
import p547di.C17559b;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18368v;
import p701wh.C18670a;
import p701wh.C18687i;

/* renamed from: wh.e */
public final class C18680e implements C18349h {

    /* renamed from: G */
    public static final byte[] f41313G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: H */
    public static final Format f41314H;

    /* renamed from: A */
    public int f41315A;

    /* renamed from: B */
    public boolean f41316B;

    /* renamed from: C */
    public C18351j f41317C;

    /* renamed from: D */
    public C18368v[] f41318D;

    /* renamed from: E */
    public C18368v[] f41319E;

    /* renamed from: F */
    public boolean f41320F;

    /* renamed from: a */
    public final int f41321a;

    /* renamed from: b */
    public final List<Format> f41322b;

    /* renamed from: c */
    public final SparseArray<C18682b> f41323c;

    /* renamed from: d */
    public final C14077r f41324d;

    /* renamed from: e */
    public final C14077r f41325e;

    /* renamed from: f */
    public final C14077r f41326f;

    /* renamed from: g */
    public final byte[] f41327g;

    /* renamed from: h */
    public final C14077r f41328h;

    /* renamed from: i */
    public final C14086y f41329i;

    /* renamed from: j */
    public final C17559b f41330j;

    /* renamed from: k */
    public final C14077r f41331k;

    /* renamed from: l */
    public final ArrayDeque<C18670a.C18671a> f41332l;

    /* renamed from: m */
    public final ArrayDeque<C18681a> f41333m;

    /* renamed from: n */
    public int f41334n;

    /* renamed from: o */
    public int f41335o;

    /* renamed from: p */
    public long f41336p;

    /* renamed from: q */
    public int f41337q;

    /* renamed from: r */
    public C14077r f41338r;

    /* renamed from: s */
    public long f41339s;

    /* renamed from: t */
    public int f41340t;

    /* renamed from: u */
    public long f41341u;

    /* renamed from: v */
    public long f41342v;

    /* renamed from: w */
    public long f41343w;

    /* renamed from: x */
    public C18682b f41344x;

    /* renamed from: y */
    public int f41345y;

    /* renamed from: z */
    public int f41346z;

    /* renamed from: wh.e$a */
    public static final class C18681a {

        /* renamed from: a */
        public final long f41347a;

        /* renamed from: b */
        public final int f41348b;

        public C18681a(long j, int i) {
            this.f41347a = j;
            this.f41348b = i;
        }
    }

    /* renamed from: wh.e$b */
    public static final class C18682b {

        /* renamed from: a */
        public final C18368v f41349a;

        /* renamed from: b */
        public final C18694n f41350b = new C18694n();

        /* renamed from: c */
        public final C14077r f41351c = new C14077r();

        /* renamed from: d */
        public C18695o f41352d;

        /* renamed from: e */
        public C18678c f41353e;

        /* renamed from: f */
        public int f41354f;

        /* renamed from: g */
        public int f41355g;

        /* renamed from: h */
        public int f41356h;

        /* renamed from: i */
        public int f41357i;

        /* renamed from: j */
        public final C14077r f41358j = new C14077r(1);

        /* renamed from: k */
        public final C14077r f41359k = new C14077r();

        /* renamed from: l */
        public boolean f41360l;

        public C18682b(C18368v vVar, C18695o oVar, C18678c cVar) {
            this.f41349a = vVar;
            this.f41352d = oVar;
            this.f41353e = cVar;
            this.f41352d = oVar;
            this.f41353e = cVar;
            vVar.mo47752a(oVar.f41435a.f41406f);
            mo70193d();
        }

        /* renamed from: a */
        public final C18693m mo70190a() {
            if (!this.f41360l) {
                return null;
            }
            C18694n nVar = this.f41350b;
            C18678c cVar = nVar.f41417a;
            int i = C14049b0.f30913a;
            int i2 = cVar.f41308a;
            C18693m mVar = nVar.f41430n;
            if (mVar == null) {
                C18693m[] mVarArr = this.f41352d.f41435a.f41411k;
                mVar = mVarArr == null ? null : mVarArr[i2];
            }
            if (mVar == null || !mVar.f41412a) {
                return null;
            }
            return mVar;
        }

        /* renamed from: b */
        public final boolean mo70191b() {
            this.f41354f++;
            if (!this.f41360l) {
                return false;
            }
            int i = this.f41355g + 1;
            this.f41355g = i;
            int[] iArr = this.f41350b.f41423g;
            int i2 = this.f41356h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f41356h = i2 + 1;
            this.f41355g = 0;
            return false;
        }

        /* renamed from: c */
        public final int mo70192c(int i, int i2) {
            C14077r rVar;
            C18693m a = mo70190a();
            if (a == null) {
                return 0;
            }
            int i3 = a.f41415d;
            if (i3 != 0) {
                rVar = this.f41350b.f41431o;
            } else {
                byte[] bArr = a.f41416e;
                int i4 = C14049b0.f30913a;
                this.f41359k.mo46933x(bArr.length, bArr);
                C14077r rVar2 = this.f41359k;
                i3 = bArr.length;
                rVar = rVar2;
            }
            C18694n nVar = this.f41350b;
            boolean z = nVar.f41428l && nVar.f41429m[this.f41354f];
            boolean z2 = z || i2 != 0;
            C14077r rVar3 = this.f41358j;
            rVar3.f30986a[0] = (byte) ((z2 ? 128 : 0) | i3);
            rVar3.mo46935z(0);
            this.f41349a.mo47755f(this.f41358j, 1);
            this.f41349a.mo47755f(rVar, i3);
            if (!z2) {
                return i3 + 1;
            }
            if (!z) {
                this.f41351c.mo46932w(8);
                C14077r rVar4 = this.f41351c;
                byte[] bArr2 = rVar4.f30986a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                this.f41349a.mo47755f(rVar4, 8);
                return i3 + 1 + 8;
            }
            C14077r rVar5 = this.f41350b.f41431o;
            int u = rVar5.mo46930u();
            rVar5.mo46909A(-2);
            int i5 = (u * 6) + 2;
            if (i2 != 0) {
                this.f41351c.mo46932w(i5);
                byte[] bArr3 = this.f41351c.f30986a;
                rVar5.mo46911b(0, i5, bArr3);
                int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i6 >> 8) & 255);
                bArr3[3] = (byte) (i6 & 255);
                rVar5 = this.f41351c;
            }
            this.f41349a.mo47755f(rVar5, i5);
            return i3 + 1 + i5;
        }

        /* renamed from: d */
        public final void mo70193d() {
            C18694n nVar = this.f41350b;
            nVar.f41420d = 0;
            nVar.f41433q = 0;
            nVar.f41434r = false;
            nVar.f41428l = false;
            nVar.f41432p = false;
            nVar.f41430n = null;
            this.f41354f = 0;
            this.f41356h = 0;
            this.f41355g = 0;
            this.f41357i = 0;
            this.f41360l = false;
        }
    }

    static {
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31303k = "application/x-emsg";
        f41314H = bVar.mo47144a();
    }

    public C18680e() {
        this(0, (C14086y) null, Collections.emptyList());
    }

    /* renamed from: d */
    public static DrmInitData m31516d(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C18670a.C18672b bVar = (C18670a.C18672b) arrayList.get(i);
            if (bVar.f41285a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f41289b.f30986a;
                C18687i.C18688a b = C18687i.m31542b(bArr);
                UUID uuid = b == null ? null : b.f41390a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData((List<DrmInitData.SchemeData>) arrayList2);
    }

    /* renamed from: e */
    public static void m31517e(C14077r rVar, int i, C18694n nVar) throws ParserException {
        rVar.mo46935z(i + 8);
        int c = rVar.mo46912c() & 16777215;
        if ((c & 1) == 0) {
            boolean z = (c & 2) != 0;
            int s = rVar.mo46928s();
            if (s == 0) {
                Arrays.fill(nVar.f41429m, 0, nVar.f41421e, false);
            } else if (s == nVar.f41421e) {
                Arrays.fill(nVar.f41429m, 0, s, z);
                nVar.f41431o.mo46932w(rVar.f30988c - rVar.f30987b);
                nVar.f41428l = true;
                nVar.f41432p = true;
                C14077r rVar2 = nVar.f41431o;
                rVar.mo46911b(0, rVar2.f30988c, rVar2.f30986a);
                nVar.f41431o.mo46935z(0);
                nVar.f41432p = false;
            } else {
                throw new ParserException(C0023f.m107h(80, "Senc sample count ", s, " is different from fragment sample count", nVar.f41421e));
            }
        } else {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:357:0x031e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x07ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r28, p644ph.C18363s r29) throws java.io.IOException {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r0 = r1
        L_0x0005:
            int r3 = r0.f41334n
            r4 = 1701671783(0x656d7367, float:7.0083103E22)
            r5 = 1936286840(0x73696478, float:1.8491255E31)
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x05dd
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r3 == r8) goto L_0x0381
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 3
            if (r3 == r7) goto L_0x0320
            wh.e$b r3 = r0.f41344x
            if (r3 != 0) goto L_0x00b7
            android.util.SparseArray<wh.e$b> r3 = r0.f41323c
            int r7 = r3.size()
            r11 = r4
            r5 = r9
            r4 = 0
        L_0x002b:
            if (r5 >= r7) goto L_0x0066
            java.lang.Object r13 = r3.valueAt(r5)
            wh.e$b r13 = (p701wh.C18680e.C18682b) r13
            boolean r14 = r13.f41360l
            if (r14 != 0) goto L_0x003f
            int r15 = r13.f41354f
            wh.o r6 = r13.f41352d
            int r6 = r6.f41436b
            if (r15 == r6) goto L_0x0063
        L_0x003f:
            if (r14 == 0) goto L_0x004a
            int r6 = r13.f41356h
            wh.n r15 = r13.f41350b
            int r15 = r15.f41420d
            if (r6 != r15) goto L_0x004a
            goto L_0x0063
        L_0x004a:
            if (r14 != 0) goto L_0x0055
            wh.o r6 = r13.f41352d
            long[] r6 = r6.f41437c
            int r14 = r13.f41354f
            r14 = r6[r14]
            goto L_0x005d
        L_0x0055:
            wh.n r6 = r13.f41350b
            long[] r6 = r6.f41422f
            int r14 = r13.f41356h
            r14 = r6[r14]
        L_0x005d:
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0063
            r4 = r13
            r11 = r14
        L_0x0063:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x0066:
            if (r4 != 0) goto L_0x0089
            long r3 = r0.f41339s
            r5 = r28
            ph.e r5 = (p644ph.C18346e) r5
            long r5 = r5.f40294d
            long r3 = r3 - r5
            int r3 = (int) r3
            if (r3 < 0) goto L_0x0081
            r4 = r2
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69879j(r3)
            r0.f41334n = r9
            r0.f41337q = r9
            r3 = r9
            goto L_0x031c
        L_0x0081:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to end of mdat was negative."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0089:
            boolean r3 = r4.f41360l
            if (r3 != 0) goto L_0x0096
            wh.o r3 = r4.f41352d
            long[] r3 = r3.f41437c
            int r5 = r4.f41354f
            r5 = r3[r5]
            goto L_0x009e
        L_0x0096:
            wh.n r3 = r4.f41350b
            long[] r3 = r3.f41422f
            int r5 = r4.f41356h
            r5 = r3[r5]
        L_0x009e:
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            long r11 = r3.f40294d
            long r5 = r5 - r11
            int r3 = (int) r5
            if (r3 >= 0) goto L_0x00ae
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r10, r3)
            r3 = r9
        L_0x00ae:
            r5 = r2
            ph.e r5 = (p644ph.C18346e) r5
            r5.mo69879j(r3)
            r0.f41344x = r4
            r3 = r4
        L_0x00b7:
            int r4 = r0.f41334n
            r5 = 6
            if (r4 != r8) goto L_0x016f
            boolean r4 = r3.f41360l
            if (r4 != 0) goto L_0x00c9
            wh.o r4 = r3.f41352d
            int[] r4 = r4.f41438d
            int r6 = r3.f41354f
            r4 = r4[r6]
            goto L_0x00d1
        L_0x00c9:
            wh.n r4 = r3.f41350b
            int[] r4 = r4.f41424h
            int r6 = r3.f41354f
            r4 = r4[r6]
        L_0x00d1:
            r0.f41345y = r4
            int r6 = r3.f41354f
            int r7 = r3.f41357i
            if (r6 >= r7) goto L_0x0119
            r6 = r2
            ph.e r6 = (p644ph.C18346e) r6
            r6.mo69879j(r4)
            wh.m r4 = r3.mo70190a()
            if (r4 != 0) goto L_0x00e6
            goto L_0x010c
        L_0x00e6:
            wh.n r6 = r3.f41350b
            bj.r r6 = r6.f41431o
            int r4 = r4.f41415d
            if (r4 == 0) goto L_0x00f1
            r6.mo46909A(r4)
        L_0x00f1:
            wh.n r4 = r3.f41350b
            int r7 = r3.f41354f
            boolean r10 = r4.f41428l
            if (r10 == 0) goto L_0x0101
            boolean[] r4 = r4.f41429m
            boolean r4 = r4[r7]
            if (r4 == 0) goto L_0x0101
            r4 = 1
            goto L_0x0102
        L_0x0101:
            r4 = r9
        L_0x0102:
            if (r4 == 0) goto L_0x010c
            int r4 = r6.mo46930u()
            int r4 = r4 * r5
            r6.mo46909A(r4)
        L_0x010c:
            boolean r3 = r3.mo70191b()
            if (r3 != 0) goto L_0x0115
            r3 = 0
            r0.f41344x = r3
        L_0x0115:
            r0.f41334n = r8
            goto L_0x031b
        L_0x0119:
            wh.o r6 = r3.f41352d
            wh.l r6 = r6.f41435a
            int r6 = r6.f41407g
            r7 = 1
            if (r6 != r7) goto L_0x012e
            int r4 = r4 + -8
            r0.f41345y = r4
            r4 = r2
            ph.e r4 = (p644ph.C18346e) r4
            r6 = 8
            r4.mo69879j(r6)
        L_0x012e:
            wh.o r4 = r3.f41352d
            wh.l r4 = r4.f41435a
            com.google.android.exoplayer2.Format r4 = r4.f41406f
            java.lang.String r4 = r4.sampleMimeType
            java.lang.String r6 = "audio/ac4"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x015b
            int r4 = r0.f41345y
            r6 = 7
            int r4 = r3.mo70192c(r4, r6)
            r0.f41346z = r4
            int r4 = r0.f41345y
            bj.r r7 = r0.f41328h
            p611lh.C18165c.m30679a(r4, r7)
            ph.v r4 = r3.f41349a
            bj.r r7 = r0.f41328h
            r4.mo69899d(r6, r7)
            int r4 = r0.f41346z
            int r4 = r4 + r6
            r0.f41346z = r4
            goto L_0x0163
        L_0x015b:
            int r4 = r0.f41345y
            int r4 = r3.mo70192c(r4, r9)
            r0.f41346z = r4
        L_0x0163:
            int r4 = r0.f41345y
            int r6 = r0.f41346z
            int r4 = r4 + r6
            r0.f41345y = r4
            r4 = 4
            r0.f41334n = r4
            r0.f41315A = r9
        L_0x016f:
            wh.o r4 = r3.f41352d
            wh.l r6 = r4.f41435a
            ph.v r10 = r3.f41349a
            boolean r7 = r3.f41360l
            if (r7 != 0) goto L_0x0180
            long[] r4 = r4.f41440f
            int r7 = r3.f41354f
            r7 = r4[r7]
            goto L_0x018e
        L_0x0180:
            wh.n r4 = r3.f41350b
            int r7 = r3.f41354f
            long[] r8 = r4.f41426j
            r11 = r8[r7]
            int[] r4 = r4.f41425i
            r4 = r4[r7]
            long r7 = (long) r4
            long r7 = r7 + r11
        L_0x018e:
            bj.y r4 = r0.f41329i
            if (r4 == 0) goto L_0x0196
            long r7 = r4.mo46957a(r7)
        L_0x0196:
            int r4 = r6.f41410j
            if (r4 == 0) goto L_0x027a
            bj.r r11 = r0.f41325e
            byte[] r11 = r11.f30986a
            r11[r9] = r9
            r12 = 1
            r11[r12] = r9
            r12 = 2
            r11[r12] = r9
            int r12 = r4 + 1
            int r4 = 4 - r4
        L_0x01aa:
            int r13 = r0.f41346z
            int r14 = r0.f41345y
            if (r13 >= r14) goto L_0x028c
            int r13 = r0.f41315A
            java.lang.String r14 = "video/hevc"
            if (r13 != 0) goto L_0x0223
            r13 = r2
            ph.e r13 = (p644ph.C18346e) r13
            r13.mo69874g(r11, r4, r12, r9)
            bj.r r13 = r0.f41325e
            r13.mo46935z(r9)
            bj.r r13 = r0.f41325e
            int r13 = r13.mo46912c()
            r15 = 1
            if (r13 < r15) goto L_0x021b
            int r13 = r13 + -1
            r0.f41315A = r13
            bj.r r13 = r0.f41324d
            r13.mo46935z(r9)
            bj.r r13 = r0.f41324d
            r9 = 4
            r10.mo69899d(r9, r13)
            bj.r r13 = r0.f41325e
            r10.mo69899d(r15, r13)
            ph.v[] r13 = r0.f41319E
            int r13 = r13.length
            if (r13 <= 0) goto L_0x020c
            com.google.android.exoplayer2.Format r13 = r6.f41406f
            java.lang.String r13 = r13.sampleMimeType
            byte r9 = r11[r9]
            byte[] r15 = p513bj.C14068n.f30955a
            java.lang.String r15 = "video/avc"
            boolean r15 = r15.equals(r13)
            if (r15 == 0) goto L_0x01f7
            r15 = r9 & 31
            if (r15 == r5) goto L_0x0205
        L_0x01f7:
            boolean r5 = r14.equals(r13)
            if (r5 == 0) goto L_0x0207
            r5 = r9 & 126(0x7e, float:1.77E-43)
            int r5 = r5 >> 1
            r9 = 39
            if (r5 != r9) goto L_0x0207
        L_0x0205:
            r5 = 1
            goto L_0x0208
        L_0x0207:
            r5 = 0
        L_0x0208:
            if (r5 == 0) goto L_0x020c
            r5 = 1
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            r0.f41316B = r5
            int r5 = r0.f41346z
            int r5 = r5 + 5
            r0.f41346z = r5
            int r5 = r0.f41345y
            int r5 = r5 + r4
            r0.f41345y = r5
            goto L_0x0276
        L_0x021b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid NAL length"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0223:
            boolean r5 = r0.f41316B
            if (r5 == 0) goto L_0x0266
            bj.r r5 = r0.f41326f
            r5.mo46932w(r13)
            bj.r r5 = r0.f41326f
            byte[] r5 = r5.f30986a
            int r9 = r0.f41315A
            r13 = r2
            ph.e r13 = (p644ph.C18346e) r13
            r15 = 0
            r13.mo69874g(r5, r15, r9, r15)
            bj.r r5 = r0.f41326f
            int r9 = r0.f41315A
            r10.mo69899d(r9, r5)
            int r5 = r0.f41315A
            bj.r r9 = r0.f41326f
            byte[] r13 = r9.f30986a
            int r9 = r9.f30988c
            int r9 = p513bj.C14068n.m21686e(r9, r13)
            bj.r r13 = r0.f41326f
            com.google.android.exoplayer2.Format r15 = r6.f41406f
            java.lang.String r15 = r15.sampleMimeType
            boolean r14 = r14.equals(r15)
            r13.mo46935z(r14)
            bj.r r13 = r0.f41326f
            r13.mo46934y(r9)
            bj.r r9 = r0.f41326f
            ph.v[] r13 = r0.f41319E
            p644ph.C18343b.m30976a(r7, r9, r13)
            goto L_0x026c
        L_0x0266:
            r5 = 0
            int r9 = r10.mo69900e(r2, r13, r5)
            r5 = r9
        L_0x026c:
            int r9 = r0.f41346z
            int r9 = r9 + r5
            r0.f41346z = r9
            int r9 = r0.f41315A
            int r9 = r9 - r5
            r0.f41315A = r9
        L_0x0276:
            r5 = 6
            r9 = 0
            goto L_0x01aa
        L_0x027a:
            int r4 = r0.f41346z
            int r5 = r0.f41345y
            if (r4 >= r5) goto L_0x028c
            int r5 = r5 - r4
            r4 = 0
            int r5 = r10.mo69900e(r2, r5, r4)
            int r4 = r0.f41346z
            int r4 = r4 + r5
            r0.f41346z = r4
            goto L_0x027a
        L_0x028c:
            boolean r4 = r3.f41360l
            if (r4 != 0) goto L_0x0299
            wh.o r4 = r3.f41352d
            int[] r4 = r4.f41441g
            int r5 = r3.f41354f
            r4 = r4[r5]
            goto L_0x02a6
        L_0x0299:
            wh.n r4 = r3.f41350b
            boolean[] r4 = r4.f41427k
            int r5 = r3.f41354f
            boolean r4 = r4[r5]
            if (r4 == 0) goto L_0x02a5
            r4 = 1
            goto L_0x02a6
        L_0x02a5:
            r4 = 0
        L_0x02a6:
            wh.m r5 = r3.mo70190a()
            if (r5 == 0) goto L_0x02af
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = r4 | r5
        L_0x02af:
            r13 = r4
            wh.m r4 = r3.mo70190a()
            if (r4 == 0) goto L_0x02b9
            ph.v$a r4 = r4.f41414c
            goto L_0x02ba
        L_0x02b9:
            r4 = 0
        L_0x02ba:
            r16 = r4
            int r14 = r0.f41345y
            r15 = 0
            r11 = r7
            r10.mo47754c(r11, r13, r14, r15, r16)
        L_0x02c3:
            java.util.ArrayDeque<wh.e$a> r4 = r0.f41333m
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x030f
            java.util.ArrayDeque<wh.e$a> r4 = r0.f41333m
            java.lang.Object r4 = r4.removeFirst()
            wh.e$a r4 = (p701wh.C18680e.C18681a) r4
            int r5 = r0.f41340t
            int r6 = r4.f41348b
            int r5 = r5 - r6
            r0.f41340t = r5
            long r5 = r4.f41347a
            long r5 = r5 + r7
            bj.y r9 = r0.f41329i
            if (r9 == 0) goto L_0x02e5
            long r5 = r9.mo46957a(r5)
        L_0x02e5:
            ph.v[] r15 = r0.f41318D
            int r14 = r15.length
            r13 = 0
        L_0x02e9:
            if (r13 >= r14) goto L_0x02c3
            r9 = r15[r13]
            r12 = 1
            int r10 = r4.f41348b
            int r11 = r0.f41340t
            r16 = 0
            r17 = r10
            r18 = r11
            r10 = r5
            r19 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            r18 = r15
            r15 = r16
            r9.mo47754c(r10, r12, r13, r14, r15)
            int r13 = r19 + 1
            r14 = r17
            r15 = r18
            goto L_0x02e9
        L_0x030f:
            boolean r3 = r3.mo70191b()
            if (r3 != 0) goto L_0x0318
            r3 = 0
            r0.f41344x = r3
        L_0x0318:
            r3 = 3
            r0.f41334n = r3
        L_0x031b:
            r3 = 1
        L_0x031c:
            if (r3 == 0) goto L_0x0005
            r3 = 0
            return r3
        L_0x0320:
            android.util.SparseArray<wh.e$b> r3 = r0.f41323c
            int r3 = r3.size()
            r6 = 0
            r7 = r6
            r5 = r4
            r4 = 0
        L_0x032a:
            if (r4 >= r3) goto L_0x034d
            android.util.SparseArray<wh.e$b> r8 = r0.f41323c
            java.lang.Object r8 = r8.valueAt(r4)
            wh.e$b r8 = (p701wh.C18680e.C18682b) r8
            wh.n r8 = r8.f41350b
            boolean r9 = r8.f41432p
            if (r9 == 0) goto L_0x034a
            long r8 = r8.f41419c
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x034a
            android.util.SparseArray<wh.e$b> r5 = r0.f41323c
            java.lang.Object r5 = r5.valueAt(r4)
            wh.e$b r5 = (p701wh.C18680e.C18682b) r5
            r7 = r5
            r5 = r8
        L_0x034a:
            int r4 = r4 + 1
            goto L_0x032a
        L_0x034d:
            if (r7 != 0) goto L_0x0354
            r3 = 3
            r0.f41334n = r3
            goto L_0x0005
        L_0x0354:
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            long r3 = r3.f40294d
            long r5 = r5 - r3
            int r3 = (int) r5
            if (r3 < 0) goto L_0x0379
            r4 = r2
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69879j(r3)
            wh.n r3 = r7.f41350b
            bj.r r5 = r3.f41431o
            byte[] r6 = r5.f30986a
            int r5 = r5.f30988c
            r7 = 0
            r4.mo69874g(r6, r7, r5, r7)
            bj.r r4 = r3.f41431o
            r4.mo46935z(r7)
            r3.f41432p = r7
            goto L_0x0005
        L_0x0379:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to encryption data was negative."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0381:
            long r6 = r0.f41336p
            int r3 = (int) r6
            int r6 = r0.f41337q
            int r3 = r3 - r6
            bj.r r6 = r0.f41338r
            if (r6 == 0) goto L_0x05cc
            byte[] r7 = r6.f30986a
            r8 = r2
            ph.e r8 = (p644ph.C18346e) r8
            r9 = 8
            r11 = 0
            r8.mo69874g(r7, r9, r3, r11)
            wh.a$b r3 = new wh.a$b
            int r7 = r0.f41335o
            r3.<init>(r7, r6)
            r8 = r28
            ph.e r8 = (p644ph.C18346e) r8
            long r8 = r8.f40294d
            java.util.ArrayDeque<wh.a$a> r11 = r0.f41332l
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x03ba
            java.util.ArrayDeque<wh.a$a> r4 = r0.f41332l
            java.lang.Object r4 = r4.peek()
            wh.a$a r4 = (p701wh.C18670a.C18671a) r4
            java.util.ArrayList r4 = r4.f41287c
            r4.add(r3)
            goto L_0x05d2
        L_0x03ba:
            if (r7 != r5) goto L_0x047c
            r0 = 8
            r6.mo46935z(r0)
            int r0 = r6.mo46912c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 4
            r6.mo46909A(r2)
            long r2 = r6.mo46926q()
            if (r0 != 0) goto L_0x03dc
            long r4 = r6.mo46926q()
            long r10 = r6.mo46926q()
            goto L_0x03e4
        L_0x03dc:
            long r4 = r6.mo46929t()
            long r10 = r6.mo46929t()
        L_0x03e4:
            long r7 = r10 + r8
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r4
            r14 = r2
            long r16 = p513bj.C14049b0.m21625F(r10, r12, r14)
            r0 = 2
            r6.mo46909A(r0)
            int r0 = r6.mo46930u()
            int[] r9 = new int[r0]
            long[] r14 = new long[r0]
            long[] r15 = new long[r0]
            long[] r12 = new long[r0]
            r10 = r16
            r13 = 0
        L_0x0402:
            if (r13 >= r0) goto L_0x0453
            int r18 = r6.mo46912c()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r18 & r19
            if (r19 != 0) goto L_0x044b
            long r19 = r6.mo46926q()
            r21 = 2147483647(0x7fffffff, float:NaN)
            r18 = r18 & r21
            r9[r13] = r18
            r14[r13] = r7
            r12[r13] = r10
            long r4 = r4 + r19
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r4
            r20 = r0
            r0 = r12
            r21 = r13
            r12 = r18
            r18 = r4
            r4 = r14
            r5 = r15
            r14 = r2
            long r10 = p513bj.C14049b0.m21625F(r10, r12, r14)
            r12 = r0[r21]
            long r12 = r10 - r12
            r5[r21] = r12
            r12 = 4
            r6.mo46909A(r12)
            r12 = r9[r21]
            long r12 = (long) r12
            long r7 = r7 + r12
            int r13 = r21 + 1
            r12 = r0
            r14 = r4
            r15 = r5
            r4 = r18
            r0 = r20
            goto L_0x0402
        L_0x044b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Unhandled indirect reference"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0453:
            r0 = r12
            r4 = r14
            r5 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r16)
            ph.c r3 = new ph.c
            r3.<init>(r9, r4, r5, r0)
            android.util.Pair r0 = android.util.Pair.create(r2, r3)
            java.lang.Object r2 = r0.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.f41343w = r2
            ph.j r2 = r1.f41317C
            java.lang.Object r0 = r0.second
            ph.t r0 = (p644ph.C18364t) r0
            r2.mo4162l(r0)
            r0 = 1
            r1.f41320F = r0
            r0 = r1
            goto L_0x05c9
        L_0x047c:
            if (r7 != r4) goto L_0x05c9
            ph.v[] r2 = r0.f41318D
            int r2 = r2.length
            if (r2 != 0) goto L_0x0485
            goto L_0x05c9
        L_0x0485:
            r2 = 8
            r6.mo46935z(r2)
            int r2 = r6.mo46912c()
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x04db
            r5 = 1
            if (r2 == r5) goto L_0x04a5
            r3 = 46
            java.lang.String r4 = "Skipping unsupported emsg version: "
            p003a2.C0023f.m112m(r3, r4, r2, r10)
            goto L_0x05c9
        L_0x04a5:
            long r7 = r6.mo46926q()
            long r11 = r6.mo46929t()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r7
            long r9 = p513bj.C14049b0.m21625F(r11, r13, r15)
            long r11 = r6.mo46926q()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r7 = p513bj.C14049b0.m21625F(r11, r13, r15)
            long r11 = r6.mo46926q()
            java.lang.String r2 = r6.mo46920k()
            r2.getClass()
            java.lang.String r5 = r6.mo46920k()
            r5.getClass()
            r20 = r2
            r21 = r5
            r22 = r7
            r24 = r11
            r7 = r3
            goto L_0x051f
        L_0x04db:
            java.lang.String r2 = r6.mo46920k()
            r2.getClass()
            java.lang.String r5 = r6.mo46920k()
            r5.getClass()
            long r13 = r6.mo46926q()
            long r7 = r6.mo46926q()
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r13
            long r15 = p513bj.C14049b0.m21625F(r7, r9, r11)
            long r7 = r0.f41343w
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0503
            long r7 = r7 + r15
            r17 = r7
            goto L_0x0505
        L_0x0503:
            r17 = r3
        L_0x0505:
            long r7 = r6.mo46926q()
            r9 = 1000(0x3e8, double:4.94E-321)
            r11 = r13
            long r7 = p513bj.C14049b0.m21625F(r7, r9, r11)
            long r11 = r6.mo46926q()
            r20 = r2
            r21 = r5
            r22 = r7
            r24 = r11
            r7 = r15
            r9 = r17
        L_0x051f:
            int r2 = r6.f30988c
            int r5 = r6.f30987b
            int r2 = r2 - r5
            byte[] r5 = new byte[r2]
            r11 = 0
            r6.mo46911b(r11, r2, r5)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r2 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r19 = r2
            r26 = r5
            r19.<init>(r20, r21, r22, r24, r26)
            bj.r r5 = new bj.r
            di.b r6 = r0.f41330j
            java.io.ByteArrayOutputStream r11 = r6.f38391a
            r11.reset()
            java.io.DataOutputStream r11 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            java.lang.String r12 = r2.schemeIdUri     // Catch:{ IOException -> 0x05c2 }
            r11.writeBytes(r12)     // Catch:{ IOException -> 0x05c2 }
            r12 = 0
            r11.writeByte(r12)     // Catch:{ IOException -> 0x05c2 }
            java.lang.String r11 = r2.value     // Catch:{ IOException -> 0x05c2 }
            if (r11 == 0) goto L_0x054c
            goto L_0x054e
        L_0x054c:
            java.lang.String r11 = ""
        L_0x054e:
            java.io.DataOutputStream r12 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            r12.writeBytes(r11)     // Catch:{ IOException -> 0x05c2 }
            r11 = 0
            r12.writeByte(r11)     // Catch:{ IOException -> 0x05c2 }
            java.io.DataOutputStream r11 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            long r12 = r2.durationMs     // Catch:{ IOException -> 0x05c2 }
            p547di.C17559b.m29432a(r11, r12)     // Catch:{ IOException -> 0x05c2 }
            java.io.DataOutputStream r11 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            long r12 = r2.f31703id     // Catch:{ IOException -> 0x05c2 }
            p547di.C17559b.m29432a(r11, r12)     // Catch:{ IOException -> 0x05c2 }
            java.io.DataOutputStream r11 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            byte[] r2 = r2.messageData     // Catch:{ IOException -> 0x05c2 }
            r11.write(r2)     // Catch:{ IOException -> 0x05c2 }
            java.io.DataOutputStream r2 = r6.f38392b     // Catch:{ IOException -> 0x05c2 }
            r2.flush()     // Catch:{ IOException -> 0x05c2 }
            java.io.ByteArrayOutputStream r2 = r6.f38391a     // Catch:{ IOException -> 0x05c2 }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x05c2 }
            r5.<init>((byte[]) r2)
            int r2 = r5.f30988c
            int r6 = r5.f30987b
            int r2 = r2 - r6
            ph.v[] r6 = r0.f41318D
            int r11 = r6.length
            r12 = 0
        L_0x0583:
            if (r12 >= r11) goto L_0x0591
            r13 = r6[r12]
            r14 = 0
            r5.mo46935z(r14)
            r13.mo69899d(r2, r5)
            int r12 = r12 + 1
            goto L_0x0583
        L_0x0591:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x05a5
            java.util.ArrayDeque<wh.e$a> r3 = r0.f41333m
            wh.e$a r4 = new wh.e$a
            r4.<init>(r7, r2)
            r3.addLast(r4)
            int r3 = r0.f41340t
            int r3 = r3 + r2
            r0.f41340t = r3
            goto L_0x05c9
        L_0x05a5:
            bj.y r3 = r0.f41329i
            if (r3 == 0) goto L_0x05ad
            long r9 = r3.mo46957a(r9)
        L_0x05ad:
            ph.v[] r3 = r0.f41318D
            int r4 = r3.length
            r5 = 0
        L_0x05b1:
            if (r5 >= r4) goto L_0x05c9
            r11 = r3[r5]
            r14 = 1
            r16 = 0
            r17 = 0
            r12 = r9
            r15 = r2
            r11.mo47754c(r12, r14, r15, r16, r17)
            int r5 = r5 + 1
            goto L_0x05b1
        L_0x05c2:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x05c9:
            r2 = r28
            goto L_0x05d2
        L_0x05cc:
            r4 = r2
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69879j(r3)
        L_0x05d2:
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            long r3 = r3.f40294d
            r0.mo70189g(r3)
            goto L_0x0005
        L_0x05dd:
            int r3 = r0.f41337q
            if (r3 != 0) goto L_0x060b
            bj.r r3 = r0.f41331k
            byte[] r3 = r3.f30986a
            r6 = r2
            ph.e r6 = (p644ph.C18346e) r6
            r7 = 8
            r8 = 1
            r9 = 0
            boolean r3 = r6.mo69874g(r3, r9, r7, r8)
            if (r3 != 0) goto L_0x05f4
            goto L_0x07ea
        L_0x05f4:
            r0.f41337q = r7
            bj.r r3 = r0.f41331k
            r3.mo46935z(r9)
            bj.r r3 = r0.f41331k
            long r6 = r3.mo46926q()
            r0.f41336p = r6
            bj.r r3 = r0.f41331k
            int r3 = r3.mo46912c()
            r0.f41335o = r3
        L_0x060b:
            long r6 = r0.f41336p
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x062e
            bj.r r3 = r0.f41331k
            byte[] r3 = r3.f30986a
            r6 = r2
            ph.e r6 = (p644ph.C18346e) r6
            r7 = 8
            r8 = 0
            r6.mo69874g(r3, r7, r7, r8)
            int r3 = r0.f41337q
            int r3 = r3 + r7
            r0.f41337q = r3
            bj.r r3 = r0.f41331k
            long r6 = r3.mo46929t()
            r0.f41336p = r6
            goto L_0x065f
        L_0x062e:
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x065f
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            long r6 = r3.f40293c
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0652
            java.util.ArrayDeque<wh.a$a> r10 = r0.f41332l
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0652
            java.util.ArrayDeque<wh.a$a> r6 = r0.f41332l
            java.lang.Object r6 = r6.peek()
            wh.a$a r6 = (p701wh.C18670a.C18671a) r6
            long r6 = r6.f41286b
        L_0x0652:
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x065f
            long r8 = r3.f40294d
            long r6 = r6 - r8
            int r3 = r0.f41337q
            long r8 = (long) r3
            long r6 = r6 + r8
            r0.f41336p = r6
        L_0x065f:
            long r6 = r0.f41336p
            int r3 = r0.f41337q
            long r8 = (long) r3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x07f6
            r6 = r28
            ph.e r6 = (p644ph.C18346e) r6
            long r7 = r6.f40294d
            long r9 = (long) r3
            long r7 = r7 - r9
            int r3 = r0.f41335o
            r9 = 1835295092(0x6d646174, float:4.4175247E27)
            r10 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r3 == r10) goto L_0x067c
            if (r3 != r9) goto L_0x068f
        L_0x067c:
            boolean r3 = r0.f41320F
            if (r3 != 0) goto L_0x068f
            ph.j r3 = r0.f41317C
            ph.t$b r11 = new ph.t$b
            long r12 = r0.f41342v
            r11.<init>(r12, r7)
            r3.mo4162l(r11)
            r3 = 1
            r0.f41320F = r3
        L_0x068f:
            int r3 = r0.f41335o
            if (r3 != r10) goto L_0x06b0
            android.util.SparseArray<wh.e$b> r3 = r0.f41323c
            int r3 = r3.size()
            r11 = 0
        L_0x069a:
            if (r11 >= r3) goto L_0x06b0
            android.util.SparseArray<wh.e$b> r12 = r0.f41323c
            java.lang.Object r12 = r12.valueAt(r11)
            wh.e$b r12 = (p701wh.C18680e.C18682b) r12
            wh.n r12 = r12.f41350b
            r12.getClass()
            r12.f41419c = r7
            r12.f41418b = r7
            int r11 = r11 + 1
            goto L_0x069a
        L_0x06b0:
            int r3 = r0.f41335o
            if (r3 != r9) goto L_0x06c2
            r3 = 0
            r0.f41344x = r3
            long r3 = r0.f41336p
            long r7 = r7 + r3
            r0.f41339s = r7
            r3 = 2
            r0.f41334n = r3
            r9 = 1
            goto L_0x07ea
        L_0x06c2:
            r7 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r3 == r7) goto L_0x06ef
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r7) goto L_0x06ef
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r7) goto L_0x06ef
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r7) goto L_0x06ef
            r7 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r7) goto L_0x06ef
            if (r3 == r10) goto L_0x06ef
            r7 = 1953653094(0x74726166, float:7.6813435E31)
            if (r3 == r7) goto L_0x06ef
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r3 == r7) goto L_0x06ef
            r7 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 != r7) goto L_0x06ed
            goto L_0x06ef
        L_0x06ed:
            r7 = 0
            goto L_0x06f0
        L_0x06ef:
            r7 = 1
        L_0x06f0:
            if (r7 == 0) goto L_0x071a
            long r4 = r6.f40294d
            long r6 = r0.f41336p
            long r4 = r4 + r6
            r6 = 8
            long r4 = r4 - r6
            java.util.ArrayDeque<wh.a$a> r6 = r0.f41332l
            wh.a$a r7 = new wh.a$a
            r7.<init>(r3, r4)
            r6.push(r7)
            long r6 = r0.f41336p
            int r3 = r0.f41337q
            long r8 = (long) r3
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0711
            r0.mo70189g(r4)
            goto L_0x0716
        L_0x0711:
            r3 = 0
            r0.f41334n = r3
            r0.f41337q = r3
        L_0x0716:
            r3 = 1
        L_0x0717:
            r9 = r3
            goto L_0x07ea
        L_0x071a:
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r6) goto L_0x07a3
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r6) goto L_0x07a3
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r6) goto L_0x07a3
            if (r3 == r5) goto L_0x07a3
            r5 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r5) goto L_0x07a3
            r5 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1952867444(0x74666474, float:7.3014264E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1952868452(0x74666864, float:7.301914E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1953654136(0x74726578, float:7.6818474E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1953658222(0x7472756e, float:7.683823E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1886614376(0x70737368, float:3.013775E29)
            if (r3 == r5) goto L_0x07a3
            r5 = 1935763834(0x7361697a, float:1.785898E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r3 == r5) goto L_0x07a3
            r5 = 1935828848(0x73626770, float:1.7937577E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1936158820(0x73677064, float:1.8336489E31)
            if (r3 == r5) goto L_0x07a3
            r5 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r5) goto L_0x07a3
            r5 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r3 == r5) goto L_0x07a3
            if (r3 != r4) goto L_0x07a1
            goto L_0x07a3
        L_0x07a1:
            r15 = 0
            goto L_0x07a4
        L_0x07a3:
            r15 = 1
        L_0x07a4:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r15 == 0) goto L_0x07dc
            int r5 = r0.f41337q
            r6 = 8
            if (r5 != r6) goto L_0x07d4
            long r7 = r0.f41336p
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x07cc
            bj.r r3 = new bj.r
            int r4 = (int) r7
            r3.<init>((int) r4)
            bj.r r4 = r0.f41331k
            byte[] r4 = r4.f30986a
            byte[] r5 = r3.f30986a
            r7 = 0
            java.lang.System.arraycopy(r4, r7, r5, r7, r6)
            r0.f41338r = r3
            r3 = 1
            r0.f41334n = r3
            goto L_0x0717
        L_0x07cc:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x07d4:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x07dc:
            long r5 = r0.f41336p
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x07ee
            r3 = 0
            r0.f41338r = r3
            r3 = 1
            r0.f41334n = r3
            goto L_0x0717
        L_0x07ea:
            if (r9 != 0) goto L_0x0005
            r0 = -1
            return r0
        L_0x07ee:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x07f6:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18680e.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        int i;
        this.f41317C = jVar;
        int i2 = 0;
        this.f41334n = 0;
        this.f41337q = 0;
        C18368v[] vVarArr = new C18368v[2];
        this.f41318D = vVarArr;
        int i3 = 100;
        if ((this.f41321a & 4) != 0) {
            vVarArr[0] = jVar.mo4164r(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        C18368v[] vVarArr2 = (C18368v[]) C14049b0.m21623D(i, this.f41318D);
        this.f41318D = vVarArr2;
        for (C18368v a : vVarArr2) {
            a.mo47752a(f41314H);
        }
        this.f41319E = new C18368v[this.f41322b.size()];
        while (i2 < this.f41319E.length) {
            C18368v r = this.f41317C.mo4164r(i3, 3);
            r.mo47752a(this.f41322b.get(i2));
            this.f41319E[i2] = r;
            i2++;
            i3++;
        }
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        int size = this.f41323c.size();
        for (int i = 0; i < size; i++) {
            this.f41323c.valueAt(i).mo70193d();
        }
        this.f41333m.clear();
        this.f41340t = 0;
        this.f41341u = j2;
        this.f41332l.clear();
        this.f41334n = 0;
        this.f41337q = 0;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        return C18691k.m31544a(iVar, true, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03bb  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70189g(long r47) throws com.google.android.exoplayer2.ParserException {
        /*
            r46 = this;
            r0 = r46
            r1 = r0
            r2 = r1
        L_0x0004:
            java.util.ArrayDeque<wh.a$a> r3 = r1.f41332l
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x07aa
            java.util.ArrayDeque<wh.a$a> r3 = r1.f41332l
            java.lang.Object r3 = r3.peek()
            wh.a$a r3 = (p701wh.C18670a.C18671a) r3
            long r3 = r3.f41286b
            int r3 = (r3 > r47 ? 1 : (r3 == r47 ? 0 : -1))
            if (r3 != 0) goto L_0x07aa
            java.util.ArrayDeque<wh.a$a> r3 = r1.f41332l
            java.lang.Object r3 = r3.pop()
            r4 = r3
            wh.a$a r4 = (p701wh.C18670a.C18671a) r4
            int r3 = r4.f41285a
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            if (r3 != r5) goto L_0x0187
            java.util.ArrayList r3 = r4.f41287c
            com.google.android.exoplayer2.drm.DrmInitData r8 = m31516d(r3)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            wh.a$a r3 = r4.mo70183b(r3)
            r3.getClass()
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.ArrayList r5 = r3.f41287c
            int r5 = r5.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
        L_0x004d:
            if (r7 >= r5) goto L_0x00c0
            java.util.ArrayList r11 = r3.f41287c
            java.lang.Object r11 = r11.get(r7)
            wh.a$b r11 = (p701wh.C18670a.C18672b) r11
            int r13 = r11.f41285a
            r14 = 1953654136(0x74726578, float:7.6818474E31)
            if (r13 != r14) goto L_0x0098
            bj.r r11 = r11.f41289b
            r11.mo46935z(r6)
            int r6 = r11.mo46912c()
            int r13 = r11.mo46912c()
            int r13 = r13 + -1
            int r14 = r11.mo46912c()
            int r15 = r11.mo46912c()
            int r11 = r11.mo46912c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r16 = r3
            wh.c r3 = new wh.c
            r3.<init>(r13, r14, r15, r11)
            android.util.Pair r3 = android.util.Pair.create(r6, r3)
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r3 = r3.second
            wh.c r3 = (p701wh.C18678c) r3
            r12.put(r6, r3)
            goto L_0x00b9
        L_0x0098:
            r16 = r3
            r3 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r13 != r3) goto L_0x00b9
            bj.r r3 = r11.f41289b
            r6 = 8
            r3.mo46935z(r6)
            int r6 = r3.mo46912c()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x00b5
            long r9 = r3.mo46926q()
            goto L_0x00b9
        L_0x00b5:
            long r9 = r3.mo46929t()
        L_0x00b9:
            int r7 = r7 + 1
            r6 = 12
            r3 = r16
            goto L_0x004d
        L_0x00c0:
            ph.p r5 = new ph.p
            r5.<init>()
            int r3 = r1.f41321a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x00cd
            r3 = 1
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            r11 = 0
            wh.d r13 = new wh.d
            r13.<init>(r1)
            r6 = r9
            r9 = r3
            r10 = r11
            r11 = r13
            java.util.ArrayList r3 = p701wh.C18673b.m31505e(r4, r5, r6, r8, r9, r10, r11)
            int r4 = r3.size()
            android.util.SparseArray<wh.e$b> r5 = r1.f41323c
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0134
            r5 = 0
        L_0x00e9:
            if (r5 >= r4) goto L_0x012e
            java.lang.Object r6 = r3.get(r5)
            wh.o r6 = (p701wh.C18695o) r6
            wh.l r7 = r6.f41435a
            wh.e$b r8 = new wh.e$b
            ph.j r9 = r1.f41317C
            int r10 = r7.f41402b
            ph.v r9 = r9.mo4164r(r5, r10)
            int r10 = r7.f41401a
            int r11 = r12.size()
            r13 = 1
            if (r11 != r13) goto L_0x010e
            r10 = 0
            java.lang.Object r10 = r12.valueAt(r10)
            wh.c r10 = (p701wh.C18678c) r10
            goto L_0x0117
        L_0x010e:
            java.lang.Object r10 = r12.get(r10)
            wh.c r10 = (p701wh.C18678c) r10
            r10.getClass()
        L_0x0117:
            r8.<init>(r9, r6, r10)
            android.util.SparseArray<wh.e$b> r6 = r1.f41323c
            int r9 = r7.f41401a
            r6.put(r9, r8)
            long r8 = r1.f41342v
            long r6 = r7.f41405e
            long r6 = java.lang.Math.max(r8, r6)
            r1.f41342v = r6
            int r5 = r5 + 1
            goto L_0x00e9
        L_0x012e:
            ph.j r3 = r1.f41317C
            r3.mo4163p()
            goto L_0x0184
        L_0x0134:
            android.util.SparseArray<wh.e$b> r5 = r1.f41323c
            int r5 = r5.size()
            if (r5 != r4) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            p513bj.C14075p.m21694f(r5)
            r5 = 0
        L_0x0143:
            if (r5 >= r4) goto L_0x0184
            java.lang.Object r6 = r3.get(r5)
            wh.o r6 = (p701wh.C18695o) r6
            wh.l r7 = r6.f41435a
            android.util.SparseArray<wh.e$b> r8 = r1.f41323c
            int r9 = r7.f41401a
            java.lang.Object r8 = r8.get(r9)
            wh.e$b r8 = (p701wh.C18680e.C18682b) r8
            int r7 = r7.f41401a
            int r9 = r12.size()
            r10 = 1
            if (r9 != r10) goto L_0x0168
            r7 = 0
            java.lang.Object r7 = r12.valueAt(r7)
            wh.c r7 = (p701wh.C18678c) r7
            goto L_0x0171
        L_0x0168:
            java.lang.Object r7 = r12.get(r7)
            wh.c r7 = (p701wh.C18678c) r7
            r7.getClass()
        L_0x0171:
            r8.f41352d = r6
            r8.f41353e = r7
            ph.v r7 = r8.f41349a
            wh.l r6 = r6.f41435a
            com.google.android.exoplayer2.Format r6 = r6.f41406f
            r7.mo47752a(r6)
            r8.mo70193d()
            int r5 = r5 + 1
            goto L_0x0143
        L_0x0184:
            r4 = r0
            goto L_0x07a7
        L_0x0187:
            r5 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r3 != r5) goto L_0x0790
            android.util.SparseArray<wh.e$b> r2 = r1.f41323c
            int r3 = r1.f41321a
            byte[] r1 = r1.f41327g
            java.util.ArrayList r5 = r4.f41288d
            int r5 = r5.size()
            r6 = 0
        L_0x0199:
            if (r6 >= r5) goto L_0x06f2
            java.util.ArrayList r7 = r4.f41288d
            java.lang.Object r7 = r7.get(r6)
            wh.a$a r7 = (p701wh.C18670a.C18671a) r7
            int r8 = r7.f41285a
            r9 = 1953653094(0x74726166, float:7.6813435E31)
            if (r8 != r9) goto L_0x06d7
            r8 = 1952868452(0x74666864, float:7.301914E31)
            wh.a$b r8 = r7.mo70184c(r8)
            r8.getClass()
            bj.r r8 = r8.f41289b
            r9 = 8
            r8.mo46935z(r9)
            int r9 = r8.mo46912c()
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r10
            int r10 = r8.mo46912c()
            int r11 = r2.size()
            r12 = 1
            if (r11 != r12) goto L_0x01d6
            r10 = 0
            java.lang.Object r10 = r2.valueAt(r10)
            wh.e$b r10 = (p701wh.C18680e.C18682b) r10
            goto L_0x01dc
        L_0x01d6:
            java.lang.Object r10 = r2.get(r10)
            wh.e$b r10 = (p701wh.C18680e.C18682b) r10
        L_0x01dc:
            if (r10 != 0) goto L_0x01e0
            r10 = 0
            goto L_0x0227
        L_0x01e0:
            r11 = r9 & 1
            if (r11 == 0) goto L_0x01ee
            long r11 = r8.mo46929t()
            wh.n r13 = r10.f41350b
            r13.f41418b = r11
            r13.f41419c = r11
        L_0x01ee:
            wh.c r11 = r10.f41353e
            r12 = r9 & 2
            if (r12 == 0) goto L_0x01fb
            int r12 = r8.mo46912c()
            int r12 = r12 + -1
            goto L_0x01fd
        L_0x01fb:
            int r12 = r11.f41308a
        L_0x01fd:
            r13 = r9 & 8
            if (r13 == 0) goto L_0x0206
            int r13 = r8.mo46912c()
            goto L_0x0208
        L_0x0206:
            int r13 = r11.f41309b
        L_0x0208:
            r14 = r9 & 16
            if (r14 == 0) goto L_0x0211
            int r14 = r8.mo46912c()
            goto L_0x0213
        L_0x0211:
            int r14 = r11.f41310c
        L_0x0213:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x021c
            int r8 = r8.mo46912c()
            goto L_0x021e
        L_0x021c:
            int r8 = r11.f41311d
        L_0x021e:
            wh.n r9 = r10.f41350b
            wh.c r11 = new wh.c
            r11.<init>(r12, r13, r14, r8)
            r9.f41417a = r11
        L_0x0227:
            if (r10 != 0) goto L_0x022b
            goto L_0x06d7
        L_0x022b:
            wh.n r8 = r10.f41350b
            long r11 = r8.f41433q
            boolean r9 = r8.f41434r
            r10.mo70193d()
            r13 = 1
            r10.f41360l = r13
            r13 = 1952867444(0x74666474, float:7.3014264E31)
            wh.a$b r13 = r7.mo70184c(r13)
            if (r13 == 0) goto L_0x0264
            r14 = r3 & 2
            if (r14 != 0) goto L_0x0264
            bj.r r9 = r13.f41289b
            r11 = 8
            r9.mo46935z(r11)
            int r11 = r9.mo46912c()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 1
            if (r11 != r12) goto L_0x025b
            long r13 = r9.mo46929t()
            goto L_0x025f
        L_0x025b:
            long r13 = r9.mo46926q()
        L_0x025f:
            r8.f41433q = r13
            r8.f41434r = r12
            goto L_0x0268
        L_0x0264:
            r8.f41433q = r11
            r8.f41434r = r9
        L_0x0268:
            java.util.ArrayList r9 = r7.f41287c
            int r11 = r9.size()
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0271:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r11) goto L_0x029d
            java.lang.Object r16 = r9.get(r12)
            r17 = r2
            r2 = r16
            wh.a$b r2 = (p701wh.C18670a.C18672b) r2
            r16 = r5
            int r5 = r2.f41285a
            if (r5 != r15) goto L_0x0296
            bj.r r2 = r2.f41289b
            r5 = 12
            r2.mo46935z(r5)
            int r2 = r2.mo46928s()
            if (r2 <= 0) goto L_0x0296
            int r14 = r14 + r2
            int r13 = r13 + 1
        L_0x0296:
            int r12 = r12 + 1
            r5 = r16
            r2 = r17
            goto L_0x0271
        L_0x029d:
            r17 = r2
            r16 = r5
            r2 = 0
            r10.f41356h = r2
            r10.f41355g = r2
            r10.f41354f = r2
            wh.n r2 = r10.f41350b
            r2.f41420d = r13
            r2.f41421e = r14
            int[] r5 = r2.f41423g
            int r5 = r5.length
            if (r5 >= r13) goto L_0x02bb
            long[] r5 = new long[r13]
            r2.f41422f = r5
            int[] r5 = new int[r13]
            r2.f41423g = r5
        L_0x02bb:
            int[] r5 = r2.f41424h
            int r5 = r5.length
            if (r5 >= r14) goto L_0x02d8
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r5 = new int[r14]
            r2.f41424h = r5
            int[] r5 = new int[r14]
            r2.f41425i = r5
            long[] r5 = new long[r14]
            r2.f41426j = r5
            boolean[] r5 = new boolean[r14]
            r2.f41427k = r5
            boolean[] r5 = new boolean[r14]
            r2.f41429m = r5
        L_0x02d8:
            r2 = 0
            r5 = 0
            r12 = 0
        L_0x02db:
            if (r2 >= r11) goto L_0x04af
            java.lang.Object r18 = r9.get(r2)
            r13 = r18
            wh.a$b r13 = (p701wh.C18670a.C18672b) r13
            int r14 = r13.f41285a
            if (r14 != r15) goto L_0x0484
            int r14 = r5 + 1
            bj.r r13 = r13.f41289b
            r15 = 8
            r13.mo46935z(r15)
            int r15 = r13.mo46912c()
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r18
            r18 = r9
            wh.o r9 = r10.f41352d
            wh.l r9 = r9.f41435a
            r21 = r11
            wh.n r11 = r10.f41350b
            r22 = r14
            wh.c r14 = r11.f41417a
            int r23 = p513bj.C14049b0.f30913a
            int[] r0 = r11.f41423g
            int r23 = r13.mo46928s()
            r0[r5] = r23
            long[] r0 = r11.f41422f
            r23 = r6
            r24 = r7
            long r6 = r11.f41418b
            r0[r5] = r6
            r25 = r15 & 1
            if (r25 == 0) goto L_0x0330
            r25 = r4
            int r4 = r13.mo46912c()
            r26 = r1
            r27 = r2
            long r1 = (long) r4
            long r6 = r6 + r1
            r0[r5] = r6
            goto L_0x0336
        L_0x0330:
            r26 = r1
            r27 = r2
            r25 = r4
        L_0x0336:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x033c
            r0 = 1
            goto L_0x033d
        L_0x033c:
            r0 = 0
        L_0x033d:
            int r1 = r14.f41311d
            if (r0 == 0) goto L_0x0345
            int r1 = r13.mo46912c()
        L_0x0345:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x034b
            r2 = 1
            goto L_0x034c
        L_0x034b:
            r2 = 0
        L_0x034c:
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0352
            r4 = 1
            goto L_0x0353
        L_0x0352:
            r4 = 0
        L_0x0353:
            r6 = r15 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0359
            r6 = 1
            goto L_0x035a
        L_0x0359:
            r6 = 0
        L_0x035a:
            r7 = r15 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0360
            r7 = 1
            goto L_0x0361
        L_0x0360:
            r7 = 0
        L_0x0361:
            long[] r15 = r9.f41408h
            if (r15 == 0) goto L_0x038b
            r28 = r1
            int r1 = r15.length
            r29 = r8
            r8 = 1
            if (r1 != r8) goto L_0x0389
            r1 = 0
            r30 = r15[r1]
            r19 = 0
            int r8 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0389
            long[] r8 = r9.f41409i
            r30 = r8[r1]
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r7
            long r7 = r9.f41403c
            r34 = r7
            long r7 = p513bj.C14049b0.m21625F(r30, r32, r34)
            r19 = r7
            goto L_0x0392
        L_0x0389:
            r1 = r7
            goto L_0x0390
        L_0x038b:
            r28 = r1
            r1 = r7
            r29 = r8
        L_0x0390:
            r19 = 0
        L_0x0392:
            int[] r7 = r11.f41424h
            int[] r8 = r11.f41425i
            long[] r15 = r11.f41426j
            r30 = r7
            boolean[] r7 = r11.f41427k
            r31 = r7
            int r7 = r9.f41402b
            r32 = r10
            r10 = 2
            if (r7 != r10) goto L_0x03ab
            r7 = r3 & 1
            if (r7 == 0) goto L_0x03ab
            r7 = 1
            goto L_0x03ac
        L_0x03ab:
            r7 = 0
        L_0x03ac:
            int[] r10 = r11.f41423g
            r5 = r10[r5]
            int r5 = r5 + r12
            long r9 = r9.f41403c
            r40 = r7
            r39 = r8
            long r7 = r11.f41433q
        L_0x03b9:
            if (r12 >= r5) goto L_0x0475
            if (r2 == 0) goto L_0x03c8
            int r33 = r13.mo46912c()
            r41 = r2
            r42 = r3
            r2 = r33
            goto L_0x03ce
        L_0x03c8:
            r41 = r2
            int r2 = r14.f41309b
            r42 = r3
        L_0x03ce:
            java.lang.String r3 = "Unexpected negative value: "
            if (r2 < 0) goto L_0x0469
            if (r4 == 0) goto L_0x03dd
            int r33 = r13.mo46912c()
            r43 = r4
            r4 = r33
            goto L_0x03e1
        L_0x03dd:
            r43 = r4
            int r4 = r14.f41310c
        L_0x03e1:
            if (r4 < 0) goto L_0x045d
            if (r6 == 0) goto L_0x03ea
            int r3 = r13.mo46912c()
            goto L_0x03f3
        L_0x03ea:
            if (r12 != 0) goto L_0x03f1
            if (r0 == 0) goto L_0x03f1
            r3 = r28
            goto L_0x03f3
        L_0x03f1:
            int r3 = r14.f41311d
        L_0x03f3:
            if (r1 == 0) goto L_0x0408
            r44 = r0
            int r0 = r13.mo46912c()
            r45 = r1
            long r0 = (long) r0
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r33
            long r0 = r0 / r9
            int r0 = (int) r0
            r39[r12] = r0
            goto L_0x040f
        L_0x0408:
            r44 = r0
            r45 = r1
            r0 = 0
            r39[r12] = r0
        L_0x040f:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r7
            r37 = r9
            long r0 = p513bj.C14049b0.m21625F(r33, r35, r37)
            long r0 = r0 - r19
            r15[r12] = r0
            r33 = r5
            boolean r5 = r11.f41434r
            if (r5 != 0) goto L_0x0432
            r5 = r32
            r32 = r6
            wh.o r6 = r5.f41352d
            r34 = r5
            long r5 = r6.f41442h
            long r0 = r0 + r5
            r15[r12] = r0
            goto L_0x0436
        L_0x0432:
            r34 = r32
            r32 = r6
        L_0x0436:
            r30[r12] = r4
            int r0 = r3 >> 16
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0444
            if (r40 == 0) goto L_0x0442
            if (r12 != 0) goto L_0x0444
        L_0x0442:
            r0 = 1
            goto L_0x0445
        L_0x0444:
            r0 = 0
        L_0x0445:
            r31[r12] = r0
            long r0 = (long) r2
            long r7 = r7 + r0
            int r12 = r12 + 1
            r6 = r32
            r5 = r33
            r32 = r34
            r2 = r41
            r3 = r42
            r4 = r43
            r0 = r44
            r1 = r45
            goto L_0x03b9
        L_0x045d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 38
            java.lang.String r1 = android.support.p013v4.media.C0072d.m200g(r1, r3, r4)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0469:
            r0 = 38
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r0 = android.support.p013v4.media.C0072d.m200g(r0, r3, r2)
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0475:
            r42 = r3
            r33 = r5
            r34 = r32
            r11.f41433q = r7
            r5 = r22
            r12 = r33
            r10 = r34
            goto L_0x0496
        L_0x0484:
            r26 = r1
            r27 = r2
            r42 = r3
            r25 = r4
            r23 = r6
            r24 = r7
            r29 = r8
            r18 = r9
            r21 = r11
        L_0x0496:
            int r2 = r27 + 1
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            r0 = r46
            r9 = r18
            r11 = r21
            r6 = r23
            r7 = r24
            r4 = r25
            r1 = r26
            r8 = r29
            r3 = r42
            goto L_0x02db
        L_0x04af:
            r26 = r1
            r42 = r3
            r25 = r4
            r23 = r6
            r24 = r7
            r29 = r8
            wh.o r0 = r10.f41352d
            wh.l r0 = r0.f41435a
            r1 = r29
            wh.c r2 = r1.f41417a
            r2.getClass()
            int r2 = r2.f41308a
            wh.m[] r0 = r0.f41411k
            if (r0 != 0) goto L_0x04ce
            r0 = 0
            goto L_0x04d0
        L_0x04ce:
            r0 = r0[r2]
        L_0x04d0:
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r7 = r24
            wh.a$b r2 = r7.mo70184c(r2)
            if (r2 == 0) goto L_0x0550
            r0.getClass()
            bj.r r2 = r2.f41289b
            int r3 = r0.f41415d
            r4 = 8
            r2.mo46935z(r4)
            int r5 = r2.mo46912c()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x04f6
            r2.mo46909A(r4)
        L_0x04f6:
            int r4 = r2.mo46925p()
            int r5 = r2.mo46928s()
            int r6 = r1.f41421e
            if (r5 > r6) goto L_0x053e
            if (r4 != 0) goto L_0x051b
            boolean[] r4 = r1.f41429m
            r6 = 0
            r8 = 0
        L_0x0508:
            if (r6 >= r5) goto L_0x0519
            int r9 = r2.mo46925p()
            int r8 = r8 + r9
            if (r9 <= r3) goto L_0x0513
            r9 = 1
            goto L_0x0514
        L_0x0513:
            r9 = 0
        L_0x0514:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L_0x0508
        L_0x0519:
            r2 = 0
            goto L_0x052a
        L_0x051b:
            if (r4 <= r3) goto L_0x051f
            r2 = 1
            goto L_0x0520
        L_0x051f:
            r2 = 0
        L_0x0520:
            int r4 = r4 * r5
            r3 = 0
            int r8 = r4 + 0
            boolean[] r4 = r1.f41429m
            java.util.Arrays.fill(r4, r3, r5, r2)
            r2 = r3
        L_0x052a:
            boolean[] r3 = r1.f41429m
            int r4 = r1.f41421e
            java.util.Arrays.fill(r3, r5, r4, r2)
            if (r8 <= 0) goto L_0x0550
            bj.r r2 = r1.f41431o
            r2.mo46932w(r8)
            r2 = 1
            r1.f41428l = r2
            r1.f41432p = r2
            goto L_0x0550
        L_0x053e:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            int r1 = r1.f41421e
            r2 = 78
            java.lang.String r3 = "Saiz sample count "
            java.lang.String r4 = " is greater than fragment sample count"
            java.lang.String r1 = p003a2.C0023f.m107h(r2, r3, r5, r4, r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0550:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            wh.a$b r2 = r7.mo70184c(r2)
            if (r2 == 0) goto L_0x0598
            bj.r r2 = r2.f41289b
            r3 = 8
            r2.mo46935z(r3)
            int r4 = r2.mo46912c()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x056f
            r2.mo46909A(r3)
        L_0x056f:
            int r3 = r2.mo46928s()
            if (r3 != r6) goto L_0x058a
            int r3 = r4 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r4 = r1.f41419c
            if (r3 != 0) goto L_0x0582
            long r2 = r2.mo46926q()
            goto L_0x0586
        L_0x0582:
            long r2 = r2.mo46929t()
        L_0x0586:
            long r4 = r4 + r2
            r1.f41419c = r4
            goto L_0x0598
        L_0x058a:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 40
            java.lang.String r2 = "Unexpected saio entry count: "
            java.lang.String r1 = android.support.p013v4.media.C0072d.m200g(r1, r2, r3)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0598:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            wh.a$b r2 = r7.mo70184c(r2)
            if (r2 == 0) goto L_0x05a7
            bj.r r2 = r2.f41289b
            r3 = 0
            m31517e(r2, r3, r1)
        L_0x05a7:
            if (r0 == 0) goto L_0x05ac
            java.lang.String r0 = r0.f41413b
            goto L_0x05ad
        L_0x05ac:
            r0 = 0
        L_0x05ad:
            r10 = r0
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x05b1:
            java.util.ArrayList r4 = r7.f41287c
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x05ee
            java.util.ArrayList r4 = r7.f41287c
            java.lang.Object r4 = r4.get(r0)
            wh.a$b r4 = (p701wh.C18670a.C18672b) r4
            bj.r r5 = r4.f41289b
            int r4 = r4.f41285a
            r6 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r4 != r6) goto L_0x05da
            r4 = 12
            r5.mo46935z(r4)
            int r4 = r5.mo46912c()
            if (r4 != r8) goto L_0x05eb
            r2 = r5
            goto L_0x05eb
        L_0x05da:
            r6 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r4 != r9) goto L_0x05eb
            r5.mo46935z(r6)
            int r4 = r5.mo46912c()
            if (r4 != r8) goto L_0x05eb
            r3 = r5
        L_0x05eb:
            int r0 = r0 + 1
            goto L_0x05b1
        L_0x05ee:
            if (r2 == 0) goto L_0x0699
            if (r3 != 0) goto L_0x05f4
            goto L_0x0699
        L_0x05f4:
            r0 = 8
            r2.mo46935z(r0)
            int r0 = r2.mo46912c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 4
            r2.mo46909A(r4)
            r5 = 1
            if (r0 != r5) goto L_0x060b
            r2.mo46909A(r4)
        L_0x060b:
            int r0 = r2.mo46912c()
            if (r0 != r5) goto L_0x0691
            r0 = 8
            r3.mo46935z(r0)
            int r0 = r3.mo46912c()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.mo46909A(r4)
            if (r0 != r5) goto L_0x0636
            long r4 = r3.mo46926q()
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x062e
            goto L_0x063c
        L_0x062e:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0636:
            r2 = 2
            if (r0 < r2) goto L_0x063c
            r3.mo46909A(r4)
        L_0x063c:
            long r4 = r3.mo46926q()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0689
            r0 = 1
            r3.mo46909A(r0)
            int r2 = r3.mo46925p()
            r4 = r2 & 240(0xf0, float:3.36E-43)
            int r13 = r4 >> 4
            r14 = r2 & 15
            int r2 = r3.mo46925p()
            if (r2 != r0) goto L_0x065c
            r0 = 1
            goto L_0x065d
        L_0x065c:
            r0 = 0
        L_0x065d:
            r9 = r0
            if (r9 != 0) goto L_0x0661
            goto L_0x0699
        L_0x0661:
            int r11 = r3.mo46925p()
            r0 = 16
            byte[] r12 = new byte[r0]
            r2 = 0
            r3.mo46911b(r2, r0, r12)
            if (r11 != 0) goto L_0x067b
            int r0 = r3.mo46925p()
            byte[] r4 = new byte[r0]
            r3.mo46911b(r2, r0, r4)
            r0 = 1
            r15 = r4
            goto L_0x067e
        L_0x067b:
            r0 = 1
            r2 = 0
            r15 = r2
        L_0x067e:
            r1.f41428l = r0
            wh.m r0 = new wh.m
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.f41430n = r0
            goto L_0x0699
        L_0x0689:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0691:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0699:
            java.util.ArrayList r0 = r7.f41287c
            int r0 = r0.size()
            r2 = 0
        L_0x06a0:
            if (r2 >= r0) goto L_0x06d4
            java.util.ArrayList r3 = r7.f41287c
            java.lang.Object r3 = r3.get(r2)
            wh.a$b r3 = (p701wh.C18670a.C18672b) r3
            int r4 = r3.f41285a
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 != r5) goto L_0x06cd
            bj.r r3 = r3.f41289b
            r4 = 8
            r3.mo46935z(r4)
            r4 = 16
            r5 = 0
            r6 = r26
            r3.mo46911b(r5, r4, r6)
            byte[] r5 = f41313G
            boolean r5 = java.util.Arrays.equals(r6, r5)
            if (r5 != 0) goto L_0x06c9
            goto L_0x06cf
        L_0x06c9:
            m31517e(r3, r4, r1)
            goto L_0x06cf
        L_0x06cd:
            r6 = r26
        L_0x06cf:
            int r2 = r2 + 1
            r26 = r6
            goto L_0x06a0
        L_0x06d4:
            r6 = r26
            goto L_0x06e2
        L_0x06d7:
            r17 = r2
            r42 = r3
            r25 = r4
            r16 = r5
            r23 = r6
            r6 = r1
        L_0x06e2:
            int r0 = r23 + 1
            r1 = r6
            r5 = r16
            r2 = r17
            r4 = r25
            r3 = r42
            r6 = r0
            r0 = r46
            goto L_0x0199
        L_0x06f2:
            r3 = r4
            java.util.ArrayList r0 = r3.f41287c
            com.google.android.exoplayer2.drm.DrmInitData r0 = m31516d(r0)
            r4 = r46
            if (r0 == 0) goto L_0x0744
            android.util.SparseArray<wh.e$b> r1 = r4.f41323c
            int r1 = r1.size()
            r2 = 0
        L_0x0704:
            if (r2 >= r1) goto L_0x0744
            android.util.SparseArray<wh.e$b> r3 = r4.f41323c
            java.lang.Object r3 = r3.valueAt(r2)
            wh.e$b r3 = (p701wh.C18680e.C18682b) r3
            wh.o r5 = r3.f41352d
            wh.l r5 = r5.f41435a
            wh.n r6 = r3.f41350b
            wh.c r6 = r6.f41417a
            int r7 = p513bj.C14049b0.f30913a
            int r6 = r6.f41308a
            wh.m[] r5 = r5.f41411k
            if (r5 != 0) goto L_0x0720
            r5 = 0
            goto L_0x0722
        L_0x0720:
            r5 = r5[r6]
        L_0x0722:
            if (r5 == 0) goto L_0x0727
            java.lang.String r5 = r5.f41413b
            goto L_0x0728
        L_0x0727:
            r5 = 0
        L_0x0728:
            com.google.android.exoplayer2.drm.DrmInitData r5 = r0.copyWithSchemeType(r5)
            wh.o r6 = r3.f41352d
            wh.l r6 = r6.f41435a
            com.google.android.exoplayer2.Format r6 = r6.f41406f
            com.google.android.exoplayer2.Format$b r6 = r6.buildUpon()
            r6.f31306n = r5
            com.google.android.exoplayer2.Format r5 = r6.mo47144a()
            ph.v r3 = r3.f41349a
            r3.mo47752a(r5)
            int r2 = r2 + 1
            goto L_0x0704
        L_0x0744:
            long r0 = r4.f41341u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x078d
            android.util.SparseArray<wh.e$b> r0 = r4.f41323c
            int r0 = r0.size()
            r1 = 0
        L_0x0756:
            if (r1 >= r0) goto L_0x0786
            android.util.SparseArray<wh.e$b> r2 = r4.f41323c
            java.lang.Object r2 = r2.valueAt(r1)
            wh.e$b r2 = (p701wh.C18680e.C18682b) r2
            long r5 = r4.f41341u
            int r3 = r2.f41354f
        L_0x0764:
            wh.n r7 = r2.f41350b
            int r8 = r7.f41421e
            if (r3 >= r8) goto L_0x0783
            long[] r8 = r7.f41426j
            r9 = r8[r3]
            int[] r8 = r7.f41425i
            r8 = r8[r3]
            long r11 = (long) r8
            long r9 = r9 + r11
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0783
            boolean[] r7 = r7.f41427k
            boolean r7 = r7[r3]
            if (r7 == 0) goto L_0x0780
            r2.f41357i = r3
        L_0x0780:
            int r3 = r3 + 1
            goto L_0x0764
        L_0x0783:
            int r1 = r1 + 1
            goto L_0x0756
        L_0x0786:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f41341u = r0
        L_0x078d:
            r1 = r4
            r2 = r1
            goto L_0x07a7
        L_0x0790:
            r3 = r4
            r4 = r0
            java.util.ArrayDeque<wh.a$a> r0 = r1.f41332l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x07a7
            java.util.ArrayDeque<wh.a$a> r0 = r1.f41332l
            java.lang.Object r0 = r0.peek()
            wh.a$a r0 = (p701wh.C18670a.C18671a) r0
            java.util.ArrayList r0 = r0.f41288d
            r0.add(r3)
        L_0x07a7:
            r0 = r4
            goto L_0x0004
        L_0x07aa:
            r4 = r0
            r0 = 0
            r2.f41334n = r0
            r2.f41337q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18680e.mo70189g(long):void");
    }

    public final void release() {
    }

    public C18680e(int i, C14086y yVar, List list) {
        this.f41321a = i;
        this.f41329i = yVar;
        this.f41322b = Collections.unmodifiableList(list);
        this.f41330j = new C17559b();
        this.f41331k = new C14077r(16);
        this.f41324d = new C14077r(C14068n.f30955a);
        this.f41325e = new C14077r(5);
        this.f41326f = new C14077r();
        byte[] bArr = new byte[16];
        this.f41327g = bArr;
        this.f41328h = new C14077r(bArr);
        this.f41332l = new ArrayDeque<>();
        this.f41333m = new ArrayDeque<>();
        this.f41323c = new SparseArray<>();
        this.f41342v = -9223372036854775807L;
        this.f41341u = -9223372036854775807L;
        this.f41343w = -9223372036854775807L;
        this.f41317C = C18351j.f40301i1;
        this.f41318D = new C18368v[0];
        this.f41319E = new C18368v[0];
    }
}
