package com.paypal.checkout.shipping;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.paypal.checkout.order.Address;
import com.paypal.checkout.order.Options;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class ShippingChangeData {
    private final String payToken;
    private final String paymentId;
    private final Address shippingAddress;
    private final ShippingChangeType shippingChangeType;
    private final List<Options> shippingOptions;

    public ShippingChangeData(String str, String str2, ShippingChangeType shippingChangeType2, Address address, List<Options> list) {
        C19383o.m32797g(str, "payToken");
        C19383o.m32797g(shippingChangeType2, "shippingChangeType");
        C19383o.m32797g(address, "shippingAddress");
        C19383o.m32797g(list, "shippingOptions");
        this.payToken = str;
        this.paymentId = str2;
        this.shippingChangeType = shippingChangeType2;
        this.shippingAddress = address;
        this.shippingOptions = list;
    }

    public static /* synthetic */ ShippingChangeData copy$default(ShippingChangeData shippingChangeData, String str, String str2, ShippingChangeType shippingChangeType2, Address address, List<Options> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingChangeData.payToken;
        }
        if ((i & 2) != 0) {
            str2 = shippingChangeData.paymentId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            shippingChangeType2 = shippingChangeData.shippingChangeType;
        }
        ShippingChangeType shippingChangeType3 = shippingChangeType2;
        if ((i & 8) != 0) {
            address = shippingChangeData.shippingAddress;
        }
        Address address2 = address;
        if ((i & 16) != 0) {
            list = shippingChangeData.shippingOptions;
        }
        return shippingChangeData.copy(str, str3, shippingChangeType3, address2, list);
    }

    public final String component1() {
        return this.payToken;
    }

    public final String component2() {
        return this.paymentId;
    }

    public final ShippingChangeType component3() {
        return this.shippingChangeType;
    }

    public final Address component4() {
        return this.shippingAddress;
    }

    public final List<Options> component5() {
        return this.shippingOptions;
    }

    public final ShippingChangeData copy(String str, String str2, ShippingChangeType shippingChangeType2, Address address, List<Options> list) {
        C19383o.m32797g(str, "payToken");
        C19383o.m32797g(shippingChangeType2, "shippingChangeType");
        C19383o.m32797g(address, "shippingAddress");
        C19383o.m32797g(list, "shippingOptions");
        return new ShippingChangeData(str, str2, shippingChangeType2, address, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingChangeData)) {
            return false;
        }
        ShippingChangeData shippingChangeData = (ShippingChangeData) obj;
        return C19383o.m32792b(this.payToken, shippingChangeData.payToken) && C19383o.m32792b(this.paymentId, shippingChangeData.paymentId) && this.shippingChangeType == shippingChangeData.shippingChangeType && C19383o.m32792b(this.shippingAddress, shippingChangeData.shippingAddress) && C19383o.m32792b(this.shippingOptions, shippingChangeData.shippingOptions);
    }

    public final String getPayToken() {
        return this.payToken;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final Options getSelectedShippingOption() {
        T t;
        Iterator<T> it = this.shippingOptions.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Options) t).getSelected()) {
                break;
            }
        }
        return (Options) t;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final ShippingChangeType getShippingChangeType() {
        return this.shippingChangeType;
    }

    public final List<Options> getShippingOptions() {
        return this.shippingOptions;
    }

    public int hashCode() {
        int hashCode = this.payToken.hashCode() * 31;
        String str = this.paymentId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.shippingChangeType.hashCode();
        return this.shippingOptions.hashCode() + ((this.shippingAddress.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.payToken;
        String str2 = this.paymentId;
        ShippingChangeType shippingChangeType2 = this.shippingChangeType;
        Address address = this.shippingAddress;
        List<Options> list = this.shippingOptions;
        StringBuilder f = C0388a.m1050f("ShippingChangeData(payToken=", str, ", paymentId=", str2, ", shippingChangeType=");
        f.append(shippingChangeType2);
        f.append(", shippingAddress=");
        f.append(address);
        f.append(", shippingOptions=");
        return C0326j.m865j(f, list, ")");
    }
}
