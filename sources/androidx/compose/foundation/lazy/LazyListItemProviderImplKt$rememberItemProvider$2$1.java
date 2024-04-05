package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p764pq.C20057i;

final class LazyListItemProviderImplKt$rememberItemProvider$2$1 extends Lambda implements C19846a<LazyListItemsSnapshot> {
    public final /* synthetic */ C1342k1<C19857l<C0859r, C19394m>> $latestContent;
    public final /* synthetic */ C1338j0<C20057i> $nearestItemsRangeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImplKt$rememberItemProvider$2$1(C1342k1<? extends C19857l<? super C0859r, C19394m>> k1Var, C1338j0<C20057i> j0Var) {
        super(0);
        this.$latestContent = k1Var;
        this.$nearestItemsRangeState = j0Var;
    }

    public final LazyListItemsSnapshot invoke() {
        C0860s sVar = new C0860s();
        this.$latestContent.getValue().invoke(sVar);
        return new LazyListItemsSnapshot(sVar.f1846b, EmptyList.INSTANCE, this.$nearestItemsRangeState.getValue());
    }
}
