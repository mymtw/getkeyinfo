package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class FeedbackInfo {
    public static final int $stable = 0;
    private final Integer count;
    private final Integer score;

    public FeedbackInfo(@C17402n(name = "score") Integer num, @C17402n(name = "count") Integer num2) {
        this.score = num;
        this.count = num2;
    }

    public static /* synthetic */ FeedbackInfo copy$default(FeedbackInfo feedbackInfo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = feedbackInfo.score;
        }
        if ((i & 2) != 0) {
            num2 = feedbackInfo.count;
        }
        return feedbackInfo.copy(num, num2);
    }

    public final Integer component1() {
        return this.score;
    }

    public final Integer component2() {
        return this.count;
    }

    public final FeedbackInfo copy(@C17402n(name = "score") Integer num, @C17402n(name = "count") Integer num2) {
        return new FeedbackInfo(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackInfo)) {
            return false;
        }
        FeedbackInfo feedbackInfo = (FeedbackInfo) obj;
        return C19383o.m32792b(this.score, feedbackInfo.score) && C19383o.m32792b(this.count, feedbackInfo.count);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getScore() {
        return this.score;
    }

    public int hashCode() {
        Integer num = this.score;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FeedbackInfo(score=");
        h.append(this.score);
        h.append(", count=");
        return C0023f.m109j(h, this.count, ')');
    }
}
