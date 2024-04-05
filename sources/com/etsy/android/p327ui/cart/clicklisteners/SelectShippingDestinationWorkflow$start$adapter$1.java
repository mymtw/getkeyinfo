package com.etsy.android.p327ui.cart.clicklisteners;

import com.etsy.android.lib.models.Country;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.SelectShippingDestinationWorkflow$start$adapter$1 */
final class SelectShippingDestinationWorkflow$start$adapter$1 extends Lambda implements C19857l<Country, C19394m> {
    public final /* synthetic */ CollageBottomSheet $dialog;
    public final /* synthetic */ C19857l<Country, C19394m> $onCountrySelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectShippingDestinationWorkflow$start$adapter$1(CollageBottomSheet collageBottomSheet, C19857l<? super Country, C19394m> lVar) {
        super(1);
        this.$dialog = collageBottomSheet;
        this.$onCountrySelected = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Country country) {
        C19383o.m32797g(country, "it");
        this.$dialog.dismiss();
        this.$onCountrySelected.invoke(country);
    }
}
