package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ListSectionActionResult extends BaseServerDrivenActionResult {
    public Page content = null;
    public ListSection mListSection = null;

    public Page getContent() {
        return this.content;
    }

    public ListSection getListSection() {
        return this.mListSection;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.LIST_SECTION.equals(str)) {
            ListSection listSection = (ListSection) BaseModel.parseObject(jsonParser, ListSection.class);
            this.mListSection = listSection;
            if (!listSection.isHorizontal()) {
                this.mListSection.setNested(true);
            }
        } else if (!ResponseConstants.CONTENT.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.content = (Page) BaseModel.parseObject(jsonParser, Page.class);
        }
        return true;
    }
}
