package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartGroup extends BaseCartGroup {
    private static final long serialVersionUID = -1388082562426192431L;
    public boolean mCanProceedToCheckout;
    public String mCartGroupId = "";
    public List<CartGroupItem> mPaymentItems = new ArrayList();
    public String mSelectedPaymentMethod = "";

    public boolean canProceedToCheckout() {
        return this.mCanProceedToCheckout;
    }

    public String getCartGroupId() {
        return this.mCartGroupId;
    }

    public List<CartGroupItem> getPaymentItems() {
        return this.mPaymentItems;
    }

    public String getSelectedPaymentMethod() {
        return this.mSelectedPaymentMethod;
    }

    public int getViewType() {
        return R.id.view_type_multishop_cart_group;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.CART_GROUP_ID.equals(str)) {
            this.mCartGroupId = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.SELECTED_PAYMENT_METHOD.equals(str)) {
            this.mSelectedPaymentMethod = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CAN_PROCEED_TO_CHECKOUT.equals(str)) {
            this.mCanProceedToCheckout = jsonParser.getBooleanValue();
            return true;
        } else if (!ResponseConstants.PAYMENT_ITEMS.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            insertCartGroupItems(jsonParser, this.mPaymentItems);
            return true;
        }
    }
}
