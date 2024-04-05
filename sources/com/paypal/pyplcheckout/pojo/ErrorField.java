package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ErrorField {
    @C18417a("code")
    private final String code;
    @C18417a("field")
    private final String field;
    @C18417a("issue")
    private final String issue;

    public ErrorField(String str, String str2, String str3) {
        this.field = str;
        this.code = str2;
        this.issue = str3;
    }

    public static /* synthetic */ ErrorField copy$default(ErrorField errorField, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorField.field;
        }
        if ((i & 2) != 0) {
            str2 = errorField.code;
        }
        if ((i & 4) != 0) {
            str3 = errorField.issue;
        }
        return errorField.copy(str, str2, str3);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.issue;
    }

    public final ErrorField copy(String str, String str2, String str3) {
        return new ErrorField(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorField)) {
            return false;
        }
        ErrorField errorField = (ErrorField) obj;
        return C19383o.m32792b(this.field, errorField.field) && C19383o.m32792b(this.code, errorField.code) && C19383o.m32792b(this.issue, errorField.issue);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getField() {
        return this.field;
    }

    public final String getIssue() {
        return this.issue;
    }

    public int hashCode() {
        String str = this.field;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issue;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.field;
        String str2 = this.code;
        return C0023f.m110k(C0388a.m1050f("ErrorField(field=", str, ", code=", str2, ", issue="), this.issue, ")");
    }
}
