package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CreditPPCOffer {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("content")
    private final Content content;
    @C18417a("referenceId")
    private final String referenceId;
    @C18417a("trackingDetails")
    private final TrackingDetails trackingDetails;

    public CreditPPCOffer() {
        this((String) null, (Content) null, (TrackingDetails) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    public CreditPPCOffer(String str, Content content2, TrackingDetails trackingDetails2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.referenceId = str;
        this.content = content2;
        this.trackingDetails = trackingDetails2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CreditPPCOffer copy$default(CreditPPCOffer creditPPCOffer, String str, Content content2, TrackingDetails trackingDetails2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditPPCOffer.referenceId;
        }
        if ((i & 2) != 0) {
            content2 = creditPPCOffer.content;
        }
        if ((i & 4) != 0) {
            trackingDetails2 = creditPPCOffer.trackingDetails;
        }
        if ((i & 8) != 0) {
            map = creditPPCOffer.additionalProperties;
        }
        return creditPPCOffer.copy(str, content2, trackingDetails2, map);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final Content component2() {
        return this.content;
    }

    public final TrackingDetails component3() {
        return this.trackingDetails;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final CreditPPCOffer copy(String str, Content content2, TrackingDetails trackingDetails2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new CreditPPCOffer(str, content2, trackingDetails2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditPPCOffer)) {
            return false;
        }
        CreditPPCOffer creditPPCOffer = (CreditPPCOffer) obj;
        return C19383o.m32792b(this.referenceId, creditPPCOffer.referenceId) && C19383o.m32792b(this.content, creditPPCOffer.content) && C19383o.m32792b(this.trackingDetails, creditPPCOffer.trackingDetails) && C19383o.m32792b(this.additionalProperties, creditPPCOffer.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Content getContent() {
        return this.content;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final TrackingDetails getTrackingDetails() {
        return this.trackingDetails;
    }

    public int hashCode() {
        String str = this.referenceId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Content content2 = this.content;
        int hashCode2 = (hashCode + (content2 == null ? 0 : content2.hashCode())) * 31;
        TrackingDetails trackingDetails2 = this.trackingDetails;
        if (trackingDetails2 != null) {
            i = trackingDetails2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode2 + i) * 31);
    }

    public String toString() {
        String str = this.referenceId;
        Content content2 = this.content;
        TrackingDetails trackingDetails2 = this.trackingDetails;
        Map<String, Object> map = this.additionalProperties;
        return "CreditPPCOffer(referenceId=" + str + ", content=" + content2 + ", trackingDetails=" + trackingDetails2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditPPCOffer(String str, Content content2, TrackingDetails trackingDetails2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : content2, (i & 4) != 0 ? null : trackingDetails2, (i & 8) != 0 ? new HashMap() : map);
    }
}
