package com.etsy.android.p327ui.user.review;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowRatingControlJsonAdapter */
public final class ReviewFlowRatingControlJsonAdapter extends JsonAdapter<ReviewFlowRatingControl> {
    public static final int $stable = 8;
    private final JsonAdapter<ReviewFlowSubratingControl> nullableReviewFlowSubratingControlAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("display_title_text", "rating_id", "star_rating_control");

    public ReviewFlowRatingControlJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayTitleText");
        this.nullableReviewFlowSubratingControlAdapter = yVar.mo68558c(ReviewFlowSubratingControl.class, emptySet, "ratingControl");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        ReviewFlowSubratingControl reviewFlowSubratingControl = null;
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
                reviewFlowSubratingControl = this.nullableReviewFlowSubratingControlAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ReviewFlowRatingControl(str, str2, reviewFlowSubratingControl);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowRatingControl reviewFlowRatingControl = (ReviewFlowRatingControl) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowRatingControl != null) {
            wVar.mo68522b();
            wVar.mo68529h("display_title_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowRatingControl.f26012a);
            wVar.mo68529h("rating_id");
            this.nullableStringAdapter.toJson(wVar, reviewFlowRatingControl.f26013b);
            wVar.mo68529h("star_rating_control");
            this.nullableReviewFlowSubratingControlAdapter.toJson(wVar, reviewFlowRatingControl.f26014c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowRatingControl)";
    }
}
