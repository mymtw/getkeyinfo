package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.paymentbutton.PayPalButtonLabel;
import com.paypal.pyplcheckout.C17165R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class PayPalButton extends PaymentButton<PayPalButtonColor> {
    public Map<Integer, View> _$_findViewCache;
    private PayPalButtonColor color;
    private PayPalButtonLabel label;
    private final int wordmarkDarkLuminanceResId;
    private final int wordmarkLightLuminanceResId;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayPalButtonLabel.Position.values().length];
            iArr[PayPalButtonLabel.Position.START.ordinal()] = 1;
            iArr[PayPalButtonLabel.Position.END.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateColorFrom(TypedArray typedArray) {
        setColor(PayPalButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PayPalButton_paypal_color, PayPalButtonColor.GOLD.getValue())));
    }

    private final void updateLabelFrom(TypedArray typedArray) {
        setLabel(PayPalButtonLabel.Companion.invoke(typedArray.getInt(C17165R.styleable.PayPalButton_paypal_label, 0)));
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
        return PaymentButtonFundingType.PAYPAL;
    }

    public PayPalButtonLabel getLabel() {
        return this.label;
    }

    public int getWordmarkDarkLuminanceResId() {
        return this.wordmarkDarkLuminanceResId;
    }

    public int getWordmarkLightLuminanceResId() {
        return this.wordmarkLightLuminanceResId;
    }

    public void setLabel(PayPalButtonLabel payPalButtonLabel) {
        C19383o.m32797g(payPalButtonLabel, "value");
        if (payPalButtonLabel != PayPalButtonLabel.PAY_LATER) {
            this.label = payPalButtonLabel;
            updateLabel(payPalButtonLabel);
        }
    }

    public final void updateLabel(PayPalButtonLabel payPalButtonLabel) {
        C19383o.m32797g(payPalButtonLabel, "updatedLabel");
        PayPalButtonLabel.Position position = payPalButtonLabel.getPosition();
        int i = position == null ? -1 : WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            setSuffixTextVisibility(8);
            setPrefixTextVisibility(0);
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            setPrefixText(payPalButtonLabel.retrieveLabel(context));
        } else if (i != 2) {
            setPrefixTextVisibility(8);
            setSuffixTextVisibility(8);
        } else {
            setPrefixTextVisibility(8);
            setSuffixTextVisibility(0);
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            setSuffixText(payPalButtonLabel.retrieveLabel(context2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.color = PayPalButtonColor.GOLD;
        this.label = PayPalButtonLabel.PAYPAL;
        this.wordmarkDarkLuminanceResId = C17165R.C17166drawable.wordmark_paypal_monochrome;
        this.wordmarkLightLuminanceResId = C17165R.C17166drawable.wordmark_paypal_color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17165R.styleable.PayPalButton);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.PayPalButton)");
        updateColorFrom(obtainStyledAttributes);
        updateLabelFrom(obtainStyledAttributes);
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
    }

    public PayPalButtonColor getColor() {
        return this.color;
    }

    public void setColor(PayPalButtonColor payPalButtonColor) {
        C19383o.m32797g(payPalButtonColor, "value");
        this.color = payPalButtonColor;
        updateShapeDrawableFillColor(payPalButtonColor);
    }
}
