package com.etsy.android.lib.requests;

import com.etsy.android.lib.core.posts.EtsyRequestPost;
import com.etsy.android.lib.models.EmptyResult;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.requests.EtsyRequest;
import java.nio.charset.Charset;

public class SearchAdsLogRequest extends EtsyRequestPost<EmptyResult> {
    private static final String LOG_CLICK_ENDPOINT = "/prolist/click-log";
    private static final String LOG_IMPRESSION_ENDPOINT = "/prolist/impression-log";
    private static final long serialVersionUID = -7476364561674445663L;

    public SearchAdsLogRequest() {
    }

    public static SearchAdsLogRequest logSearchAdsClick(String str) {
        EtsyRequest etsyRequest = new EtsyRequest(LOG_CLICK_ENDPOINT, EtsyRequest.RequestMethod.POST, EmptyResult.class, EtsyRequest.EndpointType.APIv3);
        etsyRequest.setContentType("application/x-www-form-urlencoded");
        etsyRequest.setPayload(("logging_key=" + str).getBytes(Charset.forName("UTF-8")));
        return new SearchAdsLogRequest(etsyRequest);
    }

    public static SearchAdsLogRequest logSearchAdsImpression(ListingLike listingLike, int i) {
        EtsyRequest etsyRequest = new EtsyRequest(LOG_IMPRESSION_ENDPOINT, EtsyRequest.RequestMethod.POST, EmptyResult.class, EtsyRequest.EndpointType.APIv3);
        etsyRequest.setContentType("application/x-www-form-urlencoded");
        etsyRequest.setPayload(("logging_keys=" + listingLike.getProlistLoggingKey() + "&display_locs=a." + i).getBytes(Charset.forName("UTF-8")));
        return new SearchAdsLogRequest(etsyRequest);
    }

    public int getVersionCode() {
        return 1;
    }

    public SearchAdsLogRequest(EtsyRequest<EmptyResult> etsyRequest) {
        super(etsyRequest);
    }
}
