package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowCheckboxControl */
public final class ReviewFlowCheckboxControl {

    /* renamed from: a */
    public String f25989a;

    /* renamed from: b */
    public List<String> f25990b;

    /* renamed from: c */
    public boolean f25991c;

    /* renamed from: d */
    public String f25992d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewFlowCheckboxControl(String str, List list, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? false : z, str2);
    }

    public final ReviewFlowCheckboxControl copy(@C17402n(name = "display_text") String str, @C17402n(name = "disable_ratings") List<String> list, @C17402n(name = "enabled") boolean z, @C17402n(name = "analytics_id") String str2) {
        C19383o.m32797g(list, "disableRatings");
        C19383o.m32797g(str2, "analyticsId");
        return new ReviewFlowCheckboxControl(str, list, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowCheckboxControl)) {
            return false;
        }
        ReviewFlowCheckboxControl reviewFlowCheckboxControl = (ReviewFlowCheckboxControl) obj;
        return C19383o.m32792b(this.f25989a, reviewFlowCheckboxControl.f25989a) && C19383o.m32792b(this.f25990b, reviewFlowCheckboxControl.f25990b) && this.f25991c == reviewFlowCheckboxControl.f25991c && C19383o.m32792b(this.f25992d, reviewFlowCheckboxControl.f25992d);
    }

    public final int hashCode() {
        String str = this.f25989a;
        int g = C13983i.m21488g(this.f25990b, (str == null ? 0 : str.hashCode()) * 31, 31);
        boolean z = this.f25991c;
        if (z) {
            z = true;
        }
        return this.f25992d.hashCode() + ((g + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowCheckboxControl(displayText=");
        h.append(this.f25989a);
        h.append(", disableRatings=");
        h.append(this.f25990b);
        h.append(", isChecked=");
        h.append(this.f25991c);
        h.append(", analyticsId=");
        return C0391c.m1057c(h, this.f25992d, ')');
    }

    public ReviewFlowCheckboxControl(@C17402n(name = "display_text") String str, @C17402n(name = "disable_ratings") List<String> list, @C17402n(name = "enabled") boolean z, @C17402n(name = "analytics_id") String str2) {
        C19383o.m32797g(list, "disableRatings");
        C19383o.m32797g(str2, "analyticsId");
        this.f25989a = str;
        this.f25990b = list;
        this.f25991c = z;
        this.f25992d = str2;
    }
}
