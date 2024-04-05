package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p213q2.C7717a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$onCreate$1 */
public final class HomePagerFragment$onCreate$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ HomePagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerFragment$onCreate$1(HomePagerFragment homePagerFragment) {
        super(1);
        this.this$0 = homePagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        C10052b access$getTabsAdapter$p = this.this$0.tabsAdapter;
        if (access$getTabsAdapter$p != null) {
            access$getTabsAdapter$p.f22149k = EmptyList.INSTANCE;
            access$getTabsAdapter$p.mo20188p();
        }
        this.this$0.tabsAdapter = null;
        ToggleableSwipeViewPager access$getViewPager$p = this.this$0.viewPager;
        if (access$getViewPager$p != null) {
            access$getViewPager$p.setAdapter((C7717a) null);
        }
    }
}
