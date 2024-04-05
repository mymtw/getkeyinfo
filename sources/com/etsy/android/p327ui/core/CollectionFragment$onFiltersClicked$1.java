package com.etsy.android.p327ui.core;

import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p420pc.C13213b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$onFiltersClicked$1 */
public final class CollectionFragment$onFiltersClicked$1 extends Lambda implements C19857l<C13213b, C19394m> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$onFiltersClicked$1(CollectionFragment collectionFragment) {
        super(1);
        this.this$0 = collectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13213b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13213b bVar) {
        C19383o.m32797g(bVar, "filterData");
        this.this$0.getAnalyticsContext().mo21333d(bVar.f29051a.getAnalyticsId(), (Map<? extends AnalyticsProperty, Object>) null);
        this.this$0.updateFilter(bVar);
        CollectionFragment collectionFragment = this.this$0;
        collectionFragment.onSearch(collectionFragment.query);
    }
}
