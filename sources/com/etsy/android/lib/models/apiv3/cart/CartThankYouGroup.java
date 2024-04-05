package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartThankYouGroup extends BaseCartGroup {
    private static final long serialVersionUID = 869607793492302731L;
    public String mImageUrl = "";
    public boolean mItemsVisible = true;
    public String mSubtitle = "";
    public String mTitle = "";

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public List<CartGroupItem> getItems() {
        return super.getItems();
    }

    public List<CartReceipt> getReceipts() {
        ArrayList arrayList = new ArrayList();
        for (CartGroupItem next : this.mItems) {
            if (R.id.view_type_multishop_cart_receipt == next.getViewType()) {
                arrayList.add((CartReceipt) next.getData());
            }
        }
        return arrayList;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getViewType() {
        return R.id.view_type_multishop_cart_thank_you_group;
    }

    public boolean isItemsVisible() {
        return this.mItemsVisible;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if ("subtitle".equals(str)) {
            this.mSubtitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.IMAGE_URL.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.mImageUrl = BaseModel.parseStringURL(jsonParser);
            return true;
        }
    }

    public void setItemsVisible(boolean z) {
        this.mItemsVisible = z;
    }
}
