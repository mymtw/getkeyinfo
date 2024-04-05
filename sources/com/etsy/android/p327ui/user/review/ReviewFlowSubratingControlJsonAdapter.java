package com.etsy.android.p327ui.user.review;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowSubratingControlJsonAdapter */
public final class ReviewFlowSubratingControlJsonAdapter extends JsonAdapter<ReviewFlowSubratingControl> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("current_rating");

    public ReviewFlowSubratingControlJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, EmptySet.INSTANCE, "currentRating");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ReviewFlowSubratingControl(num);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowSubratingControl reviewFlowSubratingControl = (ReviewFlowSubratingControl) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowSubratingControl != null) {
            wVar.mo68522b();
            wVar.mo68529h("current_rating");
            this.nullableIntAdapter.toJson(wVar, reviewFlowSubratingControl.f26022a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowSubratingControl)";
    }
}
