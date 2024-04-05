package com.paypal.checkout.order.patch;

import com.etsy.android.lib.models.apiv3.vespa.BaseServerDrivenActionResult;

public enum PatchOperation {
    ADD("add"),
    REPLACE(BaseServerDrivenActionResult.TYPE_REPLACE),
    REMOVE("remove");
    
    private final String stringValue;

    private PatchOperation(String str) {
        this.stringValue = str;
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
