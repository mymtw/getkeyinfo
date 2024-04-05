package com.paypal.pyplcheckout.pojo;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class TrackingDetails {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("clickUrl")
    private final Url clickUrl;
    @C18417a("dismissUrl")
    private final Url dismissUrl;

    public TrackingDetails() {
        this((Url) null, (Url) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public TrackingDetails(Url url, Url url2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.clickUrl = url;
        this.dismissUrl = url2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ TrackingDetails copy$default(TrackingDetails trackingDetails, Url url, Url url2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            url = trackingDetails.clickUrl;
        }
        if ((i & 2) != 0) {
            url2 = trackingDetails.dismissUrl;
        }
        if ((i & 4) != 0) {
            map = trackingDetails.additionalProperties;
        }
        return trackingDetails.copy(url, url2, map);
    }

    public final Url component1() {
        return this.clickUrl;
    }

    public final Url component2() {
        return this.dismissUrl;
    }

    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    public final TrackingDetails copy(Url url, Url url2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new TrackingDetails(url, url2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingDetails)) {
            return false;
        }
        TrackingDetails trackingDetails = (TrackingDetails) obj;
        return C19383o.m32792b(this.clickUrl, trackingDetails.clickUrl) && C19383o.m32792b(this.dismissUrl, trackingDetails.dismissUrl) && C19383o.m32792b(this.additionalProperties, trackingDetails.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Url getClickUrl() {
        return this.clickUrl;
    }

    public final Url getDismissUrl() {
        return this.dismissUrl;
    }

    public int hashCode() {
        Url url = this.clickUrl;
        int i = 0;
        int hashCode = (url == null ? 0 : url.hashCode()) * 31;
        Url url2 = this.dismissUrl;
        if (url2 != null) {
            i = url2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        Url url = this.clickUrl;
        Url url2 = this.dismissUrl;
        Map<String, Object> map = this.additionalProperties;
        return "TrackingDetails(clickUrl=" + url + ", dismissUrl=" + url2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrackingDetails(Url url, Url url2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : url, (i & 2) != 0 ? null : url2, (i & 4) != 0 ? new LinkedHashMap() : map);
    }
}
