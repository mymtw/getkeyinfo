package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.ListingSelectQuantityBottomSheetKey;
import com.etsy.android.vespa.PositionList;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p356ge.C12790b;
import p423pf.C13236g;
import p753kq.C19857l;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder$bindQuantity$1 */
final class CartListingViewHolder$bindQuantity$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartGroupItem $item;
    public final /* synthetic */ CartListing $listing;
    public final /* synthetic */ CartListingViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartListingViewHolder$bindQuantity$1(CartGroupItem cartGroupItem, CartListingViewHolder cartListingViewHolder, CartListing cartListing) {
        super(1);
        this.$item = cartGroupItem;
        this.this$0 = cartListingViewHolder;
        this.$listing = cartListing;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ServerDrivenAction action = this.$item.getAction(ServerDrivenAction.TYPE_UPDATE_QUANTITY);
        View view2 = this.this$0.itemView;
        C19383o.m32796f(view2, "itemView");
        PositionList a = C13236g.C13237a.m20892a(view2);
        if (action != null) {
            C9283h hVar = this.this$0.f20703c;
            int purchaseQuantity = this.$listing.getPurchaseQuantity();
            int quantity = this.$listing.getQuantity();
            hVar.getClass();
            ListingSelectQuantityBottomSheetKey.C10695a aVar = new ListingSelectQuantityBottomSheetKey.C10695a();
            aVar.f23585a = C12790b.m20432d(hVar.mo45889a());
            aVar.f23586b = action;
            aVar.f23589e = a;
            C19919a aVar2 = aVar.f23587c;
            C19410j<Object>[] jVarArr = ListingSelectQuantityBottomSheetKey.C10695a.f23584f;
            aVar2.mo72822a(aVar, jVarArr[0], Integer.valueOf(purchaseQuantity));
            aVar.f23588d.mo72822a(aVar, jVarArr[1], Integer.valueOf(quantity));
            String str = aVar.f23585a;
            if (str != null) {
                ServerDrivenAction serverDrivenAction = aVar.f23586b;
                if (serverDrivenAction != null) {
                    C12790b.m20430b(hVar.mo45889a(), new ListingSelectQuantityBottomSheetKey(str, serverDrivenAction, aVar.f23589e, ((Number) aVar.f23587c.getValue(aVar, jVarArr[0])).intValue(), ((Number) aVar.f23588d.getValue(aVar, jVarArr[1])).intValue()));
                    C8703p pVar = hVar.f28980b;
                    if (pVar != null) {
                        pVar.mo21333d("cart_quantity_selector_tapped", (Map<? extends AnalyticsProperty, Object>) null);
                        return;
                    }
                    return;
                }
                C19383o.m32805o(ResponseConstants.ACTION);
                throw null;
            }
            C19383o.m32805o("referrer");
            throw null;
        }
    }
}
