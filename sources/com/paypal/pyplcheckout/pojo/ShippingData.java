package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.paypal.checkout.order.Options;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ShippingData {
    @C18417a("billingToken")
    private final String billingToken;
    @C18417a("checkoutToken")
    private final String checkoutToken;
    @C18417a("ecToken")
    private final String ecToken;
    @C18417a("paymentId")
    private final String paymentId;
    @C18417a("selectedShippingMethod")
    private final ShippingMethods selectedShippingMethod;
    @C18417a("shippingOptions")
    private final List<Options> shippingOptions;
    @C18417a("updatedShippingAddress")
    private final UpdatedShippingAddress updatedShippingAddress;

    public ShippingData(String str, String str2, UpdatedShippingAddress updatedShippingAddress2, String str3, String str4, ShippingMethods shippingMethods, List<Options> list) {
        C19383o.m32797g(str, "ecToken");
        C19383o.m32797g(str2, "checkoutToken");
        C19383o.m32797g(updatedShippingAddress2, "updatedShippingAddress");
        this.ecToken = str;
        this.checkoutToken = str2;
        this.updatedShippingAddress = updatedShippingAddress2;
        this.paymentId = str3;
        this.billingToken = str4;
        this.selectedShippingMethod = shippingMethods;
        this.shippingOptions = list;
    }

    public static /* synthetic */ ShippingData copy$default(ShippingData shippingData, String str, String str2, UpdatedShippingAddress updatedShippingAddress2, String str3, String str4, ShippingMethods shippingMethods, List<Options> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingData.ecToken;
        }
        if ((i & 2) != 0) {
            str2 = shippingData.checkoutToken;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            updatedShippingAddress2 = shippingData.updatedShippingAddress;
        }
        UpdatedShippingAddress updatedShippingAddress3 = updatedShippingAddress2;
        if ((i & 8) != 0) {
            str3 = shippingData.paymentId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = shippingData.billingToken;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            shippingMethods = shippingData.selectedShippingMethod;
        }
        ShippingMethods shippingMethods2 = shippingMethods;
        if ((i & 64) != 0) {
            list = shippingData.shippingOptions;
        }
        return shippingData.copy(str, str5, updatedShippingAddress3, str6, str7, shippingMethods2, list);
    }

    public final String component1() {
        return this.ecToken;
    }

    public final String component2() {
        return this.checkoutToken;
    }

    public final UpdatedShippingAddress component3() {
        return this.updatedShippingAddress;
    }

    public final String component4() {
        return this.paymentId;
    }

    public final String component5() {
        return this.billingToken;
    }

    public final ShippingMethods component6() {
        return this.selectedShippingMethod;
    }

    public final List<Options> component7() {
        return this.shippingOptions;
    }

    public final ShippingData copy(String str, String str2, UpdatedShippingAddress updatedShippingAddress2, String str3, String str4, ShippingMethods shippingMethods, List<Options> list) {
        C19383o.m32797g(str, "ecToken");
        C19383o.m32797g(str2, "checkoutToken");
        C19383o.m32797g(updatedShippingAddress2, "updatedShippingAddress");
        return new ShippingData(str, str2, updatedShippingAddress2, str3, str4, shippingMethods, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingData)) {
            return false;
        }
        ShippingData shippingData = (ShippingData) obj;
        return C19383o.m32792b(this.ecToken, shippingData.ecToken) && C19383o.m32792b(this.checkoutToken, shippingData.checkoutToken) && C19383o.m32792b(this.updatedShippingAddress, shippingData.updatedShippingAddress) && C19383o.m32792b(this.paymentId, shippingData.paymentId) && C19383o.m32792b(this.billingToken, shippingData.billingToken) && C19383o.m32792b(this.selectedShippingMethod, shippingData.selectedShippingMethod) && C19383o.m32792b(this.shippingOptions, shippingData.shippingOptions);
    }

    public final String getBillingToken() {
        return this.billingToken;
    }

    public final String getCheckoutToken() {
        return this.checkoutToken;
    }

    public final String getEcToken() {
        return this.ecToken;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final ShippingMethods getSelectedShippingMethod() {
        return this.selectedShippingMethod;
    }

    public final List<Options> getShippingOptions() {
        return this.shippingOptions;
    }

    public final UpdatedShippingAddress getUpdatedShippingAddress() {
        return this.updatedShippingAddress;
    }

    public int hashCode() {
        int hashCode = (this.updatedShippingAddress.hashCode() + C0023f.m105e(this.checkoutToken, this.ecToken.hashCode() * 31, 31)) * 31;
        String str = this.paymentId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingMethods shippingMethods = this.selectedShippingMethod;
        int hashCode4 = (hashCode3 + (shippingMethods == null ? 0 : shippingMethods.hashCode())) * 31;
        List<Options> list = this.shippingOptions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.ecToken;
        String str2 = this.checkoutToken;
        UpdatedShippingAddress updatedShippingAddress2 = this.updatedShippingAddress;
        String str3 = this.paymentId;
        String str4 = this.billingToken;
        ShippingMethods shippingMethods = this.selectedShippingMethod;
        List<Options> list = this.shippingOptions;
        StringBuilder f = C0388a.m1050f("ShippingData(ecToken=", str, ", checkoutToken=", str2, ", updatedShippingAddress=");
        f.append(updatedShippingAddress2);
        f.append(", paymentId=");
        f.append(str3);
        f.append(", billingToken=");
        f.append(str4);
        f.append(", selectedShippingMethod=");
        f.append(shippingMethods);
        f.append(", shippingOptions=");
        return C0326j.m865j(f, list, ")");
    }
}
