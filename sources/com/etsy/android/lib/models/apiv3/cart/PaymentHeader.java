package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class PaymentHeader extends BaseFieldModel {
    public static final int $stable = 8;
    private String note;
    public String subtitle;
    public String title;

    public final String getNote() {
        return this.note;
    }

    public final String getSubtitle() {
        String str = this.subtitle;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("subtitle");
        throw null;
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("title");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -2060497896) {
            if (c != 3387378) {
                if (c == 110371416 && str.equals("title")) {
                    setTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
            } else if (str.equals(ResponseConstants.NOTE)) {
                this.note = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
        } else if (str.equals("subtitle")) {
            setSubtitle(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
        return false;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setSubtitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
