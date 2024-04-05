package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class AppsInventoryAddToCartContext {
    public static final int $stable = 8;
    private final Money maxPrice;
    private final Integer maxQuantity;
    private final Money minPrice;
    private final Integer minQuantity;
    private final Nudge nudge;
    private final InventoryProductOffering offering;

    /* renamed from: ui */
    private final AppsInventoryAddToCartUi f19143ui;

    public AppsInventoryAddToCartContext() {
        this((Money) null, (Integer) null, (Money) null, (Integer) null, (InventoryProductOffering) null, (AppsInventoryAddToCartUi) null, (Nudge) null, 127, (DefaultConstructorMarker) null);
    }

    public AppsInventoryAddToCartContext(@C17402n(name = "max_price") Money money, @C17402n(name = "max_quantity") Integer num, @C17402n(name = "min_price") Money money2, @C17402n(name = "min_quantity") Integer num2, @C17402n(name = "offering") InventoryProductOffering inventoryProductOffering, @C17402n(name = "ui") AppsInventoryAddToCartUi appsInventoryAddToCartUi, @C17402n(name = "nudge") Nudge nudge2) {
        this.maxPrice = money;
        this.maxQuantity = num;
        this.minPrice = money2;
        this.minQuantity = num2;
        this.offering = inventoryProductOffering;
        this.f19143ui = appsInventoryAddToCartUi;
        this.nudge = nudge2;
    }

    public static /* synthetic */ AppsInventoryAddToCartContext copy$default(AppsInventoryAddToCartContext appsInventoryAddToCartContext, Money money, Integer num, Money money2, Integer num2, InventoryProductOffering inventoryProductOffering, AppsInventoryAddToCartUi appsInventoryAddToCartUi, Nudge nudge2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = appsInventoryAddToCartContext.maxPrice;
        }
        if ((i & 2) != 0) {
            num = appsInventoryAddToCartContext.maxQuantity;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            money2 = appsInventoryAddToCartContext.minPrice;
        }
        Money money3 = money2;
        if ((i & 8) != 0) {
            num2 = appsInventoryAddToCartContext.minQuantity;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            inventoryProductOffering = appsInventoryAddToCartContext.offering;
        }
        InventoryProductOffering inventoryProductOffering2 = inventoryProductOffering;
        if ((i & 32) != 0) {
            appsInventoryAddToCartUi = appsInventoryAddToCartContext.f19143ui;
        }
        AppsInventoryAddToCartUi appsInventoryAddToCartUi2 = appsInventoryAddToCartUi;
        if ((i & 64) != 0) {
            nudge2 = appsInventoryAddToCartContext.nudge;
        }
        return appsInventoryAddToCartContext.copy(money, num3, money3, num4, inventoryProductOffering2, appsInventoryAddToCartUi2, nudge2);
    }

    public final Money component1() {
        return this.maxPrice;
    }

    public final Integer component2() {
        return this.maxQuantity;
    }

    public final Money component3() {
        return this.minPrice;
    }

    public final Integer component4() {
        return this.minQuantity;
    }

    public final InventoryProductOffering component5() {
        return this.offering;
    }

    public final AppsInventoryAddToCartUi component6() {
        return this.f19143ui;
    }

    public final Nudge component7() {
        return this.nudge;
    }

    public final AppsInventoryAddToCartContext copy(@C17402n(name = "max_price") Money money, @C17402n(name = "max_quantity") Integer num, @C17402n(name = "min_price") Money money2, @C17402n(name = "min_quantity") Integer num2, @C17402n(name = "offering") InventoryProductOffering inventoryProductOffering, @C17402n(name = "ui") AppsInventoryAddToCartUi appsInventoryAddToCartUi, @C17402n(name = "nudge") Nudge nudge2) {
        return new AppsInventoryAddToCartContext(money, num, money2, num2, inventoryProductOffering, appsInventoryAddToCartUi, nudge2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInventoryAddToCartContext)) {
            return false;
        }
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = (AppsInventoryAddToCartContext) obj;
        return C19383o.m32792b(this.maxPrice, appsInventoryAddToCartContext.maxPrice) && C19383o.m32792b(this.maxQuantity, appsInventoryAddToCartContext.maxQuantity) && C19383o.m32792b(this.minPrice, appsInventoryAddToCartContext.minPrice) && C19383o.m32792b(this.minQuantity, appsInventoryAddToCartContext.minQuantity) && C19383o.m32792b(this.offering, appsInventoryAddToCartContext.offering) && C19383o.m32792b(this.f19143ui, appsInventoryAddToCartContext.f19143ui) && C19383o.m32792b(this.nudge, appsInventoryAddToCartContext.nudge);
    }

    public final Money getMaxPrice() {
        return this.maxPrice;
    }

    public final Integer getMaxQuantity() {
        return this.maxQuantity;
    }

    public final Money getMinPrice() {
        return this.minPrice;
    }

    public final Integer getMinQuantity() {
        return this.minQuantity;
    }

    public final Nudge getNudge() {
        return this.nudge;
    }

    public final InventoryProductOffering getOffering() {
        return this.offering;
    }

    public final AppsInventoryAddToCartUi getUi() {
        return this.f19143ui;
    }

    public int hashCode() {
        Money money = this.maxPrice;
        int i = 0;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Integer num = this.maxQuantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Money money2 = this.minPrice;
        int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Integer num2 = this.minQuantity;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        InventoryProductOffering inventoryProductOffering = this.offering;
        int hashCode5 = (hashCode4 + (inventoryProductOffering == null ? 0 : inventoryProductOffering.hashCode())) * 31;
        AppsInventoryAddToCartUi appsInventoryAddToCartUi = this.f19143ui;
        int hashCode6 = (hashCode5 + (appsInventoryAddToCartUi == null ? 0 : appsInventoryAddToCartUi.hashCode())) * 31;
        Nudge nudge2 = this.nudge;
        if (nudge2 != null) {
            i = nudge2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppsInventoryAddToCartContext(maxPrice=");
        h.append(this.maxPrice);
        h.append(", maxQuantity=");
        h.append(this.maxQuantity);
        h.append(", minPrice=");
        h.append(this.minPrice);
        h.append(", minQuantity=");
        h.append(this.minQuantity);
        h.append(", offering=");
        h.append(this.offering);
        h.append(", ui=");
        h.append(this.f19143ui);
        h.append(", nudge=");
        h.append(this.nudge);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppsInventoryAddToCartContext(com.etsy.android.lib.models.apiv3.listing.Money r7, java.lang.Integer r8, com.etsy.android.lib.models.apiv3.listing.Money r9, java.lang.Integer r10, com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r11, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r12, com.etsy.android.lib.models.apiv3.listing.Nudge r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext.<init>(com.etsy.android.lib.models.apiv3.listing.Money, java.lang.Integer, com.etsy.android.lib.models.apiv3.listing.Money, java.lang.Integer, com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi, com.etsy.android.lib.models.apiv3.listing.Nudge, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
