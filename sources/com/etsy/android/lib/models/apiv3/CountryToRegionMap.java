package com.etsy.android.lib.models.apiv3;

import android.util.SparseArray;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class CountryToRegionMap extends BaseModel {
    private static final long serialVersionUID = 726257564519043197L;
    public SparseArray<String> countryToRegionMap = new SparseArray<>();

    public String getRegionByCountryId(int i) {
        return this.countryToRegionMap.get(i);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (true) {
            Integer num = null;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
                    try {
                        num = Integer.valueOf(jsonParser.getCurrentName());
                    } catch (NumberFormatException unused) {
                    }
                } else if (jsonParser.getCurrentToken() != JsonToken.VALUE_STRING || num == null) {
                    jsonParser.skipChildren();
                } else {
                    this.countryToRegionMap.put(num.intValue(), BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser));
                }
            }
            return;
        }
    }
}
