package androidx.activity;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ActivityViewModelLazyKt$viewModels$factoryPromise$1 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$factoryPromise$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public final C2870k0.C2872b invoke() {
        C2870k0.C2872b defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        C19383o.m32796f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
