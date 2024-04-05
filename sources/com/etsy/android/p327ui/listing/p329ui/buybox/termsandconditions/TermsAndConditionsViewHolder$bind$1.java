package com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions;

import android.view.View;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.termsandconditions.TermsAndConditionsViewHolder$bind$1 */
public final class TermsAndConditionsViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EtsyLinkify.UnderlineURLSpan $urlSpan;
    public final /* synthetic */ TermsAndConditionsViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TermsAndConditionsViewHolder$bind$1(TermsAndConditionsViewHolder termsAndConditionsViewHolder, EtsyLinkify.UnderlineURLSpan underlineURLSpan) {
        super(1);
        this.this$0 = termsAndConditionsViewHolder;
        this.$urlSpan = underlineURLSpan;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f22648b;
        String url = this.$urlSpan.getURL();
        C19383o.m32796f(url, "urlSpan.url");
        cVar.mo38043a(new C13597g.C13681l5(url));
    }
}
