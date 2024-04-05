package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public final class AttributeFacet extends BaseFieldModel {
    public static final int $stable = 8;
    public static final String ATTRIBUTE = "attribute";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DEFAULT_SCALE = "default_scale";
    public static final String RANGE_FACETS = "range_facets";
    public static final String VALUE_FACETS = "value_facets";
    private AttributeValue attribute;
    private AttributeValue defaultScale;
    private List<RangeFacet> rangeFacets;
    private List<ValueFacet> valueFacets;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AttributeFacet() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this.valueFacets = emptyList;
        this.rangeFacets = emptyList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(AttributeFacet.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.filters.AttributeFacet");
        AttributeFacet attributeFacet = (AttributeFacet) obj;
        return C19383o.m32792b(this.attribute, attributeFacet.attribute) && C19383o.m32792b(this.defaultScale, attributeFacet.defaultScale) && C19383o.m32792b(this.valueFacets, attributeFacet.valueFacets) && C19383o.m32792b(this.rangeFacets, attributeFacet.rangeFacets);
    }

    public final AttributeValue getAttribute() {
        return this.attribute;
    }

    public final AttributeValue getDefaultScale() {
        return this.defaultScale;
    }

    public final List<RangeFacet> getRangeFacets() {
        return this.rangeFacets;
    }

    public final List<ValueFacet> getValueFacets() {
        return this.valueFacets;
    }

    public int hashCode() {
        AttributeValue attributeValue = this.attribute;
        int i = 0;
        int hashCode = (attributeValue != null ? attributeValue.hashCode() : 0) * 31;
        AttributeValue attributeValue2 = this.defaultScale;
        if (attributeValue2 != null) {
            i = attributeValue2.hashCode();
        }
        return this.rangeFacets.hashCode() + C13983i.m21488g(this.valueFacets, (hashCode + i) * 31, 31);
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -944433442:
                if (str.equals(RANGE_FACETS)) {
                    this.rangeFacets = BaseModel.Companion.parseArray(jsonParser, RangeFacet.class);
                    return true;
                }
                break;
            case 13085340:
                if (str.equals(ATTRIBUTE)) {
                    this.attribute = (AttributeValue) BaseModel.Companion.parseObject(jsonParser, AttributeValue.class);
                    return true;
                }
                break;
            case 430365738:
                if (str.equals(VALUE_FACETS)) {
                    this.valueFacets = BaseModel.Companion.parseArray(jsonParser, ValueFacet.class);
                    return true;
                }
                break;
            case 1315950028:
                if (str.equals(DEFAULT_SCALE)) {
                    this.defaultScale = (AttributeValue) BaseModel.Companion.parseObject(jsonParser, AttributeValue.class);
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setAttribute(AttributeValue attributeValue) {
        this.attribute = attributeValue;
    }

    public final void setDefaultScale(AttributeValue attributeValue) {
        this.defaultScale = attributeValue;
    }

    public final void setRangeFacets(List<RangeFacet> list) {
        C19383o.m32797g(list, "<set-?>");
        this.rangeFacets = list;
    }

    public final void setValueFacets(List<ValueFacet> list) {
        C19383o.m32797g(list, "<set-?>");
        this.valueFacets = list;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AttributeFacet(attribute=");
        h.append(this.attribute);
        h.append(')');
        return h.toString();
    }
}
