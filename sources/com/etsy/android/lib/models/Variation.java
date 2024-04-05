package com.etsy.android.lib.models;

import android.text.TextUtils;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Variation extends BaseModel {
    public static final long serialVersionUID = 8582916799134364809L;
    public String mFormattedName = "";
    public String mFormattedValue = "";
    public boolean mIsValid;
    public List<Option> mOptions = new ArrayList(0);
    public long mPropertyId;
    public Option mSelectedOption = null;
    public long mValueId;

    public String getFormattedName() {
        return this.mFormattedName;
    }

    public String getFormattedValue() {
        return this.mFormattedValue;
    }

    public List<Option> getOptions() {
        return this.mOptions;
    }

    public long getPropertyId() {
        return this.mPropertyId;
    }

    public Option getSelectedOption() {
        return this.mSelectedOption;
    }

    public long getValueId() {
        return this.mValueId;
    }

    public boolean hasOptionSet() {
        return this.mSelectedOption != null || (!TextUtils.isEmpty(this.mFormattedValue) && this.mValueId > 0);
    }

    public boolean hasPriceDiff() {
        for (Option hasPriceDiff : this.mOptions) {
            if (hasPriceDiff.hasPriceDiff()) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid() {
        return this.mIsValid;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.VALUE_ID.equals(currentName)) {
                    this.mValueId = jsonParser.getValueAsLong();
                } else if ("property_id".equals(currentName)) {
                    this.mPropertyId = jsonParser.getValueAsLong();
                } else if ("formatted_name".equals(currentName)) {
                    this.mFormattedName = BaseModel.parseString(jsonParser);
                } else if ("formatted_value".equals(currentName)) {
                    this.mFormattedValue = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.OPTIONS.equals(currentName)) {
                    this.mOptions = BaseModel.parseArray(jsonParser, Option.class);
                } else if (ResponseConstants.COUPON_IS_VALID.equals(currentName)) {
                    this.mIsValid = jsonParser.getValueAsBoolean();
                }
            }
        }
    }

    public void setFormattedName(String str) {
        this.mFormattedName = str;
    }

    public void setFormattedValue(String str) {
        this.mFormattedValue = str;
    }

    public void setOption(Option option) {
        this.mSelectedOption = option;
        this.mFormattedValue = option.getFormattedValue();
        this.mValueId = option.getValueId();
    }

    public void setOptions(List<Option> list) {
        this.mOptions = list;
    }

    public void setPropertyId(long j) {
        this.mPropertyId = j;
    }

    public void setValid(boolean z) {
        this.mIsValid = z;
    }

    public String toString() {
        return String.format(Locale.ROOT, "%s variation has %d options (id: %d)", new Object[]{this.mFormattedName, Integer.valueOf(this.mOptions.size()), Long.valueOf(this.mPropertyId)});
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.VARIATION_PROPERTY_ID, Long.valueOf(this.mPropertyId));
        return hashMap;
    }

    public void setOption(String str, long j) {
        this.mFormattedValue = str;
        this.mValueId = j;
        this.mSelectedOption = null;
    }
}
