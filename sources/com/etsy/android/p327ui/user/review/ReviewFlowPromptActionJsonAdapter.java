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

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowPromptActionJsonAdapter */
public final class ReviewFlowPromptActionJsonAdapter extends JsonAdapter<ReviewFlowPromptAction> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFlowPromptAction> constructorRef;
    private final JsonAdapter<List<ReviewFlowNavigationOption>> listOfReviewFlowNavigationOptionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("display_title_text", ResponseConstants.DISPLAY_TEXT, "cta_options");

    public ReviewFlowPromptActionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayTitleText");
        this.listOfReviewFlowNavigationOptionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewFlowNavigationOption.class), emptySet, "callToActionOptions");
    }

    public final Object fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                list = this.listOfReviewFlowNavigationOptionAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("callToActionOptions", "cta_options", jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -5) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption>");
            return new ReviewFlowPromptAction(str, str2, list);
        }
        Constructor<ReviewFlowPromptAction> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewFlowPromptAction.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReviewFlowPromptAction::…his.constructorRef = it }");
        }
        ReviewFlowPromptAction newInstance = constructor.newInstance(new Object[]{str, str2, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowPromptAction reviewFlowPromptAction = (ReviewFlowPromptAction) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowPromptAction != null) {
            wVar.mo68522b();
            wVar.mo68529h("display_title_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowPromptAction.f26009a);
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewFlowPromptAction.f26010b);
            wVar.mo68529h("cta_options");
            this.listOfReviewFlowNavigationOptionAdapter.toJson(wVar, reviewFlowPromptAction.f26011c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowPromptAction)";
    }
}
