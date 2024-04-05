package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class StructuredPolicyCharLimitsJsonAdapter extends JsonAdapter<StructuredPolicyCharLimits> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.PRIVACY_POLICY_OTHER);

    public StructuredPolicyCharLimitsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, EmptySet.INSTANCE, "privacyPolicyOther");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyCharLimits)";
    }

    public StructuredPolicyCharLimits fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new StructuredPolicyCharLimits(num);
    }

    public void toJson(C17412w wVar, StructuredPolicyCharLimits structuredPolicyCharLimits) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyCharLimits != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.PRIVACY_POLICY_OTHER);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyCharLimits.getPrivacyPolicyOther());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
