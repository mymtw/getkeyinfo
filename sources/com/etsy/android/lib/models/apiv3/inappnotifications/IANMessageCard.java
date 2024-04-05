package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class IANMessageCard {
    public static final int $stable = 0;
    private final String deepLinkUrl;
    private final String imageName;
    private final String linkTitle;
    private final String subtitle;
    private final String title;

    public IANMessageCard() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public IANMessageCard(@C17402n(name = "title") String str, @C17402n(name = "sub_title") String str2, @C17402n(name = "image") String str3, @C17402n(name = "link_title") String str4, @C17402n(name = "deep_link_url") String str5) {
        this.title = str;
        this.subtitle = str2;
        this.imageName = str3;
        this.linkTitle = str4;
        this.deepLinkUrl = str5;
    }

    public static /* synthetic */ IANMessageCard copy$default(IANMessageCard iANMessageCard, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iANMessageCard.title;
        }
        if ((i & 2) != 0) {
            str2 = iANMessageCard.subtitle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = iANMessageCard.imageName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = iANMessageCard.linkTitle;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = iANMessageCard.deepLinkUrl;
        }
        return iANMessageCard.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.imageName;
    }

    public final String component4() {
        return this.linkTitle;
    }

    public final String component5() {
        return this.deepLinkUrl;
    }

    public final IANMessageCard copy(@C17402n(name = "title") String str, @C17402n(name = "sub_title") String str2, @C17402n(name = "image") String str3, @C17402n(name = "link_title") String str4, @C17402n(name = "deep_link_url") String str5) {
        return new IANMessageCard(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IANMessageCard)) {
            return false;
        }
        IANMessageCard iANMessageCard = (IANMessageCard) obj;
        return C19383o.m32792b(this.title, iANMessageCard.title) && C19383o.m32792b(this.subtitle, iANMessageCard.subtitle) && C19383o.m32792b(this.imageName, iANMessageCard.imageName) && C19383o.m32792b(this.linkTitle, iANMessageCard.linkTitle) && C19383o.m32792b(this.deepLinkUrl, iANMessageCard.deepLinkUrl);
    }

    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getLinkTitle() {
        return this.linkTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLinkUrl;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("IANMessageCard(title=");
        h.append(this.title);
        h.append(", subtitle=");
        h.append(this.subtitle);
        h.append(", imageName=");
        h.append(this.imageName);
        h.append(", linkTitle=");
        h.append(this.linkTitle);
        h.append(", deepLinkUrl=");
        return C0391c.m1057c(h, this.deepLinkUrl, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IANMessageCard(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.IANMessageCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
