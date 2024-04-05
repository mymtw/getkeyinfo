package com.etsy.android.lib.models.apiv3.circles;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.Scopes;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class CircledUserModel {
    public static final int $stable = 8;
    private final List<CircledUserFavoriteListing> favoriteListings;
    private final String firstName;
    private final int followerCount;
    private final String lastName;
    private final String loginName;
    private final CircledUserProfile profile;
    private final int userId;

    public CircledUserModel(@C17402n(name = "user_id") int i, @C17402n(name = "login_name") String str, @C17402n(name = "first_name") String str2, @C17402n(name = "last_name") String str3, @C17402n(name = "follower_count") int i2, @C17402n(name = "profile") CircledUserProfile circledUserProfile, @C17402n(name = "favorite_listings") List<CircledUserFavoriteListing> list) {
        C19383o.m32797g(str, "loginName");
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str3, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(circledUserProfile, Scopes.PROFILE);
        C19383o.m32797g(list, "favoriteListings");
        this.userId = i;
        this.loginName = str;
        this.firstName = str2;
        this.lastName = str3;
        this.followerCount = i2;
        this.profile = circledUserProfile;
        this.favoriteListings = list;
    }

    public static /* synthetic */ CircledUserModel copy$default(CircledUserModel circledUserModel, int i, String str, String str2, String str3, int i2, CircledUserProfile circledUserProfile, List<CircledUserFavoriteListing> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = circledUserModel.userId;
        }
        if ((i3 & 2) != 0) {
            str = circledUserModel.loginName;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = circledUserModel.firstName;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = circledUserModel.lastName;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = circledUserModel.followerCount;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            circledUserProfile = circledUserModel.profile;
        }
        CircledUserProfile circledUserProfile2 = circledUserProfile;
        if ((i3 & 64) != 0) {
            list = circledUserModel.favoriteListings;
        }
        return circledUserModel.copy(i, str4, str5, str6, i4, circledUserProfile2, list);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.loginName;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final int component5() {
        return this.followerCount;
    }

    public final CircledUserProfile component6() {
        return this.profile;
    }

    public final List<CircledUserFavoriteListing> component7() {
        return this.favoriteListings;
    }

    public final CircledUserModel copy(@C17402n(name = "user_id") int i, @C17402n(name = "login_name") String str, @C17402n(name = "first_name") String str2, @C17402n(name = "last_name") String str3, @C17402n(name = "follower_count") int i2, @C17402n(name = "profile") CircledUserProfile circledUserProfile, @C17402n(name = "favorite_listings") List<CircledUserFavoriteListing> list) {
        C19383o.m32797g(str, "loginName");
        C19383o.m32797g(str2, PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
        C19383o.m32797g(str3, PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
        C19383o.m32797g(circledUserProfile, Scopes.PROFILE);
        List<CircledUserFavoriteListing> list2 = list;
        C19383o.m32797g(list2, "favoriteListings");
        return new CircledUserModel(i, str, str2, str3, i2, circledUserProfile, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircledUserModel)) {
            return false;
        }
        CircledUserModel circledUserModel = (CircledUserModel) obj;
        return this.userId == circledUserModel.userId && C19383o.m32792b(this.loginName, circledUserModel.loginName) && C19383o.m32792b(this.firstName, circledUserModel.firstName) && C19383o.m32792b(this.lastName, circledUserModel.lastName) && this.followerCount == circledUserModel.followerCount && C19383o.m32792b(this.profile, circledUserModel.profile) && C19383o.m32792b(this.favoriteListings, circledUserModel.favoriteListings);
    }

    public final String formattedFullName() {
        return C19459m.m33035H1(this.firstName + ' ' + this.lastName).toString();
    }

    public final List<CircledUserFavoriteListing> getFavoriteListings() {
        return this.favoriteListings;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final CircledUserProfile getProfile() {
        return this.profile;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.followerCount, C0023f.m105e(this.lastName, C0023f.m105e(this.firstName, C0023f.m105e(this.loginName, Integer.hashCode(this.userId) * 31, 31), 31), 31), 31);
        return this.favoriteListings.hashCode() + ((this.profile.hashCode() + a) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CircledUserModel(userId=");
        h.append(this.userId);
        h.append(", loginName=");
        h.append(this.loginName);
        h.append(", firstName=");
        h.append(this.firstName);
        h.append(", lastName=");
        h.append(this.lastName);
        h.append(", followerCount=");
        h.append(this.followerCount);
        h.append(", profile=");
        h.append(this.profile);
        h.append(", favoriteListings=");
        return C0070b.m186i(h, this.favoriteListings, ')');
    }
}
