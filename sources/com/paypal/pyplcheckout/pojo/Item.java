package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Item {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("description")
    private final String description;
    @C18417a("details")
    private final Object details;
    @C18417a("name")
    private final String name;
    @C18417a("quantity")
    private final Integer quantity;
    @C18417a("total")
    private final Amount total;
    @C18417a("unitPrice")
    private final Amount unitPrice;

    public Item() {
        this((String) null, (String) null, (Amount) null, (Integer) null, (Amount) null, (Object) null, (Map) null, 127, (DefaultConstructorMarker) null);
    }

    public Item(String str, String str2, Amount amount, Integer num, Amount amount2, Object obj, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.description = str;
        this.name = str2;
        this.unitPrice = amount;
        this.quantity = num;
        this.total = amount2;
        this.details = obj;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, Amount amount, Integer num, Amount amount2, Object obj, Map<String, Object> map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = item.description;
        }
        if ((i & 2) != 0) {
            str2 = item.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            amount = item.unitPrice;
        }
        Amount amount3 = amount;
        if ((i & 8) != 0) {
            num = item.quantity;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            amount2 = item.total;
        }
        Amount amount4 = amount2;
        if ((i & 32) != 0) {
            obj = item.details;
        }
        Object obj3 = obj;
        if ((i & 64) != 0) {
            map = item.additionalProperties;
        }
        return item.copy(str, str3, amount3, num2, amount4, obj3, map);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.name;
    }

    public final Amount component3() {
        return this.unitPrice;
    }

    public final Integer component4() {
        return this.quantity;
    }

    public final Amount component5() {
        return this.total;
    }

    public final Object component6() {
        return this.details;
    }

    public final Map<String, Object> component7() {
        return this.additionalProperties;
    }

    public final Item copy(String str, String str2, Amount amount, Integer num, Amount amount2, Object obj, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new Item(str, str2, amount, num, amount2, obj, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return C19383o.m32792b(this.description, item.description) && C19383o.m32792b(this.name, item.name) && C19383o.m32792b(this.unitPrice, item.unitPrice) && C19383o.m32792b(this.quantity, item.quantity) && C19383o.m32792b(this.total, item.total) && C19383o.m32792b(this.details, item.details) && C19383o.m32792b(this.additionalProperties, item.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Object getDetails() {
        return this.details;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Amount getTotal() {
        return this.total;
    }

    public final Amount getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        String str = this.description;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.unitPrice;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Amount amount2 = this.total;
        int hashCode5 = (hashCode4 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Object obj = this.details;
        if (obj != null) {
            i = obj.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode5 + i) * 31);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.name;
        Amount amount = this.unitPrice;
        Integer num = this.quantity;
        Amount amount2 = this.total;
        Object obj = this.details;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder f = C0388a.m1050f("Item(description=", str, ", name=", str2, ", unitPrice=");
        f.append(amount);
        f.append(", quantity=");
        f.append(num);
        f.append(", total=");
        f.append(amount2);
        f.append(", details=");
        f.append(obj);
        f.append(", additionalProperties=");
        f.append(map);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Item(java.lang.String r6, java.lang.String r7, com.paypal.pyplcheckout.pojo.Amount r8, java.lang.Integer r9, com.paypal.pyplcheckout.pojo.Amount r10, java.lang.Object r11, java.util.Map r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r14 = r0
            goto L_0x0008
        L_0x0007:
            r14 = r6
        L_0x0008:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r11
        L_0x002a:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0033
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
        L_0x0033:
            r13 = r12
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Item.<init>(java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.Amount, java.lang.Integer, com.paypal.pyplcheckout.pojo.Amount, java.lang.Object, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
