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

public final class TaxonomyUserInputValidatorJsonAdapter extends JsonAdapter<TaxonomyUserInputValidator> {
    public static final int $stable = 8;
    private final JsonAdapter<List<TaxonomyUserInputValidatorValueScaleBounds>> nullableListOfTaxonomyUserInputValidatorValueScaleBoundsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TaxonomyValueScale> nullableTaxonomyValueScaleAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", ResponseConstants.MIN, ResponseConstants.MAX, ResponseConstants.SCALES, ResponseConstants.MIN_MAX_SCALE, "canonicalScale", "scalesBounds");

    public TaxonomyUserInputValidatorJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "type");
        this.nullableTaxonomyValueScaleAdapter = yVar.mo68558c(TaxonomyValueScale.class, emptySet, ResponseConstants.SCALES);
        this.nullableListOfTaxonomyUserInputValidatorValueScaleBoundsAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, TaxonomyUserInputValidatorValueScaleBounds.class), emptySet, ResponseConstants.SCALE_BOUNDS_CAMELCASE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyUserInputValidator)";
    }

    public TaxonomyUserInputValidator fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        TaxonomyValueScale taxonomyValueScale = null;
        TaxonomyValueScale taxonomyValueScale2 = null;
        TaxonomyValueScale taxonomyValueScale3 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    taxonomyValueScale = this.nullableTaxonomyValueScaleAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    taxonomyValueScale2 = this.nullableTaxonomyValueScaleAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    taxonomyValueScale3 = this.nullableTaxonomyValueScaleAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list = this.nullableListOfTaxonomyUserInputValidatorValueScaleBoundsAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyUserInputValidator(str, str2, str3, taxonomyValueScale, taxonomyValueScale2, taxonomyValueScale3, list);
    }

    public void toJson(C17412w wVar, TaxonomyUserInputValidator taxonomyUserInputValidator) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyUserInputValidator != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, taxonomyUserInputValidator.getType());
            wVar.mo68529h(ResponseConstants.MIN);
            this.nullableStringAdapter.toJson(wVar, taxonomyUserInputValidator.getMin());
            wVar.mo68529h(ResponseConstants.MAX);
            this.nullableStringAdapter.toJson(wVar, taxonomyUserInputValidator.getMax());
            wVar.mo68529h(ResponseConstants.SCALES);
            this.nullableTaxonomyValueScaleAdapter.toJson(wVar, taxonomyUserInputValidator.getScales());
            wVar.mo68529h(ResponseConstants.MIN_MAX_SCALE);
            this.nullableTaxonomyValueScaleAdapter.toJson(wVar, taxonomyUserInputValidator.getMinMaxScale());
            wVar.mo68529h("canonicalScale");
            this.nullableTaxonomyValueScaleAdapter.toJson(wVar, taxonomyUserInputValidator.getCanonicalScale());
            wVar.mo68529h("scalesBounds");
            this.nullableListOfTaxonomyUserInputValidatorValueScaleBoundsAdapter.toJson(wVar, taxonomyUserInputValidator.getScaleBounds());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
