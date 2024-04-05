package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class LandingPageLink implements LandingPageInfo {
    public static final int $stable = 8;
    private final String apiPath;
    private final String deepLink;
    private final String eventNameField;
    private transient int layout;
    private final String layoutField;
    private final String linkTitleField;
    private final Map<String, String> options;
    private final String pageTitleField;
    private final String pageType;
    private final HashMap<String, String> params;

    public LandingPageLink() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public LandingPageLink(@C17402n(name = "api_path") String str, @C17402n(name = "link_title") String str2, @C17402n(name = "event_name") String str3, @C17402n(name = "page_type") String str4, @C17402n(name = "title") String str5, @C17402n(name = "layout") String str6, @C17402n(name = "deep_link") String str7) {
        C19383o.m32797g(str, "apiPath");
        C19383o.m32797g(str2, "linkTitleField");
        C19383o.m32797g(str3, "eventNameField");
        C19383o.m32797g(str4, "pageType");
        C19383o.m32797g(str5, "pageTitleField");
        C19383o.m32797g(str6, "layoutField");
        this.apiPath = str;
        this.linkTitleField = str2;
        this.eventNameField = str3;
        this.pageType = str4;
        this.pageTitleField = str5;
        this.layoutField = str6;
        this.deepLink = str7;
        int hashCode = str6.hashCode();
        int i = 2;
        if (hashCode != -1102672091) {
            if (hashCode == 3181382) {
                boolean equals = str6.equals(ResponseConstants.GRID);
            } else if (hashCode == 1839260940 && str6.equals(ResponseConstants.STAGGERED)) {
                i = 0;
            }
        } else if (str6.equals(ResponseConstants.LINEAR)) {
            i = 1;
        }
        this.layout = i;
        this.params = new HashMap<>();
        this.options = C19294b0.m32559p0();
    }

    public static /* synthetic */ LandingPageLink copy$default(LandingPageLink landingPageLink, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingPageLink.getApiPath();
        }
        if ((i & 2) != 0) {
            str2 = landingPageLink.linkTitleField;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = landingPageLink.eventNameField;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = landingPageLink.getPageType();
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = landingPageLink.pageTitleField;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = landingPageLink.layoutField;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = landingPageLink.getDeepLink();
        }
        return landingPageLink.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return getApiPath();
    }

    public final String component2() {
        return this.linkTitleField;
    }

    public final String component3() {
        return this.eventNameField;
    }

    public final String component4() {
        return getPageType();
    }

    public final String component5() {
        return this.pageTitleField;
    }

    public final String component6() {
        return this.layoutField;
    }

    public final String component7() {
        return getDeepLink();
    }

    public final LandingPageLink copy(@C17402n(name = "api_path") String str, @C17402n(name = "link_title") String str2, @C17402n(name = "event_name") String str3, @C17402n(name = "page_type") String str4, @C17402n(name = "title") String str5, @C17402n(name = "layout") String str6, @C17402n(name = "deep_link") String str7) {
        C19383o.m32797g(str, "apiPath");
        C19383o.m32797g(str2, "linkTitleField");
        C19383o.m32797g(str3, "eventNameField");
        C19383o.m32797g(str4, "pageType");
        C19383o.m32797g(str5, "pageTitleField");
        C19383o.m32797g(str6, "layoutField");
        return new LandingPageLink(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingPageLink)) {
            return false;
        }
        LandingPageLink landingPageLink = (LandingPageLink) obj;
        return C19383o.m32792b(getApiPath(), landingPageLink.getApiPath()) && C19383o.m32792b(this.linkTitleField, landingPageLink.linkTitleField) && C19383o.m32792b(this.eventNameField, landingPageLink.eventNameField) && C19383o.m32792b(getPageType(), landingPageLink.getPageType()) && C19383o.m32792b(this.pageTitleField, landingPageLink.pageTitleField) && C19383o.m32792b(this.layoutField, landingPageLink.layoutField) && C19383o.m32792b(getDeepLink(), landingPageLink.getDeepLink());
    }

    public String getApiPath() {
        return this.apiPath;
    }

    public Pair<String, File> getAttachment() {
        return LandingPageInfo.DefaultImpls.getAttachment(this);
    }

    public Map<String, String> getBodyParams() {
        return LandingPageInfo.DefaultImpls.getBodyParams(this);
    }

    public boolean getBooleanOption(String str) {
        return false;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getEventName() {
        return this.eventNameField;
    }

    public final String getEventNameField() {
        return this.eventNameField;
    }

    public int getLayout() {
        return this.layout;
    }

    public final String getLayoutField() {
        return this.layoutField;
    }

    public String getLinkTitle() {
        return this.linkTitleField;
    }

    public final String getLinkTitleField() {
        return this.linkTitleField;
    }

    public Map<String, String> getOptions() {
        return this.options;
    }

    public String getPageTitle() {
        return this.pageTitleField;
    }

    public final String getPageTitleField() {
        return this.pageTitleField;
    }

    public String getPageType() {
        return this.pageType;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public int getRequestMethod() {
        return 0;
    }

    public int hashCode() {
        return C0023f.m105e(this.layoutField, C0023f.m105e(this.pageTitleField, (getPageType().hashCode() + C0023f.m105e(this.eventNameField, C0023f.m105e(this.linkTitleField, getApiPath().hashCode() * 31, 31), 31)) * 31, 31), 31) + (getDeepLink() == null ? 0 : getDeepLink().hashCode());
    }

    public boolean isPaginateForNext() {
        return LandingPageInfo.DefaultImpls.isPaginateForNext(this);
    }

    public void setLayout(int i) {
        this.layout = i;
    }

    public void setRequestMethod(int i) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LandingPageLink(apiPath=");
        h.append(getApiPath());
        h.append(", linkTitleField=");
        h.append(this.linkTitleField);
        h.append(", eventNameField=");
        h.append(this.eventNameField);
        h.append(", pageType=");
        h.append(getPageType());
        h.append(", pageTitleField=");
        h.append(this.pageTitleField);
        h.append(", layoutField=");
        h.append(this.layoutField);
        h.append(", deepLink=");
        h.append(getDeepLink());
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LandingPageLink(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            java.lang.String r0 = ""
            if (r15 == 0) goto L_0x0008
            r15 = r0
            goto L_0x0009
        L_0x0008:
            r15 = r7
        L_0x0009:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            java.lang.String r10 = "shops"
        L_0x001d:
            r3 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002b
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = r12
        L_0x002c:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0032
            r14 = r0
            goto L_0x0033
        L_0x0032:
            r14 = r13
        L_0x0033:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
