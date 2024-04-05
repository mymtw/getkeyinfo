package com.etsy.android.p327ui.listing.p329ui.buyitnow.summary;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10369b;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.SummaryFragment$bindTermsAndConditions$1$1$1 */
public final class SummaryFragment$bindTermsAndConditions$1$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EtsyLinkify.UnderlineURLSpan $urlSpan;
    public final /* synthetic */ SummaryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryFragment$bindTermsAndConditions$1$1$1(SummaryFragment summaryFragment, EtsyLinkify.UnderlineURLSpan underlineURLSpan) {
        super(1);
        this.this$0 = summaryFragment;
        this.$urlSpan = underlineURLSpan;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getDispatcher().mo38043a(new C10369b.C10382m(this.$urlSpan.getURL()));
    }
}
