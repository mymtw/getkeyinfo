package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Buyer {
    public static final int $stable = 0;
    private final Integer creationTsz;
    private final FeedbackInfo feedbackInfo;
    private final String loginName;
    private final Profile profile;
    private final int userId;

    public Buyer(@C17402n(name = "login_name") String str, @C17402n(name = "user_id") int i, @C17402n(name = "creation_tsz") Integer num, @C17402n(name = "profile") Profile profile2, @C17402n(name = "feedback_info") FeedbackInfo feedbackInfo2) {
        this.loginName = str;
        this.userId = i;
        this.creationTsz = num;
        this.profile = profile2;
        this.feedbackInfo = feedbackInfo2;
    }

    public static /* synthetic */ Buyer copy$default(Buyer buyer, String str, int i, Integer num, Profile profile2, FeedbackInfo feedbackInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buyer.loginName;
        }
        if ((i2 & 2) != 0) {
            i = buyer.userId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = buyer.creationTsz;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            profile2 = buyer.profile;
        }
        Profile profile3 = profile2;
        if ((i2 & 16) != 0) {
            feedbackInfo2 = buyer.feedbackInfo;
        }
        return buyer.copy(str, i3, num2, profile3, feedbackInfo2);
    }

    public final String component1() {
        return this.loginName;
    }

    public final int component2() {
        return this.userId;
    }

    public final Integer component3() {
        return this.creationTsz;
    }

    public final Profile component4() {
        return this.profile;
    }

    public final FeedbackInfo component5() {
        return this.feedbackInfo;
    }

    public final Buyer copy(@C17402n(name = "login_name") String str, @C17402n(name = "user_id") int i, @C17402n(name = "creation_tsz") Integer num, @C17402n(name = "profile") Profile profile2, @C17402n(name = "feedback_info") FeedbackInfo feedbackInfo2) {
        return new Buyer(str, i, num, profile2, feedbackInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buyer)) {
            return false;
        }
        Buyer buyer = (Buyer) obj;
        return C19383o.m32792b(this.loginName, buyer.loginName) && this.userId == buyer.userId && C19383o.m32792b(this.creationTsz, buyer.creationTsz) && C19383o.m32792b(this.profile, buyer.profile) && C19383o.m32792b(this.feedbackInfo, buyer.feedbackInfo);
    }

    public final Integer getCreationTsz() {
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

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.loginName;
        int i = 0;
        int a = C0069a.m170a(this.userId, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.creationTsz;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Profile profile2 = this.profile;
        int hashCode2 = (hashCode + (profile2 == null ? 0 : profile2.hashCode())) * 31;
        FeedbackInfo feedbackInfo2 = this.feedbackInfo;
        if (feedbackInfo2 != null) {
            i = feedbackInfo2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Buyer(loginName=");
        h.append(this.loginName);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", creationTsz=");
        h.append(this.creationTsz);
        h.append(", profile=");
        h.append(this.profile);
        h.append(", feedbackInfo=");
        h.append(this.feedbackInfo);
        h.append(')');
        return h.toString();
    }
}
