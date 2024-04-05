package com.etsy.android.lib.models.apiv3.search;

import android.net.Uri;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class QueryCorrection extends BaseFieldModel {
    public static final int $stable = 8;
    public String htmlMessage;
    private String replacementQuery;
    private String url;

    public final String getHtmlMessage() {
        String str = this.htmlMessage;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("htmlMessage");
        throw null;
    }

    public final String getReplacementQuery() {
        return this.replacementQuery;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "url")) {
            String parseString = BaseModel.Companion.parseString(jsonParser);
            this.url = parseString;
            if (parseString == null) {
                return true;
            }
            this.replacementQuery = Uri.parse(parseString).getQueryParameter("spelling_correction_show_original");
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.HTML_MESSAGE)) {
            return false;
        } else {
            setHtmlMessage(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
    }

    public final void setHtmlMessage(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.htmlMessage = str;
    }

    public final void setReplacementQuery(String str) {
        this.replacementQuery = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
