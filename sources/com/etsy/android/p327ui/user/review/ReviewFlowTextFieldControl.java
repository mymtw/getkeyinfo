package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowTextFieldControl */
public final class ReviewFlowTextFieldControl {

    /* renamed from: a */
    public String f26023a;

    /* renamed from: b */
    public Boolean f26024b;

    /* renamed from: c */
    public String f26025c;

    /* renamed from: d */
    public Integer f26026d;

    /* renamed from: e */
    public Integer f26027e;

    /* renamed from: f */
    public List<ReviewFlowWordCountDisplayOption> f26028f;

    /* renamed from: g */
    public Boolean f26029g;

    public ReviewFlowTextFieldControl(@C17402n(name = "placeholder_display_text") String str, @C17402n(name = "text_required") Boolean bool, @C17402n(name = "current_text") String str2, @C17402n(name = "minimum_word_count") Integer num, @C17402n(name = "maximum_char_count") Integer num2, @C17402n(name = "minimum_word_count_display_text_options") List<ReviewFlowWordCountDisplayOption> list, Boolean bool2) {
        C19383o.m32797g(list, "wordCountDisplayOptions");
        this.f26023a = str;
        this.f26024b = bool;
        this.f26025c = str2;
        this.f26026d = num;
        this.f26027e = num2;
        this.f26028f = list;
        this.f26029g = bool2;
    }

    public final ReviewFlowTextFieldControl copy(@C17402n(name = "placeholder_display_text") String str, @C17402n(name = "text_required") Boolean bool, @C17402n(name = "current_text") String str2, @C17402n(name = "minimum_word_count") Integer num, @C17402n(name = "maximum_char_count") Integer num2, @C17402n(name = "minimum_word_count_display_text_options") List<ReviewFlowWordCountDisplayOption> list, Boolean bool2) {
        C19383o.m32797g(list, "wordCountDisplayOptions");
        return new ReviewFlowTextFieldControl(str, bool, str2, num, num2, list, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowTextFieldControl)) {
            return false;
        }
        ReviewFlowTextFieldControl reviewFlowTextFieldControl = (ReviewFlowTextFieldControl) obj;
        return C19383o.m32792b(this.f26023a, reviewFlowTextFieldControl.f26023a) && C19383o.m32792b(this.f26024b, reviewFlowTextFieldControl.f26024b) && C19383o.m32792b(this.f26025c, reviewFlowTextFieldControl.f26025c) && C19383o.m32792b(this.f26026d, reviewFlowTextFieldControl.f26026d) && C19383o.m32792b(this.f26027e, reviewFlowTextFieldControl.f26027e) && C19383o.m32792b(this.f26028f, reviewFlowTextFieldControl.f26028f) && C19383o.m32792b(this.f26029g, reviewFlowTextFieldControl.f26029g);
    }

    public final int hashCode() {
        String str = this.f26023a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f26024b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f26025c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f26026d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26027e;
        int g = C13983i.m21488g(this.f26028f, (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Boolean bool2 = this.f26029g;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowTextFieldControl(placeholderDisplayText=");
        h.append(this.f26023a);
        h.append(", textRequired=");
        h.append(this.f26024b);
        h.append(", currentText=");
        h.append(this.f26025c);
        h.append(", minWordCount=");
        h.append(this.f26026d);
        h.append(", maxCharCount=");
        h.append(this.f26027e);
        h.append(", wordCountDisplayOptions=");
        h.append(this.f26028f);
        h.append(", textIsValid=");
        h.append(this.f26029g);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewFlowTextFieldControl(String str, Boolean bool, String str2, Integer num, Integer num2, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, str2, num, num2, list, (i & 64) != 0 ? Boolean.FALSE : bool2);
    }
}
