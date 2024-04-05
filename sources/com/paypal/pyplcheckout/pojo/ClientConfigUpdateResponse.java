package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ClientConfigUpdateResponse {
    @C18417a("extensions")
    private final Extensions extensions;

    public ClientConfigUpdateResponse(Extensions extensions2) {
        this.extensions = extensions2;
    }

    public static /* synthetic */ ClientConfigUpdateResponse copy$default(ClientConfigUpdateResponse clientConfigUpdateResponse, Extensions extensions2, int i, Object obj) {
        if ((i & 1) != 0) {
            extensions2 = clientConfigUpdateResponse.extensions;
        }
        return clientConfigUpdateResponse.copy(extensions2);
    }

    public final Extensions component1() {
        return this.extensions;
    }

    public final ClientConfigUpdateResponse copy(Extensions extensions2) {
        return new ClientConfigUpdateResponse(extensions2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientConfigUpdateResponse) && C19383o.m32792b(this.extensions, ((ClientConfigUpdateResponse) obj).extensions);
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        Extensions extensions2 = this.extensions;
        if (extensions2 == null) {
            return 0;
        }
        return extensions2.hashCode();
    }

    public String toString() {
        Extensions extensions2 = this.extensions;
        return "ClientConfigUpdateResponse(extensions=" + extensions2 + ")";
    }
}
