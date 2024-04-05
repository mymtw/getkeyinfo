package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShippingDetails extends BaseFieldModel {
    private static final String RIGHT_ALIGNED_VARIATION = "right_aligned_variation";
    private static final long serialVersionUID = -3731751562448312635L;
    public String mEstimatedDeliveryDatePrimaryText;
    public String mEstimatedDeliveryDateSecondaryText;
    public FormattedMoney mFreeShippingText;
    public String mProcessingTimeText = "";
    public String mSelectedOptionId = "";
    public List<ShippingOption> mShippingOptions = new ArrayList();
    private RightAlignedVariation rightAlignedVariation;
    private CartTipper tipper;

    public String getEstimatedDeliveryDatePrimaryText() {
        return this.mEstimatedDeliveryDatePrimaryText;
    }

    public String getEstimatedDeliveryDateSecondaryText() {
        return this.mEstimatedDeliveryDateSecondaryText;
    }

    public FormattedMoney getFreeShippingText() {
        return this.mFreeShippingText;
    }

    public String getProcessingTimeText() {
        return this.mProcessingTimeText;
    }

    public RightAlignedVariation getRightAlignedVariation() {
        return this.rightAlignedVariation;
    }

    public String getSelectedOptionId() {
        return this.mSelectedOptionId;
    }

    public List<ShippingOption> getShippingOptions() {
        return this.mShippingOptions;
    }

    public CartTipper getTipper() {
        return this.tipper;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.PROCESSING_TIME_TEXT.equals(str)) {
            this.mProcessingTimeText = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.OPTIONS.equals(str)) {
            this.mShippingOptions = BaseModel.parseArray(jsonParser, ShippingOption.class);
            return true;
        } else if (ResponseConstants.SELECTED_OPTION_ID.equals(str)) {
            this.mSelectedOptionId = BaseModel.parseStringIdOrNumericValue(jsonParser);
            return true;
        } else if (ResponseConstants.FREE_SHIPPING_TEXT.equals(str)) {
            this.mFreeShippingText = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
            return true;
        } else if (ResponseConstants.PRIMARY_TEXT.equals(str)) {
            this.mEstimatedDeliveryDatePrimaryText = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.SECONDARY_TEXT.equals(str)) {
            this.mEstimatedDeliveryDateSecondaryText = BaseModel.parseString(jsonParser);
            return true;
        } else if (RIGHT_ALIGNED_VARIATION.equals(str)) {
            this.rightAlignedVariation = (RightAlignedVariation) BaseModel.parseObject(jsonParser, RightAlignedVariation.class);
            return true;
        } else if (!ResponseConstants.CART_TIPPER.equals(str)) {
            return false;
        } else {
            this.tipper = (CartTipper) BaseModel.parseObject(jsonParser, CartTipper.class);
            return true;
        }
    }
}
