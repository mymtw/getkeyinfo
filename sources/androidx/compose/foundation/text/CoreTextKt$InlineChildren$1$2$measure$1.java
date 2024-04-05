package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextKt$InlineChildren$1$2$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ List<C1686i0> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextKt$InlineChildren$1$2$measure$1(List<? extends C1686i0> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        List<C1686i0> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1686i0.C1687a.m3583e(aVar, list.get(i), 0, 0);
        }
    }
}
