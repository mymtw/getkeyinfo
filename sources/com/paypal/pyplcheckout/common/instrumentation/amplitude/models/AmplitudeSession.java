package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import android.support.p013v4.media.C0071c;
import androidx.compose.animation.C0388a;
import com.paypal.pyplcheckout.utils.IgnoreGeneratedTestReport;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@IgnoreGeneratedTestReport
public final class AmplitudeSession {
    private final String deviceId;
    private final long sessionId;
    private final String userId;
    private final UserProperties userProperties;

    public AmplitudeSession(String str, String str2, long j, UserProperties userProperties2) {
        C19383o.m32797g(str2, "deviceId");
        this.userId = str;
        this.deviceId = str2;
        this.sessionId = j;
        this.userProperties = userProperties2;
    }

    public static /* synthetic */ AmplitudeSession copy$default(AmplitudeSession amplitudeSession, String str, String str2, long j, UserProperties userProperties2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amplitudeSession.userId;
        }
        if ((i & 2) != 0) {
            str2 = amplitudeSession.deviceId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = amplitudeSession.sessionId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            userProperties2 = amplitudeSession.userProperties;
        }
        return amplitudeSession.copy(str, str3, j2, userProperties2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final long component3() {
        return this.sessionId;
    }

    public final UserProperties component4() {
        return this.userProperties;
    }

    public final AmplitudeSession copy(String str, String str2, long j, UserProperties userProperties2) {
        C19383o.m32797g(str2, "deviceId");
        return new AmplitudeSession(str, str2, j, userProperties2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplitudeSession)) {
            return false;
        }
        AmplitudeSession amplitudeSession = (AmplitudeSession) obj;
        return C19383o.m32792b(this.userId, amplitudeSession.userId) && C19383o.m32792b(this.deviceId, amplitudeSession.deviceId) && this.sessionId == amplitudeSession.sessionId && C19383o.m32792b(this.userProperties, amplitudeSession.userProperties);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final UserProperties getUserProperties() {
        return this.userProperties;
    }

    public int hashCode() {
        String str = this.userId;
        int i = 0;
        int b = C0071c.m190b(this.sessionId, C0023f.m105e(this.deviceId, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        UserProperties userProperties2 = this.userProperties;
        if (userProperties2 != null) {
            i = userProperties2.hashCode();
        }
        return b + i;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.deviceId;
        long j = this.sessionId;
        UserProperties userProperties2 = this.userProperties;
        StringBuilder f = C0388a.m1050f("AmplitudeSession(userId=", str, ", deviceId=", str2, ", sessionId=");
        f.append(j);
        f.append(", userProperties=");
        f.append(userProperties2);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AmplitudeSession(java.lang.String r7, java.lang.String r8, long r9, com.paypal.pyplcheckout.common.instrumentation.amplitude.models.UserProperties r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0019
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r8 = "R"
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x0019:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0022
            long r9 = java.lang.System.currentTimeMillis()
        L_0x0022:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L_0x0028
            r11 = 0
        L_0x0028:
            r5 = r11
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession.<init>(java.lang.String, java.lang.String, long, com.paypal.pyplcheckout.common.instrumentation.amplitude.models.UserProperties, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
