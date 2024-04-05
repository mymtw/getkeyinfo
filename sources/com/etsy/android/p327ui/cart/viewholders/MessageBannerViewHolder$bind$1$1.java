package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.MessageBannerViewHolder$bind$1$1 */
public final class MessageBannerViewHolder$bind$1$1 extends TrackingOnClickListener {
    public final /* synthetic */ CartGroupItem $item;
    public final /* synthetic */ C9407u this$0;

    public MessageBannerViewHolder$bind$1$1(CartGroupItem cartGroupItem, C9407u uVar) {
        this.$item = cartGroupItem;
        this.this$0 = uVar;
    }

    public void onViewClick(View view) {
        ServerDrivenAction action = this.$item.getAction(ServerDrivenAction.TYPE_DISMISS);
        if (action != null) {
            C9407u uVar = this.this$0;
            C9282g gVar = uVar.f20858c;
            View view2 = uVar.itemView;
            C19383o.m32796f(view2, "rootView");
            gVar.mo45936d(view2, action);
        }
    }
}
