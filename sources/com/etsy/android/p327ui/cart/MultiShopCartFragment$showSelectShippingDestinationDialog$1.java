package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.vespa.PositionList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$showSelectShippingDestinationDialog$1 */
public final class MultiShopCartFragment$showSelectShippingDestinationDialog$1 extends Lambda implements C19857l<Country, C19394m> {
    public final /* synthetic */ ServerDrivenAction $action;
    public final /* synthetic */ PositionList $positionList;
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$showSelectShippingDestinationDialog$1(ServerDrivenAction serverDrivenAction, MultiShopCartFragment multiShopCartFragment, PositionList positionList) {
        super(1);
        this.$action = serverDrivenAction;
        this.this$0 = multiShopCartFragment;
        this.$positionList = positionList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Country country) {
        C19383o.m32797g(country, "country");
        this.$action.addParam(ResponseConstants.COUNTRY_ID, String.valueOf(country.getCountryId()));
        this.this$0.performAction(this.$positionList, this.$action);
    }
}
