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

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowScenarioJsonAdapter */
public final class ReviewFlowScenarioJsonAdapter extends JsonAdapter<ReviewFlowScenario> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFlowScenario> constructorRef;
    private final JsonAdapter<List<Integer>> listOfIntAdapter;
    private final JsonAdapter<List<ReviewFlowCardOrderType>> listOfReviewFlowCardOrderTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("eligible_ratings", "card_order", "result_display_text");

    public ReviewFlowScenarioJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, Integer.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfIntAdapter = yVar.mo68558c(d, emptySet, "eligibleRatings");
        this.listOfReviewFlowCardOrderTypeAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewFlowCardOrderType.class), emptySet, "cardOrder");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "resultDisplayText");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        List list2 = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfIntAdapter.fromJson(jsonReader2);
                if (list != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("eligibleRatings", "eligible_ratings", jsonReader2);
                }
            } else if (Q == 1) {
                list2 = this.listOfReviewFlowCardOrderTypeAdapter.fromJson(jsonReader2);
                if (list2 == null) {
                    throw C18215a.m30734m("cardOrder", "card_order", jsonReader2);
                }
            } else if (Q == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            if (list2 != null) {
                return new ReviewFlowScenario(list, list2, str);
            }
            throw C18215a.m30728g("cardOrder", "card_order", jsonReader2);
        }
        Constructor<ReviewFlowScenario> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewFlowScenario.class.getDeclaredConstructor(new Class[]{List.class, List.class, String.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReviewFlowScenario::clas…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        objArr[0] = list;
        if (list2 != null) {
            objArr[1] = list2;
            objArr[2] = str;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            ReviewFlowScenario newInstance = constructor.newInstance(objArr);
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw C18215a.m30728g("cardOrder", "card_order", jsonReader2);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowScenario reviewFlowScenario = (ReviewFlowScenario) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowScenario != null) {
            wVar.mo68522b();
            wVar.mo68529h("eligible_ratings");
            this.listOfIntAdapter.toJson(wVar, reviewFlowScenario.f26015a);
            wVar.mo68529h("card_order");
            this.listOfReviewFlowCardOrderTypeAdapter.toJson(wVar, reviewFlowScenario.f26016b);
            wVar.mo68529h("result_display_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowScenario.f26017c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowScenario)";
    }
}
