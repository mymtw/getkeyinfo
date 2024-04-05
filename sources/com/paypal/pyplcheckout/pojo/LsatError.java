package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class LsatError {
    @C18417a("message")
    private final String message;
    @C18417a("path")
    private final List<String> path;
    @C18417a("statusCode")
    private final Integer statusCode;

    public LsatError(String str, List<String> list, Integer num) {
        this.message = str;
        this.path = list;
        this.statusCode = num;
    }

    public static /* synthetic */ LsatError copy$default(LsatError lsatError, String str, List<String> list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lsatError.message;
        }
        if ((i & 2) != 0) {
            list = lsatError.path;
        }
        if ((i & 4) != 0) {
            num = lsatError.statusCode;
        }
        return lsatError.copy(str, list, num);
    }

    public final String component1() {
        return this.message;
    }

    public final List<String> component2() {
        return this.path;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final LsatError copy(String str, List<String> list, Integer num) {
        return new LsatError(str, list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LsatError)) {
            return false;
        }
        LsatError lsatError = (LsatError) obj;
        return C19383o.m32792b(this.message, lsatError.message) && C19383o.m32792b(this.path, lsatError.path) && C19383o.m32792b(this.statusCode, lsatError.statusCode);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPath() {
        return this.path;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.path;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.message;
        List<String> list = this.path;
        Integer num = this.statusCode;
        return "LsatError(message=" + str + ", path=" + list + ", statusCode=" + num + ")";
    }
}
