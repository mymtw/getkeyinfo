package com.etsy.android.lib.models.shopshare;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShareItemList extends BaseModel {
    private List<ShareItem> mShareItems = new ArrayList();

    public List<ShareItem> getShopShares() {
        return this.mShareItems;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (!currentName.equals("shares")) {
                    jsonParser.skipChildren();
                } else {
                    this.mShareItems = BaseModel.parseArray(jsonParser, ShareItem.class);
                }
            }
        }
    }
}
