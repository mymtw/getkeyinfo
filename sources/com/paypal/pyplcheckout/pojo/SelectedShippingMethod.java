package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class SelectedShippingMethod {
    private final ShippingAmount amount;

    /* renamed from: id */
    private final String f37793id;
    private final String label;
    private final String type;

    public SelectedShippingMethod(String str, String str2, String str3, ShippingAmount shippingAmount) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(str3, "type");
        C19383o.m32797g(shippingAmount, ResponseConstants.AMOUNT);
        this.f37793id = str;
        this.label = str2;
        this.type = str3;
        this.amount = shippingAmount;
    }

    public static /* synthetic */ SelectedShippingMethod copy$default(SelectedShippingMethod selectedShippingMethod, String str, String str2, String str3, ShippingAmount shippingAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedShippingMethod.f37793id;
        }
        if ((i & 2) != 0) {
            str2 = selectedShippingMethod.label;
        }
        if ((i & 4) != 0) {
            str3 = selectedShippingMethod.type;
        }
        if ((i & 8) != 0) {
            shippingAmount = selectedShippingMethod.amount;
        }
        return selectedShippingMethod.copy(str, str2, str3, shippingAmount);
    }

    public final String component1() {
        return this.f37793id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.type;
    }

    public final ShippingAmount component4() {
        return this.amount;
    }

    public final SelectedShippingMethod copy(String str, String str2, String str3, ShippingAmount shippingAmount) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, ResponseConstants.LABEL);
        C19383o.m32797g(str3, "type");
        C19383o.m32797g(shippingAmount, ResponseConstants.AMOUNT);
        return new SelectedShippingMethod(str, str2, str3, shippingAmount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedShippingMethod)) {
            return false;
        }
        SelectedShippingMethod selectedShippingMethod = (SelectedShippingMethod) obj;
        return C19383o.m32792b(this.f37793id, selectedShippingMethod.f37793id) && C19383o.m32792b(this.label, selectedShippingMethod.label) && C19383o.m32792b(this.type, selectedShippingMethod.type) && C19383o.m32792b(this.amount, selectedShippingMethod.amount);
    }

    public final ShippingAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.f37793id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.amount.hashCode() + C0023f.m105e(this.type, C0023f.m105e(this.label, this.f37793id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.f37793id;
        String str2 = this.label;
        String str3 = this.type;
        ShippingAmount shippingAmount = this.amount;
        StringBuilder f = C0388a.m1050f("SelectedShippingMethod(id=", str, ", label=", str2, ", type=");
        f.append(str3);
        f.append(", amount=");
        f.append(shippingAmount);
        f.append(")");
        return f.toString();
    }
}
