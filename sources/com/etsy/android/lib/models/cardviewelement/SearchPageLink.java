package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ISearchPageLink;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class SearchPageLink extends PageLink implements ISearchPageLink {
    public boolean mIsCategoryPage = false;
    public EtsyId mTaxonomyId = new EtsyId();

    public EtsyId getTaxonomyId() {
        return this.mTaxonomyId;
    }

    public boolean isCategoryPage() {
        return this.mIsCategoryPage;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.TAXONOMY_ID.equals(str)) {
            this.mTaxonomyId.setId(String.valueOf(jsonParser.getValueAsLong()));
        } else if (ResponseConstants.PAGE_TYPE.equals(str)) {
            this.mIsCategoryPage = ResponseConstants.CATEGORY_PAGE.equals(BaseModel.parseString(jsonParser));
        }
        return super.parseField(jsonParser, str);
    }
}
