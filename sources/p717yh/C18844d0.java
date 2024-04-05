package p717yh;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.compose.foundation.layout.C0761x;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14075p;
import p513bj.C14076q;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p717yh.C18848e0;

/* renamed from: yh.d0 */
public final class C18844d0 implements C18349h {

    /* renamed from: a */
    public final int f41753a;

    /* renamed from: b */
    public final List<C14086y> f41754b;

    /* renamed from: c */
    public final C14077r f41755c;

    /* renamed from: d */
    public final SparseIntArray f41756d;

    /* renamed from: e */
    public final C18848e0.C18851c f41757e;

    /* renamed from: f */
    public final SparseArray<C18848e0> f41758f;

    /* renamed from: g */
    public final SparseBooleanArray f41759g;

    /* renamed from: h */
    public final SparseBooleanArray f41760h;

    /* renamed from: i */
    public final C18842c0 f41761i;

    /* renamed from: j */
    public C18839b0 f41762j;

    /* renamed from: k */
    public C18351j f41763k;

    /* renamed from: l */
    public int f41764l;

    /* renamed from: m */
    public boolean f41765m;

    /* renamed from: n */
    public boolean f41766n;

    /* renamed from: o */
    public boolean f41767o;

    /* renamed from: p */
    public C18848e0 f41768p;

    /* renamed from: q */
    public int f41769q;

    /* renamed from: r */
    public int f41770r;

    /* renamed from: yh.d0$a */
    public class C18845a implements C18881y {

        /* renamed from: a */
        public final C14076q f41771a = new C14076q(4, new byte[4]);

        public C18845a() {
        }

        /* renamed from: a */
        public final void mo70287a(C14077r rVar) {
            if (rVar.mo46925p() == 0 && (rVar.mo46925p() & 128) != 0) {
                rVar.mo46909A(6);
                int i = (rVar.f30988c - rVar.f30987b) / 4;
                for (int i2 = 0; i2 < i; i2++) {
                    C14076q qVar = this.f41771a;
                    rVar.mo46911b(0, 4, (byte[]) qVar.f30985d);
                    qVar.mo46905l(0);
                    int h = this.f41771a.mo46901h(16);
                    this.f41771a.mo46907n(3);
                    if (h == 0) {
                        this.f41771a.mo46907n(13);
                    } else {
                        int h2 = this.f41771a.mo46901h(13);
                        if (C18844d0.this.f41758f.get(h2) == null) {
                            C18844d0 d0Var = C18844d0.this;
                            d0Var.f41758f.put(h2, new C18882z(new C18846b(h2)));
                            C18844d0.this.f41764l++;
                        }
                    }
                }
                C18844d0 d0Var2 = C18844d0.this;
                if (d0Var2.f41753a != 2) {
                    d0Var2.f41758f.remove(0);
                }
            }
        }

        /* renamed from: b */
        public final void mo70288b(C14086y yVar, C18351j jVar, C18848e0.C18852d dVar) {
        }
    }

    /* renamed from: yh.d0$b */
    public class C18846b implements C18881y {

        /* renamed from: a */
        public final C14076q f41773a = new C14076q(5, new byte[5]);

        /* renamed from: b */
        public final SparseArray<C18848e0> f41774b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f41775c = new SparseIntArray();

        /* renamed from: d */
        public final int f41776d;

