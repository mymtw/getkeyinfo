package com.paypal.pyplcheckout.addshipping.model;

import kotlin.jvm.internal.C19383o;

public final class AddressAutoCompleteResponse {
    private final AddressAutoCompleteResponseData data;

    public AddressAutoCompleteResponse(AddressAutoCompleteResponseData addressAutoCompleteResponseData) {
        C19383o.m32797g(addressAutoCompleteResponseData, "data");
        this.data = addressAutoCompleteResponseData;
    }

    public static /* synthetic */ AddressAutoCompleteResponse copy$default(AddressAutoCompleteResponse addressAutoCompleteResponse, AddressAutoCompleteResponseData addressAutoCompleteResponseData, int i, Object obj) {
        if ((i & 1) != 0) {
            addressAutoCompleteResponseData = addressAutoCompleteResponse.data;
        }
        return addressAutoCompleteResponse.copy(addressAutoCompleteResponseData);
    }

    public final AddressAutoCompleteResponseData component1() {
        return this.data;
    }

    public final AddressAutoCompleteResponse copy(AddressAutoCompleteResponseData addressAutoCompleteResponseData) {
        C19383o.m32797g(addressAutoCompleteResponseData, "data");
        return new AddressAutoCompleteResponse(addressAutoCompleteResponseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoCompleteResponse) && C19383o.m32792b(this.data, ((AddressAutoCompleteResponse) obj).data);
    }

    public final AddressAutoCompleteResponseData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        AddressAutoCompleteResponseData addressAutoCompleteResponseData = this.data;
        return "AddressAutoCompleteResponse(data=" + addressAutoCompleteResponseData + ")";
    }
}
