package com.etsy.android.p327ui.search;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.SearchFilterHeader3x3View$bind$1 */
public final class SearchFilterHeader3x3View$bind$1 extends Lambda implements C19861p<View, Boolean, C19394m> {
    public final /* synthetic */ C9141v $clickHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterHeader3x3View$bind$1(C9141v vVar) {
        super(2);
        this.$clickHandler = vVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(View view, boolean z) {
        C9141v vVar = this.$clickHandler;
        vVar.f20081a.mo21333d(z ? "toggled_listing_card_size_to_micro" : "toggled_listing_card_size_to_standard", (Map<? extends AnalyticsProperty, Object>) null);
        C19857l<Boolean, C19394m> lVar = vVar.f20083c;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }
}
