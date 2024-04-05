package androidx.compose.p015ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1903j;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1905l;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p015ui.semantics.SemanticsNode;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import androidx.compose.p015ui.text.C2021q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p111g1.C6829a;
import p288y.C8342b;
import p288y.C8345d;
import p288y.C8347f;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.t */
public final class C1875t implements C6829a {
    /* renamed from: a */
    public static final boolean m4078a(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.m4173a(semanticsNode.mo7307f(), SemanticsProperties.f4198i) == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r2 = r2.mo7349c();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m4079b(androidx.compose.p015ui.semantics.SemanticsNode r2) {
        /*
            boolean r0 = m4083f(r2)
            if (r0 == 0) goto L_0x0017
            androidx.compose.ui.semantics.j r0 = r2.f4186e
            androidx.compose.ui.semantics.p<java.lang.Boolean> r1 = androidx.compose.p015ui.semantics.SemanticsProperties.f4200k
            java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 != 0) goto L_0x0017
            goto L_0x003e
        L_0x0017:
            androidx.compose.ui.node.LayoutNode r2 = r2.f4188g
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 r0 = androidx.compose.p015ui.platform.C1775x93be146e.INSTANCE
            androidx.compose.ui.node.LayoutNode r2 = m4081d(r2, r0)
            r0 = 0
            if (r2 == 0) goto L_0x003f
            androidx.compose.ui.semantics.k r2 = p628nj.C18263b.m30825T(r2)
            if (r2 == 0) goto L_0x003b
            androidx.compose.ui.semantics.j r2 = r2.mo7349c()
            if (r2 == 0) goto L_0x003b
            androidx.compose.ui.semantics.p<java.lang.Boolean> r1 = androidx.compose.p015ui.semantics.SemanticsProperties.f4200k
            java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r1)
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r2 != 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1875t.m4079b(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    /* renamed from: c */
    public static final C1892z0 m4080c(int i, ArrayList arrayList) {
        C19383o.m32797g(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C1892z0) arrayList.get(i2)).f4171b == i) {
                return (C1892z0) arrayList.get(i2);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final LayoutNode m4081d(LayoutNode layoutNode, C19857l lVar) {
        for (LayoutNode w = layoutNode.mo6766w(); w != null; w = w.mo6766w()) {
            if (((Boolean) lVar.invoke(w)).booleanValue()) {
                return w;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final void m4082e(Region region, SemanticsNode semanticsNode, LinkedHashMap linkedHashMap, SemanticsNode semanticsNode2) {
        C1904k kVar;
        C8345d dVar;
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = semanticsNode2.f4188g;
        boolean z = false;
        boolean z2 = !layoutNode2.f3837v || !layoutNode2.mo6696c();
        if (region.isEmpty() && semanticsNode2.f4187f != semanticsNode.f4187f) {
            return;
        }
        if (!z2 || semanticsNode2.f4184c) {
            if (semanticsNode2.f4186e.f4247c) {
                kVar = C18263b.m30824S(semanticsNode2.f4188g);
                if (kVar == null) {
                    kVar = semanticsNode2.f4182a;
                }
            } else {
                kVar = semanticsNode2.f4182a;
            }
            if (kVar.f3922e) {
                if (SemanticsConfigurationKt.m4173a(((C1905l) kVar.f3920c).mo7351N0(), C1902i.f4231b) != null) {
                    LayoutNodeWrapper layoutNodeWrapper = kVar.f3919b;
                    if (layoutNodeWrapper.mo6685c()) {
                        C1689j Y = C0114h.m294Y(layoutNodeWrapper);
                        C8342b bVar = layoutNodeWrapper.f3863s;
                        if (bVar == null) {
                            bVar = new C8342b();
                            layoutNodeWrapper.f3863s = bVar;
                        }
                        long S0 = layoutNodeWrapper.mo6782S0(layoutNodeWrapper.mo6791b1());
                        bVar.f18291a = -C8347f.m16656d(S0);
                        bVar.f18292b = -C8347f.m16654b(S0);
                        bVar.f18293c = C8347f.m16656d(S0) + ((float) layoutNodeWrapper.mo6676o0());
                        bVar.f18294d = C8347f.m16654b(S0) + ((float) layoutNodeWrapper.mo6675i0());
                        while (true) {
                            if (layoutNodeWrapper == Y) {
                                dVar = new C8345d(bVar.f18291a, bVar.f18292b, bVar.f18293c, bVar.f18294d);
                                break;
                            }
                            layoutNodeWrapper.mo6804o1(bVar, false, true);
                            if (bVar.mo20921b()) {
                                dVar = C8345d.f18300e;
                                break;
                            } else {
                                layoutNodeWrapper = layoutNodeWrapper.f3851g;
                                C19383o.m32794d(layoutNodeWrapper);
                            }
                        }
                    } else {
                        dVar = C8345d.f18300e;
                    }
                } else {
                    dVar = C0114h.m275F(kVar.f3919b);
                }
            } else {
                dVar = C8345d.f18300e;
            }
            Rect y0 = C0114h.m330y0(dVar);
            Region region2 = new Region();
            region2.set(y0);
            int i = semanticsNode2.f4187f;
            if (i == semanticsNode.f4187f) {
                i = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                Rect bounds = region2.getBounds();
                C19383o.m32796f(bounds, "region.bounds");
                linkedHashMap.put(valueOf, new C1814a1(semanticsNode2, bounds));
                List e = semanticsNode2.mo7306e(false);
                for (int size = e.size() - 1; -1 < size; size--) {
                    m4082e(region, semanticsNode, linkedHashMap, (SemanticsNode) e.get(size));
                }
                region.op(y0, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.f4184c) {
                SemanticsNode g = semanticsNode2.mo7308g();
                if (!(g == null || (layoutNode = g.f4188g) == null || !layoutNode.f3837v)) {
                    z = true;
                }
                linkedHashMap.put(Integer.valueOf(i), new C1814a1(semanticsNode2, C0114h.m330y0(z ? g.mo7305d() : new C8345d(0.0f, 0.0f, 10.0f, 10.0f))));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                Rect bounds2 = region2.getBounds();
                C19383o.m32796f(bounds2, "region.bounds");
                linkedHashMap.put(valueOf2, new C1814a1(semanticsNode2, bounds2));
            }
        }
    }

    /* renamed from: f */
    public static final boolean m4083f(SemanticsNode semanticsNode) {
        C1903j jVar = semanticsNode.f4186e;
        C1909p<C1894a<C19857l<List<C2021q>, Boolean>>> pVar = C1902i.f4230a;
        return jVar.mo7343c(C1902i.f4237h);
    }
}