        public C18846b(int i) {
            this.f41776d = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
            if (r24.mo46925p() == r13) goto L_0x014d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0224 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70287a(p513bj.C14077r r24) {
            /*
                r23 = this;
                r1 = r23
                r0 = r24
                int r2 = r24.mo46925p()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                yh.d0 r2 = p717yh.C18844d0.this
                int r4 = r2.f41753a
                r5 = 1
                r6 = 0
                if (r4 == r5) goto L_0x0038
                if (r4 == r3) goto L_0x0038
                int r4 = r2.f41764l
                if (r4 != r5) goto L_0x001b
                goto L_0x0038
            L_0x001b:
                bj.y r4 = new bj.y
                java.util.List<bj.y> r2 = r2.f41754b
                java.lang.Object r2 = r2.get(r6)
                bj.y r2 = (p513bj.C14086y) r2
                monitor-enter(r2)
                long r7 = r2.f31018b     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)
                r4.<init>(r7)
                yh.d0 r2 = p717yh.C18844d0.this
                java.util.List<bj.y> r2 = r2.f41754b
                r2.add(r4)
                goto L_0x0041
            L_0x0034:
                r0 = move-exception
                r3 = r0
                monitor-exit(r2)
                throw r3
            L_0x0038:
                java.util.List<bj.y> r2 = r2.f41754b
                java.lang.Object r2 = r2.get(r6)
                r4 = r2
                bj.y r4 = (p513bj.C14086y) r4
            L_0x0041:
                int r2 = r24.mo46925p()
                r2 = r2 & 128(0x80, float:1.794E-43)
                if (r2 != 0) goto L_0x004a
                return
            L_0x004a:
                r0.mo46909A(r5)
                int r2 = r24.mo46930u()
                r7 = 3
                r0.mo46909A(r7)
                bj.q r8 = r1.f41773a
                java.lang.Object r9 = r8.f30985d
                byte[] r9 = (byte[]) r9
                r0.mo46911b(r6, r3, r9)
                r8.mo46905l(r6)
                bj.q r8 = r1.f41773a
                r8.mo46907n(r7)
                yh.d0 r8 = p717yh.C18844d0.this
                bj.q r9 = r1.f41773a
                r10 = 13
                int r9 = r9.mo46901h(r10)
                r8.f41770r = r9
                bj.q r8 = r1.f41773a
                java.lang.Object r9 = r8.f30985d
                byte[] r9 = (byte[]) r9
                r0.mo46911b(r6, r3, r9)
                r8.mo46905l(r6)
                bj.q r8 = r1.f41773a
                r9 = 4
                r8.mo46907n(r9)
                bj.q r8 = r1.f41773a
                r11 = 12
                int r8 = r8.mo46901h(r11)
                r0.mo46909A(r8)
                yh.d0 r8 = p717yh.C18844d0.this
                int r12 = r8.f41753a
                r13 = 21
                r14 = 0
                r15 = 8192(0x2000, float:1.14794E-41)
                if (r12 != r3) goto L_0x00bd
                yh.e0 r8 = r8.f41768p
                if (r8 != 0) goto L_0x00bd
                yh.e0$b r8 = new yh.e0$b
                byte[] r12 = p513bj.C14049b0.f30918f
                r8.<init>(r13, r14, r14, r12)
                yh.d0 r12 = p717yh.C18844d0.this
                yh.e0$c r14 = r12.f41757e
                yh.e0 r8 = r14.mo70292a(r13, r8)
                r12.f41768p = r8
                yh.d0 r8 = p717yh.C18844d0.this
                yh.e0 r12 = r8.f41768p
                ph.j r8 = r8.f41763k
                yh.e0$d r14 = new yh.e0$d
                r14.<init>(r2, r13, r15)
                r12.mo70290b(r4, r8, r14)
            L_0x00bd:
                android.util.SparseArray<yh.e0> r8 = r1.f41774b
                r8.clear()
                android.util.SparseIntArray r8 = r1.f41775c
                r8.clear()
                int r8 = r0.f30988c
                int r12 = r0.f30987b
                int r8 = r8 - r12
            L_0x00cc:
                if (r8 <= 0) goto L_0x0232
                bj.q r14 = r1.f41773a
                java.lang.Object r12 = r14.f30985d
                byte[] r12 = (byte[]) r12
                r5 = 5
                r0.mo46911b(r6, r5, r12)
                r14.mo46905l(r6)
                bj.q r12 = r1.f41773a
                r14 = 8
                int r12 = r12.mo46901h(r14)
                bj.q r14 = r1.f41773a
                r14.mo46907n(r7)
                bj.q r14 = r1.f41773a
                int r14 = r14.mo46901h(r10)
                bj.q r10 = r1.f41773a
                r10.mo46907n(r9)
                bj.q r10 = r1.f41773a
                int r10 = r10.mo46901h(r11)
                int r11 = r0.f30987b
                int r15 = r10 + r11
                r3 = -1
                r17 = 0
                r18 = 0
            L_0x0102:
                int r6 = r0.f30987b
                if (r6 >= r15) goto L_0x01c3
                int r6 = r24.mo46925p()
                int r16 = r24.mo46925p()
                int r9 = r0.f30987b
                int r9 = r9 + r16
                if (r9 <= r15) goto L_0x0117
                r5 = 4
                goto L_0x01c4
            L_0x0117:
                r16 = 172(0xac, float:2.41E-43)
                r19 = 135(0x87, float:1.89E-43)
                r20 = 129(0x81, float:1.81E-43)
                r7 = 89
                if (r6 != r5) goto L_0x0147
                long r6 = r24.mo46926q()
                r21 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r21 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
                if (r21 != 0) goto L_0x012d
                goto L_0x014b
            L_0x012d:
                r21 = 1161904947(0x45414333, double:5.74057318E-315)
                int r20 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
                if (r20 != 0) goto L_0x0135
                goto L_0x0153
            L_0x0135:
                r19 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r19 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r19 != 0) goto L_0x013d
                goto L_0x0160
            L_0x013d:
                r19 = 1212503619(0x48455643, double:5.990563836E-315)
                int r6 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r6 != 0) goto L_0x0161
                r3 = 36
                goto L_0x0161
            L_0x0147:
                r5 = 106(0x6a, float:1.49E-43)
                if (r6 != r5) goto L_0x014f
            L_0x014b:
                r16 = r20
            L_0x014d:
                r5 = 3
                goto L_0x0179
            L_0x014f:
                r5 = 122(0x7a, float:1.71E-43)
                if (r6 != r5) goto L_0x0156
            L_0x0153:
                r3 = r19
                goto L_0x017b
            L_0x0156:
                r5 = 127(0x7f, float:1.78E-43)
                if (r6 != r5) goto L_0x0163
                int r5 = r24.mo46925p()
                if (r5 != r13) goto L_0x0161
            L_0x0160:
                goto L_0x014d
            L_0x0161:
                r5 = 3
                goto L_0x0177
            L_0x0163:
                r5 = 123(0x7b, float:1.72E-43)
                if (r6 != r5) goto L_0x016a
                r3 = 138(0x8a, float:1.93E-43)
                goto L_0x0161
            L_0x016a:
                r5 = 10
                if (r6 != r5) goto L_0x017d
                r5 = 3
                java.lang.String r6 = r0.mo46922m(r5)
                java.lang.String r17 = r6.trim()
            L_0x0177:
                r16 = r3
            L_0x0179:
                r3 = r16
            L_0x017b:
                r5 = 4
                goto L_0x01b6
            L_0x017d:
                r5 = 3
                if (r6 != r7) goto L_0x01af
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x0185:
                int r6 = r0.f30987b
                if (r6 >= r9) goto L_0x01a9
                java.lang.String r6 = r0.mo46922m(r5)
                java.lang.String r6 = r6.trim()
                r24.mo46925p()
                r5 = 4
                byte[] r7 = new byte[r5]
                r13 = 0
                r0.mo46911b(r13, r5, r7)
                yh.e0$a r13 = new yh.e0$a
                r13.<init>(r6, r7)
                r3.add(r13)
                r5 = 3
                r7 = 89
                r13 = 21
                goto L_0x0185
            L_0x01a9:
                r5 = 4
                r18 = r3
                r3 = 89
                goto L_0x01b6
            L_0x01af:
                r5 = 4
                r7 = 111(0x6f, float:1.56E-43)
                if (r6 != r7) goto L_0x01b6
                r3 = 257(0x101, float:3.6E-43)
            L_0x01b6:
                int r6 = r0.f30987b
                int r9 = r9 - r6
                r0.mo46909A(r9)
                r9 = r5
                r5 = 5
                r7 = 3
                r13 = 21
                goto L_0x0102
            L_0x01c3:
                r5 = r9
            L_0x01c4:
                r0.mo46935z(r15)
                yh.e0$b r6 = new yh.e0$b
                byte[] r7 = r0.f30986a
                byte[] r7 = java.util.Arrays.copyOfRange(r7, r11, r15)
                r9 = r17
                r11 = r18
                r6.<init>(r3, r9, r11, r7)
                r7 = 6
                if (r12 == r7) goto L_0x01dc
                r7 = 5
                if (r12 != r7) goto L_0x01dd
            L_0x01dc:
                r12 = r3
            L_0x01dd:
                int r10 = r10 + 5
                int r8 = r8 - r10
                yh.d0 r3 = p717yh.C18844d0.this
                int r7 = r3.f41753a
                r9 = 2
                if (r7 != r9) goto L_0x01e9
                r7 = r12
                goto L_0x01ea
            L_0x01e9:
                r7 = r14
            L_0x01ea:
                android.util.SparseBooleanArray r3 = r3.f41759g
                boolean r3 = r3.get(r7)
                if (r3 == 0) goto L_0x01f5
                r10 = 21
                goto L_0x0224
            L_0x01f5:
                yh.d0 r3 = p717yh.C18844d0.this
                int r10 = r3.f41753a
                if (r10 != r9) goto L_0x0202
                r10 = 21
                if (r12 != r10) goto L_0x0204
                yh.e0 r3 = r3.f41768p
                goto L_0x020a
            L_0x0202:
                r10 = 21
            L_0x0204:
                yh.e0$c r3 = r3.f41757e
                yh.e0 r3 = r3.mo70292a(r12, r6)
            L_0x020a:
                yh.d0 r6 = p717yh.C18844d0.this
                int r6 = r6.f41753a
                if (r6 != r9) goto L_0x021a
                android.util.SparseIntArray r6 = r1.f41775c
                r9 = 8192(0x2000, float:1.14794E-41)
                int r6 = r6.get(r7, r9)
                if (r14 >= r6) goto L_0x0224
            L_0x021a:
                android.util.SparseIntArray r6 = r1.f41775c
                r6.put(r7, r14)
                android.util.SparseArray<yh.e0> r6 = r1.f41774b
                r6.put(r7, r3)
            L_0x0224:
                r9 = r5
                r13 = r10
                r3 = 2
                r5 = 1
                r6 = 0
                r7 = 3
                r10 = 13
                r11 = 12
                r15 = 8192(0x2000, float:1.14794E-41)
                goto L_0x00cc
            L_0x0232:
                android.util.SparseIntArray r0 = r1.f41775c
                int r0 = r0.size()
                r13 = 0
            L_0x0239:
                if (r13 >= r0) goto L_0x0282
                android.util.SparseIntArray r3 = r1.f41775c
                int r3 = r3.keyAt(r13)
                android.util.SparseIntArray r5 = r1.f41775c
                int r5 = r5.valueAt(r13)
                yh.d0 r6 = p717yh.C18844d0.this
                android.util.SparseBooleanArray r6 = r6.f41759g
                r7 = 1
                r6.put(r3, r7)
                yh.d0 r6 = p717yh.C18844d0.this
                android.util.SparseBooleanArray r6 = r6.f41760h
                r6.put(r5, r7)
                android.util.SparseArray<yh.e0> r6 = r1.f41774b
                java.lang.Object r6 = r6.valueAt(r13)
                yh.e0 r6 = (p717yh.C18848e0) r6
                if (r6 == 0) goto L_0x027d
                yh.d0 r7 = p717yh.C18844d0.this
                yh.e0 r8 = r7.f41768p
                if (r6 == r8) goto L_0x0273
                ph.j r7 = r7.f41763k
                yh.e0$d r8 = new yh.e0$d
                r9 = 8192(0x2000, float:1.14794E-41)
                r8.<init>(r2, r3, r9)
                r6.mo70290b(r4, r7, r8)
                goto L_0x0275
            L_0x0273:
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x0275:
                yh.d0 r3 = p717yh.C18844d0.this
                android.util.SparseArray<yh.e0> r3 = r3.f41758f
                r3.put(r5, r6)
                goto L_0x027f
            L_0x027d:
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x027f:
                int r13 = r13 + 1
                goto L_0x0239
            L_0x0282:
                yh.d0 r0 = p717yh.C18844d0.this
                int r2 = r0.f41753a
                r3 = 2
                if (r2 != r3) goto L_0x029b
                boolean r2 = r0.f41765m
                if (r2 != 0) goto L_0x02be
                ph.j r0 = r0.f41763k
                r0.mo4163p()
                yh.d0 r0 = p717yh.C18844d0.this
                r2 = 0
                r0.f41764l = r2
                r3 = 1
                r0.f41765m = r3
                goto L_0x02be
            L_0x029b:
                r2 = 0
                r3 = 1
                android.util.SparseArray<yh.e0> r0 = r0.f41758f
                int r4 = r1.f41776d
                r0.remove(r4)
                yh.d0 r0 = p717yh.C18844d0.this
                int r4 = r0.f41753a
                if (r4 != r3) goto L_0x02ac
                r6 = r2
                goto L_0x02b1
            L_0x02ac:
                int r2 = r0.f41764l
                r4 = -1
                int r6 = r2 + -1
            L_0x02b1:
                r0.f41764l = r6
                if (r6 != 0) goto L_0x02be
                ph.j r0 = r0.f41763k
                r0.mo4163p()
                yh.d0 r0 = p717yh.C18844d0.this
                r0.f41765m = r3
            L_0x02be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p717yh.C18844d0.C18846b.mo70287a(bj.r):void");
        }

        /* renamed from: b */
        public final void mo70288b(C14086y yVar, C18351j jVar, C18848e0.C18852d dVar) {
        }
    }

    public C18844d0() {
        this(1, new C14086y(0), new C18855g(0, ImmutableList.m25826of()));
    }

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long j;
        long j2;
        C18363s sVar2 = sVar;
        C18346e eVar = (C18346e) iVar;
        long j3 = eVar.f40293c;
        int i2 = 1;
        if (this.f41765m) {
            if ((j3 == -1 || this.f41753a == 2) ? false : true) {
                C18842c0 c0Var = this.f41761i;
                if (!c0Var.f41734d) {
                    int i3 = this.f41770r;
                    if (i3 <= 0) {
                        c0Var.mo70286a(eVar);
                        return 0;
                    }
                    if (!c0Var.f41736f) {
                        int min = (int) Math.min((long) c0Var.f41731a, j3);
                        long j4 = j3 - ((long) min);
                        if (eVar.f40294d != j4) {
                            sVar2.f40327a = j4;
                            return i2;
                        }
                        c0Var.f41733c.mo46932w(min);
                        eVar.f40296f = 0;
                        eVar.mo69872c(c0Var.f41733c.f30986a, 0, min, false);
                        C14077r rVar = c0Var.f41733c;
                        int i4 = rVar.f30987b;
                        int i5 = rVar.f30988c;
                        while (true) {
                            i5--;
                            if (i5 < i4) {
                                j2 = -9223372036854775807L;
                                break;
                            } else if (rVar.f30986a[i5] == 71) {
                                long C0 = C0761x.m1660C0(rVar, i5, i3);
                                if (C0 != -9223372036854775807L) {
                                    j2 = C0;
                                    break;
                                }
                            }
                        }
                        c0Var.f41738h = j2;
                        c0Var.f41736f = true;
                    } else if (c0Var.f41738h == -9223372036854775807L) {
                        c0Var.mo70286a(eVar);
                        return 0;
                    } else if (!c0Var.f41735e) {
                        int min2 = (int) Math.min((long) c0Var.f41731a, j3);
                        long j5 = (long) 0;
                        if (eVar.f40294d != j5) {
                            sVar2.f40327a = j5;
                            return i2;
                        }
                        c0Var.f41733c.mo46932w(min2);
                        eVar.f40296f = 0;
                        eVar.mo69872c(c0Var.f41733c.f30986a, 0, min2, false);
                        C14077r rVar2 = c0Var.f41733c;
                        int i6 = rVar2.f30987b;
                        int i7 = rVar2.f30988c;
                        while (true) {
                            if (i6 >= i7) {
                                j = -9223372036854775807L;
                                break;
                            }
                            if (rVar2.f30986a[i6] == 71) {
                                long C02 = C0761x.m1660C0(rVar2, i6, i3);
                                if (C02 != -9223372036854775807L) {
                                    j = C02;
                                    break;
                                }
                            }
                            i6++;
                        }
                        c0Var.f41737g = j;
                        c0Var.f41735e = true;
                    } else {
                        long j6 = c0Var.f41737g;
                        if (j6 == -9223372036854775807L) {
                            c0Var.mo70286a(eVar);
                            return 0;
                        }
                        c0Var.f41739i = c0Var.f41732b.mo46958b(c0Var.f41738h) - c0Var.f41732b.mo46958b(j6);
                        c0Var.mo70286a(eVar);
                        return 0;
                    }
                    i2 = 0;
                    return i2;
                }
            }
            if (!this.f41766n) {
                this.f41766n = true;
                C18842c0 c0Var2 = this.f41761i;
                long j7 = c0Var2.f41739i;
                if (j7 != -9223372036854775807L) {
                    z = false;
                    z2 = true;
                    C18839b0 b0Var = new C18839b0(c0Var2.f41732b, j7, j3, this.f41770r, 112800);
                    this.f41762j = b0Var;
                    this.f41763k.mo4162l(b0Var.f40256a);
                } else {
                    z = false;
                    z2 = true;
                    this.f41763k.mo4162l(new C18364t.C18366b(j7));
                }
            } else {
                z = false;
                z2 = true;
            }
            if (this.f41767o) {
                this.f41767o = z;
                mo47759c(0, 0);
                if (eVar.f40294d != 0) {
                    sVar2.f40327a = 0;
                    return z2 ? 1 : 0;
                }
            }
            C18839b0 b0Var2 = this.f41762j;
            if (b0Var2 != null) {
                if (b0Var2.f40258c != null ? z2 : z) {
                    return b0Var2.mo69866a(eVar, sVar2);
                }
            }
        } else {
            z = false;
            z2 = true;
        }
        C14077r rVar3 = this.f41755c;
        byte[] bArr = rVar3.f30986a;
        int i8 = rVar3.f30987b;
        if (9400 - i8 < 188) {
            int i9 = rVar3.f30988c - i8;
            if (i9 > 0) {
                System.arraycopy(bArr, i8, bArr, z, i9);
            }
            this.f41755c.mo46933x(i9, bArr);
        }
        while (true) {
            C14077r rVar4 = this.f41755c;
            int i10 = rVar4.f30988c;
            if (i10 - rVar4.f30987b >= 188) {
                i = -1;
                z3 = z2;
                break;
            }
            int read = eVar.read(bArr, i10, 9400 - i10);
            i = -1;
            if (read == -1) {
                z3 = z;
                break;
            }
            this.f41755c.mo46934y(i10 + read);
        }
        if (!z3) {
            return i;
        }
        C14077r rVar5 = this.f41755c;
        int i11 = rVar5.f30987b;
        int i12 = rVar5.f30988c;
        byte[] bArr2 = rVar5.f30986a;
        int i13 = i11;
        while (i13 < i12 && bArr2[i13] != 71) {
            i13++;
        }
        this.f41755c.mo46935z(i13);
        int i14 = i13 + 188;
        if (i14 > i12) {
            int i15 = (i13 - i11) + this.f41769q;
            this.f41769q = i15;
            if (this.f41753a == 2 && i15 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f41769q = z;
        }
        C14077r rVar6 = this.f41755c;
        int i16 = rVar6.f30988c;
        if (i14 > i16) {
            return z;
        }
        int c = rVar6.mo46912c();
        if ((8388608 & c) != 0) {
            this.f41755c.mo46935z(i14);
            return z;
        }
        boolean z4 = ((4194304 & c) != 0 ? z2 : z) | false;
        int i17 = (2096896 & c) >> 8;
        boolean z5 = (c & 32) != 0 ? z2 : z;
        C18848e0 e0Var = (c & 16) != 0 ? z2 : z ? this.f41758f.get(i17) : null;
        if (e0Var == null) {
            this.f41755c.mo46935z(i14);
            return z;
        }
        if (this.f41753a != 2) {
            int i18 = c & 15;
            int i19 = this.f41756d.get(i17, i18 - 1);
            this.f41756d.put(i17, i18);
            if (i19 == i18) {
                this.f41755c.mo46935z(i14);
                return z;
            } else if (i18 != ((i19 + z2) & 15)) {
                e0Var.mo70291c();
            }
        }
        if (z5) {
            int p = this.f41755c.mo46925p();
            z4 |= (this.f41755c.mo46925p() & 64) != 0 ? 2 : z;
            this.f41755c.mo46909A(p - (z2 ? 1 : 0));
        }
        boolean z6 = this.f41765m;
        if ((this.f41753a == 2 || z6 || !this.f41760h.get(i17, z)) ? z2 : z) {
            this.f41755c.mo46934y(i14);
            e0Var.mo70289a(z4 ? 1 : 0, this.f41755c);
            this.f41755c.mo46934y(i16);
        }
        if (this.f41753a != 2 && !z6 && this.f41765m && j3 != -1) {
            this.f41767o = z2;
        }
        this.f41755c.mo46935z(i14);
        return z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41763k = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        C18839b0 b0Var;
        long j3;
        C14075p.m21694f(this.f41753a != 2);
        int size = this.f41754b.size();
        for (int i = 0; i < size; i++) {
            C14086y yVar = this.f41754b.get(i);
            if (!(yVar.mo46959c() == -9223372036854775807L)) {
                if (yVar.mo46959c() != 0) {
                    synchronized (yVar) {
                        j3 = yVar.f31018b;
                    }
                    if (j3 == j2) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            synchronized (yVar) {
                yVar.f31018b = j2;
                yVar.f31020d = -9223372036854775807L;
                yVar.f31017a = false;
            }
        }
        if (!(j2 == 0 || (b0Var = this.f41762j) == null)) {
            b0Var.mo69867c(j2);
        }
        this.f41755c.mo46932w(0);
        this.f41756d.clear();
        for (int i2 = 0; i2 < this.f41758f.size(); i2++) {
            this.f41758f.valueAt(i2).mo70291c();
        }
        this.f41769q = 0;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        boolean z;
        byte[] bArr = this.f41755c.f30986a;
        C18346e eVar = (C18346e) iVar;
        eVar.mo69872c(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                eVar.mo69879j(i);
                return true;
            }
        }
        return false;
    }

    public final void release() {
    }

    public C18844d0(int i, C14086y yVar, C18855g gVar) {
        this.f41757e = gVar;
        this.f41753a = i;
        if (i == 1 || i == 2) {
            this.f41754b = Collections.singletonList(yVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f41754b = arrayList;
            arrayList.add(yVar);
        }
        this.f41755c = new C14077r(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f41759g = sparseBooleanArray;
        this.f41760h = new SparseBooleanArray();
        SparseArray<C18848e0> sparseArray = new SparseArray<>();
        this.f41758f = sparseArray;
        this.f41756d = new SparseIntArray();
        this.f41761i = new C18842c0();
        this.f41770r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f41758f.put(sparseArray2.keyAt(i2), (C18848e0) sparseArray2.valueAt(i2));
        }
        this.f41758f.put(0, new C18882z(new C18845a()));
        this.f41768p = null;
    }
}
