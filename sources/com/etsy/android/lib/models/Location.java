package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class Location extends BaseModel {
    private int mGeoNameId;
    private float mLatitude;
    private String mLocationName;
    private float mLongitude;
    private String mMapUrl;
    private EtsyId mReceiptId = new EtsyId();

    public boolean equals(Object obj) {
        return obj instanceof Location ? ((Location) obj).getReceiptId().equals(getReceiptId()) : super.equals(obj);
    }

    public String getLocationName() {
        return this.mLocationName;
    }

    public String getMapUrl() {
        return this.mMapUrl;
    }

    public EtsyId getReceiptId() {
        return this.mReceiptId;
    }

    public int hashCode() {
        return this.mReceiptId.hashCode();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.RECEIPT_ID.equals(currentName)) {
                    this.mReceiptId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.LAT.equals(currentName)) {
                    this.mLatitude = (float) jsonParser.getValueAsDouble();
                } else if (ResponseConstants.LON.equals(currentName)) {
                    this.mLongitude = (float) jsonParser.getValueAsDouble();
                } else if ("location_name".equals(currentName)) {
                    this.mLocationName = BaseModel.parseString(jsonParser);
                } else if ("geonameid".equals(currentName)) {
                    this.mGeoNameId = jsonParser.getValueAsInt();
                } else if ("map_android".equals(currentName)) {
                    this.mMapUrl = BaseModel.parseStringURL(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
