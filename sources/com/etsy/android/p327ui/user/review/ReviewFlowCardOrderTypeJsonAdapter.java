package com.etsy.android.p327ui.user.review;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowCardOrderTypeJsonAdapter */
public final class ReviewFlowCardOrderTypeJsonAdapter extends JsonAdapter<ReviewFlowCardOrderType> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("card_type", "unique_id");
    private final JsonAdapter<ReviewFlowCardType> reviewFlowCardTypeAdapter;

    public ReviewFlowCardOrderTypeJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.reviewFlowCardTypeAdapter = yVar.mo68558c(ReviewFlowCardType.class, emptySet, "cardType");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "id");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        ReviewFlowCardType reviewFlowCardType = null;
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                reviewFlowCardType = this.reviewFlowCardTypeAdapter.fromJson(jsonReader);
                if (reviewFlowCardType == null) {
                    throw C18215a.m30734m("cardType", "card_type", jsonReader);
                }
            } else if (Q == 1 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("id", "unique_id", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (reviewFlowCardType == null) {
            throw C18215a.m30728g("cardType", "card_type", jsonReader);
        } else if (num != null) {
            return new ReviewFlowCardOrderType(reviewFlowCardType, num.intValue());
        } else {
            throw C18215a.m30728g("id", "unique_id", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowCardOrderType reviewFlowCardOrderType = (ReviewFlowCardOrderType) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowCardOrderType != null) {
            wVar.mo68522b();
            wVar.mo68529h("card_type");
            this.reviewFlowCardTypeAdapter.toJson(wVar, reviewFlowCardOrderType.f25987a);
            wVar.mo68529h("unique_id");
            this.intAdapter.toJson(wVar, Integer.valueOf(reviewFlowCardOrderType.f25988b));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowCardOrderType)";
    }
}
