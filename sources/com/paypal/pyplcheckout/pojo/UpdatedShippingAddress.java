package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class UpdatedShippingAddress {
    private final String country;
    private final String line1;
    private final String postalCode;
    private final String state;

    public UpdatedShippingAddress(String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "line1", str2, "state", str3, "postalCode", str4, "country");
        this.line1 = str;
        this.state = str2;
        this.postalCode = str3;
        this.country = str4;
    }

    public static /* synthetic */ UpdatedShippingAddress copy$default(UpdatedShippingAddress updatedShippingAddress, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatedShippingAddress.line1;
        }
        if ((i & 2) != 0) {
            str2 = updatedShippingAddress.state;
        }
        if ((i & 4) != 0) {
            str3 = updatedShippingAddress.postalCode;
        }
        if ((i & 8) != 0) {
            str4 = updatedShippingAddress.country;
        }
        return updatedShippingAddress.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.line1;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.postalCode;
    }

    public final String component4() {
        return this.country;
    }

    public final UpdatedShippingAddress copy(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "line1");
        C19383o.m32797g(str2, "state");
        C19383o.m32797g(str3, "postalCode");
        C19383o.m32797g(str4, "country");
        return new UpdatedShippingAddress(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedShippingAddress)) {
            return false;
        }
        UpdatedShippingAddress updatedShippingAddress = (UpdatedShippingAddress) obj;
        return C19383o.m32792b(this.line1, updatedShippingAddress.line1) && C19383o.m32792b(this.state, updatedShippingAddress.state) && C19383o.m32792b(this.postalCode, updatedShippingAddress.postalCode) && C19383o.m32792b(this.country, updatedShippingAddress.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.country.hashCode() + C0023f.m105e(this.postalCode, C0023f.m105e(this.state, this.line1.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.line1;
        String str2 = this.state;
        return C0073e.m210j(C0388a.m1050f("UpdatedShippingAddress(line1=", str, ", state=", str2, ", postalCode="), this.postalCode, ", country=", this.country, ")");
    }
}
