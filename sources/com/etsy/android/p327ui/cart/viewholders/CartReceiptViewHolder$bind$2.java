package com.etsy.android.p327ui.cart.viewholders;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import kotlin.C19394m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartReceiptViewHolder$bind$2 */
final class CartReceiptViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartReceipt $cartReceipt;
    public final /* synthetic */ CartReceiptViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartReceiptViewHolder$bind$2(CartReceiptViewHolder cartReceiptViewHolder, CartReceipt cartReceipt) {
        super(1);
        this.this$0 = cartReceiptViewHolder;
        this.$cartReceipt = cartReceipt;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9285j jVar = this.this$0.f20728c;
        if (jVar != null) {
            CartReceipt cartReceipt = this.$cartReceipt;
            FragmentActivity activity = jVar.mo45889a().getActivity();
            if (jVar.f20500d.mo30407a()) {
                C12788a.m20424c(activity, new ConversationDetailsNavigationKey(C19421p.m32935c0(activity), (Bundle) null, Long.valueOf(Long.parseLong(cartReceipt.getShopUserId().getId())), (String) null, cartReceipt.getShopName(), (Long) null, false, true, (String) null, false, 64, (DefaultConstructorMarker) null));
            } else {
                C12788a.m20424c(activity, new ConversationComposeNavigationKey(C19421p.m32935c0(activity), false, cartReceipt.getLoginName(), (String) null, (Long) null, (String) null, (String) null, false, (Bundle) null, 2, (DefaultConstructorMarker) null));
            }
        }
    }
}
