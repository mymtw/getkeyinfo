package com.etsy.android.search;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.search.CompositeSuggestions;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CompositeSuggestions_ShopResponseJsonAdapter extends JsonAdapter<CompositeSuggestions.ShopResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SHOP_NAME, "shop_owner", "shop_img", ResponseConstants.DEEP_LINK);
    private final JsonAdapter<String> stringAdapter;

    public CompositeSuggestions_ShopResponseJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "name");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.OWNER);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("name", ResponseConstants.SHOP_NAME, jsonReader);
                }
            } else if (Q == 1) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("deepLink", ResponseConstants.DEEP_LINK, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("name", ResponseConstants.SHOP_NAME, jsonReader);
        } else if (str2 != null) {
            return new CompositeSuggestions.ShopResponse(str, str3, str4, str2);
        } else {
            throw C18215a.m30728g("deepLink", ResponseConstants.DEEP_LINK, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        CompositeSuggestions.ShopResponse shopResponse = (CompositeSuggestions.ShopResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (shopResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.stringAdapter.toJson(wVar, shopResponse.f19783a);
            wVar.mo68529h("shop_owner");
            this.nullableStringAdapter.toJson(wVar, shopResponse.f19784b);
            wVar.mo68529h("shop_img");
            this.nullableStringAdapter.toJson(wVar, shopResponse.f19785c);
            wVar.mo68529h(ResponseConstants.DEEP_LINK);
            this.stringAdapter.toJson(wVar, shopResponse.f19786d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CompositeSuggestions.ShopResponse)";
    }
}
