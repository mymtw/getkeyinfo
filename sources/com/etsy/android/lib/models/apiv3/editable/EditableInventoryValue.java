package com.etsy.android.lib.models.apiv3.editable;

import android.content.Context;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.variations.VariationOption;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class EditableInventoryValue extends BaseFieldModel implements IEditableInventoryObject {
    public static final int EDIT_ROOT_ID = 200000;
    public static final int ROOT_ID = 100000;
    private static final long serialVersionUID = -429709770033288306L;
    public int mId;
    public List<EditableInventoryChannel> mInventoryChannels = new ArrayList(0);
    public List<EditableInventoryProperty> mInventoryProperties = new ArrayList(0);
    public EtsyId mListingId = new EtsyId();
    public EtsyId mOttValueId = new EtsyId();
    public int mParentId;
    public String mSku;
    public String mValue;
    public EtsyId mValueId = new EtsyId();

    public static class FlattenedInventoryValue {
        public List<EditableInventoryChannel> mChannels = new ArrayList();
        public List<EditableInventoryProperty> mProperties = new ArrayList();
        public List<EditableInventoryValue> mValues = new ArrayList();

        public FlattenedInventoryValue(EditableInventoryValue editableInventoryValue) {
            setFlattenedInventoryValue(editableInventoryValue);
        }

        private void setFlattenedInventoryProperty(EditableInventoryProperty editableInventoryProperty) {
            this.mProperties.add(editableInventoryProperty);
            for (EditableInventoryValue flattenedInventoryValue : editableInventoryProperty.getInventoryValues()) {
                setFlattenedInventoryValue(flattenedInventoryValue);
            }
        }

        private void setFlattenedInventoryValue(EditableInventoryValue editableInventoryValue) {
            this.mValues.add(editableInventoryValue);
            this.mChannels.addAll(editableInventoryValue.getInventoryChannels());
            for (EditableInventoryProperty flattenedInventoryProperty : editableInventoryValue.getInventoryProperties()) {
                setFlattenedInventoryProperty(flattenedInventoryProperty);
            }
        }

        public List<EditableInventoryChannel> getChannels() {
            return this.mChannels;
        }

        public List<EditableInventoryProperty> getProperties() {
            return this.mProperties;
        }

        public List<EditableInventoryValue> getValues() {
            return this.mValues;
        }
    }

    public EditableInventoryValue() {
    }

    public static void addPropertySummary(EditableInventoryProperty editableInventoryProperty, List<String> list, Context context) {
        List<EditableInventoryValue> inventoryValues = editableInventoryProperty.getInventoryValues();
        int size = inventoryValues.size();
        list.add(context.getResources().getQuantityString(R.plurals.variation_summary, size, new Object[]{editableInventoryProperty.getPropertyName(), Integer.valueOf(size)}));
        if (!inventoryValues.isEmpty()) {
            List<EditableInventoryProperty> inventoryProperties = inventoryValues.get(0).getInventoryProperties();
            if (!inventoryProperties.isEmpty()) {
                addPropertySummary(inventoryProperties.get(0), list, context);
            }
        }
    }

    public static String getSkuSummary(EditableInventoryValue editableInventoryValue, Context context) {
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        String str = "";
        int i = 0;
        while (true) {
            if (i >= inventoryProperties.size()) {
                break;
            }
            EditableInventoryProperty editableInventoryProperty = inventoryProperties.get(i);
            if (editableInventoryProperty.controlsSku()) {
                List<EditableInventoryValue> inventoryValues = editableInventoryProperty.getInventoryValues();
                if (inventoryValues.isEmpty()) {
                    str = context.getString(R.string.sku_varies_on_one_variation, new Object[]{editableInventoryProperty.getPropertyName()});
                    break;
                } else if (inventoryValues.get(0).getInventoryProperties().isEmpty()) {
                    str = context.getString(R.string.sku_varies_on_one_variation, new Object[]{editableInventoryProperty.getPropertyName()});
                    break;
                } else {
                    str = context.getString(R.string.sku_varies_on_multiple_variations);
                }
            }
            i++;
        }
        return str.isEmpty() ? editableInventoryValue.getSku() : str;
    }

    public static String getVariationsSummary(EditableInventoryValue editableInventoryValue, Context context) {
        ArrayList arrayList = new ArrayList();
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        for (int i = 0; i < inventoryProperties.size(); i++) {
            addPropertySummary(inventoryProperties.get(i), arrayList, context);
        }
        return StringUtils.join((Iterable<?>) arrayList, "\n");
    }

    private boolean hasEqualChannelsPropertiesAndSku(EditableInventoryValue editableInventoryValue) {
        if (!this.mInventoryChannels.equals(editableInventoryValue.mInventoryChannels) || !this.mInventoryProperties.equals(editableInventoryValue.mInventoryProperties)) {
            return false;
        }
        String str = this.mSku;
        String str2 = editableInventoryValue.mSku;
        return str != null ? str.equals(str2) : str2 == null;
    }

    private boolean hasEqualIdsAndValue(EditableInventoryValue editableInventoryValue) {
        int i = this.mId;
        int i2 = editableInventoryValue.mId;
        if (i != i2 && Math.abs(i - i2) != Math.abs(100000)) {
            return false;
        }
        int i3 = this.mParentId;
        int i4 = editableInventoryValue.mParentId;
        if ((i3 != i4 && Math.abs(i3 - i4) != Math.abs(100000)) || !this.mListingId.equals(editableInventoryValue.mListingId) || !this.mOttValueId.equals(editableInventoryValue.mOttValueId) || !this.mValueId.equals(editableInventoryValue.mValueId)) {
            return false;
        }
        String str = this.mValue;
        String str2 = editableInventoryValue.mValue;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableInventoryValue editableInventoryValue = (EditableInventoryValue) obj;
        return hasEqualIdsAndValue(editableInventoryValue) && hasEqualChannelsPropertiesAndSku(editableInventoryValue);
    }

    public boolean equalsIgnoringPQS(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableInventoryValue editableInventoryValue = (EditableInventoryValue) obj;
        if (!hasEqualIdsAndValue(editableInventoryValue) || this.mInventoryChannels.size() != editableInventoryValue.mInventoryChannels.size()) {
            return false;
        }
        int size = this.mInventoryChannels.size();
        for (int i = 0; i < size; i++) {
            if (!this.mInventoryChannels.get(i).equalsIgnoringPQ(editableInventoryValue.mInventoryChannels.get(i))) {
                return false;
            }
        }
        if (this.mInventoryProperties.size() != editableInventoryValue.mInventoryProperties.size()) {
            return false;
        }
        int size2 = this.mInventoryProperties.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!this.mInventoryProperties.get(i2).equalsIgnoringPQS(editableInventoryValue.mInventoryProperties.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public EditableInventoryChannel getChannelById(EtsyId etsyId) {
        if (!C15588c1.m25338o0(this.mInventoryChannels)) {
            return null;
        }
        int size = this.mInventoryChannels.size();
        for (int i = 0; i < size; i++) {
            EditableInventoryChannel editableInventoryChannel = this.mInventoryChannels.get(i);
            if (editableInventoryChannel.getChannelId().equals(etsyId)) {
                return editableInventoryChannel;
            }
        }
        return null;
    }

    public int getId() {
        return this.mId;
    }

    public List<EditableInventoryChannel> getInventoryChannels() {
        return this.mInventoryChannels;
    }

    public List<EditableInventoryProperty> getInventoryProperties() {
        return this.mInventoryProperties;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public EtsyId getOttValueId() {
        return this.mOttValueId;
    }

    public int getParentId() {
        return this.mParentId;
    }

    public String getSku() {
        return this.mSku;
    }

    public String getValue() {
        return this.mValue;
    }

    public EtsyId getValueId() {
        return this.mValueId;
    }

    public boolean hasPropertiesControllingPrice() {
        List<EditableInventoryProperty> list = this.mInventoryProperties;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EditableInventoryProperty editableInventoryProperty = list.get(i);
            if (editableInventoryProperty != null && editableInventoryProperty.controlsPriceOrHasDescendantControllingPrice()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPropertiesControllingQuantity() {
        List<EditableInventoryProperty> list = this.mInventoryProperties;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EditableInventoryProperty editableInventoryProperty = list.get(i);
            if (editableInventoryProperty != null && editableInventoryProperty.controlsQuantityOrHasDescendantControllingQuantity()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPropertiesControllingSku() {
        List<EditableInventoryProperty> list = this.mInventoryProperties;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EditableInventoryProperty editableInventoryProperty = list.get(i);
            if (editableInventoryProperty != null && editableInventoryProperty.controlsSkuOrHasDescendantControllingSku()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasProperty(EtsyId etsyId) {
        if (!C15588c1.m25338o0(this.mInventoryProperties)) {
            return false;
        }
        for (EditableInventoryProperty next : this.mInventoryProperties) {
            if (etsyId.equals(next.getPropertyId())) {
                return true;
            }
            List<EditableInventoryValue> inventoryValues = next.getInventoryValues();
            if (C15588c1.m25338o0(inventoryValues) && inventoryValues.get(0).hasProperty(etsyId)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mInventoryProperties.hashCode();
        int hashCode2 = this.mListingId.hashCode();
        int hashCode3 = (this.mValueId.hashCode() + ((this.mOttValueId.hashCode() + ((hashCode2 + ((hashCode + (this.mInventoryChannels.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.mValue;
        int i = 0;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mSku;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.mParentId) * 31) + this.mId;
    }

    public boolean isEditRootValue() {
        return getId() == 200000;
    }

    public boolean isRootValue() {
        return getId() == 100000;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.OTT_VALUE_ID.equals(str)) {
            this.mOttValueId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("value".equals(str)) {
            this.mValue = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.VALUE_ID.equals(str)) {
            this.mValueId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("sku".equals(str)) {
            this.mSku = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CHANNELS.equals(str)) {
            this.mInventoryChannels = BaseModel.parseArray(jsonParser, EditableInventoryChannel.class);
            return true;
        } else if (!ResponseConstants.CHILDREN.equals(str)) {
            return false;
        } else {
            this.mInventoryProperties = BaseModel.parseArray(jsonParser, EditableInventoryProperty.class);
            return true;
        }
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setIds(String str) {
        this.mListingId.setId(str);
        setIds(this, 100000, str);
    }

    public void setInventoryChannels(List<EditableInventoryChannel> list) {
        this.mInventoryChannels = list;
    }

    public void setInventoryProperties(List<EditableInventoryProperty> list) {
        this.mInventoryProperties = list;
    }

    public void setListingId(EtsyId etsyId) {
        this.mListingId = etsyId;
    }

    public void setOttValueId(EtsyId etsyId) {
        this.mOttValueId = etsyId;
    }

    public void setParentId(int i) {
        this.mParentId = i;
    }

    public void setSku(String str) {
        this.mSku = str;
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public void setValueId(EtsyId etsyId) {
        this.mValueId = etsyId;
    }

    public static int setIds(EditableInventoryValue editableInventoryValue, int i, String str) {
        editableInventoryValue.setId(i);
        editableInventoryValue.getListingId().setId(str);
        for (EditableInventoryChannel next : editableInventoryValue.getInventoryChannels()) {
            next.setParentId(editableInventoryValue.getId());
            i = r6 + 1;
            next.setId(i);
            next.getListingId().setId(str);
        }
        for (EditableInventoryProperty next2 : editableInventoryValue.getInventoryProperties()) {
            next2.setParentId(editableInventoryValue.getId());
            r6++;
            next2.setId(r6);
            next2.getListingId().setId(str);
            for (EditableInventoryValue next3 : next2.getInventoryValues()) {
                next3.setParentId(next2.getId());
                r6 = setIds(next3, r6 + 1, str);
            }
        }
        return r6;
    }

    public EditableInventoryValue(VariationOption variationOption) {
        this.mOttValueId = variationOption.getOttValueId();
        this.mValue = variationOption.getValue();
        this.mValueId = variationOption.getValueId();
    }
}
