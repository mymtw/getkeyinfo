package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p764pq.C20057i;

final class LazyGridItemProviderImplKt$rememberItemProvider$2$1 extends Lambda implements C19846a<C0810l> {
    public final /* synthetic */ C1342k1<C19857l<Object, C19394m>> $latestContent;
    public final /* synthetic */ C1338j0<C20057i> $nearestItemsRangeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImplKt$rememberItemProvider$2$1(C1342k1<? extends C19857l<Object, C19394m>> k1Var, C1338j0<C20057i> j0Var) {
        super(0);
        this.$latestContent = k1Var;
        this.$nearestItemsRangeState = j0Var;
    }

    public final C0810l invoke() {
        LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
        this.$latestContent.getValue().invoke(lazyGridScopeImpl);
        return new C0810l(lazyGridScopeImpl.f1658a, this.$nearestItemsRangeState.getValue());
    }
}
