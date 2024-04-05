package androidx.navigation;

import androidx.lifecycle.C2870k0;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19846a;

public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ C19285c $backStackEntry;
    public final /* synthetic */ C19410j $backStackEntry$metadata;
    public final /* synthetic */ C19846a $factoryProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$1(C19846a aVar, C19285c cVar, C19410j jVar) {
        super(0);
        this.$factoryProducer = aVar;
        this.$backStackEntry = cVar;
        this.$backStackEntry$metadata = jVar;
    }

    public final C2870k0.C2872b invoke() {
        C2870k0.C2872b bVar;
        C19846a aVar = this.$factoryProducer;
        if (aVar != null && (bVar = (C2870k0.C2872b) aVar.invoke()) != null) {
            return bVar;
        }
        C2953d dVar = (C2953d) this.$backStackEntry.getValue();
        C19383o.m32793c(dVar, "backStackEntry");
        C2870k0.C2872b defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory();
        C19383o.m32793c(defaultViewModelProviderFactory, "backStackEntry.defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
