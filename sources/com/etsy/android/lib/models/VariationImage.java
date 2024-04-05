package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.LogCatKt;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425q9.C13258i;

@JsonPropertyOrder(alphabetic = true)
public final class VariationImage extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Long imageId;
    @JsonIgnore
    private String inventoryValue;
    private Integer order;
    private Long propertyId;
    private Long valueId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JsonIgnore
        public final String serialize(List<VariationImage> list) {
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            if (list.isEmpty()) {
                return "[]";
            }
            try {
                String writeValueAsString = C13258i.f29122d.f29125c.writeValueAsString(list);
                C19383o.m32796f(writeValueAsString, "getInstance().modelMappe…writeValueAsString(items)");
                return writeValueAsString;
            } catch (JsonProcessingException e) {
                LogCatKt.m17045a().error(e);
                return "[]";
            }
        }
    }

    public VariationImage() {
        this((Long) null, (Integer) null, (Long) null, (Long) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VariationImage(java.lang.Long r5, java.lang.Integer r6, java.lang.Long r7, java.lang.Long r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.VariationImage.<init>(java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ VariationImage copy$default(VariationImage variationImage, Long l, Integer num, Long l2, Long l3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = variationImage.propertyId;
        }
        if ((i & 2) != 0) {
            num = variationImage.order;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            l2 = variationImage.imageId;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            l3 = variationImage.valueId;
        }
        Long l5 = l3;
        if ((i & 16) != 0) {
            str = variationImage.inventoryValue;
        }
        return variationImage.copy(l, num2, l4, l5, str);
    }

    public final Long component1() {
        return this.propertyId;
    }

    public final Integer component2() {
        return this.order;
    }

    public final Long component3() {
        return this.imageId;
    }

    public final Long component4() {
        return this.valueId;
    }

    public final String component5() {
        return this.inventoryValue;
    }

    public final VariationImage copy(@JsonProperty("property_id") Long l, @JsonProperty("order") Integer num, @JsonProperty("image_id") Long l2, @JsonProperty("value_id") Long l3, String str) {
        return new VariationImage(l, num, l2, l3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(obj != null ? obj.getClass() : null, VariationImage.class)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.VariationImage");
        VariationImage variationImage = (VariationImage) obj;
        return C19383o.m32792b(variationImage.propertyId, this.propertyId) && C19383o.m32792b(variationImage.order, this.order) && C19383o.m32792b(variationImage.imageId, this.imageId) && (C19383o.m32792b(variationImage.valueId, this.valueId) || C19383o.m32792b(variationImage.inventoryValue, this.inventoryValue));
    }

    public final Long getImageId() {
        return this.imageId;
    }

    public final String getInventoryValue() {
        return this.inventoryValue;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Long getPropertyId() {
        return this.propertyId;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return C19388s.m32880q0(this);
    }

    @JsonIgnore
    public final Long getValueId() {
        return this.valueId;
    }

    public int hashCode() {
        Long l = this.propertyId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.order;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.imageId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.valueId;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.inventoryValue;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parseField(com.fasterxml.jackson.core.JsonParser r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "jp"
            java.lang.String r1 = "fieldName"
            int r0 = android.support.p013v4.media.C0072d.m197c(r3, r0, r4, r1)
            switch(r0) {
                case -1410163031: goto L_0x0048;
                case -859601281: goto L_0x0034;
                case 106006350: goto L_0x0020;
                case 1357596613: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005d
        L_0x000c:
            java.lang.String r0 = "property_id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0015
            goto L_0x005d
        L_0x0015:
            long r3 = r3.getLongValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.propertyId = r3
            goto L_0x005b
        L_0x0020:
            java.lang.String r0 = "order"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0029
            goto L_0x005d
        L_0x0029:
            int r3 = r3.getIntValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.order = r3
            goto L_0x005b
        L_0x0034:
            java.lang.String r0 = "image_id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003d
            goto L_0x005d
        L_0x003d:
            long r3 = r3.getLongValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.imageId = r3
            goto L_0x005b
        L_0x0048:
            java.lang.String r0 = "value_id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            long r3 = r3.getLongValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.valueId = r3
        L_0x005b:
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.VariationImage.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }

    public final void setImageId(Long l) {
        this.imageId = l;
    }

    public final void setInventoryValue(String str) {
        this.inventoryValue = str;
    }

    public final void setOrder(Integer num) {
        this.order = num;
    }

    public final void setPropertyId(Long l) {
        this.propertyId = l;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    public final void setValueId(Long l) {
        this.valueId = l;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("VariationImage(propertyId=");
        h.append(this.propertyId);
        h.append(", order=");
        h.append(this.order);
        h.append(", imageId=");
        h.append(this.imageId);
        h.append(", valueId=");
        h.append(this.valueId);
        h.append(", inventoryValue=");
        return C0391c.m1057c(h, this.inventoryValue, ')');
    }

    public VariationImage(@JsonProperty("property_id") Long l, @JsonProperty("order") Integer num, @JsonProperty("image_id") Long l2, @JsonProperty("value_id") Long l3, String str) {
        this.propertyId = l;
        this.order = num;
        this.imageId = l2;
        this.valueId = l3;
        this.inventoryValue = str;
    }
}
