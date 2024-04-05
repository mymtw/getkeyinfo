package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyNode {
    public static final int $stable = 8;
    private final String allName;
    private final List<TaxonomyAttributeValueSet> attributeValueSets;
    private final List<Long> avsOrder;
    private final Integer categoryId;
    private final List<TaxonomyNode> children;
    private final List<Long> childrenIds;
    private final String description;
    private final TaxonomyFilters filters;
    private final List<Integer> fullPathTaxonomyIds;

    /* renamed from: id */
    private final Long f19148id;
    private final Boolean isSuppliesTopLevel;
    private final Integer level;
    private final String name;
    private final Long navReferent;
    private final String pageTitle;
    private final String parent;
    private final Long parentId;
    private final String path;
    private final String shortName;
    private final String sourceFinder;
    private final String version;

    public TaxonomyNode(@C17402n(name = "all_name") String str, @C17402n(name = "attributeValueSets") List<TaxonomyAttributeValueSet> list, @C17402n(name = "avsOrder") List<Long> list2, @C17402n(name = "category_id") Integer num, @C17402n(name = "children") List<TaxonomyNode> list3, @C17402n(name = "children_ids") List<Long> list4, @C17402n(name = "description") String str2, @C17402n(name = "filters") TaxonomyFilters taxonomyFilters, @C17402n(name = "full_path_taxonomy_ids") List<Integer> list5, @C17402n(name = "id") Long l, @C17402n(name = "is_supplies_top_level") Boolean bool, @C17402n(name = "level") Integer num2, @C17402n(name = "name") String str3, @C17402n(name = "nav_referent") Long l2, @C17402n(name = "page_title") String str4, @C17402n(name = "parent") String str5, @C17402n(name = "parent_id") Long l3, @C17402n(name = "path") String str6, @C17402n(name = "short_name") String str7, @C17402n(name = "source_finder") String str8, @C17402n(name = "version") String str9) {
        this.allName = str;
        this.attributeValueSets = list;
        this.avsOrder = list2;
        this.categoryId = num;
        this.children = list3;
        this.childrenIds = list4;
        this.description = str2;
        this.filters = taxonomyFilters;
        this.fullPathTaxonomyIds = list5;
        this.f19148id = l;
        this.isSuppliesTopLevel = bool;
        this.level = num2;
        this.name = str3;
        this.navReferent = l2;
        this.pageTitle = str4;
        this.parent = str5;
        this.parentId = l3;
        this.path = str6;
        this.shortName = str7;
        this.sourceFinder = str8;
        this.version = str9;
    }

    public static /* synthetic */ TaxonomyNode copy$default(TaxonomyNode taxonomyNode, String str, List list, List list2, Integer num, List list3, List list4, String str2, TaxonomyFilters taxonomyFilters, List list5, Long l, Boolean bool, Integer num2, String str3, Long l2, String str4, String str5, Long l3, String str6, String str7, String str8, String str9, int i, Object obj) {
        TaxonomyNode taxonomyNode2 = taxonomyNode;
        int i2 = i;
        return taxonomyNode.copy((i2 & 1) != 0 ? taxonomyNode2.allName : str, (i2 & 2) != 0 ? taxonomyNode2.attributeValueSets : list, (i2 & 4) != 0 ? taxonomyNode2.avsOrder : list2, (i2 & 8) != 0 ? taxonomyNode2.categoryId : num, (i2 & 16) != 0 ? taxonomyNode2.children : list3, (i2 & 32) != 0 ? taxonomyNode2.childrenIds : list4, (i2 & 64) != 0 ? taxonomyNode2.description : str2, (i2 & 128) != 0 ? taxonomyNode2.filters : taxonomyFilters, (i2 & 256) != 0 ? taxonomyNode2.fullPathTaxonomyIds : list5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? taxonomyNode2.f19148id : l, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? taxonomyNode2.isSuppliesTopLevel : bool, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? taxonomyNode2.level : num2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? taxonomyNode2.name : str3, (i2 & 8192) != 0 ? taxonomyNode2.navReferent : l2, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? taxonomyNode2.pageTitle : str4, (i2 & 32768) != 0 ? taxonomyNode2.parent : str5, (i2 & 65536) != 0 ? taxonomyNode2.parentId : l3, (i2 & 131072) != 0 ? taxonomyNode2.path : str6, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? taxonomyNode2.shortName : str7, (i2 & 524288) != 0 ? taxonomyNode2.sourceFinder : str8, (i2 & 1048576) != 0 ? taxonomyNode2.version : str9);
    }

    public final String component1() {
        return this.allName;
    }

    public final Long component10() {
        return this.f19148id;
    }

    public final Boolean component11() {
        return this.isSuppliesTopLevel;
    }

    public final Integer component12() {
        return this.level;
    }

    public final String component13() {
        return this.name;
    }

    public final Long component14() {
        return this.navReferent;
    }

    public final String component15() {
        return this.pageTitle;
    }

    public final String component16() {
        return this.parent;
    }

    public final Long component17() {
        return this.parentId;
    }

    public final String component18() {
        return this.path;
    }

    public final String component19() {
        return this.shortName;
    }

    public final List<TaxonomyAttributeValueSet> component2() {
        return this.attributeValueSets;
    }

    public final String component20() {
        return this.sourceFinder;
    }

    public final String component21() {
        return this.version;
    }

    public final List<Long> component3() {
        return this.avsOrder;
    }

    public final Integer component4() {
        return this.categoryId;
    }

    public final List<TaxonomyNode> component5() {
        return this.children;
    }

    public final List<Long> component6() {
        return this.childrenIds;
    }

    public final String component7() {
        return this.description;
    }

    public final TaxonomyFilters component8() {
        return this.filters;
    }

    public final List<Integer> component9() {
        return this.fullPathTaxonomyIds;
    }

    public final TaxonomyNode copy(@C17402n(name = "all_name") String str, @C17402n(name = "attributeValueSets") List<TaxonomyAttributeValueSet> list, @C17402n(name = "avsOrder") List<Long> list2, @C17402n(name = "category_id") Integer num, @C17402n(name = "children") List<TaxonomyNode> list3, @C17402n(name = "children_ids") List<Long> list4, @C17402n(name = "description") String str2, @C17402n(name = "filters") TaxonomyFilters taxonomyFilters, @C17402n(name = "full_path_taxonomy_ids") List<Integer> list5, @C17402n(name = "id") Long l, @C17402n(name = "is_supplies_top_level") Boolean bool, @C17402n(name = "level") Integer num2, @C17402n(name = "name") String str3, @C17402n(name = "nav_referent") Long l2, @C17402n(name = "page_title") String str4, @C17402n(name = "parent") String str5, @C17402n(name = "parent_id") Long l3, @C17402n(name = "path") String str6, @C17402n(name = "short_name") String str7, @C17402n(name = "source_finder") String str8, @C17402n(name = "version") String str9) {
        return new TaxonomyNode(str, list, list2, num, list3, list4, str2, taxonomyFilters, list5, l, bool, num2, str3, l2, str4, str5, l3, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyNode)) {
            return false;
        }
        TaxonomyNode taxonomyNode = (TaxonomyNode) obj;
        return C19383o.m32792b(this.allName, taxonomyNode.allName) && C19383o.m32792b(this.attributeValueSets, taxonomyNode.attributeValueSets) && C19383o.m32792b(this.avsOrder, taxonomyNode.avsOrder) && C19383o.m32792b(this.categoryId, taxonomyNode.categoryId) && C19383o.m32792b(this.children, taxonomyNode.children) && C19383o.m32792b(this.childrenIds, taxonomyNode.childrenIds) && C19383o.m32792b(this.description, taxonomyNode.description) && C19383o.m32792b(this.filters, taxonomyNode.filters) && C19383o.m32792b(this.fullPathTaxonomyIds, taxonomyNode.fullPathTaxonomyIds) && C19383o.m32792b(this.f19148id, taxonomyNode.f19148id) && C19383o.m32792b(this.isSuppliesTopLevel, taxonomyNode.isSuppliesTopLevel) && C19383o.m32792b(this.level, taxonomyNode.level) && C19383o.m32792b(this.name, taxonomyNode.name) && C19383o.m32792b(this.navReferent, taxonomyNode.navReferent) && C19383o.m32792b(this.pageTitle, taxonomyNode.pageTitle) && C19383o.m32792b(this.parent, taxonomyNode.parent) && C19383o.m32792b(this.parentId, taxonomyNode.parentId) && C19383o.m32792b(this.path, taxonomyNode.path) && C19383o.m32792b(this.shortName, taxonomyNode.shortName) && C19383o.m32792b(this.sourceFinder, taxonomyNode.sourceFinder) && C19383o.m32792b(this.version, taxonomyNode.version);
    }

    public final String getAllName() {
        return this.allName;
    }

    public final List<TaxonomyAttributeValueSet> getAttributeValueSets() {
        return this.attributeValueSets;
    }

    public final List<Long> getAvsOrder() {
        return this.avsOrder;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final List<TaxonomyNode> getChildren() {
        return this.children;
    }

    public final List<Long> getChildrenIds() {
        return this.childrenIds;
    }

    public final String getDescription() {
        return this.description;
    }

    public final TaxonomyFilters getFilters() {
        return this.filters;
    }

    public final List<Integer> getFullPathTaxonomyIds() {
        return this.fullPathTaxonomyIds;
    }

    public final Long getId() {
        return this.f19148id;
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getNavReferent() {
        return this.navReferent;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getParent() {
        return this.parent;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getSourceFinder() {
        return this.sourceFinder;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.allName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TaxonomyAttributeValueSet> list = this.attributeValueSets;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.avsOrder;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.categoryId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<TaxonomyNode> list3 = this.children;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Long> list4 = this.childrenIds;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.description;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TaxonomyFilters taxonomyFilters = this.filters;
        int hashCode8 = (hashCode7 + (taxonomyFilters == null ? 0 : taxonomyFilters.hashCode())) * 31;
        List<Integer> list5 = this.fullPathTaxonomyIds;
        int hashCode9 = (hashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l = this.f19148id;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isSuppliesTopLevel;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.level;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.navReferent;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.pageTitle;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parent;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.parentId;
        int hashCode17 = (hashCode16 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.path;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shortName;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sourceFinder;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.version;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode20 + i;
    }

    public final Boolean isSuppliesTopLevel() {
        return this.isSuppliesTopLevel;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyNode(allName=");
        h.append(this.allName);
        h.append(", attributeValueSets=");
        h.append(this.attributeValueSets);
        h.append(", avsOrder=");
        h.append(this.avsOrder);
        h.append(", categoryId=");
        h.append(this.categoryId);
        h.append(", children=");
        h.append(this.children);
        h.append(", childrenIds=");
        h.append(this.childrenIds);
        h.append(", description=");
        h.append(this.description);
        h.append(", filters=");
        h.append(this.filters);
        h.append(", fullPathTaxonomyIds=");
        h.append(this.fullPathTaxonomyIds);
        h.append(", id=");
        h.append(this.f19148id);
        h.append(", isSuppliesTopLevel=");
        h.append(this.isSuppliesTopLevel);
        h.append(", level=");
        h.append(this.level);
        h.append(", name=");
        h.append(this.name);
        h.append(", navReferent=");
        h.append(this.navReferent);
        h.append(", pageTitle=");
        h.append(this.pageTitle);
        h.append(", parent=");
        h.append(this.parent);
        h.append(", parentId=");
        h.append(this.parentId);
        h.append(", path=");
        h.append(this.path);
        h.append(", shortName=");
        h.append(this.shortName);
        h.append(", sourceFinder=");
        h.append(this.sourceFinder);
        h.append(", version=");
        return C0391c.m1057c(h, this.version, ')');
    }
}
