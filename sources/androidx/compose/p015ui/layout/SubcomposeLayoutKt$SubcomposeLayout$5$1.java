package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.C1704r;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1 */
public final class SubcomposeLayoutKt$SubcomposeLayout$5$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1342k1<SubcomposeLayoutState> $stateHolder;

    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1$a */
    public static final class C1661a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1342k1 f3701a;

        public C1661a(C1342k1 k1Var) {
            this.f3701a = k1Var;
        }

        public final void dispose() {
            C1704r a = ((SubcomposeLayoutState) this.f3701a.getValue()).mo6650a();
            LayoutNode layoutNode = a.f3739a;
            layoutNode.f3827l = true;
            for (C1704r.C1705a aVar : a.f3743e.values()) {
                C1320f fVar = aVar.f3753c;
                if (fVar != null) {
                    fVar.dispose();
                }
            }
            a.f3739a.mo6750O();
            layoutNode.f3827l = false;
            a.f3743e.clear();
            a.f3744f.clear();
            a.f3749k = 0;
            a.f3748j = 0;
            a.f3746h.clear();
            a.mo6719b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$5$1(C1342k1<SubcomposeLayoutState> k1Var) {
        super(1);
        this.$stateHolder = k1Var;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C1661a(this.$stateHolder);
    }
}
