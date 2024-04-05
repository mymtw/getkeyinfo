package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ListingLevelReturnPolicies {
    public static final int $stable = 0;
    private final boolean acceptsExchanges;
    private final boolean acceptsReturns;
    private final String deadlineDescription;
    private final String deadlineSubtitle;
    private final String deadlineTitle;
    private final Integer returnDeadline;
    private final long returnPolicyId;
    private final String returnsDescription;
    private final String returnsSubtitle;
    private final String returnsTitle;
    private final long shopId;

    public ListingLevelReturnPolicies(@C17402n(name = "return_policy_id") long j, @C17402n(name = "shop_id") long j2, @C17402n(name = "accepts_returns") boolean z, @C17402n(name = "accepts_exchanges") boolean z2, @C17402n(name = "return_deadline") Integer num, @C17402n(name = "returns_title") String str, @C17402n(name = "returns_subtitle") String str2, @C17402n(name = "returns_description") String str3, @C17402n(name = "deadline_title") String str4, @C17402n(name = "deadline_subtitle") String str5, @C17402n(name = "deadline_description") String str6) {
        C19383o.m32797g(str, "returnsTitle");
        C19383o.m32797g(str2, "returnsSubtitle");
        C19383o.m32797g(str3, "returnsDescription");
        C19383o.m32797g(str4, "deadlineTitle");
        C19383o.m32797g(str5, "deadlineSubtitle");
        C19383o.m32797g(str6, "deadlineDescription");
        this.returnPolicyId = j;
        this.shopId = j2;
        this.acceptsReturns = z;
        this.acceptsExchanges = z2;
        this.returnDeadline = num;
        this.returnsTitle = str;
        this.returnsSubtitle = str2;
        this.returnsDescription = str3;
        this.deadlineTitle = str4;
        this.deadlineSubtitle = str5;
        this.deadlineDescription = str6;
    }

    public static /* synthetic */ ListingLevelReturnPolicies copy$default(ListingLevelReturnPolicies listingLevelReturnPolicies, long j, long j2, boolean z, boolean z2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        ListingLevelReturnPolicies listingLevelReturnPolicies2 = listingLevelReturnPolicies;
        int i2 = i;
        return listingLevelReturnPolicies.copy((i2 & 1) != 0 ? listingLevelReturnPolicies2.returnPolicyId : j, (i2 & 2) != 0 ? listingLevelReturnPolicies2.shopId : j2, (i2 & 4) != 0 ? listingLevelReturnPolicies2.acceptsReturns : z, (i2 & 8) != 0 ? listingLevelReturnPolicies2.acceptsExchanges : z2, (i2 & 16) != 0 ? listingLevelReturnPolicies2.returnDeadline : num, (i2 & 32) != 0 ? listingLevelReturnPolicies2.returnsTitle : str, (i2 & 64) != 0 ? listingLevelReturnPolicies2.returnsSubtitle : str2, (i2 & 128) != 0 ? listingLevelReturnPolicies2.returnsDescription : str3, (i2 & 256) != 0 ? listingLevelReturnPolicies2.deadlineTitle : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingLevelReturnPolicies2.deadlineSubtitle : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingLevelReturnPolicies2.deadlineDescription : str6);
    }

    public final long component1() {
        return this.returnPolicyId;
    }

    public final String component10() {
        return this.deadlineSubtitle;
    }

    public final String component11() {
        return this.deadlineDescription;
    }

    public final long component2() {
        return this.shopId;
    }

    public final boolean component3() {
        return this.acceptsReturns;
    }

    public final boolean component4() {
        return this.acceptsExchanges;
    }

    public final Integer component5() {
        return this.returnDeadline;
    }

    public final String component6() {
        return this.returnsTitle;
    }

    public final String component7() {
        return this.returnsSubtitle;
    }

    public final String component8() {
        return this.returnsDescription;
    }

    public final String component9() {
        return this.deadlineTitle;
    }

    public final ListingLevelReturnPolicies copy(@C17402n(name = "return_policy_id") long j, @C17402n(name = "shop_id") long j2, @C17402n(name = "accepts_returns") boolean z, @C17402n(name = "accepts_exchanges") boolean z2, @C17402n(name = "return_deadline") Integer num, @C17402n(name = "returns_title") String str, @C17402n(name = "returns_subtitle") String str2, @C17402n(name = "returns_description") String str3, @C17402n(name = "deadline_title") String str4, @C17402n(name = "deadline_subtitle") String str5, @C17402n(name = "deadline_description") String str6) {
        String str7 = str;
        C19383o.m32797g(str7, "returnsTitle");
        String str8 = str2;
        C19383o.m32797g(str8, "returnsSubtitle");
        String str9 = str3;
        C19383o.m32797g(str9, "returnsDescription");
        String str10 = str4;
        C19383o.m32797g(str10, "deadlineTitle");
        String str11 = str5;
        C19383o.m32797g(str11, "deadlineSubtitle");
        String str12 = str6;
        C19383o.m32797g(str12, "deadlineDescription");
        return new ListingLevelReturnPolicies(j, j2, z, z2, num, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingLevelReturnPolicies)) {
            return false;
        }
        ListingLevelReturnPolicies listingLevelReturnPolicies = (ListingLevelReturnPolicies) obj;
        return this.returnPolicyId == listingLevelReturnPolicies.returnPolicyId && this.shopId == listingLevelReturnPolicies.shopId && this.acceptsReturns == listingLevelReturnPolicies.acceptsReturns && this.acceptsExchanges == listingLevelReturnPolicies.acceptsExchanges && C19383o.m32792b(this.returnDeadline, listingLevelReturnPolicies.returnDeadline) && C19383o.m32792b(this.returnsTitle, listingLevelReturnPolicies.returnsTitle) && C19383o.m32792b(this.returnsSubtitle, listingLevelReturnPolicies.returnsSubtitle) && C19383o.m32792b(this.returnsDescription, listingLevelReturnPolicies.returnsDescription) && C19383o.m32792b(this.deadlineTitle, listingLevelReturnPolicies.deadlineTitle) && C19383o.m32792b(this.deadlineSubtitle, listingLevelReturnPolicies.deadlineSubtitle) && C19383o.m32792b(this.deadlineDescription, listingLevelReturnPolicies.deadlineDescription);
    }

    public final boolean getAcceptsExchanges() {
        return this.acceptsExchanges;
    }

    public final boolean getAcceptsReturns() {
        return this.acceptsReturns;
    }

    public final String getDeadlineDescription() {
        return this.deadlineDescription;
    }

    public final String getDeadlineSubtitle() {
        return this.deadlineSubtitle;
    }

    public final String getDeadlineTitle() {
        return this.deadlineTitle;
    }

    public final Integer getReturnDeadline() {
        return this.returnDeadline;
    }

    public final long getReturnPolicyId() {
        return this.returnPolicyId;
    }

    public final String getReturnsDescription() {
        return this.returnsDescription;
    }

    public final String getReturnsSubtitle() {
        return this.returnsSubtitle;
    }

    public final String getReturnsTitle() {
        return this.returnsTitle;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public int hashCode() {
        int b = C0071c.m190b(this.shopId, Long.hashCode(this.returnPolicyId) * 31, 31);
        boolean z = this.acceptsReturns;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (b + (z ? 1 : 0)) * 31;
        boolean z3 = this.acceptsExchanges;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        Integer num = this.returnDeadline;
        return this.deadlineDescription.hashCode() + C0023f.m105e(this.deadlineSubtitle, C0023f.m105e(this.deadlineTitle, C0023f.m105e(this.returnsDescription, C0023f.m105e(this.returnsSubtitle, C0023f.m105e(this.returnsTitle, (i2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingLevelReturnPolicies(returnPolicyId=");
        h.append(this.returnPolicyId);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", acceptsReturns=");
        h.append(this.acceptsReturns);
        h.append(", acceptsExchanges=");
        h.append(this.acceptsExchanges);
        h.append(", returnDeadline=");
        h.append(this.returnDeadline);
        h.append(", returnsTitle=");
        h.append(this.returnsTitle);
        h.append(", returnsSubtitle=");
        h.append(this.returnsSubtitle);
        h.append(", returnsDescription=");
        h.append(this.returnsDescription);
        h.append(", deadlineTitle=");
        h.append(this.deadlineTitle);
        h.append(", deadlineSubtitle=");
        h.append(this.deadlineSubtitle);
        h.append(", deadlineDescription=");
        return C0391c.m1057c(h, this.deadlineDescription, ')');
    }
}
