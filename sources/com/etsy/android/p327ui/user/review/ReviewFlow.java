package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlow */
public final class ReviewFlow {

    /* renamed from: a */
    public ReviewMetadata f25980a;

    /* renamed from: b */
    public List<ReviewCard> f25981b;

    public ReviewFlow(@C17402n(name = "metadata") ReviewMetadata reviewMetadata, @C17402n(name = "review_cards") List<ReviewCard> list) {
        C19383o.m32797g(reviewMetadata, ResponseConstants.METADATA);
        C19383o.m32797g(list, "reviewCards");
        this.f25980a = reviewMetadata;
        this.f25981b = list;
    }

    public final ReviewFlow copy(@C17402n(name = "metadata") ReviewMetadata reviewMetadata, @C17402n(name = "review_cards") List<ReviewCard> list) {
        C19383o.m32797g(reviewMetadata, ResponseConstants.METADATA);
        C19383o.m32797g(list, "reviewCards");
        return new ReviewFlow(reviewMetadata, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlow)) {
            return false;
        }
        ReviewFlow reviewFlow = (ReviewFlow) obj;
        return C19383o.m32792b(this.f25980a, reviewFlow.f25980a) && C19383o.m32792b(this.f25981b, reviewFlow.f25981b);
    }

    public final int hashCode() {
        return this.f25981b.hashCode() + (this.f25980a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlow(metadata=");
        h.append(this.f25980a);
        h.append(", reviewCards=");
        return C0070b.m186i(h, this.f25981b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewFlow(ReviewMetadata reviewMetadata, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reviewMetadata, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
