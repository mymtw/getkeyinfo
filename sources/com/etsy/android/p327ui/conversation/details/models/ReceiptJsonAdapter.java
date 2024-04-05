package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.ReceiptJsonAdapter */
public final class ReceiptJsonAdapter extends JsonAdapter<Receipt> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_ID, "seller_user_id", ResponseConstants.BUYER_USER_ID, "help_url");

    public ReceiptJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "receiptId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "helpUrl");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("receiptId", ResponseConstants.RECEIPT_ID, jsonReader);
                }
            } else if (Q == 1) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw C18215a.m30734m("sellerUserId", "seller_user_id", jsonReader);
                }
            } else if (Q == 2) {
                l3 = this.longAdapter.fromJson(jsonReader);
                if (l3 == null) {
                    throw C18215a.m30734m("buyerUserId", ResponseConstants.BUYER_USER_ID, jsonReader);
                }
            } else if (Q == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (l3 != null) {
                    return new Receipt(longValue, longValue2, l3.longValue(), str);
                }
                throw C18215a.m30728g("buyerUserId", ResponseConstants.BUYER_USER_ID, jsonReader);
            }
            throw C18215a.m30728g("sellerUserId", "seller_user_id", jsonReader);
        }
        throw C18215a.m30728g("receiptId", ResponseConstants.RECEIPT_ID, jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        Receipt receipt = (Receipt) obj;
        C19383o.m32797g(wVar, "writer");
        if (receipt != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(receipt.f21213a));
            wVar.mo68529h("seller_user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(receipt.f21214b));
            wVar.mo68529h(ResponseConstants.BUYER_USER_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(receipt.f21215c));
            wVar.mo68529h("help_url");
            this.nullableStringAdapter.toJson(wVar, receipt.f21216d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Receipt)";
    }
}
