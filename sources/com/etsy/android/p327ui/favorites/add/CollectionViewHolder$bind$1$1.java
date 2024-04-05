package com.etsy.android.p327ui.favorites.add;

import android.view.View;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.CollectionViewHolder$bind$1$1 */
final class CollectionViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CheckableListingCollection $collection;
    public final /* synthetic */ C9769j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionViewHolder$bind$1$1(C9769j jVar, CheckableListingCollection checkableListingCollection) {
        super(1);
        this.this$0 = jVar;
        this.$collection = checkableListingCollection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9769j jVar = this.this$0;
        CheckableListingCollection checkableListingCollection = this.$collection;
        int i = C9769j.f21606f;
        jVar.getClass();
        checkableListingCollection.setIsChecked(!checkableListingCollection.getIsChecked());
        Map s0 = C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.COLLECTION_NAME, checkableListingCollection.getName()), new Pair(PredefinedAnalyticsProperty.COLLECTION_ID, Long.valueOf(checkableListingCollection.getCollectionId().getIdAsLongDeprecated())), new Pair(PredefinedAnalyticsProperty.COLLECTION_KEY, checkableListingCollection.getKey()), new Pair(PredefinedAnalyticsProperty.COLLECTION_SLUG, checkableListingCollection.getSlug()), new Pair(PlatformAnalyticsProperty.USER_ID, Long.valueOf(jVar.f21609d.mo45958c().getIdAsLongDeprecated())), new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(jVar.f21607b)));
        if (checkableListingCollection.getIsChecked()) {
            jVar.f21608c.mo21333d("collection_sheet_add_to_collection", s0);
        } else {
            jVar.f21608c.mo21333d("collection_sheet_remove_from_collection", s0);
        }
        jVar.mo32774e(checkableListingCollection);
        jVar.f21610e.invoke(checkableListingCollection);
    }
}
