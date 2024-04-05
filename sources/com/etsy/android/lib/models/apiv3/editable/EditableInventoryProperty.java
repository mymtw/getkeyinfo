package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.variations.Variation;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;

public class EditableInventoryProperty extends BaseFieldModel implements IEditableInventoryObject {
    private static final long serialVersionUID = 5332420383697966256L;
    public boolean mControlsPrice;
    public boolean mControlsQuantity;
    public boolean mControlsSku;
    public int mId;
    public List<EditableInventoryValue> mInventoryValues = new ArrayList(0);
    public boolean mIsCustomProperty;
    public EtsyId mListingId = new EtsyId();
    public EtsyId mOttValueQualifier = new EtsyId();
    public String mOttValueQualifierDisplayFormat = "";
    public String mOttValueQualifierDisplayName = "";
    public int mParentId;
    public EtsyId mPropertyId = new EtsyId();
    public String mPropertyName;

    public EditableInventoryProperty() {
    }

    private boolean hasEqualIdsControlsAndName(EditableInventoryProperty editableInventoryProperty) {
        int i = this.mId;
        int i2 = editableInventoryProperty.mId;
        if (i != i2 && Math.abs(i - i2) != Math.abs(100000)) {
            return false;
        }
        int i3 = this.mParentId;
        int i4 = editableInventoryProperty.mParentId;
        if ((i3 != i4 && Math.abs(i3 - i4) != Math.abs(100000)) || this.mControlsPrice != editableInventoryProperty.mControlsPrice || this.mControlsQuantity != editableInventoryProperty.mControlsQuantity || this.mControlsSku != editableInventoryProperty.mControlsSku || !this.mPropertyId.equals(editableInventoryProperty.mPropertyId) || !this.mPropertyName.equals(editableInventoryProperty.mPropertyName)) {
            return false;
        }
        EtsyId etsyId = this.mOttValueQualifier;
        EtsyId etsyId2 = editableInventoryProperty.mOttValueQualifier;
        return etsyId != null ? etsyId.equals(etsyId2) : etsyId2 == null;
    }

    public boolean controlsPrice() {
        return this.mControlsPrice;
    }

    public boolean controlsPriceOrHasDescendantControllingPrice() {
        return controlsPrice() || (!this.mInventoryValues.isEmpty() && this.mInventoryValues.get(0).hasPropertiesControllingPrice());
    }

    public boolean controlsQuantity() {
        return this.mControlsQuantity;
    }

    public boolean controlsQuantityOrHasDescendantControllingQuantity() {
        return controlsQuantity() || (!this.mInventoryValues.isEmpty() && this.mInventoryValues.get(0).hasPropertiesControllingQuantity());
    }

    public boolean controlsSku() {
        return this.mControlsSku;
    }

    public boolean controlsSkuOrHasDescendantControllingSku() {
        return controlsSku() || (!this.mInventoryValues.isEmpty() && this.mInventoryValues.get(0).hasPropertiesControllingSku());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableInventoryProperty editableInventoryProperty = (EditableInventoryProperty) obj;
        return hasEqualIdsControlsAndName(editableInventoryProperty) && this.mInventoryValues.equals(editableInventoryProperty.mInventoryValues);
    }

    public boolean equalsIgnoringPQS(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableInventoryProperty editableInventoryProperty = (EditableInventoryProperty) obj;
        if (!hasEqualIdsControlsAndName(editableInventoryProperty) || this.mInventoryValues.size() != editableInventoryProperty.mInventoryValues.size()) {
            return false;
        }
        int size = this.mInventoryValues.size();
        for (int i = 0; i < size; i++) {
            if (!this.mInventoryValues.get(i).equalsIgnoringPQS(editableInventoryProperty.mInventoryValues.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int getId() {
        return this.mId;
    }

    public List<EditableInventoryValue> getInventoryValues() {
        return this.mInventoryValues;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public EtsyId getOttValueQualifier() {
        return this.mOttValueQualifier;
    }

    public String getOttValueQualifierDisplayFormat() {
        return this.mOttValueQualifierDisplayFormat;
    }

    public String getOttValueQualifierDisplayName() {
        return this.mOttValueQualifierDisplayName;
    }

    public int getParentId() {
        return this.mParentId;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.mPropertyName, (this.mPropertyId.hashCode() + (this.mInventoryValues.hashCode() * 31)) * 31, 31);
        EtsyId etsyId = this.mOttValueQualifier;
        return ((((((((((e + (etsyId != null ? etsyId.hashCode() : 0)) * 31) + this.mId) * 31) + this.mParentId) * 31) + (this.mControlsPrice ? 1 : 0)) * 31) + (this.mControlsQuantity ? 1 : 0)) * 31) + (this.mControlsSku ? 1 : 0);
    }

    public boolean isCustomProperty() {
        return this.mIsCustomProperty;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("property_id".equals(str)) {
            this.mPropertyId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.PROPERTY_NAME.equals(str)) {
            this.mPropertyName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.OTT_VALUE_QUALIFIER.equals(str)) {
            this.mOttValueQualifier.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.OTT_VALUE_QUALIFIER_DISPLAY_NAME.equals(str)) {
            this.mOttValueQualifierDisplayName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CONTROLS_PRICE.equals(str)) {
            this.mControlsPrice = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.CONTROLS_QUANTITY.equals(str)) {
            this.mControlsQuantity = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.CONTROLS_SKU.equals(str)) {
            this.mControlsSku = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.VALUES.equals(str)) {
            this.mInventoryValues = BaseModel.parseArray(jsonParser, EditableInventoryValue.class);
            return true;
        } else if (ResponseConstants.IS_CUSTOM_PROPERTY.equals(str)) {
            this.mIsCustomProperty = jsonParser.getValueAsBoolean();
            return true;
        } else if (!ResponseConstants.OTT_VALUE_QUALIFIER_DISPLAY_FORMAT.equals(str)) {
            return false;
        } else {
            this.mOttValueQualifierDisplayFormat = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setControlsPrice(boolean z) {
        this.mControlsPrice = z;
    }

    public void setControlsQuantity(boolean z) {
        this.mControlsQuantity = z;
    }

    public void setControlsSku(boolean z) {
        this.mControlsSku = z;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setInventoryValues(List<EditableInventoryValue> list) {
        this.mInventoryValues = list;
    }

    public void setIsCustomProperty(boolean z) {
        this.mIsCustomProperty = z;
    }

    public void setOttValueQualifier(EtsyId etsyId) {
        this.mOttValueQualifier = etsyId;
    }

    public void setOttValueQualifierDisplayFormat(String str) {
        if (str == null) {
            str = "";
        }
        this.mOttValueQualifierDisplayFormat = str;
    }

    public void setOttValueQualifierDisplayName(String str) {
        if (str == null) {
            str = "";
        }
        this.mOttValueQualifierDisplayName = str;
    }

    public void setParentId(int i) {
        this.mParentId = i;
    }

    public void setPropertyId(EtsyId etsyId) {
        this.mPropertyId = etsyId;
    }

    public void setPropertyName(String str) {
        this.mPropertyName = str;
    }

    public EditableInventoryProperty(Variation variation) {
        this.mPropertyId = variation.getPropertyId();
        this.mPropertyName = variation.getName();
        this.mControlsPrice = variation.controlsPrice();
        this.mControlsQuantity = variation.controlsQuantity();
        this.mControlsSku = variation.controlsSku();
        this.mOttValueQualifier = variation.getScaleId();
        this.mOttValueQualifierDisplayName = variation.getScaleName();
        this.mOttValueQualifierDisplayFormat = variation.getScaleFormat();
    }
}
