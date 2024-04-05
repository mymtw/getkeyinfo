package com.etsy.android.p327ui.cart.googlepay;

import com.etsy.android.p327ui.cart.googlepay.models.GooglePayBillingAddressParameters;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayPaymentMethods;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayPaymentParameters;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayTokenizationParameters;
import com.etsy.android.p327ui.cart.googlepay.models.GooglePayTokenizationSpecification;
import com.etsy.android.util.C12051k;
import java.util.ArrayList;
import java.util.List;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.cart.googlepay.c */
public final class C9305c {

    /* renamed from: a */
    public static final List<String> f20534a = C17782b.m29865e0("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");

    /* renamed from: a */
    public static GooglePayPaymentMethods m17699a(boolean z, boolean z2) {
        GooglePayTokenizationSpecification googlePayTokenizationSpecification = z ? new GooglePayTokenizationSpecification("DIRECT", new GooglePayTokenizationParameters("ECv1", C12051k.f26872f)) : null;
        ArrayList f0 = C17782b.m29866f0("CRYPTOGRAM_3DS");
        if (z2) {
            f0.add("PAN_ONLY");
        }
        return new GooglePayPaymentMethods("CARD", new GooglePayPaymentParameters(f0, f20534a, true, new GooglePayBillingAddressParameters("FULL")), googlePayTokenizationSpecification);
    }
}
