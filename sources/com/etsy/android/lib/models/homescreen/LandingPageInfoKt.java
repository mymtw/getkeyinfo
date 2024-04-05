package com.etsy.android.lib.models.homescreen;

import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import kotlin.jvm.internal.C19383o;

public final class LandingPageInfoKt {
    public static final LandingPageInfo.TypedPageType toTypedPageType(LandingPageInfo landingPageInfo) {
        C19383o.m32797g(landingPageInfo, "<this>");
        if (C19383o.m32792b("listings", landingPageInfo.getPageType()) || C19383o.m32792b("orloj_recently_viewed_listings", landingPageInfo.getPageType()) || C19383o.m32792b("recently_viewed_listings", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.LISTING;
        }
        if (C19383o.m32792b("shops", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.SHOP;
        }
        if (C19383o.m32792b("discover", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.DISCOVER;
        }
        if (C19383o.m32792b("page", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.PAGE;
        }
        if (C19383o.m32792b("similar_listings", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.SIMILAR_LISTINGS;
        }
        if (C19383o.m32792b("collections", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.COLLECTION;
        }
        if (C19383o.m32792b("etsy_lens", landingPageInfo.getPageType())) {
            return LandingPageInfo.TypedPageType.ETSY_LENS;
        }
        return null;
    }
}
