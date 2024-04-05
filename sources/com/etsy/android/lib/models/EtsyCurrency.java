package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class EtsyCurrency extends BaseModel implements Comparable<EtsyCurrency> {
    private Collator mCollator = Collator.getInstance(Locale.getDefault());
    public String mName = "";
    public int mNumberPrecision;
    public EtsyMoney mUnit = C8630b.f18964e.mo21250c();

    public static class Currencies extends BaseModel {
        private List<EtsyCurrency> mCurrencies = new ArrayList();
        private Map<String, EtsyCurrency> mCurrencyMap = new HashMap();

        public List<EtsyCurrency> getCurrencies() {
            return this.mCurrencies;
        }

        public Map<String, EtsyCurrency> getCurrencyMap() {
            return this.mCurrencyMap;
        }

        public void parseData(JsonParser jsonParser) throws IOException {
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                if (!"".equals(currentName)) {
                    EtsyCurrency etsyCurrency = (EtsyCurrency) BaseModel.parseObject(jsonParser, EtsyCurrency.class);
                    if (etsyCurrency != null) {
                        this.mCurrencies.add(etsyCurrency);
                        this.mCurrencyMap.put(currentName, etsyCurrency);
                    }
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public String getCode() {
        return this.mUnit.getCurrencyCode();
    }

    public String getName() {
        return this.mName;
    }

    public EtsyMoney getUnit() {
        return this.mUnit;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.CODE.equals(currentName)) {
                    this.mUnit = this.mUnit.withCurrency(BaseModel.parseString(jsonParser));
                } else if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser);
                } else if ("number_precision".equals(currentName)) {
                    this.mNumberPrecision = jsonParser.getValueAsInt();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String toString() {
        return String.format("Name: %s Symbol: %s Code: %s Formatted unit: %s", new Object[]{getName(), getUnit().getCurrencySymbol(), getCode(), getUnit().format()});
    }

    public int compareTo(EtsyCurrency etsyCurrency) {
        return this.mCollator.compare(getName(), etsyCurrency.getName());
    }
}
