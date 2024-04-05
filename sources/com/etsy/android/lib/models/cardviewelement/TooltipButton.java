package com.etsy.android.lib.models.cardviewelement;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.etsy.android.lib.models.apiv3.cart.PaymentMethod;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19388s;

public final class TooltipButton extends BaseFieldModel {
    public static final int $stable = 8;
    private String iconName = "";
    private InfoModal infoModal;
    private String title = "";

    public final String getIconName() {
        return this.iconName;
    }

    public final InfoModal getInfoModal() {
        return this.infoModal;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "parser", str, "fieldName")) {
            case -480049188:
                if (!str.equals(PaymentMethod.INFO_MODAL)) {
                    return false;
                }
                this.infoModal = (InfoModal) BaseModel.Companion.parseObject(jsonParser, InfoModal.class);
                return true;
            case 3226745:
                if (!str.equals(ResponseConstants.ICON)) {
                    return false;
                }
                this.iconName = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 1273617316:
                if (!str.equals(ResponseConstants.ANALYTICS_NAME)) {
                    return false;
                }
                C19388s.m32896y0(this, BaseModel.Companion.parseString(jsonParser));
                return true;
            case 1615086568:
                if (!str.equals(ResponseConstants.DISPLAY_NAME)) {
                    return false;
                }
                this.title = BaseModel.Companion.parseString(jsonParser);
                return true;
            default:
                return false;
        }
    }
}
