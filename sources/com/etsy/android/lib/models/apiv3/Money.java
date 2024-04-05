package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.Currency;
import org.apache.commons.lang3.ObjectUtils;

@Deprecated
public class Money extends BaseFieldModel {
    private static final long serialVersionUID = -1185223542980706832L;
    public String mAmount = "";
    public String mCurrencyCode = "";
    public String mCurrencyFormattedLong = "";
    public String mCurrencyFormattedRaw = "";
    public String mCurrencyFormattedShort = "";
    public int mDivisor = -1;
    public EtsyMoney mEtsyMoney;

    public EtsyMoney asEtsyMoney() {
        if (this.mEtsyMoney == null) {
            this.mEtsyMoney = C8630b.f18964e.mo21249b(Currency.getInstance(this.mCurrencyCode), this.mAmount, this.mDivisor);
        }
        return this.mEtsyMoney;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money money = (Money) obj;
            return ObjectUtils.equals(this.mAmount, money.getAmount()) && this.mDivisor == money.getDivisor() && ObjectUtils.equals(this.mCurrencyCode, money.getCurrencyCode());
        }
    }

    public String getAmount() {
        return this.mAmount;
    }

    public String getCurrencyCode() {
        return this.mCurrencyCode;
    }

    public String getCurrencyFormattedLong() {
        return this.mCurrencyFormattedLong;
    }

    public String getCurrencyFormattedRaw() {
        return this.mCurrencyFormattedRaw;
    }

    public String getCurrencyFormattedShort() {
        return this.mCurrencyFormattedShort;
    }

    public int getDivisor() {
        return this.mDivisor;
    }

    public int hashCode() {
        return ObjectUtils.hashCode(this.mCurrencyCode) + ((((ObjectUtils.hashCode(this.mAmount) + 527) * 31) + this.mDivisor) * 31);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1413853096:
                if (str.equals(ResponseConstants.AMOUNT)) {
                    c = 0;
                    break;
                }
                break;
            case -651122057:
                if (str.equals(ResponseConstants.CURRENCY_FORMATTED_RAW)) {
                    c = 1;
                    break;
                }
                break;
            case 1108728155:
                if (str.equals(ResponseConstants.CURRENCY_CODE)) {
                    c = 2;
                    break;
                }
                break;
            case 1289887245:
                if (str.equals(ResponseConstants.CURRENCY_FORMATTED_LONG)) {
                    c = 3;
                    break;
                }
                break;
            case 1338056459:
                if (str.equals(ResponseConstants.CURRENCY_FORMATTED_SHORT)) {
                    c = 4;
                    break;
                }
                break;
            case 1674333342:
                if (str.equals(ResponseConstants.DIVISOR)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mAmount = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.mCurrencyFormattedRaw = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.mCurrencyCode = BaseModel.parseString(jsonParser);
                break;
            case 3:
                this.mCurrencyFormattedLong = BaseModel.parseString(jsonParser);
                break;
            case 4:
                this.mCurrencyFormattedShort = BaseModel.parseString(jsonParser);
                break;
            case 5:
                this.mDivisor = jsonParser.getValueAsInt();
                break;
            default:
                return false;
        }
        return true;
    }

    public void setAmount(String str) {
        this.mAmount = str;
    }

    public void setCurrencyCode(String str) {
        this.mCurrencyCode = str;
    }

    public void setCurrencyFormattedLong(String str) {
        this.mCurrencyFormattedLong = str;
    }

    public void setCurrencyFormattedRaw(String str) {
        this.mCurrencyFormattedRaw = str;
    }

    public void setCurrencyFormattedShort(String str) {
        this.mCurrencyFormattedShort = str;
    }

    public void setDivisor(int i) {
        this.mDivisor = i;
    }

    public String toString() {
        return asEtsyMoney().format();
    }
}
