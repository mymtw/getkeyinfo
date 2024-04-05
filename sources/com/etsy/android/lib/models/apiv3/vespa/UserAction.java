package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class UserAction extends BaseFieldModel {
    public static final String TYPE_ADD_TO_LIST = "add_to_list";
    public static final String TYPE_CONTACT_SHOP = "contact_shop";
    public static final String TYPE_GOTO_SHOP = "goto_shop";
    public static final String TYPE_REPORT_LISTING = "report_listing";
    public static final String TYPE_SEE_SIMILAR = "see_similar";
    public static final String TYPE_SHARE = "share";
    public static final String TYPE_SINGLE_SHOP_CHECKOUT = "single_shop_checkout";
    public String mDeeplink;
    public String mDisplayName;
    public String mIconName;
    public String mType;
    public int mViewType;

    public UserAction() {
        this.mDisplayName = "";
        this.mViewType = R.id.view_type_single_line_text;
        this.mDeeplink = "";
    }

    public String getDeepLink() {
        return this.mDeeplink;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getIconName() {
        return this.mIconName;
    }

    public String getType() {
        return this.mType;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.DISPLAY_NAME.equals(str)) {
            this.mDisplayName = BaseModel.parseString(jsonParser);
            return true;
        } else if ("type".equals(str)) {
            this.mType = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.DEEP_LINK_URL.equals(str)) {
            return false;
        } else {
            this.mDeeplink = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }

    public String toString() {
        return getDisplayName();
    }

    public UserAction(String str, String str2, String str3, int i) {
        this.mDeeplink = "";
        this.mType = str;
        this.mDisplayName = str2;
        this.mIconName = str3;
        this.mViewType = i;
    }
}
