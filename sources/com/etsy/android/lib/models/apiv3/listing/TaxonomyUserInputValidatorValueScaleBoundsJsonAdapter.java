package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyUserInputValidatorValueScaleBoundsJsonAdapter extends JsonAdapter<TaxonomyUserInputValidatorValueScaleBounds> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SCALE_ID_CAMELCASE, ResponseConstants.MIN, ResponseConstants.MAX);

    public TaxonomyUserInputValidatorValueScaleBoundsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, ResponseConstants.SCALE_ID_CAMELCASE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.MIN);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyUserInputValidatorValueScaleBounds)";
    }

    public TaxonomyUserInputValidatorValueScaleBounds fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyUserInputValidatorValueScaleBounds(l, str, str2);
    }

    public void toJson(C17412w wVar, TaxonomyUserInputValidatorValueScaleBounds taxonomyUserInputValidatorValueScaleBounds) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyUserInputValidatorValueScaleBounds != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SCALE_ID_CAMELCASE);
            this.nullableLongAdapter.toJson(wVar, taxonomyUserInputValidatorValueScaleBounds.getScaleId());
            wVar.mo68529h(ResponseConstants.MIN);
            this.nullableStringAdapter.toJson(wVar, taxonomyUserInputValidatorValueScaleBounds.getMin());
            wVar.mo68529h(ResponseConstants.MAX);
            this.nullableStringAdapter.toJson(wVar, taxonomyUserInputValidatorValueScaleBounds.getMax());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
