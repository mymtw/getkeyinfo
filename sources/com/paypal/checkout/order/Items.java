package com.paypal.checkout.order;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.createorder.ItemCategory;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Items {
    private final ItemCategory category;
    private final String description;
    private final String name;
    private final String quantity;
    private final String sku;
    private final UnitAmount tax;
    @C18417a("unit_amount")
    private final UnitAmount unitAmount;

    public static final class Builder {
        private ItemCategory category;
        private String description;
        private String name;
        private String quantity;
        private String sku;
        private UnitAmount tax;
        private UnitAmount unitAmount;

        public final Items build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.description;
                String str3 = this.sku;
                String str4 = this.quantity;
                if (str4 != null) {
                    ItemCategory itemCategory = this.category;
                    UnitAmount unitAmount2 = this.tax;
                    UnitAmount unitAmount3 = this.unitAmount;
                    if (unitAmount3 != null) {
                        return new Items(str, str2, str3, str4, itemCategory, unitAmount2, unitAmount3, (DefaultConstructorMarker) null);
                    }
                    C19383o.m32805o("unitAmount");
                    throw null;
                }
                C19383o.m32805o(ResponseConstants.QUANTITY);
                throw null;
            }
            C19383o.m32805o("name");
            throw null;
        }

        public final Builder category(ItemCategory itemCategory) {
            C19383o.m32797g(itemCategory, ResponseConstants.CATEGORY);
            this.category = itemCategory;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder name(String str) {
            C19383o.m32797g(str, "name");
            this.name = str;
            return this;
        }

        public final Builder quantity(String str) {
            C19383o.m32797g(str, ResponseConstants.QUANTITY);
            this.quantity = str;
            return this;
        }

        public final Builder sku(String str) {
            this.sku = str;
            return this;
        }

        public final Builder tax(UnitAmount unitAmount2) {
            this.tax = unitAmount2;
            return this;
        }

        public final Builder unitAmount(UnitAmount unitAmount2) {
            C19383o.m32797g(unitAmount2, "unitAmount");
            this.unitAmount = unitAmount2;
            return this;
        }
    }

    private Items(String str, String str2, String str3, String str4, ItemCategory itemCategory, UnitAmount unitAmount2, UnitAmount unitAmount3) {
        this.name = str;
        this.description = str2;
        this.sku = str3;
        this.quantity = str4;
        this.category = itemCategory;
        this.tax = unitAmount2;
        this.unitAmount = unitAmount3;
    }

    public /* synthetic */ Items(String str, String str2, String str3, String str4, ItemCategory itemCategory, UnitAmount unitAmount2, UnitAmount unitAmount3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, itemCategory, unitAmount2, unitAmount3);
    }

    public final ItemCategory getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public final UnitAmount getTax() {
        return this.tax;
    }

    public final UnitAmount getUnitAmount() {
        return this.unitAmount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Items(String str, String str2, String str3, String str4, ItemCategory itemCategory, UnitAmount unitAmount2, UnitAmount unitAmount3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : itemCategory, (i & 32) != 0 ? null : unitAmount2, unitAmount3);
    }
}
