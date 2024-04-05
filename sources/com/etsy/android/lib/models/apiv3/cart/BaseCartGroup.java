package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseCartGroup extends BaseFieldModel {
    private static final long serialVersionUID = 7635064917568196595L;
    public List<CartGroupItem> mItems = new ArrayList();

    public List<CartGroupItem> getItems() {
        return this.mItems;
    }

    public int getViewType() {
        return R.id.view_type_undefined;
    }

    public void insertCartGroupItems(JsonParser jsonParser, List<CartGroupItem> list) throws IOException {
        for (CartGroupItem next : BaseModel.parseArray(jsonParser, CartGroupItem.class)) {
            if (next.getViewType() != R.id.view_type_undefined) {
                list.add(next);
            }
        }
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (!ResponseConstants.ITEMS.equals(str)) {
            return false;
        }
        insertCartGroupItems(jsonParser, this.mItems);
        return true;
    }
}
