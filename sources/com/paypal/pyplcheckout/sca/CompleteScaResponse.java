package com.paypal.pyplcheckout.sca;

import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.Error;
import com.paypal.pyplcheckout.pojo.PaymentContingencies;
import com.paypal.pyplcheckout.pojo.StrongCustomerAuthenticationRequiredContingency;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class CompleteScaResponse {
    private final CompleteScaData data;
    private final List<Error> errors;

    public CompleteScaResponse(CompleteScaData completeScaData, List<Error> list) {
        this.data = completeScaData;
        this.errors = list;
    }

    public static /* synthetic */ CompleteScaResponse copy$default(CompleteScaResponse completeScaResponse, CompleteScaData completeScaData, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            completeScaData = completeScaResponse.data;
        }
        if ((i & 2) != 0) {
            list = completeScaResponse.errors;
        }
        return completeScaResponse.copy(completeScaData, list);
    }

    public final CompleteScaData component1() {
        return this.data;
    }

    public final List<Error> component2() {
        return this.errors;
    }

    public final CompleteScaResponse copy(CompleteScaData completeScaData, List<Error> list) {
        return new CompleteScaResponse(completeScaData, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteScaResponse)) {
            return false;
        }
        CompleteScaResponse completeScaResponse = (CompleteScaResponse) obj;
        return C19383o.m32792b(this.data, completeScaResponse.data) && C19383o.m32792b(this.errors, completeScaResponse.errors);
    }

    public final CompleteScaData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        CompleteScaData completeScaData = this.data;
        int i = 0;
        int hashCode = (completeScaData == null ? 0 : completeScaData.hashCode()) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isContingencyCleared() {
        CheckoutSession completeStrongCustomerAuthentication;
        PaymentContingencies paymentContingencies;
        StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequired;
        CompleteScaData completeScaData = this.data;
        String str = null;
        if (!(completeScaData == null || (completeStrongCustomerAuthentication = completeScaData.getCompleteStrongCustomerAuthentication()) == null || (paymentContingencies = completeStrongCustomerAuthentication.getPaymentContingencies()) == null || (strongCustomerAuthenticationRequired = paymentContingencies.getStrongCustomerAuthenticationRequired()) == null)) {
            str = strongCustomerAuthenticationRequired.getContextId();
        }
        return str == null;
    }

    public String toString() {
        CompleteScaData completeScaData = this.data;
        List<Error> list = this.errors;
        return "CompleteScaResponse(data=" + completeScaData + ", errors=" + list + ")";
    }
}
