package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.apiv3.listing.ProductSafetyNoticeMessage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ProductSafetyNoticeMessageJsonAdapter extends JsonAdapter<ProductSafetyNoticeMessage> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("message_type", "message_text");
    private final JsonAdapter<ProductSafetyNoticeMessage.ProductSafetyNoticeType> productSafetyNoticeTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ProductSafetyNoticeMessageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.productSafetyNoticeTypeAdapter = yVar.mo68558c(ProductSafetyNoticeMessage.ProductSafetyNoticeType.class, emptySet, "type");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "text");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ProductSafetyNoticeMessage)";
    }

    public ProductSafetyNoticeMessage fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        ProductSafetyNoticeMessage.ProductSafetyNoticeType productSafetyNoticeType = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                productSafetyNoticeType = this.productSafetyNoticeTypeAdapter.fromJson(jsonReader);
                if (productSafetyNoticeType == null) {
                    throw C18215a.m30734m("type", "message_type", jsonReader);
                }
            } else if (Q == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("text", "message_text", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (productSafetyNoticeType == null) {
            throw C18215a.m30728g("type", "message_type", jsonReader);
        } else if (str != null) {
            return new ProductSafetyNoticeMessage(productSafetyNoticeType, str);
        } else {
            throw C18215a.m30728g("text", "message_text", jsonReader);
        }
    }

    public void toJson(C17412w wVar, ProductSafetyNoticeMessage productSafetyNoticeMessage) {
        C19383o.m32797g(wVar, "writer");
        if (productSafetyNoticeMessage != null) {
            wVar.mo68522b();
            wVar.mo68529h("message_type");
            this.productSafetyNoticeTypeAdapter.toJson(wVar, productSafetyNoticeMessage.getType());
            wVar.mo68529h("message_text");
            this.stringAdapter.toJson(wVar, productSafetyNoticeMessage.getText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
