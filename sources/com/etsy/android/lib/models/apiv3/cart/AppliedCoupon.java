package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class AppliedCoupon extends BaseFieldModel {
    public static final int $stable = 8;
    private String error = "";
    private String label = "";

    public final String getError() {
        return this.error;
    }

    public final String getLabel() {
        return this.label;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "parser", str, "fieldName", str, ResponseConstants.LABEL)) {
            this.label = BaseModel.Companion.parseString(jsonParser);
        } else if (!C19383o.m32792b(str, "error")) {
            return false;
        } else {
            this.error = BaseModel.Companion.parseString(jsonParser);
        }
        return true;
    }
}
