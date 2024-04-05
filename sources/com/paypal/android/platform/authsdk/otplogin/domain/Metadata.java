package com.paypal.android.platform.authsdk.otplogin.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

@Keep
public final class Metadata {
    @C18417a("correlationId")
    private String correlationId;
    @C18417a("executionTimeMs")
    private Integer executionTimeMs;
    @C18417a("locale")
    private String locale;
    @C18417a("objectType")
    private String objectType;
    @C18417a("visitorId")
    private String visitorId;

    public Metadata() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public Metadata(Integer num, String str, String str2, String str3, String str4) {
        this.executionTimeMs = num;
        this.correlationId = str;
        this.visitorId = str2;
        this.locale = str3;
        this.objectType = str4;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = metadata.executionTimeMs;
        }
        if ((i & 2) != 0) {
            str = metadata.correlationId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = metadata.visitorId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = metadata.locale;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = metadata.objectType;
        }
        return metadata.copy(num, str5, str6, str7, str4);
    }

    public final Integer component1() {
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

    public final Metadata copy(Integer num, String str, String str2, String str3, String str4) {
        return new Metadata(num, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return C19383o.m32792b(this.executionTimeMs, metadata.executionTimeMs) && C19383o.m32792b(this.correlationId, metadata.correlationId) && C19383o.m32792b(this.visitorId, metadata.visitorId) && C19383o.m32792b(this.locale, metadata.locale) && C19383o.m32792b(this.objectType, metadata.objectType);
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final Integer getExecutionTimeMs() {
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
        Integer num = this.executionTimeMs;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.correlationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.visitorId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locale;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.objectType;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setCorrelationId(String str) {
        this.correlationId = str;
    }

    public final void setExecutionTimeMs(Integer num) {
        this.executionTimeMs = num;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setObjectType(String str) {
        this.objectType = str;
    }

    public final void setVisitorId(String str) {
        this.visitorId = str;
    }

    public String toString() {
        Integer num = this.executionTimeMs;
        String str = this.correlationId;
        String str2 = this.visitorId;
        String str3 = this.locale;
        String str4 = this.objectType;
        StringBuilder sb = new StringBuilder();
        sb.append("Metadata(executionTimeMs=");
        sb.append(num);
        sb.append(", correlationId=");
        sb.append(str);
        sb.append(", visitorId=");
        C0391c.m1061h(sb, str2, ", locale=", str3, ", objectType=");
        return C0023f.m110k(sb, str4, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Metadata(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.domain.Metadata.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
