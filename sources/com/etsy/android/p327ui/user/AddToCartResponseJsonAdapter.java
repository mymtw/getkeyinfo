package com.etsy.android.p327ui.user;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.AddToCartResponseJsonAdapter */
public final class AddToCartResponseJsonAdapter extends JsonAdapter<AddToCartResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Recommendations> nullableRecommendationsAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("cart_count", "post_add_to_cart_recs");

    public AddToCartResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "cartCount");
        this.nullableRecommendationsAdapter = yVar.mo68558c(Recommendations.class, emptySet, "recommendations");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Recommendations recommendations = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                recommendations = this.nullableRecommendationsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new AddToCartResponse(num, recommendations);
    }

    public final void toJson(C17412w wVar, Object obj) {
        AddToCartResponse addToCartResponse = (AddToCartResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (addToCartResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("cart_count");
            this.nullableIntAdapter.toJson(wVar, addToCartResponse.f24990a);
            wVar.mo68529h("post_add_to_cart_recs");
            this.nullableRecommendationsAdapter.toJson(wVar, addToCartResponse.f24991b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AddToCartResponse)";
    }
}
