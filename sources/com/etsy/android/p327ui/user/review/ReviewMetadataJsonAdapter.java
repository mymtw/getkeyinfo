package com.etsy.android.p327ui.user.review;

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

/* renamed from: com.etsy.android.ui.user.review.ReviewMetadataJsonAdapter */
public final class ReviewMetadataJsonAdapter extends JsonAdapter<ReviewMetadata> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewMetadata> constructorRef;
    private final JsonAdapter<List<ReviewFlowScenario>> listOfReviewFlowScenarioAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<ReviewFlowAction> nullableReviewFlowActionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("post_action", "scenarios", "current_rating", "transactionId");

    public ReviewMetadataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableReviewFlowActionAdapter = yVar.mo68558c(ReviewFlowAction.class, emptySet, "postAction");
        this.listOfReviewFlowScenarioAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewFlowScenario.class), emptySet, "scenarios");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "overallRating");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "transactionId");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        ReviewFlowAction reviewFlowAction = null;
        Integer num = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                reviewFlowAction = this.nullableReviewFlowActionAdapter.fromJson(jsonReader2);
            } else if (Q == 1) {
                list = this.listOfReviewFlowScenarioAdapter.fromJson(jsonReader2);
                if (list == null) {
                    throw C18215a.m30734m("scenarios", "scenarios", jsonReader2);
                }
            } else if (Q == 2) {
                num = this.nullableIntAdapter.fromJson(jsonReader2);
            } else if (Q == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i != -9) {
            Constructor<ReviewMetadata> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ReviewMetadata.class.getDeclaredConstructor(new Class[]{ReviewFlowAction.class, List.class, Integer.class, String.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ReviewMetadata::class.ja…his.constructorRef = it }");
            }
            Object[] objArr = new Object[6];
            objArr[0] = reviewFlowAction;
            if (list != null) {
                objArr[1] = list;
                objArr[2] = num;
                objArr[3] = str;
                objArr[4] = Integer.valueOf(i);
                objArr[5] = null;
                ReviewMetadata newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("scenarios", "scenarios", jsonReader2);
        } else if (list != null) {
            return new ReviewMetadata(reviewFlowAction, list, num, str);
        } else {
            throw C18215a.m30728g("scenarios", "scenarios", jsonReader2);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewMetadata reviewMetadata = (ReviewMetadata) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewMetadata != null) {
            wVar.mo68522b();
            wVar.mo68529h("post_action");
            this.nullableReviewFlowActionAdapter.toJson(wVar, reviewMetadata.f26035a);
            wVar.mo68529h("scenarios");
            this.listOfReviewFlowScenarioAdapter.toJson(wVar, reviewMetadata.f26036b);
            wVar.mo68529h("current_rating");
            this.nullableIntAdapter.toJson(wVar, reviewMetadata.f26037c);
            wVar.mo68529h("transactionId");
            this.nullableStringAdapter.toJson(wVar, reviewMetadata.f26038d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewMetadata)";
    }
}
