package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSResolveContingencyResponse {
    @C18417a("data")
    private final ThreeDSResolveContingencyData data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public ThreeDSResolveContingencyResponse(ThreeDSResolveContingencyData threeDSResolveContingencyData, Extensions extensions2, List<Error> list) {
        this.data = threeDSResolveContingencyData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ ThreeDSResolveContingencyResponse copy$default(ThreeDSResolveContingencyResponse threeDSResolveContingencyResponse, ThreeDSResolveContingencyData threeDSResolveContingencyData, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSResolveContingencyData = threeDSResolveContingencyResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = threeDSResolveContingencyResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = threeDSResolveContingencyResponse.errors;
        }
        return threeDSResolveContingencyResponse.copy(threeDSResolveContingencyData, extensions2, list);
    }

    public final ThreeDSResolveContingencyData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final ThreeDSResolveContingencyResponse copy(ThreeDSResolveContingencyData threeDSResolveContingencyData, Extensions extensions2, List<Error> list) {
        return new ThreeDSResolveContingencyResponse(threeDSResolveContingencyData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSResolveContingencyResponse)) {
            return false;
        }
        ThreeDSResolveContingencyResponse threeDSResolveContingencyResponse = (ThreeDSResolveContingencyResponse) obj;
        return C19383o.m32792b(this.data, threeDSResolveContingencyResponse.data) && C19383o.m32792b(this.extensions, threeDSResolveContingencyResponse.extensions) && C19383o.m32792b(this.errors, threeDSResolveContingencyResponse.errors);
    }

    public final ThreeDSResolveContingencyData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        ThreeDSResolveContingencyData threeDSResolveContingencyData = this.data;
        int i = 0;
        int hashCode = (threeDSResolveContingencyData == null ? 0 : threeDSResolveContingencyData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        ThreeDSResolveContingencyData threeDSResolveContingencyData = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("ThreeDSResolveContingencyResponse(data=");
        sb.append(threeDSResolveContingencyData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}
