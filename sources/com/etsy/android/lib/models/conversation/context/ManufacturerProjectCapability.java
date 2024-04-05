package com.etsy.android.lib.models.conversation.context;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ManufacturerProjectCapability extends BaseFieldModel {
    private static final long serialVersionUID = 2000221533404866512L;
    public String mDescription = "";
    public String mShortName = "";

    public String getDescription() {
        return this.mDescription;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        if (str.equals(ResponseConstants.CAPABILITY_DESCRIPTION)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (!str.equals(ResponseConstants.CAPABILITY_SHORT_NAME)) {
            return false;
        } else {
            this.mShortName = BaseModel.parseString(jsonParser);
            return true;
        }
    }
}
