package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.ShippingType;
import com.paypal.checkout.order.Options;
import com.paypal.checkout.order.UnitAmount;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ShippingMethods {
    @C18417a("amount")
    private final Amount amount;
    @C18417a("id")

    /* renamed from: id */
    private final String f37795id;
    @C18417a("label")
    private final String label;
    @C18417a("selected")
    private boolean selected;
    @C18417a("type")
    private final ShippingMethodType.Type type;

    public ShippingMethods(String str, String str2, boolean z, Amount amount2, ShippingMethodType.Type type2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(type2, "type");
        this.f37795id = str;
        this.label = str2;
        this.selected = z;
        this.amount = amount2;
        this.type = type2;
    }

    public static /* synthetic */ ShippingMethods copy$default(ShippingMethods shippingMethods, String str, String str2, boolean z, Amount amount2, ShippingMethodType.Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingMethods.f37795id;
        }
        if ((i & 2) != 0) {
            str2 = shippingMethods.label;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = shippingMethods.selected;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            amount2 = shippingMethods.amount;
        }
        Amount amount3 = amount2;
        if ((i & 16) != 0) {
            type2 = shippingMethods.type;
        }
        return shippingMethods.copy(str, str3, z2, amount3, type2);
    }

    public final String component1() {
        return this.f37795id;
    }

    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final Amount component4() {
        return this.amount;
    }

    public final ShippingMethodType.Type component5() {
        return this.type;
    }

    public final ShippingMethods copy(String str, String str2, boolean z, Amount amount2, ShippingMethodType.Type type2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(type2, "type");
        return new ShippingMethods(str, str2, z, amount2, type2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingMethods)) {
            return false;
        }
        ShippingMethods shippingMethods = (ShippingMethods) obj;
        return C19383o.m32792b(this.f37795id, shippingMethods.f37795id) && C19383o.m32792b(this.label, shippingMethods.label) && this.selected == shippingMethods.selected && C19383o.m32792b(this.amount, shippingMethods.amount) && this.type == shippingMethods.type;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f37795id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final ShippingMethodType.Type getType() {
        return this.type;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.label, this.f37795id.hashCode() * 31, 31);
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        Amount amount2 = this.amount;
        return this.type.hashCode() + ((i + (amount2 == null ? 0 : amount2.hashCode())) * 31);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final Options toOptions(CurrencyCode currencyCode) {
        C19383o.m32797g(currencyCode, AppsFlyerProperties.CURRENCY_CODE);
        Amount amount2 = this.amount;
        if ((amount2 == null ? null : amount2.getCurrencyValue()) != null) {
            return new Options.Builder().mo62039id(this.f37795id).amount(new UnitAmount.Builder().value(this.amount.getCurrencyValue()).currencyCode(currencyCode).build()).type(this.type == ShippingMethodType.Type.SHIPPING ? ShippingType.SHIPPING : ShippingType.PICKUP).label(this.label).selected(this.selected).build();
        }
        throw new IllegalArgumentException("Currency Value is not set");
    }

    public String toString() {
        String str = this.f37795id;
        String str2 = this.label;
        boolean z = this.selected;
        Amount amount2 = this.amount;
        ShippingMethodType.Type type2 = this.type;
        StringBuilder f = C0388a.m1050f("ShippingMethods(id=", str, ", label=", str2, ", selected=");
        f.append(z);
        f.append(", amount=");
        f.append(amount2);
        f.append(", type=");
        f.append(type2);
        f.append(")");
        return f.toString();
    }
}
