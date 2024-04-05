package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;

public class UserNote extends BaseModel {
    public static final String SUBJECT_TYPE_RECEIPT = "receipt";
    private static final long serialVersionUID = 2678113532200873467L;
    public String mNote = "";
    public String mSubjectType = "";
    public EtsyId mUserNoteId = new EtsyId();

    public String getNote() {
        return this.mNote;
    }

    public EtsyId getNoteId() {
        return this.mUserNoteId;
    }

    public boolean isPrivateReceiptNote() {
        return "receipt".equalsIgnoreCase(this.mSubjectType);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("user_note_id".equals(currentName)) {
                    this.mUserNoteId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("subject_type".equals(currentName)) {
                    this.mSubjectType = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.NOTE.equals(currentName)) {
                    this.mNote = BaseModel.parseString(jsonParser).trim();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setNote(String str) {
        this.mNote = str;
    }

    public void setNoteId(EtsyId etsyId) {
        this.mUserNoteId = etsyId;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.USER_NOTE_ID, this.mUserNoteId.getId());
        return hashMap;
    }
}
