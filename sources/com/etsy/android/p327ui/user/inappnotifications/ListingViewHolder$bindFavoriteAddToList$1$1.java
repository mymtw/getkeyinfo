package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.p327ui.user.inappnotifications.C11573r;
import com.etsy.android.stylekit.views.FavHeartButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.ListingViewHolder$bindFavoriteAddToList$1$1 */
final class ListingViewHolder$bindFavoriteAddToList$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IANListingCard $listing;
    public final /* synthetic */ FavHeartButton $this_apply;
    public final /* synthetic */ C11577t this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingViewHolder$bindFavoriteAddToList$1$1(C11577t tVar, IANListingCard iANListingCard, FavHeartButton favHeartButton) {
        super(1);
        this.this$0 = tVar;
        this.$listing = iANListingCard;
        this.$this_apply = favHeartButton;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19857l<C11573r, C19394m> lVar = this.this$0.f25641b;
        IANListingCard iANListingCard = this.$listing;
        FavHeartButton favHeartButton = this.$this_apply;
        C19383o.m32796f(favHeartButton, "this");
        lVar.invoke(new C11573r.C11574a(favHeartButton, iANListingCard));
    }
}
