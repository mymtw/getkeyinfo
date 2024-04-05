package com.etsy.android.p327ui.listing.viewholders;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p437rd.C13354a;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.viewholders.ListingImagesViewHolder$bind$2 */
public final class ListingImagesViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10423j $uiModel;
    public final /* synthetic */ ListingImagesViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImagesViewHolder$bind$2(ListingImagesViewHolder listingImagesViewHolder, C10423j jVar) {
        super(1);
        this.this$0 = listingImagesViewHolder;
        this.$uiModel = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f23489b;
        String str = ((C13354a) this.$uiModel).f29281e;
        C19383o.m32794d(str);
        cVar.mo38043a(new C13597g.C13758w5(str));
    }
}
