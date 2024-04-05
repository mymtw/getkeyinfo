package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class NonRefundableItemJsonAdapter extends JsonAdapter<NonRefundableItem> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", ResponseConstants.NON_REFUNDABLE, "type");

    public NonRefundableItemJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "nonRefundable");
    }

    public String toString() {
        return "GeneratedJsonAdapter(NonRefundableItem)";
    }

    public NonRefundableItem fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new NonRefundableItem(str, bool, str2);
    }

    public void toJson(C17412w wVar, NonRefundableItem nonRefundableItem) {
        C19383o.m32797g(wVar, "writer");
        if (nonRefundableItem != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, nonRefundableItem.getName());
            wVar.mo68529h(ResponseConstants.NON_REFUNDABLE);
            this.nullableBooleanAdapter.toJson(wVar, nonRefundableItem.getNonRefundable());
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, nonRefundableItem.getType());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
