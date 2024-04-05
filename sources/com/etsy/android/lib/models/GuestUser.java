package com.etsy.android.lib.models;

import android.content.Context;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.UserAvatar;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class GuestUser extends BaseFieldModel {
    public UserAvatar mAvatar;
    public EtsyId mGuestUserId = new EtsyId();
    public String mLoginName;
    public String mRealName;

    public UserAvatar getAvatar() {
        return this.mAvatar;
    }

    public String getFormattedName(Context context) {
        return String.format("%s (%s)", new Object[]{this.mRealName, context.getString(R.string.guest)});
    }

    public EtsyId getGuestUserId() {
        return this.mGuestUserId;
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public String getRealName() {
        return this.mRealName;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1747812959:
                if (str.equals("login_name")) {
                    c = 0;
                    break;
                }
                break;
            case -1460835672:
                if (str.equals(ResponseConstants.GUEST_USER_ID)) {
                    c = 1;
                    break;
                }
                break;
            case -884593524:
                if (str.equals(ResponseConstants.GUEST_REAL_NAME)) {
                    c = 2;
                    break;
                }
                break;
            case -402824823:
                if (str.equals("avatar_url")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mLoginName = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.mGuestUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 2:
                this.mRealName = BaseModel.parseString(jsonParser);
                break;
            case 3:
                this.mAvatar = new UserAvatar(BaseModel.parseString(jsonParser));
                break;
            default:
                return false;
        }
        return true;
    }
}
