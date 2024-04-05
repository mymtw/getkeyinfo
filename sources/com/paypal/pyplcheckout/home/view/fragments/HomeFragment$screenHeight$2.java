package com.paypal.pyplcheckout.home.view.fragments;

import android.content.Context;
import com.paypal.pyplcheckout.utils.ScreenMetricsCompat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class HomeFragment$screenHeight$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragment$screenHeight$2(HomeFragment homeFragment) {
        super(0);
        this.this$0 = homeFragment;
    }

    public final Integer invoke() {
        ScreenMetricsCompat screenMetricsCompat = ScreenMetricsCompat.INSTANCE;
        Context requireContext = this.this$0.requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        return Integer.valueOf(screenMetricsCompat.getScreenSize(requireContext).getHeight());
    }
}
