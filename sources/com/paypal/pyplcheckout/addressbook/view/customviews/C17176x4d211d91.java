package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.cache.Cache;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView$initViews$$inlined$doOnTextChanged$1 */
public final class C17176x4d211d91 implements TextWatcher {
    public final /* synthetic */ PayPalNewShippingAddressSearchView this$0;

    public C17176x4d211d91(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView) {
        this.this$0 = payPalNewShippingAddressSearchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            Cache cache = Cache.INSTANCE;
            Context context = this.this$0.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            if (C19383o.m32792b(cache.getSearchScreenTitle(context), this.this$0.getContext().getString(C17165R.string.paypal_checkout_country))) {
                this.this$0.initializeCountryAdapter();
            } else {
                this.this$0.clearAdapter();
            }
        } else if (charSequence != null) {
            this.this$0.selectData(charSequence);
        }
    }
}
