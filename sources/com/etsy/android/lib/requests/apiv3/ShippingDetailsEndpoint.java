package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.models.apiv3.ListingShippingDetails;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;

public interface ShippingDetailsEndpoint {

    public static final class DefaultImpls {
        public static /* synthetic */ C8071s getShippingDetails$default(ShippingDetailsEndpoint shippingDetailsEndpoint, long j, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return shippingDetailsEndpoint.getShippingDetails(j, str, str2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShippingDetails");
        }
    }

    @C20183f("/etsyapps/v3/bespoke/member/listings/{id}/shipping-details")
    C8071s<ListingShippingDetails> getShippingDetails(@C20196s("id") long j, @C20197t("country_id") String str, @C20197t("postal_code") String str2, @C20197t("update_preference") boolean z);
}
