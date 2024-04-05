package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ErrorData {
    @C18417a("cause")
    private final String cause;
    @C18417a(alternate = {"errors"}, value = "fields")
    private final List<ErrorField> fields;
    @C18417a("name")
    private final String name;
    @C18417a("resolution")
    private final Resolution resolution;

    public ErrorData(String str, List<ErrorField> list, String str2, Resolution resolution2) {
        this.name = str;
        this.fields = list;
        this.cause = str2;
        this.resolution = resolution2;
    }

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, String str, List<ErrorField> list, String str2, Resolution resolution2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorData.name;
        }
        if ((i & 2) != 0) {
            list = errorData.fields;
        }
        if ((i & 4) != 0) {
            str2 = errorData.cause;
        }
        if ((i & 8) != 0) {
            resolution2 = errorData.resolution;
        }
        return errorData.copy(str, list, str2, resolution2);
    }

    public final String component1() {
        return this.name;
    }

    public final List<ErrorField> component2() {
        return this.fields;
    }

    public final String component3() {
        return this.cause;
    }

    public final Resolution component4() {
        return this.resolution;
    }

    public final ErrorData copy(String str, List<ErrorField> list, String str2, Resolution resolution2) {
        return new ErrorData(str, list, str2, resolution2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) obj;
        return C19383o.m32792b(this.name, errorData.name) && C19383o.m32792b(this.fields, errorData.fields) && C19383o.m32792b(this.cause, errorData.cause) && C19383o.m32792b(this.resolution, errorData.resolution);
    }

    public final String getCause() {
        return this.cause;
    }

    public final List<ErrorField> getFields() {
        return this.fields;
    }

    public final String getName() {
        return this.name;
    }

    public final Resolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ErrorField> list = this.fields;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.cause;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Resolution resolution2 = this.resolution;
        if (resolution2 != null) {
            i = resolution2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.name;
        List<ErrorField> list = this.fields;
        String str2 = this.cause;
        Resolution resolution2 = this.resolution;
        return "ErrorData(name=" + str + ", fields=" + list + ", cause=" + str2 + ", resolution=" + resolution2 + ")";
    }
}
