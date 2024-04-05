package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Profile {
    public static final int $stable = 0;
    private final String city;
    private final Country country;
    private final String firstName;
    private final String imageUrl75x75;
    private final Boolean isSeller;
    private final String lastName;
    private final String loginName;
    private final String region;
    private final Integer transactionSoldCount;

    public Profile(@C17402n(name = "country") Country country2, @C17402n(name = "is_seller") Boolean bool, @C17402n(name = "login_name") String str, @C17402n(name = "city") String str2, @C17402n(name = "image_url_75x75") String str3, @C17402n(name = "last_name") String str4, @C17402n(name = "transaction_sold_count") Integer num, @C17402n(name = "region") String str5, @C17402n(name = "first_name") String str6) {
        this.country = country2;
        this.isSeller = bool;
        this.loginName = str;
        this.city = str2;
        this.imageUrl75x75 = str3;
        this.lastName = str4;
        this.transactionSoldCount = num;
        this.region = str5;
        this.firstName = str6;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, Country country2, Boolean bool, String str, String str2, String str3, String str4, Integer num, String str5, String str6, int i, Object obj) {
        Profile profile2 = profile;
        int i2 = i;
        return profile.copy((i2 & 1) != 0 ? profile2.country : country2, (i2 & 2) != 0 ? profile2.isSeller : bool, (i2 & 4) != 0 ? profile2.loginName : str, (i2 & 8) != 0 ? profile2.city : str2, (i2 & 16) != 0 ? profile2.imageUrl75x75 : str3, (i2 & 32) != 0 ? profile2.lastName : str4, (i2 & 64) != 0 ? profile2.transactionSoldCount : num, (i2 & 128) != 0 ? profile2.region : str5, (i2 & 256) != 0 ? profile2.firstName : str6);
    }

    public final Country component1() {
        return this.country;
    }

    public final Boolean component2() {
        return this.isSeller;
    }

    public final String component3() {
        return this.loginName;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.imageUrl75x75;
    }

    public final String component6() {
        return this.lastName;
    }

    public final Integer component7() {
        return this.transactionSoldCount;
    }

    public final String component8() {
        return this.region;
    }

    public final String component9() {
        return this.firstName;
    }

    public final Profile copy(@C17402n(name = "country") Country country2, @C17402n(name = "is_seller") Boolean bool, @C17402n(name = "login_name") String str, @C17402n(name = "city") String str2, @C17402n(name = "image_url_75x75") String str3, @C17402n(name = "last_name") String str4, @C17402n(name = "transaction_sold_count") Integer num, @C17402n(name = "region") String str5, @C17402n(name = "first_name") String str6) {
        return new Profile(country2, bool, str, str2, str3, str4, num, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return C19383o.m32792b(this.country, profile.country) && C19383o.m32792b(this.isSeller, profile.isSeller) && C19383o.m32792b(this.loginName, profile.loginName) && C19383o.m32792b(this.city, profile.city) && C19383o.m32792b(this.imageUrl75x75, profile.imageUrl75x75) && C19383o.m32792b(this.lastName, profile.lastName) && C19383o.m32792b(this.transactionSoldCount, profile.transactionSoldCount) && C19383o.m32792b(this.region, profile.region) && C19383o.m32792b(this.firstName, profile.firstName);
    }

    public final String getCity() {
        return this.city;
    }

    public final Country getCountry() {
        return this.country;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getImageUrl75x75() {
        return this.imageUrl75x75;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final String getRegion() {
        return this.region;
    }

    public final Integer getTransactionSoldCount() {
        return this.transactionSoldCount;
    }

    public int hashCode() {
        Country country2 = this.country;
        int i = 0;
        int hashCode = (country2 == null ? 0 : country2.hashCode()) * 31;
        Boolean bool = this.isSeller;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.loginName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl75x75;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.transactionSoldCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.region;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public final Boolean isSeller() {
        return this.isSeller;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Profile(country=");
        h.append(this.country);
        h.append(", isSeller=");
        h.append(this.isSeller);
        h.append(", loginName=");
        h.append(this.loginName);
        h.append(", city=");
        h.append(this.city);
        h.append(", imageUrl75x75=");
        h.append(this.imageUrl75x75);
        h.append(", lastName=");
        h.append(this.lastName);
        h.append(", transactionSoldCount=");
        h.append(this.transactionSoldCount);
        h.append(", region=");
        h.append(this.region);
        h.append(", firstName=");
        return C0391c.m1057c(h, this.firstName, ')');
    }
}
