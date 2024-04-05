package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowAction */
public final class ReviewFlowAction {

    /* renamed from: a */
    public ReviewFlowActionType f25982a;

    /* renamed from: b */
    public String f25983b;

    /* renamed from: c */
    public String f25984c;

    /* renamed from: d */
    public Boolean f25985d;

    /* renamed from: e */
    public String f25986e;

    public ReviewFlowAction(@C17402n(name = "type") ReviewFlowActionType reviewFlowActionType, String str, String str2, @C17402n(name = "auth_needed") Boolean bool, @C17402n(name = "success_display_title_text") String str3) {
        C19383o.m32797g(reviewFlowActionType, "actionType");
        this.f25982a = reviewFlowActionType;
        this.f25983b = str;
        this.f25984c = str2;
        this.f25985d = bool;
        this.f25986e = str3;
    }

    public final ReviewFlowAction copy(@C17402n(name = "type") ReviewFlowActionType reviewFlowActionType, String str, String str2, @C17402n(name = "auth_needed") Boolean bool, @C17402n(name = "success_display_title_text") String str3) {
        C19383o.m32797g(reviewFlowActionType, "actionType");
        return new ReviewFlowAction(reviewFlowActionType, str, str2, bool, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowAction)) {
            return false;
        }
        ReviewFlowAction reviewFlowAction = (ReviewFlowAction) obj;
        return this.f25982a == reviewFlowAction.f25982a && C19383o.m32792b(this.f25983b, reviewFlowAction.f25983b) && C19383o.m32792b(this.f25984c, reviewFlowAction.f25984c) && C19383o.m32792b(this.f25985d, reviewFlowAction.f25985d) && C19383o.m32792b(this.f25986e, reviewFlowAction.f25986e);
    }

    public final int hashCode() {
        int hashCode = this.f25982a.hashCode() * 31;
        String str = this.f25983b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25984c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f25985d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f25986e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowAction(actionType=");
        h.append(this.f25982a);
        h.append(", path=");
        h.append(this.f25983b);
        h.append(", method=");
        h.append(this.f25984c);
        h.append(", authNeeded=");
        h.append(this.f25985d);
        h.append(", successDisplayTitleText=");
        return C0391c.m1057c(h, this.f25986e, ')');
    }
}
