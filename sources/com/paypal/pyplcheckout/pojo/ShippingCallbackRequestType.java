package com.paypal.pyplcheckout.pojo;

import com.paypal.checkout.shipping.ShippingChangeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class ShippingCallbackRequestType {
    private final Type shippingCallbackRequestType;

    public enum Type {
        SHIPPING_ADDRESS,
        SHIPPING_METHODS
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.SHIPPING_ADDRESS.ordinal()] = 1;
            iArr[Type.SHIPPING_METHODS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ShippingCallbackRequestType(Type type) {
        C19383o.m32797g(type, "shippingCallbackRequestType");
        this.shippingCallbackRequestType = type;
    }

    public final Type getShippingCallbackRequestType() {
        return this.shippingCallbackRequestType;
    }

    public final ShippingChangeType toShippingChangeEvent() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.shippingCallbackRequestType.ordinal()];
        if (i == 1) {
            return ShippingChangeType.ADDRESS_CHANGE;
        }
        if (i == 2) {
            return ShippingChangeType.OPTION_CHANGE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
