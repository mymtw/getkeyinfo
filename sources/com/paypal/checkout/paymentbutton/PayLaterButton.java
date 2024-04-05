package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayLaterButton extends PayPalButton {
    public Map<Integer, View> _$_findViewCache;
    private PayPalButtonLabel label;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayLaterButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayLaterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayLaterButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PaymentButtonFundingType getFundingType$pyplcheckout_externalThreedsRelease() {
        return PaymentButtonFundingType.PAY_LATER;
    }

    public PayPalButtonLabel getLabel() {
        return this.label;
    }

    public int getWordmarkDarkLuminanceResId() {
        return C17165R.C17166drawable.logo_paypal_monochrome;
    }

    public int getWordmarkLightLuminanceResId() {
        return C17165R.C17166drawable.logo_paypal_color;
    }

    public void setLabel(PayPalButtonLabel payPalButtonLabel) {
        C19383o.m32797g(payPalButtonLabel, "value");
        if (payPalButtonLabel == PayPalButtonLabel.PAY_LATER) {
            this.label = payPalButtonLabel;
            updateLabel(payPalButtonLabel);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayLaterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        PayPalButtonLabel payPalButtonLabel = PayPalButtonLabel.PAY_LATER;
        this.label = payPalButtonLabel;
        updateLabel(payPalButtonLabel);
    }
}
