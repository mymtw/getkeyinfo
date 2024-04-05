package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Seller {
    public static final int $stable = 8;
    private final Long creationTsz;
    private final FeedbackInfo feedbackInfo;
    private final String loginName;
    private final Profile profile;
    private final List<ShopItem> shops;
    private final Integer userId;

    public Seller(@C17402n(name = "login_name") String str, @C17402n(name = "user_id") Integer num, @C17402n(name = "creation_tsz") Long l, @C17402n(name = "profile") Profile profile2, @C17402n(name = "shops") List<ShopItem> list, @C17402n(name = "feedback_info") FeedbackInfo feedbackInfo2) {
        this.loginName = str;
        this.userId = num;
        this.creationTsz = l;
        this.profile = profile2;
        this.shops = list;
        this.feedbackInfo = feedbackInfo2;
    }

    public static /* synthetic */ Seller copy$default(Seller seller, String str, Integer num, Long l, Profile profile2, List<ShopItem> list, FeedbackInfo feedbackInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seller.loginName;
        }
        if ((i & 2) != 0) {
            num = seller.userId;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            l = seller.creationTsz;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            profile2 = seller.profile;
        }
        Profile profile3 = profile2;
        if ((i & 16) != 0) {
            list = seller.shops;
        }
        List<ShopItem> list2 = list;
        if ((i & 32) != 0) {
            feedbackInfo2 = seller.feedbackInfo;
        }
        return seller.copy(str, num2, l2, profile3, list2, feedbackInfo2);
    }

    public final String component1() {
        return this.loginName;
    }

    public final Integer component2() {
        return this.userId;
    }

    public final Long component3() {
        return this.creationTsz;
    }

    public final Profile component4() {
        return this.profile;
    }

    public final List<ShopItem> component5() {
        return this.shops;
    }

    public final FeedbackInfo component6() {
        return this.feedbackInfo;
    }

    public final Seller copy(@C17402n(name = "login_name") String str, @C17402n(name = "user_id") Integer num, @C17402n(name = "creation_tsz") Long l, @C17402n(name = "profile") Profile profile2, @C17402n(name = "shops") List<ShopItem> list, @C17402n(name = "feedback_info") FeedbackInfo feedbackInfo2) {
        return new Seller(str, num, l, profile2, list, feedbackInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Seller)) {
            return false;
        }
        Seller seller = (Seller) obj;
        return C19383o.m32792b(this.loginName, seller.loginName) && C19383o.m32792b(this.userId, seller.userId) && C19383o.m32792b(this.creationTsz, seller.creationTsz) && C19383o.m32792b(this.profile, seller.profile) && C19383o.m32792b(this.shops, seller.shops) && C19383o.m32792b(this.feedbackInfo, seller.feedbackInfo);
    }

    public final Long getCreationTsz() {
        return this.creationTsz;
    }

    public final FeedbackInfo getFeedbackInfo() {
        return this.feedbackInfo;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final List<ShopItem> getShops() {
        return this.shops;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.loginName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.userId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.creationTsz;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Profile profile2 = this.profile;
        int hashCode4 = (hashCode3 + (profile2 == null ? 0 : profile2.hashCode())) * 31;
        List<ShopItem> list = this.shops;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        FeedbackInfo feedbackInfo2 = this.feedbackInfo;
        if (feedbackInfo2 != null) {
            i = feedbackInfo2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Seller(loginName=");
        h.append(this.loginName);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", creationTsz=");
        h.append(this.creationTsz);
        h.append(", profile=");
        h.append(this.profile);
        h.append(", shops=");
        h.append(this.shops);
        h.append(", feedbackInfo=");
        h.append(this.feedbackInfo);
        h.append(')');
        return h.toString();
    }
}
