package com.paypal.checkout.order.patch;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class OrderUpdate {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DEFAULT_PURCHASE_UNIT_ID = "default";
    private final PatchOperation patchOperation;
    private final String purchaseUnitReferenceId;
    private final Object value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OrderUpdate(String str, PatchOperation patchOperation2, Object obj) {
        C19383o.m32797g(str, "purchaseUnitReferenceId");
        C19383o.m32797g(patchOperation2, "patchOperation");
        C19383o.m32797g(obj, "value");
        this.purchaseUnitReferenceId = str;
        this.patchOperation = patchOperation2;
        this.value = obj;
    }

    public final PatchOperation getPatchOperation() {
        return this.patchOperation;
    }

    public abstract String getPath$pyplcheckout_externalThreedsRelease();

    public final String getPurchaseUnitReferenceId() {
        return this.purchaseUnitReferenceId;
    }

    public final Object getValue() {
        return this.value;
    }
}
