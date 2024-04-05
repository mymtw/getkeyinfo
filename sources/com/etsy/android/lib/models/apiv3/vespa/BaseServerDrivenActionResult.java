package com.etsy.android.lib.models.apiv3.vespa;

import android.text.TextUtils;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseServerDrivenActionResult extends BaseFieldModel {
    public static final String MODAL = "modal";
    public static final String TYPE_APPEND = "append";
    public static final String TYPE_RELOAD_PAGE = "reload_page";
    public static final String TYPE_REMOVE = "remove";
    public static final String TYPE_REMOVE_ALL_BELOW = "remove_all_below";
    public static final String TYPE_REPLACE = "replace";
    public static final String TYPE_REPLACE_NEXT_LINK = "replace_next_link";
    public String mMessage = "";
    public String mType = "";
    public List<MessageModel> messages = new ArrayList();

    public String getMessage() {
        return this.mMessage;
    }

    public List<MessageModel> getMessages() {
        return this.messages;
    }

    public String getType() {
        return this.mType;
    }

    public boolean hasMessage() {
        return !TextUtils.isEmpty(this.mMessage);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("type".equals(str)) {
            this.mType = BaseModel.parseNonNullString(jsonParser);
            return true;
        } else if ("message".equals(str)) {
            this.mMessage = BaseModel.parseNonNullString(jsonParser);
            return true;
        } else if (!ResponseConstants.MESSAGES.equals(str)) {
            return false;
        } else {
            this.messages = BaseModel.parseArray(jsonParser, MessageModel.class);
            return true;
        }
    }
}
