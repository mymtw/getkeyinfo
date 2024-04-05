package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SearchLandingSuggestions_PurchaseGiftCardJsonAdapter extends JsonAdapter<SearchLandingSuggestions.PurchaseGiftCard> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("eligible", ResponseConstants.IMAGE);
    private final JsonAdapter<String> stringAdapter;

    public SearchLandingSuggestions_PurchaseGiftCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = yVar.mo68558c(cls, emptySet, "eligible");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "imageUrl");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchLandingSuggestions.PurchaseGiftCard)";
    }

    public SearchLandingSuggestions.PurchaseGiftCard fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Boolean bool = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw C18215a.m30734m("eligible", "eligible", jsonReader);
                }
            } else if (Q == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("imageUrl", ResponseConstants.IMAGE, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (str != null) {
                return new SearchLandingSuggestions.PurchaseGiftCard(booleanValue, str);
            }
            throw C18215a.m30728g("imageUrl", ResponseConstants.IMAGE, jsonReader);
        }
        throw C18215a.m30728g("eligible", "eligible", jsonReader);
    }

    public void toJson(C17412w wVar, SearchLandingSuggestions.PurchaseGiftCard purchaseGiftCard) {
        C19383o.m32797g(wVar, "writer");
        if (purchaseGiftCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("eligible");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(purchaseGiftCard.getEligible()));
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.stringAdapter.toJson(wVar, purchaseGiftCard.getImageUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
