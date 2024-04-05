package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class StarSeller extends BaseFieldModel {
    public static final int $stable = 8;
    private StarSellerAboutCard aboutCard;
    private StarSellerBadge badge;

    public final StarSellerAboutCard getAboutCard() {
        return this.aboutCard;
    }

    public final StarSellerBadge getBadge() {
        return this.badge;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "parser", str, "fieldName", str, "shop_header")) {
            this.badge = (StarSellerBadge) BaseModel.Companion.parseObject(jsonParser, StarSellerBadge.class);
        } else if (!C19383o.m32792b(str, "about_module")) {
            return false;
        } else {
            this.aboutCard = (StarSellerAboutCard) BaseModel.Companion.parseObject(jsonParser, StarSellerAboutCard.class);
        }
        return true;
    }
}
