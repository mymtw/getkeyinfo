package p717yh;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import p513bj.C14076q;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;

/* renamed from: yh.x */
public final class C18879x implements C18349h {

    /* renamed from: a */
    public final C14086y f42033a = new C14086y(0);

    /* renamed from: b */
    public final SparseArray<C18880a> f42034b = new SparseArray<>();

    /* renamed from: c */
    public final C14077r f42035c = new C14077r((int) RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: d */
    public final C18877v f42036d = new C18877v();

    /* renamed from: e */
    public boolean f42037e;

    /* renamed from: f */
    public boolean f42038f;

    /* renamed from: g */
    public boolean f42039g;

    /* renamed from: h */
    public long f42040h;

    /* renamed from: i */
    public C18875u f42041i;

    /* renamed from: j */
    public C18351j f42042j;

    /* renamed from: k */
    public boolean f42043k;

    /* renamed from: yh.x$a */
    public static final class C18880a {

        /* renamed from: a */
        public final C18858j f42044a;

        /* renamed from: b */
        public final C14086y f42045b;

        /* renamed from: c */
        public final C14076q f42046c = new C14076q(64, new byte[64]);

        /* renamed from: d */
        public boolean f42047d;

        /* renamed from: e */
        public boolean f42048e;

        /* renamed from: f */
        public boolean f42049f;

        /* renamed from: g */
        public long f42050g;

        public C18880a(C18858j jVar, C14086y yVar) {
            this.f42044a = jVar;
            this.f42045b = yVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r17, p644ph.C18363s r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            ph.j r2 = r0.f42042j
            p513bj.C14075p.m21696h(r2)
            r2 = r17
            ph.e r2 = (p644ph.C18346e) r2
            long r9 = r2.f40293c
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r14 = 0
            r15 = 1
            if (r13 == 0) goto L_0x0019
            r3 = r15
            goto L_0x001a
        L_0x0019:
            r3 = r14
        L_0x001a:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 442(0x1ba, float:6.2E-43)
            if (r3 == 0) goto L_0x00ee
            yh.v r3 = r0.f42036d
            boolean r6 = r3.f42027c
            if (r6 != 0) goto L_0x00ee
            boolean r6 = r3.f42029e
            r11 = 20000(0x4e20, double:9.8813E-320)
            if (r6 != 0) goto L_0x0077
            long r11 = java.lang.Math.min(r11, r9)
            int r6 = (int) r11
            long r11 = (long) r6
            long r9 = r9 - r11
            long r11 = r2.f40294d
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x003f
            r1.f40327a = r9
            goto L_0x0094
        L_0x003f:
            bj.r r1 = r3.f42026b
            r1.mo46932w(r6)
            r2.f40296f = r14
            bj.r r1 = r3.f42026b
            byte[] r1 = r1.f30986a
            r2.mo69872c(r1, r14, r6, r14)
            bj.r r1 = r3.f42026b
            int r2 = r1.f30987b
            int r6 = r1.f30988c
            int r6 = r6 + -4
        L_0x0055:
            if (r6 < r2) goto L_0x0071
            byte[] r8 = r1.f30986a
            int r8 = p717yh.C18877v.m31942b(r6, r8)
            if (r8 != r7) goto L_0x006e
            int r8 = r6 + 4
            r1.mo46935z(r8)
            long r8 = p717yh.C18877v.m31943c(r1)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x006e
            r4 = r8
            goto L_0x0071
        L_0x006e:
            int r6 = r6 + -1
            goto L_0x0055
        L_0x0071:
            r3.f42031g = r4
            r3.f42029e = r15
            goto L_0x00ed
        L_0x0077:
            long r7 = r3.f42031g
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0082
            r3.mo70310a(r2)
            goto L_0x00ed
        L_0x0082:
            boolean r6 = r3.f42028d
            if (r6 != 0) goto L_0x00cf
            long r6 = java.lang.Math.min(r11, r9)
            int r6 = (int) r6
            long r7 = r2.f40294d
            long r9 = (long) r14
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0096
            r1.f40327a = r9
        L_0x0094:
            r14 = r15
            goto L_0x00ed
        L_0x0096:
            bj.r r1 = r3.f42026b
            r1.mo46932w(r6)
            r2.f40296f = r14
            bj.r r1 = r3.f42026b
            byte[] r1 = r1.f30986a
            r2.mo69872c(r1, r14, r6, r14)
            bj.r r1 = r3.f42026b
            int r2 = r1.f30987b
            int r6 = r1.f30988c
        L_0x00aa:
            int r7 = r6 + -3
            if (r2 >= r7) goto L_0x00ca
            byte[] r7 = r1.f30986a
            int r7 = p717yh.C18877v.m31942b(r2, r7)
            r8 = 442(0x1ba, float:6.2E-43)
            if (r7 != r8) goto L_0x00c7
            int r7 = r2 + 4
            r1.mo46935z(r7)
            long r9 = p717yh.C18877v.m31943c(r1)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00c7
            r4 = r9
            goto L_0x00ca
        L_0x00c7:
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00ca:
            r3.f42030f = r4
            r3.f42028d = r15
            goto L_0x00ed
        L_0x00cf:
            long r6 = r3.f42030f
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00d9
            r3.mo70310a(r2)
            goto L_0x00ed
        L_0x00d9:
            bj.y r1 = r3.f42025a
            long r4 = r1.mo46958b(r6)
            bj.y r1 = r3.f42025a
            long r6 = r3.f42031g
            long r6 = r1.mo46958b(r6)
            long r6 = r6 - r4
            r3.f42032h = r6
            r3.mo70310a(r2)
        L_0x00ed:
            return r14
        L_0x00ee:
            r8 = r7
            boolean r3 = r0.f42043k
            if (r3 != 0) goto L_0x011c
            r0.f42043k = r15
            yh.v r3 = r0.f42036d
            long r6 = r3.f42032h
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            yh.u r5 = new yh.u
            bj.y r4 = r3.f42025a
            r3 = r5
            r15 = r5
            r5 = r6
            r7 = r9
            r3.<init>(r4, r5, r7)
            r0.f42041i = r15
            ph.j r3 = r0.f42042j
            ph.a$a r4 = r15.f40256a
            r3.mo4162l(r4)
            goto L_0x011c
        L_0x0112:
            ph.j r3 = r0.f42042j
            ph.t$b r4 = new ph.t$b
            r4.<init>(r6)
            r3.mo4162l(r4)
        L_0x011c:
            yh.u r3 = r0.f42041i
            if (r3 == 0) goto L_0x012e
            ph.a$c r4 = r3.f40258c
            if (r4 == 0) goto L_0x0126
            r4 = 1
            goto L_0x0127
        L_0x0126:
            r4 = r14
        L_0x0127:
            if (r4 == 0) goto L_0x012e
            int r1 = r3.mo69866a(r2, r1)
            return r1
        L_0x012e:
            r2.f40296f = r14
            if (r13 == 0) goto L_0x0138
            long r3 = r2.mo69877h()
            long r9 = r9 - r3
            goto L_0x0139
        L_0x0138:
            r9 = r11
        L_0x0139:
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r3 = -1
            if (r1 == 0) goto L_0x0145
            r4 = 4
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0145
            return r3
        L_0x0145:
            bj.r r1 = r0.f42035c
            byte[] r1 = r1.f30986a
            r4 = 4
            r5 = 1
            boolean r1 = r2.mo69872c(r1, r14, r4, r5)
            if (r1 != 0) goto L_0x0152
            return r3
        L_0x0152:
            bj.r r1 = r0.f42035c
            r1.mo46935z(r14)
            bj.r r1 = r0.f42035c
            int r1 = r1.mo46912c()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r1 != r5) goto L_0x0162
            return r3
        L_0x0162:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r1 != r3) goto L_0x0184
            bj.r r1 = r0.f42035c
            byte[] r1 = r1.f30986a
            r3 = 10
            r2.mo69872c(r1, r14, r3, r14)
            bj.r r1 = r0.f42035c
            r3 = 9
            r1.mo46935z(r3)
            bj.r r1 = r0.f42035c
            int r1 = r1.mo46925p()
            r1 = r1 & 7
            int r1 = r1 + 14
            r2.mo69879j(r1)
            return r14
        L_0x0184:
            r3 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r6 = 6
            if (r1 != r3) goto L_0x01a1
            bj.r r1 = r0.f42035c
            byte[] r1 = r1.f30986a
            r2.mo69872c(r1, r14, r5, r14)
            bj.r r1 = r0.f42035c
            r1.mo46935z(r14)
            bj.r r1 = r0.f42035c
            int r1 = r1.mo46930u()
            int r1 = r1 + r6
            r2.mo69879j(r1)
            return r14
        L_0x01a1:
            r3 = r1 & -256(0xffffffffffffff00, float:NaN)
            r7 = 8
            int r3 = r3 >> r7
            r8 = 1
            if (r3 == r8) goto L_0x01ad
            r2.mo69879j(r8)
            return r14
        L_0x01ad:
            r1 = r1 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<yh.x$a> r3 = r0.f42034b
            java.lang.Object r3 = r3.get(r1)
            yh.x$a r3 = (p717yh.C18879x.C18880a) r3
            boolean r8 = r0.f42037e
            if (r8 != 0) goto L_0x022f
            if (r3 != 0) goto L_0x0210
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r1 != r8) goto L_0x01d0
            yh.b r8 = new yh.b
            r8.<init>(r9)
            r9 = 1
            r0.f42038f = r9
            long r9 = r2.f40294d
            r0.f42040h = r9
        L_0x01ce:
            r9 = r8
            goto L_0x01f6
        L_0x01d0:
            r8 = r1 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x01e3
            yh.q r8 = new yh.q
            r8.<init>(r9)
            r9 = 1
            r0.f42038f = r9
            long r9 = r2.f40294d
            r0.f42040h = r9
            goto L_0x01ce
        L_0x01e3:
            r8 = r1 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L_0x01f6
            yh.k r8 = new yh.k
            r8.<init>(r9)
            r9 = 1
            r0.f42039g = r9
            long r9 = r2.f40294d
            r0.f42040h = r9
            goto L_0x01ce
        L_0x01f6:
            if (r9 == 0) goto L_0x0210
            yh.e0$d r3 = new yh.e0$d
            r8 = 256(0x100, float:3.59E-43)
            r3.<init>(r1, r8)
            ph.j r8 = r0.f42042j
            r9.mo70283d(r8, r3)
            yh.x$a r3 = new yh.x$a
            bj.y r8 = r0.f42033a
            r3.<init>(r9, r8)
            android.util.SparseArray<yh.x$a> r8 = r0.f42034b
            r8.put(r1, r3)
        L_0x0210:
            boolean r1 = r0.f42038f
            if (r1 == 0) goto L_0x021e
            boolean r1 = r0.f42039g
            if (r1 == 0) goto L_0x021e
            long r8 = r0.f42040h
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
            goto L_0x0221
        L_0x021e:
            r8 = 1048576(0x100000, double:5.180654E-318)
        L_0x0221:
            long r10 = r2.f40294d
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x022f
            r1 = 1
            r0.f42037e = r1
            ph.j r1 = r0.f42042j
            r1.mo4163p()
        L_0x022f:
            bj.r r1 = r0.f42035c
            byte[] r1 = r1.f30986a
            r2.mo69872c(r1, r14, r5, r14)
            bj.r r1 = r0.f42035c
            r1.mo46935z(r14)
            bj.r r1 = r0.f42035c
            int r1 = r1.mo46930u()
            int r1 = r1 + r6
            if (r3 != 0) goto L_0x0249
            r2.mo69879j(r1)
            goto L_0x0331
        L_0x0249:
            bj.r r5 = r0.f42035c
            r5.mo46932w(r1)
            bj.r r5 = r0.f42035c
            byte[] r5 = r5.f30986a
            r2.mo69874g(r5, r14, r1, r14)
            bj.r r1 = r0.f42035c
            r1.mo46935z(r6)
            bj.r r1 = r0.f42035c
            bj.q r2 = r3.f42046c
            java.lang.Object r2 = r2.f30985d
            byte[] r2 = (byte[]) r2
            r5 = 3
            r1.mo46911b(r14, r5, r2)
            bj.q r2 = r3.f42046c
            r2.mo46905l(r14)
            bj.q r2 = r3.f42046c
            r2.mo46907n(r7)
            bj.q r2 = r3.f42046c
            boolean r2 = r2.mo46900g()
            r3.f42047d = r2
            bj.q r2 = r3.f42046c
            boolean r2 = r2.mo46900g()
            r3.f42048e = r2
            bj.q r2 = r3.f42046c
            r2.mo46907n(r6)
            bj.q r2 = r3.f42046c
            int r2 = r2.mo46901h(r7)
            bj.q r6 = r3.f42046c
            java.lang.Object r6 = r6.f30985d
            byte[] r6 = (byte[]) r6
            r1.mo46911b(r14, r2, r6)
            bj.q r2 = r3.f42046c
            r2.mo46905l(r14)
            r6 = 0
            r3.f42050g = r6
            boolean r2 = r3.f42047d
            if (r2 == 0) goto L_0x0318
            bj.q r2 = r3.f42046c
            r2.mo46907n(r4)
            bj.q r2 = r3.f42046c
            int r2 = r2.mo46901h(r5)
            long r6 = (long) r2
            r2 = 30
            long r6 = r6 << r2
            bj.q r8 = r3.f42046c
            r9 = 1
            r8.mo46907n(r9)
            bj.q r8 = r3.f42046c
            r10 = 15
            int r8 = r8.mo46901h(r10)
            int r8 = r8 << r10
            long r11 = (long) r8
            long r6 = r6 | r11
            bj.q r8 = r3.f42046c
            r8.mo46907n(r9)
            bj.q r8 = r3.f42046c
            int r8 = r8.mo46901h(r10)
            long r11 = (long) r8
            long r6 = r6 | r11
            bj.q r8 = r3.f42046c
            r8.mo46907n(r9)
            boolean r8 = r3.f42049f
            if (r8 != 0) goto L_0x0310
            boolean r8 = r3.f42048e
            if (r8 == 0) goto L_0x0310
            bj.q r8 = r3.f42046c
            r8.mo46907n(r4)
            bj.q r8 = r3.f42046c
            int r5 = r8.mo46901h(r5)
            long r8 = (long) r5
            long r8 = r8 << r2
            bj.q r2 = r3.f42046c
            r5 = 1
            r2.mo46907n(r5)
            bj.q r2 = r3.f42046c
            int r2 = r2.mo46901h(r10)
            int r2 = r2 << r10
            long r11 = (long) r2
            long r8 = r8 | r11
            bj.q r2 = r3.f42046c
            r2.mo46907n(r5)
            bj.q r2 = r3.f42046c
            int r2 = r2.mo46901h(r10)
            long r10 = (long) r2
            long r8 = r8 | r10
            bj.q r2 = r3.f42046c
            r2.mo46907n(r5)
            bj.y r2 = r3.f42045b
            r2.mo46958b(r8)
            r3.f42049f = r5
        L_0x0310:
            bj.y r2 = r3.f42045b
            long r5 = r2.mo46958b(r6)
            r3.f42050g = r5
        L_0x0318:
            yh.j r2 = r3.f42044a
            long r5 = r3.f42050g
            r2.mo70285f(r4, r5)
            yh.j r2 = r3.f42044a
            r2.mo70281a(r1)
            yh.j r1 = r3.f42044a
            r1.mo70284e()
            bj.r r1 = r0.f42035c
            byte[] r2 = r1.f30986a
            int r2 = r2.length
            r1.mo46934y(r2)
        L_0x0331:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18879x.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f42042j = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r2 != r9) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004c A[LOOP:0: B:34:0x0044->B:36:0x004c, LOOP_END] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47759c(long r7, long r9) {
        /*
            r6 = this;
            bj.y r7 = r6.f42033a
            long r7 = r7.mo46959c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0012
            r7 = 1
            goto L_0x0013
        L_0x0012:
            r7 = r8
        L_0x0013:
            if (r7 != 0) goto L_0x0032
            bj.y r7 = r6.f42033a
            monitor-enter(r7)
            long r2 = r7.f31018b     // Catch:{ all -> 0x002f }
            monitor-exit(r7)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x003c
            bj.y r7 = r6.f42033a
            monitor-enter(r7)
            long r2 = r7.f31018b     // Catch:{ all -> 0x002c }
            monitor-exit(r7)
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x003c
            goto L_0x0032
        L_0x002c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x002f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0032:
            bj.y r7 = r6.f42033a
            monitor-enter(r7)
            r7.f31018b = r9     // Catch:{ all -> 0x005f }
            r7.f31020d = r0     // Catch:{ all -> 0x005f }
            r7.f31017a = r8     // Catch:{ all -> 0x005f }
            monitor-exit(r7)
        L_0x003c:
            yh.u r7 = r6.f42041i
            if (r7 == 0) goto L_0x0043
            r7.mo69867c(r9)
        L_0x0043:
            r7 = r8
        L_0x0044:
            android.util.SparseArray<yh.x$a> r9 = r6.f42034b
            int r9 = r9.size()
            if (r7 >= r9) goto L_0x005e
            android.util.SparseArray<yh.x$a> r9 = r6.f42034b
            java.lang.Object r9 = r9.valueAt(r7)
            yh.x$a r9 = (p717yh.C18879x.C18880a) r9
            r9.f42049f = r8
            yh.j r9 = r9.f42044a
            r9.mo70282c()
            int r7 = r7 + 1
            goto L_0x0044
        L_0x005e:
            return
        L_0x005f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18879x.mo47759c(long, long):void");
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        byte[] bArr = new byte[14];
        C18346e eVar = (C18346e) iVar;
        eVar.mo69872c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        eVar.mo69880k(bArr[13] & 7, false);
        eVar.mo69872c(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public final void release() {
    }
}
