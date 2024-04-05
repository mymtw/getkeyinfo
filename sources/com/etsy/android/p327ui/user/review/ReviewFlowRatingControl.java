package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowRatingControl */
public final class ReviewFlowRatingControl {

    /* renamed from: a */
    public String f26012a;

    /* renamed from: b */
    public String f26013b;

    /* renamed from: c */
    public ReviewFlowSubratingControl f26014c;

    public ReviewFlowRatingControl(@C17402n(name = "display_title_text") String str, @C17402n(name = "rating_id") String str2, @C17402n(name = "star_rating_control") ReviewFlowSubratingControl reviewFlowSubratingControl) {
        this.f26012a = str;
        this.f26013b = str2;
        this.f26014c = reviewFlowSubratingControl;
    }

    public final ReviewFlowRatingControl copy(@C17402n(name = "display_title_text") String str, @C17402n(name = "rating_id") String str2, @C17402n(name = "star_rating_control") ReviewFlowSubratingControl reviewFlowSubratingControl) {
        return new ReviewFlowRatingControl(str, str2, reviewFlowSubratingControl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowRatingControl)) {
            return false;
        }
        ReviewFlowRatingControl reviewFlowRatingControl = (ReviewFlowRatingControl) obj;
        return C19383o.m32792b(this.f26012a, reviewFlowRatingControl.f26012a) && C19383o.m32792b(this.f26013b, reviewFlowRatingControl.f26013b) && C19383o.m32792b(this.f26014c, reviewFlowRatingControl.f26014c);
    }

    public final int hashCode() {
        String str = this.f26012a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26013b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewFlowSubratingControl reviewFlowSubratingControl = this.f26014c;
        if (reviewFlowSubratingControl != null) {
            i = reviewFlowSubratingControl.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowRatingControl(displayTitleText=");
        h.append(this.f26012a);
        h.append(", ratingId=");
        h.append(this.f26013b);
        h.append(", ratingControl=");
        h.append(this.f26014c);
        h.append(')');
        return h.toString();
    }
}
