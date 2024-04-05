package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowNavigationOptionJsonAdapter */
public final class ReviewFlowNavigationOptionJsonAdapter extends JsonAdapter<ReviewFlowNavigationOption> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFlowNavigationOption> constructorRef;
    private final JsonAdapter<List<ReviewFlowNavigationOption>> listOfReviewFlowNavigationOptionAdapter;
    private final JsonAdapter<ReviewFlowAction> nullableReviewFlowActionAdapter;
    private final JsonAdapter<ReviewFlowPromptAction> nullableReviewFlowPromptActionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", ResponseConstants.DISPLAY_TEXT, "display_icon", ResponseConstants.ACTION, "prompt_action", "cta_options", "completion_display_text", "completion_display_image", "analytics_id");
    private final JsonAdapter<ReviewFlowNavigationOptionType> reviewFlowNavigationOptionTypeAdapter;

    public ReviewFlowNavigationOptionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.reviewFlowNavigationOptionTypeAdapter = yVar.mo68558c(ReviewFlowNavigationOptionType.class, emptySet, "type");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayText");
        this.nullableReviewFlowActionAdapter = yVar.mo68558c(ReviewFlowAction.class, emptySet, ResponseConstants.ACTION);
        this.nullableReviewFlowPromptActionAdapter = yVar.mo68558c(ReviewFlowPromptAction.class, emptySet, "promptAction");
        this.listOfReviewFlowNavigationOptionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewFlowNavigationOption.class), emptySet, "callToActionOptions");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        ReviewFlowNavigationOptionType reviewFlowNavigationOptionType = null;
        String str = null;
        String str2 = null;
        ReviewFlowAction reviewFlowAction = null;
        ReviewFlowPromptAction reviewFlowPromptAction = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    reviewFlowNavigationOptionType = this.reviewFlowNavigationOptionTypeAdapter.fromJson(jsonReader2);
                    if (reviewFlowNavigationOptionType != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("type", "type", jsonReader2);
                    }
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    reviewFlowAction = this.nullableReviewFlowActionAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    reviewFlowPromptAction = this.nullableReviewFlowPromptActionAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    list = this.listOfReviewFlowNavigationOptionAdapter.fromJson(jsonReader2);
                    if (list != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("callToActionOptions", "cta_options", jsonReader2);
                    }
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -33) {
            Constructor<ReviewFlowNavigationOption> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ReviewFlowNavigationOption.class.getDeclaredConstructor(new Class[]{ReviewFlowNavigationOptionType.class, cls, cls, ReviewFlowAction.class, ReviewFlowPromptAction.class, List.class, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ReviewFlowNavigationOpti…his.constructorRef = it }");
            }
            Object[] objArr = new Object[11];
            if (reviewFlowNavigationOptionType != null) {
                objArr[0] = reviewFlowNavigationOptionType;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = reviewFlowAction;
                objArr[4] = reviewFlowPromptAction;
                objArr[5] = list;
                objArr[6] = str3;
                objArr[7] = str4;
                objArr[8] = str5;
                objArr[9] = Integer.valueOf(i);
                objArr[10] = null;
                ReviewFlowNavigationOption newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("type", "type", jsonReader);
        } else if (reviewFlowNavigationOptionType != null) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption>");
            return new ReviewFlowNavigationOption(reviewFlowNavigationOptionType, str, str2, reviewFlowAction, reviewFlowPromptAction, list, str3, str4, str5);
        } else {
            throw C18215a.m30728g("type", "type", jsonReader2);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowNavigationOption reviewFlowNavigationOption = (ReviewFlowNavigationOption) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowNavigationOption != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.reviewFlowNavigationOptionTypeAdapter.toJson(wVar, reviewFlowNavigationOption.f25998a);
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewFlowNavigationOption.f25999b);
            wVar.mo68529h("display_icon");
            this.nullableStringAdapter.toJson(wVar, reviewFlowNavigationOption.f26000c);
            wVar.mo68529h(ResponseConstants.ACTION);
            this.nullableReviewFlowActionAdapter.toJson(wVar, reviewFlowNavigationOption.f26001d);
            wVar.mo68529h("prompt_action");
            this.nullableReviewFlowPromptActionAdapter.toJson(wVar, reviewFlowNavigationOption.f26002e);
            wVar.mo68529h("cta_options");
            this.listOfReviewFlowNavigationOptionAdapter.toJson(wVar, reviewFlowNavigationOption.f26003f);
            wVar.mo68529h("completion_display_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowNavigationOption.f26004g);
            wVar.mo68529h("completion_display_image");
            this.nullableStringAdapter.toJson(wVar, reviewFlowNavigationOption.f26005h);
            wVar.mo68529h("analytics_id");
            this.nullableStringAdapter.toJson(wVar, reviewFlowNavigationOption.f26006i);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowNavigationOption)";
    }
}
