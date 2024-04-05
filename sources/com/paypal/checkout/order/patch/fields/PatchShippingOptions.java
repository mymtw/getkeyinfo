package com.paypal.checkout.order.patch.fields;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.order.Options;
import com.paypal.checkout.order.patch.OrderUpdate;
import com.paypal.checkout.order.patch.PatchOperation;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class PatchShippingOptions extends OrderUpdate {
    private final List<Options> options;

    public static final class Replace extends PatchShippingOptions {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Replace(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "default" : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Replace(List<Options> list, String str) {
            super(str, PatchOperation.REPLACE, list, (DefaultConstructorMarker) null);
            C19383o.m32797g(list, ResponseConstants.OPTIONS);
            C19383o.m32797g(str, "purchaseUnitReferenceId");
        }
    }

    private PatchShippingOptions(String str, PatchOperation patchOperation, List<Options> list) {
        super(str, patchOperation, list);
        this.options = list;
    }

    public /* synthetic */ PatchShippingOptions(String str, PatchOperation patchOperation, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, patchOperation, list);
    }

    public final List<Options> getOptions() {
        return this.options;
    }

    public String getPath$pyplcheckout_externalThreedsRelease() {
        return C0048b.m163a("/purchase_units/@reference_id=='", getPurchaseUnitReferenceId(), "'/shipping/options");
    }
}
