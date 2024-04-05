package androidx.compose.p015ui.semantics;

import androidx.activity.C0114h;
import androidx.compose.p015ui.node.C1737d;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p288y.C8345d;

/* renamed from: androidx.compose.ui.semantics.NodeLocationHolder */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* renamed from: f */
    public static ComparisonStrategy f4177f = ComparisonStrategy.Stripe;

    /* renamed from: b */
    public final LayoutNode f4178b;

    /* renamed from: c */
    public final LayoutNode f4179c;

    /* renamed from: d */
    public final C8345d f4180d;

    /* renamed from: e */
    public final LayoutDirection f4181e;

    /* renamed from: androidx.compose.ui.semantics.NodeLocationHolder$ComparisonStrategy */
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public NodeLocationHolder(LayoutNode layoutNode, LayoutNode layoutNode2) {
        C19383o.m32797g(layoutNode, "subtreeRoot");
        this.f4178b = layoutNode;
        this.f4179c = layoutNode2;
        this.f4181e = layoutNode.f3834s;
        C1737d dVar = layoutNode.f3800D;
        LayoutNodeWrapper Z = C19388s.m32854Z(layoutNode2);
        this.f4180d = (!dVar.mo6685c() || !Z.mo6685c()) ? null : dVar.mo6689v(Z, true);
    }

    /* renamed from: a */
    public final int compareTo(NodeLocationHolder nodeLocationHolder) {
        C19383o.m32797g(nodeLocationHolder, "other");
        C8345d dVar = this.f4180d;
        if (dVar == null) {
            return 1;
        }
        C8345d dVar2 = nodeLocationHolder.f4180d;
        if (dVar2 == null) {
            return -1;
        }
        if (f4177f == ComparisonStrategy.Stripe) {
            if (dVar.f18304d - dVar2.f18302b <= 0.0f) {
                return -1;
            }
            if (dVar.f18302b - dVar2.f18304d >= 0.0f) {
                return 1;
            }
        }
        boolean z = false;
        if (this.f4181e == LayoutDirection.Ltr) {
            int i = ((dVar.f18301a - dVar2.f18301a) > 0.0f ? 1 : ((dVar.f18301a - dVar2.f18301a) == 0.0f ? 0 : -1));
            if (!(i == 0)) {
                return i < 0 ? -1 : 1;
            }
        } else {
            int i2 = ((dVar.f18303c - dVar2.f18303c) > 0.0f ? 1 : ((dVar.f18303c - dVar2.f18303c) == 0.0f ? 0 : -1));
            if (!(i2 == 0)) {
                return i2 < 0 ? 1 : -1;
            }
        }
        float f = dVar.f18302b;
        float f2 = dVar2.f18302b;
        int i3 = ((f - f2) > 0.0f ? 1 : ((f - f2) == 0.0f ? 0 : -1));
        if (!(i3 == 0)) {
            return i3 < 0 ? -1 : 1;
        }
        int i4 = (((dVar.f18304d - f) - (dVar2.f18304d - f2)) > 0.0f ? 1 : (((dVar.f18304d - f) - (dVar2.f18304d - f2)) == 0.0f ? 0 : -1));
        if (!(i4 == 0)) {
            return i4 < 0 ? 1 : -1;
        }
        int i5 = (((dVar.f18303c - dVar.f18301a) - (dVar2.f18303c - dVar2.f18301a)) > 0.0f ? 1 : (((dVar.f18303c - dVar.f18301a) - (dVar2.f18303c - dVar2.f18301a)) == 0.0f ? 0 : -1));
        if (i5 == 0) {
            z = true;
        }
        if (!z) {
            return i5 < 0 ? 1 : -1;
        }
        C8345d F = C0114h.m275F(C19388s.m32854Z(this.f4179c));
        C8345d F2 = C0114h.m275F(C19388s.m32854Z(nodeLocationHolder.f4179c));
        LayoutNode X = C19388s.m32852X(this.f4179c, new NodeLocationHolder$compareTo$child1$1(F));
        LayoutNode X2 = C19388s.m32852X(nodeLocationHolder.f4179c, new NodeLocationHolder$compareTo$child2$1(F2));
        return (X == null || X2 == null) ? X != null ? 1 : -1 : new NodeLocationHolder(this.f4178b, X).compareTo(new NodeLocationHolder(nodeLocationHolder.f4178b, X2));
    }
}
