package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopsPolicy {
    public static final int $stable = 0;
    private final String additional;
    private final Boolean canIncludeDisputeFormLink;
    private final Boolean hasNoPolicies;
    private final Boolean includeDisputeFormLink;
    private final String payment;
    private final String privacy;
    private final String refunds;
    private final String sellerInfo;
    private final String shipping;
    private final Integer updateDate;
    private final String welcome;

    public ShopsPolicy(@C17402n(name = "additional") String str, @C17402n(name = "can_include_dispute_form_link") Boolean bool, @C17402n(name = "has_no_policies") Boolean bool2, @C17402n(name = "include_dispute_form_link") Boolean bool3, @C17402n(name = "payment") String str2, @C17402n(name = "privacy") String str3, @C17402n(name = "refunds") String str4, @C17402n(name = "seller_info") String str5, @C17402n(name = "shipping") String str6, @C17402n(name = "update_date") Integer num, @C17402n(name = "welcome") String str7) {
        this.additional = str;
        this.canIncludeDisputeFormLink = bool;
        this.hasNoPolicies = bool2;
        this.includeDisputeFormLink = bool3;
        this.payment = str2;
        this.privacy = str3;
        this.refunds = str4;
        this.sellerInfo = str5;
        this.shipping = str6;
        this.updateDate = num;
        this.welcome = str7;
    }

    public static /* synthetic */ ShopsPolicy copy$default(ShopsPolicy shopsPolicy, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i, Object obj) {
        ShopsPolicy shopsPolicy2 = shopsPolicy;
        int i2 = i;
        return shopsPolicy.copy((i2 & 1) != 0 ? shopsPolicy2.additional : str, (i2 & 2) != 0 ? shopsPolicy2.canIncludeDisputeFormLink : bool, (i2 & 4) != 0 ? shopsPolicy2.hasNoPolicies : bool2, (i2 & 8) != 0 ? shopsPolicy2.includeDisputeFormLink : bool3, (i2 & 16) != 0 ? shopsPolicy2.payment : str2, (i2 & 32) != 0 ? shopsPolicy2.privacy : str3, (i2 & 64) != 0 ? shopsPolicy2.refunds : str4, (i2 & 128) != 0 ? shopsPolicy2.sellerInfo : str5, (i2 & 256) != 0 ? shopsPolicy2.shipping : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopsPolicy2.updateDate : num, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shopsPolicy2.welcome : str7);
    }

    public final String component1() {
        return this.additional;
    }

    public final Integer component10() {
        return this.updateDate;
    }

    public final String component11() {
        return this.welcome;
    }

    public final Boolean component2() {
        return this.canIncludeDisputeFormLink;
    }

    public final Boolean component3() {
        return this.hasNoPolicies;
    }

    public final Boolean component4() {
        return this.includeDisputeFormLink;
    }

    public final String component5() {
        return this.payment;
    }

    public final String component6() {
        return this.privacy;
    }

    public final String component7() {
        return this.refunds;
    }

    public final String component8() {
        return this.sellerInfo;
    }

    public final String component9() {
        return this.shipping;
    }

    public final ShopsPolicy copy(@C17402n(name = "additional") String str, @C17402n(name = "can_include_dispute_form_link") Boolean bool, @C17402n(name = "has_no_policies") Boolean bool2, @C17402n(name = "include_dispute_form_link") Boolean bool3, @C17402n(name = "payment") String str2, @C17402n(name = "privacy") String str3, @C17402n(name = "refunds") String str4, @C17402n(name = "seller_info") String str5, @C17402n(name = "shipping") String str6, @C17402n(name = "update_date") Integer num, @C17402n(name = "welcome") String str7) {
        return new ShopsPolicy(str, bool, bool2, bool3, str2, str3, str4, str5, str6, num, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsPolicy)) {
            return false;
        }
        ShopsPolicy shopsPolicy = (ShopsPolicy) obj;
        return C19383o.m32792b(this.additional, shopsPolicy.additional) && C19383o.m32792b(this.canIncludeDisputeFormLink, shopsPolicy.canIncludeDisputeFormLink) && C19383o.m32792b(this.hasNoPolicies, shopsPolicy.hasNoPolicies) && C19383o.m32792b(this.includeDisputeFormLink, shopsPolicy.includeDisputeFormLink) && C19383o.m32792b(this.payment, shopsPolicy.payment) && C19383o.m32792b(this.privacy, shopsPolicy.privacy) && C19383o.m32792b(this.refunds, shopsPolicy.refunds) && C19383o.m32792b(this.sellerInfo, shopsPolicy.sellerInfo) && C19383o.m32792b(this.shipping, shopsPolicy.shipping) && C19383o.m32792b(this.updateDate, shopsPolicy.updateDate) && C19383o.m32792b(this.welcome, shopsPolicy.welcome);
    }

    public final String getAdditional() {
        return this.additional;
    }

    public final Boolean getCanIncludeDisputeFormLink() {
        return this.canIncludeDisputeFormLink;
    }

    public final Boolean getHasNoPolicies() {
        return this.hasNoPolicies;
    }

    public final Boolean getIncludeDisputeFormLink() {
        return this.includeDisputeFormLink;
    }

    public final String getPayment() {
        return this.payment;
    }

    public final String getPrivacy() {
        return this.privacy;
    }

    public final String getRefunds() {
        return this.refunds;
    }

    public final String getSellerInfo() {
        return this.sellerInfo;
    }

    public final String getShipping() {
        return this.shipping;
    }

    public final Integer getUpdateDate() {
        return this.updateDate;
    }

    public final String getWelcome() {
        return this.welcome;
    }

    public int hashCode() {
        String str = this.additional;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.canIncludeDisputeFormLink;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasNoPolicies;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.includeDisputeFormLink;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.payment;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.privacy;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refunds;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sellerInfo;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shipping;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.updateDate;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.welcome;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsPolicy(additional=");
        h.append(this.additional);
        h.append(", canIncludeDisputeFormLink=");
        h.append(this.canIncludeDisputeFormLink);
        h.append(", hasNoPolicies=");
        h.append(this.hasNoPolicies);
        h.append(", includeDisputeFormLink=");
        h.append(this.includeDisputeFormLink);
        h.append(", payment=");
        h.append(this.payment);
        h.append(", privacy=");
        h.append(this.privacy);
        h.append(", refunds=");
        h.append(this.refunds);
        h.append(", sellerInfo=");
        h.append(this.sellerInfo);
        h.append(", shipping=");
        h.append(this.shipping);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", welcome=");
        return C0391c.m1057c(h, this.welcome, ')');
    }
}
