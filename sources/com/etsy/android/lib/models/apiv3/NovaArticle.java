package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class NovaArticle extends BaseFieldModel {
    private static final long serialVersionUID = -8484771070600193510L;
    public String mContent = "";

    public String getContent() {
        return this.mContent;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (!ResponseConstants.CONTENT.equals(str)) {
            return false;
        }
        this.mContent = BaseModel.parseString(jsonParser);
        return true;
    }
}
