package androidx.activity;

import androidx.lifecycle.C2878l0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ActivityViewModelLazyKt$viewModels$1 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public final C2878l0 invoke() {
        C2878l0 viewModelStore = this.$this_viewModels.getViewModelStore();
        C19383o.m32796f(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
