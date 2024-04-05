package com.etsy.android.p327ui.favorites;

import com.etsy.android.p327ui.favorites.C9856k;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p213q2.C7717a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$loadTabs$2 */
public final class FavoritesTabsContainerFragment$loadTabs$2 extends Lambda implements C19857l<C9856k, C19394m> {
    public final /* synthetic */ FavoritesTabsContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabsContainerFragment$loadTabs$2(FavoritesTabsContainerFragment favoritesTabsContainerFragment) {
        super(1);
        this.this$0 = favoritesTabsContainerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9856k) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9856k kVar) {
        if (kVar instanceof C9856k.C9858b) {
            ArrayList access$getTabData$p = this.this$0.tabData;
            access$getTabData$p.clear();
            access$getTabData$p.addAll(((C9856k.C9858b) kVar).f21762a);
            C9866r access$getTabsAdapter$p = this.this$0.tabsAdapter;
            if (access$getTabsAdapter$p != null) {
                access$getTabsAdapter$p.mo20188p();
            }
            this.this$0.tabsAdapter = null;
            ToggleableSwipeViewPager access$getViewPager$p = this.this$0.viewPager;
            if (access$getViewPager$p != null) {
                access$getViewPager$p.setAdapter((C7717a) null);
            }
            this.this$0.initTabs();
            return;
        }
        this.this$0.onLoadingTabsError();
    }
}
