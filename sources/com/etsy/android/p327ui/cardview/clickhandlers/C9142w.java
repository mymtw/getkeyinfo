package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p356ge.C12790b;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.w */
public final class C9142w extends C13171a<ISearchSuggestion> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9142w(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        ISearchSuggestion iSearchSuggestion = (ISearchSuggestion) obj;
        C19383o.m32797g(iSearchSuggestion, "data");
        String str = this.f28980b.f19060b;
        C19383o.m32796f(str, "viewTracker.name");
        if (C19457k.m33025c1(str, HomePagerFragment.TRACKING_PAGE_VIEW_PREFIX, false)) {
            this.f28980b.mo21333d("homescreen_tapped_search_term", C19388s.m32882r0(iSearchSuggestion));
        } else {
            String str2 = this.f28980b.f19060b;
            C19383o.m32796f(str2, "viewTracker.name");
            if (C19457k.m33025c1(str2, "native_category_page", false)) {
                this.f28980b.mo21333d("category_tapped_search_term", C19388s.m32882r0(iSearchSuggestion));
            } else {
                this.f28980b.mo21333d("list_section_tapped_search_term", C19388s.m32882r0(iSearchSuggestion));
            }
        }
        C12790b.m20430b(mo45889a(), new SearchContainerKey(C12790b.m20432d(mo45889a()), new SearchSpec(iSearchSuggestion.getQuery(), (Long) null, (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1022, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null, 12, (DefaultConstructorMarker) null));
    }
}
