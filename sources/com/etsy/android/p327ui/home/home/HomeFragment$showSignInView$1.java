package com.etsy.android.p327ui.home.home;

import android.view.View;
import com.etsy.android.p327ui.user.auth.C11487l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.home.HomeFragment$showSignInView$1 */
public final class HomeFragment$showSignInView$1 extends TrackingOnClickListener {
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$showSignInView$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        HomeFragment.navigateToSignIn$default(this.this$0, (C11487l) null, 1, (Object) null);
    }
}
