package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowWordCountDisplayOption */
public final class ReviewFlowWordCountDisplayOption {

    /* renamed from: a */
    public Integer f26030a;

    /* renamed from: b */
    public String f26031b;

    public ReviewFlowWordCountDisplayOption(@C17402n(name = "word_count") Integer num, @C17402n(name = "display_text") String str) {
        this.f26030a = num;
        this.f26031b = str;
    }

    public final ReviewFlowWordCountDisplayOption copy(@C17402n(name = "word_count") Integer num, @C17402n(name = "display_text") String str) {
        return new ReviewFlowWordCountDisplayOption(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowWordCountDisplayOption)) {
            return false;
        }
        ReviewFlowWordCountDisplayOption reviewFlowWordCountDisplayOption = (ReviewFlowWordCountDisplayOption) obj;
        return C19383o.m32792b(this.f26030a, reviewFlowWordCountDisplayOption.f26030a) && C19383o.m32792b(this.f26031b, reviewFlowWordCountDisplayOption.f26031b);
    }

    public final int hashCode() {
        Integer num = this.f26030a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f26031b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowWordCountDisplayOption(wordCount=");
        h.append(this.f26030a);
        h.append(", displayText=");
        return C0391c.m1057c(h, this.f26031b, ')');
    }
}
