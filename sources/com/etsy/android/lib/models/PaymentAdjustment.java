package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Currency;

public class PaymentAdjustment extends BaseModel {
    private static final String STATUS_SUCCESS = "SUCCESS";
    private static final long serialVersionUID = -8333893997371137050L;
    private boolean mIsSuccess;
    private EtsyId mPaymentAdjustmentId = new EtsyId();
    private String mReasonCode = "";
    private String mReasonCodeFormatted = "";
    private String mStatus = "";
    private int mTotalAdjustmentAmount;

    public String getFormattedReason() {
        return this.mReasonCodeFormatted;
    }

    public String getRefundAmount() {
        return C8630b.f18964e.mo21249b(Currency.getInstance("USD"), String.valueOf(this.mTotalAdjustmentAmount), 100).format();
    }

    public boolean isRefunded() {
        return this.mIsSuccess && this.mTotalAdjustmentAmount > 0;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.PAYMENT_ADJUSTMENT_ID.equals(currentName)) {
                    this.mPaymentAdjustmentId.setId(BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.REASON_CODE.equals(currentName)) {
                    this.mReasonCode = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.REASON_CODE_TEXT.equals(currentName)) {
                    this.mReasonCodeFormatted = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.TOTAL_ADJUSTMENT_AMOUNT.equals(currentName)) {
                    this.mTotalAdjustmentAmount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.STATUS.equals(currentName)) {
                    this.mStatus = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.IS_SUCCESS.equals(currentName)) {
                    this.mIsSuccess = jsonParser.getBooleanValue();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
