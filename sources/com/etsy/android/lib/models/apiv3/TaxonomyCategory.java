package com.etsy.android.lib.models.apiv3;

import android.text.TextUtils;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.EtsyArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.cardviewelement.PageDeepLink;
import com.etsy.android.lib.models.cardviewelement.SearchPageLink;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ISearchPageLink;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaxonomyCategory extends BaseFieldModel implements ITaxonomyCategory {
    private static final long serialVersionUID = -5323822783910965121L;
    public PageDeepLink mDeepLink;
    public EtsyArray mFilterValues;
    public List<ListingImage> mImages;
    public String mName;
    public SearchPageLink mPageLink;
    public String mPath = "";
    public EtsyId mTaxonomyId;
    public int mViewType = R.id.view_type_taxonomy_category;

    public TaxonomyNode buildTaxonomyNode() {
        String str;
        EtsyId etsyId = this.mTaxonomyId;
        if (etsyId != null) {
            str = etsyId.toString();
        } else {
            SearchPageLink searchPageLink = this.mPageLink;
            str = (searchPageLink == null || searchPageLink.getTaxonomyId() == null) ? null : this.mPageLink.getTaxonomyId().toString();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.mName;
        return new TaxonomyNode(str, str2, str2);
    }

    public String getDeepLink() {
        PageDeepLink pageDeepLink = this.mDeepLink;
        if (pageDeepLink == null) {
            return null;
        }
        return pageDeepLink.getUrl();
    }

    public List<ListingImage> getImages() {
        if (this.mImages != null) {
            return new ArrayList(this.mImages);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public ISearchPageLink getPageLink() {
        return this.mPageLink;
    }

    public String getPath() {
        return this.mPath;
    }

    public EtsyId getTaxonomyId() {
        return this.mTaxonomyId;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1980522643:
                if (str.equals(ResponseConstants.DEEP_LINK)) {
                    c = 0;
                    break;
                }
                break;
            case -1185250696:
                if (str.equals("images")) {
                    c = 1;
                    break;
                }
                break;
            case -479234103:
                if (str.equals(ResponseConstants.FILTER_VALUES)) {
                    c = 2;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 3;
                    break;
                }
                break;
            case 3433509:
                if (str.equals(ResponseConstants.PATH)) {
                    c = 4;
                    break;
                }
                break;
            case 280703177:
                if (str.equals(ResponseConstants.TAXONOMY_ID)) {
                    c = 5;
                    break;
                }
                break;
            case 883640234:
                if (str.equals(ResponseConstants.PAGE_LINK)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mDeepLink = (PageDeepLink) BaseModel.parseObject(jsonParser, PageDeepLink.class);
                break;
            case 1:
                this.mImages = BaseModel.parseArray(jsonParser, ListingImage.class);
                break;
            case 2:
                this.mFilterValues = (EtsyArray) BaseModel.parseObject(jsonParser, EtsyArray.class);
                break;
            case 3:
                this.mName = BaseModel.parseString(jsonParser);
                break;
            case 4:
                this.mPath = BaseModel.parseString(jsonParser);
                break;
            case 5:
                this.mTaxonomyId = new EtsyId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 6:
                this.mPageLink = (SearchPageLink) BaseModel.parseObject(jsonParser, SearchPageLink.class);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }
}
