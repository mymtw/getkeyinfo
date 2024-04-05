package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.PostalCodeSuggestionJsonAdapter */
public final class PostalCodeSuggestionJsonAdapter extends JsonAdapter<PostalCodeSuggestion> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("city", "state", ResponseConstants.POSTAL_CODE, "state_code");

    public PostalCodeSuggestionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "city");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new PostalCodeSuggestion(str, str2, str3, str4);
    }

    public final void toJson(C17412w wVar, Object obj) {
        PostalCodeSuggestion postalCodeSuggestion = (PostalCodeSuggestion) obj;
        C19383o.m32797g(wVar, "writer");
        if (postalCodeSuggestion != null) {
            wVar.mo68522b();
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, postalCodeSuggestion.f25099a);
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, postalCodeSuggestion.f25100b);
            wVar.mo68529h(ResponseConstants.POSTAL_CODE);
            this.nullableStringAdapter.toJson(wVar, postalCodeSuggestion.f25101c);
            wVar.mo68529h("state_code");
            this.nullableStringAdapter.toJson(wVar, postalCodeSuggestion.f25102d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PostalCodeSuggestion)";
    }
}
