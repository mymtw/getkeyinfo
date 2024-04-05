package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowPromptAction */
public final class ReviewFlowPromptAction {

    /* renamed from: a */
    public String f26009a;

    /* renamed from: b */
    public String f26010b;

    /* renamed from: c */
    public List<ReviewFlowNavigationOption> f26011c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewFlowPromptAction(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EmptyList.INSTANCE : list);
    }

    public final ReviewFlowPromptAction copy(@C17402n(name = "display_title_text") String str, @C17402n(name = "display_text") String str2, @C17402n(name = "cta_options") List<ReviewFlowNavigationOption> list) {
        C19383o.m32797g(list, "callToActionOptions");
        return new ReviewFlowPromptAction(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowPromptAction)) {
            return false;
        }
        ReviewFlowPromptAction reviewFlowPromptAction = (ReviewFlowPromptAction) obj;
        return C19383o.m32792b(this.f26009a, reviewFlowPromptAction.f26009a) && C19383o.m32792b(this.f26010b, reviewFlowPromptAction.f26010b) && C19383o.m32792b(this.f26011c, reviewFlowPromptAction.f26011c);
    }

    public final int hashCode() {
        String str = this.f26009a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26010b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f26011c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowPromptAction(displayTitleText=");
        h.append(this.f26009a);
        h.append(", displayText=");
        h.append(this.f26010b);
        h.append(", callToActionOptions=");
        return C0070b.m186i(h, this.f26011c, ')');
    }

    public ReviewFlowPromptAction(@C17402n(name = "display_title_text") String str, @C17402n(name = "display_text") String str2, @C17402n(name = "cta_options") List<ReviewFlowNavigationOption> list) {
        C19383o.m32797g(list, "callToActionOptions");
        this.f26009a = str;
        this.f26010b = str2;
        this.f26011c = list;
    }
}
