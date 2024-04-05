package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ServerDrivenAction extends UserAction implements IServerDrivenAction {
    public static final String TYPE_APPLY_COUPON = "apply_coupon";
    public static final String TYPE_APPLY_ETSY_COUPON = "apply_etsy_coupon";
    public static final String TYPE_DELETE_COUPON = "delete_coupon";
    public static final String TYPE_DISMISS = "dismiss";
    public static final String TYPE_DISMISS_ETSY_COUPON_BANNER = "dismiss_etsy_coupon_banner";
    public static final String TYPE_EXPLORE_SEGMENT_SELECT = "explore_segment_select";
    public static final String TYPE_GIFT_MESSAGE = "gift_message";
    public static final String TYPE_GIFT_WRAP = "gift_wrap";
    public static final String TYPE_IS_GIFT = "is_gift";
    public static final String TYPE_MESSAGE_TO_SELLER = "message_to_seller";
    public static final String TYPE_REMOVE_CART_LISTING = "remove";
    public static final String TYPE_REMOVE_ETSY_COUPON = "remove_etsy_coupon";
    public static final String TYPE_RESOLVE_CUSTOMIZATION = "resolve_customization";
    public static final String TYPE_SAVE_CART_LISTING = "save_for_later";
    public static final String TYPE_SEE_ALL_SAVED_FOR_LATER = "see_all_saved_for_later";
    public static final String TYPE_SET_PAYMENT_METHOD = "set_payment_method";
    public static final String TYPE_SHIPPING_OPTION = "shipping_option";
    public static final String TYPE_SHOULD_USE_GIFTCARD = "should_use_giftcard";
    public static final String TYPE_UPDATE_CUSTOMIZATION = "update_customization";
    public static final String TYPE_UPDATE_PRICE = "update_price";
    public static final String TYPE_UPDATE_QUANTITY = "update_quantity";
    public static final String TYPE_UPDATE_SHIPPING_DESTINATION = "update_shipping_destination";
    private static final long serialVersionUID = -874199034220824668L;
    public String deepLink;
    public boolean fromSignIn;
    public String icon;
    public boolean mAuthNeeded;
    public EtsyAssociativeArray mParams;
    public String mPath;
    public boolean mRefreshNeeded;
    public String mRequestMethod;

    public static class ServerDrivenActionBuilder {
        /* access modifiers changed from: private */
        public boolean authNeeded;
        /* access modifiers changed from: private */
        public String deepLink;
        /* access modifiers changed from: private */
        public boolean fromSignIn;
        /* access modifiers changed from: private */
        public String icon;
        /* access modifiers changed from: private */
        public EtsyAssociativeArray params;
        /* access modifiers changed from: private */
        public String path;
        /* access modifiers changed from: private */
        public boolean refreshNeeded;
        /* access modifiers changed from: private */
        public String requestMethod;

        public ServerDrivenActionBuilder authNeeded(Boolean bool) {
            this.authNeeded = bool.booleanValue();
            return this;
        }

        public ServerDrivenAction build() {
            return new ServerDrivenAction(this);
        }

        public ServerDrivenActionBuilder deepLink(String str) {
            this.deepLink = str;
            return this;
        }

        public ServerDrivenActionBuilder fromSignIn(Boolean bool) {
            this.fromSignIn = bool.booleanValue();
            return this;
        }

        public ServerDrivenActionBuilder icon(String str) {
            this.icon = str;
            return this;
        }

        public ServerDrivenActionBuilder params(EtsyAssociativeArray etsyAssociativeArray) {
            this.params = etsyAssociativeArray;
            return this;
        }

        public ServerDrivenActionBuilder path(String str) {
            this.path = str;
            return this;
        }

        public ServerDrivenActionBuilder refreshNeeded(Boolean bool) {
            this.refreshNeeded = bool.booleanValue();
            return this;
        }

        public ServerDrivenActionBuilder requestMethod(String str) {
            this.requestMethod = str;
            return this;
        }
    }

    public void addParam(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public boolean getAuthNeeded() {
        return this.mAuthNeeded;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getIcon() {
        return this.icon;
    }

    public EtsyAssociativeArray getParams() {
        return this.mParams;
    }

    public String getPath() {
        return this.mPath;
    }

    public boolean getRefreshNeeded() {
        return this.mRefreshNeeded;
    }

    public String getRequestMethod() {
        return this.mRequestMethod;
    }

    public boolean isFromSignIn() {
        return this.fromSignIn;
    }

    public boolean isImmediatelyRemovable() {
        return !this.mRefreshNeeded && getType().equals(TYPE_DISMISS);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.METHOD.equals(str)) {
            this.mRequestMethod = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.PATH.equals(str)) {
            this.mPath = BaseModel.parseStringURL(jsonParser);
            return true;
        } else if (ResponseConstants.AUTH_NEEDED.equals(str)) {
            this.mAuthNeeded = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.REFRESH_NEEDED.equals(str)) {
            this.mRefreshNeeded = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.DISPLAY_NAME.equals(str)) {
            this.mDisplayName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.BODY_PARAMS.equals(str)) {
            this.mParams = (EtsyAssociativeArray) BaseModel.parseObject(jsonParser, EtsyAssociativeArray.class);
            return true;
        } else if (ResponseConstants.ICON.equals(str)) {
            this.icon = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.DEEP_LINK_URL.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.deepLink = BaseModel.parseStringURL(jsonParser);
            return true;
        }
    }

    public void setDeepLink(String str) {
        this.deepLink = str;
    }

    public void setFromSignIn(boolean z) {
        this.fromSignIn = z;
    }

    public void setParams(EtsyAssociativeArray etsyAssociativeArray) {
        this.mParams = etsyAssociativeArray;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public ServerDrivenAction() {
        this.mRequestMethod = "";
        this.mPath = "";
        this.mParams = new EtsyAssociativeArray();
        this.mAuthNeeded = false;
        this.mRefreshNeeded = true;
        this.icon = "";
        this.deepLink = "";
        this.fromSignIn = false;
    }

    private ServerDrivenAction(ServerDrivenActionBuilder serverDrivenActionBuilder) {
        this.mRequestMethod = "";
        this.mPath = "";
        this.mParams = new EtsyAssociativeArray();
        this.mAuthNeeded = false;
        this.mRefreshNeeded = true;
        this.icon = "";
        this.deepLink = "";
        this.fromSignIn = false;
        this.mRequestMethod = serverDrivenActionBuilder.requestMethod;
        this.mPath = serverDrivenActionBuilder.path;
        this.mParams = serverDrivenActionBuilder.params;
        this.mAuthNeeded = serverDrivenActionBuilder.authNeeded;
        this.mRefreshNeeded = serverDrivenActionBuilder.refreshNeeded;
        this.icon = serverDrivenActionBuilder.icon;
        this.deepLink = serverDrivenActionBuilder.deepLink;
        this.fromSignIn = serverDrivenActionBuilder.fromSignIn;
    }
}
