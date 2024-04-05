package com.paypal.pyplcheckout.home.view.adapters;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FundingOptionViewHolder$setTextColor$1 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ FundingOptionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FundingOptionViewHolder$setTextColor$1(FundingOptionViewHolder fundingOptionViewHolder) {
        super(1);
        this.this$0 = fundingOptionViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        this.this$0.cardTypeTv.setTextColor(i);
        this.this$0.lastDigits.setTextColor(i);
        this.this$0.bankNameBig.setTextColor(i);
    }
}
