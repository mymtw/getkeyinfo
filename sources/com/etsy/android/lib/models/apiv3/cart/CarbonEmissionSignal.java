package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class CarbonEmissionSignal extends BaseFieldModel {
    public static final int $stable = 8;
    public String signalText;

    public final String getSignalText() {
        String str = this.signalText;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("signalText");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (!C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "text")) {
            return false;
        }
        setSignalText(BaseModel.Companion.parseString(jsonParser));
        return true;
    }

    public final void setSignalText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.signalText = str;
    }
}
