package com.etsy.android.lib.models;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class GiftCardDesignsJsonAdapter extends JsonAdapter<GiftCardDesigns> {
    public static final int $stable = 8;
    private final JsonAdapter<List<GiftCardDesign>> listOfGiftCardDesignAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RESULTS);

    public GiftCardDesignsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfGiftCardDesignAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, GiftCardDesign.class), EmptySet.INSTANCE, ResponseConstants.RESULTS);
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftCardDesigns)";
    }

    public GiftCardDesigns fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (list = this.listOfGiftCardDesignAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.RESULTS, ResponseConstants.RESULTS, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new GiftCardDesigns(list);
        }
        throw C18215a.m30728g(ResponseConstants.RESULTS, ResponseConstants.RESULTS, jsonReader);
    }

    public void toJson(C17412w wVar, GiftCardDesigns giftCardDesigns) {
        C19383o.m32797g(wVar, "writer");
        if (giftCardDesigns != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RESULTS);
            this.listOfGiftCardDesignAdapter.toJson(wVar, giftCardDesigns.getResults());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
