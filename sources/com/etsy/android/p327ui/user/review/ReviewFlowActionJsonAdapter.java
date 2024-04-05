package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowActionJsonAdapter */
public final class ReviewFlowActionJsonAdapter extends JsonAdapter<ReviewFlowAction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", ResponseConstants.PATH, ResponseConstants.METHOD, ResponseConstants.AUTH_NEEDED, "success_display_title_text");
    private final JsonAdapter<ReviewFlowActionType> reviewFlowActionTypeAdapter;

    public ReviewFlowActionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.reviewFlowActionTypeAdapter = yVar.mo68558c(ReviewFlowActionType.class, emptySet, "actionType");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.PATH);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "authNeeded");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        ReviewFlowActionType reviewFlowActionType = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                reviewFlowActionType = this.reviewFlowActionTypeAdapter.fromJson(jsonReader);
                if (reviewFlowActionType == null) {
                    throw C18215a.m30734m("actionType", "type", jsonReader);
                }
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (reviewFlowActionType != null) {
            return new ReviewFlowAction(reviewFlowActionType, str, str2, bool, str3);
        }
        throw C18215a.m30728g("actionType", "type", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowAction reviewFlowAction = (ReviewFlowAction) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowAction != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.reviewFlowActionTypeAdapter.toJson(wVar, reviewFlowAction.f25982a);
            wVar.mo68529h(ResponseConstants.PATH);
            this.nullableStringAdapter.toJson(wVar, reviewFlowAction.f25983b);
            wVar.mo68529h(ResponseConstants.METHOD);
            this.nullableStringAdapter.toJson(wVar, reviewFlowAction.f25984c);
            wVar.mo68529h(ResponseConstants.AUTH_NEEDED);
            this.nullableBooleanAdapter.toJson(wVar, reviewFlowAction.f25985d);
            wVar.mo68529h("success_display_title_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowAction.f25986e);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowAction)";
    }
}
