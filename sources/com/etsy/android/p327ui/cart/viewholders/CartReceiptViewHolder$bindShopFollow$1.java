package com.etsy.android.p327ui.cart.viewholders;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.widget.Button;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.p327ui.cart.clicklisteners.C9284i;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import com.etsy.android.p327ui.util.C11782j;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartReceiptViewHolder$bindShopFollow$1 */
public final class CartReceiptViewHolder$bindShopFollow$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartReceipt $cartReceipt;
    public final /* synthetic */ CartReceiptViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartReceiptViewHolder$bindShopFollow$1(CartReceipt cartReceipt, CartReceiptViewHolder cartReceiptViewHolder) {
        super(1);
        this.$cartReceipt = cartReceipt;
        this.this$0 = cartReceiptViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CartReceipt cartReceipt = this.$cartReceipt;
        cartReceipt.setFavorite(!cartReceipt.getIsFavorite());
        C9285j jVar = this.this$0.f20728c;
        if (jVar != null) {
            C19383o.m32794d(view);
            CartReceipt cartReceipt2 = this.$cartReceipt;
            boolean isFavorite = cartReceipt2.getIsFavorite();
            if (view instanceof Button) {
                ((CollageButton) view).setIconResource(isFavorite ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
                C0391c.m1056b(jVar.f20501e, C0072d.m199f(jVar.f20501e, jVar.f20502f.mo38047a(new C11782j(cartReceipt2.getShopUserId(), cartReceipt2.getShopName(), isFavorite), jVar.f28980b))).mo20655a(new C9284i());
            }
        }
    }
}
