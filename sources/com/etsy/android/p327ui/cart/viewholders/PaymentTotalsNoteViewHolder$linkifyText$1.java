package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: com.etsy.android.ui.cart.viewholders.PaymentTotalsNoteViewHolder$linkifyText$1 */
public final class PaymentTotalsNoteViewHolder$linkifyText$1 extends TrackingOnClickListener {
    public final /* synthetic */ String $url;
    public final /* synthetic */ C9377f0 this$0;

    public PaymentTotalsNoteViewHolder$linkifyText$1(C9377f0 f0Var, String str) {
        this.this$0 = f0Var;
        this.$url = str;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C19421p.m32932V(this.this$0.itemView.getContext(), new GenericHelpKey(C19421p.m32935c0(this.this$0.itemView.getContext()), this.$url));
    }
}
