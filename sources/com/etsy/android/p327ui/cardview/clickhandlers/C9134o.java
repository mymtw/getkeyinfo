package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.ISearchPageLink;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p363he.C12821d;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.o */
public final class C9134o extends C13171a<IFormattedTaxonomyCategory> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9134o(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: d */
    public final void mo31328c(IFormattedTaxonomyCategory iFormattedTaxonomyCategory) {
        String deepLink;
        ISearchPageLink pageLink;
        C19383o.m32797g(iFormattedTaxonomyCategory, "data");
        for (Pair pair : iFormattedTaxonomyCategory.extractOnTappedEventParameters()) {
            this.f28980b.mo21333d((String) pair.getFirst(), (Map) pair.getSecond());
        }
        ITaxonomyCategory category = iFormattedTaxonomyCategory.getCategory();
        if (category == null || (pageLink = category.getPageLink()) == null) {
            ITaxonomyCategory category2 = iFormattedTaxonomyCategory.getCategory();
            if (category2 != null && (deepLink = category2.getDeepLink()) != null) {
                C12790b.m20430b(mo45889a(), new C12821d(deepLink));
            }
        } else if (pageLink.isCategoryPage()) {
            C12790b.m20430b(mo45889a(), new SearchContainerKey(C12790b.m20432d(mo45889a()), new SearchSpec((String) null, Long.valueOf(pageLink.getTaxonomyId().getIdAsLong()), (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1021, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null, 12, (DefaultConstructorMarker) null));
        } else {
            C12790b.m20430b(mo45889a(), new SearchContainerKey(C12790b.m20432d(mo45889a()), new SearchSpec((String) null, Long.valueOf(pageLink.getTaxonomyId().getIdAsLong()), (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1021, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null, 12, (DefaultConstructorMarker) null));
        }
    }
}
