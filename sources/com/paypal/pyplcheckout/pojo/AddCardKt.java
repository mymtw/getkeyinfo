package com.paypal.pyplcheckout.pojo;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AddCardKt {
    public static final AddCardQueryParams createAddCardQueryParams(String str, String str2, String str3, CardIssuerType cardIssuerType, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str;
        C19383o.m32797g(str9, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        String str10 = str2;
        C19383o.m32797g(str10, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(str3, "cardNumber");
        CardIssuerType cardIssuerType2 = cardIssuerType;
        C19383o.m32797g(cardIssuerType2, "cardType");
        String str11 = str4;
        C19383o.m32797g(str11, "month");
        String str12 = str5;
        C19383o.m32797g(str12, "year");
        String str13 = str6;
        C19383o.m32797g(str13, "csc");
        C19383o.m32797g(str7, "zipCode");
        return new AddCardQueryParams(FundingOptionType.CREDIT_CARD, new Card(cardIssuerType2, str3, str13, str11, str12, (String) null, (String) null, (String) null, 224, (DefaultConstructorMarker) null), new AddCardUser(str9, str10, (String) null, (String) null, (String) null, (String) null, 60, (DefaultConstructorMarker) null), new BillingAddress((String) null, (String) null, (String) null, (String) null, (String) null, str7, str8, (String) null, (Boolean) null, 415, (DefaultConstructorMarker) null), (String) null, true);
    }

    public static final AddCardQueryParams createAddCardQueryParams(String str, String str2, Card card, String str3, String str4) {
        String str5 = str;
        C19383o.m32797g(str5, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        String str6 = str2;
        C19383o.m32797g(str6, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(card, ResponseConstants.CARD);
        C19383o.m32797g(str3, "zipCode");
        C19383o.m32797g(str4, "country");
        FundingOptionType fundingOptionType = FundingOptionType.CREDIT_CARD;
        AddCardUser addCardUser = new AddCardUser(str5, str6, (String) null, (String) null, (String) null, (String) null, 60, (DefaultConstructorMarker) null);
        return new AddCardQueryParams(fundingOptionType, card, addCardUser, new BillingAddress((String) null, (String) null, (String) null, (String) null, (String) null, str3, str4, (String) null, (Boolean) null, 415, (DefaultConstructorMarker) null), (String) null, true);
    }
}
