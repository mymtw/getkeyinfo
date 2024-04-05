package androidx.compose.p015ui.node;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.node.ComposeUiNode */
public interface ComposeUiNode {

    /* renamed from: c0 */
    public static final Companion f3776c0 = Companion.f3777a;

    /* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f3777a = new Companion();

        /* renamed from: b */
        public static final C19846a<ComposeUiNode> f3778b = LayoutNode.f3793W;

        /* renamed from: c */
        public static final C19861p<ComposeUiNode, C1436d, C19394m> f3779c = ComposeUiNode$Companion$SetModifier$1.INSTANCE;

        /* renamed from: d */
        public static final C19861p<ComposeUiNode, C7282b, C19394m> f3780d = ComposeUiNode$Companion$SetDensity$1.INSTANCE;

        /* renamed from: e */
        public static final C19861p<ComposeUiNode, C1711v, C19394m> f3781e = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;

        /* renamed from: f */
        public static final C19861p<ComposeUiNode, LayoutDirection, C19394m> f3782f = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;

        /* renamed from: g */
        public static final C19861p<ComposeUiNode, C1843j1, C19394m> f3783g = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;

        static {
            LayoutNode.C1721b bVar = LayoutNode.f3792V;
        }

        /* renamed from: a */
        public static C19846a m3660a() {
            return f3778b;
        }

        /* renamed from: b */
        public static C19861p m3661b() {
            return f3780d;
        }

        /* renamed from: c */
        public static C19861p m3662c() {
            return f3782f;
        }

        /* renamed from: d */
        public static C19861p m3663d() {
            return f3781e;
        }

        /* renamed from: e */
        public static C19861p m3664e() {
            return f3783g;
        }
    }

    /* renamed from: d */
    void mo6725d(C1843j1 j1Var);

    /* renamed from: e */
    void mo6726e(LayoutDirection layoutDirection);

    /* renamed from: g */
    void mo6727g(C7282b bVar);

    /* renamed from: j */
    void mo6728j(C1711v vVar);

    /* renamed from: k */
    void mo6729k(C1436d dVar);
}
