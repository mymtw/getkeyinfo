package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.OfferingSelect;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartListingOfferingData extends BaseFieldModel {
    private static final long serialVersionUID = 2393725119363922043L;
    public List<OfferingSelect> mOfferingSelects = new ArrayList();

    public List<OfferingSelect> getOfferingSelects() {
        return this.mOfferingSelects;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (!"offeringSelect".equals(str)) {
            return false;
        }
        this.mOfferingSelects = BaseModel.parseArray(jsonParser, OfferingSelect.class);
        return true;
    }
}
