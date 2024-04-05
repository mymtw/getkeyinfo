package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

public final class AddCardUser {
    @C18417a("country")
    private final String country;
    @C18417a("dobDay")
    private final String dobDay;
    @C18417a("dobMonth")
    private final String dobMonth;
    @C18417a("dobYear")
    private final String dobYear;
    @C18417a("firstName")
    private final String firstName;
    @C18417a("lastName")
    private final String lastName;

    public AddCardUser(String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        this.firstName = str;
        this.lastName = str2;
        this.dobDay = str3;
        this.dobMonth = str4;
        this.dobYear = str5;
        this.country = str6;
    }

    public static /* synthetic */ AddCardUser copy$default(AddCardUser addCardUser, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addCardUser.firstName;
        }
        if ((i & 2) != 0) {
            str2 = addCardUser.lastName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = addCardUser.dobDay;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = addCardUser.dobMonth;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = addCardUser.dobYear;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = addCardUser.country;
        }
        return addCardUser.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.dobDay;
    }

    public final String component4() {
        return this.dobMonth;
    }

    public final String component5() {
        return this.dobYear;
    }

    public final String component6() {
        return this.country;
    }

    public final AddCardUser copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        return new AddCardUser(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCardUser)) {
            return false;
        }
        AddCardUser addCardUser = (AddCardUser) obj;
        return C19383o.m32792b(this.firstName, addCardUser.firstName) && C19383o.m32792b(this.lastName, addCardUser.lastName) && C19383o.m32792b(this.dobDay, addCardUser.dobDay) && C19383o.m32792b(this.dobMonth, addCardUser.dobMonth) && C19383o.m32792b(this.dobYear, addCardUser.dobYear) && C19383o.m32792b(this.country, addCardUser.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDobDay() {
        return this.dobDay;
    }

    public final String getDobMonth() {
        return this.dobMonth;
    }

    public final String getDobYear() {
        return this.dobYear;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.lastName, this.firstName.hashCode() * 31, 31);
        String str = this.dobDay;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dobMonth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dobYear;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.dobDay;
        String str4 = this.dobMonth;
        String str5 = this.dobYear;
        String str6 = this.country;
        StringBuilder f = C0388a.m1050f("AddCardUser(firstName=", str, ", lastName=", str2, ", dobDay=");
        C0391c.m1061h(f, str3, ", dobMonth=", str4, ", dobYear=");
        return C0073e.m210j(f, str5, ", country=", str6, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddCardUser(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
