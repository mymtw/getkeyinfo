package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseUserProfile {
    public static final int $stable = 0;
    private final String firstName;
    private final String lastName;
    private final String loginName;
    private final String url75x75;

    public PastPurchaseUserProfile() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public PastPurchaseUserProfile(@C17402n(name = "image_url_75x75") String str, @C17402n(name = "first_name") String str2, @C17402n(name = "last_name") String str3, @C17402n(name = "login_name") String str4) {
        this.url75x75 = str;
        this.firstName = str2;
        this.lastName = str3;
        this.loginName = str4;
    }

    public static /* synthetic */ PastPurchaseUserProfile copy$default(PastPurchaseUserProfile pastPurchaseUserProfile, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pastPurchaseUserProfile.url75x75;
        }
        if ((i & 2) != 0) {
            str2 = pastPurchaseUserProfile.firstName;
        }
        if ((i & 4) != 0) {
            str3 = pastPurchaseUserProfile.lastName;
        }
        if ((i & 8) != 0) {
            str4 = pastPurchaseUserProfile.loginName;
        }
        return pastPurchaseUserProfile.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url75x75;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.loginName;
    }

    public final PastPurchaseUserProfile copy(@C17402n(name = "image_url_75x75") String str, @C17402n(name = "first_name") String str2, @C17402n(name = "last_name") String str3, @C17402n(name = "login_name") String str4) {
        return new PastPurchaseUserProfile(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseUserProfile)) {
            return false;
        }
        PastPurchaseUserProfile pastPurchaseUserProfile = (PastPurchaseUserProfile) obj;
        return C19383o.m32792b(this.url75x75, pastPurchaseUserProfile.url75x75) && C19383o.m32792b(this.firstName, pastPurchaseUserProfile.firstName) && C19383o.m32792b(this.lastName, pastPurchaseUserProfile.lastName) && C19383o.m32792b(this.loginName, pastPurchaseUserProfile.loginName);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final String getUrl75x75() {
        return this.url75x75;
    }

    public int hashCode() {
        String str = this.url75x75;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loginName;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseUserProfile(url75x75=");
        h.append(this.url75x75);
        h.append(", firstName=");
        h.append(this.firstName);
        h.append(", lastName=");
        h.append(this.lastName);
        h.append(", loginName=");
        return C0391c.m1057c(h, this.loginName, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchaseUserProfile(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
