package com.etsy.android.p327ui.favorites.recommendations;

import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$setUpPagerListener$1 */
final class CollectionContainerPresenter$setUpPagerListener$1 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ C9871a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionContainerPresenter$setUpPagerListener$1(C9871a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        if (i == 1) {
            this.this$0.f21781a.mo21333d("lists_suggestions_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
