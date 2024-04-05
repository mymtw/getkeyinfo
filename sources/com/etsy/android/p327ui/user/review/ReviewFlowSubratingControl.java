package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowSubratingControl */
public final class ReviewFlowSubratingControl {

    /* renamed from: a */
    public Integer f26022a;

    public ReviewFlowSubratingControl(@C17402n(name = "current_rating") Integer num) {
        this.f26022a = num;
    }

    public final ReviewFlowSubratingControl copy(@C17402n(name = "current_rating") Integer num) {
        return new ReviewFlowSubratingControl(num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewFlowSubratingControl) && C19383o.m32792b(this.f26022a, ((ReviewFlowSubratingControl) obj).f26022a);
    }

    public final int hashCode() {
        Integer num = this.f26022a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return C0023f.m109j(C0072d.m201h("ReviewFlowSubratingControl(currentRating="), this.f26022a, ')');
    }
}
