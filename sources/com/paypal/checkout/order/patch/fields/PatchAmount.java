package com.paypal.checkout.order.patch.fields;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.order.Amount;
import com.paypal.checkout.order.patch.OrderUpdate;
import com.paypal.checkout.order.patch.PatchOperation;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class PatchAmount extends OrderUpdate {
    private final Amount amount;

    public static final class Replace extends PatchAmount {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Replace(Amount amount, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(amount, (i & 2) != 0 ? "default" : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Replace(Amount amount, String str) {
            super(str, PatchOperation.REPLACE, amount, (DefaultConstructorMarker) null);
            C19383o.m32797g(amount, ResponseConstants.AMOUNT);
            C19383o.m32797g(str, "purchaseUnitReferenceId");
        }
    }

    private PatchAmount(String str, PatchOperation patchOperation, Amount amount2) {
        super(str, patchOperation, amount2);
        this.amount = amount2;
    }

    public /* synthetic */ PatchAmount(String str, PatchOperation patchOperation, Amount amount2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, patchOperation, amount2);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public String getPath$pyplcheckout_externalThreedsRelease() {
        return C0048b.m163a("/purchase_units/@reference_id=='", getPurchaseUnitReferenceId(), "'/amount");
    }
}
