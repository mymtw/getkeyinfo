package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.stylekit.views.CollageAlert;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Alert {
    public static final int $stable = 0;
    private final String analyticsName;
    private final String body;
    private final String deepLink;
    private final String deepLinkTitle;
    private final String iconId;
    private final boolean showDisclosureIndicator;
    private final String title;
    private final AlertType type;

    public Alert(@C17402n(name = "type") AlertType alertType, @C17402n(name = "title") String str, @C17402n(name = "body") String str2, @C17402n(name = "icon") String str3, @C17402n(name = "deep_link") String str4, @C17402n(name = "deep_link_title") String str5, @C17402n(name = "show_disclosure_indicator") boolean z, @C17402n(name = "analytics_name") String str6) {
        C19383o.m32797g(alertType, "type");
        this.type = alertType;
        this.title = str;
        this.body = str2;
        this.iconId = str3;
        this.deepLink = str4;
        this.deepLinkTitle = str5;
        this.showDisclosureIndicator = z;
        this.analyticsName = str6;
    }

    public static /* synthetic */ Alert copy$default(Alert alert, AlertType alertType, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        Alert alert2 = alert;
        int i2 = i;
        return alert.copy((i2 & 1) != 0 ? alert2.type : alertType, (i2 & 2) != 0 ? alert2.title : str, (i2 & 4) != 0 ? alert2.body : str2, (i2 & 8) != 0 ? alert2.iconId : str3, (i2 & 16) != 0 ? alert2.deepLink : str4, (i2 & 32) != 0 ? alert2.deepLinkTitle : str5, (i2 & 64) != 0 ? alert2.showDisclosureIndicator : z, (i2 & 128) != 0 ? alert2.analyticsName : str6);
    }

    public final AlertType component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final String component4() {
        return this.iconId;
    }

    public final String component5() {
        return this.deepLink;
    }

    public final String component6() {
        return this.deepLinkTitle;
    }

    public final boolean component7() {
        return this.showDisclosureIndicator;
    }

    public final String component8() {
        return this.analyticsName;
    }

    public final Alert copy(@C17402n(name = "type") AlertType alertType, @C17402n(name = "title") String str, @C17402n(name = "body") String str2, @C17402n(name = "icon") String str3, @C17402n(name = "deep_link") String str4, @C17402n(name = "deep_link_title") String str5, @C17402n(name = "show_disclosure_indicator") boolean z, @C17402n(name = "analytics_name") String str6) {
        C19383o.m32797g(alertType, "type");
        return new Alert(alertType, str, str2, str3, str4, str5, z, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alert)) {
            return false;
        }
        Alert alert = (Alert) obj;
        return this.type == alert.type && C19383o.m32792b(this.title, alert.title) && C19383o.m32792b(this.body, alert.body) && C19383o.m32792b(this.iconId, alert.iconId) && C19383o.m32792b(this.deepLink, alert.deepLink) && C19383o.m32792b(this.deepLinkTitle, alert.deepLinkTitle) && this.showDisclosureIndicator == alert.showDisclosureIndicator && C19383o.m32792b(this.analyticsName, alert.analyticsName);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBody() {
        return this.body;
    }

    public final CollageAlert.AlertType getCollageType() {
        return this.type.toCollageType();
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDeepLinkTitle() {
        return this.deepLinkTitle;
    }

    public final String getIconId() {
        return this.iconId;
    }

    public final boolean getShowDisclosureIndicator() {
        return this.showDisclosureIndicator;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AlertType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deepLink;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLinkTitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.showDisclosureIndicator;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str6 = this.analyticsName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Alert(type=");
        h.append(this.type);
        h.append(", title=");
        h.append(this.title);
        h.append(", body=");
        h.append(this.body);
        h.append(", iconId=");
        h.append(this.iconId);
        h.append(", deepLink=");
        h.append(this.deepLink);
        h.append(", deepLinkTitle=");
        h.append(this.deepLinkTitle);
        h.append(", showDisclosureIndicator=");
        h.append(this.showDisclosureIndicator);
        h.append(", analyticsName=");
        return C0391c.m1057c(h, this.analyticsName, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Alert(com.etsy.android.lib.models.apiv3.AlertType r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r16
        L_0x0034:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.Alert.<init>(com.etsy.android.lib.models.apiv3.AlertType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
