package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;

public final class StaticFilters extends BaseFieldModel {
    public static final int $stable = 8;
    private List<StaticFilterAttribute> attributes = EmptyList.INSTANCE;

    public final List<StaticFilterAttribute> getAttributes() {
        return this.attributes;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (!C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.ATTRIBUTES)) {
            return false;
        }
        this.attributes = BaseModel.Companion.parseArray(jsonParser, StaticFilterAttribute.class);
        return true;
    }

    public final void setAttributes(List<StaticFilterAttribute> list) {
        this.attributes = list;
    }
}
