package com.etsy.android.lib.models.variations;

import com.etsy.android.lib.models.apiv3.TaxonomyProperty;
import com.etsy.android.lib.models.apiv3.TaxonomyValueScale;
import com.etsy.android.lib.models.apiv3.editable.EditableInventoryProperty;
import com.etsy.android.lib.models.apiv3.editable.EditableInventoryValue;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;

public class Variation {
    public boolean mControlsPrice;
    public boolean mControlsQuantity;
    public boolean mControlsSku;
    public boolean mIsCustom;
    public String mName;
    public EtsyId mPropertyId;
    public String mScaleFormat = "";
    public EtsyId mScaleId = new EtsyId();
    public String mScaleName = "";
    public List<VariationOption> mVariationOptions = new ArrayList(0);

    public Variation(String str, EtsyId etsyId) {
        this.mName = str;
        this.mPropertyId = etsyId;
        this.mIsCustom = true;
    }

    private static void _getVariationsFromInventoryValue(EditableInventoryValue editableInventoryValue, List<Variation> list) {
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        if (C15588c1.m25338o0(inventoryProperties)) {
            int size = inventoryProperties.size();
            for (int i = 0; i < size; i++) {
                EditableInventoryProperty editableInventoryProperty = inventoryProperties.get(i);
                list.add(new Variation(editableInventoryProperty));
                if (!editableInventoryProperty.getInventoryValues().isEmpty()) {
                    _getVariationsFromInventoryValue(editableInventoryProperty.getInventoryValues().get(0), list);
                }
            }
        }
    }

    public static List<Variation> getVariationsFromInventoryValue(EditableInventoryValue editableInventoryValue) {
        ArrayList arrayList = new ArrayList(0);
        _getVariationsFromInventoryValue(editableInventoryValue, arrayList);
        return arrayList;
    }

    public boolean controlsPrice() {
        return this.mControlsPrice;
    }

    public boolean controlsQuantity() {
        return this.mControlsQuantity;
    }

    public boolean controlsSku() {
        return this.mControlsSku;
    }

    public String getName() {
        return this.mName;
    }

    public List<VariationOption> getOptions() {
        return this.mVariationOptions;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public String getScaleFormat() {
        return this.mScaleFormat;
    }

    public EtsyId getScaleId() {
        return this.mScaleId;
    }

    public String getScaleName() {
        return this.mScaleName;
    }

    public boolean isCustom() {
        return this.mIsCustom;
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

    public void setName(String str) {
        this.mName = str;
    }

    public void setOptions(List<VariationOption> list) {
        this.mVariationOptions = list;
    }

    public Variation(TaxonomyProperty taxonomyProperty, TaxonomyValueScale taxonomyValueScale) {
        this.mPropertyId = taxonomyProperty.getPropertyId();
        this.mName = taxonomyProperty.getDisplayName();
        this.mVariationOptions = new ArrayList(taxonomyProperty.getPossibleValues().size());
        if (taxonomyValueScale != null) {
            this.mScaleId = taxonomyValueScale.getId();
            this.mScaleName = taxonomyValueScale.getDisplayName();
            this.mScaleFormat = taxonomyValueScale.getFormat();
        }
    }

    public Variation(EditableInventoryProperty editableInventoryProperty) {
        this.mPropertyId = editableInventoryProperty.getPropertyId();
        this.mName = editableInventoryProperty.getPropertyName();
        this.mControlsPrice = editableInventoryProperty.controlsPrice();
        this.mControlsQuantity = editableInventoryProperty.controlsQuantity();
        this.mControlsSku = editableInventoryProperty.controlsSku();
        this.mIsCustom = editableInventoryProperty.isCustomProperty();
        List<EditableInventoryValue> inventoryValues = editableInventoryProperty.getInventoryValues();
        int size = inventoryValues.size();
        this.mVariationOptions = new ArrayList(inventoryValues.size() * 2);
        for (int i = 0; i < size; i++) {
            this.mVariationOptions.add(new VariationOption(inventoryValues.get(i), i));
        }
        this.mScaleId = editableInventoryProperty.getOttValueQualifier();
        this.mScaleName = editableInventoryProperty.getOttValueQualifierDisplayName();
        this.mScaleFormat = editableInventoryProperty.getOttValueQualifierDisplayFormat();
    }
}
