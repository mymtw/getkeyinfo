package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyAttributeValueSet {
    public static final int $stable = 8;
    private final Long attribute;
    private final String displayName;
    private final Boolean isRequired;
    private final List<Long> novaIds;
    private final String possiblePropertyClass;
    private final List<Long> possibleValues;
    private final List<Long> selectedValues;
    private final Long taxonomyNode;
    private final TaxonomyUserInputValidator userInputValidator;
    private final String version;

    public TaxonomyAttributeValueSet(@C17402n(name = "attribute") Long l, @C17402n(name = "displayName") String str, @C17402n(name = "isRequired") Boolean bool, @C17402n(name = "novaIds") List<Long> list, @C17402n(name = "possiblePropertyClass") String str2, @C17402n(name = "possibleValues") List<Long> list2, @C17402n(name = "selectedValues") List<Long> list3, @C17402n(name = "taxonomyNode") Long l2, @C17402n(name = "userInputValidator") TaxonomyUserInputValidator taxonomyUserInputValidator, @C17402n(name = "version") String str3) {
        this.attribute = l;
        this.displayName = str;
        this.isRequired = bool;
        this.novaIds = list;
        this.possiblePropertyClass = str2;
        this.possibleValues = list2;
        this.selectedValues = list3;
        this.taxonomyNode = l2;
        this.userInputValidator = taxonomyUserInputValidator;
        this.version = str3;
    }

    public static /* synthetic */ TaxonomyAttributeValueSet copy$default(TaxonomyAttributeValueSet taxonomyAttributeValueSet, Long l, String str, Boolean bool, List list, String str2, List list2, List list3, Long l2, TaxonomyUserInputValidator taxonomyUserInputValidator, String str3, int i, Object obj) {
        TaxonomyAttributeValueSet taxonomyAttributeValueSet2 = taxonomyAttributeValueSet;
        int i2 = i;
        return taxonomyAttributeValueSet.copy((i2 & 1) != 0 ? taxonomyAttributeValueSet2.attribute : l, (i2 & 2) != 0 ? taxonomyAttributeValueSet2.displayName : str, (i2 & 4) != 0 ? taxonomyAttributeValueSet2.isRequired : bool, (i2 & 8) != 0 ? taxonomyAttributeValueSet2.novaIds : list, (i2 & 16) != 0 ? taxonomyAttributeValueSet2.possiblePropertyClass : str2, (i2 & 32) != 0 ? taxonomyAttributeValueSet2.possibleValues : list2, (i2 & 64) != 0 ? taxonomyAttributeValueSet2.selectedValues : list3, (i2 & 128) != 0 ? taxonomyAttributeValueSet2.taxonomyNode : l2, (i2 & 256) != 0 ? taxonomyAttributeValueSet2.userInputValidator : taxonomyUserInputValidator, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? taxonomyAttributeValueSet2.version : str3);
    }

    public final Long component1() {
        return this.attribute;
    }

    public final String component10() {
        return this.version;
    }

    public final String component2() {
        return this.displayName;
    }

    public final Boolean component3() {
        return this.isRequired;
    }

    public final List<Long> component4() {
        return this.novaIds;
    }

    public final String component5() {
        return this.possiblePropertyClass;
    }

    public final List<Long> component6() {
        return this.possibleValues;
    }

    public final List<Long> component7() {
        return this.selectedValues;
    }

    public final Long component8() {
        return this.taxonomyNode;
    }

    public final TaxonomyUserInputValidator component9() {
        return this.userInputValidator;
    }

    public final TaxonomyAttributeValueSet copy(@C17402n(name = "attribute") Long l, @C17402n(name = "displayName") String str, @C17402n(name = "isRequired") Boolean bool, @C17402n(name = "novaIds") List<Long> list, @C17402n(name = "possiblePropertyClass") String str2, @C17402n(name = "possibleValues") List<Long> list2, @C17402n(name = "selectedValues") List<Long> list3, @C17402n(name = "taxonomyNode") Long l2, @C17402n(name = "userInputValidator") TaxonomyUserInputValidator taxonomyUserInputValidator, @C17402n(name = "version") String str3) {
        return new TaxonomyAttributeValueSet(l, str, bool, list, str2, list2, list3, l2, taxonomyUserInputValidator, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyAttributeValueSet)) {
            return false;
        }
        TaxonomyAttributeValueSet taxonomyAttributeValueSet = (TaxonomyAttributeValueSet) obj;
        return C19383o.m32792b(this.attribute, taxonomyAttributeValueSet.attribute) && C19383o.m32792b(this.displayName, taxonomyAttributeValueSet.displayName) && C19383o.m32792b(this.isRequired, taxonomyAttributeValueSet.isRequired) && C19383o.m32792b(this.novaIds, taxonomyAttributeValueSet.novaIds) && C19383o.m32792b(this.possiblePropertyClass, taxonomyAttributeValueSet.possiblePropertyClass) && C19383o.m32792b(this.possibleValues, taxonomyAttributeValueSet.possibleValues) && C19383o.m32792b(this.selectedValues, taxonomyAttributeValueSet.selectedValues) && C19383o.m32792b(this.taxonomyNode, taxonomyAttributeValueSet.taxonomyNode) && C19383o.m32792b(this.userInputValidator, taxonomyAttributeValueSet.userInputValidator) && C19383o.m32792b(this.version, taxonomyAttributeValueSet.version);
    }

    public final Long getAttribute() {
        return this.attribute;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<Long> getNovaIds() {
        return this.novaIds;
    }

    public final String getPossiblePropertyClass() {
        return this.possiblePropertyClass;
    }

    public final List<Long> getPossibleValues() {
        return this.possibleValues;
    }

    public final List<Long> getSelectedValues() {
        return this.selectedValues;
    }

    public final Long getTaxonomyNode() {
        return this.taxonomyNode;
    }

    public final TaxonomyUserInputValidator getUserInputValidator() {
        return this.userInputValidator;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l = this.attribute;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isRequired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Long> list = this.novaIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.possiblePropertyClass;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Long> list2 = this.possibleValues;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.selectedValues;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l2 = this.taxonomyNode;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        TaxonomyUserInputValidator taxonomyUserInputValidator = this.userInputValidator;
        int hashCode9 = (hashCode8 + (taxonomyUserInputValidator == null ? 0 : taxonomyUserInputValidator.hashCode())) * 31;
        String str3 = this.version;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode9 + i;
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyAttributeValueSet(attribute=");
        h.append(this.attribute);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", isRequired=");
        h.append(this.isRequired);
        h.append(", novaIds=");
        h.append(this.novaIds);
        h.append(", possiblePropertyClass=");
        h.append(this.possiblePropertyClass);
        h.append(", possibleValues=");
        h.append(this.possibleValues);
        h.append(", selectedValues=");
        h.append(this.selectedValues);
        h.append(", taxonomyNode=");
        h.append(this.taxonomyNode);
        h.append(", userInputValidator=");
        h.append(this.userInputValidator);
        h.append(", version=");
        return C0391c.m1057c(h, this.version, ')');
    }
}
