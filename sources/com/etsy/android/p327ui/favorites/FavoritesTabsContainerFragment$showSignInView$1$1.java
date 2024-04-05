package com.etsy.android.p327ui.favorites;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p370ie.C12948h;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$showSignInView$1$1 */
public final class FavoritesTabsContainerFragment$showSignInView$1$1 extends TrackingOnClickListener {
    public final /* synthetic */ FavoritesTabsContainerFragment this$0;

    public FavoritesTabsContainerFragment$showSignInView$1$1(FavoritesTabsContainerFragment favoritesTabsContainerFragment) {
        this.this$0 = favoritesTabsContainerFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C12790b.m20430b(this.this$0, new C12948h(C12790b.m20432d(this.this$0), EtsyAction.VIEW_FEED, (Bundle) null, (String) null, (String) null, (String) null, 60));
    }
}
