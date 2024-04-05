package com.etsy.android.lib.requests;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ReceiptIdJsonAdapter extends JsonAdapter<ReceiptId> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_ID);
    private final JsonAdapter<String> stringAdapter;

    public ReceiptIdJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "id");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReceiptId)";
    }

    public ReceiptId fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("id", ResponseConstants.RECEIPT_ID, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new ReceiptId(str);
        }
        throw C18215a.m30728g("id", ResponseConstants.RECEIPT_ID, jsonReader);
    }

    public void toJson(C17412w wVar, ReceiptId receiptId) {
        C19383o.m32797g(wVar, "writer");
        if (receiptId != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.stringAdapter.toJson(wVar, receiptId.getId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
