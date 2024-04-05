package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSLookUpResponse {
    @C18417a("data")
    private final ThreeDSLookUpResponseData data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public ThreeDSLookUpResponse(ThreeDSLookUpResponseData threeDSLookUpResponseData, Extensions extensions2, List<Error> list) {
        this.data = threeDSLookUpResponseData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ ThreeDSLookUpResponse copy$default(ThreeDSLookUpResponse threeDSLookUpResponse, ThreeDSLookUpResponseData threeDSLookUpResponseData, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSLookUpResponseData = threeDSLookUpResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = threeDSLookUpResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = threeDSLookUpResponse.errors;
        }
        return threeDSLookUpResponse.copy(threeDSLookUpResponseData, extensions2, list);
    }

    public final ThreeDSLookUpResponseData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final ThreeDSLookUpResponse copy(ThreeDSLookUpResponseData threeDSLookUpResponseData, Extensions extensions2, List<Error> list) {
        return new ThreeDSLookUpResponse(threeDSLookUpResponseData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSLookUpResponse)) {
            return false;
        }
        ThreeDSLookUpResponse threeDSLookUpResponse = (ThreeDSLookUpResponse) obj;
        return C19383o.m32792b(this.data, threeDSLookUpResponse.data) && C19383o.m32792b(this.extensions, threeDSLookUpResponse.extensions) && C19383o.m32792b(this.errors, threeDSLookUpResponse.errors);
    }

    public final ThreeDSLookUpResponseData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        ThreeDSLookUpResponseData threeDSLookUpResponseData = this.data;
        int i = 0;
        int hashCode = (threeDSLookUpResponseData == null ? 0 : threeDSLookUpResponseData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        ThreeDSLookUpResponseData threeDSLookUpResponseData = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("ThreeDSLookUpResponse(data=");
        sb.append(threeDSLookUpResponseData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}
