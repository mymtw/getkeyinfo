package com.etsy.android.uikit.view.shop.policies;

import com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate;
import java.util.function.Predicate;

/* renamed from: com.etsy.android.uikit.view.shop.policies.b */
public final /* synthetic */ class C11962b implements Predicate {
    public final boolean test(Object obj) {
        return ((StructuredShopShippingEstimate) obj).isSet();
    }
}
