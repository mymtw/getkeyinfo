package com.etsy.android.slice;

import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PurchasesSliceProvider$dateFormat$2 extends Lambda implements C19846a<SimpleDateFormat> {
    public final /* synthetic */ PurchasesSliceProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesSliceProvider$dateFormat$2(PurchasesSliceProvider purchasesSliceProvider) {
        super(0);
        this.this$0 = purchasesSliceProvider;
    }

    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("MMM dd", this.this$0.getCurrentLocale().mo46718b());
    }
}
