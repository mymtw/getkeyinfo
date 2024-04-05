package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSAuthenticateResponse {
    @C18417a("data")
    private final ThreeDSAuthenticateData data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public ThreeDSAuthenticateResponse(ThreeDSAuthenticateData threeDSAuthenticateData, Extensions extensions2, List<Error> list) {
        this.data = threeDSAuthenticateData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ ThreeDSAuthenticateResponse copy$default(ThreeDSAuthenticateResponse threeDSAuthenticateResponse, ThreeDSAuthenticateData threeDSAuthenticateData, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSAuthenticateData = threeDSAuthenticateResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = threeDSAuthenticateResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = threeDSAuthenticateResponse.errors;
        }
        return threeDSAuthenticateResponse.copy(threeDSAuthenticateData, extensions2, list);
    }

    public final ThreeDSAuthenticateData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final ThreeDSAuthenticateResponse copy(ThreeDSAuthenticateData threeDSAuthenticateData, Extensions extensions2, List<Error> list) {
        return new ThreeDSAuthenticateResponse(threeDSAuthenticateData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSAuthenticateResponse)) {
            return false;
        }
        ThreeDSAuthenticateResponse threeDSAuthenticateResponse = (ThreeDSAuthenticateResponse) obj;
        return C19383o.m32792b(this.data, threeDSAuthenticateResponse.data) && C19383o.m32792b(this.extensions, threeDSAuthenticateResponse.extensions) && C19383o.m32792b(this.errors, threeDSAuthenticateResponse.errors);
    }

    public final ThreeDSAuthenticateData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        ThreeDSAuthenticateData threeDSAuthenticateData = this.data;
        int i = 0;
        int hashCode = (threeDSAuthenticateData == null ? 0 : threeDSAuthenticateData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        ThreeDSAuthenticateData threeDSAuthenticateData = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("ThreeDSAuthenticateResponse(data=");
        sb.append(threeDSAuthenticateData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}
