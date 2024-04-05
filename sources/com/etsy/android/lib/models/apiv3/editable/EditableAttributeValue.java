package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.TaxonomyAttributeValue;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class EditableAttributeValue extends BaseFieldModel {
    public static final String MAPPED = "mapped";
    public static final String PRESELECTED = "preselected";
    public static final String STORED = "stored";
    public static final String SUGGESTED = "suggested";
    private static final long serialVersionUID = -826198657678822107L;
    public int mEditType;
    public int mId;
    public EtsyId mListingId;
    public EtsyId mOttValueId;
    public EtsyId mPropertyId;
    public String mType;
    public String mValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public EditableAttributeValue() {
        this.mListingId = new EtsyId();
        this.mOttValueId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mValue = "";
        this.mType = STORED;
        this.mEditType = 1;
    }

    public static String parseType(String str) {
        if (str == null) {
            return STORED;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1295494594:
                if (str.equals(PRESELECTED)) {
                    c = 1;
                    break;
                }
                break;
            case -1081360845:
                if (str.equals(MAPPED)) {
                    c = 0;
                    break;
                }
                break;
            case -892066909:
                if (str.equals(STORED)) {
                    c = 3;
                    break;
                }
                break;
            case 315730723:
                if (str.equals(SUGGESTED)) {
                    c = 2;
                    break;
                }
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? STORED : SUGGESTED : PRESELECTED : MAPPED;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableAttributeValue editableAttributeValue = (EditableAttributeValue) obj;
        return new EqualsBuilder().append(this.mId, editableAttributeValue.mId).append(this.mEditType, editableAttributeValue.mEditType).append((Object) this.mListingId, (Object) editableAttributeValue.mListingId).append((Object) this.mOttValueId, (Object) editableAttributeValue.mOttValueId).append((Object) this.mPropertyId, (Object) editableAttributeValue.mPropertyId).append((Object) this.mValue, (Object) editableAttributeValue.mValue).append((Object) this.mType, (Object) editableAttributeValue.mType).isEquals();
    }

    public int getEditType() {
        return this.mEditType;
    }

    public int getId() {
        return this.mId;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public EtsyId getOttValueId() {
        return this.mOttValueId;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public String getType() {
        return this.mType;
    }

    public String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append((Object) this.mListingId).append((Object) this.mOttValueId).append((Object) this.mPropertyId).append((Object) this.mValue).append((Object) this.mType).append(this.mId).append(this.mEditType).toHashCode();
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.OTT_VALUE_ID.equals(str)) {
            this.mOttValueId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("value".equals(str)) {
            this.mValue = BaseModel.parseString(jsonParser);
            return true;
        } else if (!"type".equals(str)) {
            return true;
        } else {
            this.mType = parseType(BaseModel.parseString(jsonParser));
            return true;
        }
    }

    public void setEditType(int i) {
        this.mEditType = i;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setListingId(EtsyId etsyId) {
        this.mListingId = etsyId;
    }

    public void setPropertyId(EtsyId etsyId) {
        this.mPropertyId = etsyId;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public EditableAttributeValue(String str, EtsyId etsyId) {
        this.mListingId = new EtsyId();
        this.mOttValueId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mType = STORED;
        this.mEditType = 1;
        this.mValue = str;
        this.mOttValueId = etsyId;
    }

    public EditableAttributeValue(TaxonomyAttributeValue taxonomyAttributeValue, String str, int i) {
        this.mListingId = new EtsyId();
        this.mOttValueId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mValue = "";
        this.mType = STORED;
        this.mEditType = 1;
        this.mValue = taxonomyAttributeValue.getName();
        this.mOttValueId = new EtsyId(taxonomyAttributeValue.getId().getId());
        this.mType = str;
        this.mEditType = i;
    }
}
