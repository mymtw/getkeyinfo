package com.etsy.android.p327ui.cardview.viewholders;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.StandaloneSavedCartItemsKey;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedForLaterCarouselHeaderViewHolder$bind$1 */
final class SavedForLaterCarouselHeaderViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9166c1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedForLaterCarouselHeaderViewHolder$bind$1(C9166c1 c1Var) {
        super(1);
        this.this$0 = c1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        SavedCartClickHandler savedCartClickHandler = this.this$0.f20175c;
        if (savedCartClickHandler != null) {
            C8703p pVar = savedCartClickHandler.f28980b;
            if (pVar != null) {
                pVar.mo21333d("cart_see_all_saved_for_later_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            }
            Fragment a = savedCartClickHandler.mo45889a();
            C19285c<String> cVar = Referrer.f19131c;
            C12790b.m20430b(savedCartClickHandler.mo45889a(), new StandaloneSavedCartItemsKey(Referrer.C8712a.m17141a(a).toString(), (Bundle) null));
        }
    }
}
