package com.paypal.pyplcheckout.addshipping.model;

import kotlin.jvm.internal.C19383o;

public final class AddressAutoCompletePlaceIdResponseData {
    private final AddressAutoCompletePlaceId addressFromAutoCompletePlaceId;

    public AddressAutoCompletePlaceIdResponseData(AddressAutoCompletePlaceId addressAutoCompletePlaceId) {
        this.addressFromAutoCompletePlaceId = addressAutoCompletePlaceId;
    }

    public static /* synthetic */ AddressAutoCompletePlaceIdResponseData copy$default(AddressAutoCompletePlaceIdResponseData addressAutoCompletePlaceIdResponseData, AddressAutoCompletePlaceId addressAutoCompletePlaceId, int i, Object obj) {
        if ((i & 1) != 0) {
            addressAutoCompletePlaceId = addressAutoCompletePlaceIdResponseData.addressFromAutoCompletePlaceId;
        }
        return addressAutoCompletePlaceIdResponseData.copy(addressAutoCompletePlaceId);
    }

    public final AddressAutoCompletePlaceId component1() {
        return this.addressFromAutoCompletePlaceId;
    }

    public final AddressAutoCompletePlaceIdResponseData copy(AddressAutoCompletePlaceId addressAutoCompletePlaceId) {
        return new AddressAutoCompletePlaceIdResponseData(addressAutoCompletePlaceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoCompletePlaceIdResponseData) && C19383o.m32792b(this.addressFromAutoCompletePlaceId, ((AddressAutoCompletePlaceIdResponseData) obj).addressFromAutoCompletePlaceId);
    }

    public final AddressAutoCompletePlaceId getAddressFromAutoCompletePlaceId() {
        return this.addressFromAutoCompletePlaceId;
    }

    public int hashCode() {
        AddressAutoCompletePlaceId addressAutoCompletePlaceId = this.addressFromAutoCompletePlaceId;
        if (addressAutoCompletePlaceId == null) {
            return 0;
        }
        return addressAutoCompletePlaceId.hashCode();
    }

    public String toString() {
        AddressAutoCompletePlaceId addressAutoCompletePlaceId = this.addressFromAutoCompletePlaceId;
        return "AddressAutoCompletePlaceIdResponseData(addressFromAutoCompletePlaceId=" + addressAutoCompletePlaceId + ")";
    }
}
