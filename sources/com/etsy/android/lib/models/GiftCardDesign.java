package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class GiftCardDesign implements IFullImage {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int GIFT_CARD_DESIGN_ETSY_LOGO = 4;

    /* renamed from: id */
    private int f19134id;
    private String url150x119;
    private String url280x166;
    private String url560x332;
    private String url69x69;
    private String urlBanner;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GiftCardDesign() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public GiftCardDesign(@C17402n(name = "design_id") int i, @C17402n(name = "url_69x69") String str, @C17402n(name = "url_150x119") String str2, @C17402n(name = "url_280x166") String str3, @C17402n(name = "url_560x332") String str4, @C17402n(name = "url_banner") String str5) {
        C19383o.m32797g(str, "url69x69");
        C19383o.m32797g(str2, "url150x119");
        C19383o.m32797g(str3, "url280x166");
        C19383o.m32797g(str4, "url560x332");
        C19383o.m32797g(str5, "urlBanner");
        this.f19134id = i;
        this.url69x69 = str;
        this.url150x119 = str2;
        this.url280x166 = str3;
        this.url560x332 = str4;
        this.urlBanner = str5;
    }

    public static /* synthetic */ GiftCardDesign copy$default(GiftCardDesign giftCardDesign, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = giftCardDesign.f19134id;
        }
        if ((i2 & 2) != 0) {
            str = giftCardDesign.url69x69;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = giftCardDesign.url150x119;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = giftCardDesign.url280x166;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = giftCardDesign.url560x332;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = giftCardDesign.urlBanner;
        }
        return giftCardDesign.copy(i, str6, str7, str8, str9, str5);
    }

    public final int component1() {
        return this.f19134id;
    }

    public final String component2() {
        return this.url69x69;
    }

    public final String component3() {
        return this.url150x119;
    }

    public final String component4() {
        return this.url280x166;
    }

    public final String component5() {
        return this.url560x332;
    }

    public final String component6() {
        return this.urlBanner;
    }

    public final GiftCardDesign copy(@C17402n(name = "design_id") int i, @C17402n(name = "url_69x69") String str, @C17402n(name = "url_150x119") String str2, @C17402n(name = "url_280x166") String str3, @C17402n(name = "url_560x332") String str4, @C17402n(name = "url_banner") String str5) {
        C19383o.m32797g(str, "url69x69");
        C19383o.m32797g(str2, "url150x119");
        C19383o.m32797g(str3, "url280x166");
        C19383o.m32797g(str4, "url560x332");
        C19383o.m32797g(str5, "urlBanner");
        return new GiftCardDesign(i, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardDesign)) {
            return false;
        }
        GiftCardDesign giftCardDesign = (GiftCardDesign) obj;
        return this.f19134id == giftCardDesign.f19134id && C19383o.m32792b(this.url69x69, giftCardDesign.url69x69) && C19383o.m32792b(this.url150x119, giftCardDesign.url150x119) && C19383o.m32792b(this.url280x166, giftCardDesign.url280x166) && C19383o.m32792b(this.url560x332, giftCardDesign.url560x332) && C19383o.m32792b(this.urlBanner, giftCardDesign.urlBanner);
    }

    public String get4to3ImageUrlForPixelWidth(int i) {
        return this.url150x119;
    }

    public int getFullHeight() {
        return 69;
    }

    public String getFullHeightImageUrlForPixelWidth(int i) {
        return this.url150x119;
    }

    public int getFullWidth() {
        return 69;
    }

    public final int getId() {
        return this.f19134id;
    }

    public int getImageColor() {
        return 0;
    }

    public final String getUrl150x119() {
        return this.url150x119;
    }

    public final String getUrl280x166() {
        return this.url280x166;
    }

    public final String getUrl560x332() {
        return this.url560x332;
    }

    public final String getUrl69x69() {
        return this.url69x69;
    }

    public final String getUrlBanner() {
        return this.urlBanner;
    }

    public int hashCode() {
        return this.urlBanner.hashCode() + C0023f.m105e(this.url560x332, C0023f.m105e(this.url280x166, C0023f.m105e(this.url150x119, C0023f.m105e(this.url69x69, Integer.hashCode(this.f19134id) * 31, 31), 31), 31), 31);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.lib.models.GiftCardDesign parseData(com.fasterxml.jackson.core.JsonParser r4) {
        /*
            r3 = this;
            java.lang.String r0 = "jp"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
        L_0x0005:
            com.fasterxml.jackson.core.JsonToken r0 = r4.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00a2
            java.lang.String r0 = r4.getCurrentName()
            java.lang.String r1 = "jp.currentName"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            r4.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = r4.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r1 == r2) goto L_0x0005
            int r1 = r0.hashCode()
            switch(r1) {
                case -1509214701: goto L_0x008a;
                case -851538948: goto L_0x0077;
                case -69287736: goto L_0x0065;
                case 1096039865: goto L_0x0053;
                case 1661628220: goto L_0x003d;
                case 1812361309: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x009d
        L_0x002a:
            java.lang.String r1 = "url_150x119"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0034
            goto L_0x009d
        L_0x0034:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringURL(r4)
            r3.url150x119 = r0
            goto L_0x0005
        L_0x003d:
            java.lang.String r1 = "design_id"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x009d
        L_0x0046:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringIdOrNumericValue(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.f19134id = r0
            goto L_0x0005
        L_0x0053:
            java.lang.String r1 = "url_560x332"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            goto L_0x009d
        L_0x005c:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringURL(r4)
            r3.url560x332 = r0
            goto L_0x0005
        L_0x0065:
            java.lang.String r1 = "url_69x69"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
            goto L_0x009d
        L_0x006e:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringURL(r4)
            r3.url69x69 = r0
            goto L_0x0005
        L_0x0077:
            java.lang.String r1 = "url_banner"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0080
            goto L_0x009d
        L_0x0080:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringURL(r4)
            r3.urlBanner = r0
            goto L_0x0005
        L_0x008a:
            java.lang.String r1 = "url_280x166"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseStringURL(r4)
            r3.url280x166 = r0
            goto L_0x0005
        L_0x009d:
            r4.skipChildren()
            goto L_0x0005
        L_0x00a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.GiftCardDesign.parseData(com.fasterxml.jackson.core.JsonParser):com.etsy.android.lib.models.GiftCardDesign");
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public final void setId(int i) {
        this.f19134id = i;
    }

    public final void setUrl150x119(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.url150x119 = str;
    }

    public final void setUrl280x166(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.url280x166 = str;
    }

    public final void setUrl560x332(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.url560x332 = str;
    }

    public final void setUrl69x69(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.url69x69 = str;
    }

    public final void setUrlBanner(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.urlBanner = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftCardDesign(id=");
        h.append(this.f19134id);
        h.append(", url69x69=");
        h.append(this.url69x69);
        h.append(", url150x119=");
        h.append(this.url150x119);
        h.append(", url280x166=");
        h.append(this.url280x166);
        h.append(", url560x332=");
        h.append(this.url560x332);
        h.append(", urlBanner=");
        return C0391c.m1057c(h, this.urlBanner, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GiftCardDesign(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0022
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r9
        L_0x0023:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r10
        L_0x0029:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.GiftCardDesign.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
