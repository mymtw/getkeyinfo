package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ValueFacet extends BaseFieldModel {
    public static final int $stable = 8;
    public static final String ATTRIBUTE_VALUE = "attribute_value";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private AttributeValue attributeValue;
    private String count;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(ValueFacet.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.filters.ValueFacet");
        return C19383o.m32792b(this.attributeValue, ((ValueFacet) obj).attributeValue);
    }

    public final AttributeValue getAttributeValue() {
        return this.attributeValue;
    }

    public final String getCount() {
        return this.count;
    }

    public int hashCode() {
        AttributeValue attributeValue2 = this.attributeValue;
        if (attributeValue2 != null) {
            return attributeValue2.hashCode();
        }
        return 0;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.COUNT)) {
            this.count = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, ATTRIBUTE_VALUE)) {
            return false;
        } else {
            this.attributeValue = (AttributeValue) BaseModel.Companion.parseObject(jsonParser, AttributeValue.class);
            return true;
        }
    }

    public final void setAttributeValue(AttributeValue attributeValue2) {
        this.attributeValue = attributeValue2;
    }

    public final void setCount(String str) {
        this.count = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ValueFacet(count=");
        h.append(this.count);
        h.append(", attributeValue=");
        h.append(this.attributeValue);
        h.append(')');
        return h.toString();
    }
}
