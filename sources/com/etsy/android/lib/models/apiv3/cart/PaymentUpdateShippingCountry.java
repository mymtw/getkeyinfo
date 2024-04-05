package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentUpdateShippingCountry extends BaseFieldModel {
    private static final String ALL_COUNTRY_IDS = "all_country_ids";
    private static final String DESTINATION_COUNTRY_ID = "destination_country_id";
    private static final String PREFERRED_COUNTRY_IDS = "preferred_country_ids";
    public List<Integer> mAllCountryIds = new ArrayList();
    public int mDestinationCountryId = -1;
    public String mPostalCode;
    public List<Integer> mPreferredCountries = new ArrayList();

    public List<Integer> getAllCountryIds() {
        return this.mAllCountryIds;
    }

    public int getDestinationCountryId() {
        return this.mDestinationCountryId;
    }

    public String getPostalCode() {
        return this.mPostalCode;
    }

    public List<Integer> getPreferredCountries() {
        return this.mPreferredCountries;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ALL_COUNTRY_IDS.equals(str)) {
            this.mAllCountryIds = BaseModel.parseIntArray(jsonParser);
            return true;
        } else if (PREFERRED_COUNTRY_IDS.equals(str)) {
            this.mPreferredCountries = BaseModel.parseIntArray(jsonParser);
            return true;
        } else if (DESTINATION_COUNTRY_ID.equals(str)) {
            this.mDestinationCountryId = jsonParser.getIntValue();
            return true;
        } else if (!ResponseConstants.POSTAL_CODE.equals(str)) {
            return false;
        } else {
            this.mPostalCode = BaseModel.parseString(jsonParser);
            return true;
        }
    }
}
