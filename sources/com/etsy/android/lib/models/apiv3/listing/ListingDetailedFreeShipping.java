package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.DetailedFreeShipping;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingDetailedFreeShipping {
    public static final int $stable = 8;
    private final DetailedFreeShipping formattedMessage;
    private final FormattedMoney message;
    private final String sellerDescription;

    public ListingDetailedFreeShipping() {
        this((String) null, (FormattedMoney) null, (DetailedFreeShipping) null, 7, (DefaultConstructorMarker) null);
    }

    public ListingDetailedFreeShipping(@C17402n(name = "seller_description") String str, @C17402n(name = "message") FormattedMoney formattedMoney, @C17402n(name = "formatted_message") DetailedFreeShipping detailedFreeShipping) {
        this.sellerDescription = str;
        this.message = formattedMoney;
        this.formattedMessage = detailedFreeShipping;
    }

    public static /* synthetic */ ListingDetailedFreeShipping copy$default(ListingDetailedFreeShipping listingDetailedFreeShipping, String str, FormattedMoney formattedMoney, DetailedFreeShipping detailedFreeShipping, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listingDetailedFreeShipping.sellerDescription;
        }
        if ((i & 2) != 0) {
            formattedMoney = listingDetailedFreeShipping.message;
        }
        if ((i & 4) != 0) {
            detailedFreeShipping = listingDetailedFreeShipping.formattedMessage;
        }
        return listingDetailedFreeShipping.copy(str, formattedMoney, detailedFreeShipping);
    }

    public final String component1() {
        return this.sellerDescription;
    }

    public final FormattedMoney component2() {
        return this.message;
    }

    public final DetailedFreeShipping component3() {
        return this.formattedMessage;
    }

    public final ListingDetailedFreeShipping copy(@C17402n(name = "seller_description") String str, @C17402n(name = "message") FormattedMoney formattedMoney, @C17402n(name = "formatted_message") DetailedFreeShipping detailedFreeShipping) {
        return new ListingDetailedFreeShipping(str, formattedMoney, detailedFreeShipping);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingDetailedFreeShipping)) {
            return false;
        }
        ListingDetailedFreeShipping listingDetailedFreeShipping = (ListingDetailedFreeShipping) obj;
        return C19383o.m32792b(this.sellerDescription, listingDetailedFreeShipping.sellerDescription) && C19383o.m32792b(this.message, listingDetailedFreeShipping.message) && C19383o.m32792b(this.formattedMessage, listingDetailedFreeShipping.formattedMessage);
    }

    public final DetailedFreeShipping getFormattedMessage() {
        return this.formattedMessage;
    }

    public final FormattedMoney getMessage() {
        return this.message;
    }

    public final String getSellerDescription() {
        return this.sellerDescription;
    }

    public int hashCode() {
        String str = this.sellerDescription;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FormattedMoney formattedMoney = this.message;
        int hashCode2 = (hashCode + (formattedMoney == null ? 0 : formattedMoney.hashCode())) * 31;
        DetailedFreeShipping detailedFreeShipping = this.formattedMessage;
        if (detailedFreeShipping != null) {
            i = detailedFreeShipping.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingDetailedFreeShipping(sellerDescription=");
        h.append(this.sellerDescription);
        h.append(", message=");
        h.append(this.message);
        h.append(", formattedMessage=");
        h.append(this.formattedMessage);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingDetailedFreeShipping(String str, FormattedMoney formattedMoney, DetailedFreeShipping detailedFreeShipping, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : formattedMoney, (i & 4) != 0 ? null : detailedFreeShipping);
    }
}
