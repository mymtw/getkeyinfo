package com.paypal.checkout.order.patch.fields;

import com.paypal.checkout.order.Address;
import com.paypal.checkout.order.patch.OrderUpdate;
import com.paypal.checkout.order.patch.PatchOperation;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class PatchShippingAddress extends OrderUpdate {
    private final Address address;

    public static final class Add extends PatchShippingAddress {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Add(Address address, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i & 2) != 0 ? "default" : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Add(Address address, String str) {
            super(str, PatchOperation.ADD, address, (DefaultConstructorMarker) null);
            C19383o.m32797g(address, "address");
            C19383o.m32797g(str, "purchaseUnitReferenceId");
        }
    }

    public static final class Replace extends PatchShippingAddress {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Replace(Address address, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i & 2) != 0 ? "default" : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Replace(Address address, String str) {
            super(str, PatchOperation.REPLACE, address, (DefaultConstructorMarker) null);
            C19383o.m32797g(address, "address");
            C19383o.m32797g(str, "purchaseUnitReferenceId");
        }
    }

    private PatchShippingAddress(String str, PatchOperation patchOperation, Address address2) {
        super(str, patchOperation, address2);
        this.address = address2;
    }

    public /* synthetic */ PatchShippingAddress(String str, PatchOperation patchOperation, Address address2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, patchOperation, address2);
    }

    public final Address getAddress() {
        return this.address;
    }

    public String getPath$pyplcheckout_externalThreedsRelease() {
        return C0048b.m163a("/purchase_units/@reference_id=='", getPurchaseUnitReferenceId(), "'/shipping/address");
    }
}
