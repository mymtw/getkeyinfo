package com.etsy.android.p327ui.favorites;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.p327ui.cardview.clickhandlers.C9129l;
import com.etsy.android.p327ui.favorites.search.FavoriteSearchAnalytics;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.q */
public final class C9865q extends C9129l {

    /* renamed from: d */
    public final C8703p f21774d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9865q(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(fragment, "fragment");
        this.f21774d = pVar;
    }

    /* renamed from: d */
    public final void mo31328c(UserCollection userCollection) {
        super.mo31328c(userCollection);
        if (userCollection != null) {
            this.f21774d.mo21333d("favorites_tapped_list", C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.COLLECTION_KEY, userCollection.getCollection().getKey()), new Pair(PredefinedAnalyticsProperty.CLUSTER_SOURCE, FavoriteSearchAnalytics.CLUSTER_FROM_FAVS_LANDING.getAnalyticsId())));
        }
    }
}
