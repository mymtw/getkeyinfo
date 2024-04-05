package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;

public interface PaymentButtonColor {

    public static final class DefaultImpls {
        public static ColorStateList retrieveColorResource(PaymentButtonColor paymentButtonColor, Context context) {
            C19383o.m32797g(paymentButtonColor, "this");
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            ColorStateList b = C8184a.m16459b(context, paymentButtonColor.getColorResId());
            C19383o.m32794d(b);
            return b;
        }
    }

    int getColorResId();

    boolean getHasOutline();

    PaymentButtonColorLuminance getLuminance();

    ColorStateList retrieveColorResource(Context context);
}
