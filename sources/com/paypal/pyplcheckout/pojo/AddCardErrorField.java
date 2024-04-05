package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class AddCardErrorField {
    @C18417a("code")
    private final String code;
    @C18417a("field")
    private final String field;

    public AddCardErrorField(String str, String str2) {
        this.field = str;
        this.code = str2;
    }

    public static /* synthetic */ AddCardErrorField copy$default(AddCardErrorField addCardErrorField, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addCardErrorField.field;
        }
        if ((i & 2) != 0) {
            str2 = addCardErrorField.code;
        }
        return addCardErrorField.copy(str, str2);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.code;
    }

    public final AddCardErrorField copy(String str, String str2) {
        return new AddCardErrorField(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardErrorField)) {
            return false;
        }
        AddCardErrorField addCardErrorField = (AddCardErrorField) obj;
        return C19383o.m32792b(this.field, addCardErrorField.field) && C19383o.m32792b(this.code, addCardErrorField.code);
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
        return C0048b.m164c("AddCardErrorField(field=", this.field, ", code=", this.code, ")");
    }
}
