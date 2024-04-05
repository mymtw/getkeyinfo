package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftCardDesign {
    public static final int $stable = 8;

    /* renamed from: id */
    private Integer f19156id;
    private String url150x119;
    private String url280x166;
    private String url560x332;
    private String url69x69;
    private String urlBanner;

    public GiftCardDesign(@C17402n(name = "design_id") Integer num, @C17402n(name = "url_69x69") String str, @C17402n(name = "url_150x119") String str2, @C17402n(name = "url_280x166") String str3, @C17402n(name = "url_560x332") String str4, @C17402n(name = "url_banner") String str5) {
        this.f19156id = num;
        this.url69x69 = str;
        this.url150x119 = str2;
        this.url280x166 = str3;
        this.url560x332 = str4;
        this.urlBanner = str5;
    }

    public static /* synthetic */ GiftCardDesign copy$default(GiftCardDesign giftCardDesign, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = giftCardDesign.f19156id;
        }
        if ((i & 2) != 0) {
            str = giftCardDesign.url69x69;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = giftCardDesign.url150x119;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = giftCardDesign.url280x166;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = giftCardDesign.url560x332;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = giftCardDesign.urlBanner;
        }
        return giftCardDesign.copy(num, str6, str7, str8, str9, str5);
    }

    public final Integer component1() {
        return this.f19156id;
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

    public final GiftCardDesign copy(@C17402n(name = "design_id") Integer num, @C17402n(name = "url_69x69") String str, @C17402n(name = "url_150x119") String str2, @C17402n(name = "url_280x166") String str3, @C17402n(name = "url_560x332") String str4, @C17402n(name = "url_banner") String str5) {
        return new GiftCardDesign(num, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardDesign)) {
            return false;
        }
        GiftCardDesign giftCardDesign = (GiftCardDesign) obj;
        return C19383o.m32792b(this.f19156id, giftCardDesign.f19156id) && C19383o.m32792b(this.url69x69, giftCardDesign.url69x69) && C19383o.m32792b(this.url150x119, giftCardDesign.url150x119) && C19383o.m32792b(this.url280x166, giftCardDesign.url280x166) && C19383o.m32792b(this.url560x332, giftCardDesign.url560x332) && C19383o.m32792b(this.urlBanner, giftCardDesign.urlBanner);
    }

    public final Integer getId() {
        return this.f19156id;
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
        Integer num = this.f19156id;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.url69x69;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url150x119;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url280x166;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url560x332;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.urlBanner;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setId(Integer num) {
        this.f19156id = num;
    }

    public final void setUrl150x119(String str) {
        this.url150x119 = str;
    }

    public final void setUrl280x166(String str) {
        this.url280x166 = str;
    }

    public final void setUrl560x332(String str) {
        this.url560x332 = str;
    }

    public final void setUrl69x69(String str) {
        this.url69x69 = str;
    }

    public final void setUrlBanner(String str) {
        this.urlBanner = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftCardDesign(id=");
        h.append(this.f19156id);
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
}
