package com.paypal.pyplcheckout.addshipping.model;

import kotlin.jvm.internal.C19383o;

public final class AddressAutoCompletePlaceIdResponse {
    private final AddressAutoCompletePlaceIdResponseData data;

    public AddressAutoCompletePlaceIdResponse(AddressAutoCompletePlaceIdResponseData addressAutoCompletePlaceIdResponseData) {
        C19383o.m32797g(addressAutoCompletePlaceIdResponseData, "data");
        this.data = addressAutoCompletePlaceIdResponseData;
    }

    public static /* synthetic */ AddressAutoCompletePlaceIdResponse copy$default(AddressAutoCompletePlaceIdResponse addressAutoCompletePlaceIdResponse, AddressAutoCompletePlaceIdResponseData addressAutoCompletePlaceIdResponseData, int i, Object obj) {
        if ((i & 1) != 0) {
            addressAutoCompletePlaceIdResponseData = addressAutoCompletePlaceIdResponse.data;
        }
        return addressAutoCompletePlaceIdResponse.copy(addressAutoCompletePlaceIdResponseData);
    }

    public final AddressAutoCompletePlaceIdResponseData component1() {
        return this.data;
    }

    public final AddressAutoCompletePlaceIdResponse copy(AddressAutoCompletePlaceIdResponseData addressAutoCompletePlaceIdResponseData) {
        C19383o.m32797g(addressAutoCompletePlaceIdResponseData, "data");
        return new AddressAutoCompletePlaceIdResponse(addressAutoCompletePlaceIdResponseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoCompletePlaceIdResponse) && C19383o.m32792b(this.data, ((AddressAutoCompletePlaceIdResponse) obj).data);
    }

    public final AddressAutoCompletePlaceIdResponseData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        AddressAutoCompletePlaceIdResponseData addressAutoCompletePlaceIdResponseData = this.data;
        return "AddressAutoCompletePlaceIdResponse(data=" + addressAutoCompletePlaceIdResponseData + ")";
    }
}
