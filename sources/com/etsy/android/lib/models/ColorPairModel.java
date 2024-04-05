package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

public final class ColorPairModel extends BaseFieldModel {
    public static final int $stable = 8;
    public String backgroundColorDark;
    public String backgroundColorDefault;

    public final String getBackgroundColorDark() {
        String str = this.backgroundColorDark;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("backgroundColorDark");
        throw null;
    }

    public final String getBackgroundColorDefault() {
        String str = this.backgroundColorDefault;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("backgroundColorDefault");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.DARK)) {
            String parseString = BaseModel.Companion.parseString(jsonParser);
            if (!C19457k.m33025c1(parseString, "#", false)) {
                parseString = '#' + parseString;
            }
            setBackgroundColorDark(parseString);
            return true;
        }
        String parseString2 = BaseModel.Companion.parseString(jsonParser);
        if (!C19457k.m33025c1(parseString2, "#", false)) {
            parseString2 = '#' + parseString2;
        }
        setBackgroundColorDefault(parseString2);
        return true;
    }

    public final void setBackgroundColorDark(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundColorDark = str;
    }

    public final void setBackgroundColorDefault(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.backgroundColorDefault = str;
    }
}
