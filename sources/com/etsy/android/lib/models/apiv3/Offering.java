package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class Offering extends BaseFieldModel {
    private static final long serialVersionUID = -638200119124130429L;
    public EtsyId mOfferingId = new EtsyId();
    public Money mPrice = new Money();
    public EtsyId mProductId = new EtsyId();
    public int mQuantity;

    public EtsyId getOfferingId() {
        return this.mOfferingId;
    }

    public Money getPrice() {
        return this.mPrice;
    }

    public EtsyId getProductId() {
        return this.mProductId;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1285004149:
                if (str.equals(ResponseConstants.QUANTITY)) {
                    c = 0;
                    break;
                }
                break;
            case 106934601:
                if (str.equals(ResponseConstants.PRICE)) {
                    c = 1;
                    break;
                }
                break;
            case 997792756:
                if (str.equals(ResponseConstants.OFFERING_ID)) {
                    c = 2;
                    break;
                }
                break;
            case 1753008747:
                if (str.equals(ResponseConstants.PRODUCT_ID)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mQuantity = jsonParser.getValueAsInt();
                break;
            case 1:
                this.mPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
                break;
            case 2:
                this.mOfferingId.setId(BaseModel.parseString(jsonParser));
                break;
            case 3:
                this.mProductId.setId(BaseModel.parseString(jsonParser));
                break;
            default:
                return false;
        }
        return true;
    }

    public void setOfferingId(EtsyId etsyId) {
        this.mOfferingId = etsyId;
    }

    public void setPrice(Money money) {
        this.mPrice = money;
    }

    public void setProductId(EtsyId etsyId) {
        this.mProductId = etsyId;
    }

    public void setQuantity(int i) {
        this.mQuantity = i;
    }
}
