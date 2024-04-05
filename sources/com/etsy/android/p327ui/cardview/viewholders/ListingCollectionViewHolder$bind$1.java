package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.p327ui.cardview.clickhandlers.C9129l;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ListingCollectionViewHolder$bind$1 */
public final class ListingCollectionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ UserCollection $userCollection;
    public final /* synthetic */ ListingCollectionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCollectionViewHolder$bind$1(ListingCollectionViewHolder listingCollectionViewHolder, UserCollection userCollection) {
        super(1);
        this.this$0 = listingCollectionViewHolder;
        this.$userCollection = userCollection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9129l lVar = this.this$0.f20101c;
        if (lVar != null) {
            lVar.mo31328c(this.$userCollection);
        }
    }
}
