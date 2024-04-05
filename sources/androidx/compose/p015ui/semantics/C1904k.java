package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.node.C1742i;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.semantics.k */
public final class C1904k extends C1742i<C1904k, C1905l> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1904k(LayoutNodeWrapper layoutNodeWrapper, C1905l lVar) {
        super(layoutNodeWrapper, lVar);
        C19383o.m32797g(layoutNodeWrapper, "wrapped");
        C19383o.m32797g(lVar, "modifier");
    }

    /* renamed from: a */
    public final void mo6735a() {
        this.f3922e = true;
        C1750p pVar = this.f3919b.f3850f.f3823h;
        if (pVar != null) {
            pVar.onSemanticsChange();
        }
    }

    /* renamed from: b */
    public final void mo6919b() {
        this.f3922e = false;
        C1750p pVar = this.f3919b.f3850f.f3823h;
        if (pVar != null) {
            pVar.onSemanticsChange();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.semantics.C1903j mo7349c() {
        /*
            r8 = this;
            T r0 = r8.f3921d
            androidx.compose.ui.semantics.k r0 = (androidx.compose.p015ui.semantics.C1904k) r0
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x003f
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r8.f3919b
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.mo6793d1()
            if (r0 == 0) goto L_0x0056
        L_0x0010:
            if (r0 == 0) goto L_0x001f
            androidx.compose.ui.node.i<?, ?>[] r3 = r0.f3864t
            boolean r3 = p772tq.C20203a.m34521D(r3, r1)
            if (r3 != 0) goto L_0x001f
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.mo6793d1()
            goto L_0x0010
        L_0x001f:
            if (r0 == 0) goto L_0x0056
            androidx.compose.ui.node.i<?, ?>[] r0 = r0.f3864t
            r0 = r0[r1]
            androidx.compose.ui.semantics.k r0 = (androidx.compose.p015ui.semantics.C1904k) r0
            if (r0 == 0) goto L_0x0056
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r0.f3919b
        L_0x002b:
            if (r3 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.mo6793d1()
            if (r3 == 0) goto L_0x003d
            androidx.compose.ui.node.i<?, ?>[] r0 = r3.f3864t
            r0 = r0[r1]
            androidx.compose.ui.semantics.k r0 = (androidx.compose.p015ui.semantics.C1904k) r0
            goto L_0x002b
        L_0x003d:
            r0 = r2
            goto L_0x002b
        L_0x003f:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r0.f3919b
        L_0x0041:
            if (r3 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0047
        L_0x0045:
            r2 = r0
            goto L_0x0056
        L_0x0047:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.mo6793d1()
            if (r3 == 0) goto L_0x0054
            androidx.compose.ui.node.i<?, ?>[] r0 = r3.f3864t
            r0 = r0[r1]
            androidx.compose.ui.semantics.k r0 = (androidx.compose.p015ui.semantics.C1904k) r0
            goto L_0x0041
        L_0x0054:
            r0 = r2
            goto L_0x0041
        L_0x0056:
            if (r2 == 0) goto L_0x00fc
            M r0 = r8.f3920c
            androidx.compose.ui.semantics.l r0 = (androidx.compose.p015ui.semantics.C1905l) r0
            androidx.compose.ui.semantics.j r0 = r0.mo7351N0()
            boolean r0 = r0.f4248d
            if (r0 == 0) goto L_0x0066
            goto L_0x00fc
        L_0x0066:
            M r0 = r8.f3920c
            androidx.compose.ui.semantics.l r0 = (androidx.compose.p015ui.semantics.C1905l) r0
            androidx.compose.ui.semantics.j r0 = r0.mo7351N0()
            r0.getClass()
            androidx.compose.ui.semantics.j r1 = new androidx.compose.ui.semantics.j
            r1.<init>()
            boolean r3 = r0.f4247c
            r1.f4247c = r3
            boolean r3 = r0.f4248d
            r1.f4248d = r3
            java.util.LinkedHashMap r3 = r1.f4246b
            java.util.LinkedHashMap r0 = r0.f4246b
            r3.putAll(r0)
            androidx.compose.ui.semantics.j r0 = r2.mo7349c()
            java.lang.String r2 = "peer"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            boolean r2 = r0.f4247c
            r3 = 1
            if (r2 == 0) goto L_0x0095
            r1.f4247c = r3
        L_0x0095:
            boolean r2 = r0.f4248d
            if (r2 == 0) goto L_0x009b
            r1.f4248d = r3
        L_0x009b:
            java.util.LinkedHashMap r0 = r0.f4246b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            androidx.compose.ui.semantics.p r3 = (androidx.compose.p015ui.semantics.C1909p) r3
            java.lang.Object r2 = r2.getValue()
            java.util.LinkedHashMap r4 = r1.f4246b
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L_0x00c9
            java.util.LinkedHashMap r4 = r1.f4246b
            r4.put(r3, r2)
            goto L_0x00a5
        L_0x00c9:
            boolean r4 = r2 instanceof androidx.compose.p015ui.semantics.C1894a
            if (r4 == 0) goto L_0x00a5
            java.util.LinkedHashMap r4 = r1.f4246b
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x00f3
            androidx.compose.ui.semantics.a r4 = (androidx.compose.p015ui.semantics.C1894a) r4
            java.util.LinkedHashMap r5 = r1.f4246b
            androidx.compose.ui.semantics.a r6 = new androidx.compose.ui.semantics.a
            java.lang.String r7 = r4.f4217a
            if (r7 != 0) goto L_0x00e4
            r7 = r2
            androidx.compose.ui.semantics.a r7 = (androidx.compose.p015ui.semantics.C1894a) r7
            java.lang.String r7 = r7.f4217a
        L_0x00e4:
            T r4 = r4.f4218b
            if (r4 != 0) goto L_0x00ec
            androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
            T r4 = r2.f4218b
        L_0x00ec:
            r6.<init>(r7, r4)
            r5.put(r3, r6)
            goto L_0x00a5
        L_0x00f3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            return r1
        L_0x00fc:
            M r0 = r8.f3920c
            androidx.compose.ui.semantics.l r0 = (androidx.compose.p015ui.semantics.C1905l) r0
            androidx.compose.ui.semantics.j r0 = r0.mo7351N0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.semantics.C1904k.mo7349c():androidx.compose.ui.semantics.j");
    }

    public final String toString() {
        return super.toString() + " id: " + ((C1905l) this.f3920c).getId() + " config: " + ((C1905l) this.f3920c).mo7351N0();
    }
}
