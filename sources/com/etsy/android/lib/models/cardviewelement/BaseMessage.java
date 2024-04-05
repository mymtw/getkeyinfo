package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class BaseMessage extends BaseFieldModel {
    public static final String POINTER_POSITION_CENTER = "center";
    public static final String POINTER_POSITION_LEFT = "left";
    public static final String POINTER_POSITION_RIGHT = "right";
    public static final String TYPE_ERROR = "error";
    public static final String TYPE_INFO = "info";
    public static final String TYPE_NOTIFY = "notify";
    public static final String TYPE_SUCCESS = "success";
    public static final String TYPE_WARNING = "warning";
    private static final long serialVersionUID = 6439797631362249870L;
    public boolean hasPointer = true;
    public String message = "";
    public String pointerPosition = null;
    public String type = "info";

    public boolean getHasPointer() {
        return this.hasPointer;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPointerPosition() {
        return this.pointerPosition;
    }

    public String getType() {
        return this.type;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("message".equals(str)) {
            this.message = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.HAS_POINTER.equals(str)) {
            this.hasPointer = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.POINTER_POSITION.equals(str)) {
            this.pointerPosition = BaseModel.parseString(jsonParser);
            return true;
        } else if (!"type".equals(str)) {
            return false;
        } else {
            this.type = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setHasPointer(boolean z) {
        this.hasPointer = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPointerPosition(String str) {
        this.pointerPosition = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
