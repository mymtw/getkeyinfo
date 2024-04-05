package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxonomyProperty extends BaseFieldModel {
    private static final long serialVersionUID = 5125940712774904546L;
    public EtsyId mAttributeId = new EtsyId();
    public String mDisplayName = "";
    public boolean mIsAbstract;
    public boolean mIsMultiValued;
    public boolean mIsRequired;
    public int mMaximumValuesAllowed = 5;
    public String mName = "";
    public List<NovaArticle> mNovaArticles = new ArrayList();
    public EtsyId mParent = new EtsyId();
    public List<TaxonomyAttributeValue> mPossibleValues = new ArrayList(0);
    public EtsyId mPropertyId = new EtsyId();
    public List<String> mPropertyValues = new ArrayList(0);
    public List<TaxonomyValueScale> mScales = new ArrayList(0);
    public List<TaxonomyAttributeValue> mSelectedValues = new ArrayList(0);
    public boolean mSupportsAttributes;
    public boolean mSupportsVariations;
    public TaxonomyUserInputValidator mUserInputValidator;
    public String mVersion = "";

    /* renamed from: com.etsy.android.lib.models.apiv3.TaxonomyProperty$a */
    public class C8716a implements Comparator<TaxonomyValueScale> {
        public final int compare(Object obj, Object obj2) {
            return ((TaxonomyValueScale) obj).getOrder() - ((TaxonomyValueScale) obj2).getOrder();
        }
    }

    public TaxonomyValueScale findScale(EtsyId etsyId) {
        if (!etsyId.hasId()) {
            return null;
        }
        for (TaxonomyValueScale next : this.mScales) {
            if (etsyId.equals(next.getId())) {
                return next;
            }
        }
        TaxonomyUserInputValidator taxonomyUserInputValidator = this.mUserInputValidator;
        for (TaxonomyValueScale next2 : taxonomyUserInputValidator != null ? taxonomyUserInputValidator.getScales() : Collections.emptyList()) {
            if (etsyId.equals(next2.getId())) {
                return next2;
            }
        }
        return null;
    }

    public EtsyId getAttributeId() {
        return this.mAttributeId;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getHelperText() {
        return (!hasHelperText() || this.mNovaArticles.get(0).getContent() == null) ? "" : this.mNovaArticles.get(0).getContent();
    }

    public int getMaxValuesAllowed() {
        return this.mMaximumValuesAllowed;
    }

    public String getName() {
        return this.mName;
    }

    public List<NovaArticle> getNovaArticles() {
        return this.mNovaArticles;
    }

    public EtsyId getParent() {
        return this.mParent;
    }

    public List<TaxonomyAttributeValue> getPossibleValues() {
        return this.mPossibleValues;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public List<String> getPropertyValues() {
        return this.mPropertyValues;
    }

    public List<TaxonomyValueScale> getScales() {
        return this.mScales;
    }

    public List<TaxonomyAttributeValue> getSelectedValues() {
        return this.mSelectedValues;
    }

    public TaxonomyUserInputValidator getUserInputValidator() {
        return this.mUserInputValidator;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public boolean hasHelperText() {
        return !this.mNovaArticles.isEmpty();
    }

    public boolean hasScales() {
        if (C15588c1.m25338o0(this.mScales)) {
            return true;
        }
        TaxonomyUserInputValidator taxonomyUserInputValidator = this.mUserInputValidator;
        if (taxonomyUserInputValidator == null) {
            return false;
        }
        return C15588c1.m25338o0(taxonomyUserInputValidator.getScales());
    }

    public boolean hasSuggestedValuesForScale(EtsyId etsyId) {
        List<TaxonomyAttributeValue> list;
        if (!etsyId.hasId() || (list = this.mPossibleValues) == null || list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TaxonomyAttributeValue taxonomyAttributeValue = list.get(i);
            if (taxonomyAttributeValue != null && taxonomyAttributeValue.getScale().equals(etsyId)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAbstract() {
        return this.mIsAbstract;
    }

    public boolean isMultiValued() {
        return this.mIsMultiValued;
    }

    public boolean isNumeric() {
        return !isMultiValued() && !isScale() && !isUnit() && !isStructured();
    }

    public boolean isRequired() {
        return this.mIsRequired;
    }

    public boolean isScale() {
        return C15588c1.m25338o0(this.mScales);
    }

    public boolean isStructured() {
        return !isMultiValued() && (getPossibleValues().isEmpty() ^ true) && !hasScales();
    }

    public boolean isUnit() {
        TaxonomyUserInputValidator taxonomyUserInputValidator = this.mUserInputValidator;
        return taxonomyUserInputValidator != null && C15588c1.m25338o0(taxonomyUserInputValidator.getScales());
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        super.parseData(jsonParser);
        if (C15588c1.m25338o0(this.mScales)) {
            Collections.sort(this.mScales, new C8716a());
        }
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.PROPERTY_VALUES.equals(str)) {
            this.mPropertyValues = BaseModel.parseStringArray(jsonParser);
            return true;
        } else if (ResponseConstants.ATTRIBUTE_ID.equals(str)) {
            this.mAttributeId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.PROPERTY_ID_CAMELCASE.equals(str)) {
            this.mPropertyId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.PARENT.equals(str)) {
            this.mParent.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("name".equals(str)) {
            this.mName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.DISPLAY_NAME_CAMELCASE.equals(str)) {
            this.mDisplayName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.VERSION.equals(str)) {
            this.mVersion = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.IS_REQUIRED.equals(str)) {
            this.mIsRequired = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.SUPPORTS_VARIATIONS.equals(str)) {
            this.mSupportsVariations = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.SUPPORTS_ATTRIBUTES.equals(str)) {
            this.mSupportsAttributes = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.IS_MULTIVALUED.equals(str)) {
            this.mIsMultiValued = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.IS_ABSTRACT.equals(str)) {
            this.mIsAbstract = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.POSSIBLE_VALUES.equals(str)) {
            this.mPossibleValues = BaseModel.parseArray(jsonParser, TaxonomyAttributeValue.class);
            return true;
        } else if (ResponseConstants.SELECTED_VALUES.equals(str)) {
            this.mSelectedValues = BaseModel.parseArray(jsonParser, TaxonomyAttributeValue.class);
            return true;
        } else if (ResponseConstants.SCALES.equals(str)) {
            this.mScales = BaseModel.parseArray(jsonParser, TaxonomyValueScale.class);
            return true;
        } else if (ResponseConstants.USER_INPUT_VALIDATOR.equals(str)) {
            this.mUserInputValidator = (TaxonomyUserInputValidator) BaseModel.parseObject(jsonParser, TaxonomyUserInputValidator.class);
            return true;
        } else if (ResponseConstants.MAXIMUM_VALUES_ALLOWED.equals(str)) {
            this.mMaximumValuesAllowed = jsonParser.getValueAsInt(-1);
            return true;
        } else if (!ResponseConstants.NOVA_ARTICLES.equals(str)) {
            return false;
        } else {
            this.mNovaArticles = BaseModel.parseArray(jsonParser, NovaArticle.class);
            return true;
        }
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setPossibleValues(List<TaxonomyAttributeValue> list) {
        this.mPossibleValues = list;
    }

    public void setPropertyId(EtsyId etsyId) {
        this.mPropertyId = etsyId;
    }

    public void setSupportsAttributes(boolean z) {
        this.mSupportsAttributes = z;
    }

    public boolean supportsAttributes() {
        return this.mSupportsAttributes;
    }

    public boolean supportsVariations() {
        return this.mSupportsVariations;
    }
}
