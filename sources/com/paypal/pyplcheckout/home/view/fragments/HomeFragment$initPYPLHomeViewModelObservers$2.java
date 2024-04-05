package com.paypal.pyplcheckout.home.view.fragments;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.model.HomeViewContentPageConfig;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import kotlin.jvm.internal.C19383o;

public final class HomeFragment$initPYPLHomeViewModelObservers$2 implements EventListener {
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$initPYPLHomeViewModelObservers$2(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FragmentInfo fragmentInfo = data instanceof FragmentInfo ? (FragmentInfo) data : null;
        if (fragmentInfo == null || !ContentRouter.INSTANCE.doesFragmentNotExistOrNull(fragmentInfo.getFragmentId(), fragmentInfo.getFragment())) {
            BottomSheetBehavior access$getHomeSheetBottomBehavior$p = this.this$0.homeSheetBottomBehavior;
            if (access$getHomeSheetBottomBehavior$p != null) {
                access$getHomeSheetBottomBehavior$p.setHideable(true);
            }
            BottomSheetBehavior access$getHomeSheetBottomBehavior$p2 = this.this$0.homeSheetBottomBehavior;
            if (access$getHomeSheetBottomBehavior$p2 != null) {
                access$getHomeSheetBottomBehavior$p2.setState(5);
            }
            HomeViewContentPageConfig access$getMHomeViewContentPageConfig$p = this.this$0.mHomeViewContentPageConfig;
            if (access$getMHomeViewContentPageConfig$p != null) {
                access$getMHomeViewContentPageConfig$p.removeContentViewListeners();
                MainPaysheetViewModel access$getViewModel$p = this.this$0.viewModel;
                if (access$getViewModel$p != null) {
                    access$getViewModel$p.startFragment(this.this$0.getContext(), fragmentInfo == null ? null : fragmentInfo.getFragmentId());
                    HomeViewContentPageConfig access$getMHomeViewContentPageConfig$p2 = this.this$0.mHomeViewContentPageConfig;
                    if (access$getMHomeViewContentPageConfig$p2 != null) {
                        access$getMHomeViewContentPageConfig$p2.clearHomeScreenViews();
                        this.this$0.getEvents().removeListener(PayPalEventTypes.START_FRAGMENT, this);
                        return;
                    }
                    C19383o.m32805o("mHomeViewContentPageConfig");
                    throw null;
                }
                C19383o.m32805o("viewModel");
                throw null;
            }
            C19383o.m32805o("mHomeViewContentPageConfig");
            throw null;
        }
    }
}
