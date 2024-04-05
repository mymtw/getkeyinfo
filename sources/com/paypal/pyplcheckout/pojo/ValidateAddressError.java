package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class ValidateAddressError {
    @C18417a("data")
    private final List<ValidateAddressErrorField> data;
    @C18417a("message")
    private final String message;
    @C18417a("path")
    private final List<String> path;

    public ValidateAddressError() {
        this((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public ValidateAddressError(String str, List<String> list, List<ValidateAddressErrorField> list2) {
        this.message = str;
        this.path = list;
        this.data = list2;
    }

    public static /* synthetic */ ValidateAddressError copy$default(ValidateAddressError validateAddressError, String str, List<String> list, List<ValidateAddressErrorField> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateAddressError.message;
        }
        if ((i & 2) != 0) {
            list = validateAddressError.path;
        }
        if ((i & 4) != 0) {
            list2 = validateAddressError.data;
        }
        return validateAddressError.copy(str, list, list2);
    }

    public final String component1() {
        return this.message;
    }

    public final List<String> component2() {
        return this.path;
    }

    public final List<ValidateAddressErrorField> component3() {
        return this.data;
    }

    public final ValidateAddressError copy(String str, List<String> list, List<ValidateAddressErrorField> list2) {
        return new ValidateAddressError(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateAddressError)) {
            return false;
        }
        ValidateAddressError validateAddressError = (ValidateAddressError) obj;
        return C19383o.m32792b(this.message, validateAddressError.message) && C19383o.m32792b(this.path, validateAddressError.path) && C19383o.m32792b(this.data, validateAddressError.data);
    }

    public final List<ValidateAddressErrorField> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.path;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ValidateAddressErrorField> list2 = this.data;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.message;
        List<String> list = this.path;
        List<ValidateAddressErrorField> list2 = this.data;
        StringBuilder sb = new StringBuilder();
        sb.append("ValidateAddressError(message=");
        sb.append(str);
        sb.append(", path=");
        sb.append(list);
        sb.append(", data=");
        return C0326j.m865j(sb, list2, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateAddressError(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
