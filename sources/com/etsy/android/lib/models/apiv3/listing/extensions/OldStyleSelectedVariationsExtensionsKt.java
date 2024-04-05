package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

public final class OldStyleSelectedVariationsExtensionsKt {
    public static final String toExpressCheckoutJsonString(List<Pair<Variation, VariationValue>> list) {
        JSONObject jSONObject = new JSONObject();
        if (list != null) {
            for (Pair pair : list) {
                VariationValue variationValue = (VariationValue) pair.component2();
                Long propertyId = ((Variation) pair.component1()).getPropertyId();
                long j = 0;
                String valueOf = String.valueOf(propertyId != null ? propertyId.longValue() : 0);
                Long valueId = variationValue.getValueId();
                if (valueId != null) {
                    j = valueId.longValue();
                }
                jSONObject.put(valueOf, j);
            }
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
