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

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowJsonAdapter */
public final class ReviewFlowJsonAdapter extends JsonAdapter<ReviewFlow> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFlow> constructorRef;
    private final JsonAdapter<List<ReviewCard>> listOfReviewCardAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.METADATA, "review_cards");
    private final JsonAdapter<ReviewMetadata> reviewMetadataAdapter;

    public ReviewFlowJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.reviewMetadataAdapter = yVar.mo68558c(ReviewMetadata.class, emptySet, ResponseConstants.METADATA);
        this.listOfReviewCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewCard.class), emptySet, "reviewCards");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        ReviewMetadata reviewMetadata = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                reviewMetadata = this.reviewMetadataAdapter.fromJson(jsonReader);
                if (reviewMetadata == null) {
                    throw C18215a.m30734m(ResponseConstants.METADATA, ResponseConstants.METADATA, jsonReader);
                }
            } else if (Q == 1) {
                list = this.listOfReviewCardAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("reviewCards", "review_cards", jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i != -3) {
            Constructor<ReviewFlow> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ReviewFlow.class.getDeclaredConstructor(new Class[]{ReviewMetadata.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ReviewFlow::class.java.g…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            if (reviewMetadata != null) {
                objArr[0] = reviewMetadata;
                objArr[1] = list;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                ReviewFlow newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g(ResponseConstants.METADATA, ResponseConstants.METADATA, jsonReader);
        } else if (reviewMetadata != null) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.ui.user.review.ReviewCard>");
            return new ReviewFlow(reviewMetadata, list);
        } else {
            throw C18215a.m30728g(ResponseConstants.METADATA, ResponseConstants.METADATA, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlow reviewFlow = (ReviewFlow) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlow != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.METADATA);
            this.reviewMetadataAdapter.toJson(wVar, reviewFlow.f25980a);
            wVar.mo68529h("review_cards");
            this.listOfReviewCardAdapter.toJson(wVar, reviewFlow.f25981b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlow)";
    }
}
