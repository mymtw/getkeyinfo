package com.etsy.android.p327ui.core.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.feedback.ReviewUiModel;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.review.f */
public final class C9716f {

    /* renamed from: a */
    public final int f21507a;

    /* renamed from: b */
    public final ReviewUiModel f21508b;

    /* renamed from: c */
    public final List<ReviewUiModel> f21509c;

    public C9716f(int i, ReviewUiModel reviewUiModel, List<ReviewUiModel> list) {
        C19383o.m32797g(reviewUiModel, "currentReview");
        this.f21507a = i;
        this.f21508b = reviewUiModel;
        this.f21509c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9716f)) {
            return false;
        }
        C9716f fVar = (C9716f) obj;
        return this.f21507a == fVar.f21507a && C19383o.m32792b(this.f21508b, fVar.f21508b) && C19383o.m32792b(this.f21509c, fVar.f21509c);
    }

    public final int hashCode() {
        int hashCode = this.f21508b.hashCode();
        return this.f21509c.hashCode() + ((hashCode + (Integer.hashCode(this.f21507a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ViewState(initialReviewPosition=");
        h.append(this.f21507a);
        h.append(", currentReview=");
        h.append(this.f21508b);
        h.append(", videoReviews=");
        return C0070b.m186i(h, this.f21509c, ')');
    }
}
