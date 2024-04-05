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

public final class GiftCardAmountValuesJsonAdapter extends JsonAdapter<GiftCardAmountValues> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Integer>> listOfIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", ResponseConstants.VALUES);
    private final JsonAdapter<String> stringAdapter;

    public GiftCardAmountValuesJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "type");
        this.listOfIntAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Integer.class), emptySet, ResponseConstants.VALUES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftCardAmountValues)";
    }

    public GiftCardAmountValues fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("type", "type", jsonReader);
                }
            } else if (Q == 1 && (list = this.listOfIntAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.VALUES, ResponseConstants.VALUES, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("type", "type", jsonReader);
        } else if (list != null) {
            return new GiftCardAmountValues(str, list);
        } else {
            throw C18215a.m30728g(ResponseConstants.VALUES, ResponseConstants.VALUES, jsonReader);
        }
    }

    public void toJson(C17412w wVar, GiftCardAmountValues giftCardAmountValues) {
        C19383o.m32797g(wVar, "writer");
        if (giftCardAmountValues != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, giftCardAmountValues.getType());
            wVar.mo68529h(ResponseConstants.VALUES);
            this.listOfIntAdapter.toJson(wVar, giftCardAmountValues.getValues());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
