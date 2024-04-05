package com.etsy.android.lib.models.homescreen;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.fasterxml.jackson.core.JsonParser;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;

public class LandingPageLink extends PageLink implements LandingPageInfo {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LAYOUT_GRID = 2;
    public static final int LAYOUT_LINEAR = 1;
    public static final int LAYOUT_STAGGERED = 0;
    private String apiPath;
    private String deepLink;
    private boolean isPaginateForNext;
    private int layout = 2;
    private Map<String, String> options = new HashMap();
    private String pageType = "listings";
    private HashMap<String, String> params = new HashMap<>();
    private int requestMethod;
    private String title = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LandingPageLink from(String str, String str2, String str3, String str4) {
            C19383o.m32797g(str, "title");
            C19383o.m32797g(str2, "apiPath");
            C19383o.m32797g(str3, "pageType");
            C19383o.m32797g(str4, "eventName");
            LandingPageLink landingPageLink = new LandingPageLink();
            landingPageLink.setPageTitle(str);
            landingPageLink.setApiPath(str2);
            landingPageLink.setPageType(str3);
            landingPageLink.setEventName(str4);
            return landingPageLink;
        }

        public final Class<? extends BaseModel> getClassForPageType(String str) {
            if (C19383o.m32792b("listings", str) || C19383o.m32792b("orloj_recently_viewed_listings", str) || C19383o.m32792b("recently_viewed_listings", str)) {
                return ListingCard.class;
            }
            if (C19383o.m32792b("shops", str)) {
                return ShopCard.class;
            }
            return null;
        }
    }

    public String getApiPath() {
        return this.apiPath;
    }

    public Pair<String, File> getAttachment() {
        return LandingPageInfo.DefaultImpls.getAttachment(this);
    }

    public Map<String, String> getBodyParams() {
        return LandingPageInfo.DefaultImpls.getBodyParams(this);
    }

    public boolean getBooleanOption(String str) {
        try {
            return Boolean.parseBoolean(getOptions().get(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public int getLayout() {
        return this.layout;
    }

    public Map<String, String> getOptions() {
        return this.options;
    }

    public String getPageType() {
        return this.pageType;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public int getRequestMethod() {
        return this.requestMethod;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isPaginateForNext() {
        return this.isPaginateForNext;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", ResponseConstants.DEEP_LINK, str)) {
            setDeepLink(BaseModel.Companion.parseStringURL(jsonParser));
        } else if (C19383o.m32792b(ResponseConstants.API_PATH, str)) {
            setApiPath(BaseModel.Companion.parseStringURL(jsonParser));
        } else if (C19383o.m32792b(ResponseConstants.METHOD, str)) {
            String parseString = BaseModel.Companion.parseString(jsonParser);
            if (C19457k.m33019W0(parseString, "post", true)) {
                setRequestMethod(1);
            } else if (C19457k.m33019W0(parseString, "delete", true)) {
                setRequestMethod(3);
            } else if (C19457k.m33019W0(parseString, "put", true)) {
                setRequestMethod(2);
            } else if (C19457k.m33019W0(parseString, "get", true)) {
                setRequestMethod(0);
            }
        } else if (C19383o.m32792b(ResponseConstants.PARAMS, str)) {
            jsonParser.skipChildren();
        } else if (C19383o.m32792b(ResponseConstants.LAYOUT, str)) {
            String parseStringURL = BaseModel.Companion.parseStringURL(jsonParser);
            if (C19383o.m32792b(ResponseConstants.STAGGERED, parseStringURL)) {
                setLayout(0);
            } else if (C19383o.m32792b(ResponseConstants.LINEAR, parseStringURL)) {
                setLayout(1);
            } else if (C19383o.m32792b(ResponseConstants.GRID, parseStringURL)) {
                setLayout(2);
            }
        } else if (C19383o.m32792b(ResponseConstants.PAGE_TYPE, str)) {
            setPageType(BaseModel.Companion.parseString(jsonParser));
        } else if (C19383o.m32792b(ResponseConstants.OPTIONS, str)) {
            setOptions(BaseModel.Companion.parseMap(jsonParser, new LandingPageLink$parseField$keyMapper$1(), new LandingPageLink$parseField$valueMapper$1()));
        } else if (C19383o.m32792b("title", str)) {
            this.title = BaseModel.Companion.parseString(jsonParser);
        }
        return super.parseField(jsonParser, str);
    }

    public void setApiPath(String str) {
        this.apiPath = str;
    }

    public void setDeepLink(String str) {
        this.deepLink = str;
    }

    public void setLayout(int i) {
        this.layout = i;
    }

    public final void setOption(String str, String str2) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "value");
        getOptions().put(str, str2);
    }

    public void setOptions(Map<String, String> map) {
        C19383o.m32797g(map, "<set-?>");
        this.options = map;
    }

    public void setPageType(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.pageType = str;
    }

    public void setPaginateForNext(boolean z) {
        this.isPaginateForNext = z;
    }

    public void setParams(HashMap<String, String> hashMap) {
        C19383o.m32797g(hashMap, "<set-?>");
        this.params = hashMap;
    }

    public void setRequestMethod(int i) {
        this.requestMethod = i;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    public final void setOption(String str, boolean z) {
        C19383o.m32797g(str, "key");
        setOption(str, String.valueOf(z));
    }
}
