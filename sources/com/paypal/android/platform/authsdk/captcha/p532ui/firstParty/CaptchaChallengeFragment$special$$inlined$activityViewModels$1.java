package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2878l0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeFragment$special$$inlined$activityViewModels$1 */
public final class CaptchaChallengeFragment$special$$inlined$activityViewModels$1 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeFragment$special$$inlined$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final C2878l0 invoke() {
        FragmentActivity requireActivity = this.$this_activityViewModels.requireActivity();
        C19383o.m32793c(requireActivity, "requireActivity()");
        C2878l0 viewModelStore = requireActivity.getViewModelStore();
        C19383o.m32793c(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
