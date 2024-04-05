package com.paypal.android.platform.authsdk.splitlogin.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class AuthMetadata {
    private final String correlationId;
    private final int executionTimeMs;
    private final String locale;
    private final String objectType;
    private final String visitorId;

    public AuthMetadata(int i, String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "correlationId", str2, "visitorId", str3, "locale", str4, "objectType");
        this.executionTimeMs = i;
        this.correlationId = str;
        this.visitorId = str2;
        this.locale = str3;
        this.objectType = str4;
    }

    public static /* synthetic */ AuthMetadata copy$default(AuthMetadata authMetadata, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = authMetadata.executionTimeMs;
        }
        if ((i2 & 2) != 0) {
            str = authMetadata.correlationId;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = authMetadata.visitorId;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = authMetadata.locale;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = authMetadata.objectType;
        }
        return authMetadata.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.executionTimeMs;
    }

    public final String component2() {
        return this.correlationId;
    }

    public final String component3() {
        return this.visitorId;
    }

    public final String component4() {
        return this.locale;
    }

    public final String component5() {
        return this.objectType;
    }

    public final AuthMetadata copy(int i, String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(str2, "visitorId");
        C19383o.m32797g(str3, "locale");
        C19383o.m32797g(str4, "objectType");
        return new AuthMetadata(i, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthMetadata)) {
            return false;
        }
        AuthMetadata authMetadata = (AuthMetadata) obj;
        return this.executionTimeMs == authMetadata.executionTimeMs && C19383o.m32792b(this.correlationId, authMetadata.correlationId) && C19383o.m32792b(this.visitorId, authMetadata.visitorId) && C19383o.m32792b(this.locale, authMetadata.locale) && C19383o.m32792b(this.objectType, authMetadata.objectType);
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final int getExecutionTimeMs() {
        return this.executionTimeMs;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        return this.objectType.hashCode() + C0023f.m105e(this.locale, C0023f.m105e(this.visitorId, C0023f.m105e(this.correlationId, Integer.hashCode(this.executionTimeMs) * 31, 31), 31), 31);
    }

    public String toString() {
        int i = this.executionTimeMs;
        String str = this.correlationId;
        String str2 = this.visitorId;
        String str3 = this.locale;
        String str4 = this.objectType;
        StringBuilder sb = new StringBuilder();
        sb.append("AuthMetadata(executionTimeMs=");
        sb.append(i);
        sb.append(", correlationId=");
        sb.append(str);
        sb.append(", visitorId=");
        C0391c.m1061h(sb, str2, ", locale=", str3, ", objectType=");
        return C0023f.m110k(sb, str4, ")");
    }
}
