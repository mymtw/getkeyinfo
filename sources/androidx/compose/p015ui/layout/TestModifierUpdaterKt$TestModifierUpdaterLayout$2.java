package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$2 */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19857l<C15562d, C19394m> $onAttached;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(C19857l<? super C15562d, C19394m> lVar, int i) {
        super(2);
        this.$onAttached = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C19857l<C15562d, C19394m> lVar = this.$onAttached;
        int i3 = this.$$changed | 1;
        C19383o.m32797g(lVar, "onAttached");
        ComposerImpl h = dVar.mo5440h(-1673066036);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(lVar) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.f3707a;
            C19846a<LayoutNode> aVar = LayoutNode.f3793W;
            h.mo5465u(1886828752);
            if (h.f2715a instanceof C1299c) {
                h.mo5470w0();
                if (h.f2702K) {
                    h.mo5450m(new C1663xeabd4719(aVar));
                } else {
                    h.mo5452n();
                }
                ComposeUiNode.f3776c0.getClass();
                Updater.m2571b(h, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.Companion.f3781e);
                Updater.m2570a(h, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(lVar));
                h.mo5418R(true);
                h.mo5418R(false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(lVar, i3);
        }
    }
}
