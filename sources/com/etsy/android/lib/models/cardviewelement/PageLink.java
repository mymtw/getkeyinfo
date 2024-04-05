package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public abstract class PageLink extends BaseModel implements IPageLink {
    private static final long serialVersionUID = 7501388225293459805L;
    public String mEventName = "homescreen_landing_page_generic";
    public String mLinkTitle = "";
    public String mPageTitle = "";

    public String getEventName() {
        return this.mEventName;
    }

    public String getLinkTitle() {
        return this.mLinkTitle;
    }

    public String getPageTitle() {
        return this.mPageTitle;
    }

    public int getViewType() {
        return R.id.view_type_section_link_footer;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL && parseField(jsonParser, currentName)) {
                jsonParser.skipChildren();
            }
        }
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.EVENT_NAME.equals(str)) {
            this.mEventName = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.LINK_TITLE.equals(str)) {
            this.mLinkTitle = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.PAGE_TITLE.equals(str)) {
            this.mPageTitle = BaseModel.parseString(jsonParser);
        }
        return jsonParser.getCurrentName().equals(str);
    }

    public void setEventName(String str) {
        this.mEventName = str;
    }

    public void setPageTitle(String str) {
        this.mPageTitle = str;
    }
}
