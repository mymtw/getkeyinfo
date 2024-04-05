package com.etsy.android.lib.models.variations;

import com.etsy.android.lib.models.apiv3.TaxonomyAttributeValue;
import com.etsy.android.lib.models.apiv3.editable.EditableInventoryValue;
import com.etsy.android.lib.models.datatypes.EtsyId;

public class VariationOption {
    private static final int NO_ORDER = -1;
    public int mOrder;
    public EtsyId mOttValueId;
    public String mValue;
    public EtsyId valueId;

    public VariationOption(String str) {
        this(str, -1);
    }

    public int getOrder() {
        return this.mOrder;
    }

    public EtsyId getOttValueId() {
        return this.mOttValueId;
    }

    public String getValue() {
        return this.mValue;
    }

    public EtsyId getValueId() {
        return this.valueId;
    }

    public void setOrder(int i) {
        this.mOrder = i;
    }

    public VariationOption(String str, int i) {
        this.mOttValueId = new EtsyId();
        this.valueId = new EtsyId();
        this.mValue = str;
        this.mOrder = i;
    }

    public VariationOption(TaxonomyAttributeValue taxonomyAttributeValue, int i) {
        this.mOttValueId = new EtsyId();
        this.valueId = new EtsyId();
        this.mOttValueId = taxonomyAttributeValue.getId();
        this.mValue = taxonomyAttributeValue.getName();
        this.mOrder = i;
    }

    public VariationOption(EditableInventoryValue editableInventoryValue, int i) {
        this.mOttValueId = new EtsyId();
        this.valueId = new EtsyId();
        this.mOttValueId = editableInventoryValue.getOttValueId();
        this.mValue = editableInventoryValue.getValue();
        this.mOrder = i;
        this.valueId = editableInventoryValue.getValueId();
    }
}
