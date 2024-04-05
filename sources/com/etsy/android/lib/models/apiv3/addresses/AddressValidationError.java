package com.etsy.android.lib.models.apiv3.addresses;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AddressValidationError {
    public static final int $stable = 0;
    private final String errorType;
    private final String field;
    private final String message;

    public AddressValidationError(String str, String str2, @C17402n(name = "error_type") String str3) {
        this.message = str;
        this.field = str2;
        this.errorType = str3;
    }

    public static /* synthetic */ AddressValidationError copy$default(AddressValidationError addressValidationError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressValidationError.message;
        }
        if ((i & 2) != 0) {
            str2 = addressValidationError.field;
        }
        if ((i & 4) != 0) {
            str3 = addressValidationError.errorType;
        }
        return addressValidationError.copy(str, str2, str3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.field;
    }

    public final String component3() {
        return this.errorType;
    }

    public final AddressValidationError copy(String str, String str2, @C17402n(name = "error_type") String str3) {
        return new AddressValidationError(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressValidationError)) {
            return false;
        }
        AddressValidationError addressValidationError = (AddressValidationError) obj;
        return C19383o.m32792b(this.message, addressValidationError.message) && C19383o.m32792b(this.field, addressValidationError.field) && C19383o.m32792b(this.errorType, addressValidationError.errorType);
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getField() {
        return this.field;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.field;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AddressValidationError(message=");
        h.append(this.message);
        h.append(", field=");
        h.append(this.field);
        h.append(", errorType=");
        return C0391c.m1057c(h, this.errorType, ')');
    }
}
