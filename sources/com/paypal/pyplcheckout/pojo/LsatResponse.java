package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class LsatResponse {
    @C18417a("data")
    private final LsatData data;
    @C18417a("errors")
    private final List<LsatError> errors;

    public LsatResponse(List<LsatError> list, LsatData lsatData) {
        this.errors = list;
        this.data = lsatData;
    }

    public static /* synthetic */ LsatResponse copy$default(LsatResponse lsatResponse, List<LsatError> list, LsatData lsatData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lsatResponse.errors;
        }
        if ((i & 2) != 0) {
            lsatData = lsatResponse.data;
        }
        return lsatResponse.copy(list, lsatData);
    }

    public final List<LsatError> component1() {
        return this.errors;
    }

    public final LsatData component2() {
        return this.data;
    }

    public final LsatResponse copy(List<LsatError> list, LsatData lsatData) {
        return new LsatResponse(list, lsatData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LsatResponse)) {
            return false;
        }
        LsatResponse lsatResponse = (LsatResponse) obj;
        return C19383o.m32792b(this.errors, lsatResponse.errors) && C19383o.m32792b(this.data, lsatResponse.data);
    }

    public final LsatData getData() {
        return this.data;
    }

    public final List<LsatError> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<LsatError> list = this.errors;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        LsatData lsatData = this.data;
        if (lsatData != null) {
            i = lsatData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<LsatError> list = this.errors;
        LsatData lsatData = this.data;
        return "LsatResponse(errors=" + list + ", data=" + lsatData + ")";
    }
}
