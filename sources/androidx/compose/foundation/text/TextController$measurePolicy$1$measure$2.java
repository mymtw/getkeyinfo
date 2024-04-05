package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class TextController$measurePolicy$1$measure$2 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ List<Pair<C1686i0, C7287g>> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$measurePolicy$1$measure$2(List<? extends Pair<? extends C1686i0, C7287g>> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        List<Pair<C1686i0, C7287g>> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = list.get(i);
            C1686i0.C1687a.m3582d((C1686i0) pair.component1(), ((C7287g) pair.component2()).f16166a, 0.0f);
        }
    }
}
