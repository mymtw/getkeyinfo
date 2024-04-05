package com.paypal.pyplcheckout.addshipping.model;

import kotlin.jvm.internal.C19383o;

public final class AddressAutoCompleteResponseData {
    private final AddressAutoComplete addressAutoComplete;

    public AddressAutoCompleteResponseData(AddressAutoComplete addressAutoComplete2) {
        C19383o.m32797g(addressAutoComplete2, "addressAutoComplete");
        this.addressAutoComplete = addressAutoComplete2;
    }

    public static /* synthetic */ AddressAutoCompleteResponseData copy$default(AddressAutoCompleteResponseData addressAutoCompleteResponseData, AddressAutoComplete addressAutoComplete2, int i, Object obj) {
        if ((i & 1) != 0) {
            addressAutoComplete2 = addressAutoCompleteResponseData.addressAutoComplete;
        }
        return addressAutoCompleteResponseData.copy(addressAutoComplete2);
    }

    public final AddressAutoComplete component1() {
        return this.addressAutoComplete;
    }

    public final AddressAutoCompleteResponseData copy(AddressAutoComplete addressAutoComplete2) {
        C19383o.m32797g(addressAutoComplete2, "addressAutoComplete");
        return new AddressAutoCompleteResponseData(addressAutoComplete2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoCompleteResponseData) && C19383o.m32792b(this.addressAutoComplete, ((AddressAutoCompleteResponseData) obj).addressAutoComplete);
    }

    public final AddressAutoComplete getAddressAutoComplete() {
        return this.addressAutoComplete;
    }

    public int hashCode() {
        return this.addressAutoComplete.hashCode();
    }

    public String toString() {
        AddressAutoComplete addressAutoComplete2 = this.addressAutoComplete;
        return "AddressAutoCompleteResponseData(addressAutoComplete=" + addressAutoComplete2 + ")";
    }
}
