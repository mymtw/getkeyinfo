package com.etsy.android.lib.models.homescreen;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import p415of.C13185n;

public class HomeTab extends BaseFieldModel {
    private static final long serialVersionUID = -2577527054263828062L;
    public String mApiPath;
    public String mDeepLinkPath;
    public Icon mIcons;
    public boolean mNeedsRecentlyViewedIds;
    public String mNextPath;
    public Page mPage;
    public boolean mShowSignIn;
    public String mTitle;
    public String mTrackingName;

    public HomeTab() {
        this.mTitle = "";
        this.mApiPath = "";
        this.mTrackingName = "";
        this.mDeepLinkPath = "";
        this.mNeedsRecentlyViewedIds = true;
        this.mPage = null;
    }

    public void clearNextPath() {
        this.mNextPath = null;
    }

    public void clearPage() {
        this.mPage = null;
    }

    public String getApiUrl() {
        return this.mApiPath;
    }

    public String getDeepLinkPath() {
        return this.mDeepLinkPath;
    }

    public Icon getIcons() {
        return this.mIcons;
    }

    public boolean getNeedsRecentlyViewedIds() {
        return this.mNeedsRecentlyViewedIds;
    }

    public String getNextPath() {
        return this.mNextPath;
    }

    public C13185n getPage() {
        return this.mPage;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getTrackingName() {
        return this.mTrackingName;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -941155913:
                if (str.equals(ResponseConstants.DEEP_LINK_PATH)) {
                    c = 0;
                    break;
                }
                break;
            case -601891073:
                if (str.equals(ResponseConstants.SHOW_SIGN_IN_VIEW)) {
                    c = 1;
                    break;
                }
                break;
            case 3433509:
                if (str.equals(ResponseConstants.PATH)) {
                    c = 2;
                    break;
                }
                break;
            case 100029210:
                if (str.equals(ResponseConstants.ICONS)) {
                    c = 3;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 4;
                    break;
                }
                break;
            case 523834781:
                if (str.equals(ResponseConstants.DEEP_LINK_URL)) {
                    c = 5;
                    break;
                }
                break;
            case 592404690:
                if (str.equals(ResponseConstants.NEEDS_RECENTLY_VIEWED_IDS)) {
                    c = 6;
                    break;
                }
                break;
            case 951530617:
                if (str.equals(ResponseConstants.CONTENT)) {
                    c = 7;
                    break;
                }
                break;
            case 1217098225:
                if (str.equals(ResponseConstants.NEXT_PATH)) {
                    c = 8;
                    break;
                }
                break;
            case 1738387219:
                if (str.equals(ResponseConstants.TRACKING_NAME)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                this.mDeepLinkPath = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.mShowSignIn = jsonParser.getBooleanValue();
                break;
            case 2:
                this.mApiPath = BaseModel.parseStringURL(jsonParser);
                break;
            case 3:
                this.mIcons = (Icon) BaseModel.parseObject(jsonParser, Icon.class);
                break;
            case 4:
                this.mTitle = BaseModel.parseString(jsonParser);
                break;
            case 6:
                this.mNeedsRecentlyViewedIds = jsonParser.getBooleanValue();
                break;
            case 7:
                this.mPage = (Page) BaseModel.parseObject(jsonParser, Page.class);
                break;
            case 8:
                this.mNextPath = BaseModel.parseStringURL(jsonParser);
                break;
            case 9:
                this.mTrackingName = BaseModel.parseString(jsonParser);
                break;
        }
        return false;
    }

    public boolean showSignIn() {
        return this.mShowSignIn;
    }

    public HomeTab(String str, String str2, String str3) {
        this();
        this.mTitle = str;
        this.mApiPath = str2;
        this.mTrackingName = str3;
    }
}
