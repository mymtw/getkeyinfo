package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class PaymentContingencies {
    @C18417a("confirmCreditCardCvvData")
    private final ConfirmCreditCardCvvData confirmCreditCardCvvData;
    @C18417a("needConsentForBankAccountInfoRetrieval")
    private final NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval;
    @C18417a("needRealTimeBalanceForBankAccount")
    private final NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount;
    @C18417a("sepaMandateAcceptanceNeeded")
    private final SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded;
    @C18417a("strongCustomerAuthenticationRequired")
    private final StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequired;
    @C18417a("threeDSContingencyData")
    private ThreeDSContingencyData threeDSContingencyData;
    @C18417a("threeDomainSecure")
    private final ThreeDomainSecure threeDomainSecure;

    public PaymentContingencies(ThreeDomainSecure threeDomainSecure2, ThreeDSContingencyData threeDSContingencyData2, ConfirmCreditCardCvvData confirmCreditCardCvvData2, SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded2, NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval2, NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount2, StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency) {
        this.threeDomainSecure = threeDomainSecure2;
        this.threeDSContingencyData = threeDSContingencyData2;
        this.confirmCreditCardCvvData = confirmCreditCardCvvData2;
        this.sepaMandateAcceptanceNeeded = sepaMandateAcceptanceNeeded2;
        this.needConsentForBankAccountInfoRetrieval = needConsentForBankAccountInfoRetrieval2;
        this.needRealTimeBalanceForBankAccount = needRealTimeBalanceForBankAccount2;
        this.strongCustomerAuthenticationRequired = strongCustomerAuthenticationRequiredContingency;
    }

    public static /* synthetic */ PaymentContingencies copy$default(PaymentContingencies paymentContingencies, ThreeDomainSecure threeDomainSecure2, ThreeDSContingencyData threeDSContingencyData2, ConfirmCreditCardCvvData confirmCreditCardCvvData2, SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded2, NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval2, NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount2, StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDomainSecure2 = paymentContingencies.threeDomainSecure;
        }
        if ((i & 2) != 0) {
            threeDSContingencyData2 = paymentContingencies.threeDSContingencyData;
        }
        ThreeDSContingencyData threeDSContingencyData3 = threeDSContingencyData2;
        if ((i & 4) != 0) {
            confirmCreditCardCvvData2 = paymentContingencies.confirmCreditCardCvvData;
        }
        ConfirmCreditCardCvvData confirmCreditCardCvvData3 = confirmCreditCardCvvData2;
        if ((i & 8) != 0) {
            sepaMandateAcceptanceNeeded2 = paymentContingencies.sepaMandateAcceptanceNeeded;
        }
        SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded3 = sepaMandateAcceptanceNeeded2;
        if ((i & 16) != 0) {
            needConsentForBankAccountInfoRetrieval2 = paymentContingencies.needConsentForBankAccountInfoRetrieval;
        }
        NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval3 = needConsentForBankAccountInfoRetrieval2;
        if ((i & 32) != 0) {
            needRealTimeBalanceForBankAccount2 = paymentContingencies.needRealTimeBalanceForBankAccount;
        }
        NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount3 = needRealTimeBalanceForBankAccount2;
        if ((i & 64) != 0) {
            strongCustomerAuthenticationRequiredContingency = paymentContingencies.strongCustomerAuthenticationRequired;
        }
        return paymentContingencies.copy(threeDomainSecure2, threeDSContingencyData3, confirmCreditCardCvvData3, sepaMandateAcceptanceNeeded3, needConsentForBankAccountInfoRetrieval3, needRealTimeBalanceForBankAccount3, strongCustomerAuthenticationRequiredContingency);
    }

    public final ThreeDomainSecure component1() {
        return this.threeDomainSecure;
    }

    public final ThreeDSContingencyData component2() {
        return this.threeDSContingencyData;
    }

    public final ConfirmCreditCardCvvData component3() {
        return this.confirmCreditCardCvvData;
    }

    public final SepaMandateAcceptanceNeeded component4() {
        return this.sepaMandateAcceptanceNeeded;
    }

    public final NeedConsentForBankAccountInfoRetrieval component5() {
        return this.needConsentForBankAccountInfoRetrieval;
    }

    public final NeedRealTimeBalanceForBankAccount component6() {
        return this.needRealTimeBalanceForBankAccount;
    }

    public final StrongCustomerAuthenticationRequiredContingency component7() {
        return this.strongCustomerAuthenticationRequired;
    }

    public final PaymentContingencies copy(ThreeDomainSecure threeDomainSecure2, ThreeDSContingencyData threeDSContingencyData2, ConfirmCreditCardCvvData confirmCreditCardCvvData2, SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded2, NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval2, NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount2, StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency) {
        return new PaymentContingencies(threeDomainSecure2, threeDSContingencyData2, confirmCreditCardCvvData2, sepaMandateAcceptanceNeeded2, needConsentForBankAccountInfoRetrieval2, needRealTimeBalanceForBankAccount2, strongCustomerAuthenticationRequiredContingency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentContingencies)) {
            return false;
        }
        PaymentContingencies paymentContingencies = (PaymentContingencies) obj;
        return C19383o.m32792b(this.threeDomainSecure, paymentContingencies.threeDomainSecure) && C19383o.m32792b(this.threeDSContingencyData, paymentContingencies.threeDSContingencyData) && C19383o.m32792b(this.confirmCreditCardCvvData, paymentContingencies.confirmCreditCardCvvData) && C19383o.m32792b(this.sepaMandateAcceptanceNeeded, paymentContingencies.sepaMandateAcceptanceNeeded) && C19383o.m32792b(this.needConsentForBankAccountInfoRetrieval, paymentContingencies.needConsentForBankAccountInfoRetrieval) && C19383o.m32792b(this.needRealTimeBalanceForBankAccount, paymentContingencies.needRealTimeBalanceForBankAccount) && C19383o.m32792b(this.strongCustomerAuthenticationRequired, paymentContingencies.strongCustomerAuthenticationRequired);
    }

    public final ConfirmCreditCardCvvData getConfirmCreditCardCvvData() {
        return this.confirmCreditCardCvvData;
    }

    public final NeedConsentForBankAccountInfoRetrieval getNeedConsentForBankAccountInfoRetrieval() {
        return this.needConsentForBankAccountInfoRetrieval;
    }

    public final NeedRealTimeBalanceForBankAccount getNeedRealTimeBalanceForBankAccount() {
        return this.needRealTimeBalanceForBankAccount;
    }

    public final SepaMandateAcceptanceNeeded getSepaMandateAcceptanceNeeded() {
        return this.sepaMandateAcceptanceNeeded;
    }

    public final StrongCustomerAuthenticationRequiredContingency getStrongCustomerAuthenticationRequired() {
        return this.strongCustomerAuthenticationRequired;
    }

    public final ThreeDSContingencyData getThreeDSContingencyData() {
        return this.threeDSContingencyData;
    }

    public final ThreeDomainSecure getThreeDomainSecure() {
        return this.threeDomainSecure;
    }

    public int hashCode() {
        ThreeDomainSecure threeDomainSecure2 = this.threeDomainSecure;
        int i = 0;
        int hashCode = (threeDomainSecure2 == null ? 0 : threeDomainSecure2.hashCode()) * 31;
        ThreeDSContingencyData threeDSContingencyData2 = this.threeDSContingencyData;
        int hashCode2 = (hashCode + (threeDSContingencyData2 == null ? 0 : threeDSContingencyData2.hashCode())) * 31;
        ConfirmCreditCardCvvData confirmCreditCardCvvData2 = this.confirmCreditCardCvvData;
        int hashCode3 = (hashCode2 + (confirmCreditCardCvvData2 == null ? 0 : confirmCreditCardCvvData2.hashCode())) * 31;
        SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded2 = this.sepaMandateAcceptanceNeeded;
        int hashCode4 = (hashCode3 + (sepaMandateAcceptanceNeeded2 == null ? 0 : sepaMandateAcceptanceNeeded2.hashCode())) * 31;
        NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval2 = this.needConsentForBankAccountInfoRetrieval;
        int hashCode5 = (hashCode4 + (needConsentForBankAccountInfoRetrieval2 == null ? 0 : needConsentForBankAccountInfoRetrieval2.hashCode())) * 31;
        NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount2 = this.needRealTimeBalanceForBankAccount;
        int hashCode6 = (hashCode5 + (needRealTimeBalanceForBankAccount2 == null ? 0 : needRealTimeBalanceForBankAccount2.hashCode())) * 31;
        StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency = this.strongCustomerAuthenticationRequired;
        if (strongCustomerAuthenticationRequiredContingency != null) {
            i = strongCustomerAuthenticationRequiredContingency.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setThreeDSContingencyData(ThreeDSContingencyData threeDSContingencyData2) {
        this.threeDSContingencyData = threeDSContingencyData2;
    }

    public String toString() {
        ThreeDomainSecure threeDomainSecure2 = this.threeDomainSecure;
        ThreeDSContingencyData threeDSContingencyData2 = this.threeDSContingencyData;
        ConfirmCreditCardCvvData confirmCreditCardCvvData2 = this.confirmCreditCardCvvData;
        SepaMandateAcceptanceNeeded sepaMandateAcceptanceNeeded2 = this.sepaMandateAcceptanceNeeded;
        NeedConsentForBankAccountInfoRetrieval needConsentForBankAccountInfoRetrieval2 = this.needConsentForBankAccountInfoRetrieval;
        NeedRealTimeBalanceForBankAccount needRealTimeBalanceForBankAccount2 = this.needRealTimeBalanceForBankAccount;
        StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency = this.strongCustomerAuthenticationRequired;
        return "PaymentContingencies(threeDomainSecure=" + threeDomainSecure2 + ", threeDSContingencyData=" + threeDSContingencyData2 + ", confirmCreditCardCvvData=" + confirmCreditCardCvvData2 + ", sepaMandateAcceptanceNeeded=" + sepaMandateAcceptanceNeeded2 + ", needConsentForBankAccountInfoRetrieval=" + needConsentForBankAccountInfoRetrieval2 + ", needRealTimeBalanceForBankAccount=" + needRealTimeBalanceForBankAccount2 + ", strongCustomerAuthenticationRequired=" + strongCustomerAuthenticationRequiredContingency + ")";
    }
}
