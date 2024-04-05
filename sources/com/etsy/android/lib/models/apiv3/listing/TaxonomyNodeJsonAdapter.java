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

public final class TaxonomyNodeJsonAdapter extends JsonAdapter<TaxonomyNode> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonAdapter<List<TaxonomyAttributeValueSet>> nullableListOfTaxonomyAttributeValueSetAdapter;
    private final JsonAdapter<List<TaxonomyNode>> nullableListOfTaxonomyNodeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TaxonomyFilters> nullableTaxonomyFiltersAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("all_name", "attributeValueSets", "avsOrder", ResponseConstants.CATEGORY_ID, ResponseConstants.CHILDREN, "children_ids", "description", "filters", "full_path_taxonomy_ids", "id", ResponseConstants.IS_SUPPLIES_TOP_LEVEL, "level", "name", "nav_referent", ResponseConstants.PAGE_TITLE, ResponseConstants.PARENT, "parent_id", ResponseConstants.PATH, "short_name", "source_finder", ResponseConstants.VERSION);

    public TaxonomyNodeJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<Integer> cls = Integer.class;
        Class<Long> cls2 = Long.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "allName");
        this.nullableListOfTaxonomyAttributeValueSetAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, TaxonomyAttributeValueSet.class), emptySet, "attributeValueSets");
        this.nullableListOfLongAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls2), emptySet, "avsOrder");
        this.nullableIntAdapter = yVar2.mo68558c(cls, emptySet, "categoryId");
        this.nullableListOfTaxonomyNodeAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, TaxonomyNode.class), emptySet, ResponseConstants.CHILDREN);
        this.nullableTaxonomyFiltersAdapter = yVar2.mo68558c(TaxonomyFilters.class, emptySet, "filters");
        this.nullableListOfIntAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "fullPathTaxonomyIds");
        this.nullableLongAdapter = yVar2.mo68558c(cls2, emptySet, "id");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "isSuppliesTopLevel");
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyNode)";
    }

    public TaxonomyNode fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        String str = null;
        List list = null;
        List list2 = null;
        Integer num = null;
        List list3 = null;
        List list4 = null;
        String str2 = null;
        TaxonomyFilters taxonomyFilters = null;
        List list5 = null;
        Long l = null;
        Boolean bool = null;
        Integer num2 = null;
        String str3 = null;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        Long l3 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    list = this.nullableListOfTaxonomyAttributeValueSetAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    list2 = this.nullableListOfLongAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    list3 = this.nullableListOfTaxonomyNodeAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    list4 = this.nullableListOfLongAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    taxonomyFilters = this.nullableTaxonomyFiltersAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    list5 = this.nullableListOfIntAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 19:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 20:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyNode(str, list, list2, num, list3, list4, str2, taxonomyFilters, list5, l, bool, num2, str3, l2, str4, str5, l3, str6, str7, str8, str9);
    }

    public void toJson(C17412w wVar, TaxonomyNode taxonomyNode) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyNode != null) {
            wVar.mo68522b();
            wVar.mo68529h("all_name");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getAllName());
            wVar.mo68529h("attributeValueSets");
            this.nullableListOfTaxonomyAttributeValueSetAdapter.toJson(wVar, taxonomyNode.getAttributeValueSets());
            wVar.mo68529h("avsOrder");
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyNode.getAvsOrder());
            wVar.mo68529h(ResponseConstants.CATEGORY_ID);
            this.nullableIntAdapter.toJson(wVar, taxonomyNode.getCategoryId());
            wVar.mo68529h(ResponseConstants.CHILDREN);
            this.nullableListOfTaxonomyNodeAdapter.toJson(wVar, taxonomyNode.getChildren());
            wVar.mo68529h("children_ids");
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyNode.getChildrenIds());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getDescription());
            wVar.mo68529h("filters");
            this.nullableTaxonomyFiltersAdapter.toJson(wVar, taxonomyNode.getFilters());
            wVar.mo68529h("full_path_taxonomy_ids");
            this.nullableListOfIntAdapter.toJson(wVar, taxonomyNode.getFullPathTaxonomyIds());
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, taxonomyNode.getId());
            wVar.mo68529h(ResponseConstants.IS_SUPPLIES_TOP_LEVEL);
            this.nullableBooleanAdapter.toJson(wVar, taxonomyNode.isSuppliesTopLevel());
            wVar.mo68529h("level");
            this.nullableIntAdapter.toJson(wVar, taxonomyNode.getLevel());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getName());
            wVar.mo68529h("nav_referent");
            this.nullableLongAdapter.toJson(wVar, taxonomyNode.getNavReferent());
            wVar.mo68529h(ResponseConstants.PAGE_TITLE);
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getPageTitle());
            wVar.mo68529h(ResponseConstants.PARENT);
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getParent());
            wVar.mo68529h("parent_id");
            this.nullableLongAdapter.toJson(wVar, taxonomyNode.getParentId());
            wVar.mo68529h(ResponseConstants.PATH);
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getPath());
            wVar.mo68529h("short_name");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getShortName());
            wVar.mo68529h("source_finder");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getSourceFinder());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getVersion());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
