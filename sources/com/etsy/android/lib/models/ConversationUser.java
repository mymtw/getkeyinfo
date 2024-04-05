package com.etsy.android.lib.models;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ConversationUser {
    public static final int $stable = 8;
    private String avatarUrl;
    private String displayName;
    private boolean isGuest;
    private long userIdJson;
    private String username;

    public ConversationUser() {
        this((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
    }

    public ConversationUser(@C17402n(name = "display_name") String str, @C17402n(name = "avatar_url") String str2, @C17402n(name = "username") String str3, @C17402n(name = "user_id") long j, @C17402n(name = "is_guest") boolean z) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.displayName = str;
        this.avatarUrl = str2;
        this.username = str3;
        this.userIdJson = j;
        this.isGuest = z;
    }

    public static /* synthetic */ ConversationUser copy$default(ConversationUser conversationUser, String str, String str2, String str3, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationUser.displayName;
        }
        if ((i & 2) != 0) {
            str2 = conversationUser.avatarUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = conversationUser.username;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = conversationUser.userIdJson;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z = conversationUser.isGuest;
        }
        return conversationUser.copy(str, str4, str5, j2, z);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.username;
    }

    public final long component4() {
        return this.userIdJson;
    }

    public final boolean component5() {
        return this.isGuest;
    }

    public final ConversationUser copy(@C17402n(name = "display_name") String str, @C17402n(name = "avatar_url") String str2, @C17402n(name = "username") String str3, @C17402n(name = "user_id") long j, @C17402n(name = "is_guest") boolean z) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        return new ConversationUser(str, str2, str3, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationUser)) {
            return false;
        }
        ConversationUser conversationUser = (ConversationUser) obj;
        return C19383o.m32792b(this.displayName, conversationUser.displayName) && C19383o.m32792b(this.avatarUrl, conversationUser.avatarUrl) && C19383o.m32792b(this.username, conversationUser.username) && this.userIdJson == conversationUser.userIdJson && this.isGuest == conversationUser.isGuest;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final EtsyId getUserId() {
        return new EtsyId(this.userIdJson);
    }

    public final long getUserIdJson() {
        return this.userIdJson;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = this.displayName.hashCode() * 31;
        String str = this.avatarUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.username;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int b = C0071c.m190b(this.userIdJson, (hashCode2 + i) * 31, 31);
        boolean z = this.isGuest;
        if (z) {
            z = true;
        }
        return b + (z ? 1 : 0);
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setDisplayName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.displayName = str;
    }

    public final void setGuest(boolean z) {
        this.isGuest = z;
    }

    public final void setUserId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "userId");
        this.userIdJson = etsyId.getIdAsLongDeprecated();
    }

    public final void setUserIdJson(long j) {
        this.userIdJson = j;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationUser(displayName=");
        h.append(this.displayName);
        h.append(", avatarUrl=");
        h.append(this.avatarUrl);
        h.append(", username=");
        h.append(this.username);
        h.append(", userIdJson=");
        h.append(this.userIdJson);
        h.append(", isGuest=");
        return C0391c.m1058d(h, this.isGuest, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationUser(java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x0008
            r12 = r0
            goto L_0x0009
        L_0x0008:
            r12 = r5
        L_0x0009:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r8 = 0
        L_0x001c:
            r2 = r8
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0022
            r10 = 0
        L_0x0022:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r0
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ConversationUser.<init>(java.lang.String, java.lang.String, java.lang.String, long, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
