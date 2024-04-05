package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowWordCountDisplayOptionJsonAdapter */
public final class ReviewFlowWordCountDisplayOptionJsonAdapter extends JsonAdapter<ReviewFlowWordCountDisplayOption> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("word_count", ResponseConstants.DISPLAY_TEXT);

    public ReviewFlowWordCountDisplayOptionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "wordCount");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayText");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ReviewFlowWordCountDisplayOption(num, str);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowWordCountDisplayOption reviewFlowWordCountDisplayOption = (ReviewFlowWordCountDisplayOption) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowWordCountDisplayOption != null) {
            wVar.mo68522b();
            wVar.mo68529h("word_count");
            this.nullableIntAdapter.toJson(wVar, reviewFlowWordCountDisplayOption.f26030a);
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewFlowWordCountDisplayOption.f26031b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowWordCountDisplayOption)";
    }
}
