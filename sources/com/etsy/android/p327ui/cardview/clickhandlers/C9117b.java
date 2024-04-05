package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.b */
public final class C9117b extends C13171a<TaxonomyCategory> {
    public C9117b(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        TaxonomyNode buildTaxonomyNode = ((TaxonomyCategory) obj).buildTaxonomyNode();
        if (buildTaxonomyNode != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.TAXONOMY_ID, buildTaxonomyNode.getTaxonomyNodeId());
            C8703p pVar = this.f28980b;
            pVar.mo21333d(this.f28980b.f19060b + "_tapped_category", hashMap);
            C12790b.m20430b(mo45889a(), new SearchContainerKey(C12790b.m20432d(mo45889a()), new SearchSpec((String) null, Long.valueOf(buildTaxonomyNode.getTaxonomyNodeId().getIdAsLong()), (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 256, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null));
        }
    }
}
