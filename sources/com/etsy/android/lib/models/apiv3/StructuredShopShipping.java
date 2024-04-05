package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;

public class StructuredShopShipping extends BaseModel {
    private static final long serialVersionUID = -2994509211380642461L;
    public List<StructuredShopShippingEstimate> mEstimates = new ArrayList();
    public boolean mHasShippingUpgrades;
    public String mProcessingTimeText = "";
    public boolean mShipsInternational;

    public StructuredShopShipping() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof StructuredShopShipping) {
            StructuredShopShipping structuredShopShipping = (StructuredShopShipping) obj;
            return this.mShipsInternational == structuredShopShipping.shipsInternational() && this.mHasShippingUpgrades == structuredShopShipping.hasShippingUpgrades() && ObjectUtils.equals(this.mEstimates, structuredShopShipping.getEstimates()) && ObjectUtils.equals(this.mProcessingTimeText, structuredShopShipping.getProcessingTimeText());
        }
    }

    public List<StructuredShopShippingEstimate> getEstimates() {
        return this.mEstimates;
    }

    public String getProcessingTimeText() {
        if (!C8885d0.m17323g(this.mProcessingTimeText)) {
            this.mProcessingTimeText = EtsyApplication.get().getResources().getString(R.string.structured_shipping_processing_time_message_default);
        }
        return this.mProcessingTimeText;
    }

    @JsonIgnore
    public boolean hasSetEstimates() {
        for (StructuredShopShippingEstimate isSet : this.mEstimates) {
            if (isSet.isSet()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasShippingUpgrades() {
        return this.mHasShippingUpgrades;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.mEstimates);
        return ObjectUtils.hashCode(this.mProcessingTimeText) + ((hashCode + ((((true + (this.mShipsInternational ^ true ? 1 : 0)) * 31) + (this.mHasShippingUpgrades ^ true ? 1 : 0)) * 31)) * 31);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1371807226:
                        if (currentName.equals(ResponseConstants.SHIPS_INTERNATIONAL)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -623607733:
                        if (currentName.equals(ResponseConstants.ESTIMATES)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -538635981:
                        if (currentName.equals(ResponseConstants.PROCESSING_TIME_TEXT)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -486847773:
                        if (currentName.equals(ResponseConstants.HAS_SHIPPING_UPGRADES)) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mShipsInternational = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mEstimates = BaseModel.parseArray(jsonParser, StructuredShopShippingEstimate.class);
                        break;
                    case 2:
                        this.mProcessingTimeText = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mHasShippingUpgrades = jsonParser.getValueAsBoolean();
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setEstimates(List<StructuredShopShippingEstimate> list) {
        this.mEstimates = list;
    }

    public void setHasShippingUpgrades(boolean z) {
        this.mHasShippingUpgrades = z;
    }

    public void setProcessingTimeText(String str) {
        this.mProcessingTimeText = str;
    }

    public void setShipsInternational(boolean z) {
        this.mShipsInternational = z;
    }

    public boolean shipsInternational() {
        return this.mShipsInternational;
    }

    public StructuredShopShipping(StructuredShopShipping structuredShopShipping) {
        for (StructuredShopShippingEstimate structuredShopShippingEstimate : structuredShopShipping.getEstimates()) {
            this.mEstimates.add(new StructuredShopShippingEstimate(structuredShopShippingEstimate));
        }
        this.mHasShippingUpgrades = structuredShopShipping.hasShippingUpgrades();
        this.mShipsInternational = structuredShopShipping.shipsInternational();
        this.mProcessingTimeText = structuredShopShipping.getProcessingTimeText();
    }
}
