package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3 */
public final class AndroidPopup_androidKt$SimpleStack$1$measure$3 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ List<C1686i0> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$SimpleStack$1$measure$3(List<? extends C1686i0> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        int Y = C17782b.m29859Y(this.$placeables);
        if (Y >= 0) {
            int i = 0;
            while (true) {
                C1686i0.C1687a.m3583e(aVar, this.$placeables.get(i), 0, 0);
                if (i != Y) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
