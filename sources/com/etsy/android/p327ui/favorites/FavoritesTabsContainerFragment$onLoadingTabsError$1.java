package com.etsy.android.p327ui.favorites;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$onLoadingTabsError$1 */
public final class FavoritesTabsContainerFragment$onLoadingTabsError$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FavoritesTabsContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabsContainerFragment$onLoadingTabsError$1(FavoritesTabsContainerFragment favoritesTabsContainerFragment) {
        super(1);
        this.this$0 = favoritesTabsContainerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.loadTabs();
    }
}
