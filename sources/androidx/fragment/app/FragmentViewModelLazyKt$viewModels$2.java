package androidx.fragment.app;

import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FragmentViewModelLazyKt$viewModels$2 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ C19846a<C2880m0> $ownerProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(C19846a<? extends C2880m0> aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    public final C2878l0 invoke() {
        C2878l0 viewModelStore = this.$ownerProducer.invoke().getViewModelStore();
        C19383o.m32796f(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
