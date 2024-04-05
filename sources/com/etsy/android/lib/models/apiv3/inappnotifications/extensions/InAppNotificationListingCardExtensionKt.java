package com.etsy.android.lib.models.apiv3.inappnotifications.extensions;

import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import kotlin.jvm.internal.C19383o;

public final class InAppNotificationListingCardExtensionKt {
    public static final boolean unavailableListing(IANListingCard iANListingCard) {
        C19383o.m32797g(iANListingCard, "<this>");
        Integer listingState = iANListingCard.getListingState();
        return ((listingState != null ? listingState.intValue() : 0) > 0) || iANListingCard.isVacation();
    }
}
