package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;

public class Payment extends BaseModel {
    private static final long serialVersionUID = 6111704816684231287L;
    private int mAdjustedGross;
    private List<PaymentAdjustment> mAdjustments = new ArrayList();
    private String mCurrency = "";
    private EtsyId mPaymentId = new EtsyId();
    private EtsyId mReceiptId = new EtsyId();

    public List<PaymentAdjustment> getAdjustments() {
        return this.mAdjustments;
    }

    public String getFormattedAdjustedTotal() {
        return C8630b.f18964e.mo21249b(Currency.getInstance("USD"), String.valueOf(this.mAdjustedGross), 100).format();
    }

    public EtsyId getId() {
        return this.mPaymentId;
    }

    public EtsyId getReceiptId() {
        return this.mReceiptId;
    }

    public boolean hasRefund() {
        for (PaymentAdjustment isRefunded : this.mAdjustments) {
            if (isRefunded.isRefunded()) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullRefund() {
        return hasRefund() && this.mAdjustedGross == 0;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.PAYMENT_ID.equals(currentName)) {
                    this.mPaymentId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.RECEIPT_ID.equals(currentName)) {
                    this.mReceiptId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.ADJUSTED_GROSS.equals(currentName)) {
                    this.mAdjustedGross = jsonParser.getValueAsInt();
                } else if ("currency".equals(currentName)) {
                    this.mCurrency = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.ADJUSTMENTS.equals(currentName)) {
                    this.mAdjustments = BaseModel.parseArray(jsonParser, PaymentAdjustment.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.RECEIPT_ID, this.mReceiptId.getId());
        hashMap.put(PredefinedAnalyticsProperty.PAYMENT_ID, this.mPaymentId.getId());
        return hashMap;
    }
}
