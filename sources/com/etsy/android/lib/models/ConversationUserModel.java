package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ConversationUserModel extends BaseFieldModel {
    private static final long serialVersionUID = 9154213686711497169L;
    public String mAvatarUrl = "";
    public String mDisplayName = "";
    public boolean mIsGuest = false;
    public EtsyId mUserId = new EtsyId();
    public String mUserName = "";

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public String getUsername() {
        return this.mUserName;
    }

    public boolean isGuest() {
        return this.mIsGuest;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -402824823:
                if (str.equals("avatar_url")) {
                    c = 0;
                    break;
                }
                break;
            case -265713450:
                if (str.equals(ResponseConstants.USERNAME)) {
                    c = 1;
                    break;
                }
                break;
            case -147132913:
                if (str.equals("user_id")) {
                    c = 2;
                    break;
                }
                break;
            case 113677955:
                if (str.equals(ResponseConstants.IS_GUEST)) {
                    c = 3;
                    break;
                }
                break;
            case 1615086568:
                if (str.equals(ResponseConstants.DISPLAY_NAME)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mAvatarUrl = BaseModel.parseStringURL(jsonParser);
                break;
            case 1:
                this.mUserName = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 3:
                this.mIsGuest = jsonParser.getValueAsBoolean();
                break;
            case 4:
                this.mDisplayName = BaseModel.parseString(jsonParser);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setAvatarUrl(String str) {
        this.mAvatarUrl = str;
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setGuest(boolean z) {
        this.mIsGuest = z;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId.setId(etsyId.getId());
    }

    public void setUserName(String str) {
        this.mUserName = str;
    }
}
