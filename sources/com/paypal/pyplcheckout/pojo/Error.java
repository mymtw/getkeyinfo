package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Error {
    @C18417a("contingency")
    private final Boolean contingency;
    @C18417a("data")
    private final ErrorData data;
    @C18417a("message")
    private final String message;
    @C18417a("path")
    private final List<String> path;
    @C18417a("statusCode")
    private final Integer statusCode;

    public Error() {
        this((String) null, (List) null, (Integer) null, (Boolean) null, (ErrorData) null, 31, (DefaultConstructorMarker) null);
    }

    public Error(String str, List<String> list, Integer num, Boolean bool, ErrorData errorData) {
        this.message = str;
        this.path = list;
        this.statusCode = num;
        this.contingency = bool;
        this.data = errorData;
    }

    public static /* synthetic */ Error copy$default(Error error, String str, List<String> list, Integer num, Boolean bool, ErrorData errorData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = error.message;
        }
        if ((i & 2) != 0) {
            list = error.path;
        }
        List<String> list2 = list;
        if ((i & 4) != 0) {
            num = error.statusCode;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            bool = error.contingency;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            errorData = error.data;
        }
        return error.copy(str, list2, num2, bool2, errorData);
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

    public final Boolean component4() {
        return this.contingency;
    }

    public final ErrorData component5() {
        return this.data;
    }

    public final Error copy(String str, List<String> list, Integer num, Boolean bool, ErrorData errorData) {
        return new Error(str, list, num, bool, errorData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return C19383o.m32792b(this.message, error.message) && C19383o.m32792b(this.path, error.path) && C19383o.m32792b(this.statusCode, error.statusCode) && C19383o.m32792b(this.contingency, error.contingency) && C19383o.m32792b(this.data, error.data);
    }

    public final Boolean getContingency() {
        return this.contingency;
    }

    public final ErrorData getData() {
        return this.data;
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
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.contingency;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ErrorData errorData = this.data;
        if (errorData != null) {
            i = errorData.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.message;
        List<String> list = this.path;
        Integer num = this.statusCode;
        Boolean bool = this.contingency;
        ErrorData errorData = this.data;
        return "Error(message=" + str + ", path=" + list + ", statusCode=" + num + ", contingency=" + bool + ", data=" + errorData + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Error(java.lang.String r5, java.util.List r6, java.lang.Integer r7, java.lang.Boolean r8, com.paypal.pyplcheckout.pojo.ErrorData r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Error.<init>(java.lang.String, java.util.List, java.lang.Integer, java.lang.Boolean, com.paypal.pyplcheckout.pojo.ErrorData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
