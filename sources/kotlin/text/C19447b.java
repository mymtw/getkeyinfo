package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19431g;
import p753kq.C19861p;
import p755lq.C19875a;
import p764pq.C20057i;

/* renamed from: kotlin.text.b */
public final class C19447b implements C19431g<C20057i> {

    /* renamed from: a */
    public final CharSequence f43377a;

    /* renamed from: b */
    public final int f43378b;

    /* renamed from: c */
    public final int f43379c;

    /* renamed from: d */
    public final C19861p<CharSequence, Integer, Pair<Integer, Integer>> f43380d;

    /* renamed from: kotlin.text.b$a */
    public static final class C19448a implements Iterator<C20057i>, C19875a {

        /* renamed from: b */
        public int f43381b = -1;

        /* renamed from: c */
        public int f43382c;

        /* renamed from: d */
        public int f43383d;

        /* renamed from: e */
        public C20057i f43384e;

        /* renamed from: f */
        public int f43385f;

        /* renamed from: g */
        public final /* synthetic */ C19447b f43386g;

        public C19448a(C19447b bVar) {
            this.f43386g = bVar;
            int M = C19388s.m32833M(bVar.f43378b, 0, bVar.f43377a.length());
            this.f43382c = M;
            this.f43383d = M;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo72063a() {
            /*
                r7 = this;
                int r0 = r7.f43383d
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f43381b = r1
                r0 = 0
                r7.f43384e = r0
                goto L_0x0086
            L_0x000c:
                kotlin.text.b r2 = r7.f43386g
                int r3 = r2.f43379c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f43385f
                int r6 = r6 + r5
                r7.f43385f = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f43377a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                pq.i r0 = new pq.i
                int r1 = r7.f43382c
                kotlin.text.b r2 = r7.f43386g
                java.lang.CharSequence r2 = r2.f43377a
                int r2 = kotlin.text.C19459m.m33039h1(r2)
                r0.<init>(r1, r2)
                r7.f43384e = r0
                r7.f43383d = r4
                goto L_0x0084
            L_0x0037:
                kotlin.text.b r0 = r7.f43386g
                kq.p<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r0.f43380d
                java.lang.CharSequence r0 = r0.f43377a
                int r3 = r7.f43383d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x005f
                pq.i r0 = new pq.i
                int r1 = r7.f43382c
                kotlin.text.b r2 = r7.f43386g
                java.lang.CharSequence r2 = r2.f43377a
                int r2 = kotlin.text.C19459m.m33039h1(r2)
                r0.<init>(r1, r2)
                r7.f43384e = r0
                r7.f43383d = r4
                goto L_0x0084
            L_0x005f:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f43382c
                pq.i r3 = kotlin.jvm.internal.C19388s.m32816D0(r3, r2)
                r7.f43384e = r3
                int r2 = r2 + r0
                r7.f43382c = r2
                if (r0 != 0) goto L_0x0081
                r1 = r5
            L_0x0081:
                int r2 = r2 + r1
                r7.f43383d = r2
            L_0x0084:
                r7.f43381b = r5
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C19447b.C19448a.mo72063a():void");
        }

        public final boolean hasNext() {
            if (this.f43381b == -1) {
                mo72063a();
            }
            return this.f43381b == 1;
        }

        public final Object next() {
            if (this.f43381b == -1) {
                mo72063a();
            }
            if (this.f43381b != 0) {
                C20057i iVar = this.f43384e;
                C19383o.m32795e(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f43384e = null;
                this.f43381b = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19447b(CharSequence charSequence, int i, int i2, C19861p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        C19383o.m32797g(charSequence, "input");
        this.f43377a = charSequence;
        this.f43378b = i;
        this.f43379c = i2;
        this.f43380d = pVar;
    }

    public final Iterator<C20057i> iterator() {
        return new C19448a(this);
    }
}
