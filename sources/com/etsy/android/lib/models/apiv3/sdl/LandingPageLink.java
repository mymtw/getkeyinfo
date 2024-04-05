package com.etsy.android.lib.models.apiv3.sdl;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p415of.C13186o;

@C17403o(generateAdapter = true)
public final class LandingPageLink implements C13186o, LandingPageInfo, Parcelable, C8698l {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LandingPageLink> CREATOR = new Creator();
    private final String apiPath;
    private final String deepLink;
    private final String eventNameField;
    private transient int layout;
    private final String layoutField;
    private final String linkTitleField;
    private final String methodField;
    private final Map<String, String> options;
    private String pageTitleField;
    private final String pageType;
    private final HashMap<String, String> params;
    private transient int requestMethod;

    public static final class Creator implements Parcelable.Creator<LandingPageLink> {
        public final LandingPageLink createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new LandingPageLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final LandingPageLink[] newArray(int i) {
            return new LandingPageLink[i];
        }
    }

    public LandingPageLink() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r8.equals("post") == false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LandingPageLink(@com.squareup.moshi.C17402n(name = "api_path") java.lang.String r2, @com.squareup.moshi.C17402n(name = "link_title") java.lang.String r3, @com.squareup.moshi.C17402n(name = "layout") java.lang.String r4, @com.squareup.moshi.C17402n(name = "page_type") java.lang.String r5, @com.squareup.moshi.C17402n(name = "page_title") java.lang.String r6, @com.squareup.moshi.C17402n(name = "event_name") java.lang.String r7, @com.squareup.moshi.C17402n(name = "method") java.lang.String r8, @com.squareup.moshi.C17402n(name = "deep_link") java.lang.String r9) {
        /*
            r1 = this;
            java.lang.String r0 = "apiPath"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "linkTitleField"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "layoutField"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "pageType"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.lang.String r0 = "pageTitleField"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.lang.String r0 = "eventNameField"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "methodField"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r1.<init>()
            r1.apiPath = r2
            r1.linkTitleField = r3
            r1.layoutField = r4
            r1.pageType = r5
            r1.pageTitleField = r6
            r1.eventNameField = r7
            r1.methodField = r8
            r1.deepLink = r9
            int r2 = r4.hashCode()
            r3 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            r5 = 1
            r6 = 0
            r7 = 2
            if (r2 == r3) goto L_0x005e
            r3 = 3181382(0x308b46, float:4.458066E-39)
            if (r2 == r3) goto L_0x0057
            r3 = 1839260940(0x6da0e50c, float:6.224313E27)
            if (r2 == r3) goto L_0x004d
            goto L_0x0066
        L_0x004d:
            java.lang.String r2 = "staggered"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = r6
            goto L_0x0069
        L_0x0057:
            java.lang.String r2 = "grid"
            boolean r2 = r4.equals(r2)
            goto L_0x0066
        L_0x005e:
            java.lang.String r2 = "linear"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0068
        L_0x0066:
            r2 = r7
            goto L_0x0069
        L_0x0068:
            r2 = r5
        L_0x0069:
            r1.layout = r2
            int r2 = r8.hashCode()
            switch(r2) {
                case -1335458389: goto L_0x008e;
                case 102230: goto L_0x0087;
                case 111375: goto L_0x007c;
                case 3446944: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0099
        L_0x0073:
            java.lang.String r2 = "post"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x009a
            goto L_0x0099
        L_0x007c:
            java.lang.String r2 = "put"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0085
            goto L_0x0099
        L_0x0085:
            r5 = r7
            goto L_0x009a
        L_0x0087:
            java.lang.String r2 = "get"
            boolean r2 = r8.equals(r2)
            goto L_0x0099
        L_0x008e:
            java.lang.String r2 = "delete"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r5 = 3
            goto L_0x009a
        L_0x0099:
            r5 = r6
        L_0x009a:
            r1.requestMethod = r5
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.params = r2
            java.util.Map r2 = kotlin.collections.C19294b0.m32559p0()
            r1.options = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.LandingPageLink.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ LandingPageLink copy$default(LandingPageLink landingPageLink, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        LandingPageLink landingPageLink2 = landingPageLink;
        int i2 = i;
        return landingPageLink.copy((i2 & 1) != 0 ? landingPageLink.getApiPath() : str, (i2 & 2) != 0 ? landingPageLink2.linkTitleField : str2, (i2 & 4) != 0 ? landingPageLink2.layoutField : str3, (i2 & 8) != 0 ? landingPageLink.getPageType() : str4, (i2 & 16) != 0 ? landingPageLink2.pageTitleField : str5, (i2 & 32) != 0 ? landingPageLink2.eventNameField : str6, (i2 & 64) != 0 ? landingPageLink2.methodField : str7, (i2 & 128) != 0 ? landingPageLink.getDeepLink() : str8);
    }

    public final String component1() {
        return getApiPath();
    }

    public final String component2() {
        return this.linkTitleField;
    }

    public final String component3() {
        return this.layoutField;
    }

    public final String component4() {
        return getPageType();
    }

    public final String component5() {
        return this.pageTitleField;
    }

    public final String component6() {
        return this.eventNameField;
    }

    public final String component7() {
        return this.methodField;
    }

    public final String component8() {
        return getDeepLink();
    }

    public final LandingPageLink copy(@C17402n(name = "api_path") String str, @C17402n(name = "link_title") String str2, @C17402n(name = "layout") String str3, @C17402n(name = "page_type") String str4, @C17402n(name = "page_title") String str5, @C17402n(name = "event_name") String str6, @C17402n(name = "method") String str7, @C17402n(name = "deep_link") String str8) {
        C19383o.m32797g(str, "apiPath");
        C19383o.m32797g(str2, "linkTitleField");
        C19383o.m32797g(str3, "layoutField");
        C19383o.m32797g(str4, "pageType");
        C19383o.m32797g(str5, "pageTitleField");
        String str9 = str6;
        C19383o.m32797g(str9, "eventNameField");
        String str10 = str7;
        C19383o.m32797g(str10, "methodField");
        return new LandingPageLink(str, str2, str3, str4, str5, str9, str10, str8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingPageLink)) {
            return false;
        }
        LandingPageLink landingPageLink = (LandingPageLink) obj;
        return C19383o.m32792b(getApiPath(), landingPageLink.getApiPath()) && C19383o.m32792b(this.linkTitleField, landingPageLink.linkTitleField) && C19383o.m32792b(this.layoutField, landingPageLink.layoutField) && C19383o.m32792b(getPageType(), landingPageLink.getPageType()) && C19383o.m32792b(this.pageTitleField, landingPageLink.pageTitleField) && C19383o.m32792b(this.eventNameField, landingPageLink.eventNameField) && C19383o.m32792b(this.methodField, landingPageLink.methodField) && C19383o.m32792b(getDeepLink(), landingPageLink.getDeepLink());
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

    public final String getMethodField() {
        return this.methodField;
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
        return this.requestMethod;
    }

    public int getViewType() {
        return R.id.view_type_section_link_footer;
    }

    public int hashCode() {
        return C0023f.m105e(this.methodField, C0023f.m105e(this.eventNameField, C0023f.m105e(this.pageTitleField, (getPageType().hashCode() + C0023f.m105e(this.layoutField, C0023f.m105e(this.linkTitleField, getApiPath().hashCode() * 31, 31), 31)) * 31, 31), 31), 31) + (getDeepLink() == null ? 0 : getDeepLink().hashCode());
    }

    public boolean isPaginateForNext() {
        return LandingPageInfo.DefaultImpls.isPaginateForNext(this);
    }

    public void setLayout(int i) {
        this.layout = i;
    }

    public final void setPageTitle(String str) {
        C19383o.m32797g(str, "pageTitle");
        this.pageTitleField = str;
    }

    public final void setPageTitleField(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.pageTitleField = str;
    }

    public void setRequestMethod(int i) {
        this.requestMethod = i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("LandingPageLink(apiPath=");
        h.append(getApiPath());
        h.append(", linkTitleField=");
        h.append(this.linkTitleField);
        h.append(", layoutField=");
        h.append(this.layoutField);
        h.append(", pageType=");
        h.append(getPageType());
        h.append(", pageTitleField=");
        h.append(this.pageTitleField);
        h.append(", eventNameField=");
        h.append(this.eventNameField);
        h.append(", methodField=");
        h.append(this.methodField);
        h.append(", deepLink=");
        h.append(getDeepLink());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.apiPath);
        parcel.writeString(this.linkTitleField);
        parcel.writeString(this.layoutField);
        parcel.writeString(this.pageType);
        parcel.writeString(this.pageTitleField);
        parcel.writeString(this.eventNameField);
        parcel.writeString(this.methodField);
        parcel.writeString(this.deepLink);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LandingPageLink(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r10
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r11
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r12
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "listings"
            goto L_0x0021
        L_0x0020:
            r5 = r13
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x002f
        L_0x002e:
            r7 = r15
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r16
        L_0x0037:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = r17
        L_0x003e:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.LandingPageLink.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
