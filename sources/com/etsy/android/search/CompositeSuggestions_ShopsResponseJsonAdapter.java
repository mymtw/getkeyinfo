package com.etsy.android.search;

import com.etsy.android.search.CompositeSuggestions;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CompositeSuggestions_ShopsResponseJsonAdapter extends JsonAdapter<CompositeSuggestions.ShopsResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<List<CompositeSuggestions.ShopResponse>> nullableListOfShopResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shops", "more_shops_link");

    public CompositeSuggestions_ShopsResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, CompositeSuggestions.ShopResponse.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfShopResponseAdapter = yVar.mo68558c(d, emptySet, "shops");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "moreShopsLink");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfShopResponseAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new CompositeSuggestions.ShopsResponse(list, str);
    }

    public final void toJson(C17412w wVar, Object obj) {
        CompositeSuggestions.ShopsResponse shopsResponse = (CompositeSuggestions.ShopsResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (shopsResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("shops");
            this.nullableListOfShopResponseAdapter.toJson(wVar, shopsResponse.f19787a);
            wVar.mo68529h("more_shops_link");
            this.nullableStringAdapter.toJson(wVar, shopsResponse.f19788b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CompositeSuggestions.ShopsResponse)";
    }
}
