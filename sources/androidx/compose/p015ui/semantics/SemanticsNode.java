package androidx.compose.p015ui.semantics;

import androidx.activity.C0114h;
import androidx.compose.p015ui.node.C1737d;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p288y.C8345d;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
public final class SemanticsNode {

    /* renamed from: a */
    public final C1904k f4182a;

    /* renamed from: b */
    public final boolean f4183b;

    /* renamed from: c */
    public boolean f4184c;

    /* renamed from: d */
    public SemanticsNode f4185d;

    /* renamed from: e */
    public final C1903j f4186e;

    /* renamed from: f */
    public final int f4187f;

    /* renamed from: g */
    public final LayoutNode f4188g;

    public SemanticsNode(C1904k kVar, boolean z) {
        C19383o.m32797g(kVar, "outerSemanticsEntity");
        this.f4182a = kVar;
        this.f4183b = z;
        this.f4186e = kVar.mo7349c();
        this.f4187f = ((C1905l) kVar.f3920c).getId();
        this.f4188g = kVar.f3919b.f3850f;
    }

    /* renamed from: b */
    public static List m4175b(SemanticsNode semanticsNode, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        semanticsNode.getClass();
        List<SemanticsNode> j = semanticsNode.mo7311j(z, false);
        int size = j.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = j.get(i2);
            if (semanticsNode2.mo7309h()) {
                list.add(semanticsNode2);
            } else if (!semanticsNode2.f4186e.f4248d) {
                m4175b(semanticsNode2, list, false, 2);
            }
        }
        return list;
    }

    /* renamed from: a */
    public final SemanticsNode mo7303a(C1900g gVar, C19857l<? super C1910q, C19394m> lVar) {
        int i;
        int i2;
        C1737d dVar = new LayoutNode(true).f3800D;
        if (gVar != null) {
            i = this.f4187f;
            i2 = 1000000000;
        } else {
            i = this.f4187f;
            i2 = 2000000000;
        }
        SemanticsNode semanticsNode = new SemanticsNode(new C1904k(dVar, new C1906m(i + i2, false, false, lVar)), false);
        semanticsNode.f4184c = true;
        semanticsNode.f4185d = this;
        return semanticsNode;
    }

    /* renamed from: c */
    public final LayoutNodeWrapper mo7304c() {
        if (!this.f4186e.f4247c) {
            return this.f4182a.f3919b;
        }
        C1904k S = C18263b.m30824S(this.f4188g);
        if (S == null) {
            S = this.f4182a;
        }
        return S.f3919b;
    }

    /* renamed from: d */
    public final C8345d mo7305d() {
        return !this.f4188g.mo6696c() ? C8345d.f18300e : C0114h.m275F(mo7304c());
    }

    /* renamed from: e */
    public final List mo7306e(boolean z) {
        return this.f4186e.f4248d ? EmptyList.INSTANCE : mo7309h() ? m4175b(this, (List) null, z, 1) : mo7311j(z, true);
    }

    /* renamed from: f */
    public final C1903j mo7307f() {
        if (!mo7309h()) {
            return this.f4186e;
        }
        C1903j jVar = this.f4186e;
        jVar.getClass();
        C1903j jVar2 = new C1903j();
        jVar2.f4247c = jVar.f4247c;
        jVar2.f4248d = jVar.f4248d;
        jVar2.f4246b.putAll(jVar.f4246b);
        mo7310i(jVar2);
        return jVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.semantics.SemanticsNode mo7308g() {
        /*
            r4 = this;
            androidx.compose.ui.semantics.SemanticsNode r0 = r4.f4185d
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            boolean r0 = r4.f4183b
            r1 = 0
            if (r0 == 0) goto L_0x0026
            androidx.compose.ui.node.LayoutNode r0 = r4.f4188g
            androidx.compose.ui.semantics.SemanticsNode$parent$1 r2 = androidx.compose.p015ui.semantics.SemanticsNode$parent$1.INSTANCE
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
        L_0x0012:
            if (r0 == 0) goto L_0x0026
            java.lang.Object r3 = r2.invoke(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
            goto L_0x0012
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 != 0) goto L_0x0046
            androidx.compose.ui.node.LayoutNode r0 = r4.f4188g
            androidx.compose.ui.semantics.SemanticsNode$parent$2 r2 = androidx.compose.p015ui.semantics.SemanticsNode$parent$2.INSTANCE
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
        L_0x0031:
            if (r0 == 0) goto L_0x0045
            java.lang.Object r3 = r2.invoke(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
            goto L_0x0031
        L_0x0045:
            r0 = r1
        L_0x0046:
            if (r0 == 0) goto L_0x004d
            androidx.compose.ui.semantics.k r0 = p628nj.C18263b.m30825T(r0)
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 != 0) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.semantics.SemanticsNode r1 = new androidx.compose.ui.semantics.SemanticsNode
            boolean r2 = r4.f4183b
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.semantics.SemanticsNode.mo7308g():androidx.compose.ui.semantics.SemanticsNode");
    }

    /* renamed from: h */
    public final boolean mo7309h() {
        return this.f4183b && this.f4186e.f4247c;
    }

    /* renamed from: i */
    public final void mo7310i(C1903j jVar) {
        if (!this.f4186e.f4248d) {
            List<SemanticsNode> j = mo7311j(false, false);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = j.get(i);
                if (!semanticsNode.mo7309h()) {
                    C1903j jVar2 = semanticsNode.f4186e;
                    C19383o.m32797g(jVar2, "child");
                    for (Map.Entry entry : jVar2.f4246b.entrySet()) {
                        C1909p pVar = (C1909p) entry.getKey();
                        Object value = entry.getValue();
                        T invoke = pVar.f4269b.invoke(jVar.f4246b.get(pVar), value);
                        if (invoke != null) {
                            jVar.f4246b.put(pVar, invoke);
                        }
                    }
                    semanticsNode.mo7310i(jVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final List<SemanticsNode> mo7311j(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.f4184c) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            LayoutNode layoutNode = this.f4188g;
            arrayList = new ArrayList();
            C19388s.m32853Y(layoutNode, arrayList);
        } else {
            LayoutNode layoutNode2 = this.f4188g;
            arrayList = new ArrayList();
            C18263b.m30817L(layoutNode2, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new SemanticsNode((C1904k) arrayList.get(i), this.f4183b));
        }
        if (z2) {
            C1900g gVar = (C1900g) SemanticsConfigurationKt.m4173a(this.f4186e, SemanticsProperties.f4206q);
            if (gVar != null && this.f4186e.f4247c && (!arrayList2.isEmpty())) {
                arrayList2.add(mo7303a(gVar, new SemanticsNode$emitFakeNodes$fakeNode$1(gVar)));
            }
            C1903j jVar = this.f4186e;
            C1909p pVar = SemanticsProperties.f4190a;
            if (jVar.mo7343c(pVar) && (!arrayList2.isEmpty())) {
                C1903j jVar2 = this.f4186e;
                if (jVar2.f4247c) {
                    List list = (List) SemanticsConfigurationKt.m4173a(jVar2, pVar);
                    String str = list != null ? (String) C19327t.m32640V0(list) : null;
                    if (str != null) {
                        arrayList2.add(0, mo7303a((C1900g) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
                    }
                }
            }
        }
        return arrayList2;
    }
}
