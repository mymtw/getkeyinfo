package androidx.compose.p015ui.node;

import androidx.compose.p015ui.C1436d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7734e;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.node.LayoutNode$markReusedModifiers$2 */
final class LayoutNode$markReusedModifiers$2 extends Lambda implements C19861p<C19394m, C1436d.C1438b, C19394m> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$markReusedModifiers$2(LayoutNode layoutNode) {
        super(2);
        this.this$0 = layoutNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C19394m) obj, (C1436d.C1438b) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar, C1436d.C1438b bVar) {
        T t;
        C19383o.m32797g(mVar, "<anonymous parameter 0>");
        C19383o.m32797g(bVar, "mod");
        C7734e<C1745k> eVar = this.this$0.f3826k;
        int i = eVar.f17157d;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = eVar.f17155b;
            while (true) {
                t = tArr[i2];
                C1745k kVar = (C1745k) t;
                if (kVar.f3934D == bVar && !kVar.f3935E) {
                    break;
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
            t = null;
        } else {
            t = null;
        }
        C1745k kVar2 = (C1745k) t;
        if (kVar2 != null) {
            kVar2.f3935E = true;
        }
    }
}
