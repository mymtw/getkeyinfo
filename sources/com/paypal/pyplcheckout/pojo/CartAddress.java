package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class CartAddress {
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private final String country;
    @C18417a("firstName")
    private final String firstName;
    @C18417a("isFullAddress")
    private final boolean isFullAddress;
    @C18417a("isStoreAddress")
    private final boolean isStoreAddress;
    @C18417a("lastName")
    private final String lastName;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public CartAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C19383o.m32797g(str, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(str3, "line1");
        C19383o.m32797g(str4, "line2");
        C19383o.m32797g(str5, "city");
        C19383o.m32797g(str6, "state");
        C19383o.m32797g(str7, "postalCode");
        C19383o.m32797g(str8, "country");
        this.firstName = str;
        this.lastName = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.city = str5;
        this.state = str6;
        this.postalCode = str7;
        this.country = str8;
        this.isFullAddress = z;
        this.isStoreAddress = z2;
    }

    public static /* synthetic */ CartAddress copy$default(CartAddress cartAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, int i, Object obj) {
        CartAddress cartAddress2 = cartAddress;
        int i2 = i;
        return cartAddress.copy((i2 & 1) != 0 ? cartAddress2.firstName : str, (i2 & 2) != 0 ? cartAddress2.lastName : str2, (i2 & 4) != 0 ? cartAddress2.line1 : str3, (i2 & 8) != 0 ? cartAddress2.line2 : str4, (i2 & 16) != 0 ? cartAddress2.city : str5, (i2 & 32) != 0 ? cartAddress2.state : str6, (i2 & 64) != 0 ? cartAddress2.postalCode : str7, (i2 & 128) != 0 ? cartAddress2.country : str8, (i2 & 256) != 0 ? cartAddress2.isFullAddress : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? cartAddress2.isStoreAddress : z2);
    }

    public final String component1() {
        return this.firstName;
    }

    public final boolean component10() {
        return this.isStoreAddress;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.postalCode;
    }

    public final String component8() {
        return this.country;
    }

    public final boolean component9() {
        return this.isFullAddress;
    }

    public final CartAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C19383o.m32797g(str, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(str3, "line1");
        String str9 = str4;
        C19383o.m32797g(str9, "line2");
        String str10 = str5;
        C19383o.m32797g(str10, "city");
        String str11 = str6;
        C19383o.m32797g(str11, "state");
        String str12 = str7;
        C19383o.m32797g(str12, "postalCode");
        String str13 = str8;
        C19383o.m32797g(str13, "country");
        return new CartAddress(str, str2, str3, str9, str10, str11, str12, str13, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartAddress)) {
            return false;
        }
        CartAddress cartAddress = (CartAddress) obj;
        return C19383o.m32792b(this.firstName, cartAddress.firstName) && C19383o.m32792b(this.lastName, cartAddress.lastName) && C19383o.m32792b(this.line1, cartAddress.line1) && C19383o.m32792b(this.line2, cartAddress.line2) && C19383o.m32792b(this.city, cartAddress.city) && C19383o.m32792b(this.state, cartAddress.state) && C19383o.m32792b(this.postalCode, cartAddress.postalCode) && C19383o.m32792b(this.country, cartAddress.country) && this.isFullAddress == cartAddress.isFullAddress && this.isStoreAddress == cartAddress.isStoreAddress;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.country, C0023f.m105e(this.postalCode, C0023f.m105e(this.state, C0023f.m105e(this.city, C0023f.m105e(this.line2, C0023f.m105e(this.line1, C0023f.m105e(this.lastName, this.firstName.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z = this.isFullAddress;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.isStoreAddress;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isFullAddress() {
        return this.isFullAddress;
    }

    public final boolean isStoreAddress() {
        return this.isStoreAddress;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.city;
        String str6 = this.state;
        String str7 = this.postalCode;
        String str8 = this.country;
        boolean z = this.isFullAddress;
        boolean z2 = this.isStoreAddress;
        StringBuilder f = C0388a.m1050f("CartAddress(firstName=", str, ", lastName=", str2, ", line1=");
        C0391c.m1061h(f, str3, ", line2=", str4, ", city=");
        C0391c.m1061h(f, str5, ", state=", str6, ", postalCode=");
        C0391c.m1061h(f, str7, ", country=", str8, ", isFullAddress=");
        f.append(z);
        f.append(", isStoreAddress=");
        f.append(z2);
        f.append(")");
        return f.toString();
    }
}
