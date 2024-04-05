package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowNavigationOption */
public final class ReviewFlowNavigationOption {

    /* renamed from: a */
    public ReviewFlowNavigationOptionType f25998a;

    /* renamed from: b */
    public String f25999b;

    /* renamed from: c */
    public String f26000c;

    /* renamed from: d */
    public ReviewFlowAction f26001d;

    /* renamed from: e */
    public ReviewFlowPromptAction f26002e;

    /* renamed from: f */
    public List<ReviewFlowNavigationOption> f26003f;

    /* renamed from: g */
    public String f26004g;

    /* renamed from: h */
    public String f26005h;

    /* renamed from: i */
    public String f26006i;

    /* renamed from: j */
    public final transient C11699a f26007j;

    /* renamed from: com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a */
    public static final class C11699a implements ITrackedObject {

        /* renamed from: b */
        public final /* synthetic */ ReviewFlowNavigationOption f26008b;

        public C11699a(ReviewFlowNavigationOption reviewFlowNavigationOption) {
            this.f26008b = reviewFlowNavigationOption;
        }

        @JsonIgnore
        public final List<C8696j> getOnSeenTrackingEvents() {
            return new ArrayList();
        }

        @JsonIgnore
        public final int getTrackedPosition() {
            return 0;
        }

        public final String getTrackingName() {
            String str = this.f26008b.f26006i;
            return str == null ? "ReviewFlowNavigationOption" : str;
        }

        @JsonIgnore
        public final Map<AnalyticsProperty, Object> getTrackingParameters() {
            return null;
        }

        @JsonIgnore
        public final void setOnSeenTrackingEvents(List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public final void setTrackedPosition(int i) {
        }

        public final void setTrackingName(String str) {
        }

        @JsonIgnore
        public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewFlowNavigationOption(ReviewFlowNavigationOptionType reviewFlowNavigationOptionType, String str, String str2, ReviewFlowAction reviewFlowAction, ReviewFlowPromptAction reviewFlowPromptAction, List list, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reviewFlowNavigationOptionType, str, str2, reviewFlowAction, reviewFlowPromptAction, (i & 32) != 0 ? EmptyList.INSTANCE : list, str3, str4, str5);
    }

    public final ReviewFlowNavigationOption copy(@C17402n(name = "type") ReviewFlowNavigationOptionType reviewFlowNavigationOptionType, @C17402n(name = "display_text") String str, @C17402n(name = "display_icon") String str2, @C17402n(name = "action") ReviewFlowAction reviewFlowAction, @C17402n(name = "prompt_action") ReviewFlowPromptAction reviewFlowPromptAction, @C17402n(name = "cta_options") List<ReviewFlowNavigationOption> list, @C17402n(name = "completion_display_text") String str3, @C17402n(name = "completion_display_image") String str4, @C17402n(name = "analytics_id") String str5) {
        C19383o.m32797g(reviewFlowNavigationOptionType, "type");
        List<ReviewFlowNavigationOption> list2 = list;
        C19383o.m32797g(list2, "callToActionOptions");
        return new ReviewFlowNavigationOption(reviewFlowNavigationOptionType, str, str2, reviewFlowAction, reviewFlowPromptAction, list2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowNavigationOption)) {
            return false;
        }
        ReviewFlowNavigationOption reviewFlowNavigationOption = (ReviewFlowNavigationOption) obj;
        return this.f25998a == reviewFlowNavigationOption.f25998a && C19383o.m32792b(this.f25999b, reviewFlowNavigationOption.f25999b) && C19383o.m32792b(this.f26000c, reviewFlowNavigationOption.f26000c) && C19383o.m32792b(this.f26001d, reviewFlowNavigationOption.f26001d) && C19383o.m32792b(this.f26002e, reviewFlowNavigationOption.f26002e) && C19383o.m32792b(this.f26003f, reviewFlowNavigationOption.f26003f) && C19383o.m32792b(this.f26004g, reviewFlowNavigationOption.f26004g) && C19383o.m32792b(this.f26005h, reviewFlowNavigationOption.f26005h) && C19383o.m32792b(this.f26006i, reviewFlowNavigationOption.f26006i);
    }

    public final int hashCode() {
        int hashCode = this.f25998a.hashCode() * 31;
        String str = this.f25999b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26000c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewFlowAction reviewFlowAction = this.f26001d;
        int hashCode4 = (hashCode3 + (reviewFlowAction == null ? 0 : reviewFlowAction.hashCode())) * 31;
        ReviewFlowPromptAction reviewFlowPromptAction = this.f26002e;
        int g = C13983i.m21488g(this.f26003f, (hashCode4 + (reviewFlowPromptAction == null ? 0 : reviewFlowPromptAction.hashCode())) * 31, 31);
        String str3 = this.f26004g;
        int hashCode5 = (g + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26005h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26006i;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowNavigationOption(type=");
        h.append(this.f25998a);
        h.append(", displayText=");
        h.append(this.f25999b);
        h.append(", displayIcon=");
        h.append(this.f26000c);
        h.append(", action=");
        h.append(this.f26001d);
        h.append(", promptAction=");
        h.append(this.f26002e);
        h.append(", callToActionOptions=");
        h.append(this.f26003f);
        h.append(", completionDisplayText=");
        h.append(this.f26004g);
        h.append(", completionDisplayImage=");
        h.append(this.f26005h);
        h.append(", analyticsId=");
        return C0391c.m1057c(h, this.f26006i, ')');
    }

    public ReviewFlowNavigationOption(@C17402n(name = "type") ReviewFlowNavigationOptionType reviewFlowNavigationOptionType, @C17402n(name = "display_text") String str, @C17402n(name = "display_icon") String str2, @C17402n(name = "action") ReviewFlowAction reviewFlowAction, @C17402n(name = "prompt_action") ReviewFlowPromptAction reviewFlowPromptAction, @C17402n(name = "cta_options") List<ReviewFlowNavigationOption> list, @C17402n(name = "completion_display_text") String str3, @C17402n(name = "completion_display_image") String str4, @C17402n(name = "analytics_id") String str5) {
        C19383o.m32797g(reviewFlowNavigationOptionType, "type");
        C19383o.m32797g(list, "callToActionOptions");
        this.f25998a = reviewFlowNavigationOptionType;
        this.f25999b = str;
        this.f26000c = str2;
        this.f26001d = reviewFlowAction;
        this.f26002e = reviewFlowPromptAction;
        this.f26003f = list;
        this.f26004g = str3;
        this.f26005h = str4;
        this.f26006i = str5;
        this.f26007j = new C11699a(this);
    }
}
