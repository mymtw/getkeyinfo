package com.etsy.android.p327ui.singleactivity;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.singleactivity.MultistackFragmentKey$fragmentTag$2 */
public final class MultistackFragmentKey$fragmentTag$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ MultistackFragmentKey this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultistackFragmentKey$fragmentTag$2(MultistackFragmentKey multistackFragmentKey) {
        super(0);
        this.this$0 = multistackFragmentKey;
    }

    public final String invoke() {
        return this.this$0.stackIdentifier() + '_' + this.this$0.fragmentClassName() + '_' + this.this$0.generateFragmentTag();
    }
}
