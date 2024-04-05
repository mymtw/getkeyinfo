package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalCreditButton extends PaymentButton<PayPalCreditButtonColor> {
    public Map<Integer, View> _$_findViewCache;
    private PayPalCreditButtonColor color;
    private final int wordmarkDarkLuminanceResId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCreditButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCreditButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalCreditButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateColorFrom(TypedArray typedArray) {
        setColor(PayPalCreditButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PayPalCreditButton_paypal_credit_color, PayPalCreditButtonColor.DARK_BLUE.getValue())));
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
        return PaymentButtonFundingType.PAYPAL_CREDIT;
    }

    public int getWordmarkDarkLuminanceResId() {
        return this.wordmarkDarkLuminanceResId;
    }

    public int getWordmarkLightLuminanceResId() {
        throw new UnsupportedOperationException("PayPalCreditButton does not have a light luminance compatible wordmark.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCreditButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.color = PayPalCreditButtonColor.DARK_BLUE;
        this.wordmarkDarkLuminanceResId = C17165R.C17166drawable.wordmark_paypal_credit_monochrome;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17165R.styleable.PayPalCreditButton);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…eable.PayPalCreditButton)");
        updateColorFrom(obtainStyledAttributes);
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
    }

    public PayPalCreditButtonColor getColor() {
        return this.color;
    }

    public void setColor(PayPalCreditButtonColor payPalCreditButtonColor) {
        C19383o.m32797g(payPalCreditButtonColor, "value");
        this.color = payPalCreditButtonColor;
        updateShapeDrawableFillColor(payPalCreditButtonColor);
    }
}
