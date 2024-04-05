package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddShippingAddressResponse {
    @C18417a("data")
    private final EmbeddedCheckoutSession data;
    @C18417a("errors")
    private final List<Error> errors;

    public AddShippingAddressResponse(EmbeddedCheckoutSession embeddedCheckoutSession, List<Error> list) {
        this.data = embeddedCheckoutSession;
        this.errors = list;
    }

    public static /* synthetic */ AddShippingAddressResponse copy$default(AddShippingAddressResponse addShippingAddressResponse, EmbeddedCheckoutSession embeddedCheckoutSession, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            embeddedCheckoutSession = addShippingAddressResponse.data;
        }
        if ((i & 2) != 0) {
            list = addShippingAddressResponse.errors;
        }
        return addShippingAddressResponse.copy(embeddedCheckoutSession, list);
    }

    public final EmbeddedCheckoutSession component1() {
        return this.data;
    }

    public final List<Error> component2() {
        return this.errors;
    }

    public final AddShippingAddressResponse copy(EmbeddedCheckoutSession embeddedCheckoutSession, List<Error> list) {
        return new AddShippingAddressResponse(embeddedCheckoutSession, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddShippingAddressResponse)) {
            return false;
        }
        AddShippingAddressResponse addShippingAddressResponse = (AddShippingAddressResponse) obj;
        return C19383o.m32792b(this.data, addShippingAddressResponse.data) && C19383o.m32792b(this.errors, addShippingAddressResponse.errors);
    }

    public final EmbeddedCheckoutSession getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        EmbeddedCheckoutSession embeddedCheckoutSession = this.data;
        int i = 0;
        int hashCode = (embeddedCheckoutSession == null ? 0 : embeddedCheckoutSession.hashCode()) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        EmbeddedCheckoutSession embeddedCheckoutSession = this.data;
        List<Error> list = this.errors;
        return "AddShippingAddressResponse(data=" + embeddedCheckoutSession + ", errors=" + list + ")";
    }
}
