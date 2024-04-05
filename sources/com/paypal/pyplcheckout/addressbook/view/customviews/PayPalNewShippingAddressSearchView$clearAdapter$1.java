package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.content.Context;
import android.text.Editable;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.adapters.ShippingAdapter;
import com.paypal.pyplcheckout.common.cache.Cache;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalNewShippingAddressSearchView$clearAdapter$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalNewShippingAddressSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView$clearAdapter$1(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView) {
        super(0);
        this.this$0 = payPalNewShippingAddressSearchView;
    }

    public final void invoke() {
        Editable text = ((TextInputEditText) this.this$0._$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
        if (text != null) {
            text.clear();
        }
        ((TextView) this.this$0._$_findCachedViewById(C17165R.C17167id.poweredByGoogleLabel)).setVisibility(8);
        ShippingAdapter access$getAdapter$p = this.this$0.adapter;
        if (access$getAdapter$p != null) {
            access$getAdapter$p.getAddressList().clear();
            ShippingAdapter access$getAdapter$p2 = this.this$0.adapter;
            if (access$getAdapter$p2 != null) {
                access$getAdapter$p2.notifyDataSetChanged();
                Cache cache = Cache.INSTANCE;
                Context context = this.this$0.getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                ((TextInputLayout) this.this$0._$_findCachedViewById(C17165R.C17167id.addressLayout)).setHint((CharSequence) cache.getHintTitle(context));
                Context context2 = this.this$0.getContext();
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                if (C19383o.m32792b(cache.getSearchScreenTitle(context2), this.this$0.getContext().getString(C17165R.string.paypal_checkout_country))) {
                    this.this$0.scrollToCountry();
                    return;
                }
                return;
            }
            C19383o.m32805o("adapter");
            throw null;
        }
        C19383o.m32805o("adapter");
        throw null;
    }
}
