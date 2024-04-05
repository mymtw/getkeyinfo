package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1324g;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import p001a0.C0005b;
import p174m0.C7280a;
import p219r.C7734e;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState */
public final class SubcomposeLayoutState {

    /* renamed from: a */
    public final C1698n0 f3702a;

    /* renamed from: b */
    public C1704r f3703b;

    /* renamed from: c */
    public final C19861p<LayoutNode, SubcomposeLayoutState, C19394m> f3704c;

    /* renamed from: d */
    public final C19861p<LayoutNode, C1324g, C19394m> f3705d;

    /* renamed from: e */
    public final C19861p<LayoutNode, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w>, C19394m> f3706e;

    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$a */
    public interface C1662a {
        /* renamed from: a */
        int mo6652a() {
            return 0;
        }

        /* renamed from: b */
        void mo6653b(int i, long j) {
        }

        void dispose();
    }

    public SubcomposeLayoutState(C1698n0 n0Var) {
        this.f3702a = n0Var;
        this.f3704c = new SubcomposeLayoutState$setRoot$1(this);
        this.f3705d = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.f3706e = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* renamed from: a */
    public final C1704r mo6650a() {
        C1704r rVar = this.f3703b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    /* renamed from: b */
    public final C1709t mo6651b(Object obj, C19861p pVar) {
        C1704r a = mo6650a();
        a.mo6719b();
        if (!a.f3744f.containsKey(obj)) {
            LinkedHashMap linkedHashMap = a.f3746h;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = a.mo6721d(obj);
                if (obj2 != null) {
                    int indexOf = ((C7734e.C7735a) a.f3739a.mo6765v()).indexOf(obj2);
                    int i = ((C7734e.C7735a) a.f3739a.mo6765v()).f17158b.f17157d;
                    LayoutNode layoutNode = a.f3739a;
                    layoutNode.f3827l = true;
                    layoutNode.mo6746K(indexOf, i, 1);
                    layoutNode.f3827l = false;
                    a.f3749k++;
                } else {
                    int i2 = ((C7734e.C7735a) a.f3739a.mo6765v()).f17158b.f17157d;
                    LayoutNode layoutNode2 = new LayoutNode(true);
                    LayoutNode layoutNode3 = a.f3739a;
                    layoutNode3.f3827l = true;
                    layoutNode3.mo6739B(i2, layoutNode2);
                    layoutNode3.f3827l = false;
                    a.f3749k++;
                    obj2 = layoutNode2;
                }
                linkedHashMap.put(obj, obj2);
            }
            a.mo6720c((LayoutNode) obj2, obj, pVar);
        }
        return new C1709t(a, obj);
    }

    public SubcomposeLayoutState() {
        this(C0005b.f8f);
    }
}
