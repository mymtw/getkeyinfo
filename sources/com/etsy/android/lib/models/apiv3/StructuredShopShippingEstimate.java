package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.Region;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class StructuredShopShippingEstimate extends BaseModel {
    public static final String TYPE_COUNTRY = "country";
    public static final String TYPE_REGION = "region";
    public static final String UNIT_DAYS = "days";
    public static final String UNIT_WEEKS = "weeks";
    private static final long serialVersionUID = 704751790733306931L;
    public Integer mCountryId;
    public String mDisplayName;
    public int mMax;
    public int mMin;
    public String mRegionCode;
    public String mType;
    public String mUnit;

    public StructuredShopShippingEstimate() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof StructuredShopShippingEstimate) {
            StructuredShopShippingEstimate structuredShopShippingEstimate = (StructuredShopShippingEstimate) obj;
            return this.mMin == structuredShopShippingEstimate.getMin() && this.mMax == structuredShopShippingEstimate.getMax() && ObjectUtils.equals(this.mDisplayName, structuredShopShippingEstimate.getDisplayName()) && ObjectUtils.equals(this.mUnit, structuredShopShippingEstimate.getUnit()) && ObjectUtils.equals(this.mType, structuredShopShippingEstimate.getType()) && (("region".equals(this.mType) && ObjectUtils.equals(this.mRegionCode, structuredShopShippingEstimate.getRegionCode())) || ("country".equals(this.mType) && ObjectUtils.equals(this.mCountryId, structuredShopShippingEstimate.getCountryId())));
        }
    }

    public Integer getCountryId() {
        return this.mCountryId;
    }

    @JsonIgnore
    public String getDisplayName() {
        return this.mDisplayName;
    }

    public int getMax() {
        return this.mMax;
    }

    public int getMin() {
        return this.mMin;
    }

    public String getRegionCode() {
        return this.mRegionCode;
    }

    public String getType() {
        return this.mType;
    }

    public String getUnit() {
        return this.mUnit;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.mDisplayName);
        int hashCode2 = ObjectUtils.hashCode(this.mRegionCode);
        int hashCode3 = ObjectUtils.hashCode(this.mCountryId);
        int hashCode4 = ObjectUtils.hashCode(this.mUnit);
        return ObjectUtils.hashCode(this.mType) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((((527 + this.mMin) * 31) + this.mMax) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @JsonIgnore
    public boolean isSet() {
        return this.mMin > 0 && this.mMax > 0 && this.mUnit != null && this.mType != null && C8885d0.m17323g(this.mDisplayName);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1566082984:
                        if (currentName.equals(ResponseConstants.REGION_CODE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1017451932:
                        if (currentName.equals(ResponseConstants.COUNTRY_ID)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 107876:
                        if (currentName.equals(ResponseConstants.MAX)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 108114:
                        if (currentName.equals(ResponseConstants.MIN)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3575610:
                        if (currentName.equals("type")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3594628:
                        if (currentName.equals(ResponseConstants.UNIT)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1615086568:
                        if (currentName.equals(ResponseConstants.DISPLAY_NAME)) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (this.mCountryId != null) {
                            break;
                        } else {
                            this.mRegionCode = BaseModel.parseString(jsonParser);
                            break;
                        }
                    case 1:
                        this.mCountryId = Integer.valueOf(jsonParser.getValueAsInt());
                        this.mRegionCode = null;
                        break;
                    case 2:
                        this.mMax = jsonParser.getIntValue();
                        break;
                    case 3:
                        this.mMin = jsonParser.getIntValue();
                        break;
                    case 4:
                        String parseString = BaseModel.parseString(jsonParser);
                        this.mType = parseString;
                        if (!"country".equals(parseString) && !"region".equals(this.mType)) {
                            this.mType = null;
                            break;
                        }
                    case 5:
                        String parseString2 = BaseModel.parseString(jsonParser);
                        this.mUnit = parseString2;
                        if (!UNIT_DAYS.equals(parseString2) && !UNIT_WEEKS.equals(this.mUnit)) {
                            this.mUnit = null;
                            break;
                        }
                    case 6:
                        this.mDisplayName = BaseModel.parseString(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setCountryId(Integer num) {
        this.mCountryId = num;
        this.mRegionCode = null;
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setMax(int i) {
        this.mMax = i;
    }

    public void setMin(int i) {
        this.mMin = i;
    }

    public void setRegionCode(String str) {
        this.mRegionCode = str;
        this.mCountryId = null;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setUnit(String str) {
        this.mUnit = str;
    }

    @JsonIgnore
    public Region toRegion() {
        if ("region".equals(this.mType)) {
            return new Region(this.mDisplayName, this.mRegionCode);
        }
        return null;
    }

    public StructuredShopShippingEstimate(StructuredShopShippingEstimate structuredShopShippingEstimate) {
        this.mMin = structuredShopShippingEstimate.getMin();
        this.mMax = structuredShopShippingEstimate.getMax();
        this.mDisplayName = structuredShopShippingEstimate.getDisplayName();
        this.mRegionCode = structuredShopShippingEstimate.getRegionCode();
        this.mCountryId = structuredShopShippingEstimate.getCountryId();
        this.mUnit = structuredShopShippingEstimate.getUnit();
        this.mType = structuredShopShippingEstimate.getType();
    }

    public boolean equals(Country country) {
        return "country".equals(getType()) && (ObjectUtils.equals(getCountryId(), Integer.valueOf(country.getCountryId())) || ObjectUtils.equals(getDisplayName(), country.getName()));
    }

    public boolean equals(Region region) {
        return "region".equals(getType()) && (ObjectUtils.equals(getRegionCode(), region.getRegionCode()) || ObjectUtils.equals(getDisplayName(), region.getRegionName()));
    }
}
