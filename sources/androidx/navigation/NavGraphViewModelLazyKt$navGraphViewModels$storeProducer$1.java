package androidx.navigation;

import androidx.lifecycle.C2878l0;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19846a;

public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ C19285c $backStackEntry;
    public final /* synthetic */ C19410j $backStackEntry$metadata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(C19285c cVar, C19410j jVar) {
        super(0);
        this.$backStackEntry = cVar;
        this.$backStackEntry$metadata = jVar;
    }

    public final C2878l0 invoke() {
        C2953d dVar = (C2953d) this.$backStackEntry.getValue();
        C19383o.m32793c(dVar, "backStackEntry");
        return dVar.getViewModelStore();
    }
}
