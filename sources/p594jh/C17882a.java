package p594jh;

import android.util.Pair;
import p513bj.C14049b0;
import p594jh.C17939k1;
import p595ji.C18001m;

/* renamed from: jh.a */
public abstract class C17882a extends C17939k1 {

    /* renamed from: e */
    public static final /* synthetic */ int f38837e = 0;

    /* renamed from: b */
    public final int f38838b;

    /* renamed from: c */
    public final C18001m f38839c;

    /* renamed from: d */
    public final boolean f38840d = false;

    public C17882a(C18001m mVar) {
        this.f38839c = mVar;
        this.f38838b = mVar.getLength();
    }

    /* renamed from: a */
    public final int mo69294a(boolean z) {
        if (this.f38838b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f38840d) {
            z = false;
        }
        if (z) {
            i = this.f38839c.mo69571f();
        }
        do {
            C17899c1 c1Var = (C17899c1) this;
            if (c1Var.f38874j[i].mo69481p()) {
                i = mo69299q(i, z);
            } else {
                return c1Var.f38874j[i].mo69294a(z) + c1Var.f38873i[i];
            }
        } while (i != -1);
        return -1;
    }

    /* renamed from: b */
    public final int mo47698b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C17899c1 c1Var = (C17899c1) this;
        Integer num = c1Var.f38876l.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b = c1Var.f38874j[intValue].mo47698b(obj3)) == -1) {
            return -1;
        }
        return c1Var.f38872h[intValue] + b;
    }

    /* renamed from: c */
    public final int mo69295c(boolean z) {
        int i;
        int i2 = this.f38838b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f38840d) {
            z = false;
        }
        int d = z ? this.f38839c.mo69569d() : i2 - 1;
        do {
            C17899c1 c1Var = (C17899c1) this;
            if (!c1Var.f38874j[d].mo69481p()) {
                return c1Var.f38874j[d].mo69295c(z) + c1Var.f38873i[d];
            } else if (z) {
                i = this.f38839c.mo69567b(d);
                continue;
            } else if (d > 0) {
                i = d - 1;
                continue;
            } else {
                i = -1;
                continue;
            }
        } while (d != -1);
        return -1;
    }

    /* renamed from: e */
    public final int mo69296e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f38840d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        C17899c1 c1Var = (C17899c1) this;
        int e = C14049b0.m21632e(c1Var.f38873i, i + 1);
        int i4 = c1Var.f38873i[e];
        C17939k1 k1Var = c1Var.f38874j[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int e2 = k1Var.mo69296e(i5, i3, z);
        if (e2 != -1) {
            return i4 + e2;
        }
        int q = mo69299q(e, z);
        while (q != -1 && c1Var.f38874j[q].mo69481p()) {
            q = mo69299q(q, z);
        }
        if (q != -1) {
            return c1Var.f38874j[q].mo69294a(z) + c1Var.f38873i[q];
        } else if (i2 == 2) {
            return mo69294a(z);
        } else {
            return -1;
        }
    }

    /* renamed from: f */
    public final C17939k1.C17941b mo47630f(int i, C17939k1.C17941b bVar, boolean z) {
        C17899c1 c1Var = (C17899c1) this;
        int e = C14049b0.m21632e(c1Var.f38872h, i + 1);
        int i2 = c1Var.f38873i[e];
        c1Var.f38874j[e].mo47630f(i - c1Var.f38872h[e], bVar, z);
        bVar.f39100c += i2;
        if (z) {
            Object obj = c1Var.f38875k[e];
            Object obj2 = bVar.f39099b;
            obj2.getClass();
            bVar.f39099b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    /* renamed from: g */
    public final C17939k1.C17941b mo69297g(Object obj, C17939k1.C17941b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C17899c1 c1Var = (C17899c1) this;
        Integer num = c1Var.f38876l.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = c1Var.f38873i[intValue];
        c1Var.f38874j[intValue].mo69297g(obj3, bVar);
        bVar.f39100c += i;
        bVar.f39099b = obj;
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:34:0x0055->B:25:0x0055 ?: BREAK  
    EDGE_INSN: B:35:0x0055->B:25:0x0055 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo69298k(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f38840d
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L_0x000b
            r9 = 1
            if (r8 != r9) goto L_0x000a
            r8 = r2
        L_0x000a:
            r9 = r1
        L_0x000b:
            r0 = r6
            jh.c1 r0 = (p594jh.C17899c1) r0
            int[] r3 = r0.f38873i
            int r4 = r7 + 1
            int r3 = p513bj.C14049b0.m21632e(r3, r4)
            int[] r4 = r0.f38873i
            r4 = r4[r3]
            jh.k1[] r5 = r0.f38874j
            r5 = r5[r3]
            int r7 = r7 - r4
            if (r8 != r2) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r8
        L_0x0023:
            int r7 = r5.mo69298k(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L_0x002c
            int r4 = r4 + r7
            return r4
        L_0x002c:
            if (r9 == 0) goto L_0x0035
            ji.m r7 = r6.f38839c
            int r7 = r7.mo69567b(r3)
            goto L_0x003b
        L_0x0035:
            if (r3 <= 0) goto L_0x003a
            int r7 = r3 + -1
            goto L_0x003b
        L_0x003a:
            r7 = r1
        L_0x003b:
            if (r7 == r1) goto L_0x0055
            jh.k1[] r3 = r0.f38874j
            r3 = r3[r7]
            boolean r3 = r3.mo69481p()
            if (r3 == 0) goto L_0x0055
            if (r9 == 0) goto L_0x0050
            ji.m r3 = r6.f38839c
            int r7 = r3.mo69567b(r7)
            goto L_0x003b
        L_0x0050:
            if (r7 <= 0) goto L_0x003a
            int r7 = r7 + -1
            goto L_0x003b
        L_0x0055:
            if (r7 == r1) goto L_0x0065
            int[] r8 = r0.f38873i
            r8 = r8[r7]
            jh.k1[] r0 = r0.f38874j
            r7 = r0[r7]
            int r7 = r7.mo69295c(r9)
            int r7 = r7 + r8
            return r7
        L_0x0065:
            if (r8 != r2) goto L_0x006c
            int r7 = r6.mo69295c(r9)
            return r7
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17882a.mo69298k(int, int, boolean):int");
    }

    /* renamed from: l */
    public final Object mo47699l(int i) {
        C17899c1 c1Var = (C17899c1) this;
        int e = C14049b0.m21632e(c1Var.f38872h, i + 1);
        return Pair.create(c1Var.f38875k[e], c1Var.f38874j[e].mo47699l(i - c1Var.f38872h[e]));
    }

    /* renamed from: n */
    public final C17939k1.C17942c mo47631n(int i, C17939k1.C17942c cVar, long j) {
        C17899c1 c1Var = (C17899c1) this;
        int e = C14049b0.m21632e(c1Var.f38873i, i + 1);
        int i2 = c1Var.f38873i[e];
        int i3 = c1Var.f38872h[e];
        c1Var.f38874j[e].mo47631n(i - i2, cVar, j);
        Object obj = c1Var.f38875k[e];
        if (!C17939k1.C17942c.f39105r.equals(cVar.f39107a)) {
            obj = Pair.create(obj, cVar.f39107a);
        }
        cVar.f39107a = obj;
        cVar.f39121o += i3;
        cVar.f39122p += i3;
        return cVar;
    }

    /* renamed from: q */
    public final int mo69299q(int i, boolean z) {
        if (z) {
            return this.f38839c.mo69568c(i);
        }
        if (i < this.f38838b - 1) {
            return i + 1;
        }
        return -1;
    }
}
