package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopsReviewsUserCard {
    public static final int $stable = 0;
    private final String avatarColor;
    private final String avatarUrl;
    private final String casualNameOrLoginName;
    private final Boolean isActive;
    private final Boolean isGuest;
    private final Boolean isNameWithheld;
    private final String loginName;
    private final String profileUrl;
    private final String realNameOrLoginName;
    private final Long userId;

    public ShopsReviewsUserCard(@C17402n(name = "avatar_color") String str, @C17402n(name = "avatar_url") String str2, @C17402n(name = "casual_name_or_login_name") String str3, @C17402n(name = "is_active") Boolean bool, @C17402n(name = "is_guest") Boolean bool2, @C17402n(name = "is_name_withheld") Boolean bool3, @C17402n(name = "login_name") String str4, @C17402n(name = "profile_url") String str5, @C17402n(name = "real_name_or_login_name") String str6, @C17402n(name = "user_id") Long l) {
        this.avatarColor = str;
        this.avatarUrl = str2;
        this.casualNameOrLoginName = str3;
        this.isActive = bool;
        this.isGuest = bool2;
        this.isNameWithheld = bool3;
        this.loginName = str4;
        this.profileUrl = str5;
        this.realNameOrLoginName = str6;
        this.userId = l;
    }

    public static /* synthetic */ ShopsReviewsUserCard copy$default(ShopsReviewsUserCard shopsReviewsUserCard, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, String str6, Long l, int i, Object obj) {
        ShopsReviewsUserCard shopsReviewsUserCard2 = shopsReviewsUserCard;
        int i2 = i;
        return shopsReviewsUserCard.copy((i2 & 1) != 0 ? shopsReviewsUserCard2.avatarColor : str, (i2 & 2) != 0 ? shopsReviewsUserCard2.avatarUrl : str2, (i2 & 4) != 0 ? shopsReviewsUserCard2.casualNameOrLoginName : str3, (i2 & 8) != 0 ? shopsReviewsUserCard2.isActive : bool, (i2 & 16) != 0 ? shopsReviewsUserCard2.isGuest : bool2, (i2 & 32) != 0 ? shopsReviewsUserCard2.isNameWithheld : bool3, (i2 & 64) != 0 ? shopsReviewsUserCard2.loginName : str4, (i2 & 128) != 0 ? shopsReviewsUserCard2.profileUrl : str5, (i2 & 256) != 0 ? shopsReviewsUserCard2.realNameOrLoginName : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopsReviewsUserCard2.userId : l);
    }

    public final String component1() {
        return this.avatarColor;
    }

    public final Long component10() {
        return this.userId;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.casualNameOrLoginName;
    }

    public final Boolean component4() {
        return this.isActive;
    }

    public final Boolean component5() {
        return this.isGuest;
    }

    public final Boolean component6() {
        return this.isNameWithheld;
    }

    public final String component7() {
        return this.loginName;
    }

    public final String component8() {
        return this.profileUrl;
    }

    public final String component9() {
        return this.realNameOrLoginName;
    }

    public final ShopsReviewsUserCard copy(@C17402n(name = "avatar_color") String str, @C17402n(name = "avatar_url") String str2, @C17402n(name = "casual_name_or_login_name") String str3, @C17402n(name = "is_active") Boolean bool, @C17402n(name = "is_guest") Boolean bool2, @C17402n(name = "is_name_withheld") Boolean bool3, @C17402n(name = "login_name") String str4, @C17402n(name = "profile_url") String str5, @C17402n(name = "real_name_or_login_name") String str6, @C17402n(name = "user_id") Long l) {
        return new ShopsReviewsUserCard(str, str2, str3, bool, bool2, bool3, str4, str5, str6, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsReviewsUserCard)) {
            return false;
        }
        ShopsReviewsUserCard shopsReviewsUserCard = (ShopsReviewsUserCard) obj;
        return C19383o.m32792b(this.avatarColor, shopsReviewsUserCard.avatarColor) && C19383o.m32792b(this.avatarUrl, shopsReviewsUserCard.avatarUrl) && C19383o.m32792b(this.casualNameOrLoginName, shopsReviewsUserCard.casualNameOrLoginName) && C19383o.m32792b(this.isActive, shopsReviewsUserCard.isActive) && C19383o.m32792b(this.isGuest, shopsReviewsUserCard.isGuest) && C19383o.m32792b(this.isNameWithheld, shopsReviewsUserCard.isNameWithheld) && C19383o.m32792b(this.loginName, shopsReviewsUserCard.loginName) && C19383o.m32792b(this.profileUrl, shopsReviewsUserCard.profileUrl) && C19383o.m32792b(this.realNameOrLoginName, shopsReviewsUserCard.realNameOrLoginName) && C19383o.m32792b(this.userId, shopsReviewsUserCard.userId);
    }

    public final String getAvatarColor() {
        return this.avatarColor;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCasualNameOrLoginName() {
        return this.casualNameOrLoginName;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final String getRealNameOrLoginName() {
        return this.realNameOrLoginName;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.avatarColor;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.casualNameOrLoginName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isActive;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isGuest;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isNameWithheld;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.loginName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileUrl;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.realNameOrLoginName;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.userId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode9 + i;
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public final Boolean isGuest() {
        return this.isGuest;
    }

    public final Boolean isNameWithheld() {
        return this.isNameWithheld;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsReviewsUserCard(avatarColor=");
        h.append(this.avatarColor);
        h.append(", avatarUrl=");
        h.append(this.avatarUrl);
        h.append(", casualNameOrLoginName=");
        h.append(this.casualNameOrLoginName);
        h.append(", isActive=");
        h.append(this.isActive);
        h.append(", isGuest=");
        h.append(this.isGuest);
        h.append(", isNameWithheld=");
        h.append(this.isNameWithheld);
        h.append(", loginName=");
        h.append(this.loginName);
        h.append(", profileUrl=");
        h.append(this.profileUrl);
        h.append(", realNameOrLoginName=");
        h.append(this.realNameOrLoginName);
        h.append(", userId=");
        h.append(this.userId);
        h.append(')');
        return h.toString();
    }
}
