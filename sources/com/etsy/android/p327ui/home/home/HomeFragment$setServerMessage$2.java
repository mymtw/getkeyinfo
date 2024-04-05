package com.etsy.android.p327ui.home.home;

import android.view.View;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.home.HomeFragment$setServerMessage$2 */
public final class HomeFragment$setServerMessage$2 extends TrackingOnClickListener {
    public final /* synthetic */ MessageCard $messageCard;
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$setServerMessage$2(HomeFragment homeFragment, MessageCard messageCard) {
        this.this$0 = homeFragment;
        this.$messageCard = messageCard;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.handleEmptyMessageClick(this.$messageCard);
    }
}
