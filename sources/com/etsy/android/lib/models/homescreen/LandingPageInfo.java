package com.etsy.android.lib.models.homescreen;

import com.etsy.android.lib.models.cardviewelement.IPageLink;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

public interface LandingPageInfo extends Serializable, IPageLink {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String PAGE_TYPE_COLLECTION = "collections";
    public static final String PAGE_TYPE_DISCOVER = "discover";
    public static final String PAGE_TYPE_ETSY_LENS = "etsy_lens";
    public static final String PAGE_TYPE_LISTINGS = "listings";
    public static final String PAGE_TYPE_ORLOJ_RECENTLY_VIEWED_LISTINGS = "orloj_recently_viewed_listings";
    public static final String PAGE_TYPE_PAGE = "page";
    public static final String PAGE_TYPE_RECENTLY_VIEWED_LISTINGS = "recently_viewed_listings";
    public static final String PAGE_TYPE_SHOPS = "shops";
    public static final String PAGE_TYPE_SHOP_SHARES = "shopShareCard";
    public static final String PAGE_TYPE_SIMILAR_LISTINGS = "similar_listings";

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PAGE_TYPE_COLLECTION = "collections";
        public static final String PAGE_TYPE_DISCOVER = "discover";
        public static final String PAGE_TYPE_ETSY_LENS = "etsy_lens";
        public static final String PAGE_TYPE_LISTINGS = "listings";
        public static final String PAGE_TYPE_ORLOJ_RECENTLY_VIEWED_LISTINGS = "orloj_recently_viewed_listings";
        public static final String PAGE_TYPE_PAGE = "page";
        public static final String PAGE_TYPE_RECENTLY_VIEWED_LISTINGS = "recently_viewed_listings";
        public static final String PAGE_TYPE_SHOPS = "shops";
        public static final String PAGE_TYPE_SHOP_SHARES = "shopShareCard";
        public static final String PAGE_TYPE_SIMILAR_LISTINGS = "similar_listings";

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static Pair<String, File> getAttachment(LandingPageInfo landingPageInfo) {
            return null;
        }

        public static Map<String, String> getBodyParams(LandingPageInfo landingPageInfo) {
            return null;
        }

        public static boolean isPaginateForNext(LandingPageInfo landingPageInfo) {
            return false;
        }
    }

    public enum TypedPageType {
        LISTING,
        SHOP,
        PAGE,
        DISCOVER,
        SIMILAR_LISTINGS,
        COLLECTION,
        ETSY_LENS
    }

    String getApiPath();

    Pair<String, File> getAttachment();

    Map<String, String> getBodyParams();

    boolean getBooleanOption(String str);

    String getDeepLink();

    String getEventName();

    int getLayout();

    Map<String, String> getOptions();

    String getPageTitle();

    String getPageType();

    HashMap<String, String> getParams();

    int getRequestMethod();

    boolean isPaginateForNext();

    void setLayout(int i);

    void setRequestMethod(int i);
}
