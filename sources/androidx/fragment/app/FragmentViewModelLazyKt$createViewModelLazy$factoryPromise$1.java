package androidx.fragment.app;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    public final C2870k0.C2872b invoke() {
        C2870k0.C2872b defaultViewModelProviderFactory = this.$this_createViewModelLazy.getDefaultViewModelProviderFactory();
        C19383o.m32796f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
