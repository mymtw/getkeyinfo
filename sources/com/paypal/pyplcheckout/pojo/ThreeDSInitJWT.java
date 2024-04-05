package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSInitJWT {
    @C18417a("data")
    private final ThreeDSJwt data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public ThreeDSInitJWT(ThreeDSJwt threeDSJwt, Extensions extensions2, List<Error> list) {
        this.data = threeDSJwt;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ ThreeDSInitJWT copy$default(ThreeDSInitJWT threeDSInitJWT, ThreeDSJwt threeDSJwt, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSJwt = threeDSInitJWT.data;
        }
        if ((i & 2) != 0) {
            extensions2 = threeDSInitJWT.extensions;
        }
        if ((i & 4) != 0) {
            list = threeDSInitJWT.errors;
        }
        return threeDSInitJWT.copy(threeDSJwt, extensions2, list);
    }

    public final ThreeDSJwt component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final ThreeDSInitJWT copy(ThreeDSJwt threeDSJwt, Extensions extensions2, List<Error> list) {
        return new ThreeDSInitJWT(threeDSJwt, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSInitJWT)) {
            return false;
        }
        ThreeDSInitJWT threeDSInitJWT = (ThreeDSInitJWT) obj;
        return C19383o.m32792b(this.data, threeDSInitJWT.data) && C19383o.m32792b(this.extensions, threeDSInitJWT.extensions) && C19383o.m32792b(this.errors, threeDSInitJWT.errors);
    }

    public final ThreeDSJwt getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        ThreeDSJwt threeDSJwt = this.data;
        int i = 0;
        int hashCode = (threeDSJwt == null ? 0 : threeDSJwt.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        ThreeDSJwt threeDSJwt = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("ThreeDSInitJWT(data=");
        sb.append(threeDSJwt);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}
