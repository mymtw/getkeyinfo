package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowShopInfo */
public final class ReviewFlowShopInfo {

    /* renamed from: a */
    public String f26018a;

    /* renamed from: b */
    public Boolean f26019b;

    /* renamed from: c */
    public String f26020c;

    /* renamed from: d */
    public String f26021d;

    public ReviewFlowShopInfo(@C17402n(name = "shop_icon") String str, @C17402n(name = "shop_has_icon") Boolean bool, @C17402n(name = "shop_url") String str2, @C17402n(name = "title") String str3) {
        this.f26018a = str;
        this.f26019b = bool;
        this.f26020c = str2;
        this.f26021d = str3;
    }

    public final ReviewFlowShopInfo copy(@C17402n(name = "shop_icon") String str, @C17402n(name = "shop_has_icon") Boolean bool, @C17402n(name = "shop_url") String str2, @C17402n(name = "title") String str3) {
        return new ReviewFlowShopInfo(str, bool, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowShopInfo)) {
            return false;
        }
        ReviewFlowShopInfo reviewFlowShopInfo = (ReviewFlowShopInfo) obj;
        return C19383o.m32792b(this.f26018a, reviewFlowShopInfo.f26018a) && C19383o.m32792b(this.f26019b, reviewFlowShopInfo.f26019b) && C19383o.m32792b(this.f26020c, reviewFlowShopInfo.f26020c) && C19383o.m32792b(this.f26021d, reviewFlowShopInfo.f26021d);
    }

    public final int hashCode() {
        String str = this.f26018a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f26019b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f26020c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26021d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowShopInfo(shopIcon=");
        h.append(this.f26018a);
        h.append(", shopHasIcon=");
        h.append(this.f26019b);
        h.append(", shopUrl=");
        h.append(this.f26020c);
        h.append(", title=");
        return C0391c.m1057c(h, this.f26021d, ')');
    }
}
