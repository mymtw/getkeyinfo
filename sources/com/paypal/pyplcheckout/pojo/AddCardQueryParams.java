package com.paypal.pyplcheckout.pojo;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddCardQueryParams {
    @C18417a("address")
    private final BillingAddress address;
    @C18417a("card")
    private final Card card;
    @C18417a("cardType")
    private final FundingOptionType cardType;
    @C18417a("isPartialBillingAddress")
    private final boolean isPartialBillingAddress;
    @C18417a("paypalRequestId")
    private final String paypalRequestId;
    @C18417a("user")
    private final AddCardUser user;

    public AddCardQueryParams(FundingOptionType fundingOptionType, Card card2, AddCardUser addCardUser, BillingAddress billingAddress, String str, boolean z) {
        C19383o.m32797g(fundingOptionType, "cardType");
        C19383o.m32797g(card2, ResponseConstants.CARD);
        C19383o.m32797g(addCardUser, "user");
        this.cardType = fundingOptionType;
        this.card = card2;
        this.user = addCardUser;
        this.address = billingAddress;
        this.paypalRequestId = str;
        this.isPartialBillingAddress = z;
    }

    public static /* synthetic */ AddCardQueryParams copy$default(AddCardQueryParams addCardQueryParams, FundingOptionType fundingOptionType, Card card2, AddCardUser addCardUser, BillingAddress billingAddress, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingOptionType = addCardQueryParams.cardType;
        }
        if ((i & 2) != 0) {
            card2 = addCardQueryParams.card;
        }
        Card card3 = card2;
        if ((i & 4) != 0) {
            addCardUser = addCardQueryParams.user;
        }
        AddCardUser addCardUser2 = addCardUser;
        if ((i & 8) != 0) {
            billingAddress = addCardQueryParams.address;
        }
        BillingAddress billingAddress2 = billingAddress;
        if ((i & 16) != 0) {
            str = addCardQueryParams.paypalRequestId;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = addCardQueryParams.isPartialBillingAddress;
        }
        return addCardQueryParams.copy(fundingOptionType, card3, addCardUser2, billingAddress2, str2, z);
    }

    public final FundingOptionType component1() {
        return this.cardType;
    }

    public final Card component2() {
        return this.card;
    }

    public final AddCardUser component3() {
        return this.user;
    }

    public final BillingAddress component4() {
        return this.address;
    }

    public final String component5() {
        return this.paypalRequestId;
    }

    public final boolean component6() {
        return this.isPartialBillingAddress;
    }

    public final AddCardQueryParams copy(FundingOptionType fundingOptionType, Card card2, AddCardUser addCardUser, BillingAddress billingAddress, String str, boolean z) {
        C19383o.m32797g(fundingOptionType, "cardType");
        C19383o.m32797g(card2, ResponseConstants.CARD);
        C19383o.m32797g(addCardUser, "user");
        return new AddCardQueryParams(fundingOptionType, card2, addCardUser, billingAddress, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardQueryParams)) {
            return false;
        }
        AddCardQueryParams addCardQueryParams = (AddCardQueryParams) obj;
        return this.cardType == addCardQueryParams.cardType && C19383o.m32792b(this.card, addCardQueryParams.card) && C19383o.m32792b(this.user, addCardQueryParams.user) && C19383o.m32792b(this.address, addCardQueryParams.address) && C19383o.m32792b(this.paypalRequestId, addCardQueryParams.paypalRequestId) && this.isPartialBillingAddress == addCardQueryParams.isPartialBillingAddress;
    }

    public final BillingAddress getAddress() {
        return this.address;
    }

    public final Card getCard() {
        return this.card;
    }

    public final FundingOptionType getCardType() {
        return this.cardType;
    }

    public final String getPaypalRequestId() {
        return this.paypalRequestId;
    }

    public final AddCardUser getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = (this.user.hashCode() + ((this.card.hashCode() + (this.cardType.hashCode() * 31)) * 31)) * 31;
        BillingAddress billingAddress = this.address;
        int i = 0;
        int hashCode2 = (hashCode + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
        String str = this.paypalRequestId;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isPartialBillingAddress;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isPartialBillingAddress() {
        return this.isPartialBillingAddress;
    }

    public String toString() {
        FundingOptionType fundingOptionType = this.cardType;
        Card card2 = this.card;
        AddCardUser addCardUser = this.user;
        BillingAddress billingAddress = this.address;
        String str = this.paypalRequestId;
        boolean z = this.isPartialBillingAddress;
        return "AddCardQueryParams(cardType=" + fundingOptionType + ", card=" + card2 + ", user=" + addCardUser + ", address=" + billingAddress + ", paypalRequestId=" + str + ", isPartialBillingAddress=" + z + ")";
    }
}
