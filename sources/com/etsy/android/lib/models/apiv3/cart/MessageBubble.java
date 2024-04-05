package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.cardviewelement.BaseMessage;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class MessageBubble extends BaseMessage {
    private static final long serialVersionUID = 6439797631362249870L;

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        return super.parseField(jsonParser, str);
    }
}
