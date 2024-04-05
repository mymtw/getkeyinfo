package com.paypal.pyplcheckout.addshipping.model;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class Country {
    private final String address1;
    private final String address2;
    private final String city;
    private final String code;
    private final String name;
    private final String state;
    private final String zipcode;

    public Country(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C19383o.m32797g(str, ResponseConstants.CODE);
        C19383o.m32797g(str2, "name");
        C19383o.m32797g(str3, "address1");
        C19383o.m32797g(str4, "address2");
        C19383o.m32797g(str5, "city");
        C19383o.m32797g(str6, "state");
        C19383o.m32797g(str7, "zipcode");
        this.code = str;
        this.name = str2;
        this.address1 = str3;
        this.address2 = str4;
        this.city = str5;
        this.state = str6;
        this.zipcode = str7;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = country.code;
        }
        if ((i & 2) != 0) {
            str2 = country.name;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = country.address1;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = country.address2;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = country.city;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = country.state;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = country.zipcode;
        }
        return country.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.address1;
    }

    public final String component4() {
        return this.address2;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.zipcode;
    }

    public final Country copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C19383o.m32797g(str, ResponseConstants.CODE);
        C19383o.m32797g(str2, "name");
        C19383o.m32797g(str3, "address1");
        C19383o.m32797g(str4, "address2");
        C19383o.m32797g(str5, "city");
        C19383o.m32797g(str6, "state");
        String str8 = str7;
        C19383o.m32797g(str8, "zipcode");
        return new Country(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return C19383o.m32792b(this.code, country.code) && C19383o.m32792b(this.name, country.name) && C19383o.m32792b(this.address1, country.address1) && C19383o.m32792b(this.address2, country.address2) && C19383o.m32792b(this.city, country.city) && C19383o.m32792b(this.state, country.state) && C19383o.m32792b(this.zipcode, country.zipcode);
    }

    public final String getAddress1() {
        return this.address1;
    }

    public final String getAddress2() {
        return this.address2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZipcode() {
        return this.zipcode;
    }

    public int hashCode() {
        return this.zipcode.hashCode() + C0023f.m105e(this.state, C0023f.m105e(this.city, C0023f.m105e(this.address2, C0023f.m105e(this.address1, C0023f.m105e(this.name, this.code.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.name;
        String str3 = this.address1;
        String str4 = this.address2;
        String str5 = this.city;
        String str6 = this.state;
        String str7 = this.zipcode;
        StringBuilder f = C0388a.m1050f("Country(code=", str, ", name=", str2, ", address1=");
        C0391c.m1061h(f, str3, ", address2=", str4, ", city=");
        C0391c.m1061h(f, str5, ", state=", str6, ", zipcode=");
        return C0023f.m110k(f, str7, ")");
    }
}
