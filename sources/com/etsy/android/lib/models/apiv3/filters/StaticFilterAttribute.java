package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;

public final class StaticFilterAttribute extends BaseFieldModel {
    public static final int $stable = 8;

    /* renamed from: id */
    private String f19142id;
    private String name;
    private List<AttributeValue> values = EmptyList.INSTANCE;

    public final String getId() {
        return this.f19142id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<AttributeValue> getValues() {
        return this.values;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -823812830) {
            if (c != 3355) {
                if (c == 3373707 && str.equals("name")) {
                    this.name = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
            } else if (str.equals("id")) {
                this.f19142id = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
        } else if (str.equals(ResponseConstants.VALUES)) {
            this.values = BaseModel.Companion.parseArray(jsonParser, AttributeValue.class);
            return true;
        }
        return false;
    }

    public final void setId(String str) {
        this.f19142id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValues(List<AttributeValue> list) {
        this.values = list;
    }
}
