package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import kotlin.jvm.internal.C19383o;

public final class ShopListingLevelReturnPolicies extends BaseModel {
    public static final int $stable = 8;
    private String description = "";
    private String title = "";

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public void parseData(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (C19383o.m32792b(currentName, "title")) {
                    this.title = BaseModel.Companion.parseString(jsonParser);
                } else if (C19383o.m32792b(currentName, "description")) {
                    this.description = BaseModel.Companion.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public final void setDescription(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.description = str;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
