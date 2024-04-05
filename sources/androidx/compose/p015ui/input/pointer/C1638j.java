package androidx.compose.p015ui.input.pointer;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.layout.C1689j;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.input.pointer.j */
public final class C1638j extends C1639k {

    /* renamed from: b */
    public final C1650u f3642b;

    /* renamed from: c */
    public final C7734e<C1643o> f3643c = new C7734e<>(new C1643o[16]);

    /* renamed from: d */
    public final LinkedHashMap f3644d = new LinkedHashMap();

    /* renamed from: e */
    public C1689j f3645e;

    /* renamed from: f */
    public C1640l f3646f;

    /* renamed from: g */
    public boolean f3647g;

    /* renamed from: h */
    public boolean f3648h = true;

    /* renamed from: i */
    public boolean f3649i = true;

    public C1638j(C1650u uVar) {
        C19383o.m32797g(uVar, "pointerInputFilter");
        this.f3642b = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
        if ((r11 == 5 ? r5 : false) != false) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6602a(java.util.Map<androidx.compose.p015ui.input.pointer.C1643o, androidx.compose.p015ui.input.pointer.C1644p> r31, androidx.compose.p015ui.layout.C1689j r32, androidx.compose.p015ui.input.pointer.C1635g r33, boolean r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "changes"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)
            boolean r4 = super.mo6602a(r31, r32, r33, r34)
            androidx.compose.ui.input.pointer.u r5 = r0.f3642b
            boolean r6 = r5.f3688c
            r7 = 1
            if (r6 != 0) goto L_0x001e
            return r7
        L_0x001e:
            androidx.compose.ui.layout.j r5 = r5.f3687b
            r0.f3645e = r5
            java.util.Set r5 = r31.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002a:
            boolean r6 = r5.hasNext()
            r8 = 0
            if (r6 == 0) goto L_0x00dc
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getKey()
            androidx.compose.ui.input.pointer.o r9 = (androidx.compose.p015ui.input.pointer.C1643o) r9
            long r9 = r9.f3655a
            java.lang.Object r6 = r6.getValue()
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            r.e<androidx.compose.ui.input.pointer.o> r11 = r0.f3643c
            androidx.compose.ui.input.pointer.o r12 = new androidx.compose.ui.input.pointer.o
            r12.<init>(r9)
            boolean r11 = r11.mo20236j(r12)
            if (r11 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List<androidx.compose.ui.input.pointer.e> r12 = r6.f3665j
            if (r12 != 0) goto L_0x005d
            kotlin.collections.EmptyList r12 = kotlin.collections.EmptyList.INSTANCE
        L_0x005d:
            int r13 = r12.size()
        L_0x0061:
            if (r8 >= r13) goto L_0x0090
            java.lang.Object r14 = r12.get(r8)
            androidx.compose.ui.input.pointer.e r14 = (androidx.compose.p015ui.input.pointer.C1633e) r14
            androidx.compose.ui.input.pointer.e r15 = new androidx.compose.ui.input.pointer.e
            r16 = r8
            long r7 = r14.f3627a
            r29 = r5
            androidx.compose.ui.layout.j r5 = r0.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r5)
            r17 = r12
            r18 = r13
            long r12 = r14.f3628b
            long r12 = r5.mo6686m(r2, r12)
            r15.<init>(r7, r12)
            r11.add(r15)
            int r8 = r16 + 1
            r12 = r17
            r13 = r18
            r5 = r29
            r7 = 1
            goto L_0x0061
        L_0x0090:
            r29 = r5
            java.util.LinkedHashMap r5 = r0.f3644d
            androidx.compose.ui.input.pointer.o r7 = new androidx.compose.ui.input.pointer.o
            r7.<init>(r9)
            androidx.compose.ui.layout.j r8 = r0.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r8)
            long r9 = r6.f3661f
            long r22 = r8.mo6686m(r2, r9)
            androidx.compose.ui.layout.j r8 = r0.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r8)
            long r9 = r6.f3658c
            long r17 = r8.mo6686m(r2, r9)
            long r13 = r6.f3656a
            long r8 = r6.f3657b
            r15 = r8
            boolean r8 = r6.f3659d
            r19 = r8
            long r8 = r6.f3660e
            r20 = r8
            boolean r8 = r6.f3662g
            r24 = r8
            int r8 = r6.f3663h
            r25 = r8
            long r8 = r6.f3664i
            r27 = r8
            androidx.compose.ui.input.pointer.p r8 = new androidx.compose.ui.input.pointer.p
            r12 = r8
            r26 = r11
            r12.<init>((long) r13, (long) r15, (long) r17, (boolean) r19, (long) r20, (long) r22, (boolean) r24, (int) r25, (java.util.List) r26, (long) r27)
            androidx.compose.ui.input.pointer.d r6 = r6.f3666k
            r8.f3666k = r6
            r5.put(r7, r8)
            r5 = r29
            r7 = 1
            goto L_0x002a
        L_0x00dc:
            java.util.LinkedHashMap r2 = r0.f3644d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00f0
            r.e<androidx.compose.ui.input.pointer.o> r1 = r0.f3643c
            r1.mo20235g()
            r.e<androidx.compose.ui.input.pointer.j> r1 = r0.f3650a
            r1.mo20235g()
            r2 = 1
            return r2
        L_0x00f0:
            r2 = 1
            r.e<androidx.compose.ui.input.pointer.o> r5 = r0.f3643c
            int r5 = r5.f17157d
            int r5 = r5 - r2
        L_0x00f6:
            r2 = -1
            if (r2 >= r5) goto L_0x0116
            r.e<androidx.compose.ui.input.pointer.o> r2 = r0.f3643c
            T[] r2 = r2.f17155b
            r2 = r2[r5]
            androidx.compose.ui.input.pointer.o r2 = (androidx.compose.p015ui.input.pointer.C1643o) r2
            long r6 = r2.f3655a
            androidx.compose.ui.input.pointer.o r2 = new androidx.compose.ui.input.pointer.o
            r2.<init>(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0113
            r.e<androidx.compose.ui.input.pointer.o> r2 = r0.f3643c
            r2.mo20243q(r5)
        L_0x0113:
            int r5 = r5 + -1
            goto L_0x00f6
        L_0x0116:
            androidx.compose.ui.input.pointer.l r1 = new androidx.compose.ui.input.pointer.l
            java.util.LinkedHashMap r2 = r0.f3644d
            java.util.Collection r2 = r2.values()
            java.util.List r2 = kotlin.collections.C19327t.m32660p1(r2)
            r1.<init>(r2, r3)
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r1.f3651a
            int r5 = r2.size()
            r6 = r8
        L_0x012c:
            if (r6 >= r5) goto L_0x0141
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            long r9 = r9.f3656a
            boolean r9 = r3.mo6599a(r9)
            if (r9 == 0) goto L_0x013e
            goto L_0x0142
        L_0x013e:
            int r6 = r6 + 1
            goto L_0x012c
        L_0x0141:
            r7 = 0
        L_0x0142:
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            r2 = 3
            if (r7 == 0) goto L_0x01b2
            if (r34 != 0) goto L_0x014c
            r0.f3648h = r8
            goto L_0x016a
        L_0x014c:
            boolean r3 = r0.f3648h
            if (r3 != 0) goto L_0x016a
            boolean r3 = r7.f3659d
            if (r3 != 0) goto L_0x0158
            boolean r3 = r7.f3662g
            if (r3 == 0) goto L_0x016a
        L_0x0158:
            androidx.compose.ui.layout.j r3 = r0.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r3)
            long r5 = r3.mo6684a()
            boolean r3 = com.google.android.play.core.appupdate.C15562d.m25179Q(r7, r5)
            r5 = 1
            r3 = r3 ^ r5
            r0.f3648h = r3
            goto L_0x016b
        L_0x016a:
            r5 = 1
        L_0x016b:
            boolean r3 = r0.f3648h
            boolean r6 = r0.f3647g
            r9 = 5
            r10 = 4
            if (r3 == r6) goto L_0x0190
            int r11 = r1.f3654d
            if (r11 != r2) goto L_0x0179
            r12 = r5
            goto L_0x017a
        L_0x0179:
            r12 = r8
        L_0x017a:
            if (r12 != 0) goto L_0x018a
            if (r11 != r10) goto L_0x0180
            r12 = r5
            goto L_0x0181
        L_0x0180:
            r12 = r8
        L_0x0181:
            if (r12 != 0) goto L_0x018a
            if (r11 != r9) goto L_0x0187
            r11 = r5
            goto L_0x0188
        L_0x0187:
            r11 = r8
        L_0x0188:
            if (r11 == 0) goto L_0x0190
        L_0x018a:
            if (r3 == 0) goto L_0x018d
            r9 = r10
        L_0x018d:
            r1.f3654d = r9
            goto L_0x01b3
        L_0x0190:
            int r11 = r1.f3654d
            if (r11 != r10) goto L_0x0196
            r10 = r5
            goto L_0x0197
        L_0x0196:
            r10 = r8
        L_0x0197:
            if (r10 == 0) goto L_0x01a2
            if (r6 == 0) goto L_0x01a2
            boolean r6 = r0.f3649i
            if (r6 != 0) goto L_0x01a2
            r1.f3654d = r2
            goto L_0x01b3
        L_0x01a2:
            if (r11 != r9) goto L_0x01a6
            r6 = r5
            goto L_0x01a7
        L_0x01a6:
            r6 = r8
        L_0x01a7:
            if (r6 == 0) goto L_0x01b3
            if (r3 == 0) goto L_0x01b3
            boolean r3 = r7.f3659d
            if (r3 == 0) goto L_0x01b3
            r1.f3654d = r2
            goto L_0x01b3
        L_0x01b2:
            r5 = 1
        L_0x01b3:
            if (r4 != 0) goto L_0x0200
            int r3 = r1.f3654d
            if (r3 != r2) goto L_0x01bb
            r2 = r5
            goto L_0x01bc
        L_0x01bb:
            r2 = r8
        L_0x01bc:
            if (r2 == 0) goto L_0x0200
            androidx.compose.ui.input.pointer.l r2 = r0.f3646f
            if (r2 == 0) goto L_0x01fa
            java.util.List<androidx.compose.ui.input.pointer.p> r3 = r2.f3651a
            int r3 = r3.size()
            java.util.List<androidx.compose.ui.input.pointer.p> r4 = r1.f3651a
            int r4 = r4.size()
            if (r3 == r4) goto L_0x01d1
            goto L_0x01fa
        L_0x01d1:
            java.util.List<androidx.compose.ui.input.pointer.p> r3 = r1.f3651a
            int r3 = r3.size()
            r4 = r8
        L_0x01d8:
            if (r4 >= r3) goto L_0x01f8
            java.util.List<androidx.compose.ui.input.pointer.p> r6 = r2.f3651a
            java.lang.Object r6 = r6.get(r4)
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            java.util.List<androidx.compose.ui.input.pointer.p> r7 = r1.f3651a
            java.lang.Object r7 = r7.get(r4)
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            long r9 = r6.f3658c
            long r6 = r7.f3658c
            boolean r6 = p288y.C8343c.m16640a(r9, r6)
            if (r6 != 0) goto L_0x01f5
            goto L_0x01fa
        L_0x01f5:
            int r4 = r4 + 1
            goto L_0x01d8
        L_0x01f8:
            r2 = r8
            goto L_0x01fb
        L_0x01fa:
            r2 = r5
        L_0x01fb:
            if (r2 == 0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            r7 = r8
            goto L_0x0201
        L_0x0200:
            r7 = r5
        L_0x0201:
            r0.f3646f = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1638j.mo6602a(java.util.Map, androidx.compose.ui.layout.j, androidx.compose.ui.input.pointer.g, boolean):boolean");
    }

    /* renamed from: b */
    public final void mo6603b(C1635g gVar) {
        super.mo6603b(gVar);
        C1640l lVar = this.f3646f;
        if (lVar != null) {
            this.f3647g = this.f3648h;
            List<C1644p> list = lVar.f3651a;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= size) {
                    break;
                }
                C1644p pVar = list.get(i);
                if (pVar.f3659d || (gVar.mo6599a(pVar.f3656a) && this.f3648h)) {
                    z2 = false;
                }
                if (z2) {
                    this.f3643c.mo20241o(new C1643o(pVar.f3656a));
                }
                i++;
            }
            this.f3648h = false;
            if (lVar.f3654d == 5) {
                z = true;
            }
            this.f3649i = z;
        }
    }

    /* renamed from: c */
    public final void mo6604c() {
        C7734e<C1638j> eVar = this.f3650a;
        int i = eVar.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f17155b;
            do {
                ((C1638j) tArr[i2]).mo6604c();
                i2++;
            } while (i2 < i);
        }
        this.f3642b.mo6548S0();
    }

    /* renamed from: d */
    public final boolean mo6605d(C1635g gVar) {
        C7734e<C1638j> eVar;
        int i;
        boolean z = true;
        int i2 = 0;
        if (!this.f3644d.isEmpty() && this.f3642b.f3688c) {
            C1640l lVar = this.f3646f;
            C19383o.m32794d(lVar);
            C1689j jVar = this.f3645e;
            C19383o.m32794d(jVar);
            this.f3642b.mo6549T0(lVar, PointerEventPass.Final, jVar.mo6684a());
            if (this.f3642b.f3688c && (i = eVar.f17157d) > 0) {
                T[] tArr = (eVar = this.f3650a).f17155b;
                do {
                    ((C1638j) tArr[i2]).mo6605d(gVar);
                    i2++;
                } while (i2 < i);
            }
        } else {
            z = false;
        }
        mo6603b(gVar);
        this.f3644d.clear();
        this.f3645e = null;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r3 = r8.f3650a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6606e(java.util.Map<androidx.compose.p015ui.input.pointer.C1643o, androidx.compose.p015ui.input.pointer.C1644p> r9, androidx.compose.p015ui.layout.C1689j r10, androidx.compose.p015ui.input.pointer.C1635g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            kotlin.jvm.internal.C19383o.m32797g(r10, r9)
            java.util.LinkedHashMap r9 = r8.f3644d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            androidx.compose.ui.input.pointer.u r9 = r8.f3642b
            boolean r9 = r9.f3688c
            if (r9 != 0) goto L_0x001d
        L_0x001b:
            r10 = r0
            goto L_0x005c
        L_0x001d:
            androidx.compose.ui.input.pointer.l r9 = r8.f3646f
            kotlin.jvm.internal.C19383o.m32794d(r9)
            androidx.compose.ui.layout.j r1 = r8.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r1)
            long r1 = r1.mo6684a()
            androidx.compose.ui.input.pointer.u r3 = r8.f3642b
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p015ui.input.pointer.PointerEventPass.Initial
            r3.mo6549T0(r9, r4, r1)
            androidx.compose.ui.input.pointer.u r3 = r8.f3642b
            boolean r3 = r3.f3688c
            if (r3 == 0) goto L_0x0051
            r.e<androidx.compose.ui.input.pointer.j> r3 = r8.f3650a
            int r4 = r3.f17157d
            if (r4 <= 0) goto L_0x0051
            T[] r3 = r3.f17155b
        L_0x0040:
            r5 = r3[r0]
            androidx.compose.ui.input.pointer.j r5 = (androidx.compose.p015ui.input.pointer.C1638j) r5
            java.util.LinkedHashMap r6 = r8.f3644d
            androidx.compose.ui.layout.j r7 = r8.f3645e
            kotlin.jvm.internal.C19383o.m32794d(r7)
            r5.mo6606e(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L_0x0040
        L_0x0051:
            androidx.compose.ui.input.pointer.u r11 = r8.f3642b
            boolean r12 = r11.f3688c
            if (r12 == 0) goto L_0x005c
            androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.p015ui.input.pointer.PointerEventPass.Main
            r11.mo6549T0(r9, r12, r1)
        L_0x005c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1638j.mo6606e(java.util.Map, androidx.compose.ui.layout.j, androidx.compose.ui.input.pointer.g, boolean):boolean");
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Node(pointerInputFilter=");
        h.append(this.f3642b);
        h.append(", children=");
        h.append(this.f3650a);
        h.append(", pointerIds=");
        h.append(this.f3643c);
        h.append(')');
        return h.toString();
    }
}
