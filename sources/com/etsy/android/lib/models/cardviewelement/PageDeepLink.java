package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class PageDeepLink extends PageLink {
    private static final long serialVersionUID = -4766021123222833136L;
    public String mUrl = "";

    public String getUrl() {
        return this.mUrl;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("url".equals(str)) {
            this.mUrl = BaseModel.parseStringURL(jsonParser);
        }
        return super.parseField(jsonParser, str);
    }
}
