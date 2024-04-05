package com.etsy.android.lib.models.apiv3.filters;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AttributeValue extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String IS_SIZE = "is_size";
    private SearchFiltersV2Type filterType;

    /* renamed from: id */
    private String f19141id;
    private Image image;
    private Boolean isSize = Boolean.FALSE;
    private String name;
    private Integer nameRes = 0;

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
        if (!C19383o.m32792b(AttributeValue.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.filters.AttributeValue");
        AttributeValue attributeValue = (AttributeValue) obj;
        return C19383o.m32792b(this.f19141id, attributeValue.f19141id) && C19383o.m32792b(this.name, attributeValue.name) && C19383o.m32792b(this.nameRes, attributeValue.nameRes) && this.filterType == attributeValue.filterType;
    }

    public final SearchFiltersV2Type getFilterType() {
        return this.filterType;
    }

    public final String getId() {
        return this.f19141id;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getNameRes() {
        return this.nameRes;
    }

    public int hashCode() {
        String str = this.f19141id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.nameRes;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        SearchFiltersV2Type searchFiltersV2Type = this.filterType;
        if (searchFiltersV2Type != null) {
            i = searchFiltersV2Type.hashCode();
        }
        return intValue + i;
    }

    public final Boolean isSize() {
        return this.isSize;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != 3355) {
            if (c != 104387) {
                if (c != 3373707) {
                    if (c == 2082223606 && str.equals(IS_SIZE)) {
                        this.isSize = Boolean.valueOf(jsonParser.getBooleanValue());
                        return true;
                    }
                } else if (str.equals("name")) {
                    this.name = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
            } else if (str.equals(ResponseConstants.IMG)) {
                this.image = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                return true;
            }
        } else if (str.equals("id")) {
            this.f19141id = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
        return false;
    }

    public final void setFilterType(SearchFiltersV2Type searchFiltersV2Type) {
        this.filterType = searchFiltersV2Type;
    }

    public final void setId(String str) {
        this.f19141id = str;
    }

    public final void setImage(Image image2) {
        this.image = image2;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNameRes(Integer num) {
        this.nameRes = num;
    }

    public final void setSize(Boolean bool) {
        this.isSize = bool;
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("AttributeValue(name="), this.name, ')');
    }
}
