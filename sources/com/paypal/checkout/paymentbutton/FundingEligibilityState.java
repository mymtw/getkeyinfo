package com.paypal.checkout.paymentbutton;

import com.paypal.checkout.fundingeligibility.FundingEligibilityItem;
import com.paypal.pyplcheckout.pojo.Error;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class FundingEligibilityState {
    private final List<Error> error;
    private final Map<PaymentFundingType, FundingEligibilityItem> paymentsButtonMap;

    public FundingEligibilityState(Map<PaymentFundingType, FundingEligibilityItem> map, List<Error> list) {
        this.paymentsButtonMap = map;
        this.error = list;
    }

    public static /* synthetic */ FundingEligibilityState copy$default(FundingEligibilityState fundingEligibilityState, Map<PaymentFundingType, FundingEligibilityItem> map, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fundingEligibilityState.paymentsButtonMap;
        }
        if ((i & 2) != 0) {
            list = fundingEligibilityState.error;
        }
        return fundingEligibilityState.copy(map, list);
    }

    public final Map<PaymentFundingType, FundingEligibilityItem> component1() {
        return this.paymentsButtonMap;
    }

    public final List<Error> component2() {
        return this.error;
    }

    public final FundingEligibilityState copy(Map<PaymentFundingType, FundingEligibilityItem> map, List<Error> list) {
        return new FundingEligibilityState(map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingEligibilityState)) {
            return false;
        }
        FundingEligibilityState fundingEligibilityState = (FundingEligibilityState) obj;
        return C19383o.m32792b(this.paymentsButtonMap, fundingEligibilityState.paymentsButtonMap) && C19383o.m32792b(this.error, fundingEligibilityState.error);
    }

    public final List<Error> getError() {
        return this.error;
    }

    public final Map<PaymentFundingType, FundingEligibilityItem> getPaymentsButtonMap() {
        return this.paymentsButtonMap;
    }

    public int hashCode() {
        Map<PaymentFundingType, FundingEligibilityItem> map = this.paymentsButtonMap;
        int i = 0;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<Error> list = this.error;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Map<PaymentFundingType, FundingEligibilityItem> map = this.paymentsButtonMap;
        List<Error> list = this.error;
        return "FundingEligibilityState(paymentsButtonMap=" + map + ", error=" + list + ")";
    }
}
