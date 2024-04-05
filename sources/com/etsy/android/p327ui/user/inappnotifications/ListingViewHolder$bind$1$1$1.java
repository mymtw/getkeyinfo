package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.p327ui.user.inappnotifications.C11573r;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.ListingViewHolder$bind$1$1$1 */
final class ListingViewHolder$bind$1$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IANListingCard $listing;
    public final /* synthetic */ C11577t this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingViewHolder$bind$1$1$1(C11577t tVar, IANListingCard iANListingCard) {
        super(1);
        this.this$0 = tVar;
        this.$listing = iANListingCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f25641b.invoke(new C11573r.C11575b(this.$listing));
    }
}
