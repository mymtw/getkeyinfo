package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ProductSafetyNoticeJsonAdapter extends JsonAdapter<ProductSafetyNotice> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ProductSafetyNoticeMessage>> listOfProductSafetyNoticeMessageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", "message", ResponseConstants.MESSAGES);
    private final JsonAdapter<String> stringAdapter;

    public ProductSafetyNoticeJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "title");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "message");
        this.listOfProductSafetyNoticeMessageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ProductSafetyNoticeMessage.class), emptySet, ResponseConstants.MESSAGES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ProductSafetyNotice)";
    }

    public ProductSafetyNotice fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("title", "title", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2 && (list = this.listOfProductSafetyNoticeMessageAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("title", "title", jsonReader);
        } else if (list != null) {
            return new ProductSafetyNotice(str, str2, list);
        } else {
            throw C18215a.m30728g(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
        }
    }

    public void toJson(C17412w wVar, ProductSafetyNotice productSafetyNotice) {
        C19383o.m32797g(wVar, "writer");
        if (productSafetyNotice != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, productSafetyNotice.getTitle());
            wVar.mo68529h("message");
            this.nullableStringAdapter.toJson(wVar, productSafetyNotice.getMessage());
            wVar.mo68529h(ResponseConstants.MESSAGES);
            this.listOfProductSafetyNoticeMessageAdapter.toJson(wVar, productSafetyNotice.getMessages());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
