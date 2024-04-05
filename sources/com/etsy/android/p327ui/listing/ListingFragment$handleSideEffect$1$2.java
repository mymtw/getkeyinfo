package com.etsy.android.p327ui.listing;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p377jf.C12979a;
import p466vc.C13574d;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$handleSideEffect$1$2 */
public final class ListingFragment$handleSideEffect$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C12979a $alert;
    public final /* synthetic */ C13574d.C13576b $sideEffect;
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$handleSideEffect$1$2(ListingFragment listingFragment, C13574d.C13576b bVar, C12979a aVar) {
        super(1);
        this.this$0 = listingFragment;
        this.$sideEffect = bVar;
        this.$alert = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19383o.m32797g(view, "it");
        ListingViewModel viewModel = this.this$0.getViewModel();
        C13574d.C13576b bVar = this.$sideEffect;
        viewModel.mo33464b(new C13597g.C13721r3(((C13574d.C13576b.C13590n) bVar).f29678a, ((C13574d.C13576b.C13590n) bVar).f29679b));
        this.$alert.f28587a.dismiss();
    }
}
