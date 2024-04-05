package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddCardUpdateFundingOptionsData {
    @C18417a("updateCheckoutSessionFundingOptions")
    private final AddCardUpdateFundingOptions updateCheckoutSessionFundingOptions;

    public AddCardUpdateFundingOptionsData(AddCardUpdateFundingOptions addCardUpdateFundingOptions) {
        this.updateCheckoutSessionFundingOptions = addCardUpdateFundingOptions;
    }

    public static /* synthetic */ AddCardUpdateFundingOptionsData copy$default(AddCardUpdateFundingOptionsData addCardUpdateFundingOptionsData, AddCardUpdateFundingOptions addCardUpdateFundingOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            addCardUpdateFundingOptions = addCardUpdateFundingOptionsData.updateCheckoutSessionFundingOptions;
        }
        return addCardUpdateFundingOptionsData.copy(addCardUpdateFundingOptions);
    }

    public final AddCardUpdateFundingOptions component1() {
        return this.updateCheckoutSessionFundingOptions;
    }

    public final AddCardUpdateFundingOptionsData copy(AddCardUpdateFundingOptions addCardUpdateFundingOptions) {
        return new AddCardUpdateFundingOptionsData(addCardUpdateFundingOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCardUpdateFundingOptionsData) && C19383o.m32792b(this.updateCheckoutSessionFundingOptions, ((AddCardUpdateFundingOptionsData) obj).updateCheckoutSessionFundingOptions);
    }

    public final AddCardUpdateFundingOptions getUpdateCheckoutSessionFundingOptions() {
        return this.updateCheckoutSessionFundingOptions;
    }

    public int hashCode() {
        AddCardUpdateFundingOptions addCardUpdateFundingOptions = this.updateCheckoutSessionFundingOptions;
        if (addCardUpdateFundingOptions == null) {
            return 0;
        }
        return addCardUpdateFundingOptions.hashCode();
    }

    public String toString() {
        AddCardUpdateFundingOptions addCardUpdateFundingOptions = this.updateCheckoutSessionFundingOptions;
        return "AddCardUpdateFundingOptionsData(updateCheckoutSessionFundingOptions=" + addCardUpdateFundingOptions + ")";
    }
}
