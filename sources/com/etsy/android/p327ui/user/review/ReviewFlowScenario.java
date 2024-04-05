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
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowScenario */
public final class ReviewFlowScenario {

    /* renamed from: a */
    public List<Integer> f26015a;

    /* renamed from: b */
    public List<ReviewFlowCardOrderType> f26016b;

    /* renamed from: c */
    public String f26017c;

    public ReviewFlowScenario(@C17402n(name = "eligible_ratings") List<Integer> list, @C17402n(name = "card_order") List<ReviewFlowCardOrderType> list2, @C17402n(name = "result_display_text") String str) {
        C19383o.m32797g(list, "eligibleRatings");
        C19383o.m32797g(list2, "cardOrder");
        this.f26015a = list;
        this.f26016b = list2;
        this.f26017c = str;
    }

    public final ReviewFlowScenario copy(@C17402n(name = "eligible_ratings") List<Integer> list, @C17402n(name = "card_order") List<ReviewFlowCardOrderType> list2, @C17402n(name = "result_display_text") String str) {
        C19383o.m32797g(list, "eligibleRatings");
        C19383o.m32797g(list2, "cardOrder");
        return new ReviewFlowScenario(list, list2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowScenario)) {
            return false;
        }
        ReviewFlowScenario reviewFlowScenario = (ReviewFlowScenario) obj;
        return C19383o.m32792b(this.f26015a, reviewFlowScenario.f26015a) && C19383o.m32792b(this.f26016b, reviewFlowScenario.f26016b) && C19383o.m32792b(this.f26017c, reviewFlowScenario.f26017c);
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f26016b, this.f26015a.hashCode() * 31, 31);
        String str = this.f26017c;
        return g + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowScenario(eligibleRatings=");
        h.append(this.f26015a);
        h.append(", cardOrder=");
        h.append(this.f26016b);
        h.append(", resultDisplayText=");
        return C0391c.m1057c(h, this.f26017c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewFlowScenario(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list, list2, str);
    }
}
