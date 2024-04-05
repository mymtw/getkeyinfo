package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class MessageModel extends BaseFieldModel {
    public static final int $stable = 8;
    private String message = "";
    private List<String> styles = new ArrayList();

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getStyles() {
        return this.styles;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "text")) {
            this.message = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.STYLES)) {
            return false;
        } else {
            this.styles = BaseModel.Companion.parseStringArray(jsonParser);
            return true;
        }
    }

    public final void setMessage(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.message = str;
    }

    public final void setStyles(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.styles = list;
    }
}
