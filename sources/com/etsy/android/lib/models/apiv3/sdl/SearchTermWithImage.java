package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SearchTermWithImage implements ISearchSuggestion, ITrackedObject {
    public static final int $stable = 8;
    private final String contentSource;
    private final ListingImage image;
    private transient List<C8696j> onSeenTrackingEvents;
    private final String query;
    private transient String trackingName;

    public SearchTermWithImage() {
        this((String) null, (ListingImage) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public SearchTermWithImage(@C17402n(name = "query") String str, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "content_source") String str2) {
        C19383o.m32797g(str, "query");
        C19383o.m32797g(str2, "contentSource");
        this.query = str;
        this.image = listingImage;
        this.contentSource = str2;
        this.onSeenTrackingEvents = new ArrayList();
    }

    public static /* synthetic */ SearchTermWithImage copy$default(SearchTermWithImage searchTermWithImage, String str, ListingImage listingImage, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTermWithImage.getQuery();
        }
        if ((i & 2) != 0) {
            listingImage = searchTermWithImage.getImage();
        }
        if ((i & 4) != 0) {
            str2 = searchTermWithImage.contentSource;
        }
        return searchTermWithImage.copy(str, listingImage, str2);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final String component1() {
        return getQuery();
    }

    public final ListingImage component2() {
        return getImage();
    }

    public final String component3() {
        return this.contentSource;
    }

    public final SearchTermWithImage copy(@C17402n(name = "query") String str, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "content_source") String str2) {
        C19383o.m32797g(str, "query");
        C19383o.m32797g(str2, "contentSource");
        return new SearchTermWithImage(str, listingImage, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTermWithImage)) {
            return false;
        }
        SearchTermWithImage searchTermWithImage = (SearchTermWithImage) obj;
        return C19383o.m32792b(getQuery(), searchTermWithImage.getQuery()) && C19383o.m32792b(getImage(), searchTermWithImage.getImage()) && C19383o.m32792b(this.contentSource, searchTermWithImage.contentSource);
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public ListingImage getImage() {
        return this.image;
    }

    public List<C8696j> getOnSeenTrackingEvents() {
        return this.onSeenTrackingEvents;
    }

    public String getQuery() {
        return this.query;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return ISearchSuggestion.DefaultImpls.getTrackedPosition(this);
    }

    public String getTrackingName() {
        return this.trackingName;
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, this.contentSource), new Pair(PredefinedAnalyticsProperty.QUERY, getQuery()));
    }

    public int getViewType() {
        return R.id.view_type_search_suggestion_with_image;
    }

    public int hashCode() {
        return this.contentSource.hashCode() + (((getQuery().hashCode() * 31) + (getImage() == null ? 0 : getImage().hashCode())) * 31);
    }

    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "<set-?>");
        this.onSeenTrackingEvents = list;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
        ISearchSuggestion.DefaultImpls.setTrackedPosition(this, i);
    }

    public void setTrackingName(String str) {
        this.trackingName = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchTermWithImage(query=");
        h.append(getQuery());
        h.append(", image=");
        h.append(getImage());
        h.append(", contentSource=");
        return C0391c.m1057c(h, this.contentSource, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchTermWithImage(String str, ListingImage listingImage, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : listingImage, (i & 4) != 0 ? "" : str2);
    }
}
