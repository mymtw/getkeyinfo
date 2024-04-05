package com.etsy.android.lib.models.pastpurchase.extensions;

import com.etsy.android.lib.models.pastpurchase.PastPurchaseListing;
import com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState;
import kotlin.jvm.internal.C19383o;

public final class PastPurchasesReceiptListingStateExtensionsKt {
    public static final boolean isActive(PastPurchaseListing pastPurchaseListing) {
        C19383o.m32797g(pastPurchaseListing, "<this>");
        PastPurchasesReceiptListingState state = pastPurchaseListing.getState();
        if (state != null) {
            return state.equals(PastPurchasesReceiptListingState.ACTIVE);
        }
        return false;
    }
}
