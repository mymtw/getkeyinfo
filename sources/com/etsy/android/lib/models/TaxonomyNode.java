package com.etsy.android.lib.models;

import com.etsy.android.R;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.editable.EditableListing;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.lang3.StringUtils;
import p628nj.C18263b;

public class TaxonomyNode extends BaseModel implements CategoryOrTaxonomyNode {
    public List<TaxonomyNode> mChildren;
    public boolean mIsSuppliesTopLevel;
    public String mLongName;
    public String mName;
    public TaxonomyNode mParent;
    public String mParentPath;
    public String mPath;
    public EtsyId mTaxonomyNodeId;

    public TaxonomyNode() {
        this.mTaxonomyNodeId = new EtsyId();
        this.mName = "";
        this.mLongName = "";
        this.mPath = "";
        this.mParentPath = "";
    }

    @Deprecated
    public static String pathFromWebUrlToAPIFormat(String str) {
        return str.replace(HelpFormatter.DEFAULT_OPT_PREFIX, "_");
    }

    public Category asCategory() {
        return null;
    }

    public TaxonomyNode asTaxononmyNode() {
        return this;
    }

    public List<TaxonomyNode> getChildren() {
        return this.mChildren;
    }

    public String getName() {
        return this.mName;
    }

    public String getPath() {
        return this.mPath;
    }

    public EtsyId getTaxonomyNodeId() {
        return this.mTaxonomyNodeId;
    }

    public int getViewType() {
        return R.id.view_type_category_card;
    }

    public boolean hasChildren() {
        return !this.mChildren.isEmpty();
    }

    public boolean isSupplies() {
        for (TaxonomyNode taxonomyNode = this; taxonomyNode != null; taxonomyNode = taxonomyNode.mParent) {
            if (taxonomyNode.mIsSuppliesTopLevel) {
                return true;
            }
        }
        return false;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("id".equals(currentName)) {
                    this.mTaxonomyNodeId.setId(String.valueOf(jsonParser.getValueAsLong()));
                } else if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.PATH.equals(currentName)) {
                    this.mPath = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.CHILDREN.equals(currentName)) {
                    this.mChildren = BaseModel.parseArray(jsonParser, TaxonomyNode.class);
                } else if (ResponseConstants.PARENT.equals(currentName)) {
                    this.mParentPath = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.IS_SUPPLIES_TOP_LEVEL.equals(currentName)) {
                    this.mIsSuppliesTopLevel = jsonParser.getValueAsBoolean();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TAXONOMY_NODE_ID, this.mTaxonomyNodeId.getId());
        return hashMap;
    }

    public TaxonomyNode(long j, List<String> list) {
        this(j, StringUtils.join((Iterable<?>) list, EditableListing.CATEGORY_PATH_JOIN_STRING));
    }

    public TaxonomyNode(long j, String str) {
        this(String.valueOf(j), str);
    }

    public TaxonomyNode(String str, List<String> list) {
        this(str, StringUtils.join((Iterable<?>) list, EditableListing.CATEGORY_PATH_JOIN_STRING));
    }

    public TaxonomyNode(String str, List<String> list, List<Integer> list2) {
        this(str, list);
        List<String> list3 = C8591a.f18700r;
        this.mIsSuppliesTopLevel = list2.get(0).intValue() == C18263b.f40056T.f18706f.mo21134d(C8592b.f18783d0);
    }

    public TaxonomyNode(String str, String str2) {
        EtsyId etsyId = new EtsyId();
        this.mTaxonomyNodeId = etsyId;
        this.mName = "";
        this.mLongName = "";
        this.mPath = "";
        this.mParentPath = "";
        etsyId.setId(str);
        this.mLongName = str2;
    }

    public TaxonomyNode(String str, String str2, boolean z) {
        EtsyId etsyId = new EtsyId();
        this.mTaxonomyNodeId = etsyId;
        this.mName = "";
        this.mLongName = "";
        this.mPath = "";
        this.mParentPath = "";
        etsyId.setId(str);
        this.mLongName = str2;
        this.mIsSuppliesTopLevel = z;
    }

    public TaxonomyNode(String str, String str2, String str3) {
        EtsyId etsyId = new EtsyId();
        this.mTaxonomyNodeId = etsyId;
        this.mName = "";
        this.mLongName = "";
        this.mPath = "";
        this.mParentPath = "";
        etsyId.setId(str);
        this.mLongName = str3;
        this.mName = str2;
    }
}
