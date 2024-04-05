package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class AddCardErrorData {
    @C18417a("fundingInstrumentId")
    private final String fundingInstrumentId;

    public AddCardErrorData(String str) {
        this.fundingInstrumentId = str;
    }

    public static /* synthetic */ AddCardErrorData copy$default(AddCardErrorData addCardErrorData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addCardErrorData.fundingInstrumentId;
        }
        return addCardErrorData.copy(str);
    }

    public final String component1() {
        return this.fundingInstrumentId;
    }

    public final AddCardErrorData copy(String str) {
        return new AddCardErrorData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCardErrorData) && C19383o.m32792b(this.fundingInstrumentId, ((AddCardErrorData) obj).fundingInstrumentId);
    }

    public final String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }

    public int hashCode() {
        String str = this.fundingInstrumentId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("AddCardErrorData(fundingInstrumentId=", this.fundingInstrumentId, ")");
    }
}
