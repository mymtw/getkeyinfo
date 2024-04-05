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

public final class StructuredPolicyPrivacyJsonAdapter extends JsonAdapter<StructuredPolicyPrivacy> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.HEADER, ResponseConstants.ORDER);

    public StructuredPolicyPrivacyJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.HEADER);
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.ORDER);
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyPrivacy)";
    }

    public StructuredPolicyPrivacy fromJson(JsonReader jsonReader) {
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
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new StructuredPolicyPrivacy(str, list);
    }

    public void toJson(C17412w wVar, StructuredPolicyPrivacy structuredPolicyPrivacy) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyPrivacy != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.HEADER);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyPrivacy.getHeader());
            wVar.mo68529h(ResponseConstants.ORDER);
            this.nullableListOfStringAdapter.toJson(wVar, structuredPolicyPrivacy.getOrder());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
