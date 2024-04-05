package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class InfoModal extends BaseFieldModel {
    public static final int $stable = 8;
    private String body;
    private String title;

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.INFO_MODAL_HEADER)) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.INFO_MODAL_BODY)) {
            return false;
        } else {
            this.body = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
