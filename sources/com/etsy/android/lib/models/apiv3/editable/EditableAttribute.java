package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.TaxonomyProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class EditableAttribute extends BaseFieldModel {
    public static final int EDIT_TYPE_EDIT = 2;
    public static final int EDIT_TYPE_ORIGINAL = 1;
    public static final int EDIT_TYPE_REQUIRED = 3;
    private static final long serialVersionUID = -5260931091253884602L;
    public int mEditType;
    public int mId;
    public EtsyId mListingId;
    public EtsyId mOttValueQualifier;
    public EtsyId mPropertyId;
    public String mPropertyName;
    public List<EditableAttributeValue> mValues;

    public EditableAttribute() {
        this.mListingId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mPropertyName = "";
        this.mValues = new ArrayList(0);
        this.mOttValueQualifier = new EtsyId();
        this.mEditType = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableAttribute editableAttribute = (EditableAttribute) obj;
        return new EqualsBuilder().append(this.mId, editableAttribute.mId).append(this.mEditType, editableAttribute.mEditType).append((Object) this.mListingId, (Object) editableAttribute.mListingId).append((Object) this.mPropertyId, (Object) editableAttribute.mPropertyId).append((Object) this.mPropertyName, (Object) editableAttribute.mPropertyName).append((Object) this.mValues, (Object) editableAttribute.mValues).append((Object) this.mOttValueQualifier, (Object) editableAttribute.mOttValueQualifier).isEquals();
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

    public EtsyId getOttValueQualifier() {
        return this.mOttValueQualifier;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }

    public List<EditableAttributeValue> getValues() {
        return this.mValues;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append((Object) this.mListingId).append((Object) this.mPropertyId).append((Object) this.mPropertyName).append(this.mId).append((Object) this.mValues).append((Object) this.mOttValueQualifier).append(this.mEditType).toHashCode();
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.OTT_VALUE_QUALIFIER.equals(str)) {
            this.mOttValueQualifier.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("property_id".equals(str)) {
            this.mPropertyId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.VALUES.equals(str)) {
            this.mValues = BaseModel.parseArray(jsonParser, EditableAttributeValue.class);
            return true;
        } else if (!ResponseConstants.PROPERTY_NAME.equals(str)) {
            return false;
        } else {
            this.mPropertyName = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setEditType(int i) {
        this.mEditType = i;
        int size = this.mValues.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mValues.get(i2).setEditType(i);
        }
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setIds(int i, String str) {
        setId(i);
        getListingId().setId(str);
        int size = this.mValues.size();
        for (int i2 = 0; i2 < size; i2++) {
            EditableAttributeValue editableAttributeValue = this.mValues.get(i2);
            editableAttributeValue.getListingId().setId(str);
            editableAttributeValue.getPropertyId().setId(getPropertyId().getId());
            editableAttributeValue.setId(i2);
        }
    }

    public void setOttValueQualifier(EtsyId etsyId) {
        if (etsyId != null) {
            this.mOttValueQualifier = new EtsyId(etsyId.getId());
        } else {
            this.mOttValueQualifier = new EtsyId();
        }
    }

    public void setPropertyName(String str) {
        this.mPropertyName = str;
    }

    public void setValues(List<EditableAttributeValue> list) {
        this.mValues = list;
    }

    public EditableAttribute(EtsyId etsyId, String str, EtsyId etsyId2) {
        this.mListingId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mPropertyName = "";
        this.mValues = new ArrayList(0);
        new EtsyId();
        this.mEditType = 1;
        this.mPropertyId = etsyId;
        this.mPropertyName = str;
        this.mOttValueQualifier = etsyId2;
    }

    public EditableAttribute(TaxonomyProperty taxonomyProperty, EtsyId etsyId, int i) {
        this.mListingId = new EtsyId();
        this.mPropertyId = new EtsyId();
        this.mPropertyName = "";
        this.mValues = new ArrayList(0);
        this.mOttValueQualifier = new EtsyId();
        this.mEditType = 1;
        this.mPropertyId = new EtsyId(taxonomyProperty.getPropertyId().getId());
        this.mPropertyName = taxonomyProperty.getName();
        this.mOttValueQualifier = new EtsyId(etsyId.getId());
        this.mEditType = i;
    }
}
