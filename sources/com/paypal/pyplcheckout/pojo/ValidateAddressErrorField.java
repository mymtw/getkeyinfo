package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class ValidateAddressErrorField {
    @C18417a("code")
    private final String code;
    @C18417a("field")
    private final String field;

    public ValidateAddressErrorField(String str, String str2) {
        this.field = str;
        this.code = str2;
    }

    public static /* synthetic */ ValidateAddressErrorField copy$default(ValidateAddressErrorField validateAddressErrorField, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateAddressErrorField.field;
        }
        if ((i & 2) != 0) {
            str2 = validateAddressErrorField.code;
        }
        return validateAddressErrorField.copy(str, str2);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.code;
    }

    public final ValidateAddressErrorField copy(String str, String str2) {
        return new ValidateAddressErrorField(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateAddressErrorField)) {
            return false;
        }
        ValidateAddressErrorField validateAddressErrorField = (ValidateAddressErrorField) obj;
        return C19383o.m32792b(this.field, validateAddressErrorField.field) && C19383o.m32792b(this.code, validateAddressErrorField.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getField() {
        return this.field;
    }

    public int hashCode() {
        String str = this.field;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("ValidateAddressErrorField(field=", this.field, ", code=", this.code, ")");
    }
}
