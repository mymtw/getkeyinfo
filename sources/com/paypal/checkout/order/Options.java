package com.paypal.checkout.order;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.createorder.ShippingType;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class Options {
    private final UnitAmount amount;

    /* renamed from: id */
    private final String f37516id;
    private final String label;
    private final boolean selected;
    private final ShippingType type;

    public static final class Builder {
        private UnitAmount amount;

        /* renamed from: id */
        private String f37517id;
        private String label;
        private boolean selected;
        private ShippingType type;

        public final Builder amount(UnitAmount unitAmount) {
            this.amount = unitAmount;
            return this;
        }

        public final Options build() {
            String str = this.f37517id;
            if (str != null) {
                boolean z = this.selected;
                String str2 = this.label;
                if (str2 != null) {
                    return new Options(str, z, str2, this.type, this.amount);
                }
                C19383o.m32805o(ResponseConstants.LABEL);
                throw null;
            }
            C19383o.m32805o("id");
            throw null;
        }

        /* renamed from: id */
        public final Builder mo62039id(String str) {
            C19383o.m32797g(str, "id");
            this.f37517id = str;
            return this;
        }

        public final Builder label(String str) {
            C19383o.m32797g(str, ResponseConstants.LABEL);
            this.label = str;
            return this;
        }

        public final Builder selected(boolean z) {
            this.selected = z;
            return this;
        }

        public final Builder type(ShippingType shippingType) {
            this.type = shippingType;
            return this;
        }
    }

    public Options(String str, boolean z, String str2, ShippingType shippingType, UnitAmount unitAmount) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        this.f37516id = str;
        this.selected = z;
        this.label = str2;
        this.type = shippingType;
        this.amount = unitAmount;
    }

    public static /* synthetic */ Options copy$default(Options options, String str, boolean z, String str2, ShippingType shippingType, UnitAmount unitAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            str = options.f37516id;
        }
        if ((i & 2) != 0) {
            z = options.selected;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = options.label;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            shippingType = options.type;
        }
        ShippingType shippingType2 = shippingType;
        if ((i & 16) != 0) {
            unitAmount = options.amount;
        }
        return options.copy(str, z2, str3, shippingType2, unitAmount);
    }

    public final String component1() {
        return this.f37516id;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final String component3() {
        return this.label;
    }

    public final ShippingType component4() {
        return this.type;
    }

    public final UnitAmount component5() {
        return this.amount;
    }

    public final Options copy(String str, boolean z, String str2, ShippingType shippingType, UnitAmount unitAmount) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        return new Options(str, z, str2, shippingType, unitAmount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return C19383o.m32792b(this.f37516id, options.f37516id) && this.selected == options.selected && C19383o.m32792b(this.label, options.label) && this.type == options.type && C19383o.m32792b(this.amount, options.amount);
    }

    public final UnitAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f37516id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final ShippingType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.f37516id.hashCode() * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.label, (hashCode + (z ? 1 : 0)) * 31, 31);
        ShippingType shippingType = this.type;
        int i = 0;
        int hashCode2 = (e + (shippingType == null ? 0 : shippingType.hashCode())) * 31;
        UnitAmount unitAmount = this.amount;
        if (unitAmount != null) {
            i = unitAmount.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f37516id;
        boolean z = this.selected;
        String str2 = this.label;
        ShippingType shippingType = this.type;
        UnitAmount unitAmount = this.amount;
        return "Options(id=" + str + ", selected=" + z + ", label=" + str2 + ", type=" + shippingType + ", amount=" + unitAmount + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Options(String str, boolean z, String str2, ShippingType shippingType, UnitAmount unitAmount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : shippingType, (i & 16) != 0 ? null : unitAmount);
    }
}
