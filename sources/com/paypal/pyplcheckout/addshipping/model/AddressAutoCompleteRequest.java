package com.paypal.pyplcheckout.addshipping.model;

import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class AddressAutoCompleteRequest {
    private final int count;
    private final String countryCode;
    private final String input;
    private final String language;
    private final boolean strictBounds;
    private final GooglePlacesType types;

    public AddressAutoCompleteRequest(int i, String str, String str2, String str3, boolean z, GooglePlacesType googlePlacesType) {
        C19383o.m32797g(str2, "input");
        C19383o.m32797g(str3, "language");
        C19383o.m32797g(googlePlacesType, "types");
        this.count = i;
        this.countryCode = str;
        this.input = str2;
        this.language = str3;
        this.strictBounds = z;
        this.types = googlePlacesType;
    }

    public static /* synthetic */ AddressAutoCompleteRequest copy$default(AddressAutoCompleteRequest addressAutoCompleteRequest, int i, String str, String str2, String str3, boolean z, GooglePlacesType googlePlacesType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressAutoCompleteRequest.count;
        }
        if ((i2 & 2) != 0) {
            str = addressAutoCompleteRequest.countryCode;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = addressAutoCompleteRequest.input;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = addressAutoCompleteRequest.language;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = addressAutoCompleteRequest.strictBounds;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            googlePlacesType = addressAutoCompleteRequest.types;
        }
        return addressAutoCompleteRequest.copy(i, str4, str5, str6, z2, googlePlacesType);
    }

    public final int component1() {
        return this.count;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final String component3() {
        return this.input;
    }

    public final String component4() {
        return this.language;
    }

    public final boolean component5() {
        return this.strictBounds;
    }

    public final GooglePlacesType component6() {
        return this.types;
    }

    public final AddressAutoCompleteRequest copy(int i, String str, String str2, String str3, boolean z, GooglePlacesType googlePlacesType) {
        C19383o.m32797g(str2, "input");
        C19383o.m32797g(str3, "language");
        C19383o.m32797g(googlePlacesType, "types");
        return new AddressAutoCompleteRequest(i, str, str2, str3, z, googlePlacesType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAutoCompleteRequest)) {
            return false;
        }
        AddressAutoCompleteRequest addressAutoCompleteRequest = (AddressAutoCompleteRequest) obj;
        return this.count == addressAutoCompleteRequest.count && C19383o.m32792b(this.countryCode, addressAutoCompleteRequest.countryCode) && C19383o.m32792b(this.input, addressAutoCompleteRequest.input) && C19383o.m32792b(this.language, addressAutoCompleteRequest.language) && this.strictBounds == addressAutoCompleteRequest.strictBounds && this.types == addressAutoCompleteRequest.types;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getInput() {
        return this.input;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getStrictBounds() {
        return this.strictBounds;
    }

    public final GooglePlacesType getTypes() {
        return this.types;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        String str = this.countryCode;
        int e = C0023f.m105e(this.language, C0023f.m105e(this.input, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        boolean z = this.strictBounds;
        if (z) {
            z = true;
        }
        return this.types.hashCode() + ((e + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        int i = this.count;
        String str = this.countryCode;
        String str2 = this.input;
        String str3 = this.language;
        boolean z = this.strictBounds;
        GooglePlacesType googlePlacesType = this.types;
        StringBuilder sb = new StringBuilder();
        sb.append("AddressAutoCompleteRequest(count=");
        sb.append(i);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", input=");
        C0391c.m1061h(sb, str2, ", language=", str3, ", strictBounds=");
        sb.append(z);
        sb.append(", types=");
        sb.append(googlePlacesType);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressAutoCompleteRequest(int i, String str, String str2, String str3, boolean z, GooglePlacesType googlePlacesType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, str2, str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? GooglePlacesType.ADDRESS : googlePlacesType);
    }
}
