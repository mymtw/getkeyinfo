package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyAttributeValueSetJsonAdapter extends JsonAdapter<TaxonomyAttributeValueSet> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TaxonomyUserInputValidator> nullableTaxonomyUserInputValidatorAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(AttributeFacet.ATTRIBUTE, ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.IS_REQUIRED, "novaIds", "possiblePropertyClass", ResponseConstants.POSSIBLE_VALUES, ResponseConstants.SELECTED_VALUES, "taxonomyNode", ResponseConstants.USER_INPUT_VALIDATOR, ResponseConstants.VERSION);

    public TaxonomyAttributeValueSetJsonAdapter(C17414y yVar) {
        Class<Long> cls = Long.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(cls, emptySet, AttributeFacet.ATTRIBUTE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.IS_REQUIRED);
        this.nullableListOfLongAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "novaIds");
        this.nullableTaxonomyUserInputValidatorAdapter = yVar.mo68558c(TaxonomyUserInputValidator.class, emptySet, ResponseConstants.USER_INPUT_VALIDATOR);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyAttributeValueSet)";
    }

    public TaxonomyAttributeValueSet fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        Boolean bool = null;
        List list = null;
        String str2 = null;
        List list2 = null;
        List list3 = null;
        Long l2 = null;
        TaxonomyUserInputValidator taxonomyUserInputValidator = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = this.nullableListOfLongAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list2 = this.nullableListOfLongAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list3 = this.nullableListOfLongAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    taxonomyUserInputValidator = this.nullableTaxonomyUserInputValidatorAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyAttributeValueSet(l, str, bool, list, str2, list2, list3, l2, taxonomyUserInputValidator, str3);
    }

    public void toJson(C17412w wVar, TaxonomyAttributeValueSet taxonomyAttributeValueSet) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyAttributeValueSet != null) {
            wVar.mo68522b();
            wVar.mo68529h(AttributeFacet.ATTRIBUTE);
            this.nullableLongAdapter.toJson(wVar, taxonomyAttributeValueSet.getAttribute());
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME_CAMELCASE);
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValueSet.getDisplayName());
            wVar.mo68529h(ResponseConstants.IS_REQUIRED);
            this.nullableBooleanAdapter.toJson(wVar, taxonomyAttributeValueSet.isRequired());
            wVar.mo68529h("novaIds");
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyAttributeValueSet.getNovaIds());
            wVar.mo68529h("possiblePropertyClass");
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValueSet.getPossiblePropertyClass());
            wVar.mo68529h(ResponseConstants.POSSIBLE_VALUES);
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyAttributeValueSet.getPossibleValues());
            wVar.mo68529h(ResponseConstants.SELECTED_VALUES);
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyAttributeValueSet.getSelectedValues());
            wVar.mo68529h("taxonomyNode");
            this.nullableLongAdapter.toJson(wVar, taxonomyAttributeValueSet.getTaxonomyNode());
            wVar.mo68529h(ResponseConstants.USER_INPUT_VALIDATOR);
            this.nullableTaxonomyUserInputValidatorAdapter.toJson(wVar, taxonomyAttributeValueSet.getUserInputValidator());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValueSet.getVersion());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
