package com.etsy.android.lib.models;

import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class Region extends BaseModel implements Comparable<Region> {
    private static final long serialVersionUID = -5304078965172970685L;
    private boolean mIsDead;
    private String mRegionCode;
    private int mRegionId;
    private String mRegionName;

    public Region() {
        this.mRegionName = "";
        this.mRegionCode = "";
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Region) && ObjectUtils.equals(getRegionCode(), ((Region) obj).getRegionCode());
    }

    public boolean getIsDead() {
        return this.mIsDead;
    }

    public String getRegionCode() {
        return C8885d0.m17323g(this.mRegionCode) ? this.mRegionCode : String.valueOf(this.mRegionId);
    }

    public int getRegionId() {
        return this.mRegionId;
    }

    public String getRegionName() {
        return this.mRegionName;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(getRegionCode());
        return ObjectUtils.hashCode(this.mRegionName) + ((hashCode + ((527 + this.mRegionId) * 31)) * 31);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("region_id".equals(currentName)) {
                    this.mRegionId = jsonParser.getValueAsInt();
                } else if ("region_name".equals(currentName)) {
                    this.mRegionName = BaseModel.parseString(jsonParser);
                } else if ("is_dead".equals(currentName)) {
                    this.mIsDead = jsonParser.getValueAsBoolean();
                }
            }
        }
    }

    public String toString() {
        return this.mRegionName;
    }

    public int compareTo(Region region) {
        if (region == null) {
            return -1;
        }
        return C8885d0.m17317a(this.mRegionName, region.getRegionName());
    }

    public Region(String str, String str2) {
        this.mRegionName = str;
        this.mRegionCode = str2;
    }
}
