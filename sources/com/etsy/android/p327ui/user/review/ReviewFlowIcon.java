package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowIcon */
public final class ReviewFlowIcon {

    /* renamed from: a */
    public final String f25993a;

    /* renamed from: b */
    public final String f25994b;

    public ReviewFlowIcon(@C17402n(name = "icon_type") String str, @C17402n(name = "icon_text") String str2) {
        C19383o.m32797g(str, "iconRes");
        C19383o.m32797g(str2, "iconText");
        this.f25993a = str;
        this.f25994b = str2;
    }

    public final ReviewFlowIcon copy(@C17402n(name = "icon_type") String str, @C17402n(name = "icon_text") String str2) {
        C19383o.m32797g(str, "iconRes");
        C19383o.m32797g(str2, "iconText");
        return new ReviewFlowIcon(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowIcon)) {
            return false;
        }
        ReviewFlowIcon reviewFlowIcon = (ReviewFlowIcon) obj;
        return C19383o.m32792b(this.f25993a, reviewFlowIcon.f25993a) && C19383o.m32792b(this.f25994b, reviewFlowIcon.f25994b);
    }

    public final int hashCode() {
        return this.f25994b.hashCode() + (this.f25993a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowIcon(iconRes=");
        h.append(this.f25993a);
        h.append(", iconText=");
        return C0391c.m1057c(h, this.f25994b, ')');
    }
}
