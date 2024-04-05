package com.etsy.android.lib.models;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ReceiptShipment extends BaseModel {
    private static final String SHIPPING_STATE_DELIVERED = "delivered";
    private static final String SHIPPING_STATE_IN_TRANSIT = "in_transit";
    private static final String SHIPPING_STATE_NOT_SHIPPED = "not_shipped";
    private static final String SHIPPING_STATE_OUT_FOR_DELIVERY = "out_for_delivery";
    private static final String SHIPPING_STATE_SHIPPED = "shipped";
    private static final long serialVersionUID = -4554314279402820337L;
    public boolean isEtsyOnlyTracking = false;
    public String mBuyerNote = "";
    public String mCarrierName = "";
    public String mMailClass = "";
    public Date mMailingDate;
    public String mMajorTrackingState = "";
    public long mReceiptShippingId;
    public ShippingState mStatus = ShippingState.UNKNOWN;
    public Date mStatusDate;
    public String mTrackingCode = "";
    public String mTrackingUrl = "";

    public enum ShippingState {
        UNKNOWN(R.string.unknown, "unknown"),
        NOT_YET_SHIPPED(R.string.paid_status, ReceiptShipment.SHIPPING_STATE_NOT_SHIPPED),
        SHIPPED(R.string.shipped, ReceiptShipment.SHIPPING_STATE_SHIPPED),
        IN_TRANSIT(R.string.in_transit, ReceiptShipment.SHIPPING_STATE_IN_TRANSIT),
        OUT_FOR_DELIVERY(R.string.out_for_delivery, ReceiptShipment.SHIPPING_STATE_OUT_FOR_DELIVERY),
        DELIVERED(R.string.delivered, ReceiptShipment.SHIPPING_STATE_DELIVERED);
        
        private String mJsonStatus;
        private int mStringRes;

        private ShippingState(int i, String str) {
            this.mStringRes = i;
            this.mJsonStatus = str;
        }

        public static ShippingState getEnumForJson(String str) {
            ShippingState shippingState = UNKNOWN;
            ShippingState shippingState2 = DELIVERED;
            if (!shippingState2.getJsonStatus().equalsIgnoreCase(str)) {
                shippingState2 = OUT_FOR_DELIVERY;
                if (!shippingState2.getJsonStatus().equalsIgnoreCase(str)) {
                    shippingState2 = IN_TRANSIT;
                    if (!shippingState2.getJsonStatus().equalsIgnoreCase(str)) {
                        shippingState2 = SHIPPED;
                        if (!shippingState2.getJsonStatus().equalsIgnoreCase(str)) {
                            shippingState2 = NOT_YET_SHIPPED;
                            if (!shippingState2.getJsonStatus().equalsIgnoreCase(str)) {
                                return shippingState;
                            }
                        }
                    }
                }
            }
            return shippingState2;
        }

        public String getJsonStatus() {
            return this.mJsonStatus;
        }

        public int getStringResource() {
            return this.mStringRes;
        }
    }

    public ReceiptShipment() {
    }

    public String getBuyerNote() {
        return this.mBuyerNote;
    }

    public String getCarrierName() {
        return this.mCarrierName;
    }

    public String getMailClass() {
        return this.mMailClass;
    }

    public String getMajorTrackingState() {
        return this.mMajorTrackingState;
    }

    public long getReceiptShippingId() {
        return this.mReceiptShippingId;
    }

    public Date getShippedDate() {
        return this.mMailingDate;
    }

    public int getShippingString() {
        return isShippingInFuture() ? R.string.shipping_on : R.string.shipped;
    }

    public ShippingState getStatus() {
        return this.mStatus;
    }

    public Date getStatusDate() {
        return this.mStatusDate;
    }

    public String getTrackingCode() {
        return this.mTrackingCode;
    }

    public String getTrackingUrl() {
        return this.mTrackingUrl;
    }

    public boolean isEtsyOnlyTracking() {
        return this.isEtsyOnlyTracking;
    }

    public boolean isShippingInFuture() {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.mMailingDate);
        instance2.setTime(new Date());
        return instance.get(1) >= instance2.get(1) && instance.get(6) > instance2.get(6);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.RECEIPT_SHIPPING_ID.equals(currentName)) {
                    this.mReceiptShippingId = jsonParser.getValueAsLong();
                } else if (ResponseConstants.TRACKING_CODE.equals(currentName)) {
                    this.mTrackingCode = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.TRACKING_URL.equals(currentName)) {
                    this.mTrackingUrl = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.CARRIER_NAME.equals(currentName)) {
                    this.mCarrierName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.MAIL_CLASS.equals(currentName)) {
                    this.mMailClass = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.BUYER_NOTE.equals(currentName)) {
                    this.mBuyerNote = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.MAILING_DATE.equals(currentName)) {
                    this.mMailingDate = BaseModel.parseIntoDate(jsonParser);
                } else if (ResponseConstants.CURRENT_STEP.equals(currentName)) {
                    this.mStatus = ShippingState.getEnumForJson(BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.CURRENT_STEP_DATE.equals(currentName)) {
                    this.mStatusDate = BaseModel.parseIntoDate(jsonParser);
                } else if (ResponseConstants.MAJOR_TRACKING_STATE.equals(currentName)) {
                    this.mMajorTrackingState = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.IS_ETSY_ONLY_TRACKING.equals(currentName)) {
                    this.isEtsyOnlyTracking = jsonParser.getBooleanValue();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(2);
        hashMap.put(PredefinedAnalyticsProperty.RECEIPT_SHIPPING_ID, Long.valueOf(this.mReceiptShippingId));
        hashMap.put(PredefinedAnalyticsProperty.SHIPPING_STATUS, this.mStatus.getJsonStatus());
        return hashMap;
    }

    public ReceiptShipment(Receipt receipt) {
        this.mMailingDate = receipt.getShippingNotificationDate();
        this.mCarrierName = receipt.getShippingCarrier();
        this.mStatus = ShippingState.SHIPPED;
        if (C8885d0.m17324h(receipt.getShippingTrackingUrl())) {
            this.mTrackingUrl = receipt.getShippingTrackingUrl();
        }
        this.mStatusDate = this.mMailingDate;
    }
}
