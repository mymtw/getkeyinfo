package com.etsy.android.p327ui.listing.p329ui.buyitnow.summary;

import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.SummaryFragment$bindListingDetails$1$4$1 */
public final class SummaryFragment$bindListingDetails$1$4$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ UiState.Summary $summary;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryFragment$bindListingDetails$1$4$1(UiState.Summary summary) {
        super(0);
        this.$summary = summary;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(C18263b.m30839d0(this.$summary.getListingVariation2()));
    }
}
