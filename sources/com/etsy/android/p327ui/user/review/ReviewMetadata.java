package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewMetadata */
public final class ReviewMetadata {

    /* renamed from: a */
    public ReviewFlowAction f26035a;

    /* renamed from: b */
    public List<ReviewFlowScenario> f26036b;

    /* renamed from: c */
    public Integer f26037c;

    /* renamed from: d */
    public String f26038d;

    public ReviewMetadata(@C17402n(name = "post_action") ReviewFlowAction reviewFlowAction, @C17402n(name = "scenarios") List<ReviewFlowScenario> list, @C17402n(name = "current_rating") Integer num, String str) {
        C19383o.m32797g(list, "scenarios");
        this.f26035a = reviewFlowAction;
        this.f26036b = list;
        this.f26037c = num;
        this.f26038d = str;
    }

    public final ReviewMetadata copy(@C17402n(name = "post_action") ReviewFlowAction reviewFlowAction, @C17402n(name = "scenarios") List<ReviewFlowScenario> list, @C17402n(name = "current_rating") Integer num, String str) {
        C19383o.m32797g(list, "scenarios");
        return new ReviewMetadata(reviewFlowAction, list, num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewMetadata)) {
            return false;
        }
        ReviewMetadata reviewMetadata = (ReviewMetadata) obj;
        return C19383o.m32792b(this.f26035a, reviewMetadata.f26035a) && C19383o.m32792b(this.f26036b, reviewMetadata.f26036b) && C19383o.m32792b(this.f26037c, reviewMetadata.f26037c) && C19383o.m32792b(this.f26038d, reviewMetadata.f26038d);
    }

    public final int hashCode() {
        ReviewFlowAction reviewFlowAction = this.f26035a;
        int i = 0;
        int g = C13983i.m21488g(this.f26036b, (reviewFlowAction == null ? 0 : reviewFlowAction.hashCode()) * 31, 31);
        Integer num = this.f26037c;
        int hashCode = (g + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f26038d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewMetadata(postAction=");
        h.append(this.f26035a);
        h.append(", scenarios=");
        h.append(this.f26036b);
        h.append(", overallRating=");
        h.append(this.f26037c);
        h.append(", transactionId=");
        return C0391c.m1057c(h, this.f26038d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewMetadata(ReviewFlowAction reviewFlowAction, List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reviewFlowAction, list, num, (i & 8) != 0 ? null : str);
    }
}
