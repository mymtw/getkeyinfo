package com.etsy.android.p327ui.home.home;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.home.HomeFragment$setServerMessage$1 */
public final class HomeFragment$setServerMessage$1 extends TrackingOnClickListener {
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$setServerMessage$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.getViewModel().mo33216e(false);
    }
}
