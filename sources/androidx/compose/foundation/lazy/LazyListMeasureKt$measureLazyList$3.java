package androidx.compose.foundation.lazy;

import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyListMeasureKt$measureLazyList$3 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C0858q $headerItem;
    public final /* synthetic */ List<C0858q> $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$3(List<C0858q> list, C0858q qVar) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$invoke");
        List<C0858q> list = this.$positionedItems;
        C0858q qVar = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0858q qVar2 = list.get(i);
            if (qVar2 != qVar) {
                qVar2.mo4397e(aVar);
            }
        }
        C0858q qVar3 = this.$headerItem;
        if (qVar3 != null) {
            qVar3.mo4397e(aVar);
        }
    }
}
