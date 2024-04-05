package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p415of.C13171a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.RelatedLinkViewHolder$bind$1$1 */
final class RelatedLinkViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ LandingPageLink $data;
    public final /* synthetic */ C9214s0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelatedLinkViewHolder$bind$1$1(LandingPageLink landingPageLink, C9214s0 s0Var) {
        super(1);
        this.$data = landingPageLink;
        this.this$0 = s0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13171a<PageLink> aVar;
        LandingPageLink landingPageLink = this.$data;
        if (landingPageLink != null && (aVar = this.this$0.f20346c) != null) {
            aVar.mo31328c(landingPageLink);
        }
    }
}
