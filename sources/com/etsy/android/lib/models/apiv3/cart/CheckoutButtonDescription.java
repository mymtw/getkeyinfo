package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class CheckoutButtonDescription extends BaseFieldModel {
    public static final int $stable = 8;
    private InfoModal infoModal;
    private String text;

    public final InfoModal getInfoModal() {
        return this.infoModal;
    }

    public final String getText() {
        return this.text;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "parser", str, "fieldName", str, "text")) {
            this.text = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, PaymentMethod.INFO_MODAL)) {
            return false;
        } else {
            this.infoModal = (InfoModal) BaseModel.Companion.parseObject(jsonParser, InfoModal.class);
            return true;
        }
    }

    public final void setInfoModal(InfoModal infoModal2) {
        this.infoModal = infoModal2;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
