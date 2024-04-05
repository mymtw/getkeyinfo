package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class AddCardUpdateFundingOptions {
    @C18417a("creditPPCOffers")
    private final List<CreditPPCOffer> creditPPCOffers;
    @C18417a("fundingOptions")
    private final List<FundingOption> fundingOptions;
    @C18417a("paymentContingencies")
    private final PaymentContingencies paymentContingencies;

    public AddCardUpdateFundingOptions() {
        this((PaymentContingencies) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public AddCardUpdateFundingOptions(PaymentContingencies paymentContingencies2, List<CreditPPCOffer> list, List<FundingOption> list2) {
        this.paymentContingencies = paymentContingencies2;
        this.creditPPCOffers = list;
        this.fundingOptions = list2;
    }

    public static /* synthetic */ AddCardUpdateFundingOptions copy$default(AddCardUpdateFundingOptions addCardUpdateFundingOptions, PaymentContingencies paymentContingencies2, List<CreditPPCOffer> list, List<FundingOption> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentContingencies2 = addCardUpdateFundingOptions.paymentContingencies;
        }
        if ((i & 2) != 0) {
            list = addCardUpdateFundingOptions.creditPPCOffers;
        }
        if ((i & 4) != 0) {
            list2 = addCardUpdateFundingOptions.fundingOptions;
        }
        return addCardUpdateFundingOptions.copy(paymentContingencies2, list, list2);
    }

    public final PaymentContingencies component1() {
        return this.paymentContingencies;
    }

    public final List<CreditPPCOffer> component2() {
        return this.creditPPCOffers;
    }

    public final List<FundingOption> component3() {
        return this.fundingOptions;
    }

    public final AddCardUpdateFundingOptions copy(PaymentContingencies paymentContingencies2, List<CreditPPCOffer> list, List<FundingOption> list2) {
        return new AddCardUpdateFundingOptions(paymentContingencies2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardUpdateFundingOptions)) {
            return false;
        }
        AddCardUpdateFundingOptions addCardUpdateFundingOptions = (AddCardUpdateFundingOptions) obj;
        return C19383o.m32792b(this.paymentContingencies, addCardUpdateFundingOptions.paymentContingencies) && C19383o.m32792b(this.creditPPCOffers, addCardUpdateFundingOptions.creditPPCOffers) && C19383o.m32792b(this.fundingOptions, addCardUpdateFundingOptions.fundingOptions);
    }

    public final List<CreditPPCOffer> getCreditPPCOffers() {
        return this.creditPPCOffers;
    }

    public final List<FundingOption> getFundingOptions() {
        return this.fundingOptions;
    }

    public final PaymentContingencies getPaymentContingencies() {
        return this.paymentContingencies;
    }

    public int hashCode() {
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        int i = 0;
        int hashCode = (paymentContingencies2 == null ? 0 : paymentContingencies2.hashCode()) * 31;
        List<CreditPPCOffer> list = this.creditPPCOffers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FundingOption> list2 = this.fundingOptions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        List<CreditPPCOffer> list = this.creditPPCOffers;
        List<FundingOption> list2 = this.fundingOptions;
        StringBuilder sb = new StringBuilder();
        sb.append("AddCardUpdateFundingOptions(paymentContingencies=");
        sb.append(paymentContingencies2);
        sb.append(", creditPPCOffers=");
        sb.append(list);
        sb.append(", fundingOptions=");
        return C0326j.m865j(sb, list2, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddCardUpdateFundingOptions(PaymentContingencies paymentContingencies2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentContingencies2, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
