package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class StarSellerAboutCard extends BaseFieldModel {
    public static final int $stable = 8;
    private String body = "";
    private String title = "";

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "parser", str, "fieldName", str, "title")) {
            this.title = BaseModel.Companion.parseString(jsonParser);
        } else if (!C19383o.m32792b(str, DetailsBottomSheetNavigationKey.PARAM_BODY)) {
            return false;
        } else {
            this.body = BaseModel.Companion.parseString(jsonParser);
        }
        return true;
    }
}
