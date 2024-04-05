package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;

public final class RangeFacet extends BaseFieldModel {
    public static final int $stable = 8;
    private String count;
    private String max;
    private String min;
    private AttributeValue scale;

    public final String getCount() {
        return this.count;
    }

    public final String getMax() {
        return this.max;
    }

    public final String getMin() {
        return this.min;
    }

    public final AttributeValue getScale() {
        return this.scale;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case 107876:
                if (str.equals(ResponseConstants.MAX)) {
                    this.max = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 108114:
                if (str.equals(ResponseConstants.MIN)) {
                    this.min = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 94851343:
                if (str.equals(ResponseConstants.COUNT)) {
                    this.count = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 109250890:
                if (str.equals(ResponseConstants.SCALE)) {
                    this.scale = (AttributeValue) BaseModel.Companion.parseObject(jsonParser, AttributeValue.class);
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setCount(String str) {
        this.count = str;
    }

    public final void setMax(String str) {
        this.max = str;
    }

    public final void setMin(String str) {
        this.min = str;
    }

    public final void setScale(AttributeValue attributeValue) {
        this.scale = attributeValue;
    }
}
