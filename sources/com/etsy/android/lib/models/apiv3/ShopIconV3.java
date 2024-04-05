package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ShopIconV3 extends Image {
    public EtsyId mImageId = new EtsyId();

    public EtsyId getImageId() {
        return this.mImageId;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        if (!str.equals(ResponseConstants.IMAGE_ID)) {
            return super.parseField(jsonParser, str);
        }
        this.mImageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        return true;
    }
}
