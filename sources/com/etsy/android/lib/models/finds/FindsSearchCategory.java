package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Listing;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class FindsSearchCategory extends BaseFieldModel {
    private static final String FIELD_LISTING = "listing";
    private static final String FIELD_TITLE = "title";
    private static final String FIELD_URL = "url";
    public Listing mListing;
    public String mTitle = "";
    public String mUrl = "";

    public Listing getListing() {
        return this.mListing;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int getViewType() {
        return R.id.view_type_finds_category;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if ("listing".equals(str)) {
            this.mListing = (Listing) BaseModel.parseObject(jsonParser, Listing.class);
            return true;
        } else if (!"url".equals(str)) {
            return false;
        } else {
            this.mUrl = BaseModel.parseStringURL(jsonParser);
            return true;
        }
    }
}
