package androidx.fragment.app;

import androidx.lifecycle.C2878l0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FragmentViewModelLazyKt$activityViewModels$1 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final C2878l0 invoke() {
        C2878l0 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        C19383o.m32796f(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
