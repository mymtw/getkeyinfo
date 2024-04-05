package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;

public class ReviewResponse extends BaseModel {
    private static final long serialVersionUID = 5105434964070945926L;
    public Date mCreateDate;
    public String mResponseMessage = "";

    public ReviewResponse copy() {
        ReviewResponse reviewResponse = new ReviewResponse();
        reviewResponse.mResponseMessage = this.mResponseMessage;
        reviewResponse.mCreateDate = new Date(this.mCreateDate.getTime());
        return reviewResponse;
    }

    public Date getCreateDate() {
        return this.mCreateDate;
    }

    public String getMessage() {
        return this.mResponseMessage;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("message".equals(currentName)) {
                    String parseString = BaseModel.parseString(jsonParser);
                    if (parseString != null) {
                        this.mResponseMessage = parseString.trim();
                    }
                } else if (ResponseConstants.CREATE_DATE.equals(currentName)) {
                    this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setMessage(String str) {
        this.mResponseMessage = str;
    }
}
