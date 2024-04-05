package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.SubcomposeLayoutState;
import androidx.compose.p015ui.node.LayoutNode;
import com.google.android.play.core.assetpacks.C15588c1;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.layout.t */
public final class C1709t implements SubcomposeLayoutState.C1662a {

    /* renamed from: a */
    public final /* synthetic */ C1704r f3765a;

    /* renamed from: b */
    public final /* synthetic */ Object f3766b;

    public C1709t(C1704r rVar, Object obj) {
        this.f3765a = rVar;
        this.f3766b = obj;
    }

    /* renamed from: a */
    public final int mo6652a() {
        C7734e<LayoutNode> y;
        LayoutNode layoutNode = (LayoutNode) this.f3765a.f3746h.get(this.f3766b);
        if (layoutNode == null || (y = layoutNode.mo6768y()) == null) {
            return 0;
        }
        return y.f17157d;
    }

    /* renamed from: b */
    public final void mo6653b(int i, long j) {
        LayoutNode layoutNode = (LayoutNode) this.f3765a.f3746h.get(this.f3766b);
        if (layoutNode != null && layoutNode.mo6696c()) {
            int i2 = layoutNode.mo6768y().f17157d;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            } else if (!layoutNode.f3837v) {
                LayoutNode layoutNode2 = this.f3765a.f3739a;
                layoutNode2.f3827l = true;
                C15588c1.m25291L0(layoutNode).m34784measureAndLayout0kLqBqw((LayoutNode) layoutNode.mo6768y().f17155b[i], j);
                layoutNode2.f3827l = false;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final void dispose() {
        this.f3765a.mo6719b();
        LayoutNode layoutNode = (LayoutNode) this.f3765a.f3746h.remove(this.f3766b);
        if (layoutNode != null) {
            C1704r rVar = this.f3765a;
            if (rVar.f3749k > 0) {
                int indexOf = ((C7734e.C7735a) rVar.f3739a.mo6765v()).indexOf(layoutNode);
                int i = ((C7734e.C7735a) this.f3765a.f3739a.mo6765v()).f17158b.f17157d;
                C1704r rVar2 = this.f3765a;
                int i2 = rVar2.f3749k;
                if (indexOf >= i - i2) {
                    rVar2.f3748j++;
                    rVar2.f3749k = i2 - 1;
                    int i3 = ((C7734e.C7735a) rVar2.f3739a.mo6765v()).f17158b.f17157d;
                    C1704r rVar3 = this.f3765a;
                    int i4 = (i3 - rVar3.f3749k) - rVar3.f3748j;
                    LayoutNode layoutNode2 = rVar3.f3739a;
                    layoutNode2.f3827l = true;
                    layoutNode2.mo6746K(indexOf, i4, 1);
                    layoutNode2.f3827l = false;
                    this.f3765a.mo6718a(i4);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
