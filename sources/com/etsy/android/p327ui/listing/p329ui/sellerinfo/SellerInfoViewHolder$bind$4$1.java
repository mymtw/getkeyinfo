package com.etsy.android.p327ui.listing.p329ui.sellerinfo;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.SellerInfoViewHolder$bind$4$1 */
public final class SellerInfoViewHolder$bind$4$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10639c $favoriteInfo;
    public final /* synthetic */ SellerInfoViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SellerInfoViewHolder$bind$4$1(SellerInfoViewHolder sellerInfoViewHolder, C10639c cVar) {
        super(1);
        this.this$0 = sellerInfoViewHolder;
        this.$favoriteInfo = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f23339b;
        C10639c cVar2 = this.$favoriteInfo;
        cVar.mo38043a(new C13597g.C13704p0(cVar2.f23373b, cVar2.f23374c, !cVar2.f23372a));
    }
}
