package com.etsy.android.p327ui.cardview.clickhandlers;

import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.SavableSearchQueryClickHandler$onSaveClick$2$1 */
public final class SavableSearchQueryClickHandler$onSaveClick$2$1 extends Lambda implements C19857l<Long, C19394m> {
    public final /* synthetic */ SavableSearchQuery $savableSearchQuery;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavableSearchQueryClickHandler$onSaveClick$2$1(SavableSearchQuery savableSearchQuery) {
        super(1);
        this.$savableSearchQuery = savableSearchQuery;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Long l) {
        if (l != null) {
            this.$savableSearchQuery.setSavedSearchId(l.longValue());
        }
    }
}
