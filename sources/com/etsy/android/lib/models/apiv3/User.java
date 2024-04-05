package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class User {
    public static final int $stable = 0;
    private final String displayName;
    private final String loginName;
    private final long userId;

    public User(@C17402n(name = "user_id") long j, @C17402n(name = "display_name") String str, @C17402n(name = "login_name") String str2) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(str2, "loginName");
        this.userId = j;
        this.displayName = str;
        this.loginName = str2;
    }

    public static /* synthetic */ User copy$default(User user, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = user.userId;
        }
        if ((i & 2) != 0) {
            str = user.displayName;
        }
        if ((i & 4) != 0) {
            str2 = user.loginName;
        }
        return user.copy(j, str, str2);
    }

    public final long component1() {
        return this.userId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.loginName;
    }

    public final User copy(@C17402n(name = "user_id") long j, @C17402n(name = "display_name") String str, @C17402n(name = "login_name") String str2) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(str2, "loginName");
        return new User(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.userId == user.userId && C19383o.m32792b(this.displayName, user.displayName) && C19383o.m32792b(this.loginName, user.loginName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getLoginName() {
        return this.loginName;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.loginName.hashCode() + C0023f.m105e(this.displayName, Long.hashCode(this.userId) * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("User(userId=");
        h.append(this.userId);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", loginName=");
        return C0391c.m1057c(h, this.loginName, ')');
    }
}
